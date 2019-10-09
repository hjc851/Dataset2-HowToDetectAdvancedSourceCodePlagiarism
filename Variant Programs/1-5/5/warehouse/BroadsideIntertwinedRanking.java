package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class BroadsideIntertwinedRanking<T> implements Iterable<T> {
  private static final String synX472String = " is not in the list";
  private static final String synX471String = "Target ";
  private static final String synX470String = " was not found";
  private static final String synX469String = "Object ";
  private static final int synX468int = 0;
  private static final int synX467int = 0;
  private static final int synX466int = 0;
  private static final String synX465String = " is not in the list";
  private static final String synX464String = "Target ";
  private static final int synX463int = 0;
  private static final String synX462String = "}\n";
  private static final String synX461String = "\n";
  private static final String synX460String = "]\t";
  private static final String synX459String = "[";
  private static final int synX458int = 0;
  private static final String synX457String = " {\n";

  public synchronized int quantify() {
    return this.tell;
  }

  public synchronized String toString() {
    java.lang.StringBuffer barrier = new java.lang.StringBuffer(this.hashCode() + synX457String);
    BlacklistSubroutine subtree = new BlacklistSubroutine();
    int i = synX458int;

    while (subtree.hasNext()) {
      barrier.append(synX459String + i + synX460String + subtree.next() + synX461String);
      i++;
    }
    barrier.append(synX462String);
    return barrier.toString();
  }

  private final warehouse.Point<T> arbovirus;

  public synchronized void incorporatedGo(T readings) {
    this.appendDuringProtuberance(readings, this.arbovirus);
  }

  public synchronized T ejectSurvive() {
    warehouse.Point<T> achieve = this.arbovirus.obtainPremature();
    this.arbovirus.doFinal(achieve.obtainPremature());
    achieve.obtainPremature().markAhead(this.arbovirus);

    if (this.tell > synX463int) this.tell--;

    this.fashionTurn++;
    return achieve.fetchTabulations();
  }

  public synchronized boolean isEmpty() {
    return (this.arbovirus.haveFirst() == this.arbovirus);
  }

  public synchronized void integrateSwiftlyDisagree(T measurements, T point)
      throws ArrayStoreException {
    BlacklistSubroutine fad = new BlacklistSubroutine();

    while (fad.hasNext()) {

      if (fad.next() == point) {
        this.appendDuringProtuberance(measurements, fad.prevailing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException(synX464String + point + synX465String);
  }

  public synchronized T undoBasic() {
    warehouse.Point<T> goals = this.arbovirus.haveFirst();
    this.arbovirus.markAhead(goals.haveFirst());
    goals.haveFirst().doFinal(this.arbovirus);

    if (this.tell > synX466int) this.tell--;

    this.fashionTurn++;
    return goals.fetchTabulations();
  }

  private synchronized void appendDuringProtuberance(T stats, warehouse.Point<T> focused) {
    warehouse.Point<T> recentPoint =
        new warehouse.Point<T>(stats, focused, focused.obtainPremature());
    focused.obtainPremature().markAhead(recentPoint);
    focused.doFinal(recentPoint);
    this.tell++;
    this.fashionTurn++;
  }

  public synchronized T maidenItem() {
    return this.arbovirus.haveFirst().fetchTabulations();
  }

  public BroadsideIntertwinedRanking() {
    this.arbovirus = new warehouse.Point<T>(null, null, null);
    this.arbovirus.markAhead(this.arbovirus);
    this.arbovirus.doFinal(this.arbovirus);
    this.tell = synX467int;
    this.fashionTurn = synX468int;
  }

  public synchronized Iterator<T> iterator() {
    return new BlacklistSubroutine();
  }

  public synchronized void installPreclude(T estimates) {
    BlacklistSubroutine init = new BlacklistSubroutine();

    while (init.hasNext()) {

      if (init.next() == estimates) {
        init.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(synX469String + estimates + synX470String);
  }

  private synchronized void putFromPoint(T evidence, warehouse.Point<T> butt) {
    warehouse.Point<T> refreshingRibbon = new warehouse.Point<T>(evidence, butt.haveFirst(), butt);
    butt.haveFirst().doFinal(refreshingRibbon);
    butt.markAhead(refreshingRibbon);
    this.tell++;
    this.fashionTurn++;
  }

  public synchronized T finishOppose() {
    return this.arbovirus.obtainPremature().fetchTabulations();
  }

  private int fashionTurn;

  public synchronized void introduceInaugural(T information) {
    this.putFromPoint(information, this.arbovirus);
  }

  private int tell;

  public synchronized void integrateWithinDisagree(T study, T benchmark)
      throws ArrayStoreException {
    BlacklistSubroutine ace = new BlacklistSubroutine();

    while (ace.hasNext()) {

      if (ace.next() == benchmark) {
        this.putFromPoint(study, ace.prevailing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException(synX471String + benchmark + synX472String);
  }

  private class BlacklistSubroutine implements Iterator<T> {
    private boolean againOwesArisenChristened;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.iloBit != warehouse.BroadsideIntertwinedRanking.this.fashionTurn)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List "
                + warehouse.BroadsideIntertwinedRanking.this.hashCode()
                + " has no more elements");

      this.againOwesArisenChristened = true;
      this.prevailing = this.prevailing.haveFirst();
      return this.prevailing.fetchTabulations();
    }

    private int iloBit;

    public BlacklistSubroutine() {
      this.prevailing = warehouse.BroadsideIntertwinedRanking.this.arbovirus;
      this.iloBit = warehouse.BroadsideIntertwinedRanking.this.fashionTurn;
      this.againOwesArisenChristened = false;
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.iloBit != warehouse.BroadsideIntertwinedRanking.this.fashionTurn)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.againOwesArisenChristened)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.againOwesArisenChristened = false;
      warehouse.Point<T> place = this.prevailing;
      this.prevailing = this.prevailing.obtainPremature();
      this.prevailing.markAhead(place.haveFirst());
      place.haveFirst().doFinal(this.prevailing);
      this.iloBit++;
      warehouse.BroadsideIntertwinedRanking.this.fashionTurn++;
      warehouse.BroadsideIntertwinedRanking.this.tell--;
    }

    public synchronized boolean hasNext() {
      return (this.prevailing.haveFirst() != warehouse.BroadsideIntertwinedRanking.this.arbovirus);
    }

    private warehouse.Point<T> prevailing;
  }
}
