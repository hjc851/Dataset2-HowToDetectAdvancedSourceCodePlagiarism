package space;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ArrangedRanking<T extends Comparable<T>> implements Iterable<T> {
  public final Guest<T> guardian;
  public int charge = 0;
  public int stylishTally = 0;

  public ArrangedRanking() {
    this.guardian = (new Guest<T>(null, null, null));
    this.guardian.solidifyingThe(guardian);
    this.guardian.orderedRecord(guardian);
    this.charge = (0);
    this.stylishTally = (0);
  }

  public synchronized void integrate(T computer) {
    GroupedTuple inode = new GroupedTuple();

    while (inode.hasNext()) {

      if (computer.compareTo(inode.next()) >= 0) {
        break;
      }

      if (inode.contemporary.produceSecond() == this.guardian) {
        Guest<T> recentlyNodule =
            new Guest<T>(computer, this.guardian, this.guardian.produceCurrent());
        this.guardian.produceCurrent().solidifyingThe(recentlyNodule);
        this.guardian.orderedRecord(recentlyNodule);
        this.charge++;
        this.stylishTally++;
        return;
      }
    }
    Guest<T> newfoundJunction =
        new Guest<T>(computer, inode.contemporary, inode.contemporary.produceCurrent());
    inode.contemporary.produceCurrent().solidifyingThe(newfoundJunction);
    inode.contemporary.orderedRecord(newfoundJunction);
    this.charge++;
    this.stylishTally++;
  }

  public synchronized T withdrawKickoff() {
    Guest<T> copywriter = this.guardian.produceSecond();
    this.guardian.solidifyingThe(copywriter.produceSecond());
    copywriter.produceSecond().orderedRecord(this.guardian);

    if (this.charge > 0) this.charge--;

    this.stylishTally++;
    return copywriter.developInfo();
  }

  public synchronized T hitPenultimate() {
    Guest<T> goal = this.guardian.produceCurrent();
    this.guardian.orderedRecord(goal.produceCurrent());
    goal.produceCurrent().solidifyingThe(this.guardian);

    if (this.charge > 0) this.charge--;

    this.stylishTally++;
    return goal.developInfo();
  }

  public synchronized void takeObjective(T measurements) throws ArrayStoreException {
    GroupedTuple battologize = new GroupedTuple();

    while (battologize.hasNext()) {

      if (battologize.next() == measurements) {
        battologize.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + measurements + " was not found"));
  }

  public synchronized void dismantleOpposedDemur(T readings) throws ArrayStoreException {
    GroupedTuple tuple = new GroupedTuple();

    while (tuple.hasNext()) {

      if (readings.compareTo(tuple.next()) == 0) {
        tuple.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + readings + " was not found"));
  }

  public synchronized int figures() {
    return this.charge;
  }

  public synchronized T topObjection() {
    return this.guardian.produceSecond().developInfo();
  }

  public synchronized T finalArtifact() {
    return this.guardian.produceCurrent().developInfo();
  }

  public synchronized boolean isVacant() {
    return (this.guardian.produceSecond() == this.guardian);
  }

  public synchronized String toString() {
    StringBuffer temporary = new StringBuffer(this.hashCode() + " {\n");
    GroupedTuple malloc = new GroupedTuple();
    int i = 0;

    while (malloc.hasNext()) {
      temporary.append(("[" + i + "]\t" + malloc.next() + "\n"));
      i++;
    }
    temporary.append("}\n");
    return temporary.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new GroupedTuple();
  }

  public class GroupedTuple implements Iterator<T> {
    public Guest<T> contemporary = null;
    public int boldnessRely = 0;
    public boolean succeedingRemainsGottenTermed = false;

    public GroupedTuple() {
      this.contemporary = (ArrangedRanking.this.guardian);
      this.boldnessRely = (ArrangedRanking.this.stylishTally);
      this.succeedingRemainsGottenTermed = (false);
    }

    public synchronized boolean hasNext() {
      return (this.contemporary.produceSecond() != ArrangedRanking.this.guardian);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldnessRely != ArrangedRanking.this.stylishTally)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + ArrangedRanking.this.hashCode() + " has no more elements"));

      this.succeedingRemainsGottenTermed = (true);
      this.contemporary = (this.contemporary.produceSecond());
      return this.contemporary.developInfo();
    }

    public synchronized void remove() {

      if (this.boldnessRely != ArrangedRanking.this.stylishTally)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.succeedingRemainsGottenTermed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.succeedingRemainsGottenTermed = (false);
      Guest<T> objectives = this.contemporary;
      this.contemporary = (this.contemporary.produceCurrent());
      this.contemporary.solidifyingThe(objectives.produceSecond());
      objectives.produceSecond().orderedRecord(this.contemporary);
      this.boldnessRely++;
      ArrangedRanking.this.stylishTally++;
      ArrangedRanking.this.charge--;
    }
  }
}
