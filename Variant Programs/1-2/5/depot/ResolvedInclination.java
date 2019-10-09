package depot;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ResolvedInclination<T extends Comparable<T>> implements Iterable<T> {
  private final Ganglia<T> controlled;
  private int tabulation;
  private int domEnumeration;

  public ResolvedInclination() {
    this.controlled = new Ganglia<T>(null, null, null);
    this.controlled.arrangedSucceeding(controlled);
    this.controlled.determinedPremature(controlled);
    this.tabulation = 0;
    this.domEnumeration = 0;
  }

  public void inscribe(T findings) {
    ClassifiedIterate pathname = new ClassifiedIterate();

    while (pathname.hasNext()) {

      if (findings.compareTo(pathname.next()) >= 0) {
        break;
      }

      if (pathname.prevalent.obtainLast() == this.controlled) {
        Ganglia<T> youngCore =
            new Ganglia<T>(findings, this.controlled, this.controlled.arriveFirst());
        this.controlled.arriveFirst().arrangedSucceeding(youngCore);
        this.controlled.determinedPremature(youngCore);
        this.tabulation++;
        this.domEnumeration++;
        return;
      }
    }
    Ganglia<T> modernGuest =
        new Ganglia<T>(findings, pathname.prevalent, pathname.prevalent.arriveFirst());
    pathname.prevalent.arriveFirst().arrangedSucceeding(modernGuest);
    pathname.prevalent.determinedPremature(modernGuest);
    this.tabulation++;
    this.domEnumeration++;
  }

  public T expelOriginal() {
    Ganglia<T> solvate = this.controlled.obtainLast();
    this.controlled.arrangedSucceeding(solvate.obtainLast());
    solvate.obtainLast().determinedPremature(this.controlled);

    if (this.tabulation > 0) this.tabulation--;

    this.domEnumeration++;
    return solvate.beatReadings();
  }

  public T expelConcluding() {
    Ganglia<T> goal = this.controlled.arriveFirst();
    this.controlled.determinedPremature(goal.arriveFirst());
    goal.arriveFirst().arrangedSucceeding(this.controlled);

    if (this.tabulation > 0) this.tabulation--;

    this.domEnumeration++;
    return goal.beatReadings();
  }

  public void hitObjection(T figures) throws ArrayStoreException {
    ClassifiedIterate parser = new ClassifiedIterate();

    while (parser.hasNext()) {

      if (parser.next() == figures) {
        parser.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + figures + " was not found");
  }

  public void yankDifferenceTotem(T study) throws ArrayStoreException {
    ClassifiedIterate instantiation = new ClassifiedIterate();

    while (instantiation.hasNext()) {

      if (study.compareTo(instantiation.next()) == 0) {
        instantiation.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + study + " was not found");
  }

  public int enumerate() {
    return this.tabulation;
  }

  public T openingArtifact() {
    return this.controlled.obtainLast().beatReadings();
  }

  public T closeDemur() {
    return this.controlled.arriveFirst().beatReadings();
  }

  public boolean isVacant() {
    return (this.controlled.obtainLast() == this.controlled);
  }

  public String toString() {
    StringBuffer cushioning = new StringBuffer(this.hashCode() + " {\n");
    ClassifiedIterate recursion = new ClassifiedIterate();
    int i = 0;

    while (recursion.hasNext()) {
      cushioning.append("[" + i + "]\t" + recursion.next() + "\n");
      i++;
    }
    cushioning.append("}\n");
    return cushioning.toString();
  }

  public Iterator<T> iterator() {
    return new ClassifiedIterate();
  }

  private class ClassifiedIterate implements Iterator<T> {
    private Ganglia<T> prevalent;
    private int stylishTally;
    private boolean aheadFeelsKeptDemanded;

    public ClassifiedIterate() {
      this.prevalent = ResolvedInclination.this.controlled;
      this.stylishTally = ResolvedInclination.this.domEnumeration;
      this.aheadFeelsKeptDemanded = false;
    }

    public boolean hasNext() {
      return (this.prevalent.obtainLast() != ResolvedInclination.this.controlled);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.stylishTally != ResolvedInclination.this.domEnumeration)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + ResolvedInclination.this.hashCode() + " has no more elements");

      this.aheadFeelsKeptDemanded = true;
      this.prevalent = this.prevalent.obtainLast();
      return this.prevalent.beatReadings();
    }

    public void remove() {

      if (this.stylishTally != ResolvedInclination.this.domEnumeration)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.aheadFeelsKeptDemanded)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.aheadFeelsKeptDemanded = false;
      Ganglia<T> place = this.prevalent;
      this.prevalent = this.prevalent.arriveFirst();
      this.prevalent.arrangedSucceeding(place.obtainLast());
      place.obtainLast().determinedPremature(this.prevalent);
      this.stylishTally++;
      ResolvedInclination.this.domEnumeration++;
      ResolvedInclination.this.tabulation--;
    }
  }
}
