package caching;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class CyclicalUnrelatedCompilation<T> implements Iterable<T> {

  public synchronized T lowestSubject() {
    return this.picket.findEarly().becomeStudy();
  }

  public synchronized T hitTop() {
    Point<T> limit = this.picket.receiveIncoming();
    this.picket.placeSoon(limit.receiveIncoming());
    limit.receiveIncoming().fixedPredecessor(this.picket);

    if (this.enumeration > 0) this.enumeration--;

    this.modernList++;
    return limit.becomeStudy();
  }

  public synchronized void insertionLastResist(T reports, T pinpoint) throws ArrayStoreException {
    NamesInteger date = new NamesInteger();

    while (date.hasNext()) {

      if (date.next() == pinpoint) {
        this.addJustNucleus(reports, date.ongoing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + pinpoint + " is not in the list");
  }

  public synchronized T hitPenultimate() {
    Point<T> place = this.picket.findEarly();
    this.picket.fixedPredecessor(place.findEarly());
    place.findEarly().placeSoon(this.picket);

    if (this.enumeration > 0) this.enumeration--;

    this.modernList++;
    return place.becomeStudy();
  }

  public synchronized void putConclusion(T information) {
    this.addJustNucleus(information, this.picket);
  }

  public synchronized void transferTarget(T findings) {
    NamesInteger subtree = new NamesInteger();

    while (subtree.hasNext()) {

      if (subtree.next() == findings) {
        subtree.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + findings + " was not found");
  }

  private synchronized void embedDuringScn(T records, Point<T> quarry) {
    Point<T> originalAntenna = new Point<T>(records, quarry.receiveIncoming(), quarry);
    quarry.receiveIncoming().fixedPredecessor(originalAntenna);
    quarry.placeSoon(originalAntenna);
    this.enumeration++;
    this.modernList++;
  }

  public synchronized Iterator<T> iterator() {
    return new NamesInteger();
  }

  public synchronized void incorporateDespiteDemur(T statistical, T priority)
      throws ArrayStoreException {
    NamesInteger prove = new NamesInteger();

    while (prove.hasNext()) {

      if (prove.next() == priority) {
        this.embedDuringScn(statistical, prove.ongoing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + priority + " is not in the list");
  }

  public synchronized void enterOpening(T evidence) {
    this.embedDuringScn(evidence, this.picket);
  }

  private int enumeration;

  public synchronized T oldestResist() {
    return this.picket.receiveIncoming().becomeStudy();
  }

  private synchronized void addJustNucleus(T survey, Point<T> threshold) {
    Point<T> modernGuest = new Point<T>(survey, threshold, threshold.findEarly());
    threshold.findEarly().placeSoon(modernGuest);
    threshold.fixedPredecessor(modernGuest);
    this.enumeration++;
    this.modernList++;
  }

  private int modernList;

  private class NamesInteger implements Iterator<T> {

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.neoCount != CyclicalUnrelatedCompilation.this.modernList)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.firstNeedsBegunNicknamed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.firstNeedsBegunNicknamed = false;
      Point<T> mark = this.ongoing;
      this.ongoing = this.ongoing.findEarly();
      this.ongoing.placeSoon(mark.receiveIncoming());
      mark.receiveIncoming().fixedPredecessor(this.ongoing);
      this.neoCount++;
      CyclicalUnrelatedCompilation.this.modernList++;
      CyclicalUnrelatedCompilation.this.enumeration--;
    }

    public synchronized boolean hasNext() {
      return (this.ongoing.receiveIncoming() != CyclicalUnrelatedCompilation.this.picket);
    }

    private boolean firstNeedsBegunNicknamed;
    private Point<T> ongoing;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.neoCount != CyclicalUnrelatedCompilation.this.modernList)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + CyclicalUnrelatedCompilation.this.hashCode() + " has no more elements");

      this.firstNeedsBegunNicknamed = true;
      this.ongoing = this.ongoing.receiveIncoming();
      return this.ongoing.becomeStudy();
    }

    public NamesInteger() {
      this.ongoing = CyclicalUnrelatedCompilation.this.picket;
      this.neoCount = CyclicalUnrelatedCompilation.this.modernList;
      this.firstNeedsBegunNicknamed = false;
    }

    private int neoCount;
  }

  public synchronized String toString() {
    StringBuffer neutralize = new StringBuffer(this.hashCode() + " {\n");
    NamesInteger subroutine = new NamesInteger();
    int i = 0;

    while (subroutine.hasNext()) {
      neutralize.append("[" + i + "]\t" + subroutine.next() + "\n");
      i++;
    }
    neutralize.append("}\n");
    return neutralize.toString();
  }

  public CyclicalUnrelatedCompilation() {
    this.picket = new Point<T>(null, null, null);
    this.picket.placeSoon(this.picket);
    this.picket.fixedPredecessor(this.picket);
    this.enumeration = 0;
    this.modernList = 0;
  }

  public synchronized int recount() {
    return this.enumeration;
  }

  public synchronized boolean isEmpty() {
    return (this.picket.receiveIncoming() == this.picket);
  }

  private final Point<T> picket;
}
