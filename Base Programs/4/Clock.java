/**
 * Institution: University of Newcastle
 * Programmer:  Ben Sutter
 * Course Code: COMP2240
 * UID: 3063467
 * Assignment 3
 * Clock Class
 * Clock.java
 * Last Modified: 26/10/2016
 */
public class Clock extends ReplacementStrategy{
    private int current;
    private Page[] FRAMES;

    /**
     * Default Constructor
     */
    public Clock() {
        current = 0;
        this.FRAMES = new Page[30];
    }

    /**
     * Abstract Implementation
     * addPage()
     * Adds a page into memory
     * @param page
     * @param currentProcess
     */
    @Override
    protected void addPage(Page page, Process currentProcess) {
        // Insert if frame is empty
        if (FRAMES[current] == null) {
            FRAMES[current] = page;
            this.movePointer();
            return;
        }

        // Not empty, so lets move round the clock
        while (FRAMES[current].getAllocProcess() != currentProcess.getId() && FRAMES[current].getCounter_bit() == 0) {
            if (FRAMES[current].getAllocProcess() == currentProcess.getId()) {
                FRAMES[current].increment_Counter();
            }
            movePointer();
        }

        // Where at at the right spot now, so replace
        FRAMES[current] = page;
        movePointer();
    }

    /**
     * Abstract Implementation
     * checkRequest()
     * Checks if current page request is in memory
     * @param currentProcess
     * @return
     */
    @Override
    public boolean checkRequest(Process currentProcess) {
        if (FRAMES[0] == null) {
            return false;
        }
        // Check if in array - dont touch current pointer if it is
        for (int i = 0; i < FRAMES.length; i++) {
            if (FRAMES[i] == null) return false;
            if (FRAMES[i].getAllocProcess() == currentProcess.getId() && currentProcess.getRequests().peek().equals(FRAMES[i].getId())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Abstract Implementation
     * isFull()
     * Checks if memory is full
     * @return
     */
    @Override
    public boolean isFull() {
        return FRAMES[29] != null;
    }

    /**
     * Private helper function
     * movePointer()
     * Increments current pointer around the clock
     */
    private void movePointer() {
        current++;
        if (current == 30) current = 0;
    }
}
