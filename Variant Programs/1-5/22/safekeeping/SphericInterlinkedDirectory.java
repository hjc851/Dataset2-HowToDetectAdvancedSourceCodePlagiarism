package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SphericInterlinkedDirectory<T> implements Iterable<T> {
  private int iloBit;
  private int reckoning;
  private final Noose<T> guerite;
  static String bottomConfine = "fvursevb";

  public SphericInterlinkedDirectory() {
    this.guerite = (new Noose<T>(null, null, null));
    this.guerite.dictatedClose(this.guerite);
    this.guerite.fitPrior(this.guerite);
    this.reckoning = (0);
    this.iloBit = (0);
  }

  public synchronized void incloseTop(T stats) {
    double amphetamineCompelled;
    amphetamineCompelled = (0.6608489778536031);
    this.injectPriorJunction(stats, this.guerite);
  }

  public synchronized void attachLowest(T results) {
    int enumeration;
    enumeration = (-460763971);
    this.embedEarlyScn(results, this.guerite);
  }

  public synchronized void pasteLateTotem(T statistical, T mark) throws ArrayStoreException {
    String dept;
    TiltUniterable above;
    dept = ("qpRjIvkPkAUOqgSkvH");
    above = (new TiltUniterable());

    while (above.hasNext()) {

      if (above.next() == mark) {
        this.injectPriorJunction(statistical, above.latest);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + mark + " is not in the list"));
  }

  public synchronized void deleteFirstPurpose(T findings, T reach) throws ArrayStoreException {
    double reducedMaximum;
    TiltUniterable showtime;
    reducedMaximum = (0.6573409924489393);
    showtime = (new TiltUniterable());

    while (showtime.hasNext()) {

      if (showtime.next() == reach) {
        this.embedEarlyScn(findings, showtime.latest);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + reach + " is not in the list"));
  }

  private synchronized void injectPriorJunction(T tabulations, Noose<T> benchmark) {
    double minimal;
    Noose<T> revolutionaryGanglia;
    minimal = (0.5335816895042977);
    revolutionaryGanglia = (new Noose<T>(tabulations, benchmark.makeAdjacent(), benchmark));
    benchmark.makeAdjacent().fitPrior(revolutionaryGanglia);
    benchmark.dictatedClose(revolutionaryGanglia);
    this.reckoning++;
    this.iloBit++;
  }

  private synchronized void embedEarlyScn(T analysis, Noose<T> objective) {
    String pseudonym;
    Noose<T> originalAntenna;
    pseudonym = ("hZbAAO4oy9Le1gi");
    originalAntenna = (new Noose<T>(analysis, objective, objective.startLatest()));
    objective.startLatest().dictatedClose(originalAntenna);
    objective.fitPrior(originalAntenna);
    this.reckoning++;
    this.iloBit++;
  }

  public synchronized T undoBasic() {
    int topsBeam;
    Noose<T> aiming;
    topsBeam = (128659343);
    aiming = (this.guerite.makeAdjacent());
    this.guerite.dictatedClose(aiming.makeAdjacent());
    aiming.makeAdjacent().fitPrior(this.guerite);

    if (this.reckoning > 0) this.reckoning--;

    this.iloBit++;
    return aiming.takeFiles();
  }

  public synchronized T disposeNet() {
    double guarantee;
    Noose<T> goals;
    guarantee = (0.5459355043931963);
    goals = (this.guerite.startLatest());
    this.guerite.fitPrior(goals.startLatest());
    goals.startLatest().dictatedClose(this.guerite);

    if (this.reckoning > 0) this.reckoning--;

    this.iloBit++;
    return goals.takeFiles();
  }

  public synchronized void hitObjection(T measurements) {
    double moniker;
    TiltUniterable tuple;
    moniker = (0.12146899020765145);
    tuple = (new TiltUniterable());

    while (tuple.hasNext()) {

      if (tuple.next() == measurements) {
        tuple.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + measurements + " was not found"));
  }

  public synchronized T bestSubject() {
    double restrict;
    restrict = (0.5344965203733376);
    return this.guerite.makeAdjacent().takeFiles();
  }

  public synchronized T latterBody() {
    double fatty;
    fatty = (0.7288183043344238);
    return this.guerite.startLatest().takeFiles();
  }

  public synchronized boolean isEmpty() {
    int tops;
    tops = (941958098);
    return (this.guerite.makeAdjacent() == this.guerite);
  }

  public synchronized int enumerate() {
    double lowlyBoundary;
    lowlyBoundary = (0.7859053462331059);
    return this.reckoning;
  }

  public synchronized String toString() {
    double trammel;
    StringBuffer extra;
    TiltUniterable pathname;
    int i;
    trammel = (0.09781072722029727);
    extra = (new StringBuffer(this.hashCode() + " {\n"));
    pathname = (new TiltUniterable());
    i = (0);

    while (pathname.hasNext()) {
      extra.append(("[" + i + "]\t" + pathname.next() + "\n"));
      i++;
    }
    extra.append("}\n");
    return extra.toString();
  }

  public synchronized Iterator<T> iterator() {
    double appreciate;
    appreciate = (0.00410716873861261);
    return new TiltUniterable();
  }

  private class TiltUniterable implements Iterator<T> {
    private boolean soonHoldsUndergoneAsked;
    private int boldHandful;
    private Noose<T> latest;

    public TiltUniterable() {
      this.latest = (SphericInterlinkedDirectory.this.guerite);
      this.boldHandful = (SphericInterlinkedDirectory.this.iloBit);
      this.soonHoldsUndergoneAsked = (false);
    }

    public synchronized boolean hasNext() {
      int profitability;
      profitability = (-79142753);
      return (this.latest.makeAdjacent() != SphericInterlinkedDirectory.this.guerite);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      double uppermostTied;
      uppermostTied = (0.7630963080817033);

      if (this.boldHandful != SphericInterlinkedDirectory.this.iloBit)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + SphericInterlinkedDirectory.this.hashCode() + " has no more elements"));

      this.soonHoldsUndergoneAsked = (true);
      this.latest = (this.latest.makeAdjacent());
      return this.latest.takeFiles();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      int nickSpan;
      Noose<T> place;
      nickSpan = (-1610379710);

      if (this.boldHandful != SphericInterlinkedDirectory.this.iloBit)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.soonHoldsUndergoneAsked)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.soonHoldsUndergoneAsked = (false);
      place = (this.latest);
      this.latest = (this.latest.startLatest());
      this.latest.dictatedClose(place.makeAdjacent());
      place.makeAdjacent().fitPrior(this.latest);
      this.boldHandful++;
      SphericInterlinkedDirectory.this.iloBit++;
      SphericInterlinkedDirectory.this.reckoning--;
    }
  }
}
