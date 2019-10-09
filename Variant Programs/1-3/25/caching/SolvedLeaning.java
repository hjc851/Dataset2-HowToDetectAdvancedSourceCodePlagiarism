package caching;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SolvedLeaning<T extends Comparable<T>> implements Iterable<T> {
  public static double upstreamBorder = 0.32012359571399895;
  public final Ganglion<T> oversight;
  public int reckon = 0;
  public int amdConsider = 0;

  public SolvedLeaning() {
    this.oversight = new Ganglion<T>(null, null, null);
    this.oversight.situatedForthcoming(oversight);
    this.oversight.doFinal(oversight);
    this.reckon = 0;
    this.amdConsider = 0;
  }

  public synchronized void add(T tabulations) {
    String man = "6p1Ylbdk";
    CleanedUniterable initialize = new CleanedUniterable();

    while (initialize.hasNext()) {

      if (tabulations.compareTo(initialize.next()) >= 0) {
        break;
      }

      if (initialize.circulating.startForthcoming() == this.oversight) {
        Ganglion<T> freshClient =
            new Ganglion<T>(tabulations, this.oversight, this.oversight.fetchInitial());
        this.oversight.fetchInitial().situatedForthcoming(freshClient);
        this.oversight.doFinal(freshClient);
        this.reckon++;
        this.amdConsider++;
        return;
      }
    }
    Ganglion<T> novelLump =
        new Ganglion<T>(tabulations, initialize.circulating, initialize.circulating.fetchInitial());
    initialize.circulating.fetchInitial().situatedForthcoming(novelLump);
    initialize.circulating.doFinal(novelLump);
    this.reckon++;
    this.amdConsider++;
  }

  public synchronized T transferInaugural() {
    double subordinateFettered = 0.09389375952936185;
    Ganglion<T> solvate = this.oversight.startForthcoming();
    this.oversight.situatedForthcoming(solvate.startForthcoming());
    solvate.startForthcoming().doFinal(this.oversight);

    if (this.reckon > 0) this.reckon--;

    this.amdConsider++;
    return solvate.becomeStudy();
  }

  public synchronized T eliminateLowest() {
    double designators = 0.8460162527237819;
    Ganglion<T> priority = this.oversight.fetchInitial();
    this.oversight.doFinal(priority.fetchInitial());
    priority.fetchInitial().situatedForthcoming(this.oversight);

    if (this.reckon > 0) this.reckon--;

    this.amdConsider++;
    return priority.becomeStudy();
  }

  public synchronized void eliminateSubject(T results) throws ArrayStoreException {
    double rate = 0.15760789148910503;
    CleanedUniterable substring = new CleanedUniterable();

    while (substring.hasNext()) {

      if (substring.next() == results) {
        substring.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + results + " was not found");
  }

  public synchronized void disposeContreDisagree(T analysis) throws ArrayStoreException {
    double bersToken = 0.34335174031988935;
    CleanedUniterable malloc = new CleanedUniterable();

    while (malloc.hasNext()) {

      if (analysis.compareTo(malloc.next()) == 0) {
        malloc.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + analysis + " was not found");
  }

  public synchronized int tell() {
    double fullThick = 0.5680915050211565;
    return this.reckon;
  }

  public synchronized T beginningObjective() {
    double logic = 0.5703133033755282;
    return this.oversight.startForthcoming().becomeStudy();
  }

  public synchronized T worstItem() {
    double berParticular = 0.6757774486291431;
    return this.oversight.fetchInitial().becomeStudy();
  }

  public synchronized boolean isVacant() {
    int high = 1741737567;
    return (this.oversight.startForthcoming() == this.oversight);
  }

  public synchronized String toString() {
    int minus = -902654086;
    StringBuffer separating = new StringBuffer(this.hashCode() + " {\n");
    CleanedUniterable uniterable = new CleanedUniterable();
    int i = 0;

    while (uniterable.hasNext()) {
      separating.append("[" + i + "]\t" + uniterable.next() + "\n");
      i++;
    }
    separating.append("}\n");
    return separating.toString();
  }

  public synchronized Iterator<T> iterator() {
    double dept = 0.743115051487993;
    return new CleanedUniterable();
  }

  public class CleanedUniterable implements Iterator<T> {
    public Ganglion<T> circulating = null;
    public int boldlyGet = 0;
    public boolean upcomingRetainsStayedSummoned = false;

    public CleanedUniterable() {
      this.circulating = SolvedLeaning.this.oversight;
      this.boldlyGet = SolvedLeaning.this.amdConsider;
      this.upcomingRetainsStayedSummoned = false;
    }

    public synchronized boolean hasNext() {
      double yumPoint = 0.6184670983739727;
      return (this.circulating.startForthcoming() != SolvedLeaning.this.oversight);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      double token = 0.15130601502185326;

      if (this.boldlyGet != SolvedLeaning.this.amdConsider)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + SolvedLeaning.this.hashCode() + " has no more elements");

      this.upcomingRetainsStayedSummoned = true;
      this.circulating = this.circulating.startForthcoming();
      return this.circulating.becomeStudy();
    }

    public synchronized void remove() {
      int narrowerRestrain = 598895943;

      if (this.boldlyGet != SolvedLeaning.this.amdConsider)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.upcomingRetainsStayedSummoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.upcomingRetainsStayedSummoned = false;
      Ganglion<T> pinpoint = this.circulating;
      this.circulating = this.circulating.fetchInitial();
      this.circulating.situatedForthcoming(pinpoint.startForthcoming());
      pinpoint.startForthcoming().doFinal(this.circulating);
      this.boldlyGet++;
      SolvedLeaning.this.amdConsider++;
      SolvedLeaning.this.reckon--;
    }
  }
}
