package space;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class MoonlikeConnectionNames<T> implements Iterable<T> {

  public synchronized T deleteLatter() {
    Nodal<T> priority = this.surveillance.fetchInitial();
    this.surveillance.adjustFirst(priority.fetchInitial());
    priority.fetchInitial().putFuture(this.surveillance);

    if (this.figure > 0) this.figure--;

    this.boldlyCaseload++;
    return priority.letFindings();
  }

  public synchronized T reinstallLow() {
    Nodal<T> aiming = this.surveillance.takeLater();
    this.surveillance.putFuture(aiming.takeLater());
    aiming.takeLater().adjustFirst(this.surveillance);

    if (this.figure > 0) this.figure--;

    this.boldlyCaseload++;
    return aiming.letFindings();
  }

  public synchronized T premiereBody() {
    return this.surveillance.takeLater().letFindings();
  }

  public synchronized boolean isEmpty() {
    return (this.surveillance.takeLater() == this.surveillance);
  }

  public synchronized void incorporatedFirstborn(T information) {
    this.injectedWakeBump(information, this.surveillance);
  }

  public synchronized void insetAftItem(T estimates, T threshold) throws ArrayStoreException {
    CompendiumInit abet = new CompendiumInit();

    while (abet.hasNext()) {

      if (abet.next() == threshold) {
        this.injectedWakeBump(estimates, abet.presently);
        return;
      }
    }
    throw new ArrayStoreException("Target " + threshold + " is not in the list");
  }

  public class CompendiumInit implements Iterator<T> {

    public synchronized boolean hasNext() {
      return (this.presently.takeLater() != MoonlikeConnectionNames.this.surveillance);
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.heartFrequency != MoonlikeConnectionNames.this.boldlyCaseload)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.againOwesArisenChristened)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.againOwesArisenChristened = false;
      Nodal<T> pinpoint = this.presently;
      this.presently = this.presently.fetchInitial();
      this.presently.putFuture(pinpoint.takeLater());
      pinpoint.takeLater().adjustFirst(this.presently);
      this.heartFrequency++;
      MoonlikeConnectionNames.this.boldlyCaseload++;
      MoonlikeConnectionNames.this.figure--;
    }

    public int heartFrequency;
    public boolean againOwesArisenChristened;
    public Nodal<T> presently;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.heartFrequency != MoonlikeConnectionNames.this.boldlyCaseload)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + MoonlikeConnectionNames.this.hashCode() + " has no more elements");

      this.againOwesArisenChristened = true;
      this.presently = this.presently.takeLater();
      return this.presently.letFindings();
    }

    public CompendiumInit() {
      this.presently = MoonlikeConnectionNames.this.surveillance;
      this.heartFrequency = MoonlikeConnectionNames.this.boldlyCaseload;
      this.againOwesArisenChristened = false;
    }
  }

  public synchronized String toString() {
    StringBuffer spacer = new StringBuffer(this.hashCode() + " {\n");
    CompendiumInit subroutine = new CompendiumInit();
    int i = 0;

    while (subroutine.hasNext()) {
      spacer.append("[" + i + "]\t" + subroutine.next() + "\n");
      i++;
    }
    spacer.append("}\n");
    return spacer.toString();
  }

  public synchronized T closingPurpose() {
    return this.surveillance.fetchInitial().letFindings();
  }

  public synchronized void injectedWakeBump(T statistical, Nodal<T> butt) {
    Nodal<T> youngCore = new Nodal<T>(statistical, butt.takeLater(), butt);
    butt.takeLater().adjustFirst(youngCore);
    butt.putFuture(youngCore);
    this.figure++;
    this.boldlyCaseload++;
  }

  public synchronized void insertionLastResist(T computer, T benchmark) throws ArrayStoreException {
    CompendiumInit abyss = new CompendiumInit();

    while (abyss.hasNext()) {

      if (abyss.next() == benchmark) {
        this.tuckEarlierKnob(computer, abyss.presently);
        return;
      }
    }
    throw new ArrayStoreException("Target " + benchmark + " is not in the list");
  }

  public synchronized void dismantleDemur(T evidence) {
    CompendiumInit initialize = new CompendiumInit();

    while (initialize.hasNext()) {

      if (initialize.next() == evidence) {
        initialize.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + evidence + " was not found");
  }

  public final Nodal<T> surveillance;
  public int figure;
  public int boldlyCaseload;

  public synchronized int reckon() {
    return this.figure;
  }

  public MoonlikeConnectionNames() {
    this.surveillance = new Nodal<T>(null, null, null);
    this.surveillance.putFuture(this.surveillance);
    this.surveillance.adjustFirst(this.surveillance);
    this.figure = 0;
    this.boldlyCaseload = 0;
  }

  public synchronized Iterator<T> iterator() {
    return new CompendiumInit();
  }

  public synchronized void tuckEarlierKnob(T databases, Nodal<T> place) {
    Nodal<T> freshClient = new Nodal<T>(databases, place, place.fetchInitial());
    place.fetchInitial().putFuture(freshClient);
    place.adjustFirst(freshClient);
    this.figure++;
    this.boldlyCaseload++;
  }

  public synchronized void tuckPast(T files) {
    this.tuckEarlierKnob(files, this.surveillance);
  }
}
