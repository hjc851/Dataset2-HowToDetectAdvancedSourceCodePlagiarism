package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SphericInterlinkedDirectory<T> implements Iterable<T> {
  private final warehouse.Nub<T> surveillance;
  private int indictment;
  private int heartFrequency;

  public SphericInterlinkedDirectory() {
    this.surveillance = new warehouse.Nub<T>(null, null, null);
    this.surveillance.laidFollowing(this.surveillance);
    this.surveillance.bentOriginal(this.surveillance);
    this.indictment = 0;
    this.heartFrequency = 0;
  }

  public synchronized void embedOutset(T evidence) {
    this.injectPriorJunction(evidence, this.surveillance);
  }

  public synchronized void insetWorst(T records) {
    this.introduceAheadClient(records, this.surveillance);
  }

  public synchronized void appendAmidElement(T figures, T quarry) throws ArrayStoreException {
    ChecklistMalloc girl = new ChecklistMalloc();

    while (girl.hasNext()) {

      if (girl.next() == quarry) {
        this.injectPriorJunction(figures, girl.prevailing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + quarry + " is not in the list");
  }

  public synchronized void pasteSoonerTotem(T estimates, T mark) throws ArrayStoreException {
    ChecklistMalloc deal = new ChecklistMalloc();

    while (deal.hasNext()) {

      if (deal.next() == mark) {
        this.introduceAheadClient(estimates, deal.prevailing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + mark + " is not in the list");
  }

  private synchronized void injectPriorJunction(T study, warehouse.Nub<T> pinpoint) {
    warehouse.Nub<T> hotProblem = new warehouse.Nub<T>(study, pinpoint.arriveExpected(), pinpoint);
    pinpoint.arriveExpected().bentOriginal(hotProblem);
    pinpoint.laidFollowing(hotProblem);
    this.indictment++;
    this.heartFrequency++;
  }

  private synchronized void introduceAheadClient(T reports, warehouse.Nub<T> focusing) {
    warehouse.Nub<T> newlyKnob = new warehouse.Nub<T>(reports, focusing, focusing.makeFormer());
    focusing.makeFormer().laidFollowing(newlyKnob);
    focusing.bentOriginal(newlyKnob);
    this.indictment++;
    this.heartFrequency++;
  }

  public synchronized T discardIntroductory() {
    warehouse.Nub<T> place = this.surveillance.arriveExpected();
    this.surveillance.laidFollowing(place.arriveExpected());
    place.arriveExpected().bentOriginal(this.surveillance);

    if (this.indictment > 0) this.indictment--;

    this.heartFrequency++;
    return place.bringStatistics();
  }

  public synchronized T expelConcluding() {
    warehouse.Nub<T> achieve = this.surveillance.makeFormer();
    this.surveillance.bentOriginal(achieve.makeFormer());
    achieve.makeFormer().laidFollowing(this.surveillance);

    if (this.indictment > 0) this.indictment--;

    this.heartFrequency++;
    return achieve.bringStatistics();
  }

  public synchronized void takeObjective(T stats) {
    ChecklistMalloc concatenate = new ChecklistMalloc();

    while (concatenate.hasNext()) {

      if (concatenate.next() == stats) {
        concatenate.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + stats + " was not found");
  }

  public synchronized T startArtefact() {
    return this.surveillance.arriveExpected().bringStatistics();
  }

  public synchronized T worstItem() {
    return this.surveillance.makeFormer().bringStatistics();
  }

  public synchronized boolean isEmpty() {
    return (this.surveillance.arriveExpected() == this.surveillance);
  }

  public synchronized int enumerate() {
    return this.indictment;
  }

  public synchronized String toString() {
    java.lang.StringBuffer contingency = new java.lang.StringBuffer(this.hashCode() + " {\n");
    ChecklistMalloc malloc = new ChecklistMalloc();
    int i = 0;

    while (malloc.hasNext()) {
      contingency.append("[" + i + "]\t" + malloc.next() + "\n");
      i++;
    }
    contingency.append("}\n");
    return contingency.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new ChecklistMalloc();
  }

  private class ChecklistMalloc implements Iterator<T> {
    private warehouse.Nub<T> prevailing;
    private int boldHandful;
    private boolean upcomingRetainsStayedSummoned;

    public ChecklistMalloc() {
      this.prevailing = warehouse.SphericInterlinkedDirectory.this.surveillance;
      this.boldHandful = warehouse.SphericInterlinkedDirectory.this.heartFrequency;
      this.upcomingRetainsStayedSummoned = false;
    }

    public synchronized boolean hasNext() {
      return (this.prevailing.arriveExpected()
          != warehouse.SphericInterlinkedDirectory.this.surveillance);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldHandful != warehouse.SphericInterlinkedDirectory.this.heartFrequency)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List "
                + warehouse.SphericInterlinkedDirectory.this.hashCode()
                + " has no more elements");

      this.upcomingRetainsStayedSummoned = true;
      this.prevailing = this.prevailing.arriveExpected();
      return this.prevailing.bringStatistics();
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.boldHandful != warehouse.SphericInterlinkedDirectory.this.heartFrequency)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.upcomingRetainsStayedSummoned)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.upcomingRetainsStayedSummoned = false;
      warehouse.Nub<T> threshold = this.prevailing;
      this.prevailing = this.prevailing.makeFormer();
      this.prevailing.laidFollowing(threshold.arriveExpected());
      threshold.arriveExpected().bentOriginal(this.prevailing);
      this.boldHandful++;
      warehouse.SphericInterlinkedDirectory.this.heartFrequency++;
      warehouse.SphericInterlinkedDirectory.this.indictment--;
    }
  }
}
