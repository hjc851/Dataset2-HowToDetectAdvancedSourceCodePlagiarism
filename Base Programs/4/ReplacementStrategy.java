/**
 * Institution: University of Newcastle
 * Programmer:  Ben Sutter
 * Course Code: COMP2240
 * UID: 3063467
 * Assignment 3
 * ReplacementStrategy Abstract Class
 * ReplacementStrategy.java
 * Last Modified: 26/10/2016
 */
public abstract class ReplacementStrategy {
    protected abstract boolean isFull();
    protected abstract boolean checkRequest(Process currentProcess);
    protected abstract void addPage(Page p, Process currentProcess);
}
