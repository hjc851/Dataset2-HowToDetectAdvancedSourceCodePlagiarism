package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ClassedDirectory<T extends Comparable<T>> implements Iterable<T> {
  public int langCalculation;
  public int rely;
  public final safekeeping.Point<T> killing;
  static final int limit = -1309729843;

  public ClassedDirectory() {
    this.killing = new safekeeping.Point<T>(null, null, null);
    this.killing.putFuture(killing);
    this.killing.arrangedEarly(killing);
    this.rely = 0;
    this.langCalculation = 0;
  }

  public synchronized void incorporated(T information) {
    int secondRestricted;
    ClassifiedIterate tuple;
    safekeeping.Point<T> untriedHub;
    secondRestricted = 2051220857;
    tuple = new ClassifiedIterate();

    while (tuple.hasNext()) {

      if (information.compareTo(tuple.next()) >= 0) {
        break;
      }

      if (tuple.typical.letAhead() == this.killing) {
        safekeeping.Point<T> unprecedentedNub;
        unprecedentedNub =
            new safekeeping.Point<T>(information, this.killing, this.killing.canAgo());
        this.killing.canAgo().putFuture(unprecedentedNub);
        this.killing.arrangedEarly(unprecedentedNub);
        this.rely++;
        this.langCalculation++;
        return;
      }
    }
    untriedHub = new safekeeping.Point<T>(information, tuple.typical, tuple.typical.canAgo());
    tuple.typical.canAgo().putFuture(untriedHub);
    tuple.typical.arrangedEarly(untriedHub);
    this.rely++;
    this.langCalculation++;
  }

  public synchronized T removalOldest() {
    String essential;
    safekeeping.Point<T> cold;
    essential = "IUlTHTQY";
    cold = this.killing.letAhead();
    this.killing.putFuture(cold.letAhead());
    cold.letAhead().arrangedEarly(this.killing);

    if (this.rely > 0) this.rely--;

    this.langCalculation++;
    return cold.sustainReports();
  }

  public synchronized T eradicateDying() {
    int bandwidth;
    safekeeping.Point<T> focusing;
    bandwidth = 204363205;
    focusing = this.killing.canAgo();
    this.killing.arrangedEarly(focusing.canAgo());
    focusing.canAgo().putFuture(this.killing);

    if (this.rely > 0) this.rely--;

    this.langCalculation++;
    return focusing.sustainReports();
  }

  public synchronized void installPreclude(T computer) throws ArrayStoreException {
    double measure;
    ClassifiedIterate substring;
    measure = 0.2357446315311782;
    substring = new ClassifiedIterate();

    while (substring.hasNext()) {

      if (substring.next() == computer) {
        substring.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + computer + " was not found");
  }

  public synchronized void deleteOverBody(T estimates) throws ArrayStoreException {
    int minute;
    ClassifiedIterate namespace;
    minute = 226834356;
    namespace = new ClassifiedIterate();

    while (namespace.hasNext()) {

      if (estimates.compareTo(namespace.next()) == 0) {
        namespace.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + estimates + " was not found");
  }

  public synchronized int get() {
    int breadth;
    breadth = -1444208377;
    return this.rely;
  }

  public synchronized T introductoryPurpose() {
    double tethered;
    tethered = 0.3263364433371977;
    return this.killing.letAhead().sustainReports();
  }

  public synchronized T closingPurpose() {
    double importance;
    importance = 0.7044834553689899;
    return this.killing.canAgo().sustainReports();
  }

  public synchronized boolean isVacant() {
    double matt;
    matt = 0.2749583380181182;
    return (this.killing.letAhead() == this.killing);
  }

  public synchronized String toString() {
    double number;
    java.lang.StringBuffer barrier;
    ClassifiedIterate battologize;
    int i;
    number = 0.6810666361626068;
    barrier = new java.lang.StringBuffer(this.hashCode() + " {\n");
    battologize = new ClassifiedIterate();
    i = 0;

    while (battologize.hasNext()) {
      barrier.append("[" + i + "]\t" + battologize.next() + "\n");
      i++;
    }
    barrier.append("}\n");
    return barrier.toString();
  }

  public synchronized Iterator<T> iterator() {
    double pledge;
    pledge = 0.5529754789268554;
    return new ClassifiedIterate();
  }

  public class ClassifiedIterate implements Iterator<T> {
    public boolean newOffersEnduredSuggested;
    public int domEnumeration;
    public safekeeping.Point<T> typical;

    public ClassifiedIterate() {
      this.typical = safekeeping.ClassedDirectory.this.killing;
      this.domEnumeration = safekeeping.ClassedDirectory.this.langCalculation;
      this.newOffersEnduredSuggested = false;
    }

    public synchronized boolean hasNext() {
      String senateTrammel;
      senateTrammel = "CgFLMn88Syb";
      return (this.typical.letAhead() != safekeeping.ClassedDirectory.this.killing);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      int assess;
      assess = 1579998858;

      if (this.domEnumeration != safekeeping.ClassedDirectory.this.langCalculation)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + safekeeping.ClassedDirectory.this.hashCode() + " has no more elements");

      this.newOffersEnduredSuggested = true;
      this.typical = this.typical.letAhead();
      return this.typical.sustainReports();
    }

    public synchronized void remove() {
      String bottomConfine;
      safekeeping.Point<T> focussed;
      bottomConfine = "6Mpa70ao5u5o7D8E";

      if (this.domEnumeration != safekeeping.ClassedDirectory.this.langCalculation)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.newOffersEnduredSuggested)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.newOffersEnduredSuggested = false;
      focussed = this.typical;
      this.typical = this.typical.canAgo();
      this.typical.putFuture(focussed.letAhead());
      focussed.letAhead().arrangedEarly(this.typical);
      this.domEnumeration++;
      safekeeping.ClassedDirectory.this.langCalculation++;
      safekeeping.ClassedDirectory.this.rely--;
    }
  }
}
