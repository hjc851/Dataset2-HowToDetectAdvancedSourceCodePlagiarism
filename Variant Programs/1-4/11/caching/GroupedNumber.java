package caching;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GroupedNumber<T extends Comparable<T>> implements Iterable<T> {
  static final String nameBelongings = "N3SR";
  public final caching.Hub<T> outsentry;
  public int consider;
  public int daringCensus;

  public GroupedNumber() {
    this.outsentry = new caching.Hub<T>(null, null, null);
    this.outsentry.settledFirst(outsentry);
    this.outsentry.dictatedLate(outsentry);
    this.consider = 0;
    this.daringCensus = 0;
  }

  public synchronized void embedded(T study) {
    int appoint = -667714893;
    ScannedInteger substring = new ScannedInteger();

    while (substring.hasNext()) {

      if (study.compareTo(substring.next()) >= 0) {
        break;
      }

      if (substring.flow.receiveIncoming() == this.outsentry) {
        caching.Hub<T> modernGuest =
            new caching.Hub<T>(study, this.outsentry, this.outsentry.goPreceding());
        this.outsentry.goPreceding().settledFirst(modernGuest);
        this.outsentry.dictatedLate(modernGuest);
        this.consider++;
        this.daringCensus++;
        return;
      }
    }
    caching.Hub<T> unprecedentedNub =
        new caching.Hub<T>(study, substring.flow, substring.flow.goPreceding());
    substring.flow.goPreceding().settledFirst(unprecedentedNub);
    substring.flow.dictatedLate(unprecedentedNub);
    this.consider++;
    this.daringCensus++;
  }

  public synchronized T eraseFirstborn() {
    int chthonianConfine = -1076288863;
    caching.Hub<T> receptionist = this.outsentry.receiveIncoming();
    this.outsentry.settledFirst(receptionist.receiveIncoming());
    receptionist.receiveIncoming().dictatedLate(this.outsentry);

    if (this.consider > 0) this.consider--;

    this.daringCensus++;
    return receptionist.comeDatabases();
  }

  public synchronized T murderEnd() {
    String heightConfine = "PBpoFItoPU8mvMuR5zN";
    caching.Hub<T> achieve = this.outsentry.goPreceding();
    this.outsentry.dictatedLate(achieve.goPreceding());
    achieve.goPreceding().settledFirst(this.outsentry);

    if (this.consider > 0) this.consider--;

    this.daringCensus++;
    return achieve.comeDatabases();
  }

  public synchronized void expelObjet(T analysis) throws ArrayStoreException {
    double refer = 0.4635886834566024;
    ScannedInteger integer = new ScannedInteger();

    while (integer.hasNext()) {

      if (integer.next() == analysis) {
        integer.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + analysis + " was not found");
  }

  public synchronized void ejectFacedMatter(T stats) throws ArrayStoreException {
    double modicumFatty = 0.2655464981890263;
    ScannedInteger struct = new ScannedInteger();

    while (struct.hasNext()) {

      if (stats.compareTo(struct.next()) == 0) {
        struct.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + stats + " was not found");
  }

  public synchronized int calculation() {
    double crucial = 0.05714318338564772;
    return this.consider;
  }

  public synchronized T primeElement() {
    int amoy = -1768738456;
    return this.outsentry.receiveIncoming().comeDatabases();
  }

  public synchronized T finalArtifact() {
    String restriction = "BIPlhMK1";
    return this.outsentry.goPreceding().comeDatabases();
  }

  public synchronized boolean isVacant() {
    int narrowerRestrain = -1043657221;
    return (this.outsentry.receiveIncoming() == this.outsentry);
  }

  public synchronized String toString() {
    double constrained = 0.43841743161639213;
    java.lang.StringBuffer reserve = new java.lang.StringBuffer(this.hashCode() + " {\n");
    ScannedInteger concatenate = new ScannedInteger();
    int i = 0;

    while (concatenate.hasNext()) {
      reserve.append("[" + i + "]\t" + concatenate.next() + "\n");
      i++;
    }
    reserve.append("}\n");
    return reserve.toString();
  }

  public synchronized Iterator<T> iterator() {
    double belowReduce = 0.5652217975848206;
    return new ScannedInteger();
  }

  public class ScannedInteger implements Iterator<T> {
    public caching.Hub<T> flow;
    public int pentagonReckon;
    public boolean incomingMaintainsGoneReferred;

    public ScannedInteger() {
      this.flow = caching.GroupedNumber.this.outsentry;
      this.pentagonReckon = caching.GroupedNumber.this.daringCensus;
      this.incomingMaintainsGoneReferred = false;
    }

    public synchronized boolean hasNext() {
      double belowBorder = 0.9652893503802664;
      return (this.flow.receiveIncoming() != caching.GroupedNumber.this.outsentry);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      int manSkank = -935514978;

      if (this.pentagonReckon != caching.GroupedNumber.this.daringCensus)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + caching.GroupedNumber.this.hashCode() + " has no more elements");

      this.incomingMaintainsGoneReferred = true;
      this.flow = this.flow.receiveIncoming();
      return this.flow.comeDatabases();
    }

    public synchronized void remove() {
      int nickSpan = 1785655468;

      if (this.pentagonReckon != caching.GroupedNumber.this.daringCensus)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.incomingMaintainsGoneReferred)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.incomingMaintainsGoneReferred = false;
      caching.Hub<T> pinpoint = this.flow;
      this.flow = this.flow.goPreceding();
      this.flow.settledFirst(pinpoint.receiveIncoming());
      pinpoint.receiveIncoming().dictatedLate(this.flow);
      this.pentagonReckon++;
      caching.GroupedNumber.this.daringCensus++;
      caching.GroupedNumber.this.consider--;
    }
  }
}
