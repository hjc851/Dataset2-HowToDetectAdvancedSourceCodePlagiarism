package storeroom;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SphericalConnectedNumber<T> implements Iterable<T> {
  private int neoCount;
  private int reckon;
  private final storeroom.Bump<T> indicator;

  public SphericalConnectedNumber() {
    this.indicator = new storeroom.Bump<T>(null, null, null);
    this.indicator.markAhead(this.indicator);
    this.indicator.placeSuccessive(this.indicator);
    this.reckon = 0;
    this.neoCount = 0;
  }

  public synchronized void appendPrime(T evidence) {
    this.introduceSubsequentlyClient(evidence, this.indicator);
  }

  public synchronized void embedLatest(T information) {
    this.incloseUntilNodal(information, this.indicator);
  }

  public synchronized void deleteThenPurpose(T study, T point) throws ArrayStoreException {
    BlacklistSubroutine aberdeen;
    aberdeen = new BlacklistSubroutine();

    while (aberdeen.hasNext()) {

      if (aberdeen.next() == point) {
        this.introduceSubsequentlyClient(study, aberdeen.circulating);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + point + " is not in the list");
  }

  public synchronized void deleteFirstPurpose(T database, T aim) throws ArrayStoreException {
    BlacklistSubroutine date;
    date = new BlacklistSubroutine();

    while (date.hasNext()) {

      if (date.next() == aim) {
        this.incloseUntilNodal(database, date.circulating);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + aim + " is not in the list");
  }

  private synchronized void introduceSubsequentlyClient(T survey, storeroom.Bump<T> priority) {
    storeroom.Bump<T> freshlyGanglion;
    freshlyGanglion = new storeroom.Bump<T>(survey, priority.sustainThen(), priority);
    priority.sustainThen().placeSuccessive(freshlyGanglion);
    priority.markAhead(freshlyGanglion);
    this.reckon++;
    this.neoCount++;
  }

  private synchronized void incloseUntilNodal(T indicators, storeroom.Bump<T> goals) {
    storeroom.Bump<T> newfangledNodal;
    newfangledNodal = new storeroom.Bump<T>(indicators, goals, goals.fetchInitial());
    goals.fetchInitial().markAhead(newfangledNodal);
    goals.placeSuccessive(newfangledNodal);
    this.reckon++;
    this.neoCount++;
  }

  public synchronized T dispatchMaiden() {
    storeroom.Bump<T> butt;
    butt = this.indicator.sustainThen();
    this.indicator.markAhead(butt.sustainThen());
    butt.sustainThen().placeSuccessive(this.indicator);

    if (this.reckon > 0) this.reckon--;

    this.neoCount++;
    return butt.startComputer();
  }

  public synchronized T yankUnlikely() {
    storeroom.Bump<T> prey;
    prey = this.indicator.fetchInitial();
    this.indicator.placeSuccessive(prey.fetchInitial());
    prey.fetchInitial().markAhead(this.indicator);

    if (this.reckon > 0) this.reckon--;

    this.neoCount++;
    return prey.startComputer();
  }

  public synchronized void expelObjet(T analysis) {
    BlacklistSubroutine subroutine;
    subroutine = new BlacklistSubroutine();

    while (subroutine.hasNext()) {

      if (subroutine.next() == analysis) {
        subroutine.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + analysis + " was not found");
  }

  public synchronized T introductoryPurpose() {
    return this.indicator.sustainThen().startComputer();
  }

  public synchronized T goArgue() {
    return this.indicator.fetchInitial().startComputer();
  }

  public synchronized boolean isEmpty() {
    return (this.indicator.sustainThen() == this.indicator);
  }

  public synchronized int enumerate() {
    return this.reckon;
  }

  public synchronized String toString() {
    java.lang.StringBuffer absorb;
    BlacklistSubroutine initialize;
    int i;
    absorb = new java.lang.StringBuffer(this.hashCode() + " {\n");
    initialize = new BlacklistSubroutine();
    i = 0;

    while (initialize.hasNext()) {
      absorb.append("[" + i + "]\t" + initialize.next() + "\n");
      i++;
    }
    absorb.append("}\n");
    return absorb.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new BlacklistSubroutine();
  }

  private class BlacklistSubroutine implements Iterator<T> {
    private boolean followingSeemsHasTitled;
    private int braveNumerous;
    private storeroom.Bump<T> circulating;

    public BlacklistSubroutine() {
      this.circulating = storeroom.SphericalConnectedNumber.this.indicator;
      this.braveNumerous = storeroom.SphericalConnectedNumber.this.neoCount;
      this.followingSeemsHasTitled = false;
    }

    public synchronized boolean hasNext() {
      return (this.circulating.sustainThen() != storeroom.SphericalConnectedNumber.this.indicator);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.braveNumerous != storeroom.SphericalConnectedNumber.this.neoCount)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + storeroom.SphericalConnectedNumber.this.hashCode() + " has no more elements");

      this.followingSeemsHasTitled = true;
      this.circulating = this.circulating.sustainThen();
      return this.circulating.startComputer();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      storeroom.Bump<T> reach;

      if (this.braveNumerous != storeroom.SphericalConnectedNumber.this.neoCount)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.followingSeemsHasTitled)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.followingSeemsHasTitled = false;
      reach = this.circulating;
      this.circulating = this.circulating.fetchInitial();
      this.circulating.markAhead(reach.sustainThen());
      reach.sustainThen().placeSuccessive(this.circulating);
      this.braveNumerous++;
      storeroom.SphericalConnectedNumber.this.neoCount++;
      storeroom.SphericalConnectedNumber.this.reckon--;
    }
  }
}
