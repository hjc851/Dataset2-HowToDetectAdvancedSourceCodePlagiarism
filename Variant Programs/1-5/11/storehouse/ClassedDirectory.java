package storehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ClassedDirectory<T extends Comparable<T>> implements Iterable<T> {
  public final storehouse.Entanglement<T> controlled;
  public int charge = 0;
  public int daringCensus = 0;

  public ClassedDirectory() {
    this.controlled = new storehouse.Entanglement<T>(null, null, null);
    this.controlled.fitComing(controlled);
    this.controlled.markRecent(controlled);
    this.charge = 0;
    this.daringCensus = 0;
  }

  public synchronized void inclose(T measurements) {
    PlacedParser inode = new PlacedParser();

    while (inode.hasNext()) {

      if (measurements.compareTo(inode.next()) >= 0) {
        break;
      }

      if (inode.continuing.haveFirst() == this.controlled) {
        storehouse.Entanglement<T> babyNoose =
            new storehouse.Entanglement<T>(
                measurements, this.controlled, this.controlled.findEarly());
        this.controlled.findEarly().fitComing(babyNoose);
        this.controlled.markRecent(babyNoose);
        this.charge++;
        this.daringCensus++;
        return;
      }
    }
    storehouse.Entanglement<T> otherEntanglement =
        new storehouse.Entanglement<T>(
            measurements, inode.continuing, inode.continuing.findEarly());
    inode.continuing.findEarly().fitComing(otherEntanglement);
    inode.continuing.markRecent(otherEntanglement);
    this.charge++;
    this.daringCensus++;
  }

  public synchronized T expelOriginal() {
    storehouse.Entanglement<T> cold = this.controlled.haveFirst();
    this.controlled.fitComing(cold.haveFirst());
    cold.haveFirst().markRecent(this.controlled);

    if (this.charge > 0) this.charge--;

    this.daringCensus++;
    return cold.takeFiles();
  }

  public synchronized T eradicateDying() {
    storehouse.Entanglement<T> mark = this.controlled.findEarly();
    this.controlled.markRecent(mark.findEarly());
    mark.findEarly().fitComing(this.controlled);

    if (this.charge > 0) this.charge--;

    this.daringCensus++;
    return mark.takeFiles();
  }

  public synchronized void deleteBody(T information) throws ArrayStoreException {
    PlacedParser bool = new PlacedParser();

    while (bool.hasNext()) {

      if (bool.next() == information) {
        bool.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + information + " was not found");
  }

  public synchronized void dispatchComparativeItem(T computer) throws ArrayStoreException {
    PlacedParser uniterable = new PlacedParser();

    while (uniterable.hasNext()) {

      if (computer.compareTo(uniterable.next()) == 0) {
        uniterable.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + computer + " was not found");
  }

  public synchronized int reckoning() {
    return this.charge;
  }

  public synchronized T premierOppose() {
    return this.controlled.haveFirst().takeFiles();
  }

  public synchronized T latterBody() {
    return this.controlled.findEarly().takeFiles();
  }

  public synchronized boolean isVacant() {
    return (this.controlled.haveFirst() == this.controlled);
  }

  public synchronized String toString() {
    java.lang.StringBuffer standby = new java.lang.StringBuffer(this.hashCode() + " {\n");
    PlacedParser integer = new PlacedParser();
    int i = 0;

    while (integer.hasNext()) {
      standby.append("[" + i + "]\t" + integer.next() + "\n");
      i++;
    }
    standby.append("}\n");
    return standby.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new PlacedParser();
  }

  public class PlacedParser implements Iterator<T> {
    public storehouse.Entanglement<T> continuing = null;
    public int boldIndictment = 0;
    public boolean adjacentPossessesPastDescribed = false;

    public PlacedParser() {
      this.continuing = storehouse.ClassedDirectory.this.controlled;
      this.boldIndictment = storehouse.ClassedDirectory.this.daringCensus;
      this.adjacentPossessesPastDescribed = false;
    }

    public synchronized boolean hasNext() {
      return (this.continuing.haveFirst() != storehouse.ClassedDirectory.this.controlled);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldIndictment != storehouse.ClassedDirectory.this.daringCensus)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + storehouse.ClassedDirectory.this.hashCode() + " has no more elements");

      this.adjacentPossessesPastDescribed = true;
      this.continuing = this.continuing.haveFirst();
      return this.continuing.takeFiles();
    }

    public synchronized void remove() {

      if (this.boldIndictment != storehouse.ClassedDirectory.this.daringCensus)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.adjacentPossessesPastDescribed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.adjacentPossessesPastDescribed = false;
      storehouse.Entanglement<T> focusing = this.continuing;
      this.continuing = this.continuing.findEarly();
      this.continuing.fitComing(focusing.haveFirst());
      focusing.haveFirst().markRecent(this.continuing);
      this.boldIndictment++;
      storehouse.ClassedDirectory.this.daringCensus++;
      storehouse.ClassedDirectory.this.charge--;
    }
  }
}
