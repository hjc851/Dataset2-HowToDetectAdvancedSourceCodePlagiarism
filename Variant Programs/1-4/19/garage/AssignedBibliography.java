package garage;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class AssignedBibliography<T extends Comparable<T>> implements Iterable<T> {
  public int defenceCalculate = 0;
  public int tell = 0;
  public final Nucleus<T> picket;

  public AssignedBibliography() {
    this.picket = new Nucleus<T>(null, null, null);
    this.picket.rigidCome(picket);
    this.picket.bentOriginal(picket);
    this.tell = 0;
    this.defenceCalculate = 0;
  }

  public synchronized void paste(T analysis) {
    CategorizedRecursion init;
    Nucleus<T> newlyKnob;
    init = new CategorizedRecursion();

    while (init.hasNext()) {

      if (analysis.compareTo(init.next()) >= 0) {
        break;
      }

      if (init.underway.comeFollowing() == this.picket) {
        Nucleus<T> untestedScn;
        untestedScn = new Nucleus<T>(analysis, this.picket, this.picket.receiveOld());
        this.picket.receiveOld().rigidCome(untestedScn);
        this.picket.bentOriginal(untestedScn);
        this.tell++;
        this.defenceCalculate++;
        return;
      }
    }
    newlyKnob = new Nucleus<T>(analysis, init.underway, init.underway.receiveOld());
    init.underway.receiveOld().rigidCome(newlyKnob);
    init.underway.bentOriginal(newlyKnob);
    this.tell++;
    this.defenceCalculate++;
  }

  public synchronized T removalOldest() {
    Nucleus<T> fahrenheit;
    fahrenheit = this.picket.comeFollowing();
    this.picket.rigidCome(fahrenheit.comeFollowing());
    fahrenheit.comeFollowing().bentOriginal(this.picket);

    if (this.tell > 0) this.tell--;

    this.defenceCalculate++;
    return fahrenheit.goInformation();
  }

  public synchronized T expelConcluding() {
    Nucleus<T> point;
    point = this.picket.receiveOld();
    this.picket.bentOriginal(point.receiveOld());
    point.receiveOld().rigidCome(this.picket);

    if (this.tell > 0) this.tell--;

    this.defenceCalculate++;
    return point.goInformation();
  }

  public synchronized void ejectMatter(T measurements) throws ArrayStoreException {
    CategorizedRecursion bool;
    bool = new CategorizedRecursion();

    while (bool.hasNext()) {

      if (bool.next() == measurements) {
        bool.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + measurements + " was not found");
  }

  public synchronized void eliminateMeasuredSubject(T results) throws ArrayStoreException {
    CategorizedRecursion substring;
    substring = new CategorizedRecursion();

    while (substring.hasNext()) {

      if (results.compareTo(substring.next()) == 0) {
        substring.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + results + " was not found");
  }

  public synchronized int census() {
    return this.tell;
  }

  public synchronized T basicOpposes() {
    return this.picket.comeFollowing().goInformation();
  }

  public synchronized T surviveMatter() {
    return this.picket.receiveOld().goInformation();
  }

  public synchronized boolean isVacant() {
    return (this.picket.comeFollowing() == this.picket);
  }

  public synchronized String toString() {
    StringBuffer barrier;
    CategorizedRecursion battologize;
    int i;
    barrier = new StringBuffer(this.hashCode() + " {\n");
    battologize = new CategorizedRecursion();
    i = 0;

    while (battologize.hasNext()) {
      barrier.append("[" + i + "]\t" + battologize.next() + "\n");
      i++;
    }
    barrier.append("}\n");
    return barrier.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new CategorizedRecursion();
  }

  public class CategorizedRecursion implements Iterator<T> {
    public boolean lastBoastsRemainedLabeled = false;
    public int fashionNumeration = 0;
    public Nucleus<T> underway = null;

    public CategorizedRecursion() {
      this.underway = AssignedBibliography.this.picket;
      this.fashionNumeration = AssignedBibliography.this.defenceCalculate;
      this.lastBoastsRemainedLabeled = false;
    }

    public synchronized boolean hasNext() {
      return (this.underway.comeFollowing() != AssignedBibliography.this.picket);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.fashionNumeration != AssignedBibliography.this.defenceCalculate)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + AssignedBibliography.this.hashCode() + " has no more elements");

      this.lastBoastsRemainedLabeled = true;
      this.underway = this.underway.comeFollowing();
      return this.underway.goInformation();
    }

    public synchronized void remove() {
      Nucleus<T> prey;

      if (this.fashionNumeration != AssignedBibliography.this.defenceCalculate)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.lastBoastsRemainedLabeled)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.lastBoastsRemainedLabeled = false;
      prey = this.underway;
      this.underway = this.underway.receiveOld();
      this.underway.rigidCome(prey.comeFollowing());
      prey.comeFollowing().bentOriginal(this.underway);
      this.fashionNumeration++;
      AssignedBibliography.this.defenceCalculate++;
      AssignedBibliography.this.tell--;
    }
  }
}
