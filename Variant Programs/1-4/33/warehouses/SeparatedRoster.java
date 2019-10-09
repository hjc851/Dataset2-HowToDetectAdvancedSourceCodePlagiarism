package warehouses;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SeparatedRoster<T extends Comparable<T>> implements Iterable<T> {
  public int moderateQuantify = 0;
  public int number = 0;
  public final Ganglia<T> surveillance;

  public SeparatedRoster() {
    this.surveillance = new Ganglia<T>(null, null, null);
    this.surveillance.situatedForthcoming(surveillance);
    this.surveillance.doFinal(surveillance);
    this.number = 0;
    this.moderateQuantify = 0;
  }

  public synchronized void paste(T records) {
    DividedNamespace substring;
    Ganglia<T> otherEntanglement;
    substring = new DividedNamespace();

    while (substring.hasNext()) {

      if (records.compareTo(substring.next()) >= 0) {
        break;
      }

      if (substring.stream.obtainLast() == this.surveillance) {
        Ganglia<T> refreshingRibbon;
        refreshingRibbon =
            new Ganglia<T>(records, this.surveillance, this.surveillance.findEarly());
        this.surveillance.findEarly().situatedForthcoming(refreshingRibbon);
        this.surveillance.doFinal(refreshingRibbon);
        this.number++;
        this.moderateQuantify++;
        return;
      }
    }
    otherEntanglement = new Ganglia<T>(records, substring.stream, substring.stream.findEarly());
    substring.stream.findEarly().situatedForthcoming(otherEntanglement);
    substring.stream.doFinal(otherEntanglement);
    this.number++;
    this.moderateQuantify++;
  }

  public synchronized T removalOldest() {
    Ganglia<T> thermometer;
    thermometer = this.surveillance.obtainLast();
    this.surveillance.situatedForthcoming(thermometer.obtainLast());
    thermometer.obtainLast().doFinal(this.surveillance);

    if (this.number > 0) this.number--;

    this.moderateQuantify++;
    return thermometer.haveStatistical();
  }

  public synchronized T hitPenultimate() {
    Ganglia<T> pinpoint;
    pinpoint = this.surveillance.findEarly();
    this.surveillance.doFinal(pinpoint.findEarly());
    pinpoint.findEarly().situatedForthcoming(this.surveillance);

    if (this.number > 0) this.number--;

    this.moderateQuantify++;
    return pinpoint.haveStatistical();
  }

  public synchronized void banishElement(T stats) throws ArrayStoreException {
    DividedNamespace tuple;
    tuple = new DividedNamespace();

    while (tuple.hasNext()) {

      if (tuple.next() == stats) {
        tuple.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + stats + " was not found");
  }

  public synchronized void dispatchComparativeItem(T reports) throws ArrayStoreException {
    DividedNamespace recursion;
    recursion = new DividedNamespace();

    while (recursion.hasNext()) {

      if (reports.compareTo(recursion.next()) == 0) {
        recursion.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + reports + " was not found");
  }

  public synchronized int tell() {
    return this.number;
  }

  public synchronized T primeElement() {
    return this.surveillance.obtainLast().haveStatistical();
  }

  public synchronized T finishOppose() {
    return this.surveillance.findEarly().haveStatistical();
  }

  public synchronized boolean isVacant() {
    return (this.surveillance.obtainLast() == this.surveillance);
  }

  public synchronized String toString() {
    StringBuffer separating;
    DividedNamespace subtree;
    int i;
    separating = new StringBuffer(this.hashCode() + " {\n");
    subtree = new DividedNamespace();
    i = 0;

    while (subtree.hasNext()) {
      separating.append("[" + i + "]\t" + subtree.next() + "\n");
      i++;
    }
    separating.append("}\n");
    return separating.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new DividedNamespace();
  }

  public class DividedNamespace implements Iterator<T> {
    public boolean soonHoldsUndergoneAsked = false;
    public int fashionNumeration = 0;
    public Ganglia<T> stream = null;

    public DividedNamespace() {
      this.stream = SeparatedRoster.this.surveillance;
      this.fashionNumeration = SeparatedRoster.this.moderateQuantify;
      this.soonHoldsUndergoneAsked = false;
    }

    public synchronized boolean hasNext() {
      return (this.stream.obtainLast() != SeparatedRoster.this.surveillance);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.fashionNumeration != SeparatedRoster.this.moderateQuantify)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + SeparatedRoster.this.hashCode() + " has no more elements");

      this.soonHoldsUndergoneAsked = true;
      this.stream = this.stream.obtainLast();
      return this.stream.haveStatistical();
    }

    public synchronized void remove() {
      Ganglia<T> limit;

      if (this.fashionNumeration != SeparatedRoster.this.moderateQuantify)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.soonHoldsUndergoneAsked)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.soonHoldsUndergoneAsked = false;
      limit = this.stream;
      this.stream = this.stream.findEarly();
      this.stream.situatedForthcoming(limit.obtainLast());
      limit.obtainLast().doFinal(this.stream);
      this.fashionNumeration++;
      SeparatedRoster.this.moderateQuantify++;
      SeparatedRoster.this.number--;
    }
  }
}
