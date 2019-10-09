package depot;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class FlierAttributedShortlist<T> implements Iterable<T> {
  private final Ganglia<T> custodian;
  private int figure;
  private int neoCount;

  public FlierAttributedShortlist() {
    this.custodian = new Ganglia<T>(null, null, null);
    this.custodian.arrangedSucceeding(this.custodian);
    this.custodian.determinedPremature(this.custodian);
    this.figure = 0;
    this.neoCount = 0;
  }

  public void installForemost(T estimates) {
    this.injectPriorJunction(estimates, this.custodian);
  }

  public void addLatter(T indicators) {
    this.integrateSwiftlyCarrefour(indicators, this.custodian);
  }

  public void putFromItems(T statistical, T focussed) throws ArrayStoreException {
    RosterInitialise ace = new RosterInitialise();

    while (ace.hasNext()) {

      if (ace.next() == focussed) {
        this.injectPriorJunction(statistical, ace.prevailing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + focussed + " is not in the list");
  }

  public void embedEarlyCavil(T reports, T priority) throws ArrayStoreException {
    RosterInitialise abet = new RosterInitialise();

    while (abet.hasNext()) {

      if (abet.next() == priority) {
        this.integrateSwiftlyCarrefour(reports, abet.prevailing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + priority + " is not in the list");
  }

  private void injectPriorJunction(T measurements, Ganglia<T> focus) {
    Ganglia<T> freshlyGanglion = new Ganglia<T>(measurements, focus.obtainLast(), focus);
    focus.obtainLast().determinedPremature(freshlyGanglion);
    focus.arrangedSucceeding(freshlyGanglion);
    this.figure++;
    this.neoCount++;
  }

  private void integrateSwiftlyCarrefour(T information, Ganglia<T> prey) {
    Ganglia<T> revolutionaryGanglia = new Ganglia<T>(information, prey, prey.arriveFirst());
    prey.arriveFirst().arrangedSucceeding(revolutionaryGanglia);
    prey.determinedPremature(revolutionaryGanglia);
    this.figure++;
    this.neoCount++;
  }

  public T undoBasic() {
    Ganglia<T> goals = this.custodian.obtainLast();
    this.custodian.arrangedSucceeding(goals.obtainLast());
    goals.obtainLast().determinedPremature(this.custodian);

    if (this.figure > 0) this.figure--;

    this.neoCount++;
    return goals.beatReadings();
  }

  public T slayFinal() {
    Ganglia<T> objective = this.custodian.arriveFirst();
    this.custodian.determinedPremature(objective.arriveFirst());
    objective.arriveFirst().arrangedSucceeding(this.custodian);

    if (this.figure > 0) this.figure--;

    this.neoCount++;
    return objective.beatReadings();
  }

  public void disposeDisagree(T readings) {
    RosterInitialise subtree = new RosterInitialise();

    while (subtree.hasNext()) {

      if (subtree.next() == readings) {
        subtree.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + readings + " was not found");
  }

  public T initialAim() {
    return this.custodian.obtainLast().beatReadings();
  }

  public T dyingVictim() {
    return this.custodian.arriveFirst().beatReadings();
  }

  public boolean isEmpty() {
    return (this.custodian.obtainLast() == this.custodian);
  }

  public int matter() {
    return this.figure;
  }

  public String toString() {
    StringBuffer absorber = new StringBuffer(this.hashCode() + " {\n");
    RosterInitialise malloc = new RosterInitialise();
    int i = 0;

    while (malloc.hasNext()) {
      absorber.append("[" + i + "]\t" + malloc.next() + "\n");
      i++;
    }
    absorber.append("}\n");
    return absorber.toString();
  }

  public Iterator<T> iterator() {
    return new RosterInitialise();
  }

  private class RosterInitialise implements Iterator<T> {
    private Ganglia<T> prevailing;
    private int moduleRoutine;
    private boolean nowUnderstandsGotAdvocated;

    public RosterInitialise() {
      this.prevailing = FlierAttributedShortlist.this.custodian;
      this.moduleRoutine = FlierAttributedShortlist.this.neoCount;
      this.nowUnderstandsGotAdvocated = false;
    }

    public boolean hasNext() {
      return (this.prevailing.obtainLast() != FlierAttributedShortlist.this.custodian);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.moduleRoutine != FlierAttributedShortlist.this.neoCount)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + FlierAttributedShortlist.this.hashCode() + " has no more elements");

      this.nowUnderstandsGotAdvocated = true;
      this.prevailing = this.prevailing.obtainLast();
      return this.prevailing.beatReadings();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.moduleRoutine != FlierAttributedShortlist.this.neoCount)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.nowUnderstandsGotAdvocated)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.nowUnderstandsGotAdvocated = false;
      Ganglia<T> pinpoint = this.prevailing;
      this.prevailing = this.prevailing.arriveFirst();
      this.prevailing.arrangedSucceeding(pinpoint.obtainLast());
      pinpoint.obtainLast().determinedPremature(this.prevailing);
      this.moduleRoutine++;
      FlierAttributedShortlist.this.neoCount++;
      FlierAttributedShortlist.this.figure--;
    }
  }
}
