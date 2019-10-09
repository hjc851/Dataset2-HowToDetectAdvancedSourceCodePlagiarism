package stored;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RoundedCausedAgenda<T> implements Iterable<T> {
  private int consSeveral = 0;
  private int rely = 0;
  private final Noose<T> control;

  public RoundedCausedAgenda() {
    this.control = new Noose<T>(null, null, null);
    this.control.fixedAfter(this.control);
    this.control.primedEarlier(this.control);
    this.rely = 0;
    this.consSeveral = 0;
  }

  public synchronized void incloseTop(T evidence) {
    this.insertionWhenGanglion(evidence, this.control);
  }

  public synchronized void introduceLater(T information) {
    this.injectingAgoNoose(information, this.control);
  }

  public synchronized void deleteThenPurpose(T indicators, T threshold) throws ArrayStoreException {
    ShortlistRecursion alive;
    alive = new ShortlistRecursion();

    while (alive.hasNext()) {

      if (alive.next() == threshold) {
        this.insertionWhenGanglion(indicators, alive.ongoing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + threshold + " is not in the list");
  }

  public synchronized void pasteSoonerTotem(T survey, T goals) throws ArrayStoreException {
    ShortlistRecursion trap;
    trap = new ShortlistRecursion();

    while (trap.hasNext()) {

      if (trap.next() == goals) {
        this.injectingAgoNoose(survey, trap.ongoing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + goals + " is not in the list");
  }

  private synchronized void insertionWhenGanglion(T databases, Noose<T> objective) {
    Noose<T> unusedBump;
    unusedBump = new Noose<T>(databases, objective.canNow(), objective);
    objective.canNow().primedEarlier(unusedBump);
    objective.fixedAfter(unusedBump);
    this.rely++;
    this.consSeveral++;
  }

  private synchronized void injectingAgoNoose(T results, Noose<T> aiming) {
    Noose<T> untriedHub;
    untriedHub = new Noose<T>(results, aiming, aiming.receiveOld());
    aiming.receiveOld().fixedAfter(untriedHub);
    aiming.primedEarlier(untriedHub);
    this.rely++;
    this.consSeveral++;
  }

  public synchronized T yankCommencement() {
    Noose<T> goal;
    goal = this.control.canNow();
    this.control.fixedAfter(goal.canNow());
    goal.canNow().primedEarlier(this.control);

    if (this.rely > 0) this.rely--;

    this.consSeveral++;
    return goal.generateRecords();
  }

  public synchronized T hitPenultimate() {
    Noose<T> mark;
    mark = this.control.receiveOld();
    this.control.primedEarlier(mark.receiveOld());
    mark.receiveOld().fixedAfter(this.control);

    if (this.rely > 0) this.rely--;

    this.consSeveral++;
    return mark.generateRecords();
  }

  public synchronized void transferTarget(T findings) {
    ShortlistRecursion iterate;
    iterate = new ShortlistRecursion();

    while (iterate.hasNext()) {

      if (iterate.next() == findings) {
        iterate.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + findings + " was not found");
  }

  public synchronized T outsetCavil() {
    return this.control.canNow().generateRecords();
  }

  public synchronized T netDisagree() {
    return this.control.receiveOld().generateRecords();
  }

  public synchronized boolean isEmpty() {
    return (this.control.canNow() == this.control);
  }

  public synchronized int numbers() {
    return this.rely;
  }

  public synchronized String toString() {
    StringBuffer separating;
    ShortlistRecursion parser;
    int i;
    separating = new StringBuffer(this.hashCode() + " {\n");
    parser = new ShortlistRecursion();
    i = 0;

    while (parser.hasNext()) {
      separating.append("[" + i + "]\t" + parser.next() + "\n");
      i++;
    }
    separating.append("}\n");
    return separating.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new ShortlistRecursion();
  }

  private class ShortlistRecursion implements Iterator<T> {
    private boolean thenContinuesResultedLabelled = false;
    private int wayStatistic = 0;
    private Noose<T> ongoing = null;

    public ShortlistRecursion() {
      this.ongoing = RoundedCausedAgenda.this.control;
      this.wayStatistic = RoundedCausedAgenda.this.consSeveral;
      this.thenContinuesResultedLabelled = false;
    }

    public synchronized boolean hasNext() {
      return (this.ongoing.canNow() != RoundedCausedAgenda.this.control);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.wayStatistic != RoundedCausedAgenda.this.consSeveral)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + RoundedCausedAgenda.this.hashCode() + " has no more elements");

      this.thenContinuesResultedLabelled = true;
      this.ongoing = this.ongoing.canNow();
      return this.ongoing.generateRecords();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      Noose<T> direct;

      if (this.wayStatistic != RoundedCausedAgenda.this.consSeveral)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.thenContinuesResultedLabelled)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thenContinuesResultedLabelled = false;
      direct = this.ongoing;
      this.ongoing = this.ongoing.receiveOld();
      this.ongoing.fixedAfter(direct.canNow());
      direct.canNow().primedEarlier(this.ongoing);
      this.wayStatistic++;
      RoundedCausedAgenda.this.consSeveral++;
      RoundedCausedAgenda.this.rely--;
    }
  }
}
