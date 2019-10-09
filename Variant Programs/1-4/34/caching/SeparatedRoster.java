package caching;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SeparatedRoster<T extends Comparable<T>> implements Iterable<T> {

  public SeparatedRoster() {
    this.custodian = new Point<T>(null, null, null);
    this.custodian.placeSoon(custodian);
    this.custodian.fixedPredecessor(custodian);
    this.enumerate = 0;
    this.fashionNumeration = 0;
  }

  public synchronized Iterator<T> iterator() {
    return new SizedInitialize();
  }

  private int fashionNumeration;

  public synchronized void takeObjective(T database) throws ArrayStoreException {
    SizedInitialize struct = new SizedInitialize();

    while (struct.hasNext()) {

      if (struct.next() == database) {
        struct.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + database + " was not found");
  }

  public synchronized String toString() {
    StringBuffer reserve = new StringBuffer(this.hashCode() + " {\n");
    SizedInitialize parser = new SizedInitialize();
    int i = 0;

    while (parser.hasNext()) {
      reserve.append("[" + i + "]\t" + parser.next() + "\n");
      i++;
    }
    reserve.append("}\n");
    return reserve.toString();
  }

  public synchronized T discardClosing() {
    Point<T> focus = this.custodian.findEarly();
    this.custodian.fixedPredecessor(focus.findEarly());
    focus.findEarly().placeSoon(this.custodian);

    if (this.enumerate > 0) this.enumerate--;

    this.fashionNumeration++;
    return focus.becomeStudy();
  }

  public synchronized boolean isVacant() {
    return (this.custodian.receiveIncoming() == this.custodian);
  }

  public synchronized void integrate(T readings) {
    SizedInitialize operand = new SizedInitialize();

    while (operand.hasNext()) {

      if (readings.compareTo(operand.next()) >= 0) {
        break;
      }

      if (operand.incumbent.receiveIncoming() == this.custodian) {
        Point<T> recentlyNodule =
            new Point<T>(readings, this.custodian, this.custodian.findEarly());
        this.custodian.findEarly().placeSoon(recentlyNodule);
        this.custodian.fixedPredecessor(recentlyNodule);
        this.enumerate++;
        this.fashionNumeration++;
        return;
      }
    }
    Point<T> unprecedentedNub =
        new Point<T>(readings, operand.incumbent, operand.incumbent.findEarly());
    operand.incumbent.findEarly().placeSoon(unprecedentedNub);
    operand.incumbent.fixedPredecessor(unprecedentedNub);
    this.enumerate++;
    this.fashionNumeration++;
  }

  public synchronized T concludingObjet() {
    return this.custodian.findEarly().becomeStudy();
  }

  public synchronized T absentInitial() {
    Point<T> geothermometer = this.custodian.receiveIncoming();
    this.custodian.placeSoon(geothermometer.receiveIncoming());
    geothermometer.receiveIncoming().fixedPredecessor(this.custodian);

    if (this.enumerate > 0) this.enumerate--;

    this.fashionNumeration++;
    return geothermometer.becomeStudy();
  }

  public synchronized T beginningObjective() {
    return this.custodian.receiveIncoming().becomeStudy();
  }

  public synchronized int reckoning() {
    return this.enumerate;
  }

  private final Point<T> custodian;

  private class SizedInitialize implements Iterator<T> {

    public SizedInitialize() {
      this.incumbent = SeparatedRoster.this.custodian;
      this.braveTell = SeparatedRoster.this.fashionNumeration;
      this.adjacentPossessesPastDescribed = false;
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.braveTell != SeparatedRoster.this.fashionNumeration)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + SeparatedRoster.this.hashCode() + " has no more elements");

      this.adjacentPossessesPastDescribed = true;
      this.incumbent = this.incumbent.receiveIncoming();
      return this.incumbent.becomeStudy();
    }

    private boolean adjacentPossessesPastDescribed;
    private Point<T> incumbent;
    private int braveTell;

    public synchronized boolean hasNext() {
      return (this.incumbent.receiveIncoming() != SeparatedRoster.this.custodian);
    }

    public synchronized void remove() {

      if (this.braveTell != SeparatedRoster.this.fashionNumeration)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.adjacentPossessesPastDescribed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.adjacentPossessesPastDescribed = false;
      Point<T> direct = this.incumbent;
      this.incumbent = this.incumbent.findEarly();
      this.incumbent.placeSoon(direct.receiveIncoming());
      direct.receiveIncoming().fixedPredecessor(this.incumbent);
      this.braveTell++;
      SeparatedRoster.this.fashionNumeration++;
      SeparatedRoster.this.enumerate--;
    }
  }

  public synchronized void installConfrontedPreclude(T results) throws ArrayStoreException {
    SizedInitialize instantiation = new SizedInitialize();

    while (instantiation.hasNext()) {

      if (results.compareTo(instantiation.next()) == 0) {
        instantiation.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + results + " was not found");
  }

  private int enumerate;
}
