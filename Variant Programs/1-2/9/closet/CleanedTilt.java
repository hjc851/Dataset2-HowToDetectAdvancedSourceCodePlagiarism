package closet;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class CleanedTilt<T extends Comparable<T>> implements Iterable<T> {
  private final closet.Junction<T> monitoring;
  private int quantify;
  private int dodCharge;

  public CleanedTilt() {
    this.monitoring = new closet.Junction<T>(null, null, null);
    this.monitoring.orderedAgain(monitoring);
    this.monitoring.settledPervious(monitoring);
    this.quantify = 0;
    this.dodCharge = 0;
  }

  public void injected(T study) {
    GroupedTuple subtree = new GroupedTuple();

    while (subtree.hasNext()) {

      if (study.compareTo(subtree.next()) >= 0) {
        break;
      }

      if (subtree.prevalent.beatThe() == this.monitoring) {
        closet.Junction<T> originalAntenna =
            new closet.Junction<T>(study, this.monitoring, this.monitoring.sustainPre());
        this.monitoring.sustainPre().orderedAgain(originalAntenna);
        this.monitoring.settledPervious(originalAntenna);
        this.quantify++;
        this.dodCharge++;
        return;
      }
    }
    closet.Junction<T> revolutionaryGanglia =
        new closet.Junction<T>(study, subtree.prevalent, subtree.prevalent.sustainPre());
    subtree.prevalent.sustainPre().orderedAgain(revolutionaryGanglia);
    subtree.prevalent.settledPervious(revolutionaryGanglia);
    this.quantify++;
    this.dodCharge++;
  }

  public T discardIntroductory() {
    closet.Junction<T> permanents = this.monitoring.beatThe();
    this.monitoring.orderedAgain(permanents.beatThe());
    permanents.beatThe().settledPervious(this.monitoring);

    if (this.quantify > 0) this.quantify--;

    this.dodCharge++;
    return permanents.canNumbers();
  }

  public T hitPenultimate() {
    closet.Junction<T> threshold = this.monitoring.sustainPre();
    this.monitoring.settledPervious(threshold.sustainPre());
    threshold.sustainPre().orderedAgain(this.monitoring);

    if (this.quantify > 0) this.quantify--;

    this.dodCharge++;
    return threshold.canNumbers();
  }

  public void installPreclude(T figures) throws ArrayStoreException {
    GroupedTuple init = new GroupedTuple();

    while (init.hasNext()) {

      if (init.next() == figures) {
        init.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + figures + " was not found");
  }

  public void dismantleOpposedDemur(T evidence) throws ArrayStoreException {
    GroupedTuple integer = new GroupedTuple();

    while (integer.hasNext()) {

      if (evidence.compareTo(integer.next()) == 0) {
        integer.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + evidence + " was not found");
  }

  public int consider() {
    return this.quantify;
  }

  public T kickoffItems() {
    return this.monitoring.beatThe().canNumbers();
  }

  public T pastObjective() {
    return this.monitoring.sustainPre().canNumbers();
  }

  public boolean isVacant() {
    return (this.monitoring.beatThe() == this.monitoring);
  }

  public String toString() {
    java.lang.StringBuffer cushioning = new java.lang.StringBuffer(this.hashCode() + " {\n");
    GroupedTuple malloc = new GroupedTuple();
    int i = 0;

    while (malloc.hasNext()) {
      cushioning.append("[" + i + "]\t" + malloc.next() + "\n");
      i++;
    }
    cushioning.append("}\n");
    return cushioning.toString();
  }

  public Iterator<T> iterator() {
    return new GroupedTuple();
  }

  private class GroupedTuple implements Iterator<T> {
    private closet.Junction<T> prevalent;
    private int fashionNumeration;
    private boolean aheadFeelsKeptDemanded;

    public GroupedTuple() {
      this.prevalent = closet.CleanedTilt.this.monitoring;
      this.fashionNumeration = closet.CleanedTilt.this.dodCharge;
      this.aheadFeelsKeptDemanded = false;
    }

    public boolean hasNext() {
      return (this.prevalent.beatThe() != closet.CleanedTilt.this.monitoring);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.fashionNumeration != closet.CleanedTilt.this.dodCharge)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + closet.CleanedTilt.this.hashCode() + " has no more elements");

      this.aheadFeelsKeptDemanded = true;
      this.prevalent = this.prevalent.beatThe();
      return this.prevalent.canNumbers();
    }

    public void remove() {

      if (this.fashionNumeration != closet.CleanedTilt.this.dodCharge)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.aheadFeelsKeptDemanded)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.aheadFeelsKeptDemanded = false;
      closet.Junction<T> direct = this.prevalent;
      this.prevalent = this.prevalent.sustainPre();
      this.prevalent.orderedAgain(direct.beatThe());
      direct.beatThe().settledPervious(this.prevalent);
      this.fashionNumeration++;
      closet.CleanedTilt.this.dodCharge++;
      closet.CleanedTilt.this.quantify--;
    }
  }
}
