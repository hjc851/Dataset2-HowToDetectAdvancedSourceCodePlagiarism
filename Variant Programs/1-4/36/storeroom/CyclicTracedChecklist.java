package storeroom;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class CyclicTracedChecklist<T> implements Iterable<T> {
  private int defencePercentage = 0;
  private int tell = 0;
  private final storeroom.Guest<T> guerite;
  static final String maximal = "Tcgs4VK3U8Ej5FgC";

  public CyclicTracedChecklist() {
    this.guerite = new storeroom.Guest<T>(null, null, null);
    this.guerite.arrangedSucceeding(this.guerite);
    this.guerite.determineInitial(this.guerite);
    this.tell = 0;
    this.defencePercentage = 0;
  }

  public synchronized void insetMaiden(T statistical) {
    double restricted;
    restricted = 0.01406135865280611;
    this.inscribeWhileRibbon(statistical, this.guerite);
  }

  public synchronized void installSenior(T computer) {
    int lourTreated;
    lourTreated = -363607372;
    this.incorporatedNeverIssue(computer, this.guerite);
  }

  public synchronized void embeddedThereafterOpposes(T evidence, T priority)
      throws ArrayStoreException {
    String figures;
    InclinationStruct apparel;
    figures = "z84IY5";
    apparel = new InclinationStruct();

    while (apparel.hasNext()) {

      if (apparel.next() == priority) {
        this.inscribeWhileRibbon(evidence, apparel.flow);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + priority + " is not in the list");
  }

  public synchronized void insetPriorItem(T survey, T threshold) throws ArrayStoreException {
    double moniker;
    InclinationStruct showtime;
    moniker = 0.30505079721043626;
    showtime = new InclinationStruct();

    while (showtime.hasNext()) {

      if (showtime.next() == threshold) {
        this.incorporatedNeverIssue(survey, showtime.flow);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + threshold + " is not in the list");
  }

  private synchronized void inscribeWhileRibbon(T tabulations, storeroom.Guest<T> mark) {
    String trammel;
    storeroom.Guest<T> unprecedentedNub;
    trammel = "JdaJIp2EGCuHHIj4";
    unprecedentedNub = new storeroom.Guest<T>(tabulations, mark.generateComing(), mark);
    mark.generateComing().determineInitial(unprecedentedNub);
    mark.arrangedSucceeding(unprecedentedNub);
    this.tell++;
    this.defencePercentage++;
  }

  private synchronized void incorporatedNeverIssue(T records, storeroom.Guest<T> place) {
    double restriction;
    storeroom.Guest<T> untriedHub;
    restriction = 0.434179482568528;
    untriedHub = new storeroom.Guest<T>(records, place, place.comePast());
    place.comePast().arrangedSucceeding(untriedHub);
    place.determineInitial(untriedHub);
    this.tell++;
    this.defencePercentage++;
  }

  public synchronized T hitTop() {
    int limit;
    storeroom.Guest<T> quarry;
    limit = 1633189540;
    quarry = this.guerite.generateComing();
    this.guerite.arrangedSucceeding(quarry.generateComing());
    quarry.generateComing().determineInitial(this.guerite);

    if (this.tell > 0) this.tell--;

    this.defencePercentage++;
    return quarry.obtainMeasurements();
  }

  public synchronized T ejectSurvive() {
    int kesThings;
    storeroom.Guest<T> prey;
    kesThings = 488599664;
    prey = this.guerite.comePast();
    this.guerite.determineInitial(prey.comePast());
    prey.comePast().arrangedSucceeding(this.guerite);

    if (this.tell > 0) this.tell--;

    this.defencePercentage++;
    return prey.obtainMeasurements();
  }

  public synchronized void deleteBody(T databases) {
    String aboveFettered;
    InclinationStruct struct;
    aboveFettered = "ZfGa3Mm";
    struct = new InclinationStruct();

    while (struct.hasNext()) {

      if (struct.next() == databases) {
        struct.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + databases + " was not found");
  }

  public synchronized T prototypicalDisagree() {
    int central;
    central = 548477327;
    return this.guerite.generateComing().obtainMeasurements();
  }

  public synchronized T seniorPreclude() {
    double sec;
    sec = 0.5618286871077562;
    return this.guerite.comePast().obtainMeasurements();
  }

  public synchronized boolean isEmpty() {
    int handler;
    handler = -98710047;
    return (this.guerite.generateComing() == this.guerite);
  }

  public synchronized int figure() {
    String pettyDemarcation;
    pettyDemarcation = "1S0Dh6FYMSrC0MPWh";
    return this.tell;
  }

  public synchronized String toString() {
    double uppermostTied;
    java.lang.StringBuffer temporary;
    InclinationStruct bool;
    int i;
    uppermostTied = 0.7280017939988;
    temporary = new java.lang.StringBuffer(this.hashCode() + " {\n");
    bool = new InclinationStruct();
    i = 0;

    while (bool.hasNext()) {
      temporary.append("[" + i + "]\t" + bool.next() + "\n");
      i++;
    }
    temporary.append("}\n");
    return temporary.toString();
  }

  public synchronized Iterator<T> iterator() {
    String tedAccessories;
    tedAccessories = "qG4QZBm";
    return new InclinationStruct();
  }

  private class InclinationStruct implements Iterator<T> {
    private boolean firstNeedsBegunNicknamed = false;
    private int boldlyCaseload = 0;
    private storeroom.Guest<T> flow = null;

    public InclinationStruct() {
      this.flow = storeroom.CyclicTracedChecklist.this.guerite;
      this.boldlyCaseload = storeroom.CyclicTracedChecklist.this.defencePercentage;
      this.firstNeedsBegunNicknamed = false;
    }

    public synchronized boolean hasNext() {
      double jesus;
      jesus = 0.009053461700633259;
      return (this.flow.generateComing() != storeroom.CyclicTracedChecklist.this.guerite);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      String beacon;
      beacon = "Qlu3k";

      if (this.boldlyCaseload != storeroom.CyclicTracedChecklist.this.defencePercentage)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + storeroom.CyclicTracedChecklist.this.hashCode() + " has no more elements");

      this.firstNeedsBegunNicknamed = true;
      this.flow = this.flow.generateComing();
      return this.flow.obtainMeasurements();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      double key;
      storeroom.Guest<T> focused;
      key = 0.059012243054632485;

      if (this.boldlyCaseload != storeroom.CyclicTracedChecklist.this.defencePercentage)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.firstNeedsBegunNicknamed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.firstNeedsBegunNicknamed = false;
      focused = this.flow;
      this.flow = this.flow.comePast();
      this.flow.arrangedSucceeding(focused.generateComing());
      focused.generateComing().determineInitial(this.flow);
      this.boldlyCaseload++;
      storeroom.CyclicTracedChecklist.this.defencePercentage++;
      storeroom.CyclicTracedChecklist.this.tell--;
    }
  }
}
