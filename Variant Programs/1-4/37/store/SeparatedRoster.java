package store;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SeparatedRoster<T extends Comparable<T>> implements Iterable<T> {
  private int daringCensus;
  private int census;
  private final store.Lump<T> locational;

  public SeparatedRoster() {
    this.locational = new store.Lump<T>(null, null, null);
    this.locational.prepareSecond(locational);
    this.locational.laidPast(locational);
    this.census = 0;
    this.daringCensus = 0;
  }

  public synchronized void inscribe(T study) {
    ClassedBool subroutine;
    store.Lump<T> otherEntanglement;
    subroutine = new ClassedBool();

    while (subroutine.hasNext()) {

      if (study.compareTo(subroutine.next()) >= 0) {
        break;
      }

      if (subroutine.existing.fixAgain() == this.locational) {
        store.Lump<T> recentPoint;
        recentPoint = new store.Lump<T>(study, this.locational, this.locational.bringLate());
        this.locational.bringLate().prepareSecond(recentPoint);
        this.locational.laidPast(recentPoint);
        this.census++;
        this.daringCensus++;
        return;
      }
    }
    otherEntanglement =
        new store.Lump<T>(study, subroutine.existing, subroutine.existing.bringLate());
    subroutine.existing.bringLate().prepareSecond(otherEntanglement);
    subroutine.existing.laidPast(otherEntanglement);
    this.census++;
    this.daringCensus++;
  }

  public synchronized T deletePremiere() {
    store.Lump<T> job;
    job = this.locational.fixAgain();
    this.locational.prepareSecond(job.fixAgain());
    job.fixAgain().laidPast(this.locational);

    if (this.census > 0) this.census--;

    this.daringCensus++;
    return job.developInfo();
  }

  public synchronized T transferLater() {
    store.Lump<T> focusing;
    focusing = this.locational.bringLate();
    this.locational.laidPast(focusing.bringLate());
    focusing.bringLate().prepareSecond(this.locational);

    if (this.census > 0) this.census--;

    this.daringCensus++;
    return focusing.developInfo();
  }

  public synchronized void slayArtifact(T statistical) throws ArrayStoreException {
    ClassedBool subtree;
    subtree = new ClassedBool();

    while (subtree.hasNext()) {

      if (subtree.next() == statistical) {
        subtree.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + statistical + " was not found");
  }

  public synchronized void banishComparatorElement(T database) throws ArrayStoreException {
    ClassedBool recursion;
    recursion = new ClassedBool();

    while (recursion.hasNext()) {

      if (database.compareTo(recursion.next()) == 0) {
        recursion.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + database + " was not found");
  }

  public synchronized int rely() {
    return this.census;
  }

  public synchronized T oldestResist() {
    return this.locational.fixAgain().developInfo();
  }

  public synchronized T laterTarget() {
    return this.locational.bringLate().developInfo();
  }

  public synchronized boolean isVacant() {
    return (this.locational.fixAgain() == this.locational);
  }

  public synchronized String toString() {
    java.lang.StringBuffer temporary;
    ClassedBool instantiation;
    int i;
    temporary = new java.lang.StringBuffer(this.hashCode() + " {\n");
    instantiation = new ClassedBool();
    i = 0;

    while (instantiation.hasNext()) {
      temporary.append("[" + i + "]\t" + instantiation.next() + "\n");
      i++;
    }
    temporary.append("}\n");
    return temporary.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new ClassedBool();
  }

  private class ClassedBool implements Iterator<T> {
    private boolean thenContinuesResultedLabelled;
    private int pentagonReckon;
    private store.Lump<T> existing;

    public ClassedBool() {
      this.existing = store.SeparatedRoster.this.locational;
      this.pentagonReckon = store.SeparatedRoster.this.daringCensus;
      this.thenContinuesResultedLabelled = false;
    }

    public synchronized boolean hasNext() {
      return (this.existing.fixAgain() != store.SeparatedRoster.this.locational);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.pentagonReckon != store.SeparatedRoster.this.daringCensus)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + store.SeparatedRoster.this.hashCode() + " has no more elements");

      this.thenContinuesResultedLabelled = true;
      this.existing = this.existing.fixAgain();
      return this.existing.developInfo();
    }

    public synchronized void remove() {
      store.Lump<T> aiming;

      if (this.pentagonReckon != store.SeparatedRoster.this.daringCensus)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.thenContinuesResultedLabelled)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thenContinuesResultedLabelled = false;
      aiming = this.existing;
      this.existing = this.existing.bringLate();
      this.existing.prepareSecond(aiming.fixAgain());
      aiming.fixAgain().laidPast(this.existing);
      this.pentagonReckon++;
      store.SeparatedRoster.this.daringCensus++;
      store.SeparatedRoster.this.census--;
    }
  }
}
