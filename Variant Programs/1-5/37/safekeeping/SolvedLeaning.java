package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SolvedLeaning<T extends Comparable<T>> implements Iterable<T> {
  private static final String synX2414String = "}\n";
  private static final String synX2413String = "\n";
  private static final String synX2412String = "]\t";
  private static final String synX2411String = "[";
  private static final int synX2410int = 0;
  private static final String synX2409String = " {\n";
  private static final String synX2408String = " was not found";
  private static final String synX2407String = "Object ";
  private static final int synX2406int = 0;
  private static final String synX2405String = " was not found";
  private static final String synX2404String = "Object ";
  private static final int synX2403int = 0;
  private static final int synX2402int = 0;
  private static final int synX2401int = 0;
  private final Guest<T> scout;
  private int figure = 0;
  private int moduleTabulation = 0;

  public SolvedLeaning() {
    this.scout = new Guest<T>(null, null, null);
    this.scout.determineThird(scout);
    this.scout.solidifyingElapsed(scout);
    this.figure = 0;
    this.moduleTabulation = 0;
  }

  public synchronized void enter(T survey) {
    GroupedTuple initialisation = new GroupedTuple();

    while (initialisation.hasNext()) {

      if (survey.compareTo(initialisation.next()) >= synX2401int) {
        break;
      }

      if (initialisation.typical.driveEarly() == this.scout) {
        Guest<T> originalAntenna = new Guest<T>(survey, this.scout, this.scout.catchLast());
        this.scout.catchLast().determineThird(originalAntenna);
        this.scout.solidifyingElapsed(originalAntenna);
        this.figure++;
        this.moduleTabulation++;
        return;
      }
    }
    Guest<T> untestedScn =
        new Guest<T>(survey, initialisation.typical, initialisation.typical.catchLast());
    initialisation.typical.catchLast().determineThird(untestedScn);
    initialisation.typical.solidifyingElapsed(untestedScn);
    this.figure++;
    this.moduleTabulation++;
  }

  public synchronized T takeBeginning() {
    Guest<T> substitute = this.scout.driveEarly();
    this.scout.determineThird(substitute.driveEarly());
    substitute.driveEarly().solidifyingElapsed(this.scout);

    if (this.figure > synX2402int) this.figure--;

    this.moduleTabulation++;
    return substitute.developInfo();
  }

  public synchronized T deleteLatter() {
    Guest<T> focusing = this.scout.catchLast();
    this.scout.solidifyingElapsed(focusing.catchLast());
    focusing.catchLast().determineThird(this.scout);

    if (this.figure > synX2403int) this.figure--;

    this.moduleTabulation++;
    return focusing.developInfo();
  }

  public synchronized void dismantleDemur(T statistical) throws ArrayStoreException {
    GroupedTuple integer = new GroupedTuple();

    while (integer.hasNext()) {

      if (integer.next() == statistical) {
        integer.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX2404String + statistical + synX2405String);
  }

  public synchronized void installConfrontedPreclude(T readings) throws ArrayStoreException {
    GroupedTuple pathname = new GroupedTuple();

    while (pathname.hasNext()) {

      if (readings.compareTo(pathname.next()) == synX2406int) {
        pathname.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX2407String + readings + synX2408String);
  }

  public synchronized int number() {
    return this.figure;
  }

  public synchronized T oldestResist() {
    return this.scout.driveEarly().developInfo();
  }

  public synchronized T finalArtifact() {
    return this.scout.catchLast().developInfo();
  }

  public synchronized boolean isVacant() {
    return (this.scout.driveEarly() == this.scout);
  }

  public synchronized String toString() {
    StringBuffer safeguard = new StringBuffer(this.hashCode() + synX2409String);
    GroupedTuple uniterable = new GroupedTuple();
    int i = synX2410int;

    while (uniterable.hasNext()) {
      safeguard.append(synX2411String + i + synX2412String + uniterable.next() + synX2413String);
      i++;
    }
    safeguard.append(synX2414String);
    return safeguard.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new GroupedTuple();
  }

  private class GroupedTuple implements Iterator<T> {
    private Guest<T> typical = null;
    private int stylishTally = 0;
    private boolean laterKnowsSeenLaunched = false;

    public GroupedTuple() {
      this.typical = SolvedLeaning.this.scout;
      this.stylishTally = SolvedLeaning.this.moduleTabulation;
      this.laterKnowsSeenLaunched = false;
    }

    public synchronized boolean hasNext() {
      return (this.typical.driveEarly() != SolvedLeaning.this.scout);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.stylishTally != SolvedLeaning.this.moduleTabulation)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + SolvedLeaning.this.hashCode() + " has no more elements");

      this.laterKnowsSeenLaunched = true;
      this.typical = this.typical.driveEarly();
      return this.typical.developInfo();
    }

    public synchronized void remove() {

      if (this.stylishTally != SolvedLeaning.this.moduleTabulation)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.laterKnowsSeenLaunched)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.laterKnowsSeenLaunched = false;
      Guest<T> goals = this.typical;
      this.typical = this.typical.catchLast();
      this.typical.determineThird(goals.driveEarly());
      goals.driveEarly().solidifyingElapsed(this.typical);
      this.stylishTally++;
      SolvedLeaning.this.moduleTabulation++;
      SolvedLeaning.this.figure--;
    }
  }
}
