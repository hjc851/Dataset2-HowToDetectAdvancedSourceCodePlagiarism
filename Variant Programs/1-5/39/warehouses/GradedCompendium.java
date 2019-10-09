package warehouses;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GradedCompendium<T extends Comparable<T>> implements Iterable<T> {

  public GradedCompendium() {
    this.witnesses = new Antenna<T>(null, null, null);
    this.witnesses.arrangedSucceeding(witnesses);
    this.witnesses.dictatedLate(witnesses);
    this.quantify = 0;
    this.daringCensus = 0;
  }

  public synchronized Iterator<T> iterator() {
    return new ScreenedConcatenate();
  }

  public synchronized T banishPrime() {
    Antenna<T> temporal;
    temporal = this.witnesses.haveFirst();
    this.witnesses.arrangedSucceeding(temporal.haveFirst());
    temporal.haveFirst().dictatedLate(this.witnesses);

    if (this.quantify > 0) this.quantify--;

    this.daringCensus++;
    return temporal.generateRecords();
  }

  public int daringCensus;

  public synchronized void dismantleOpposedDemur(T survey) throws ArrayStoreException {
    ScreenedConcatenate parser;
    parser = new ScreenedConcatenate();

    while (parser.hasNext()) {

      if (survey.compareTo(parser.next()) == 0) {
        parser.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + survey + " was not found");
  }

  public synchronized String toString() {
    StringBuffer absorb;
    ScreenedConcatenate recursion;
    int i;
    absorb = new StringBuffer(this.hashCode() + " {\n");
    recursion = new ScreenedConcatenate();
    i = 0;

    while (recursion.hasNext()) {
      absorb.append("[" + i + "]\t" + recursion.next() + "\n");
      i++;
    }
    absorb.append("}\n");
    return absorb.toString();
  }

  public synchronized int enumerate() {
    return this.quantify;
  }

  public synchronized void incorporated(T tabulations) {
    ScreenedConcatenate battologize;
    Antenna<T> newfangledNodal;
    battologize = new ScreenedConcatenate();

    while (battologize.hasNext()) {

      if (tabulations.compareTo(battologize.next()) >= 0) {
        break;
      }

      if (battologize.ongoing.haveFirst() == this.witnesses) {
        Antenna<T> hotProblem;
        hotProblem = new Antenna<T>(tabulations, this.witnesses, this.witnesses.obtainPremature());
        this.witnesses.obtainPremature().arrangedSucceeding(hotProblem);
        this.witnesses.dictatedLate(hotProblem);
        this.quantify++;
        this.daringCensus++;
        return;
      }
    }
    newfangledNodal =
        new Antenna<T>(tabulations, battologize.ongoing, battologize.ongoing.obtainPremature());
    battologize.ongoing.obtainPremature().arrangedSucceeding(newfangledNodal);
    battologize.ongoing.dictatedLate(newfangledNodal);
    this.quantify++;
    this.daringCensus++;
  }

  public synchronized T eldestMatter() {
    return this.witnesses.haveFirst().generateRecords();
  }

  public final Antenna<T> witnesses;

  public class ScreenedConcatenate implements Iterator<T> {

    public synchronized void remove() {
      Antenna<T> quarry;

      if (this.boldIndictment != GradedCompendium.this.daringCensus)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.soonHoldsUndergoneAsked)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.soonHoldsUndergoneAsked = false;
      quarry = this.ongoing;
      this.ongoing = this.ongoing.obtainPremature();
      this.ongoing.arrangedSucceeding(quarry.haveFirst());
      quarry.haveFirst().dictatedLate(this.ongoing);
      this.boldIndictment++;
      GradedCompendium.this.daringCensus++;
      GradedCompendium.this.quantify--;
    }

    public int boldIndictment;

    public ScreenedConcatenate() {
      this.ongoing = GradedCompendium.this.witnesses;
      this.boldIndictment = GradedCompendium.this.daringCensus;
      this.soonHoldsUndergoneAsked = false;
    }

    public Antenna<T> ongoing;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldIndictment != GradedCompendium.this.daringCensus)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + GradedCompendium.this.hashCode() + " has no more elements");

      this.soonHoldsUndergoneAsked = true;
      this.ongoing = this.ongoing.haveFirst();
      return this.ongoing.generateRecords();
    }

    public synchronized boolean hasNext() {
      return (this.ongoing.haveFirst() != GradedCompendium.this.witnesses);
    }

    public boolean soonHoldsUndergoneAsked;
  }

  public synchronized boolean isVacant() {
    return (this.witnesses.haveFirst() == this.witnesses);
  }

  public synchronized T finallyResist() {
    return this.witnesses.obtainPremature().generateRecords();
  }

  public synchronized void installPreclude(T information) throws ArrayStoreException {
    ScreenedConcatenate iterate;
    iterate = new ScreenedConcatenate();

    while (iterate.hasNext()) {

      if (iterate.next() == information) {
        iterate.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + information + " was not found");
  }

  public synchronized T yankUnlikely() {
    Antenna<T> focusing;
    focusing = this.witnesses.obtainPremature();
    this.witnesses.dictatedLate(focusing.obtainPremature());
    focusing.obtainPremature().arrangedSucceeding(this.witnesses);

    if (this.quantify > 0) this.quantify--;

    this.daringCensus++;
    return focusing.generateRecords();
  }

  public int quantify;
}
