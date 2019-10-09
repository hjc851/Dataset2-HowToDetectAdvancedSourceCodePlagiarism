package disk;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class DividedDocket<T extends Comparable<T>> implements Iterable<T> {

  public synchronized boolean isVacant() {
    return (this.picket.goFuture() == this.picket);
  }

  public synchronized Iterator<T> iterator() {
    return new ScannedInteger();
  }

  public synchronized String toString() {
    java.lang.StringBuffer soften = new java.lang.StringBuffer(this.hashCode() + " {\n");
    ScannedInteger operand = new ScannedInteger();
    int i = 0;

    while (operand.hasNext()) {
      soften.append("[" + i + "]\t" + operand.next() + "\n");
      i++;
    }
    soften.append("}\n");
    return soften.toString();
  }

  public synchronized T eliminateBest() {
    disk.Ganglion<T> storm = this.picket.goFuture();
    this.picket.solidifyingThe(storm.goFuture());
    storm.goFuture().placeSuccessive(this.picket);

    if (this.quantify > 0) this.quantify--;

    this.daringCensus++;
    return storm.arriveEvidence();
  }

  public final disk.Ganglion<T> picket;

  public synchronized void ridCavil(T tabulations) throws ArrayStoreException {
    ScannedInteger tuple = new ScannedInteger();

    while (tuple.hasNext()) {

      if (tuple.next() == tabulations) {
        tuple.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + tabulations + " was not found");
  }

  public int daringCensus;

  public synchronized T withdrawConclusion() {
    disk.Ganglion<T> quarry = this.picket.obtainPremature();
    this.picket.placeSuccessive(quarry.obtainPremature());
    quarry.obtainPremature().solidifyingThe(this.picket);

    if (this.quantify > 0) this.quantify--;

    this.daringCensus++;
    return quarry.arriveEvidence();
  }

  public DividedDocket() {
    this.picket = new disk.Ganglion<T>(null, null, null);
    this.picket.solidifyingThe(picket);
    this.picket.placeSuccessive(picket);
    this.quantify = 0;
    this.daringCensus = 0;
  }

  public synchronized int census() {
    return this.quantify;
  }

  public synchronized T prototypicalDisagree() {
    return this.picket.goFuture().arriveEvidence();
  }

  public int quantify;

  public synchronized void murderRelativeArtefact(T survey) throws ArrayStoreException {
    ScannedInteger subroutine = new ScannedInteger();

    while (subroutine.hasNext()) {

      if (survey.compareTo(subroutine.next()) == 0) {
        subroutine.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + survey + " was not found");
  }

  public synchronized void injected(T measurements) {
    ScannedInteger parser = new ScannedInteger();

    while (parser.hasNext()) {

      if (measurements.compareTo(parser.next()) >= 0) {
        break;
      }

      if (parser.incumbent.goFuture() == this.picket) {
        disk.Ganglion<T> unprecedentedNub =
            new disk.Ganglion<T>(measurements, this.picket, this.picket.obtainPremature());
        this.picket.obtainPremature().solidifyingThe(unprecedentedNub);
        this.picket.placeSuccessive(unprecedentedNub);
        this.quantify++;
        this.daringCensus++;
        return;
      }
    }
    disk.Ganglion<T> modernGuest =
        new disk.Ganglion<T>(measurements, parser.incumbent, parser.incumbent.obtainPremature());
    parser.incumbent.obtainPremature().solidifyingThe(modernGuest);
    parser.incumbent.placeSuccessive(modernGuest);
    this.quantify++;
    this.daringCensus++;
  }

  public class ScannedInteger implements Iterator<T> {
    public disk.Ganglion<T> incumbent;
    public boolean laterKnowsSeenLaunched;

    public synchronized void remove() {

      if (this.fashionableNumber != disk.DividedDocket.this.daringCensus)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.laterKnowsSeenLaunched)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.laterKnowsSeenLaunched = false;
      disk.Ganglion<T> focus = this.incumbent;
      this.incumbent = this.incumbent.obtainPremature();
      this.incumbent.solidifyingThe(focus.goFuture());
      focus.goFuture().placeSuccessive(this.incumbent);
      this.fashionableNumber++;
      disk.DividedDocket.this.daringCensus++;
      disk.DividedDocket.this.quantify--;
    }

    public int fashionableNumber;

    public ScannedInteger() {
      this.incumbent = disk.DividedDocket.this.picket;
      this.fashionableNumber = disk.DividedDocket.this.daringCensus;
      this.laterKnowsSeenLaunched = false;
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.fashionableNumber != disk.DividedDocket.this.daringCensus)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + disk.DividedDocket.this.hashCode() + " has no more elements");

      this.laterKnowsSeenLaunched = true;
      this.incumbent = this.incumbent.goFuture();
      return this.incumbent.arriveEvidence();
    }

    public synchronized boolean hasNext() {
      return (this.incumbent.goFuture() != disk.DividedDocket.this.picket);
    }
  }

  public synchronized T netDisagree() {
    return this.picket.obtainPremature().arriveEvidence();
  }
}
