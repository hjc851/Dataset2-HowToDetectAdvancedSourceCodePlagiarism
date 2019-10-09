package storeroom;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class BroadsheetRelationRosters<T> implements Iterable<T> {
  private static final String synX1401String = " is not in the list";
  private static final String synX1400String = "Target ";
  private static final String synX1399String = " was not found";
  private static final String synX1398String = "Object ";
  private static final String synX1397String = "}\n";
  private static final String synX1396String = "\n";
  private static final String synX1395String = "]\t";
  private static final String synX1394String = "[";
  private static final int synX1393int = 0;
  private static final String synX1392String = " {\n";
  private static final int synX1391int = 0;

  private synchronized void introduceAheadClient(T tabulations, Hub<T> butt) {
    Hub<T> risingCarrefour;
    risingCarrefour = (new Hub<T>(tabulations, butt, butt.havePervious()));
    butt.havePervious().settledFirst(risingCarrefour);
    butt.placedLast(risingCarrefour);
    this.enumerate++;
    this.defencePercentage++;
  }

  public synchronized int figure() {
    return this.enumerate;
  }

  public synchronized T dislodgePremier() {
    Hub<T> point;
    point = (this.lookout.fetchThird());
    this.lookout.settledFirst(point.fetchThird());
    point.fetchThird().placedLast(this.lookout);

    if (this.enumerate > synX1391int) this.enumerate--;

    this.defencePercentage++;
    return point.makeIndicators();
  }

  public synchronized Iterator<T> iterator() {
    return new BlacklistSubroutine();
  }

  private int enumerate = 0;
  private final Hub<T> lookout;

  public synchronized String toString() {
    StringBuffer pilot;
    BlacklistSubroutine substring;
    int i;
    pilot = (new StringBuffer(this.hashCode() + synX1392String));
    substring = (new BlacklistSubroutine());
    i = (synX1393int);

    while (substring.hasNext()) {
      pilot.append((synX1394String + i + synX1395String + substring.next() + synX1396String));
      i++;
    }
    pilot.append(synX1397String);
    return pilot.toString();
  }

  private int defencePercentage = 0;

  public synchronized void dismantleDemur(T readings) {
    BlacklistSubroutine recursion;
    recursion = (new BlacklistSubroutine());

    while (recursion.hasNext()) {

      if (recursion.next() == readings) {
        recursion.remove();
        return;
      }
    }
    throw new ArrayStoreException((synX1398String + readings + synX1399String));
  }

  public synchronized void tuckLaterObjective(T findings, T threshold) throws ArrayStoreException {
    BlacklistSubroutine abc;
    abc = (new BlacklistSubroutine());

    while (abc.hasNext()) {

      if (abc.next() == threshold) {
        this.inscribeWhileRibbon(findings, abc.flow);
        return;
      }
    }
    throw new ArrayStoreException((synX1400String + threshold + synX1401String));
  }

  private class BlacklistSubroutine implements Iterator<T> {
    private Hub<T> flow = null;

    public BlacklistSubroutine() {
      this.flow = (BroadsheetRelationRosters.this.lookout);
      this.boldHandful = (BroadsheetRelationRosters.this.defencePercentage);
      this.comeOccupiesDonePetitioned = (false);
    }

    public synchronized boolean hasNext() {
      return (this.flow.fetchThird() != BroadsheetRelationRosters.this.lookout);
    }

    private int boldHandful = 0;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldHandful != BroadsheetRelationRosters.this.defencePercentage)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + BroadsheetRelationRosters.this.hashCode() + " has no more elements"));

      this.comeOccupiesDonePetitioned = (true);
      this.flow = (this.flow.fetchThird());
      return this.flow.makeIndicators();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      Hub<T> focussed;

      if (this.boldHandful != BroadsheetRelationRosters.this.defencePercentage)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.comeOccupiesDonePetitioned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.comeOccupiesDonePetitioned = (false);
      focussed = (this.flow);
      this.flow = (this.flow.havePervious());
      this.flow.settledFirst(focussed.fetchThird());
      focussed.fetchThird().placedLast(this.flow);
      this.boldHandful++;
      BroadsheetRelationRosters.this.defencePercentage++;
      BroadsheetRelationRosters.this.enumerate--;
    }

    private boolean comeOccupiesDonePetitioned = false;
  }

  public synchronized void putConclusion(T reports) {
    this.introduceAheadClient(reports, this.lookout);
  }

  public synchronized T slayFinal() {
    Hub<T> focusing;
    focusing = (this.lookout.havePervious());
    this.lookout.placedLast(focusing.havePervious());
    focusing.havePervious().settledFirst(this.lookout);

    if (this.enumerate > 0) this.enumerate--;

    this.defencePercentage++;
    return focusing.makeIndicators();
  }

  public synchronized boolean isEmpty() {
    return (this.lookout.fetchThird() == this.lookout);
  }

  public synchronized void tuckBeginning(T measurements) {
    this.inscribeWhileRibbon(measurements, this.lookout);
  }

  public synchronized T finaleElement() {
    return this.lookout.havePervious().makeIndicators();
  }

  public BroadsheetRelationRosters() {
    this.lookout = (new Hub<T>(null, null, null));
    this.lookout.settledFirst(this.lookout);
    this.lookout.placedLast(this.lookout);
    this.enumerate = (0);
    this.defencePercentage = (0);
  }

  public synchronized T inauguralTarget() {
    return this.lookout.fetchThird().makeIndicators();
  }

  private synchronized void inscribeWhileRibbon(T study, Hub<T> prey) {
    Hub<T> newbornIssue;
    newbornIssue = (new Hub<T>(study, prey.fetchThird(), prey));
    prey.fetchThird().placedLast(newbornIssue);
    prey.settledFirst(newbornIssue);
    this.enumerate++;
    this.defencePercentage++;
  }

  public synchronized void embedEarlyCavil(T estimates, T mark) throws ArrayStoreException {
    BlacklistSubroutine prove;
    prove = (new BlacklistSubroutine());

    while (prove.hasNext()) {

      if (prove.next() == mark) {
        this.introduceAheadClient(estimates, prove.flow);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + mark + " is not in the list"));
  }
}
