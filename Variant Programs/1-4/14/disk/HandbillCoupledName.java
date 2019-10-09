package disk;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class HandbillCoupledName<T> implements Iterable<T> {

  public synchronized void injectedWakeBump(T numbers, disk.Ganglion<T> objectives) {
    disk.Ganglion<T> untriedHub = new disk.Ganglion<T>(numbers, objectives.goFuture(), objectives);
    objectives.goFuture().placeSuccessive(untriedHub);
    objectives.solidifyingThe(untriedHub);
    this.enumeration++;
    this.neoCount++;
  }

  public synchronized void murderArtefact(T analysis) {
    ShortlistRecursion iterate = new ShortlistRecursion();

    while (iterate.hasNext()) {

      if (iterate.next() == analysis) {
        iterate.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + analysis + " was not found");
  }

  public synchronized boolean isEmpty() {
    return (this.controlled.goFuture() == this.controlled);
  }

  public class ShortlistRecursion implements Iterator<T> {

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.iloBit != disk.HandbillCoupledName.this.neoCount)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + disk.HandbillCoupledName.this.hashCode() + " has no more elements");

      this.futureBeenAlreadyNamed = true;
      this.live = this.live.goFuture();
      return this.live.arriveEvidence();
    }

    public boolean futureBeenAlreadyNamed;

    public ShortlistRecursion() {
      this.live = disk.HandbillCoupledName.this.controlled;
      this.iloBit = disk.HandbillCoupledName.this.neoCount;
      this.futureBeenAlreadyNamed = false;
    }

    public disk.Ganglion<T> live;

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.iloBit != disk.HandbillCoupledName.this.neoCount)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.futureBeenAlreadyNamed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.futureBeenAlreadyNamed = false;
      disk.Ganglion<T> direct = this.live;
      this.live = this.live.obtainPremature();
      this.live.solidifyingThe(direct.goFuture());
      direct.goFuture().placeSuccessive(this.live);
      this.iloBit++;
      disk.HandbillCoupledName.this.neoCount++;
      disk.HandbillCoupledName.this.enumeration--;
    }

    public synchronized boolean hasNext() {
      return (this.live.goFuture() != disk.HandbillCoupledName.this.controlled);
    }

    public int iloBit;
  }

  public synchronized T eliminateLowest() {
    disk.Ganglion<T> benchmark = this.controlled.obtainPremature();
    this.controlled.placeSuccessive(benchmark.obtainPremature());
    benchmark.obtainPremature().solidifyingThe(this.controlled);

    if (this.enumeration > 0) this.enumeration--;

    this.neoCount++;
    return benchmark.arriveEvidence();
  }

  public synchronized String toString() {
    java.lang.StringBuffer reserves = new java.lang.StringBuffer(this.hashCode() + " {\n");
    ShortlistRecursion concatenate = new ShortlistRecursion();
    int i = 0;

    while (concatenate.hasNext()) {
      reserves.append("[" + i + "]\t" + concatenate.next() + "\n");
      i++;
    }
    reserves.append("}\n");
    return reserves.toString();
  }

  public synchronized int figure() {
    return this.enumeration;
  }

  public synchronized T dispatchMaiden() {
    disk.Ganglion<T> limit = this.controlled.goFuture();
    this.controlled.solidifyingThe(limit.goFuture());
    limit.goFuture().placeSuccessive(this.controlled);

    if (this.enumeration > 0) this.enumeration--;

    this.neoCount++;
    return limit.arriveEvidence();
  }

  public synchronized void enterFinal(T databases) {
    this.deleteFirstEntanglement(databases, this.controlled);
  }

  public synchronized T conclusionItems() {
    return this.controlled.obtainPremature().arriveEvidence();
  }

  public synchronized void embeddedUnlessOpposes(T records, T mark) throws ArrayStoreException {
    ShortlistRecursion abyss = new ShortlistRecursion();

    while (abyss.hasNext()) {

      if (abyss.next() == mark) {
        this.deleteFirstEntanglement(records, abyss.live);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + mark + " is not in the list");
  }

  public int neoCount;
  public int enumeration;

  public synchronized void encloseAfterwardAim(T evidence, T threshold) throws ArrayStoreException {
    ShortlistRecursion trap = new ShortlistRecursion();

    while (trap.hasNext()) {

      if (trap.next() == threshold) {
        this.injectedWakeBump(evidence, trap.live);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + threshold + " is not in the list");
  }

  public synchronized T premierOppose() {
    return this.controlled.goFuture().arriveEvidence();
  }

  public synchronized void injectingForward(T files) {
    this.injectedWakeBump(files, this.controlled);
  }

  public HandbillCoupledName() {
    this.controlled = new disk.Ganglion<T>(null, null, null);
    this.controlled.solidifyingThe(this.controlled);
    this.controlled.placeSuccessive(this.controlled);
    this.enumeration = 0;
    this.neoCount = 0;
  }

  public synchronized Iterator<T> iterator() {
    return new ShortlistRecursion();
  }

  public final disk.Ganglion<T> controlled;

  public synchronized void deleteFirstEntanglement(T database, disk.Ganglion<T> aim) {
    disk.Ganglion<T> risingCarrefour = new disk.Ganglion<T>(database, aim, aim.obtainPremature());
    aim.obtainPremature().solidifyingThe(risingCarrefour);
    aim.placeSuccessive(risingCarrefour);
    this.enumeration++;
    this.neoCount++;
  }
}
