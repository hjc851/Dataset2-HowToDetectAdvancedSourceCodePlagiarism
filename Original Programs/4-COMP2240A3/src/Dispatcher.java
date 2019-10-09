import java.util.*;

/**
 * Institution: University of Newcastle
 * Programmer:  Ben Sutter
 * Course Code: COMP2240
 * UID: 3063467
 * Assignment 3
 * Dispatcher Class
 * Dispatcher.java
 * Last Modified: 26/10/2016
 */
public class Dispatcher {
    private ArrayDeque<Scheduler> schedulers;
    private int numProcesses;
    private LinkedList<Process> LRU_Processes;
    private LinkedList<Process> Clock_Processes;

    /**
     * Constructor
     */
    public Dispatcher() {
        // Init schedulers
        this.schedulers = new ArrayDeque<>();
        Scheduler rr = new RRScheduler();
        this.schedulers.addLast(rr);
    }

    /**
     * setProcesses()
     * Assigns processes to this dispatcher
     * @param processes
     */
    public void setLRUProcesses(LinkedList<Process> processes) {
        this.numProcesses = processes.size();
        this.LRU_Processes = processes;
    }

    public void setClockProcesses(LinkedList<Process> processes) {
        this.numProcesses = processes.size();
        this.Clock_Processes = processes;
    }

    /**
     * runDispatcher()
     * Performs simulations on schedulers
     */
    public void runDispatcher() {
        // Run Once for LSU
        this.runScheduler(new RRScheduler(), this.LRU_Processes, "LRU");
        // Run again for Clock
        this.runScheduler(new RRScheduler(), this.Clock_Processes, "CLOCK");
    }

    private void runScheduler(Scheduler scheduler, LinkedList<Process> currentProcesses, String replacement) {
        // Start scheduler
        scheduler.startScheduler(replacement);
        Collections.sort(currentProcesses);
        while (!currentProcesses.isEmpty()) {
            scheduler.incomingProcess(currentProcesses.removeFirst());
        }
        // Run program
        while (scheduler.getIsRunning()) {
            // If finished, run finishing code
            if (scheduler.getCompletedProcessesSize() == numProcesses) {
                scheduler.stopScheduler(replacement);
            } else {
                // Go to next tick
                scheduler.setCurrentTick(scheduler.getCurrentTick() + 1);
                scheduler.onTick();
            }
        }
    }
}
