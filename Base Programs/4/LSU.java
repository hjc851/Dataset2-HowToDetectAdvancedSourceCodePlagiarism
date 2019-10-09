import java.util.*;
import java.util.function.Predicate;
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
        // Page current = FRAMES.stream()
        //                 .filter(f -> f.getId() == page.getId() && f.getAllocProcess() == currentProcess.getId())
        //                 .findFirst()
        //                 .orElse(null);

        List<Page> temp = new LinkedList<>();
        for (Page f : FRAMES) {
            if (f.getId() == page.getId() && f.getAllocProcess() == currentProcess.getId())
                temp.add(f);
        }

        Page current = null;
        if (temp.size() > 0)
            current = temp.get(0);


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
        Predicate<Page> pred = new Predicate<Page>() {
            @Override
            public boolean test(Page p) {
                return p.getAllocProcess() == currentProcess.getId();
            }
        };

        Page oldest = FRAMES.stream()
                            .filter(pred)
                            .max(Comparator.comparingInt(Page::getCounter_bit))
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
        FRAMES.forEach(Page::increment_Counter);

        // Now get the page if it is in memory
        List<Page> page = new ArrayList<>();
        for (Page FRAME : FRAMES) {
            if (currentProcess.getRequests().peek().equals(FRAME.getId()) && currentProcess.getId() == FRAME.getAllocProcess()) {
                page.add(FRAME);
            }
        }

        // Reset the counter and return
        if (page.size() > 0) {
            page.forEach(Page::reset_Counter);
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
