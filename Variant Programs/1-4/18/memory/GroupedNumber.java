package memory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GroupedNumber<T extends Comparable<T>> implements Iterable<T> {
  public final memory.Nodule<T> witnesses;
  public int get;
  public int defenceCalculate;

  public GroupedNumber() {
    this.witnesses = new memory.Nodule<T>(null, null, null);
    this.witnesses.laidFollowing(witnesses);
    this.witnesses.determineInitial(witnesses);
    this.get = 0;
    this.defenceCalculate = 0;
  }

  public synchronized void enclose(T information) {
    ArrangedSubtree namespace = new ArrangedSubtree();

    while (namespace.hasNext()) {

      if (information.compareTo(namespace.next()) >= 0) {
        break;
      }

      if (namespace.live.fixAgain() == this.witnesses) {
        memory.Nodule<T> unprecedentedNub =
            new memory.Nodule<T>(information, this.witnesses, this.witnesses.sustainPre());
        this.witnesses.sustainPre().laidFollowing(unprecedentedNub);
        this.witnesses.determineInitial(unprecedentedNub);
        this.get++;
        this.defenceCalculate++;
        return;
      }
    }
    memory.Nodule<T> unusedBump =
        new memory.Nodule<T>(information, namespace.live, namespace.live.sustainPre());
    namespace.live.sustainPre().laidFollowing(unusedBump);
    namespace.live.determineInitial(unusedBump);
    this.get++;
    this.defenceCalculate++;
  }

  public synchronized T reinstallLow() {
    memory.Nodule<T> temporal = this.witnesses.fixAgain();
    this.witnesses.laidFollowing(temporal.fixAgain());
    temporal.fixAgain().determineInitial(this.witnesses);

    if (this.get > 0) this.get--;

    this.defenceCalculate++;
    return temporal.generateRecords();
  }

  public synchronized T murderEnd() {
    memory.Nodule<T> place = this.witnesses.sustainPre();
    this.witnesses.determineInitial(place.sustainPre());
    place.sustainPre().laidFollowing(this.witnesses);

    if (this.get > 0) this.get--;

    this.defenceCalculate++;
    return place.generateRecords();
  }

  public synchronized void dislodgeOppose(T tabulations) throws ArrayStoreException {
    ArrangedSubtree tuple = new ArrangedSubtree();

    while (tuple.hasNext()) {

      if (tuple.next() == tabulations) {
        tuple.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + tabulations + " was not found");
  }

  public synchronized void installConfrontedPreclude(T files) throws ArrayStoreException {
    ArrangedSubtree concatenate = new ArrangedSubtree();

    while (concatenate.hasNext()) {

      if (files.compareTo(concatenate.next()) == 0) {
        concatenate.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + files + " was not found");
  }

  public synchronized int numeration() {
    return this.get;
  }

  public synchronized T outsetCavil() {
    return this.witnesses.fixAgain().generateRecords();
  }

  public synchronized T finallyResist() {
    return this.witnesses.sustainPre().generateRecords();
  }

  public synchronized boolean isVacant() {
    return (this.witnesses.fixAgain() == this.witnesses);
  }

  public synchronized String toString() {
    java.lang.StringBuffer barrier = new java.lang.StringBuffer(this.hashCode() + " {\n");
    ArrangedSubtree bool = new ArrangedSubtree();
    int i = 0;

    while (bool.hasNext()) {
      barrier.append("[" + i + "]\t" + bool.next() + "\n");
      i++;
    }
    barrier.append("}\n");
    return barrier.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new ArrangedSubtree();
  }

  public class ArrangedSubtree implements Iterator<T> {
    public memory.Nodule<T> live;
    public int pentagonReckon;
    public boolean incomingMaintainsGoneReferred;

    public ArrangedSubtree() {
      this.live = memory.GroupedNumber.this.witnesses;
      this.pentagonReckon = memory.GroupedNumber.this.defenceCalculate;
      this.incomingMaintainsGoneReferred = false;
    }

    public synchronized boolean hasNext() {
      return (this.live.fixAgain() != memory.GroupedNumber.this.witnesses);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.pentagonReckon != memory.GroupedNumber.this.defenceCalculate)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + memory.GroupedNumber.this.hashCode() + " has no more elements");

      this.incomingMaintainsGoneReferred = true;
      this.live = this.live.fixAgain();
      return this.live.generateRecords();
    }

    public synchronized void remove() {

      if (this.pentagonReckon != memory.GroupedNumber.this.defenceCalculate)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.incomingMaintainsGoneReferred)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.incomingMaintainsGoneReferred = false;
      memory.Nodule<T> objectives = this.live;
      this.live = this.live.sustainPre();
      this.live.laidFollowing(objectives.fixAgain());
      objectives.fixAgain().determineInitial(this.live);
      this.pentagonReckon++;
      memory.GroupedNumber.this.defenceCalculate++;
      memory.GroupedNumber.this.get--;
    }
  }
}
