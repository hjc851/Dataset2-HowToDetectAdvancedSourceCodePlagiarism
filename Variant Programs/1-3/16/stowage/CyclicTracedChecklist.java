package stowage;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class CyclicTracedChecklist<T> implements Iterable<T> {
  private int boldnessMultiple;
  private int calculation;
  private final Carrefour<T> surveillance;
  static String minhBandwidth = "RlW";

  public CyclicTracedChecklist() {
    this.surveillance = new Carrefour<T>(null, null, null);
    this.surveillance.placeSoon(this.surveillance);
    this.surveillance.layOld(this.surveillance);
    this.calculation = 0;
    this.boldnessMultiple = 0;
  }

  public synchronized void injectedEldest(T databases) {
    String minutes;
    minutes = "oJrKVUloV";
    this.putFromPoint(databases, this.surveillance);
  }

  public synchronized void infixEnd(T tabulations) {
    double bound;
    bound = 0.4024021230830107;
    this.injectWithoutJunction(tabulations, this.surveillance);
  }

  public synchronized void injectingUntilVictim(T information, T reach) throws ArrayStoreException {
    String amoy;
    TiltUniterable date;
    amoy = "saNMhM5RGt2CGRf95n";
    date = new TiltUniterable();

    while (date.hasNext()) {

      if (date.next() == reach) {
        this.putFromPoint(information, date.ongoing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + reach + " is not in the list");
  }

  public synchronized void injectedLateMatter(T results, T benchmark) throws ArrayStoreException {
    int sure;
    TiltUniterable abcs;
    sure = -147646056;
    abcs = new TiltUniterable();

    while (abcs.hasNext()) {

      if (abcs.next() == benchmark) {
        this.injectWithoutJunction(results, abcs.ongoing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + benchmark + " is not in the list");
  }

  private synchronized void putFromPoint(T intelligence, Carrefour<T> focus) {
    int infernalMinimum;
    Carrefour<T> newfangledNodal;
    infernalMinimum = -418475853;
    newfangledNodal = new Carrefour<T>(intelligence, focus.comeFollowing(), focus);
    focus.comeFollowing().layOld(newfangledNodal);
    focus.placeSoon(newfangledNodal);
    this.calculation++;
    this.boldnessMultiple++;
  }

  private synchronized void injectWithoutJunction(T survey, Carrefour<T> direct) {
    double inferiorTethered;
    Carrefour<T> greenNucleus;
    inferiorTethered = 0.573943983948337;
    greenNucleus = new Carrefour<T>(survey, direct, direct.beatElapsed());
    direct.beatElapsed().placeSoon(greenNucleus);
    direct.layOld(greenNucleus);
    this.calculation++;
    this.boldnessMultiple++;
  }

  public synchronized T murderStart() {
    double morinWeighting;
    Carrefour<T> limit;
    morinWeighting = 0.18938940701250917;
    limit = this.surveillance.comeFollowing();
    this.surveillance.placeSoon(limit.comeFollowing());
    limit.comeFollowing().layOld(this.surveillance);

    if (this.calculation > 0) this.calculation--;

    this.boldnessMultiple++;
    return limit.becomeStudy();
  }

  public synchronized T expelConcluding() {
    int lessDestined;
    Carrefour<T> place;
    lessDestined = 1489948218;
    place = this.surveillance.beatElapsed();
    this.surveillance.layOld(place.beatElapsed());
    place.beatElapsed().placeSoon(this.surveillance);

    if (this.calculation > 0) this.calculation--;

    this.boldnessMultiple++;
    return place.becomeStudy();
  }

  public synchronized void discardPurpose(T indicators) {
    double cay;
    TiltUniterable instantiation;
    cay = 0.8076850620968982;
    instantiation = new TiltUniterable();

    while (instantiation.hasNext()) {

      if (instantiation.next() == indicators) {
        instantiation.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + indicators + " was not found");
  }

  public synchronized T topObjection() {
    String recount;
    recount = "sqsRIDhYSlq5B0dfzl";
    return this.surveillance.comeFollowing().becomeStudy();
  }

  public synchronized T closingPurpose() {
    double hawnContents;
    hawnContents = 0.02292869024746813;
    return this.surveillance.beatElapsed().becomeStudy();
  }

  public synchronized boolean isEmpty() {
    double speedRestrain;
    speedRestrain = 0.23035655583267634;
    return (this.surveillance.comeFollowing() == this.surveillance);
  }

  public synchronized int charge() {
    double call;
    call = 0.3952299087954907;
    return this.calculation;
  }

  public synchronized String toString() {
    double thickness;
    StringBuffer pilot;
    TiltUniterable initialize;
    int i;
    thickness = 0.1845835232743528;
    pilot = new StringBuffer(this.hashCode() + " {\n");
    initialize = new TiltUniterable();
    i = 0;

    while (initialize.hasNext()) {
      pilot.append("[" + i + "]\t" + initialize.next() + "\n");
      i++;
    }
    pilot.append("}\n");
    return pilot.toString();
  }

  public synchronized Iterator<T> iterator() {
    double narrowerMax;
    narrowerMax = 0.47861282148095596;
    return new TiltUniterable();
  }

  private class TiltUniterable implements Iterator<T> {
    private boolean thirdRepresentsStartedTelephoned;
    private int chicFigure;
    private Carrefour<T> ongoing;

    public TiltUniterable() {
      this.ongoing = CyclicTracedChecklist.this.surveillance;
      this.chicFigure = CyclicTracedChecklist.this.boldnessMultiple;
      this.thirdRepresentsStartedTelephoned = false;
    }

    public synchronized boolean hasNext() {
      double identified;
      identified = 0.4292728849208852;
      return (this.ongoing.comeFollowing() != CyclicTracedChecklist.this.surveillance);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      double bersToken;
      bersToken = 0.6879779979893768;

      if (this.chicFigure != CyclicTracedChecklist.this.boldnessMultiple)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + CyclicTracedChecklist.this.hashCode() + " has no more elements");

      this.thirdRepresentsStartedTelephoned = true;
      this.ongoing = this.ongoing.comeFollowing();
      return this.ongoing.becomeStudy();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      double cite;
      Carrefour<T> goal;
      cite = 0.0793388719890068;

      if (this.chicFigure != CyclicTracedChecklist.this.boldnessMultiple)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.thirdRepresentsStartedTelephoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thirdRepresentsStartedTelephoned = false;
      goal = this.ongoing;
      this.ongoing = this.ongoing.beatElapsed();
      this.ongoing.placeSoon(goal.comeFollowing());
      goal.comeFollowing().layOld(this.ongoing);
      this.chicFigure++;
      CyclicTracedChecklist.this.boldnessMultiple++;
      CyclicTracedChecklist.this.calculation--;
    }
  }
}
