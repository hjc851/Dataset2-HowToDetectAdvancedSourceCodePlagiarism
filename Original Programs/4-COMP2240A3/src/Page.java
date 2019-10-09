/**
 * Institution: University of Newcastle
 * Programmer:  Ben Sutter
 * Course Code: COMP2240
 * UID: 3063467
 * Assignment 3
 * Page Class
 * Page.java
 * Represents a Processes page in memory
 * Last Modified: 26/10/2016
 */
public class Page {
    private int id;
    private int allocProcess;
    private int counter_bit;

    /**
     * Default Constructor
     * @param id
     * @param allocProcess
     * @param counter_bit
     */
    public Page(int id, int allocProcess, int counter_bit) {
        this.id = id;
        this.allocProcess = allocProcess;
        this.counter_bit = counter_bit;
    }

    /**
     * Getter
     * getId()
     * Returns page id/location
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Getter
     * getAllocProcess()
     * Returns the process that this page belongs to
     * @return
     */
    public int getAllocProcess() {
        return allocProcess;
    }

    /**
     * Getter
     * getCounter_bit()
     * Used as a flag for replacement algorithms
     * @return
     */
    public int getCounter_bit() {
        return counter_bit;
    }

    /**
     * Helper function
     * increment_Counter()
     * Increments the counter bit flag
     */
    public void increment_Counter() {
        this.counter_bit++;
    }

    /**
     * Helper function
     * reset_Counter()
     * Resets the counter bit flag
     */
    public void reset_Counter() {
        this.counter_bit = 0;
    }
}
