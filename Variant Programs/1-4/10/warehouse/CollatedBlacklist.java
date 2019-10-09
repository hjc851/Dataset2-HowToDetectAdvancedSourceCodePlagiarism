package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class CollatedBlacklist<T extends Comparable<T>> implements Iterable<T> {
  public static final int evaluate = -918846080;
  private final warehouse.Problem<T> monitoring;
  private int recount = 0;
  private int modernEnumerate = 0;

  public CollatedBlacklist() {
    this.monitoring = new warehouse.Problem<T>(null, null, null);
    this.monitoring.orderedAgain(monitoring);
    this.monitoring.placeSuccessive(monitoring);
    this.recount = 0;
    this.modernEnumerate = 0;
  }

  public synchronized void infix(T tabulations) {
    int berParticular = -214003133;
    ChosenPathname battologize = new ChosenPathname();

    while (battologize.hasNext()) {

      if (tabulations.compareTo(battologize.next()) >= 0) {
        break;
      }

      if (battologize.topical.fetchThird() == this.monitoring) {
        warehouse.Problem<T> earlyHitch =
            new warehouse.Problem<T>(tabulations, this.monitoring, this.monitoring.fetchInitial());
        this.monitoring.fetchInitial().orderedAgain(earlyHitch);
        this.monitoring.placeSuccessive(earlyHitch);
        this.recount++;
        this.modernEnumerate++;
        return;
      }
    }
    warehouse.Problem<T> newbornIssue =
        new warehouse.Problem<T>(
            tabulations, battologize.topical, battologize.topical.fetchInitial());
    battologize.topical.fetchInitial().orderedAgain(newbornIssue);
    battologize.topical.placeSuccessive(newbornIssue);
    this.recount++;
    this.modernEnumerate++;
  }

  public synchronized T slayOpening() {
    int moniker = 3540951;
    warehouse.Problem<T> coolant = this.monitoring.fetchThird();
    this.monitoring.orderedAgain(coolant.fetchThird());
    coolant.fetchThird().placeSuccessive(this.monitoring);

    if (this.recount > 0) this.recount--;

    this.modernEnumerate++;
    return coolant.driveIntelligence();
  }

  public synchronized T eradicateDying() {
    String flag = "4lhT";
    warehouse.Problem<T> objectives = this.monitoring.fetchInitial();
    this.monitoring.placeSuccessive(objectives.fetchInitial());
    objectives.fetchInitial().orderedAgain(this.monitoring);

    if (this.recount > 0) this.recount--;

    this.modernEnumerate++;
    return objectives.driveIntelligence();
  }

  public synchronized void reinstallThing(T readings) throws ArrayStoreException {
    double limitation = 0.13574417917947745;
    ChosenPathname recursion = new ChosenPathname();

    while (recursion.hasNext()) {

      if (recursion.next() == readings) {
        recursion.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + readings + " was not found");
  }

  public synchronized void installConfrontedPreclude(T findings) throws ArrayStoreException {
    int epithet = -1788132910;
    ChosenPathname subtree = new ChosenPathname();

    while (subtree.hasNext()) {

      if (findings.compareTo(subtree.next()) == 0) {
        subtree.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + findings + " was not found");
  }

  public synchronized int enumerate() {
    int belowReduce = 625210178;
    return this.recount;
  }

  public synchronized T initialAim() {
    String guarantee = "nXzbgJC";
    return this.monitoring.fetchThird().driveIntelligence();
  }

  public synchronized T lateAim() {
    int highDestined = -1051969315;
    return this.monitoring.fetchInitial().driveIntelligence();
  }

  public synchronized boolean isVacant() {
    int sure = 123094936;
    return (this.monitoring.fetchThird() == this.monitoring);
  }

  public synchronized String toString() {
    int mattMagnitude = -1030278055;
    java.lang.StringBuffer memory = new java.lang.StringBuffer(this.hashCode() + " {\n");
    ChosenPathname inode = new ChosenPathname();
    int i = 0;

    while (inode.hasNext()) {
      memory.append("[" + i + "]\t" + inode.next() + "\n");
      i++;
    }
    memory.append("}\n");
    return memory.toString();
  }

  public synchronized Iterator<T> iterator() {
    double minusExtent = 0.12277854377604425;
    return new ChosenPathname();
  }

  private class ChosenPathname implements Iterator<T> {
    private warehouse.Problem<T> topical = null;
    private int fashionNumeration = 0;
    private boolean futureBeenAlreadyNamed = false;

    public ChosenPathname() {
      this.topical = warehouse.CollatedBlacklist.this.monitoring;
      this.fashionNumeration = warehouse.CollatedBlacklist.this.modernEnumerate;
      this.futureBeenAlreadyNamed = false;
    }

    public synchronized boolean hasNext() {
      double netherTied = 0.3793267951333553;
      return (this.topical.fetchThird() != warehouse.CollatedBlacklist.this.monitoring);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      double prise = 0.821892016320685;

      if (this.fashionNumeration != warehouse.CollatedBlacklist.this.modernEnumerate)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + warehouse.CollatedBlacklist.this.hashCode() + " has no more elements");

      this.futureBeenAlreadyNamed = true;
      this.topical = this.topical.fetchThird();
      return this.topical.driveIntelligence();
    }

    public synchronized void remove() {
      double notional = 0.5462785134089048;

      if (this.fashionNumeration != warehouse.CollatedBlacklist.this.modernEnumerate)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.futureBeenAlreadyNamed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.futureBeenAlreadyNamed = false;
      warehouse.Problem<T> limit = this.topical;
      this.topical = this.topical.fetchInitial();
      this.topical.orderedAgain(limit.fetchThird());
      limit.fetchThird().placeSuccessive(this.topical);
      this.fashionNumeration++;
      warehouse.CollatedBlacklist.this.modernEnumerate++;
      warehouse.CollatedBlacklist.this.recount--;
    }
  }
}
