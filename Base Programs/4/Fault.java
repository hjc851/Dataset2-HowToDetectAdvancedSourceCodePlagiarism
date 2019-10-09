/**
 * Institution: University of Newcastle
 * Programmer:  Ben Sutter
 * Course Code: COMP2240
 * UID: 3063467
 * Assignment 3
 * Fault Class
 * Fault.java
 * Last Modified: 26/10/2016
 */
public class Fault {
    private int faultTime;
    private int readyTime;
    private Process process;

    private static final int REPLACEMENT_TIME = 6;

    /**
     * Default Constructor
     * @param faultTime
     * @param process
     */
    public Fault(int faultTime, Process process) {
        this.faultTime = faultTime;
        this.readyTime = faultTime + REPLACEMENT_TIME;
        this.process = process;
    }

    /**
     * Getter
     * getFaultTime()
     * Returns the time the fault was generated
     * @return
     */
    public int getFaultTime() {
        return faultTime;
    }

    /**
     * Getter
     * getProcess()
     * Returns process that the fault is referring to
     * @return
     */
    public Process getProcess() {
        return process;
    }

    /**
     * Getter
     * getReadyTime()
     * Returns the time the fault is due to be resolved
     * @return
     */
    public int getReadyTime() {
        return readyTime;
    }
}
