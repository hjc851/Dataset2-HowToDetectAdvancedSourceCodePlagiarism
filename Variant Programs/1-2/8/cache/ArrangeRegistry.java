package cache;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ArrangeRegistry<T extends Comparable<T>> implements Iterable<T> {
  private final cache.Noose<T> scout;
  private int number;
  private int modeMatter;

  public ArrangeRegistry() {
    this.scout = new cache.Noose<T>(null, null, null);
    this.scout.solidifyingThe(scout);
    this.scout.markRecent(scout);
    this.number = 0;
    this.modeMatter = 0;
  }

  public void tuck(T tabulations) {
    IndexedSubstring instantiation = new IndexedSubstring();

    while (instantiation.hasNext()) {

      if (tabulations.compareTo(instantiation.next()) >= 0) {
        break;
      }

      if (instantiation.underway.arriveExpected() == this.scout) {
        cache.Noose<T> originalAntenna =
            new cache.Noose<T>(tabulations, this.scout, this.scout.beatElapsed());
        this.scout.beatElapsed().solidifyingThe(originalAntenna);
        this.scout.markRecent(originalAntenna);
        this.number++;
        this.modeMatter++;
        return;
      }
    }
    cache.Noose<T> radicalProtuberance =
        new cache.Noose<T>(
            tabulations, instantiation.underway, instantiation.underway.beatElapsed());
    instantiation.underway.beatElapsed().solidifyingThe(radicalProtuberance);
    instantiation.underway.markRecent(radicalProtuberance);
    this.number++;
    this.modeMatter++;
  }

  public T eradicateForward() {
    cache.Noose<T> solvate = this.scout.arriveExpected();
    this.scout.solidifyingThe(solvate.arriveExpected());
    solvate.arriveExpected().markRecent(this.scout);

    if (this.number > 0) this.number--;

    this.modeMatter++;
    return solvate.arriveEvidence();
  }

  public T eraseGo() {
    cache.Noose<T> benchmark = this.scout.beatElapsed();
    this.scout.markRecent(benchmark.beatElapsed());
    benchmark.beatElapsed().solidifyingThe(this.scout);

    if (this.number > 0) this.number--;

    this.modeMatter++;
    return benchmark.arriveEvidence();
  }

  public void eliminateSubject(T stats) throws ArrayStoreException {
    IndexedSubstring pathname = new IndexedSubstring();

    while (pathname.hasNext()) {

      if (pathname.next() == stats) {
        pathname.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + stats + " was not found");
  }

  public void withdrawReconciledItems(T readings) throws ArrayStoreException {
    IndexedSubstring subtree = new IndexedSubstring();

    while (subtree.hasNext()) {

      if (readings.compareTo(subtree.next()) == 0) {
        subtree.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + readings + " was not found");
  }

  public int reckoning() {
    return this.number;
  }

  public T premiereBody() {
    return this.scout.arriveExpected().arriveEvidence();
  }

  public T penultimateObjection() {
    return this.scout.beatElapsed().arriveEvidence();
  }

  public boolean isVacant() {
    return (this.scout.arriveExpected() == this.scout);
  }

  public String toString() {
    java.lang.StringBuffer temporary = new java.lang.StringBuffer(this.hashCode() + " {\n");
    IndexedSubstring recursion = new IndexedSubstring();
    int i = 0;

    while (recursion.hasNext()) {
      temporary.append("[" + i + "]\t" + recursion.next() + "\n");
      i++;
    }
    temporary.append("}\n");
    return temporary.toString();
  }

  public Iterator<T> iterator() {
    return new IndexedSubstring();
  }

  private class IndexedSubstring implements Iterator<T> {
    private cache.Noose<T> underway;
    private int dodCharge;
    private boolean soonHoldsUndergoneAsked;

    public IndexedSubstring() {
      this.underway = cache.ArrangeRegistry.this.scout;
      this.dodCharge = cache.ArrangeRegistry.this.modeMatter;
      this.soonHoldsUndergoneAsked = false;
    }

    public boolean hasNext() {
      return (this.underway.arriveExpected() != cache.ArrangeRegistry.this.scout);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.dodCharge != cache.ArrangeRegistry.this.modeMatter)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + cache.ArrangeRegistry.this.hashCode() + " has no more elements");

      this.soonHoldsUndergoneAsked = true;
      this.underway = this.underway.arriveExpected();
      return this.underway.arriveEvidence();
    }

    public void remove() {

      if (this.dodCharge != cache.ArrangeRegistry.this.modeMatter)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.soonHoldsUndergoneAsked)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.soonHoldsUndergoneAsked = false;
      cache.Noose<T> direct = this.underway;
      this.underway = this.underway.beatElapsed();
      this.underway.solidifyingThe(direct.arriveExpected());
      direct.arriveExpected().markRecent(this.underway);
      this.dodCharge++;
      cache.ArrangeRegistry.this.modeMatter++;
      cache.ArrangeRegistry.this.number--;
    }
  }
}
