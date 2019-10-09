package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ArrangedRanking<T extends Comparable<T>> implements Iterable<T> {
  private final Ribbon<T> killing;
  private int enumeration;
  private int dodCharge;

  public ArrangedRanking() {
    this.killing = new Ribbon<T>(null, null, null);
    this.killing.determineThird(killing);
    this.killing.fixedPredecessor(killing);
    this.enumeration = 0;
    this.dodCharge = 0;
  }

  public void enclose(T estimates) {
    SelectedInstantiation tuple = new SelectedInstantiation();

    while (tuple.hasNext()) {

      if (estimates.compareTo(tuple.next()) >= 0) {
        break;
      }

      if (tuple.underway.driveEarly() == this.killing) {
        Ribbon<T> untestedScn = new Ribbon<T>(estimates, this.killing, this.killing.fixRecord());
        this.killing.fixRecord().determineThird(untestedScn);
        this.killing.fixedPredecessor(untestedScn);
        this.enumeration++;
        this.dodCharge++;
        return;
      }
    }
    Ribbon<T> earlyHitch = new Ribbon<T>(estimates, tuple.underway, tuple.underway.fixRecord());
    tuple.underway.fixRecord().determineThird(earlyHitch);
    tuple.underway.fixedPredecessor(earlyHitch);
    this.enumeration++;
    this.dodCharge++;
  }

  public T dispatchMaiden() {
    Ribbon<T> coolant = this.killing.driveEarly();
    this.killing.determineThird(coolant.driveEarly());
    coolant.driveEarly().fixedPredecessor(this.killing);

    if (this.enumeration > 0) this.enumeration--;

    this.dodCharge++;
    return coolant.canNumbers();
  }

  public T transferLater() {
    Ribbon<T> goal = this.killing.fixRecord();
    this.killing.fixedPredecessor(goal.fixRecord());
    goal.fixRecord().determineThird(this.killing);

    if (this.enumeration > 0) this.enumeration--;

    this.dodCharge++;
    return goal.canNumbers();
  }

  public void eradicateVictim(T reports) throws ArrayStoreException {
    SelectedInstantiation initialize = new SelectedInstantiation();

    while (initialize.hasNext()) {

      if (initialize.next() == reports) {
        initialize.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + reports + " was not found");
  }

  public void transferComparisonTarget(T indicators) throws ArrayStoreException {
    SelectedInstantiation inode = new SelectedInstantiation();

    while (inode.hasNext()) {

      if (indicators.compareTo(inode.next()) == 0) {
        inode.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + indicators + " was not found");
  }

  public int census() {
    return this.enumeration;
  }

  public T outsetCavil() {
    return this.killing.driveEarly().canNumbers();
  }

  public T latterBody() {
    return this.killing.fixRecord().canNumbers();
  }

  public boolean isVacant() {
    return (this.killing.driveEarly() == this.killing);
  }

  public String toString() {
    StringBuffer spacer = new StringBuffer(this.hashCode() + " {\n");
    SelectedInstantiation uniterable = new SelectedInstantiation();
    int i = 0;

    while (uniterable.hasNext()) {
      spacer.append("[" + i + "]\t" + uniterable.next() + "\n");
      i++;
    }
    spacer.append("}\n");
    return spacer.toString();
  }

  public Iterator<T> iterator() {
    return new SelectedInstantiation();
  }

  private class SelectedInstantiation implements Iterator<T> {
    private Ribbon<T> underway;
    private int fashionNumeration;
    private boolean secondOwnsBecomePhoned;

    public SelectedInstantiation() {
      this.underway = ArrangedRanking.this.killing;
      this.fashionNumeration = ArrangedRanking.this.dodCharge;
      this.secondOwnsBecomePhoned = false;
    }

    public boolean hasNext() {
      return (this.underway.driveEarly() != ArrangedRanking.this.killing);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.fashionNumeration != ArrangedRanking.this.dodCharge)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + ArrangedRanking.this.hashCode() + " has no more elements");

      this.secondOwnsBecomePhoned = true;
      this.underway = this.underway.driveEarly();
      return this.underway.canNumbers();
    }

    public void remove() {

      if (this.fashionNumeration != ArrangedRanking.this.dodCharge)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.secondOwnsBecomePhoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.secondOwnsBecomePhoned = false;
      Ribbon<T> achieve = this.underway;
      this.underway = this.underway.fixRecord();
      this.underway.determineThird(achieve.driveEarly());
      achieve.driveEarly().fixedPredecessor(this.underway);
      this.fashionNumeration++;
      ArrangedRanking.this.dodCharge++;
      ArrangedRanking.this.enumeration--;
    }
  }
}
