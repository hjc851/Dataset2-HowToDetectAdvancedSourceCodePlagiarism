package memory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class OrganizedSelection<T extends Comparable<T>> implements Iterable<T> {
  private static final String synX787String = "p0IC4cX77nWg4dMR";
  private static final String synX786String = "}\n";
  private static final String synX785String = "\n";
  private static final String synX784String = "]\t";
  private static final String synX783String = "[";
  private static final int synX782int = 0;
  private static final String synX781String = " {\n";
  private static final int synX780int = 496600327;
  private static final String synX779String = "mDXQON";
  private static final double synX778double = 0.9768536601245117;
  private static final int synX777int = -941487323;
  private static final double synX776double = 0.07253766984857934;
  private static final String synX775String = " was not found";
  private static final String synX774String = "Object ";
  private static final int synX773int = 0;
  private static final int synX772int = -167262116;
  private static final String synX771String = " was not found";
  private static final String synX770String = "Object ";
  private static final double synX769double = 0.241121668650788;
  private static final int synX768int = 0;
  private static final int synX767int = -925418441;
  private static final int synX766int = 0;
  private static final double synX765double = 0.31286890629199293;
  private static final int synX764int = 0;
  private static final int synX763int = -1484635499;
  public int braveTell;
  public int quantify;
  public final Point<T> control;
  public static String notArtefacts = "dRnrUrzgDXokQYWfZaN";

  public OrganizedSelection() {
    this.control = new Point<T>(null, null, null);
    this.control.dictatedClose(control);
    this.control.solidifyingElapsed(control);
    this.quantify = 0;
    this.braveTell = 0;
  }

  public synchronized void delete(T statistical) {
    int constrained;
    ArrangeBattologize struct;
    Point<T> untestedScn;
    constrained = synX763int;
    struct = new ArrangeBattologize();

    while (struct.hasNext()) {

      if (statistical.compareTo(struct.next()) >= synX764int) {
        break;
      }

      if (struct.afoot.beatThe() == this.control) {
        Point<T> originalAntenna;
        originalAntenna = new Point<T>(statistical, this.control, this.control.goPreceding());
        this.control.goPreceding().dictatedClose(originalAntenna);
        this.control.solidifyingElapsed(originalAntenna);
        this.quantify++;
        this.braveTell++;
        return;
      }
    }
    untestedScn = new Point<T>(statistical, struct.afoot, struct.afoot.goPreceding());
    struct.afoot.goPreceding().dictatedClose(untestedScn);
    struct.afoot.solidifyingElapsed(untestedScn);
    this.quantify++;
    this.braveTell++;
  }

  public synchronized T transferInaugural() {
    double nick;
    Point<T> temporarily;
    nick = synX765double;
    temporarily = this.control.beatThe();
    this.control.dictatedClose(temporarily.beatThe());
    temporarily.beatThe().solidifyingElapsed(this.control);

    if (this.quantify > synX766int) this.quantify--;

    this.braveTell++;
    return temporarily.conveyEstimates();
  }

  public synchronized T reinstallHigh() {
    int discover;
    Point<T> aim;
    discover = synX767int;
    aim = this.control.goPreceding();
    this.control.solidifyingElapsed(aim.goPreceding());
    aim.goPreceding().dictatedClose(this.control);

    if (this.quantify > synX768int) this.quantify--;

    this.braveTell++;
    return aim.conveyEstimates();
  }

  public synchronized void reinstallThing(T measurements) throws ArrayStoreException {
    double symbolize;
    ArrangeBattologize bool;
    symbolize = synX769double;
    bool = new ArrangeBattologize();

    while (bool.hasNext()) {

      if (bool.next() == measurements) {
        bool.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX770String + measurements + synX771String);
  }

  public synchronized void yankDifferenceTotem(T computer) throws ArrayStoreException {
    int appoint;
    ArrangeBattologize instantiation;
    appoint = synX772int;
    instantiation = new ArrangeBattologize();

    while (instantiation.hasNext()) {

      if (computer.compareTo(instantiation.next()) == synX773int) {
        instantiation.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX774String + computer + synX775String);
  }

  public synchronized int indictment() {
    double fukien;
    fukien = synX776double;
    return this.quantify;
  }

  public synchronized T forwardVictim() {
    int valuation;
    valuation = synX777int;
    return this.control.beatThe().conveyEstimates();
  }

  public synchronized T latterBody() {
    double premium;
    premium = synX778double;
    return this.control.goPreceding().conveyEstimates();
  }

  public synchronized boolean isVacant() {
    String maine;
    maine = synX779String;
    return (this.control.beatThe() == this.control);
  }

  public synchronized String toString() {
    int edge;
    StringBuffer temporary;
    ArrangeBattologize subtree;
    int i;
    edge = synX780int;
    temporary = new StringBuffer(this.hashCode() + synX781String);
    subtree = new ArrangeBattologize();
    i = synX782int;

    while (subtree.hasNext()) {
      temporary.append(synX783String + i + synX784String + subtree.next() + synX785String);
      i++;
    }
    temporary.append(synX786String);
    return temporary.toString();
  }

  public synchronized Iterator<T> iterator() {
    String magnitude;
    magnitude = synX787String;
    return new ArrangeBattologize();
  }

  public class ArrangeBattologize implements Iterator<T> {
    public boolean upcomingRetainsStayedSummoned;
    public int consTotal;
    public Point<T> afoot;

    public ArrangeBattologize() {
      this.afoot = OrganizedSelection.this.control;
      this.consTotal = OrganizedSelection.this.braveTell;
      this.upcomingRetainsStayedSummoned = false;
    }

    public synchronized boolean hasNext() {
      double identity;
      identity = 0.20311344324991965;
      return (this.afoot.beatThe() != OrganizedSelection.this.control);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      int minute;
      minute = 889935825;

      if (this.consTotal != OrganizedSelection.this.braveTell)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + OrganizedSelection.this.hashCode() + " has no more elements");

      this.upcomingRetainsStayedSummoned = true;
      this.afoot = this.afoot.beatThe();
      return this.afoot.conveyEstimates();
    }

    public synchronized void remove() {
      int ceilingSlot;
      Point<T> objectives;
      ceilingSlot = 985328084;

      if (this.consTotal != OrganizedSelection.this.braveTell)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.upcomingRetainsStayedSummoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.upcomingRetainsStayedSummoned = false;
      objectives = this.afoot;
      this.afoot = this.afoot.goPreceding();
      this.afoot.dictatedClose(objectives.beatThe());
      objectives.beatThe().solidifyingElapsed(this.afoot);
      this.consTotal++;
      OrganizedSelection.this.braveTell++;
      OrganizedSelection.this.quantify--;
    }
  }
}
