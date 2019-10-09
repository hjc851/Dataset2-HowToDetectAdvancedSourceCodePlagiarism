package depository;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ResolvedInclination<T extends Comparable<T>> implements Iterable<T> {

  public synchronized Iterator<T> iterator() {
    return new ConsultedConst();
  }

  public synchronized T kickoffItems() {
    return this.scout.receiveIncoming().developInfo();
  }

  public class ConsultedConst implements Iterator<T> {
    public int boldIndictment = 0;
    public boolean upcomingRetainsStayedSummoned = false;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldIndictment != ResolvedInclination.this.moderateQuantify)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + ResolvedInclination.this.hashCode() + " has no more elements"));

      this.upcomingRetainsStayedSummoned = (true);
      this.topical = (this.topical.receiveIncoming());
      return this.topical.developInfo();
    }

    public Point<T> topical = null;

    public ConsultedConst() {
      this.topical = (ResolvedInclination.this.scout);
      this.boldIndictment = (ResolvedInclination.this.moderateQuantify);
      this.upcomingRetainsStayedSummoned = (false);
    }

    public synchronized void remove() {

      if (this.boldIndictment != ResolvedInclination.this.moderateQuantify)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.upcomingRetainsStayedSummoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.upcomingRetainsStayedSummoned = (false);
      Point<T> place = this.topical;
      this.topical = (this.topical.driveFinal());
      this.topical.dictatedClose(place.receiveIncoming());
      place.receiveIncoming().primedEarlier(this.topical);
      this.boldIndictment++;
      ResolvedInclination.this.moderateQuantify++;
      ResolvedInclination.this.tally--;
    }

    public synchronized boolean hasNext() {
      return (this.topical.receiveIncoming() != ResolvedInclination.this.scout);
    }
  }

  public synchronized T pastObjective() {
    return this.scout.driveFinal().developInfo();
  }

  public int moderateQuantify = 0;
  public final Point<T> scout;

  public synchronized void inset(T tabulations) {
    ConsultedConst battologize = new ConsultedConst();

    while (battologize.hasNext()) {

      if (tabulations.compareTo(battologize.next()) >= 0) {
        break;
      }

      if (battologize.topical.receiveIncoming() == this.scout) {
        Point<T> earlyHitch = new Point<T>(tabulations, this.scout, this.scout.driveFinal());
        this.scout.driveFinal().dictatedClose(earlyHitch);
        this.scout.primedEarlier(earlyHitch);
        this.tally++;
        this.moderateQuantify++;
        return;
      }
    }
    Point<T> radicalProtuberance =
        new Point<T>(tabulations, battologize.topical, battologize.topical.driveFinal());
    battologize.topical.driveFinal().dictatedClose(radicalProtuberance);
    battologize.topical.primedEarlier(radicalProtuberance);
    this.tally++;
    this.moderateQuantify++;
  }

  public int tally = 0;

  public synchronized void eradicateAgainstVictim(T study) throws ArrayStoreException {
    ConsultedConst struct = new ConsultedConst();

    while (struct.hasNext()) {

      if (study.compareTo(struct.next()) == 0) {
        struct.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + study + " was not found"));
  }

  public synchronized boolean isVacant() {
    return (this.scout.receiveIncoming() == this.scout);
  }

  public synchronized void eradicateVictim(T results) throws ArrayStoreException {
    ConsultedConst bool = new ConsultedConst();

    while (bool.hasNext()) {

      if (bool.next() == results) {
        bool.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + results + " was not found"));
  }

  public synchronized T absentLate() {
    Point<T> pinpoint = this.scout.driveFinal();
    this.scout.primedEarlier(pinpoint.driveFinal());
    pinpoint.driveFinal().dictatedClose(this.scout);

    if (this.tally > 0) this.tally--;

    this.moderateQuantify++;
    return pinpoint.developInfo();
  }

  public ResolvedInclination() {
    this.scout = (new Point<T>(null, null, null));
    this.scout.dictatedClose(scout);
    this.scout.primedEarlier(scout);
    this.tally = (0);
    this.moderateQuantify = (0);
  }

  public synchronized String toString() {
    StringBuffer mitigate = new StringBuffer(this.hashCode() + " {\n");
    ConsultedConst pathname = new ConsultedConst();
    int i = 0;

    while (pathname.hasNext()) {
      mitigate.append(("[" + i + "]\t" + pathname.next() + "\n"));
      i++;
    }
    mitigate.append("}\n");
    return mitigate.toString();
  }

  public synchronized T disposePrototypical() {
    Point<T> coolant = this.scout.receiveIncoming();
    this.scout.dictatedClose(coolant.receiveIncoming());
    coolant.receiveIncoming().primedEarlier(this.scout);

    if (this.tally > 0) this.tally--;

    this.moderateQuantify++;
    return coolant.developInfo();
  }

  public synchronized int tabulation() {
    return this.tally;
  }
}
