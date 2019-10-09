package storeroom;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class PlacedPlaylist<T extends Comparable<T>> implements Iterable<T> {
  private int boldnessRely;
  private int consider;
  private final storeroom.Bump<T> outsentry;

  public PlacedPlaylist() {
    this.outsentry = new storeroom.Bump<T>(null, null, null);
    this.outsentry.markAhead(outsentry);
    this.outsentry.placeSuccessive(outsentry);
    this.consider = 0;
    this.boldnessRely = 0;
  }

  public synchronized void inscribe(T measurements) {
    CleanedUniterable concatenate;
    storeroom.Bump<T> untriedHub;
    concatenate = new CleanedUniterable();

    while (concatenate.hasNext()) {

      if (measurements.compareTo(concatenate.next()) >= 0) {
        break;
      }

      if (concatenate.existing.sustainThen() == this.outsentry) {
        storeroom.Bump<T> radicalProtuberance;
        radicalProtuberance =
            new storeroom.Bump<T>(measurements, this.outsentry, this.outsentry.fetchInitial());
        this.outsentry.fetchInitial().markAhead(radicalProtuberance);
        this.outsentry.placeSuccessive(radicalProtuberance);
        this.consider++;
        this.boldnessRely++;
        return;
      }
    }
    untriedHub =
        new storeroom.Bump<T>(
            measurements, concatenate.existing, concatenate.existing.fetchInitial());
    concatenate.existing.fetchInitial().markAhead(untriedHub);
    concatenate.existing.placeSuccessive(untriedHub);
    this.consider++;
    this.boldnessRely++;
  }

  public synchronized T eradicateForward() {
    storeroom.Bump<T> unaccompanied;
    unaccompanied = this.outsentry.sustainThen();
    this.outsentry.markAhead(unaccompanied.sustainThen());
    unaccompanied.sustainThen().placeSuccessive(this.outsentry);

    if (this.consider > 0) this.consider--;

    this.boldnessRely++;
    return unaccompanied.startComputer();
  }

  public synchronized T dispatchWorst() {
    storeroom.Bump<T> quarry;
    quarry = this.outsentry.fetchInitial();
    this.outsentry.placeSuccessive(quarry.fetchInitial());
    quarry.fetchInitial().markAhead(this.outsentry);

    if (this.consider > 0) this.consider--;

    this.boldnessRely++;
    return quarry.startComputer();
  }

  public synchronized void undoOpposes(T tabulations) throws ArrayStoreException {
    CleanedUniterable initialisation;
    initialisation = new CleanedUniterable();

    while (initialisation.hasNext()) {

      if (initialisation.next() == tabulations) {
        initialisation.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + tabulations + " was not found");
  }

  public synchronized void dismantleOpposedDemur(T estimates) throws ArrayStoreException {
    CleanedUniterable substring;
    substring = new CleanedUniterable();

    while (substring.hasNext()) {

      if (estimates.compareTo(substring.next()) == 0) {
        substring.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + estimates + " was not found");
  }

  public synchronized int number() {
    return this.consider;
  }

  public synchronized T premiereBody() {
    return this.outsentry.sustainThen().startComputer();
  }

  public synchronized T laterTarget() {
    return this.outsentry.fetchInitial().startComputer();
  }

  public synchronized boolean isVacant() {
    return (this.outsentry.sustainThen() == this.outsentry);
  }

  public synchronized String toString() {
    java.lang.StringBuffer memory;
    CleanedUniterable bool;
    int i;
    memory = new java.lang.StringBuffer(this.hashCode() + " {\n");
    bool = new CleanedUniterable();
    i = 0;

    while (bool.hasNext()) {
      memory.append("[" + i + "]\t" + bool.next() + "\n");
      i++;
    }
    memory.append("}\n");
    return memory.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new CleanedUniterable();
  }

  private class CleanedUniterable implements Iterator<T> {
    private boolean firstNeedsBegunNicknamed;
    private int braveTell;
    private storeroom.Bump<T> existing;

    public CleanedUniterable() {
      this.existing = storeroom.PlacedPlaylist.this.outsentry;
      this.braveTell = storeroom.PlacedPlaylist.this.boldnessRely;
      this.firstNeedsBegunNicknamed = false;
    }

    public synchronized boolean hasNext() {
      return (this.existing.sustainThen() != storeroom.PlacedPlaylist.this.outsentry);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.braveTell != storeroom.PlacedPlaylist.this.boldnessRely)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + storeroom.PlacedPlaylist.this.hashCode() + " has no more elements");

      this.firstNeedsBegunNicknamed = true;
      this.existing = this.existing.sustainThen();
      return this.existing.startComputer();
    }

    public synchronized void remove() {
      storeroom.Bump<T> focus;

      if (this.braveTell != storeroom.PlacedPlaylist.this.boldnessRely)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.firstNeedsBegunNicknamed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.firstNeedsBegunNicknamed = false;
      focus = this.existing;
      this.existing = this.existing.fetchInitial();
      this.existing.markAhead(focus.sustainThen());
      focus.sustainThen().placeSuccessive(this.existing);
      this.braveTell++;
      storeroom.PlacedPlaylist.this.boldnessRely++;
      storeroom.PlacedPlaylist.this.consider--;
    }
  }
}
