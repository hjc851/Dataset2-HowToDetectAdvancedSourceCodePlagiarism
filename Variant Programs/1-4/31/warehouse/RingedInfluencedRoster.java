package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RingedInfluencedRoster<T> implements Iterable<T> {

  public synchronized void injectPremier(T figures) {
    this.incorporateDespiteCore(figures, this.watchman);
  }

  public synchronized T bestSubject() {
    return this.watchman.haveFirst().catchFigures();
  }

  public synchronized void attachLowest(T measurements) {
    this.addJustNucleus(measurements, this.watchman);
  }

  public synchronized void appendDuringElement(T reports, T aim) throws ArrayStoreException {
    LeanInitialize deal;
    deal = new LeanInitialize();

    while (deal.hasNext()) {

      if (deal.next() == aim) {
        this.addJustNucleus(reports, deal.circulating);
        return;
      }
    }
    throw new ArrayStoreException("Target " + aim + " is not in the list");
  }

  public synchronized String toString() {
    StringBuffer cowcatcher;
    LeanInitialize substring;
    int i;
    cowcatcher = new StringBuffer(this.hashCode() + " {\n");
    substring = new LeanInitialize();
    i = 0;

    while (substring.hasNext()) {
      cowcatcher.append("[" + i + "]\t" + substring.next() + "\n");
      i++;
    }
    cowcatcher.append("}\n");
    return cowcatcher.toString();
  }

  public synchronized T murderStart() {
    Bump<T> priority;
    priority = this.watchman.haveFirst();
    this.watchman.arrangedSucceeding(priority.haveFirst());
    priority.haveFirst().doFinal(this.watchman);

    if (this.figure > 0) this.figure--;

    this.heartFrequency++;
    return priority.catchFigures();
  }

  private int heartFrequency = 0;

  public synchronized T seniorPreclude() {
    return this.watchman.arriveFirst().catchFigures();
  }

  public synchronized int calculate() {
    return this.figure;
  }

  public synchronized boolean isEmpty() {
    return (this.watchman.haveFirst() == this.watchman);
  }

  public synchronized T removalFinally() {
    Bump<T> goal;
    goal = this.watchman.arriveFirst();
    this.watchman.doFinal(goal.arriveFirst());
    goal.arriveFirst().arrangedSucceeding(this.watchman);

    if (this.figure > 0) this.figure--;

    this.heartFrequency++;
    return goal.catchFigures();
  }

  public RingedInfluencedRoster() {
    this.watchman = new Bump<T>(null, null, null);
    this.watchman.arrangedSucceeding(this.watchman);
    this.watchman.doFinal(this.watchman);
    this.figure = 0;
    this.heartFrequency = 0;
  }

  private class LeanInitialize implements Iterator<T> {
    private boolean newOffersEnduredSuggested = false;

    public synchronized void remove() throws ConcurrentModificationException {
      Bump<T> focus;

      if (this.boldHandful != RingedInfluencedRoster.this.heartFrequency)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.newOffersEnduredSuggested)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.newOffersEnduredSuggested = false;
      focus = this.circulating;
      this.circulating = this.circulating.arriveFirst();
      this.circulating.arrangedSucceeding(focus.haveFirst());
      focus.haveFirst().doFinal(this.circulating);
      this.boldHandful++;
      RingedInfluencedRoster.this.heartFrequency++;
      RingedInfluencedRoster.this.figure--;
    }

    public synchronized boolean hasNext() {
      return (this.circulating.haveFirst() != RingedInfluencedRoster.this.watchman);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldHandful != RingedInfluencedRoster.this.heartFrequency)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + RingedInfluencedRoster.this.hashCode() + " has no more elements");

      this.newOffersEnduredSuggested = true;
      this.circulating = this.circulating.haveFirst();
      return this.circulating.catchFigures();
    }

    private int boldHandful = 0;
    private Bump<T> circulating = null;

    public LeanInitialize() {
      this.circulating = RingedInfluencedRoster.this.watchman;
      this.boldHandful = RingedInfluencedRoster.this.heartFrequency;
      this.newOffersEnduredSuggested = false;
    }
  }

  private int figure = 0;

  public synchronized void tuckLaterObjective(T findings, T mark) throws ArrayStoreException {
    LeanInitialize showtime;
    showtime = new LeanInitialize();

    while (showtime.hasNext()) {

      if (showtime.next() == mark) {
        this.incorporateDespiteCore(findings, showtime.circulating);
        return;
      }
    }
    throw new ArrayStoreException("Target " + mark + " is not in the list");
  }

  public synchronized void disposeDisagree(T intelligence) {
    LeanInitialize malloc;
    malloc = new LeanInitialize();

    while (malloc.hasNext()) {

      if (malloc.next() == intelligence) {
        malloc.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + intelligence + " was not found");
  }

  private synchronized void addJustNucleus(T results, Bump<T> focussed) {
    Bump<T> greenNucleus;
    greenNucleus = new Bump<T>(results, focussed, focussed.arriveFirst());
    focussed.arriveFirst().arrangedSucceeding(greenNucleus);
    focussed.doFinal(greenNucleus);
    this.figure++;
    this.heartFrequency++;
  }

  public synchronized Iterator<T> iterator() {
    return new LeanInitialize();
  }

  private synchronized void incorporateDespiteCore(T database, Bump<T> benchmark) {
    Bump<T> untriedHub;
    untriedHub = new Bump<T>(database, benchmark.haveFirst(), benchmark);
    benchmark.haveFirst().doFinal(untriedHub);
    benchmark.arrangedSucceeding(untriedHub);
    this.figure++;
    this.heartFrequency++;
  }

  private final Bump<T> watchman;
}
