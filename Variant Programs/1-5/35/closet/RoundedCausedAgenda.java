package closet;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RoundedCausedAgenda<T> implements Iterable<T> {
  private final Problem<T> locational;
  private int tabulation;
  private int moderateQuantity;

  public RoundedCausedAgenda() {
    this.locational = new Problem<T>(null, null, null);
    this.locational.fixedAfter(this.locational);
    this.locational.doFinal(this.locational);
    this.tabulation = 0;
    this.moderateQuantity = 0;
  }

  public synchronized void insertionOldest(T results) {
    this.introduceSubsequentlyClient(results, this.locational);
  }

  public synchronized void insertionFinally(T intelligence) {
    this.embeddedUnlessLump(intelligence, this.locational);
  }

  public synchronized void enterAfterwardsArtifact(T measurements, T aiming)
      throws ArrayStoreException {
    ChecklistMalloc ace = new ChecklistMalloc();

    while (ace.hasNext()) {

      if (ace.next() == aiming) {
        this.introduceSubsequentlyClient(measurements, ace.prevalent);
        return;
      }
    }
    throw new ArrayStoreException("Target " + aiming + " is not in the list");
  }

  public synchronized void attachBeforehandSubject(T information, T achieve)
      throws ArrayStoreException {
    ChecklistMalloc trap = new ChecklistMalloc();

    while (trap.hasNext()) {

      if (trap.next() == achieve) {
        this.embeddedUnlessLump(information, trap.prevalent);
        return;
      }
    }
    throw new ArrayStoreException("Target " + achieve + " is not in the list");
  }

  private synchronized void introduceSubsequentlyClient(T records, Problem<T> limit) {
    Problem<T> untestedScn = new Problem<T>(records, limit.haveFirst(), limit);
    limit.haveFirst().doFinal(untestedScn);
    limit.fixedAfter(untestedScn);
    this.tabulation++;
    this.moderateQuantity++;
  }

  private synchronized void embeddedUnlessLump(T databases, Problem<T> quarry) {
    Problem<T> freshlyGanglion = new Problem<T>(databases, quarry, quarry.arriveFirst());
    quarry.arriveFirst().fixedAfter(freshlyGanglion);
    quarry.doFinal(freshlyGanglion);
    this.tabulation++;
    this.moderateQuantity++;
  }

  public synchronized T eraseFirstborn() {
    Problem<T> pinpoint = this.locational.haveFirst();
    this.locational.fixedAfter(pinpoint.haveFirst());
    pinpoint.haveFirst().doFinal(this.locational);

    if (this.tabulation > 0) this.tabulation--;

    this.moderateQuantity++;
    return pinpoint.takeFiles();
  }

  public synchronized T murderEnd() {
    Problem<T> place = this.locational.arriveFirst();
    this.locational.doFinal(place.arriveFirst());
    place.arriveFirst().fixedAfter(this.locational);

    if (this.tabulation > 0) this.tabulation--;

    this.moderateQuantity++;
    return place.takeFiles();
  }

  public synchronized void installPreclude(T study) {
    ChecklistMalloc pathname = new ChecklistMalloc();

    while (pathname.hasNext()) {

      if (pathname.next() == study) {
        pathname.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + study + " was not found");
  }

  public synchronized T initialAim() {
    return this.locational.haveFirst().takeFiles();
  }

  public synchronized T worstItem() {
    return this.locational.arriveFirst().takeFiles();
  }

  public synchronized boolean isEmpty() {
    return (this.locational.haveFirst() == this.locational);
  }

  public synchronized int enumerate() {
    return this.tabulation;
  }

  public synchronized String toString() {
    StringBuffer stabilization = new StringBuffer(this.hashCode() + " {\n");
    ChecklistMalloc struct = new ChecklistMalloc();
    int i = 0;

    while (struct.hasNext()) {
      stabilization.append("[" + i + "]\t" + struct.next() + "\n");
      i++;
    }
    stabilization.append("}\n");
    return stabilization.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new ChecklistMalloc();
  }

  private class ChecklistMalloc implements Iterator<T> {
    private Problem<T> prevalent;
    private int modeEnumerate;
    private boolean thirdRepresentsStartedTelephoned;

    public ChecklistMalloc() {
      this.prevalent = RoundedCausedAgenda.this.locational;
      this.modeEnumerate = RoundedCausedAgenda.this.moderateQuantity;
      this.thirdRepresentsStartedTelephoned = false;
    }

    public synchronized boolean hasNext() {
      return (this.prevalent.haveFirst() != RoundedCausedAgenda.this.locational);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.modeEnumerate != RoundedCausedAgenda.this.moderateQuantity)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + RoundedCausedAgenda.this.hashCode() + " has no more elements");

      this.thirdRepresentsStartedTelephoned = true;
      this.prevalent = this.prevalent.haveFirst();
      return this.prevalent.takeFiles();
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.modeEnumerate != RoundedCausedAgenda.this.moderateQuantity)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.thirdRepresentsStartedTelephoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thirdRepresentsStartedTelephoned = false;
      Problem<T> focusing = this.prevalent;
      this.prevalent = this.prevalent.arriveFirst();
      this.prevalent.fixedAfter(focusing.haveFirst());
      focusing.haveFirst().doFinal(this.prevalent);
      this.modeEnumerate++;
      RoundedCausedAgenda.this.moderateQuantity++;
      RoundedCausedAgenda.this.tabulation--;
    }
  }
}
