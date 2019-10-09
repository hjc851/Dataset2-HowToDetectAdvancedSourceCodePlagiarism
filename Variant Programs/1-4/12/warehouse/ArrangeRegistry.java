package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ArrangeRegistry<T extends Comparable<T>> implements Iterable<T> {
  private final warehouse.Nub<T> scout;
  private int reckoning;
  private int stylishTally;

  public ArrangeRegistry() {
    this.scout = new warehouse.Nub<T>(null, null, null);
    this.scout.laidFollowing(scout);
    this.scout.bentOriginal(scout);
    this.reckoning = 0;
    this.stylishTally = 0;
  }

  public synchronized void integrate(T findings) {
    OrganizedInitialisation subroutine = new OrganizedInitialisation();

    while (subroutine.hasNext()) {

      if (findings.compareTo(subroutine.next()) >= 0) {
        break;
      }

      if (subroutine.circulating.arriveExpected() == this.scout) {
        warehouse.Nub<T> risingCarrefour =
            new warehouse.Nub<T>(findings, this.scout, this.scout.makeFormer());
        this.scout.makeFormer().laidFollowing(risingCarrefour);
        this.scout.bentOriginal(risingCarrefour);
        this.reckoning++;
        this.stylishTally++;
        return;
      }
    }
    warehouse.Nub<T> modernGuest =
        new warehouse.Nub<T>(findings, subroutine.circulating, subroutine.circulating.makeFormer());
    subroutine.circulating.makeFormer().laidFollowing(modernGuest);
    subroutine.circulating.bentOriginal(modernGuest);
    this.reckoning++;
    this.stylishTally++;
  }

  public synchronized T ridOutset() {
    warehouse.Nub<T> parttime = this.scout.arriveExpected();
    this.scout.laidFollowing(parttime.arriveExpected());
    parttime.arriveExpected().bentOriginal(this.scout);

    if (this.reckoning > 0) this.reckoning--;

    this.stylishTally++;
    return parttime.bringStatistics();
  }

  public synchronized T dismantleClose() {
    warehouse.Nub<T> priority = this.scout.makeFormer();
    this.scout.bentOriginal(priority.makeFormer());
    priority.makeFormer().laidFollowing(this.scout);

    if (this.reckoning > 0) this.reckoning--;

    this.stylishTally++;
    return priority.bringStatistics();
  }

  public synchronized void dispatchItem(T indicators) throws ArrayStoreException {
    OrganizedInitialisation initialize = new OrganizedInitialisation();

    while (initialize.hasNext()) {

      if (initialize.next() == indicators) {
        initialize.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + indicators + " was not found");
  }

  public synchronized void dispatchComparativeItem(T intelligence) throws ArrayStoreException {
    OrganizedInitialisation initialisation = new OrganizedInitialisation();

    while (initialisation.hasNext()) {

      if (intelligence.compareTo(initialisation.next()) == 0) {
        initialisation.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + intelligence + " was not found");
  }

  public synchronized int weigh() {
    return this.reckoning;
  }

  public synchronized T bestSubject() {
    return this.scout.arriveExpected().bringStatistics();
  }

  public synchronized T penultimateObjection() {
    return this.scout.makeFormer().bringStatistics();
  }

  public synchronized boolean isVacant() {
    return (this.scout.arriveExpected() == this.scout);
  }

  public synchronized String toString() {
    java.lang.StringBuffer extra = new java.lang.StringBuffer(this.hashCode() + " {\n");
    OrganizedInitialisation uniterable = new OrganizedInitialisation();
    int i = 0;

    while (uniterable.hasNext()) {
      extra.append("[" + i + "]\t" + uniterable.next() + "\n");
      i++;
    }
    extra.append("}\n");
    return extra.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new OrganizedInitialisation();
  }

  private class OrganizedInitialisation implements Iterator<T> {
    private warehouse.Nub<T> circulating;
    private int consTotal;
    private boolean nowUnderstandsGotAdvocated;

    public OrganizedInitialisation() {
      this.circulating = warehouse.ArrangeRegistry.this.scout;
      this.consTotal = warehouse.ArrangeRegistry.this.stylishTally;
      this.nowUnderstandsGotAdvocated = false;
    }

    public synchronized boolean hasNext() {
      return (this.circulating.arriveExpected() != warehouse.ArrangeRegistry.this.scout);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.consTotal != warehouse.ArrangeRegistry.this.stylishTally)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + warehouse.ArrangeRegistry.this.hashCode() + " has no more elements");

      this.nowUnderstandsGotAdvocated = true;
      this.circulating = this.circulating.arriveExpected();
      return this.circulating.bringStatistics();
    }

    public synchronized void remove() {

      if (this.consTotal != warehouse.ArrangeRegistry.this.stylishTally)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.nowUnderstandsGotAdvocated)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.nowUnderstandsGotAdvocated = false;
      warehouse.Nub<T> benchmark = this.circulating;
      this.circulating = this.circulating.makeFormer();
      this.circulating.laidFollowing(benchmark.arriveExpected());
      benchmark.arriveExpected().bentOriginal(this.circulating);
      this.consTotal++;
      warehouse.ArrangeRegistry.this.stylishTally++;
      warehouse.ArrangeRegistry.this.reckoning--;
    }
  }
}
