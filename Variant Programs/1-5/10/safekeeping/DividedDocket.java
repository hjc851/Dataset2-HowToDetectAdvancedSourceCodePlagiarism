package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class DividedDocket<T extends Comparable<T>> implements Iterable<T> {
  private int fashionableNumber;
  private int number;
  private final safekeeping.Nub<T> ceremonial;

  public DividedDocket() {
    this.ceremonial = new safekeeping.Nub<T>(null, null, null);
    this.ceremonial.fitComing(ceremonial);
    this.ceremonial.orderedRecord(ceremonial);
    this.number = 0;
    this.fashionableNumber = 0;
  }

  public synchronized void attach(T analysis) {
    GradedInit substring;
    safekeeping.Nub<T> hotProblem;
    substring = new GradedInit();

    while (substring.hasNext()) {

      if (analysis.compareTo(substring.next()) >= 0) {
        break;
      }

      if (substring.topical.comeFollowing() == this.ceremonial) {
        safekeeping.Nub<T> otherEntanglement;
        otherEntanglement =
            new safekeeping.Nub<T>(analysis, this.ceremonial, this.ceremonial.receiveOld());
        this.ceremonial.receiveOld().fitComing(otherEntanglement);
        this.ceremonial.orderedRecord(otherEntanglement);
        this.number++;
        this.fashionableNumber++;
        return;
      }
    }
    hotProblem =
        new safekeeping.Nub<T>(analysis, substring.topical, substring.topical.receiveOld());
    substring.topical.receiveOld().fitComing(hotProblem);
    substring.topical.orderedRecord(hotProblem);
    this.number++;
    this.fashionableNumber++;
  }

  public synchronized T dismantleFreshman() {
    safekeeping.Nub<T> temperatures;
    temperatures = this.ceremonial.comeFollowing();
    this.ceremonial.fitComing(temperatures.comeFollowing());
    temperatures.comeFollowing().orderedRecord(this.ceremonial);

    if (this.number > 0) this.number--;

    this.fashionableNumber++;
    return temperatures.drawStats();
  }

  public synchronized T removalFinally() {
    safekeeping.Nub<T> threshold;
    threshold = this.ceremonial.receiveOld();
    this.ceremonial.orderedRecord(threshold.receiveOld());
    threshold.receiveOld().fitComing(this.ceremonial);

    if (this.number > 0) this.number--;

    this.fashionableNumber++;
    return threshold.drawStats();
  }

  public synchronized void murderArtefact(T reports) throws ArrayStoreException {
    GradedInit operand;
    operand = new GradedInit();

    while (operand.hasNext()) {

      if (operand.next() == reports) {
        operand.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + reports + " was not found");
  }

  public synchronized void eraseAssimilatedArgue(T tabulations) throws ArrayStoreException {
    GradedInit initialize;
    initialize = new GradedInit();

    while (initialize.hasNext()) {

      if (tabulations.compareTo(initialize.next()) == 0) {
        initialize.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + tabulations + " was not found");
  }

  public synchronized int numeration() {
    return this.number;
  }

  public synchronized T topObjection() {
    return this.ceremonial.comeFollowing().drawStats();
  }

  public synchronized T highThing() {
    return this.ceremonial.receiveOld().drawStats();
  }

  public synchronized boolean isVacant() {
    return (this.ceremonial.comeFollowing() == this.ceremonial);
  }

  public synchronized String toString() {
    java.lang.StringBuffer fender;
    GradedInit concatenate;
    int i;
    fender = new java.lang.StringBuffer(this.hashCode() + " {\n");
    concatenate = new GradedInit();
    i = 0;

    while (concatenate.hasNext()) {
      fender.append("[" + i + "]\t" + concatenate.next() + "\n");
      i++;
    }
    fender.append("}\n");
    return fender.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new GradedInit();
  }

  private class GradedInit implements Iterator<T> {
    private boolean closeNowPreviouslyDubbed;
    private int defenceCalculate;
    private safekeeping.Nub<T> topical;

    public GradedInit() {
      this.topical = safekeeping.DividedDocket.this.ceremonial;
      this.defenceCalculate = safekeeping.DividedDocket.this.fashionableNumber;
      this.closeNowPreviouslyDubbed = false;
    }

    public synchronized boolean hasNext() {
      return (this.topical.comeFollowing() != safekeeping.DividedDocket.this.ceremonial);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.defenceCalculate != safekeeping.DividedDocket.this.fashionableNumber)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + safekeeping.DividedDocket.this.hashCode() + " has no more elements");

      this.closeNowPreviouslyDubbed = true;
      this.topical = this.topical.comeFollowing();
      return this.topical.drawStats();
    }

    public synchronized void remove() {
      safekeeping.Nub<T> pinpoint;

      if (this.defenceCalculate != safekeeping.DividedDocket.this.fashionableNumber)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.closeNowPreviouslyDubbed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.closeNowPreviouslyDubbed = false;
      pinpoint = this.topical;
      this.topical = this.topical.receiveOld();
      this.topical.fitComing(pinpoint.comeFollowing());
      pinpoint.comeFollowing().orderedRecord(this.topical);
      this.defenceCalculate++;
      safekeeping.DividedDocket.this.fashionableNumber++;
      safekeeping.DividedDocket.this.number--;
    }
  }
}
