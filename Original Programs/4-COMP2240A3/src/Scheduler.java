import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Institution: University of Newcastle
 * Programmer:  Ben Sutter
 * Course Code: COMP2240
 * UID: 3063467
 * Assignment 3
 * Scheduler Abstract Class
 * Scheduler.java
 * Last Modified: 26/10/2016
 */
public abstract class Scheduler {

    protected boolean isRunning;
    protected int runningTime;
    protected int waitingTime;
    protected LinkedList<Process> completedProcesses;
    protected int averageWaitTime;
    protected int averageTurnaroundTime;
    protected ReplacementStrategy replacementStrategy;

    public static final int TIME_QUANTUM = 3;

    protected Process currentProcess;
    private int currentTick;

    /**
     * scheduler()
     * Constructor
     */
    public Scheduler() {
        this.isRunning = false;
        this.runningTime = 0;
        this.waitingTime = 0;
        this.averageWaitTime = 0;
        this.averageTurnaroundTime = 0;
        this.currentTick = -1;
        this.completedProcesses = new LinkedList<>();
    }

    /**
     * startScheduler()
     * Implements scheduler start code
     */
    public void startScheduler(String replacement) {
        this.isRunning = true;

        switch (replacement) {
            case "LRU":
                this.replacementStrategy = new LSU();
                break;
            case "CLOCK":
                this.replacementStrategy = new Clock();
                break;
            default:
                break;
        }

        this.onStart();
    }

    /**
     * stopScheduler()
     * Implements scheduler stop code
     */
    public void stopScheduler(String replacement) {
        this.isRunning = false;
        this.printReport(replacement);
    }

    /**
     * getIsRunning()
     * Checks if scheduler is still running
     * @return
     */
    public boolean getIsRunning() {
        return isRunning;
    }

    /**
     * getCompletedProcessesSize
     * Returns size of completed process list
     * @return
     */
    public int getCompletedProcessesSize() {
        if (completedProcesses.isEmpty()) {
            return 0;
        } else {
            return completedProcesses.size();
        }
    }

    /**
     * getCurrentTick()
     * Returns current time tick
     * @return
     */
    public int getCurrentTick() {
        return currentTick;
    }

    /**
     * setCurrentTick()
     * Sets current time tick
     * @param currentTick
     */
    public void setCurrentTick(int currentTick) {
        this.currentTick = currentTick;
    }

    /**
     * getAverageWaitTime()
     * Calculates average wait time
     * @return
     */
    public double getAverageWaitTime() {
        return (double)this.averageWaitTime/this.completedProcesses.size();
    }

    /**
     * getAverageTurnaroundTime()
     * Calculated average turnaround time
     * @return
     */
    public double getAverageTurnaroundTime() {
        return (double)this.averageTurnaroundTime/this.completedProcesses.size();
    }

    /**
     * printReport()
     * Prints finalised data to console and file
     */
    public void printReport(String replacementStrategy) {
        try {
            // First of all, sort completed processes back into order
            Collections.sort(completedProcesses);

            // Print process report for this scheduler
            // Prints to console and file
            ProcessSimulator.OUTPUT_FILE.write("\n");
            System.out.println();
            String title = replacementStrategy + " - Fixed";
            ProcessSimulator.OUTPUT_FILE.write(title + "\n");
            System.out.println(title);
            String header = String.format("%-7s%12s%19s%12s%14s", "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
            ProcessSimulator.OUTPUT_FILE.write(header + "\n");
            System.out.println(header);

            // Print process info
            for (Process p : completedProcesses) {
                String processOut = String.format("%-7d%-16s%-19d%-11d%-10s", p.getId(), p.getName(), p.getExitTime(), p.getFaults().size(), p.getFaultTimes());
                ProcessSimulator.OUTPUT_FILE.write(processOut + "\n");
                System.out.println(processOut);
            }

            // Print spacers
            ProcessSimulator.OUTPUT_FILE.write("\n");
            System.out.println();
            String spacer = new String(new char[50]).replace("\0", "-");
            ProcessSimulator.OUTPUT_FILE.write(spacer + "\n");
            System.out.println(spacer);
        } catch (IOException ex) {
            System.out.println("Unable to write to file.");
        }
    }

    /**
     * onStart()
     * Implements scheduler start code
     */
    public void onStart() {

    }

    /**
     * Abstract Classes
     */
    public abstract void onTick();
    public abstract void incomingProcess(Process process);
    public abstract Process readyProcess();
}
