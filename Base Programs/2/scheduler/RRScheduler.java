package scheduler;

import dispatcher.Dispatcher;
import scheduler.Scheduler;
import scheduler.Process;
import java.util.ArrayDeque;

/**
 * Institution: University of Newcastle
 * Programmer:  Ben Sutter
 * Course Code: COMP2240
 * UID: 3063467
 * Assignment 1
 * RR Algorithm
 * RRScheduler.java
 * Last Modified: 01/09/2016
 */
public class RRScheduler extends Scheduler {
    private ArrayDeque<Process> readyQueue;
    private int timeRemaining;

    public RRScheduler() {
        this.readyQueue = new ArrayDeque<>();
        timeRemaining = TIME_QUANTUM;
    }
    @Override
    public String schedulerName() {
        return "RR:";
    }

    @Override
    public void onTick() {
        // If a process is running, increment its running times
        if (currentProcess != null) {
            currentProcess.setRunningTime(currentProcess.getRunningTime() + 1);
            timeRemaining--;

            // Now see if this process is complete
            if (currentProcess.getRunningTime() == currentProcess.getExecSize()) {
                // Set its exit time
                currentProcess.setExitTime(this.getCurrentTick());

                // Add process to completed queue
                this.completedProcesses.addLast(currentProcess);

                // Clear current process
                currentProcess = null;
                this.dispFlag = true;
            }

            // Not complete, but see if time is up
            if (timeRemaining == 0 && currentProcess != null) {
                // According to specs, if there are no other waiting processes we can leave this one in
                if (readyQueue.isEmpty()) {
                    // Reset time
                    timeRemaining = TIME_QUANTUM;
                } else {
                    // Put this process to the end of ready queue
                    readyQueue.addLast(currentProcess);
                    currentProcess = null;
                    this.dispFlag = true;
                }
            }
        }

        // Check Dispatcher Flag
        if (this.dispFlag && currentProcess == null) {
            // Skip this tick
            this.remainingDispTime--;
            if (remainingDispTime == 0) {
                this.dispFlag = false;
                this.remainingDispTime = Dispatcher.DISPATCH_TIME;
            }
        } else {
            // Start a new process if none are running
            if (currentProcess == null && !readyQueue.isEmpty()) {
                currentProcess = readyQueue.removeFirst();

                // Print this process entry
                loadProcess(currentProcess);

                // Set start time after this increment, as thats when it will start
                currentProcess.setStartTime(this.getCurrentTick());

                // Set time remaining
                timeRemaining = TIME_QUANTUM;
            }
        }
    }

    @Override
    public void processIncoming(Process process) {
        readyQueue.addLast(process);
    }
}
