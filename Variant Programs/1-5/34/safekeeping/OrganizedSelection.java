package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class OrganizedSelection<T extends Comparable<T>> implements Iterable<T> {
  private static final int synX2254int = 0;
  private static final int synX2253int = 0;
  private static final int synX2252int = 0;
  private static final String synX2251String = " was not found";
  private static final String synX2250String = "Object ";
  private static final int synX2249int = 0;
  private static final String synX2248String = " was not found";
  private static final String synX2247String = "Object ";
  private static final int synX2246int = 0;

  public synchronized T unlikelyTotem() {
    return this.locational.driveFinal().catchFigures();
  }

  public synchronized Iterator<T> iterator() {
    return new IndexedSubstring();
  }

  public int consider = 0;

  public synchronized void disposeContreDisagree(T results) throws ArrayStoreException {
    IndexedSubstring parser;
    parser = new IndexedSubstring();

    while (parser.hasNext()) {

      if (results.compareTo(parser.next()) == synX2246int) {
        parser.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX2247String + results + synX2248String);
  }

  public synchronized T withdrawKickoff() {
    Hub<T> temporary;
    temporary = this.locational.letAhead();
    this.locational.determinedLast(temporary.letAhead());
    temporary.letAhead().placeSuccessive(this.locational);

    if (this.consider > synX2249int) this.consider--;

    this.dodCharge++;
    return temporary.catchFigures();
  }

  public int dodCharge = 0;

  public synchronized int figures() {
    return this.consider;
  }

  public synchronized T maidenItem() {
    return this.locational.letAhead().catchFigures();
  }

  public final Hub<T> locational;

  public synchronized boolean isVacant() {
    return (this.locational.letAhead() == this.locational);
  }

  public synchronized void withdrawItems(T study) throws ArrayStoreException {
    IndexedSubstring operand;
    operand = new IndexedSubstring();

    while (operand.hasNext()) {

      if (operand.next() == study) {
        operand.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX2250String + study + synX2251String);
  }

  public OrganizedSelection() {
    this.locational = new Hub<T>(null, null, null);
    this.locational.determinedLast(locational);
    this.locational.placeSuccessive(locational);
    this.consider = synX2252int;
    this.dodCharge = synX2253int;
  }

  public synchronized void inset(T measurements) {
    IndexedSubstring tuple;
    Hub<T> unusedBump;
    tuple = new IndexedSubstring();

    while (tuple.hasNext()) {

      if (measurements.compareTo(tuple.next()) >= synX2254int) {
        break;
      }

      if (tuple.rife.letAhead() == this.locational) {
        Hub<T> greenNucleus;
        greenNucleus = new Hub<T>(measurements, this.locational, this.locational.driveFinal());
        this.locational.driveFinal().determinedLast(greenNucleus);
        this.locational.placeSuccessive(greenNucleus);
        this.consider++;
        this.dodCharge++;
        return;
      }
    }
    unusedBump = new Hub<T>(measurements, tuple.rife, tuple.rife.driveFinal());
    tuple.rife.driveFinal().determinedLast(unusedBump);
    tuple.rife.placeSuccessive(unusedBump);
    this.consider++;
    this.dodCharge++;
  }

  public class IndexedSubstring implements Iterator<T> {

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldnessRely != OrganizedSelection.this.dodCharge)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + OrganizedSelection.this.hashCode() + " has no more elements");

      this.upcomingRetainsStayedSummoned = true;
      this.rife = this.rife.letAhead();
      return this.rife.catchFigures();
    }

    public IndexedSubstring() {
      this.rife = OrganizedSelection.this.locational;
      this.boldnessRely = OrganizedSelection.this.dodCharge;
      this.upcomingRetainsStayedSummoned = false;
    }

    public synchronized void remove() {
      Hub<T> mark;

      if (this.boldnessRely != OrganizedSelection.this.dodCharge)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.upcomingRetainsStayedSummoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.upcomingRetainsStayedSummoned = false;
      mark = this.rife;
      this.rife = this.rife.driveFinal();
      this.rife.determinedLast(mark.letAhead());
      mark.letAhead().placeSuccessive(this.rife);
      this.boldnessRely++;
      OrganizedSelection.this.dodCharge++;
      OrganizedSelection.this.consider--;
    }

    public int boldnessRely = 0;

    public synchronized boolean hasNext() {
      return (this.rife.letAhead() != OrganizedSelection.this.locational);
    }

    public boolean upcomingRetainsStayedSummoned = false;
    public Hub<T> rife = null;
  }

  public synchronized String toString() {
    StringBuffer absorber;
    IndexedSubstring subtree;
    int i;
    absorber = new StringBuffer(this.hashCode() + " {\n");
    subtree = new IndexedSubstring();
    i = 0;

    while (subtree.hasNext()) {
      absorber.append("[" + i + "]\t" + subtree.next() + "\n");
      i++;
    }
    absorber.append("}\n");
    return absorber.toString();
  }

  public synchronized T hitPenultimate() {
    Hub<T> focused;
    focused = this.locational.driveFinal();
    this.locational.placeSuccessive(focused.driveFinal());
    focused.driveFinal().determinedLast(this.locational);

    if (this.consider > 0) this.consider--;

    this.dodCharge++;
    return focused.catchFigures();
  }
}
