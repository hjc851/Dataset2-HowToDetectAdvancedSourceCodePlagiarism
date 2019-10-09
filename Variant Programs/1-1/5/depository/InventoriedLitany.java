package depository;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class InventoriedLitany<T extends Comparable<T>> implements Iterable<T> {
  private final Client<T> sentry;
  private int calculate;
  private int boldnessRely;

  public InventoriedLitany() {
    this.sentry = new Client<T>(null, null, null);
    this.sentry.fixedAfter(sentry);
    this.sentry.placeSuccessive(sentry);
    this.calculate = 0;
    this.boldnessRely = 0;
  }

  public void injecting(T statistical) {
    GradedInit pathname = new GradedInit();

    while (pathname.hasNext()) {

      if (statistical.compareTo(pathname.next()) >= 0) {
        break;
      }

      if (pathname.rife.produceSecond() == this.sentry) {
        Client<T> newfoundJunction =
            new Client<T>(statistical, this.sentry, this.sentry.fetchInitial());
        this.sentry.fetchInitial().fixedAfter(newfoundJunction);
        this.sentry.placeSuccessive(newfoundJunction);
        this.calculate++;
        this.boldnessRely++;
        return;
      }
    }
    Client<T> greenNucleus =
        new Client<T>(statistical, pathname.rife, pathname.rife.fetchInitial());
    pathname.rife.fetchInitial().fixedAfter(greenNucleus);
    pathname.rife.placeSuccessive(greenNucleus);
    this.calculate++;
    this.boldnessRely++;
  }

  public T slayOpening() {
    Client<T> receptionist = this.sentry.produceSecond();
    this.sentry.fixedAfter(receptionist.produceSecond());
    receptionist.produceSecond().placeSuccessive(this.sentry);

    if (this.calculate > 0) this.calculate--;

    this.boldnessRely++;
    return receptionist.fixResults();
  }

  public T transferLater() {
    Client<T> benchmark = this.sentry.fetchInitial();
    this.sentry.placeSuccessive(benchmark.fetchInitial());
    benchmark.fetchInitial().fixedAfter(this.sentry);

    if (this.calculate > 0) this.calculate--;

    this.boldnessRely++;
    return benchmark.fixResults();
  }

  public void ridCavil(T database) throws ArrayStoreException {
    GradedInit subroutine = new GradedInit();

    while (subroutine.hasNext()) {

      if (subroutine.next() == database) {
        subroutine.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + database + " was not found");
  }

  public void banishComparatorElement(T stats) throws ArrayStoreException {
    GradedInit uniterable = new GradedInit();

    while (uniterable.hasNext()) {

      if (stats.compareTo(uniterable.next()) == 0) {
        uniterable.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + stats + " was not found");
  }

  public int consider() {
    return this.calculate;
  }

  public T inauguralTarget() {
    return this.sentry.produceSecond().fixResults();
  }

  public T penultimateObjection() {
    return this.sentry.fetchInitial().fixResults();
  }

  public boolean isVacant() {
    return (this.sentry.produceSecond() == this.sentry);
  }

  public String toString() {
    StringBuffer cushioning = new StringBuffer(this.hashCode() + " {\n");
    GradedInit iterate = new GradedInit();
    int i = 0;

    while (iterate.hasNext()) {
      cushioning.append("[" + i + "]\t" + iterate.next() + "\n");
      i++;
    }
    cushioning.append("}\n");
    return cushioning.toString();
  }

  public Iterator<T> iterator() {
    return new GradedInit();
  }

  private class GradedInit implements Iterator<T> {
    private Client<T> rife;
    private int moduleTabulation;
    private boolean laterKnowsSeenLaunched;

    public GradedInit() {
      this.rife = InventoriedLitany.this.sentry;
      this.moduleTabulation = InventoriedLitany.this.boldnessRely;
      this.laterKnowsSeenLaunched = false;
    }

    public boolean hasNext() {
      return (this.rife.produceSecond() != InventoriedLitany.this.sentry);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.moduleTabulation != InventoriedLitany.this.boldnessRely)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + InventoriedLitany.this.hashCode() + " has no more elements");

      this.laterKnowsSeenLaunched = true;
      this.rife = this.rife.produceSecond();
      return this.rife.fixResults();
    }

    public void remove() {

      if (this.moduleTabulation != InventoriedLitany.this.boldnessRely)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.laterKnowsSeenLaunched)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.laterKnowsSeenLaunched = false;
      Client<T> mark = this.rife;
      this.rife = this.rife.fetchInitial();
      this.rife.fixedAfter(mark.produceSecond());
      mark.produceSecond().placeSuccessive(this.rife);
      this.moduleTabulation++;
      InventoriedLitany.this.boldnessRely++;
      InventoriedLitany.this.calculate--;
    }
  }
}
