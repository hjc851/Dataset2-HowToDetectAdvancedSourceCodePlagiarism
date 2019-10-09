import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Institution: University of Newcastle
 * Programmer:  Ben Sutter
 * Course Code: COMP2240
 * UID: 3063467
 * Assignment 3
 * RR Algorithm
 * RRScheduler.java
 * Last Modified: 26/10/2016
 */
public class RRScheduler extends Scheduler {
    private ArrayDeque<Process> readyQueue;
    private ArrayDeque<Fault> faultQueue;
    private int timeRemaining;

    public RRScheduler() {
        this.readyQueue = new ArrayDeque<>();
        this.faultQueue = new ArrayDeque<>();
        timeRemaining = TIME_QUANTUM;
    }

    /**
     * Abstract Implementation
     * onTick()
     * Code to run on each time unit tick
     */
    @Override
    public void onTick() {
        /*
         * Fault Handling
         */
        // First handle any due faults - for this assignment there is a 6 unit cost on replacements, so we will wait 6 time units, then replace and add process to ready queue
        // List<Fault> faults = faultQueue.stream()
        //         .filter(f -> f.getReadyTime() == this.getCurrentTick())
        //         .collect(Collectors.toList());

        List<Fault> faults = new LinkedList<>();
        for (Fault f : faultQueue) {
            if (f.getReadyTime() == this.getCurrentTick())
                faults.add(f);
        }

        for (Fault fault : faults) {
            faultQueue.remove(fault);
            replacementStrategy.addPage(new Page(fault.getProcess().getRequests().peek(), fault.getProcess().getId(), 0), fault.getProcess());
            if (!readyQueue.contains(fault.getProcess())) {
                this.incomingProcess(fault.getProcess());
            }
        }

        /*
         * Running Processes
         */
        // If a process is running, increment its running times
        if (currentProcess != null) {
            timeRemaining--;
            // Now see if this process is complete
            if (currentProcess.isFinished()) {
                // Set its exit time
                currentProcess.setExitTime(this.getCurrentTick());

                // Add process to completed queue
                this.completedProcesses.addLast(currentProcess);

                // Clear current process
                currentProcess = null;
            }

            // Not complete, but see if time is up
            if (timeRemaining == 0 && currentProcess != null) {
                // According to specs, if there are no other waiting processes we can leave this one in
                if (readyQueue.isEmpty()) {
                    // Reset time
                    timeRemaining = TIME_QUANTUM;
                } else {
                    // Put this process to the end of ready queue
                    this.incomingProcess(currentProcess);
                    currentProcess = null;
                }
            }
        }

        /*
         * Start Processes
         */
        // Add new process if there is none running - usually only start or if one just finished
        if (currentProcess == null && !readyQueue.isEmpty()) {
            currentProcess = this.readyProcess();
            timeRemaining = TIME_QUANTUM;
        }

        // Now handle page request
        this.runNextRequest();
    }

    /**
     * Abstract Implementation
     * processIncoming()
     * Handles new processes
     * @param process
     */
    @Override
    public void incomingProcess(Process process) {
        readyQueue.addLast(process);
    }

    /**
     * Abstract Implementation
     * readyProcess()
     * Gets the next ready process
     * @return
     */
    @Override
    public Process readyProcess() {
        return readyQueue.removeFirst();
    }

    /**
     * Private Helper Function
     * runNextRequest()
     * Used to run VM code to check if requested page is available and generate page faults
     */
    private void runNextRequest() {
        // Only run check if we have a process in the cpu
        if (this.currentProcess == null) {
            return;
        }
        // Keep running given that we are assuming switching/starting processes has no cost
        while (!replacementStrategy.checkRequest(this.currentProcess)) {
            // Not in memory, we need to generate a page fault
            this.sendPageFault();

            // Check for ready processes
            timeRemaining = TIME_QUANTUM;
            if (!readyQueue.isEmpty()) {
                // We have one, so switch it out
                currentProcess = readyProcess();
            } else {
                // Ready queue is empty, clear current process and return
                currentProcess = null;
                return;
            }
        }
        // We got here because we have a process ready to go, so process its request
        currentProcess.processNextRequest();
    }

    private void sendPageFault() {
        // Generate the fault
        Fault f = new Fault(this.getCurrentTick(), currentProcess);
        // Add it to fault queue
        faultQueue.add(f);
        // Add it to process for reporting
        currentProcess.getFaults().add(f);
    }
}
