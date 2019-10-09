import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * Institution: University of Newcastle
 * Programmer:  Ben Sutter
 * Course Code: COMP2240
 * UID: 3063467
 * Assignment 3
 * LSU Class
 * LSU.java
 * Last Modified: 26/10/2016
 */
public class LSU extends ReplacementStrategy {
    private final int MAX_FRAMES = 30;
    private Queue<Page> FRAMES;

    /**
     * Default Constructor
     */
    public LSU() {
        this.FRAMES = new LinkedList<>();
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
        if (this.isFull() || currentProcess.getAllocPages() == currentProcess.getMaxPages()) {
            // Need to remove a page first
            this.removePage(currentProcess);
        }
        // Reset counter if this page is already in memory, or add new page
        Page current = FRAMES.stream()
                        .filter(f -> f.getId() == page.getId() && f.getAllocProcess() == currentProcess.getId())
                        .findFirst()
                        .orElse(null);
        if (current == null) {
            FRAMES.add(page);
            currentProcess.setAllocPages(currentProcess.getAllocPages() + 1);
        } else {
            current.reset_Counter();
        }
    }

    /**
     * Private Helper Function
     * rempovePage()
     * Removes a page from memory based on LSU algorithm
     * @param currentProcess
     */
    private void removePage(Process currentProcess) {
        // Get oldest page
        final Comparator<Page> comp = (p1, p2) -> Integer.compare(p1.getCounter_bit(), p2.getCounter_bit());
        Page oldest = FRAMES.stream()
                            .filter(p -> p.getAllocProcess() == currentProcess.getId())
                            .max(comp)
                            .get();
        FRAMES.remove(oldest);
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
        // On each request increase page counters
        FRAMES.forEach(f -> f.increment_Counter());

        // Now get the page if it is in memory
        List<Page> page = FRAMES.stream()
                .filter(p -> currentProcess.getRequests().peek().equals(p.getId()) && currentProcess.getId() == p.getAllocProcess())
                .collect(Collectors.toList());

        // Reset the counter and return
        if (page.size() > 0) {
            page.forEach(p -> p.reset_Counter());
            return true;
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
        return FRAMES.size() >= MAX_FRAMES;
    }
}
