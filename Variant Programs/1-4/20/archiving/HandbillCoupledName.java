package archiving;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class HandbillCoupledName<T> implements Iterable<T> {
  private final archiving.Nodal<T> witness;
  private int charge = 0;
  private int boldnessMultiple = 0;

  public HandbillCoupledName() {
    this.witness = new archiving.Nodal<T>(null, null, null);
    this.witness.primedLater(this.witness);
    this.witness.adjustFirst(this.witness);
    this.charge = 0;
    this.boldnessMultiple = 0;
  }

  public synchronized void injectingForward(T evidence) {
    this.incloseBeforeNodal(evidence, this.witness);
  }

  public synchronized void injectedSurvive(T estimates) {
    this.injectedLateBump(estimates, this.witness);
  }

  public synchronized void putFromItems(T numbers, T butt) throws ArrayStoreException {
    LeanInitialize scam = new LeanInitialize();

    while (scam.hasNext()) {

      if (scam.next() == butt) {
        this.incloseBeforeNodal(numbers, scam.actual);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + butt + " is not in the list");
  }

  public synchronized void injectingAgoVictim(T figures, T pinpoint) throws ArrayStoreException {
    LeanInitialize above = new LeanInitialize();

    while (above.hasNext()) {

      if (above.next() == pinpoint) {
        this.injectedLateBump(figures, above.actual);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + pinpoint + " is not in the list");
  }

  private synchronized void incloseBeforeNodal(T study, archiving.Nodal<T> objectives) {
    archiving.Nodal<T> earlyHitch =
        new archiving.Nodal<T>(study, objectives.haveFirst(), objectives);
    objectives.haveFirst().adjustFirst(earlyHitch);
    objectives.primedLater(earlyHitch);
    this.charge++;
    this.boldnessMultiple++;
  }

  private synchronized void injectedLateBump(T measurements, archiving.Nodal<T> prey) {
    archiving.Nodal<T> originalAntenna =
        new archiving.Nodal<T>(measurements, prey, prey.generatePrior());
    prey.generatePrior().primedLater(originalAntenna);
    prey.adjustFirst(originalAntenna);
    this.charge++;
    this.boldnessMultiple++;
  }

  public synchronized T eradicateForward() {
    archiving.Nodal<T> limit = this.witness.haveFirst();
    this.witness.primedLater(limit.haveFirst());
    limit.haveFirst().adjustFirst(this.witness);

    if (this.charge > 0) this.charge--;

    this.boldnessMultiple++;
    return limit.catchFigures();
  }

  public synchronized T eraseGo() {
    archiving.Nodal<T> benchmark = this.witness.generatePrior();
    this.witness.adjustFirst(benchmark.generatePrior());
    benchmark.generatePrior().primedLater(this.witness);

    if (this.charge > 0) this.charge--;

    this.boldnessMultiple++;
    return benchmark.catchFigures();
  }

  public synchronized void expelObjet(T reports) {
    LeanInitialize pathname = new LeanInitialize();

    while (pathname.hasNext()) {

      if (pathname.next() == reports) {
        pathname.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + reports + " was not found");
  }

  public synchronized T freshmanDemur() {
    return this.witness.haveFirst().catchFigures();
  }

  public synchronized T laterTarget() {
    return this.witness.generatePrior().catchFigures();
  }

  public synchronized boolean isEmpty() {
    return (this.witness.haveFirst() == this.witness);
  }

  public synchronized int weigh() {
    return this.charge;
  }

  public synchronized String toString() {
    java.lang.StringBuffer pilot = new java.lang.StringBuffer(this.hashCode() + " {\n");
    LeanInitialize subtree = new LeanInitialize();
    int i = 0;

    while (subtree.hasNext()) {
      pilot.append("[" + i + "]\t" + subtree.next() + "\n");
      i++;
    }
    pilot.append("}\n");
    return pilot.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new LeanInitialize();
  }

  private class LeanInitialize implements Iterator<T> {
    private archiving.Nodal<T> actual = null;
    private int chicFigure = 0;
    private boolean incomingMaintainsGoneReferred = false;

    public LeanInitialize() {
      this.actual = archiving.HandbillCoupledName.this.witness;
      this.chicFigure = archiving.HandbillCoupledName.this.boldnessMultiple;
      this.incomingMaintainsGoneReferred = false;
    }

    public synchronized boolean hasNext() {
      return (this.actual.haveFirst() != archiving.HandbillCoupledName.this.witness);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.chicFigure != archiving.HandbillCoupledName.this.boldnessMultiple)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + archiving.HandbillCoupledName.this.hashCode() + " has no more elements");

      this.incomingMaintainsGoneReferred = true;
      this.actual = this.actual.haveFirst();
      return this.actual.catchFigures();
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.chicFigure != archiving.HandbillCoupledName.this.boldnessMultiple)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.incomingMaintainsGoneReferred)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.incomingMaintainsGoneReferred = false;
      archiving.Nodal<T> aiming = this.actual;
      this.actual = this.actual.generatePrior();
      this.actual.primedLater(aiming.haveFirst());
      aiming.haveFirst().adjustFirst(this.actual);
      this.chicFigure++;
      archiving.HandbillCoupledName.this.boldnessMultiple++;
      archiving.HandbillCoupledName.this.charge--;
    }
  }
}
