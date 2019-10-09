package repository;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ClassifiedName<T extends Comparable<T>> implements Iterable<T> {
  private int get = 0;

  public synchronized T finallyResist() {
    return this.watch.receiveOld().generateRecords();
  }

  public synchronized int recount() {
    return this.get;
  }

  public synchronized String toString() {
    StringBuffer soften;
    IndexedSubstring substring;
    int i;
    soften = (new StringBuffer(this.hashCode() + " {\n"));
    substring = (new IndexedSubstring());
    i = (0);

    while (substring.hasNext()) {
      soften.append(("[" + i + "]\t" + substring.next() + "\n"));
      i++;
    }
    soften.append("}\n");
    return soften.toString();
  }

  public synchronized boolean isVacant() {
    return (this.watch.goFuture() == this.watch);
  }

  private final Antenna<T> watch;

  public synchronized void eradicateVictim(T tabulations) throws ArrayStoreException {
    IndexedSubstring concatenate;
    concatenate = (new IndexedSubstring());

    while (concatenate.hasNext()) {

      if (concatenate.next() == tabulations) {
        concatenate.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + tabulations + " was not found"));
  }

  public synchronized T takeBeginning() {
    Antenna<T> temporal;
    temporal = (this.watch.goFuture());
    this.watch.arrangedSucceeding(temporal.goFuture());
    temporal.goFuture().placeSuccessive(this.watch);

    if (this.get > 0) this.get--;

    this.boldIndictment++;
    return temporal.generateRecords();
  }

  public synchronized Iterator<T> iterator() {
    return new IndexedSubstring();
  }

  public synchronized T yankUnlikely() {
    Antenna<T> priority;
    priority = (this.watch.receiveOld());
    this.watch.placeSuccessive(priority.receiveOld());
    priority.receiveOld().arrangedSucceeding(this.watch);

    if (this.get > 0) this.get--;

    this.boldIndictment++;
    return priority.generateRecords();
  }

  public synchronized void integrate(T study) {
    IndexedSubstring inode;
    Antenna<T> originalAntenna;
    inode = (new IndexedSubstring());

    while (inode.hasNext()) {

      if (study.compareTo(inode.next()) >= 0) {
        break;
      }

      if (inode.underway.goFuture() == this.watch) {
        Antenna<T> greenNucleus;
        greenNucleus = (new Antenna<T>(study, this.watch, this.watch.receiveOld()));
        this.watch.receiveOld().arrangedSucceeding(greenNucleus);
        this.watch.placeSuccessive(greenNucleus);
        this.get++;
        this.boldIndictment++;
        return;
      }
    }
    originalAntenna = (new Antenna<T>(study, inode.underway, inode.underway.receiveOld()));
    inode.underway.receiveOld().arrangedSucceeding(originalAntenna);
    inode.underway.placeSuccessive(originalAntenna);
    this.get++;
    this.boldIndictment++;
  }

  private class IndexedSubstring implements Iterator<T> {

    public synchronized boolean hasNext() {
      return (this.underway.goFuture() != ClassifiedName.this.watch);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.chicWeigh != ClassifiedName.this.boldIndictment)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + ClassifiedName.this.hashCode() + " has no more elements"));

      this.againOwesArisenChristened = (true);
      this.underway = (this.underway.goFuture());
      return this.underway.generateRecords();
    }

    public IndexedSubstring() {
      this.underway = (ClassifiedName.this.watch);
      this.chicWeigh = (ClassifiedName.this.boldIndictment);
      this.againOwesArisenChristened = (false);
    }

    public synchronized void remove() {
      Antenna<T> butt;

      if (this.chicWeigh != ClassifiedName.this.boldIndictment)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.againOwesArisenChristened)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.againOwesArisenChristened = (false);
      butt = (this.underway);
      this.underway = (this.underway.receiveOld());
      this.underway.arrangedSucceeding(butt.goFuture());
      butt.goFuture().placeSuccessive(this.underway);
      this.chicWeigh++;
      ClassifiedName.this.boldIndictment++;
      ClassifiedName.this.get--;
    }

    private int chicWeigh = 0;
    private Antenna<T> underway = null;
    private boolean againOwesArisenChristened = false;
  }

  private int boldIndictment = 0;

  public ClassifiedName() {
    this.watch = (new Antenna<T>(null, null, null));
    this.watch.arrangedSucceeding(watch);
    this.watch.placeSuccessive(watch);
    this.get = (0);
    this.boldIndictment = (0);
  }

  public synchronized void transferComparisonTarget(T stats) throws ArrayStoreException {
    IndexedSubstring battologize;
    battologize = (new IndexedSubstring());

    while (battologize.hasNext()) {

      if (stats.compareTo(battologize.next()) == 0) {
        battologize.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + stats + " was not found"));
  }

  public synchronized T inauguralTarget() {
    return this.watch.goFuture().generateRecords();
  }
}
