package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class BroadsheetRelationRosters<T> implements Iterable<T> {
  private int daringMany;
  private int quantify;
  private final safekeeping.Nub<T> sentry;

  public BroadsheetRelationRosters() {
    this.sentry = new safekeeping.Nub<T>(null, null, null);
    this.sentry.fitComing(this.sentry);
    this.sentry.orderedRecord(this.sentry);
    this.quantify = 0;
    this.daringMany = 0;
  }

  public synchronized void embedOutset(T files) {
    this.installSubsequentHitch(files, this.sentry);
  }

  public synchronized void enterFinal(T evidence) {
    this.injectedLateBump(evidence, this.sentry);
  }

  public synchronized void inscribingOverThing(T indicators, T aiming) throws ArrayStoreException {
    LitanyOperand wrap;
    wrap = new LitanyOperand();

    while (wrap.hasNext()) {

      if (wrap.next() == aiming) {
        this.installSubsequentHitch(indicators, wrap.actual);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + aiming + " is not in the list");
  }

  public synchronized void incorporatedNeverArgue(T readings, T goals) throws ArrayStoreException {
    LitanyOperand showtime;
    showtime = new LitanyOperand();

    while (showtime.hasNext()) {

      if (showtime.next() == goals) {
        this.injectedLateBump(readings, showtime.actual);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + goals + " is not in the list");
  }

  private synchronized void installSubsequentHitch(T database, safekeeping.Nub<T> point) {
    safekeeping.Nub<T> youngCore;
    youngCore = new safekeeping.Nub<T>(database, point.comeFollowing(), point);
    point.comeFollowing().orderedRecord(youngCore);
    point.fitComing(youngCore);
    this.quantify++;
    this.daringMany++;
  }

  private synchronized void injectedLateBump(T computer, safekeeping.Nub<T> prey) {
    safekeeping.Nub<T> novelLump;
    novelLump = new safekeeping.Nub<T>(computer, prey, prey.receiveOld());
    prey.receiveOld().fitComing(novelLump);
    prey.orderedRecord(novelLump);
    this.quantify++;
    this.daringMany++;
  }

  public synchronized T takeBeginning() {
    safekeeping.Nub<T> goal;
    goal = this.sentry.comeFollowing();
    this.sentry.fitComing(goal.comeFollowing());
    goal.comeFollowing().orderedRecord(this.sentry);

    if (this.quantify > 0) this.quantify--;

    this.daringMany++;
    return goal.drawStats();
  }

  public synchronized T ridLatest() {
    safekeeping.Nub<T> mark;
    mark = this.sentry.receiveOld();
    this.sentry.orderedRecord(mark.receiveOld());
    mark.receiveOld().fitComing(this.sentry);

    if (this.quantify > 0) this.quantify--;

    this.daringMany++;
    return mark.drawStats();
  }

  public synchronized void absentAim(T study) {
    LitanyOperand inode;
    inode = new LitanyOperand();

    while (inode.hasNext()) {

      if (inode.next() == study) {
        inode.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + study + " was not found");
  }

  public synchronized T kickoffItems() {
    return this.sentry.comeFollowing().drawStats();
  }

  public synchronized T concludingObjet() {
    return this.sentry.receiveOld().drawStats();
  }

  public synchronized boolean isEmpty() {
    return (this.sentry.comeFollowing() == this.sentry);
  }

  public synchronized int enumerate() {
    return this.quantify;
  }

  public synchronized String toString() {
    java.lang.StringBuffer reserves;
    LitanyOperand subtree;
    int i;
    reserves = new java.lang.StringBuffer(this.hashCode() + " {\n");
    subtree = new LitanyOperand();
    i = 0;

    while (subtree.hasNext()) {
      reserves.append("[" + i + "]\t" + subtree.next() + "\n");
      i++;
    }
    reserves.append("}\n");
    return reserves.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new LitanyOperand();
  }

  private class LitanyOperand implements Iterator<T> {
    private boolean aheadFeelsKeptDemanded;
    private int boldHandful;
    private safekeeping.Nub<T> actual;

    public LitanyOperand() {
      this.actual = safekeeping.BroadsheetRelationRosters.this.sentry;
      this.boldHandful = safekeeping.BroadsheetRelationRosters.this.daringMany;
      this.aheadFeelsKeptDemanded = false;
    }

    public synchronized boolean hasNext() {
      return (this.actual.comeFollowing() != safekeeping.BroadsheetRelationRosters.this.sentry);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldHandful != safekeeping.BroadsheetRelationRosters.this.daringMany)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List "
                + safekeeping.BroadsheetRelationRosters.this.hashCode()
                + " has no more elements");

      this.aheadFeelsKeptDemanded = true;
      this.actual = this.actual.comeFollowing();
      return this.actual.drawStats();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      safekeeping.Nub<T> objective;

      if (this.boldHandful != safekeeping.BroadsheetRelationRosters.this.daringMany)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.aheadFeelsKeptDemanded)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.aheadFeelsKeptDemanded = false;
      objective = this.actual;
      this.actual = this.actual.receiveOld();
      this.actual.fitComing(objective.comeFollowing());
      objective.comeFollowing().orderedRecord(this.actual);
      this.boldHandful++;
      safekeeping.BroadsheetRelationRosters.this.daringMany++;
      safekeeping.BroadsheetRelationRosters.this.quantify--;
    }
  }
}
