package storing;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SolvedLeaning<T extends Comparable<T>> implements Iterable<T> {
  private final Nucleus<T> sentry;
  private int figure;
  private int braveTell;

  public SolvedLeaning() {
    this.sentry = new Nucleus<T>(null, null, null);
    this.sentry.prepareSecond(sentry);
    this.sentry.fitPrior(sentry);
    this.figure = 0;
    this.braveTell = 0;
  }

  public synchronized void enter(T readings) {
    ChosenPathname tuple = new ChosenPathname();

    while (tuple.hasNext()) {

      if (readings.compareTo(tuple.next()) >= 0) {
        break;
      }

      if (tuple.existing.developNew() == this.sentry) {
        Nucleus<T> risingCarrefour =
            new Nucleus<T>(readings, this.sentry, this.sentry.fetchInitial());
        this.sentry.fetchInitial().prepareSecond(risingCarrefour);
        this.sentry.fitPrior(risingCarrefour);
        this.figure++;
        this.braveTell++;
        return;
      }
    }
    Nucleus<T> newlyKnob = new Nucleus<T>(readings, tuple.existing, tuple.existing.fetchInitial());
    tuple.existing.fetchInitial().prepareSecond(newlyKnob);
    tuple.existing.fitPrior(newlyKnob);
    this.figure++;
    this.braveTell++;
  }

  public synchronized T installForemost() {
    Nucleus<T> solvate = this.sentry.developNew();
    this.sentry.prepareSecond(solvate.developNew());
    solvate.developNew().fitPrior(this.sentry);

    if (this.figure > 0) this.figure--;

    this.braveTell++;
    return solvate.makeIndicators();
  }

  public synchronized T absentLate() {
    Nucleus<T> objective = this.sentry.fetchInitial();
    this.sentry.fitPrior(objective.fetchInitial());
    objective.fetchInitial().prepareSecond(this.sentry);

    if (this.figure > 0) this.figure--;

    this.braveTell++;
    return objective.makeIndicators();
  }

  public synchronized void absentAim(T tabulations) throws ArrayStoreException {
    ChosenPathname subroutine = new ChosenPathname();

    while (subroutine.hasNext()) {

      if (subroutine.next() == tabulations) {
        subroutine.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + tabulations + " was not found");
  }

  public synchronized void undoReportOpposes(T files) throws ArrayStoreException {
    ChosenPathname concatenate = new ChosenPathname();

    while (concatenate.hasNext()) {

      if (files.compareTo(concatenate.next()) == 0) {
        concatenate.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + files + " was not found");
  }

  public synchronized int census() {
    return this.figure;
  }

  public synchronized T inauguralTarget() {
    return this.sentry.developNew().makeIndicators();
  }

  public synchronized T finaleElement() {
    return this.sentry.fetchInitial().makeIndicators();
  }

  public synchronized boolean isVacant() {
    return (this.sentry.developNew() == this.sentry);
  }

  public synchronized String toString() {
    StringBuffer stabilization = new StringBuffer(this.hashCode() + " {\n");
    ChosenPathname init = new ChosenPathname();
    int i = 0;

    while (init.hasNext()) {
      stabilization.append("[" + i + "]\t" + init.next() + "\n");
      i++;
    }
    stabilization.append("}\n");
    return stabilization.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new ChosenPathname();
  }

  private class ChosenPathname implements Iterator<T> {
    private Nucleus<T> existing;
    private int domEnumeration;
    private boolean afterExistsLivedDeclared;

    public ChosenPathname() {
      this.existing = SolvedLeaning.this.sentry;
      this.domEnumeration = SolvedLeaning.this.braveTell;
      this.afterExistsLivedDeclared = false;
    }

    public synchronized boolean hasNext() {
      return (this.existing.developNew() != SolvedLeaning.this.sentry);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.domEnumeration != SolvedLeaning.this.braveTell)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + SolvedLeaning.this.hashCode() + " has no more elements");

      this.afterExistsLivedDeclared = true;
      this.existing = this.existing.developNew();
      return this.existing.makeIndicators();
    }

    public synchronized void remove() {

      if (this.domEnumeration != SolvedLeaning.this.braveTell)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.afterExistsLivedDeclared)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.afterExistsLivedDeclared = false;
      Nucleus<T> goal = this.existing;
      this.existing = this.existing.fetchInitial();
      this.existing.prepareSecond(goal.developNew());
      goal.developNew().fitPrior(this.existing);
      this.domEnumeration++;
      SolvedLeaning.this.braveTell++;
      SolvedLeaning.this.figure--;
    }
  }
}
