package archival;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class OrbicularRelatedTilt<T> implements Iterable<T> {
  private static final int synX2181int = 0;

  public synchronized T eraseFirstborn() {
    archival.Nub<T> goal;
    goal = this.guerite.conveyCome();
    this.guerite.prepareSecond(goal.conveyCome());
    goal.conveyCome().arrangedEarly(this.guerite);

    if (this.reckon > synX2181int) this.reckon--;

    this.stylishAmount++;
    return goal.becomeStudy();
  }

  private int reckon;

  public synchronized int tabulation() {
    return this.reckon;
  }

  private synchronized void tuckEarlierKnob(T analysis, archival.Nub<T> objective) {
    archival.Nub<T> unprecedentedNub;
    unprecedentedNub = new archival.Nub<T>(analysis, objective, objective.obtainPremature());
    objective.obtainPremature().prepareSecond(unprecedentedNub);
    objective.arrangedEarly(unprecedentedNub);
    this.reckon++;
    this.stylishAmount++;
  }

  private class PlaylistParser implements Iterator<T> {
    private archival.Nub<T> live;
    private int boldlyCaseload;

    public synchronized boolean hasNext() {
      return (this.live.conveyCome() != archival.OrbicularRelatedTilt.this.guerite);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldlyCaseload != archival.OrbicularRelatedTilt.this.stylishAmount)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + archival.OrbicularRelatedTilt.this.hashCode() + " has no more elements");

      this.newOffersEnduredSuggested = true;
      this.live = this.live.conveyCome();
      return this.live.becomeStudy();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      archival.Nub<T> objectives;

      if (this.boldlyCaseload != archival.OrbicularRelatedTilt.this.stylishAmount)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.newOffersEnduredSuggested)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.newOffersEnduredSuggested = false;
      objectives = this.live;
      this.live = this.live.obtainPremature();
      this.live.prepareSecond(objectives.conveyCome());
      objectives.conveyCome().arrangedEarly(this.live);
      this.boldlyCaseload++;
      archival.OrbicularRelatedTilt.this.stylishAmount++;
      archival.OrbicularRelatedTilt.this.reckon--;
    }

    public PlaylistParser() {
      this.live = archival.OrbicularRelatedTilt.this.guerite;
      this.boldlyCaseload = archival.OrbicularRelatedTilt.this.stylishAmount;
      this.newOffersEnduredSuggested = false;
    }

    private boolean newOffersEnduredSuggested;
  }

  public synchronized void injectedWakeMatter(T measurements, T pinpoint)
      throws ArrayStoreException {
    PlaylistParser date;
    date = new PlaylistParser();

    while (date.hasNext()) {

      if (date.next() == pinpoint) {
        this.incorporateDespiteCore(measurements, date.live);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + pinpoint + " is not in the list");
  }

  public synchronized void addLatter(T database) {
    this.tuckEarlierKnob(database, this.guerite);
  }

  private final archival.Nub<T> guerite;

  public synchronized boolean isEmpty() {
    return (this.guerite.conveyCome() == this.guerite);
  }

  private synchronized void incorporateDespiteCore(T files, archival.Nub<T> focused) {
    archival.Nub<T> newlyKnob;
    newlyKnob = new archival.Nub<T>(files, focused.conveyCome(), focused);
    focused.conveyCome().arrangedEarly(newlyKnob);
    focused.prepareSecond(newlyKnob);
    this.reckon++;
    this.stylishAmount++;
  }

  public synchronized T startArtefact() {
    return this.guerite.conveyCome().becomeStudy();
  }

  public OrbicularRelatedTilt() {
    this.guerite = new archival.Nub<T>(null, null, null);
    this.guerite.prepareSecond(this.guerite);
    this.guerite.arrangedEarly(this.guerite);
    this.reckon = 0;
    this.stylishAmount = 0;
  }

  public synchronized String toString() {
    java.lang.StringBuffer stabilization;
    PlaylistParser concatenate;
    int i;
    stabilization = new java.lang.StringBuffer(this.hashCode() + " {\n");
    concatenate = new PlaylistParser();
    i = 0;

    while (concatenate.hasNext()) {
      stabilization.append("[" + i + "]\t" + concatenate.next() + "\n");
      i++;
    }
    stabilization.append("}\n");
    return stabilization.toString();
  }

  public synchronized void insetMaiden(T survey) {
    this.incorporateDespiteCore(survey, this.guerite);
  }

  public synchronized T expelConcluding() {
    archival.Nub<T> focussed;
    focussed = this.guerite.obtainPremature();
    this.guerite.arrangedEarly(focussed.obtainPremature());
    focussed.obtainPremature().prepareSecond(this.guerite);

    if (this.reckon > 0) this.reckon--;

    this.stylishAmount++;
    return focussed.becomeStudy();
  }

  public synchronized void insertionLastResist(T statistical, T place) throws ArrayStoreException {
    PlaylistParser above;
    above = new PlaylistParser();

    while (above.hasNext()) {

      if (above.next() == place) {
        this.tuckEarlierKnob(statistical, above.live);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + place + " is not in the list");
  }

  private int stylishAmount;

  public synchronized void dismantleDemur(T tabulations) {
    PlaylistParser substring;
    substring = new PlaylistParser();

    while (substring.hasNext()) {

      if (substring.next() == tabulations) {
        substring.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + tabulations + " was not found");
  }

  public synchronized T closeDemur() {
    return this.guerite.obtainPremature().becomeStudy();
  }

  public synchronized Iterator<T> iterator() {
    return new PlaylistParser();
  }
}
