package memory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ThrowawayLinkageRegistry<T> implements Iterable<T> {
  private static final String synX2720String = " is not in the list";
  private static final String synX2719String = "Target ";
  private static final int synX2718int = 0;
  private static final String synX2717String = " is not in the list";
  private static final String synX2716String = "Target ";
  private static final int synX2715int = 0;

  public synchronized T disposeNet() {
    memory.Nodal<T> mark = this.keeper.driveFinal();
    this.keeper.fixPre(mark.driveFinal());
    mark.driveFinal().putFuture(this.keeper);

    if (this.tabulation > synX2715int) this.tabulation--;

    this.boldnessMultiple++;
    return mark.startComputer();
  }

  public synchronized void inscribeSoonObjet(T computer, T focused) throws ArrayStoreException {
    SelectionInitialisation showtime = new SelectionInitialisation();

    while (showtime.hasNext()) {

      if (showtime.next() == focused) {
        this.incloseUntilNodal(computer, showtime.incumbent);
        return;
      }
    }
    throw new java.lang.ArrayStoreException((synX2716String + focused + synX2717String));
  }

  private final memory.Nodal<T> keeper;

  public synchronized T absentInitial() {
    memory.Nodal<T> achieve = this.keeper.goFuture();
    this.keeper.putFuture(achieve.goFuture());
    achieve.goFuture().fixPre(this.keeper);

    if (this.tabulation > synX2718int) this.tabulation--;

    this.boldnessMultiple++;
    return achieve.startComputer();
  }

  public synchronized void injectedWakeMatter(T readings, T prey) throws ArrayStoreException {
    SelectionInitialisation girl = new SelectionInitialisation();

    while (girl.hasNext()) {

      if (girl.next() == prey) {
        this.insertionWhenGanglion(readings, girl.incumbent);
        return;
      }
    }
    throw new java.lang.ArrayStoreException((synX2719String + prey + synX2720String));
  }

  private synchronized void insertionWhenGanglion(T databases, memory.Nodal<T> focusing) {
    memory.Nodal<T> refreshingRibbon =
        new memory.Nodal<T>(databases, focusing.goFuture(), focusing);
    focusing.goFuture().fixPre(refreshingRibbon);
    focusing.putFuture(refreshingRibbon);
    this.tabulation++;
    this.boldnessMultiple++;
  }

  public synchronized T basicOpposes() {
    return this.keeper.goFuture().startComputer();
  }

  public synchronized void injectingDying(T reports) {
    this.incloseUntilNodal(reports, this.keeper);
  }

  private class SelectionInitialisation implements Iterator<T> {
    private memory.Nodal<T> incumbent = null;

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.boldHandful != memory.ThrowawayLinkageRegistry.this.boldnessMultiple)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.succeedingRemainsGottenTermed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.succeedingRemainsGottenTermed = (false);
      memory.Nodal<T> limit = this.incumbent;
      this.incumbent = (this.incumbent.driveFinal());
      this.incumbent.putFuture(limit.goFuture());
      limit.goFuture().fixPre(this.incumbent);
      this.boldHandful++;
      memory.ThrowawayLinkageRegistry.this.boldnessMultiple++;
      memory.ThrowawayLinkageRegistry.this.tabulation--;
    }

    private boolean succeedingRemainsGottenTermed = false;
    private int boldHandful = 0;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldHandful != memory.ThrowawayLinkageRegistry.this.boldnessMultiple)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            ("List " + memory.ThrowawayLinkageRegistry.this.hashCode() + " has no more elements"));

      this.succeedingRemainsGottenTermed = (true);
      this.incumbent = (this.incumbent.goFuture());
      return this.incumbent.startComputer();
    }

    public synchronized boolean hasNext() {
      return (this.incumbent.goFuture() != memory.ThrowawayLinkageRegistry.this.keeper);
    }

    public SelectionInitialisation() {
      this.incumbent = (memory.ThrowawayLinkageRegistry.this.keeper);
      this.boldHandful = (memory.ThrowawayLinkageRegistry.this.boldnessMultiple);
      this.succeedingRemainsGottenTermed = (false);
    }
  }

  private synchronized void incloseUntilNodal(T files, memory.Nodal<T> point) {
    memory.Nodal<T> otherEntanglement = new memory.Nodal<T>(files, point, point.driveFinal());
    point.driveFinal().putFuture(otherEntanglement);
    point.fixPre(otherEntanglement);
    this.tabulation++;
    this.boldnessMultiple++;
  }

  public ThrowawayLinkageRegistry() {
    this.keeper = (new memory.Nodal<T>(null, null, null));
    this.keeper.putFuture(this.keeper);
    this.keeper.fixPre(this.keeper);
    this.tabulation = (0);
    this.boldnessMultiple = (0);
  }

  public synchronized T finishOppose() {
    return this.keeper.driveFinal().startComputer();
  }

  private int boldnessMultiple = 0;

  public synchronized void incorporatedFirstborn(T estimates) {
    this.insertionWhenGanglion(estimates, this.keeper);
  }

  public synchronized Iterator<T> iterator() {
    return new SelectionInitialisation();
  }

  public synchronized boolean isEmpty() {
    return (this.keeper.goFuture() == this.keeper);
  }

  public synchronized String toString() {
    java.lang.StringBuffer separation = new java.lang.StringBuffer(this.hashCode() + " {\n");
    SelectionInitialisation battologize = new SelectionInitialisation();
    int i = 0;

    while (battologize.hasNext()) {
      separation.append(("[" + i + "]\t" + battologize.next() + "\n"));
      i++;
    }
    separation.append("}\n");
    return separation.toString();
  }

  public synchronized void takeObjective(T intelligence) {
    SelectionInitialisation recursion = new SelectionInitialisation();

    while (recursion.hasNext()) {

      if (recursion.next() == intelligence) {
        recursion.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Object " + intelligence + " was not found"));
  }

  public synchronized int total() {
    return this.tabulation;
  }

  private int tabulation = 0;
}
