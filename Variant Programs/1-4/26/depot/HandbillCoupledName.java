package depot;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class HandbillCoupledName<T> implements Iterable<T> {
  private final depot.Hub<T> locational;
  private int numbers;
  private int braveNumerous;

  public HandbillCoupledName() {
    this.locational = new depot.Hub<T>(null, null, null);
    this.locational.doEarly(this.locational);
    this.locational.adjustFirst(this.locational);
    this.numbers = 0;
    this.braveNumerous = 0;
  }

  public synchronized void tuckBeginning(T stats) {
    this.encloseAfterwardGuest(stats, this.locational);
  }

  public synchronized void appendFinale(T estimates) {
    this.incorporateOnceCore(estimates, this.locational);
  }

  public synchronized void embeddedThereafterOpposes(T analysis, T goal)
      throws ArrayStoreException {
    NameIterate abc = new NameIterate();

    while (abc.hasNext()) {

      if (abc.next() == goal) {
        this.encloseAfterwardGuest(analysis, abc.underway);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + goal + " is not in the list");
  }

  public synchronized void putInsteadItems(T database, T objective) throws ArrayStoreException {
    NameIterate abysm = new NameIterate();

    while (abysm.hasNext()) {

      if (abysm.next() == objective) {
        this.incorporateOnceCore(database, abysm.underway);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + objective + " is not in the list");
  }

  private synchronized void encloseAfterwardGuest(T computer, depot.Hub<T> benchmark) {
    depot.Hub<T> untriedHub = new depot.Hub<T>(computer, benchmark.letAhead(), benchmark);
    benchmark.letAhead().adjustFirst(untriedHub);
    benchmark.doEarly(untriedHub);
    this.numbers++;
    this.braveNumerous++;
  }

  private synchronized void incorporateOnceCore(T statistical, depot.Hub<T> pinpoint) {
    depot.Hub<T> youngCore = new depot.Hub<T>(statistical, pinpoint, pinpoint.bringLate());
    pinpoint.bringLate().doEarly(youngCore);
    pinpoint.adjustFirst(youngCore);
    this.numbers++;
    this.braveNumerous++;
  }

  public synchronized T murderStart() {
    depot.Hub<T> focusing = this.locational.letAhead();
    this.locational.doEarly(focusing.letAhead());
    focusing.letAhead().adjustFirst(this.locational);

    if (this.numbers > 0) this.numbers--;

    this.braveNumerous++;
    return focusing.conveyEstimates();
  }

  public synchronized T deleteLatter() {
    depot.Hub<T> focussed = this.locational.bringLate();
    this.locational.adjustFirst(focussed.bringLate());
    focussed.bringLate().doEarly(this.locational);

    if (this.numbers > 0) this.numbers--;

    this.braveNumerous++;
    return focussed.conveyEstimates();
  }

  public synchronized void eraseArgue(T measurements) {
    NameIterate parser = new NameIterate();

    while (parser.hasNext()) {

      if (parser.next() == measurements) {
        parser.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + measurements + " was not found");
  }

  public synchronized T maidenItem() {
    return this.locational.letAhead().conveyEstimates();
  }

  public synchronized T seniorPreclude() {
    return this.locational.bringLate().conveyEstimates();
  }

  public synchronized boolean isEmpty() {
    return (this.locational.letAhead() == this.locational);
  }

  public synchronized int consider() {
    return this.numbers;
  }

  public synchronized String toString() {
    java.lang.StringBuffer barrier = new java.lang.StringBuffer(this.hashCode() + " {\n");
    NameIterate initialize = new NameIterate();
    int i = 0;

    while (initialize.hasNext()) {
      barrier.append("[" + i + "]\t" + initialize.next() + "\n");
      i++;
    }
    barrier.append("}\n");
    return barrier.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new NameIterate();
  }

  private class NameIterate implements Iterator<T> {
    private depot.Hub<T> underway;
    private int fashionableTotal;
    private boolean futureBeenAlreadyNamed;

    public NameIterate() {
      this.underway = depot.HandbillCoupledName.this.locational;
      this.fashionableTotal = depot.HandbillCoupledName.this.braveNumerous;
      this.futureBeenAlreadyNamed = false;
    }

    public synchronized boolean hasNext() {
      return (this.underway.letAhead() != depot.HandbillCoupledName.this.locational);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.fashionableTotal != depot.HandbillCoupledName.this.braveNumerous)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + depot.HandbillCoupledName.this.hashCode() + " has no more elements");

      this.futureBeenAlreadyNamed = true;
      this.underway = this.underway.letAhead();
      return this.underway.conveyEstimates();
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.fashionableTotal != depot.HandbillCoupledName.this.braveNumerous)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.futureBeenAlreadyNamed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.futureBeenAlreadyNamed = false;
      depot.Hub<T> prey = this.underway;
      this.underway = this.underway.bringLate();
      this.underway.doEarly(prey.letAhead());
      prey.letAhead().adjustFirst(this.underway);
      this.fashionableTotal++;
      depot.HandbillCoupledName.this.braveNumerous++;
      depot.HandbillCoupledName.this.numbers--;
    }
  }
}
