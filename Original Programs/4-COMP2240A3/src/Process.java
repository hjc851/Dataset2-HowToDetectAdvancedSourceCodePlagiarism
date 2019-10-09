import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

/**
 * Institution: University of Newcastle
 * Programmer:  Ben Sutter
 * Course Code: COMP2240
 * UID: 3063467
 * Assignment 3
 * Process Class
 * Process.java
 * Last Modified: 26/10/2016
 */
public class Process implements Comparable<Process> {
    private int id;
    private String name;
    private Queue<Integer> requests;
    private int exitTime;
    private int maxPages;
    private int allocPages;
    private List<Fault> faults;

    public Process(String name, Queue<Integer> requests, int maxPages) {
        this(name, requests, 0, maxPages, 0, new LinkedList<>());
    }

    /**
     * Full Constructor
     * @param name
     * @param exitTime
     */
    public Process(String name, Queue<Integer> requests, int exitTime, int maxPages, int allocPages, List<Fault> faults) {
        this.id = Integer.parseInt(name.replaceAll("[^\\d.]", ""));
        this.name = name;
        this.requests = requests;
        this.exitTime = exitTime;
        this.maxPages = maxPages;
        this.allocPages = allocPages;
        this.faults = faults;
    }

    /**
     * Getter
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Getter
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Getter
     * @return
     */
    public int getExitTime() {
        return exitTime;
    }

    /**
     * Setter
     * @param exitTime
     */
    public void setExitTime(int exitTime) {
        this.exitTime = exitTime;
    }

    /**
     * Getter
     * getMaxPages()
     * Gets maximum pages allocated to process
     * @return
     */
    public int getMaxPages() {
        return maxPages;
    }

    /**
     * Getter
     * getAllocPages()
     * Gets the current pages allocated to this process
     * @return
     */
    public int getAllocPages() {
        return allocPages;
    }

    /**
     * Setter
     * setAllocPages()
     * Sets the current pages allocated to this process
     * @param allocPages
     */
    public void setAllocPages(int allocPages) {
        this.allocPages = allocPages;
    }

    /**
     *
     * @return
     */
    public List<Fault> getFaults() {
        return faults;
    }

    /**
     * Helper Function
     * isFinished()
     * Determines if this process has run all requests
     * @return
     */
    public boolean isFinished() {
        return this.requests.size() == 0;
    }

    /**
     * Getter
     * getRequests()
     * Returns all remaing requests for this process
     * @return
     */
    public Queue<Integer> getRequests() {
        return requests;
    }

    /**
     * Helper Function
     * processNextRequest()
     * Does work/removes request from process list
     * @return
     */
    public Integer processNextRequest() {
        return this.requests.poll();
    }

    /**
     * Helper Function
     * getFaultTimes()
     * Returns String representation of fault times for reporting
     * @return
     */
    public String getFaultTimes() {
        Integer[] times = faults.stream()
                            .map(f -> f.getFaultTime())
                            .toArray(Integer[]::new);
        StringJoiner out = new StringJoiner(", ", "{", "}");
        for (Integer i : times) {
            out.add(i.toString());
        }
        return out.toString();
    }

    /**
     * Override
     * Allows comparator operation
     * @param o
     * @return
     */
    @Override
    public int compareTo(Process o) {
        int compareId = o.getId();
        int thisId = this.getId();
        return thisId - compareId;
    }
}
