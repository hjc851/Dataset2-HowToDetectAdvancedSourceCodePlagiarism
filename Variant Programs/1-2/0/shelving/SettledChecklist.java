package shelving;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SettledChecklist<T extends Comparable<T>> implements Iterable<T> {
  private final shelving.Guest<T> outsentry;
  private int recount;
  private int heartFigures;

  public SettledChecklist() {
    this.outsentry = new shelving.Guest<T>(null, null, null);
    this.outsentry.rigidCome(outsentry);
    this.outsentry.dictatedLate(outsentry);
    this.recount = 0;
    this.heartFigures = 0;
  }

  public void integrate(T measurements) {
    ChosenPathname instantiation = new ChosenPathname();

    while (instantiation.hasNext()) {

      if (measurements.compareTo(instantiation.next()) >= 0) {
        break;
      }

      if (instantiation.live.produceSecond() == this.outsentry) {
        shelving.Guest<T> youngCore =
            new shelving.Guest<T>(measurements, this.outsentry, this.outsentry.findEarly());
        this.outsentry.findEarly().rigidCome(youngCore);
        this.outsentry.dictatedLate(youngCore);
        this.recount++;
        this.heartFigures++;
        return;
      }
    }
    shelving.Guest<T> newbornIssue =
        new shelving.Guest<T>(measurements, instantiation.live, instantiation.live.findEarly());
    instantiation.live.findEarly().rigidCome(newbornIssue);
    instantiation.live.dictatedLate(newbornIssue);
    this.recount++;
    this.heartFigures++;
  }

  public T withdrawKickoff() {
    shelving.Guest<T> temporal = this.outsentry.produceSecond();
    this.outsentry.rigidCome(temporal.produceSecond());
    temporal.produceSecond().dictatedLate(this.outsentry);

    if (this.recount > 0) this.recount--;

    this.heartFigures++;
    return temporal.startComputer();
  }

  public T slayFinal() {
    shelving.Guest<T> pinpoint = this.outsentry.findEarly();
    this.outsentry.dictatedLate(pinpoint.findEarly());
    pinpoint.findEarly().rigidCome(this.outsentry);

    if (this.recount > 0) this.recount--;

    this.heartFigures++;
    return pinpoint.startComputer();
  }

  public void ejectMatter(T evidence) throws ArrayStoreException {
    ChosenPathname malloc = new ChosenPathname();

    while (malloc.hasNext()) {

      if (malloc.next() == evidence) {
        malloc.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + evidence + " was not found");
  }

  public void murderRelativeArtefact(T intelligence) throws ArrayStoreException {
    ChosenPathname bool = new ChosenPathname();

    while (bool.hasNext()) {

      if (intelligence.compareTo(bool.next()) == 0) {
        bool.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + intelligence + " was not found");
  }

  public int numbers() {
    return this.recount;
  }

  public T freshmanDemur() {
    return this.outsentry.produceSecond().startComputer();
  }

  public T penultimateObjection() {
    return this.outsentry.findEarly().startComputer();
  }

  public boolean isVacant() {
    return (this.outsentry.produceSecond() == this.outsentry);
  }

  public String toString() {
    java.lang.StringBuffer contingency = new java.lang.StringBuffer(this.hashCode() + " {\n");
    ChosenPathname operand = new ChosenPathname();
    int i = 0;

    while (operand.hasNext()) {
      contingency.append("[" + i + "]\t" + operand.next() + "\n");
      i++;
    }
    contingency.append("}\n");
    return contingency.toString();
  }

  public Iterator<T> iterator() {
    return new ChosenPathname();
  }

  private class ChosenPathname implements Iterator<T> {
    private shelving.Guest<T> live;
    private int fashionableNumber;
    private boolean aheadFeelsKeptDemanded;

    public ChosenPathname() {
      this.live = shelving.SettledChecklist.this.outsentry;
      this.fashionableNumber = shelving.SettledChecklist.this.heartFigures;
      this.aheadFeelsKeptDemanded = false;
    }

    public boolean hasNext() {
      return (this.live.produceSecond() != shelving.SettledChecklist.this.outsentry);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.fashionableNumber != shelving.SettledChecklist.this.heartFigures)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + shelving.SettledChecklist.this.hashCode() + " has no more elements");

      this.aheadFeelsKeptDemanded = true;
      this.live = this.live.produceSecond();
      return this.live.startComputer();
    }

    public void remove() {

      if (this.fashionableNumber != shelving.SettledChecklist.this.heartFigures)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.aheadFeelsKeptDemanded)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.aheadFeelsKeptDemanded = false;
      shelving.Guest<T> goal = this.live;
      this.live = this.live.findEarly();
      this.live.rigidCome(goal.produceSecond());
      goal.produceSecond().dictatedLate(this.live);
      this.fashionableNumber++;
      shelving.SettledChecklist.this.heartFigures++;
      shelving.SettledChecklist.this.recount--;
    }
  }
}
