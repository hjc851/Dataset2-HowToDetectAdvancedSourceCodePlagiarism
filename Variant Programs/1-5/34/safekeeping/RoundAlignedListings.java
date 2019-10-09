package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RoundAlignedListings<T> implements Iterable<T> {
  private static final int synX2267int = 0;
  private static final int synX2266int = 0;
  private static final String synX2265String = " is not in the list";
  private static final String synX2264String = "Target ";
  private static final int synX2263int = 0;
  private static final String synX2262String = "}\n";
  private static final String synX2261String = "\n";
  private static final String synX2260String = "]\t";
  private static final String synX2259String = "[";
  private static final int synX2258int = 0;
  private static final String synX2257String = " {\n";
  private static final String synX2256String = " was not found";
  private static final String synX2255String = "Object ";

  public synchronized void putInsteadPoint(T readings, Hub<T> place) {
    Hub<T> newfoundJunction;
    newfoundJunction = new Hub<T>(readings, place, place.driveFinal());
    place.driveFinal().determinedLast(newfoundJunction);
    place.placeSuccessive(newfoundJunction);
    this.calculate++;
    this.chicFigure++;
  }

  public synchronized int figure() {
    return this.calculate;
  }

  public synchronized boolean isEmpty() {
    return (this.watch.letAhead() == this.watch);
  }

  public synchronized Iterator<T> iterator() {
    return new LeanInitialize();
  }

  public synchronized T finishOppose() {
    return this.watch.driveFinal().catchFigures();
  }

  public synchronized void integrateWithinCarrefour(T statistical, Hub<T> quarry) {
    Hub<T> otherEntanglement;
    otherEntanglement = new Hub<T>(statistical, quarry.letAhead(), quarry);
    quarry.letAhead().placeSuccessive(otherEntanglement);
    quarry.determinedLast(otherEntanglement);
    this.calculate++;
    this.chicFigure++;
  }

  public synchronized void slayArtifact(T numbers) {
    LeanInitialize instantiation;
    instantiation = new LeanInitialize();

    while (instantiation.hasNext()) {

      if (instantiation.next() == numbers) {
        instantiation.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX2255String + numbers + synX2256String);
  }

  public synchronized T beginningObjective() {
    return this.watch.letAhead().catchFigures();
  }

  public synchronized String toString() {
    StringBuffer safeguard;
    LeanInitialize inode;
    int i;
    safeguard = new StringBuffer(this.hashCode() + synX2257String);
    inode = new LeanInitialize();
    i = synX2258int;

    while (inode.hasNext()) {
      safeguard.append(synX2259String + i + synX2260String + inode.next() + synX2261String);
      i++;
    }
    safeguard.append(synX2262String);
    return safeguard.toString();
  }

  public synchronized T eliminateBest() {
    Hub<T> focussed;
    focussed = this.watch.letAhead();
    this.watch.determinedLast(focussed.letAhead());
    focussed.letAhead().placeSuccessive(this.watch);

    if (this.calculate > synX2263int) this.calculate--;

    this.chicFigure++;
    return focussed.catchFigures();
  }

  public synchronized void infixEnd(T computer) {
    this.putInsteadPoint(computer, this.watch);
  }

  public synchronized void inscribingBackThing(T database, T pinpoint) throws ArrayStoreException {
    LeanInitialize abcs;
    abcs = new LeanInitialize();

    while (abcs.hasNext()) {

      if (abcs.next() == pinpoint) {
        this.putInsteadPoint(database, abcs.existing);
        return;
      }
    }
    throw new ArrayStoreException(synX2264String + pinpoint + synX2265String);
  }

  public RoundAlignedListings() {
    this.watch = new Hub<T>(null, null, null);
    this.watch.determinedLast(this.watch);
    this.watch.placeSuccessive(this.watch);
    this.calculate = synX2266int;
    this.chicFigure = synX2267int;
  }

  public class LeanInitialize implements Iterator<T> {
    public boolean thirdRepresentsStartedTelephoned = false;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.moduleRoutine != RoundAlignedListings.this.chicFigure)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + RoundAlignedListings.this.hashCode() + " has no more elements");

      this.thirdRepresentsStartedTelephoned = true;
      this.existing = this.existing.letAhead();
      return this.existing.catchFigures();
    }

    public synchronized boolean hasNext() {
      return (this.existing.letAhead() != RoundAlignedListings.this.watch);
    }

    public synchronized void remove() throws ConcurrentModificationException {
      Hub<T> reach;

      if (this.moduleRoutine != RoundAlignedListings.this.chicFigure)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.thirdRepresentsStartedTelephoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thirdRepresentsStartedTelephoned = false;
      reach = this.existing;
      this.existing = this.existing.driveFinal();
      this.existing.determinedLast(reach.letAhead());
      reach.letAhead().placeSuccessive(this.existing);
      this.moduleRoutine++;
      RoundAlignedListings.this.chicFigure++;
      RoundAlignedListings.this.calculate--;
    }

    public Hub<T> existing = null;

    public LeanInitialize() {
      this.existing = RoundAlignedListings.this.watch;
      this.moduleRoutine = RoundAlignedListings.this.chicFigure;
      this.thirdRepresentsStartedTelephoned = false;
    }

    public int moduleRoutine = 0;
  }

  public synchronized T eraseGo() {
    Hub<T> goal;
    goal = this.watch.driveFinal();
    this.watch.placeSuccessive(goal.driveFinal());
    goal.driveFinal().determinedLast(this.watch);

    if (this.calculate > 0) this.calculate--;

    this.chicFigure++;
    return goal.catchFigures();
  }

  public synchronized void inscribingLow(T survey) {
    this.integrateWithinCarrefour(survey, this.watch);
  }

  public int chicFigure = 0;
  public int calculate = 0;

  public synchronized void introduceSubsequentlyTarget(T databases, T point)
      throws ArrayStoreException {
    LeanInitialize date;
    date = new LeanInitialize();

    while (date.hasNext()) {

      if (date.next() == point) {
        this.integrateWithinCarrefour(databases, date.existing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + point + " is not in the list");
  }

  public final Hub<T> watch;
}
