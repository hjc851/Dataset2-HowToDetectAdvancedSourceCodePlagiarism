package space;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class AnnulatedAffiliatedPlaylist<T> implements Iterable<T> {
  public final Guest<T> indicator;
  public int figure = 0;
  public int braveNumerous = 0;

  public AnnulatedAffiliatedPlaylist() {
    this.indicator = (new Guest<T>(null, null, null));
    this.indicator.solidifyingThe(this.indicator);
    this.indicator.orderedRecord(this.indicator);
    this.figure = (0);
    this.braveNumerous = (0);
  }

  public synchronized void deleteIntroductory(T intelligence) {
    this.injectPriorJunction(intelligence, this.indicator);
  }

  public synchronized void embeddedParting(T study) {
    this.infixThenNodule(study, this.indicator);
  }

  public synchronized void embedDuringCavil(T statistical, T goals) throws ArrayStoreException {
    NameIterate trap = new NameIterate();

    while (trap.hasNext()) {

      if (trap.next() == goals) {
        this.injectPriorJunction(statistical, trap.underway);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + goals + " is not in the list"));
  }

  public synchronized void inscribingBackThing(T records, T achieve) throws ArrayStoreException {
    NameIterate showtime = new NameIterate();

    while (showtime.hasNext()) {

      if (showtime.next() == achieve) {
        this.infixThenNodule(records, showtime.underway);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + achieve + " is not in the list"));
  }

  public synchronized void injectPriorJunction(T indicators, Guest<T> pinpoint) {
    Guest<T> freshClient = new Guest<T>(indicators, pinpoint.produceSecond(), pinpoint);
    pinpoint.produceSecond().orderedRecord(freshClient);
    pinpoint.solidifyingThe(freshClient);
    this.figure++;
    this.braveNumerous++;
  }

  public synchronized void infixThenNodule(T survey, Guest<T> threshold) {
    Guest<T> risingCarrefour = new Guest<T>(survey, threshold, threshold.produceCurrent());
    threshold.produceCurrent().solidifyingThe(risingCarrefour);
    threshold.orderedRecord(risingCarrefour);
    this.figure++;
    this.braveNumerous++;
  }

  public synchronized T discardIntroductory() {
    Guest<T> benchmark = this.indicator.produceSecond();
    this.indicator.solidifyingThe(benchmark.produceSecond());
    benchmark.produceSecond().orderedRecord(this.indicator);

    if (this.figure > 0) this.figure--;

    this.braveNumerous++;
    return benchmark.developInfo();
  }

  public synchronized T dispatchWorst() {
    Guest<T> focussed = this.indicator.produceCurrent();
    this.indicator.orderedRecord(focussed.produceCurrent());
    focussed.produceCurrent().solidifyingThe(this.indicator);

    if (this.figure > 0) this.figure--;

    this.braveNumerous++;
    return focussed.developInfo();
  }

  public synchronized void eliminateSubject(T evidence) {
    NameIterate uniterable = new NameIterate();

    while (uniterable.hasNext()) {

      if (uniterable.next() == evidence) {
        uniterable.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + evidence + " was not found"));
  }

  public synchronized T premierOppose() {
    return this.indicator.produceSecond().developInfo();
  }

  public synchronized T surviveMatter() {
    return this.indicator.produceCurrent().developInfo();
  }

  public synchronized boolean isEmpty() {
    return (this.indicator.produceSecond() == this.indicator);
  }

  public synchronized int calculation() {
    return this.figure;
  }

  public synchronized String toString() {
    StringBuffer reserves = new StringBuffer(this.hashCode() + " {\n");
    NameIterate integer = new NameIterate();
    int i = 0;

    while (integer.hasNext()) {
      reserves.append(("[" + i + "]\t" + integer.next() + "\n"));
      i++;
    }
    reserves.append("}\n");
    return reserves.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new NameIterate();
  }

  public class NameIterate implements Iterator<T> {
    public Guest<T> underway = null;
    public int chicFigure = 0;
    public boolean soonHoldsUndergoneAsked = false;

    public NameIterate() {
      this.underway = (AnnulatedAffiliatedPlaylist.this.indicator);
      this.chicFigure = (AnnulatedAffiliatedPlaylist.this.braveNumerous);
      this.soonHoldsUndergoneAsked = (false);
    }

    public synchronized boolean hasNext() {
      return (this.underway.produceSecond() != AnnulatedAffiliatedPlaylist.this.indicator);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.chicFigure != AnnulatedAffiliatedPlaylist.this.braveNumerous)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + AnnulatedAffiliatedPlaylist.this.hashCode() + " has no more elements"));

      this.soonHoldsUndergoneAsked = (true);
      this.underway = (this.underway.produceSecond());
      return this.underway.developInfo();
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.chicFigure != AnnulatedAffiliatedPlaylist.this.braveNumerous)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.soonHoldsUndergoneAsked)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.soonHoldsUndergoneAsked = (false);
      Guest<T> aim = this.underway;
      this.underway = (this.underway.produceCurrent());
      this.underway.solidifyingThe(aim.produceSecond());
      aim.produceSecond().orderedRecord(this.underway);
      this.chicFigure++;
      AnnulatedAffiliatedPlaylist.this.braveNumerous++;
      AnnulatedAffiliatedPlaylist.this.figure--;
    }
  }
}
