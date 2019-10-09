package space;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GlobalMatchedBibliography<T> implements Iterable<T> {

  public synchronized void encloseInitial(T results) {
    this.enterAfterwardsAntenna(results, this.controlled);
  }

  public synchronized void tuckEarlierObjective(T measurements, T focus)
      throws ArrayStoreException {
    LitanyOperand above;
    above = new LitanyOperand();

    while (above.hasNext()) {

      if (above.next() == focus) {
        this.injectWithoutJunction(measurements, above.actual);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + focus + " is not in the list");
  }

  public synchronized T eraseGo() {
    space.Problem<T> goals;
    goals = this.controlled.obtainPremature();
    this.controlled.placeSuccessive(goals.obtainPremature());
    goals.obtainPremature().fixThen(this.controlled);

    if (this.indictment > 0) this.indictment--;

    this.boldHandful++;
    return goals.canNumbers();
  }

  public synchronized void injectWithoutJunction(T files, space.Problem<T> direct) {
    space.Problem<T> babyNoose;
    babyNoose = new space.Problem<T>(files, direct, direct.obtainPremature());
    direct.obtainPremature().fixThen(babyNoose);
    direct.placeSuccessive(babyNoose);
    this.indictment++;
    this.boldHandful++;
  }

  public synchronized boolean isEmpty() {
    return (this.controlled.obtainLast() == this.controlled);
  }

  public synchronized void embedLatest(T numbers) {
    this.injectWithoutJunction(numbers, this.controlled);
  }

  public synchronized int total() {
    return this.indictment;
  }

  public synchronized T eraseFirstborn() {
    space.Problem<T> priority;
    priority = this.controlled.obtainLast();
    this.controlled.fixThen(priority.obtainLast());
    priority.obtainLast().placeSuccessive(this.controlled);

    if (this.indictment > 0) this.indictment--;

    this.boldHandful++;
    return priority.canNumbers();
  }

  public int indictment = 0;

  public GlobalMatchedBibliography() {
    this.controlled = new space.Problem<T>(null, null, null);
    this.controlled.fixThen(this.controlled);
    this.controlled.placeSuccessive(this.controlled);
    this.indictment = 0;
    this.boldHandful = 0;
  }

  public int boldHandful = 0;

  public synchronized T laterTarget() {
    return this.controlled.obtainPremature().canNumbers();
  }

  public synchronized void enterAfterwardsAntenna(T readings, space.Problem<T> threshold) {
    space.Problem<T> freshlyGanglion;
    freshlyGanglion = new space.Problem<T>(readings, threshold.obtainLast(), threshold);
    threshold.obtainLast().placeSuccessive(freshlyGanglion);
    threshold.fixThen(freshlyGanglion);
    this.indictment++;
    this.boldHandful++;
  }

  public synchronized Iterator<T> iterator() {
    return new LitanyOperand();
  }

  public final space.Problem<T> controlled;

  public synchronized void removalResist(T database) {
    LitanyOperand concatenate;
    concatenate = new LitanyOperand();

    while (concatenate.hasNext()) {

      if (concatenate.next() == database) {
        concatenate.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + database + " was not found");
  }

  public synchronized String toString() {
    java.lang.StringBuffer spacer;
    LitanyOperand initialisation;
    int i;
    spacer = new java.lang.StringBuffer(this.hashCode() + " {\n");
    initialisation = new LitanyOperand();
    i = 0;

    while (initialisation.hasNext()) {
      spacer.append("[" + i + "]\t" + initialisation.next() + "\n");
      i++;
    }
    spacer.append("}\n");
    return spacer.toString();
  }

  public synchronized void deleteThenPurpose(T computer, T aiming) throws ArrayStoreException {
    LitanyOperand wrap;
    wrap = new LitanyOperand();

    while (wrap.hasNext()) {

      if (wrap.next() == aiming) {
        this.enterAfterwardsAntenna(computer, wrap.actual);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + aiming + " is not in the list");
  }

  public class LitanyOperand implements Iterator<T> {
    public boolean lastBoastsRemainedLabeled = false;

    public LitanyOperand() {
      this.actual = space.GlobalMatchedBibliography.this.controlled;
      this.braveNumerous = space.GlobalMatchedBibliography.this.boldHandful;
      this.lastBoastsRemainedLabeled = false;
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.braveNumerous != space.GlobalMatchedBibliography.this.boldHandful)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + space.GlobalMatchedBibliography.this.hashCode() + " has no more elements");

      this.lastBoastsRemainedLabeled = true;
      this.actual = this.actual.obtainLast();
      return this.actual.canNumbers();
    }

    public space.Problem<T> actual = null;
    public int braveNumerous = 0;

    public synchronized boolean hasNext() {
      return (this.actual.obtainLast() != space.GlobalMatchedBibliography.this.controlled);
    }

    public synchronized void remove() throws ConcurrentModificationException {
      space.Problem<T> achieve;

      if (this.braveNumerous != space.GlobalMatchedBibliography.this.boldHandful)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.lastBoastsRemainedLabeled)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.lastBoastsRemainedLabeled = false;
      achieve = this.actual;
      this.actual = this.actual.obtainPremature();
      this.actual.fixThen(achieve.obtainLast());
      achieve.obtainLast().placeSuccessive(this.actual);
      this.braveNumerous++;
      space.GlobalMatchedBibliography.this.boldHandful++;
      space.GlobalMatchedBibliography.this.indictment--;
    }
  }

  public synchronized T basicOpposes() {
    return this.controlled.obtainLast().canNumbers();
  }
}
