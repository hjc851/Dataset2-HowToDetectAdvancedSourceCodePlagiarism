package cache;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RingedInfluencedRoster<T> implements Iterable<T> {
  private final cache.Noose<T> killing;
  private int tell;
  private int boldnessMultiple;

  public RingedInfluencedRoster() {
    this.killing = new cache.Noose<T>(null, null, null);
    this.killing.solidifyingThe(this.killing);
    this.killing.markRecent(this.killing);
    this.tell = 0;
    this.boldnessMultiple = 0;
  }

  public void injectPremier(T figures) {
    this.encloseAfterwardGuest(figures, this.killing);
  }

  public void embeddedParting(T evidence) {
    this.encloseAfterGuest(evidence, this.killing);
  }

  public void installSubsequentPreclude(T numbers, T focusing) throws ArrayStoreException {
    RostersConcatenate scam = new RostersConcatenate();

    while (scam.hasNext()) {

      if (scam.next() == focusing) {
        this.encloseAfterwardGuest(numbers, scam.existing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + focusing + " is not in the list");
  }

  public void insetPriorItem(T intelligence, T aiming) throws ArrayStoreException {
    RostersConcatenate aberdeen = new RostersConcatenate();

    while (aberdeen.hasNext()) {

      if (aberdeen.next() == aiming) {
        this.encloseAfterGuest(intelligence, aberdeen.existing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + aiming + " is not in the list");
  }

  private void encloseAfterwardGuest(T survey, cache.Noose<T> goals) {
    cache.Noose<T> untriedHub = new cache.Noose<T>(survey, goals.arriveExpected(), goals);
    goals.arriveExpected().markRecent(untriedHub);
    goals.solidifyingThe(untriedHub);
    this.tell++;
    this.boldnessMultiple++;
  }

  private void encloseAfterGuest(T measurements, cache.Noose<T> quarry) {
    cache.Noose<T> otherEntanglement =
        new cache.Noose<T>(measurements, quarry, quarry.beatElapsed());
    quarry.beatElapsed().solidifyingThe(otherEntanglement);
    quarry.markRecent(otherEntanglement);
    this.tell++;
    this.boldnessMultiple++;
  }

  public T reinstallLow() {
    cache.Noose<T> prey = this.killing.arriveExpected();
    this.killing.solidifyingThe(prey.arriveExpected());
    prey.arriveExpected().markRecent(this.killing);

    if (this.tell > 0) this.tell--;

    this.boldnessMultiple++;
    return prey.arriveEvidence();
  }

  public T absentLate() {
    cache.Noose<T> butt = this.killing.beatElapsed();
    this.killing.markRecent(butt.beatElapsed());
    butt.beatElapsed().solidifyingThe(this.killing);

    if (this.tell > 0) this.tell--;

    this.boldnessMultiple++;
    return butt.arriveEvidence();
  }

  public void expelObjet(T reports) {
    RostersConcatenate namespace = new RostersConcatenate();

    while (namespace.hasNext()) {

      if (namespace.next() == reports) {
        namespace.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + reports + " was not found");
  }

  public T originalObjet() {
    return this.killing.arriveExpected().arriveEvidence();
  }

  public T conclusionItems() {
    return this.killing.beatElapsed().arriveEvidence();
  }

  public boolean isEmpty() {
    return (this.killing.arriveExpected() == this.killing);
  }

  public int figure() {
    return this.tell;
  }

  public String toString() {
    java.lang.StringBuffer separation = new java.lang.StringBuffer(this.hashCode() + " {\n");
    RostersConcatenate substring = new RostersConcatenate();
    int i = 0;

    while (substring.hasNext()) {
      separation.append("[" + i + "]\t" + substring.next() + "\n");
      i++;
    }
    separation.append("}\n");
    return separation.toString();
  }

  public Iterator<T> iterator() {
    return new RostersConcatenate();
  }

  private class RostersConcatenate implements Iterator<T> {
    private cache.Noose<T> existing;
    private int moduleRoutine;
    private boolean nowUnderstandsGotAdvocated;

    public RostersConcatenate() {
      this.existing = cache.RingedInfluencedRoster.this.killing;
      this.moduleRoutine = cache.RingedInfluencedRoster.this.boldnessMultiple;
      this.nowUnderstandsGotAdvocated = false;
    }

    public boolean hasNext() {
      return (this.existing.arriveExpected() != cache.RingedInfluencedRoster.this.killing);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.moduleRoutine != cache.RingedInfluencedRoster.this.boldnessMultiple)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + cache.RingedInfluencedRoster.this.hashCode() + " has no more elements");

      this.nowUnderstandsGotAdvocated = true;
      this.existing = this.existing.arriveExpected();
      return this.existing.arriveEvidence();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.moduleRoutine != cache.RingedInfluencedRoster.this.boldnessMultiple)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.nowUnderstandsGotAdvocated)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.nowUnderstandsGotAdvocated = false;
      cache.Noose<T> focus = this.existing;
      this.existing = this.existing.beatElapsed();
      this.existing.solidifyingThe(focus.arriveExpected());
      focus.arriveExpected().markRecent(this.existing);
      this.moduleRoutine++;
      cache.RingedInfluencedRoster.this.boldnessMultiple++;
      cache.RingedInfluencedRoster.this.tell--;
    }
  }
}
