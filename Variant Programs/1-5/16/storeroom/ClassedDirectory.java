package storeroom;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ClassedDirectory<T extends Comparable<T>> implements Iterable<T> {
  private static final String synX1390String = " was not found";
  private static final String synX1389String = "Object ";
  private static final int synX1388int = 0;
  private static final String synX1387String = " was not found";
  private static final String synX1386String = "Object ";
  private static final String synX1385String = "}\n";
  private static final String synX1384String = "\n";
  private static final String synX1383String = "]\t";
  private static final String synX1382String = "[";
  private static final int synX1381int = 0;
  private static final String synX1380String = " {\n";

  public synchronized String toString() {
    StringBuffer temporary;
    ScannedInteger malloc;
    int i;
    temporary = (new StringBuffer(this.hashCode() + synX1380String));
    malloc = (new ScannedInteger());
    i = (synX1381int);

    while (malloc.hasNext()) {
      temporary.append((synX1382String + i + synX1383String + malloc.next() + synX1384String));
      i++;
    }
    temporary.append(synX1385String);
    return temporary.toString();
  }

  public synchronized boolean isVacant() {
    return (this.indicator.fetchThird() == this.indicator);
  }

  public synchronized T startArtefact() {
    return this.indicator.fetchThird().makeIndicators();
  }

  public synchronized void hitObjection(T files) throws ArrayStoreException {
    ScannedInteger struct;
    struct = (new ScannedInteger());

    while (struct.hasNext()) {

      if (struct.next() == files) {
        struct.remove();
        return;
      }
    }
    throw new ArrayStoreException((synX1386String + files + synX1387String));
  }

  public synchronized void banishComparatorElement(T statistical) throws ArrayStoreException {
    ScannedInteger subtree;
    subtree = (new ScannedInteger());

    while (subtree.hasNext()) {

      if (statistical.compareTo(subtree.next()) == synX1388int) {
        subtree.remove();
        return;
      }
    }
    throw new ArrayStoreException((synX1389String + statistical + synX1390String));
  }

  private class ScannedInteger implements Iterator<T> {

    public ScannedInteger() {
      this.stream = (ClassedDirectory.this.indicator);
      this.modernEnumerate = (ClassedDirectory.this.chicWeigh);
      this.expectedGetsRisenCharacterized = (false);
    }

    public synchronized boolean hasNext() {
      return (this.stream.fetchThird() != ClassedDirectory.this.indicator);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.modernEnumerate != ClassedDirectory.this.chicWeigh)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + ClassedDirectory.this.hashCode() + " has no more elements"));

      this.expectedGetsRisenCharacterized = (true);
      this.stream = (this.stream.fetchThird());
      return this.stream.makeIndicators();
    }

    private Hub<T> stream = null;
    private int modernEnumerate = 0;

    public synchronized void remove() {
      Hub<T> goals;

      if (this.modernEnumerate != ClassedDirectory.this.chicWeigh)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.expectedGetsRisenCharacterized)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.expectedGetsRisenCharacterized = (false);
      goals = (this.stream);
      this.stream = (this.stream.havePervious());
      this.stream.settledFirst(goals.fetchThird());
      goals.fetchThird().placedLast(this.stream);
      this.modernEnumerate++;
      ClassedDirectory.this.chicWeigh++;
      ClassedDirectory.this.total--;
    }

    private boolean expectedGetsRisenCharacterized = false;
  }

  public synchronized T expelConcluding() {
    Hub<T> goal;
    goal = (this.indicator.havePervious());
    this.indicator.placedLast(goal.havePervious());
    goal.havePervious().settledFirst(this.indicator);

    if (this.total > 0) this.total--;

    this.chicWeigh++;
    return goal.makeIndicators();
  }

  private int chicWeigh = 0;

  public synchronized int numeration() {
    return this.total;
  }

  private final Hub<T> indicator;

  public synchronized T closeDemur() {
    return this.indicator.havePervious().makeIndicators();
  }

  public synchronized void enter(T database) {
    ScannedInteger initialize;
    Hub<T> refreshingRibbon;
    initialize = (new ScannedInteger());

    while (initialize.hasNext()) {

      if (database.compareTo(initialize.next()) >= 0) {
        break;
      }

      if (initialize.stream.fetchThird() == this.indicator) {
        Hub<T> otherEntanglement;
        otherEntanglement = (new Hub<T>(database, this.indicator, this.indicator.havePervious()));
        this.indicator.havePervious().settledFirst(otherEntanglement);
        this.indicator.placedLast(otherEntanglement);
        this.total++;
        this.chicWeigh++;
        return;
      }
    }
    refreshingRibbon = (new Hub<T>(database, initialize.stream, initialize.stream.havePervious()));
    initialize.stream.havePervious().settledFirst(refreshingRibbon);
    initialize.stream.placedLast(refreshingRibbon);
    this.total++;
    this.chicWeigh++;
  }

  public synchronized Iterator<T> iterator() {
    return new ScannedInteger();
  }

  public synchronized T absentInitial() {
    Hub<T> temperatures;
    temperatures = (this.indicator.fetchThird());
    this.indicator.settledFirst(temperatures.fetchThird());
    temperatures.fetchThird().placedLast(this.indicator);

    if (this.total > 0) this.total--;

    this.chicWeigh++;
    return temperatures.makeIndicators();
  }

  public ClassedDirectory() {
    this.indicator = (new Hub<T>(null, null, null));
    this.indicator.settledFirst(indicator);
    this.indicator.placedLast(indicator);
    this.total = (0);
    this.chicWeigh = (0);
  }

  private int total = 0;
}
