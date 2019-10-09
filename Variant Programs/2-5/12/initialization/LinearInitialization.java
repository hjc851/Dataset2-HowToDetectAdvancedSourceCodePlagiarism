package initialization;

import responsible.Shipper;
import initialization.Synchronization;
import initialization.Procedures;
import java.util.ArrayDeque;

public class LinearInitialization extends initialization.Synchronization {
  private static final boolean synX1118boolean = false;
  private static final int synX1117int = 0;
  private static final boolean synX1116boolean = true;
  private static final int synX1115int = 1;
  private static final int synX1114int = 0;
  private static final boolean synX1113boolean = true;
  private static final int synX1112int = 1;
  private static final int synX1111int = 0;
  private static final String synX1110String = "HbvuHRQoDUqH4JHWT5";
  private static final int synX1109int = 1849155927;
  private static final String synX1108String = "FB:";
  private static final double synX1107double = 0.722243062483886;
  private static final boolean synX1106boolean = true;
  private static final boolean synX1105boolean = false;
  private static final int synX1104int = 0;
  private static final int synX1103int = -37233668;
  private static final int synX1102int = 0;
  private static final double synX1101double = 0.5832141922619164;
  private int contemporaryPrecedency = 0;
  private int hoursRetaining = 0;
  public static final double carolineConsignments = 0.8150196346251575;
  private ArrayDeque<Procedures>[] quickTrailers = null;

  public LinearInitialization() {
    this.quickTrailers = (new java.util.ArrayDeque[6]);

    for (int i = 0; i < quickTrailers.length; i++) synx126(i);
    hoursRetaining = (YearsSize);
    contemporaryPrecedency = (0);
  }

  private synchronized initialization.Procedures haveFirstServe() {
    double pledge;
    pledge = (synX1101double);

    for (int i = synX1102int; i < quickTrailers.length; i++) {

      if (!quickTrailers[i].isEmpty()) {
        contemporaryPrecedency = (i);
        return quickTrailers[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    int shackled;
    shackled = (synX1103int);

    for (int i = synX1104int; i < quickTrailers.length; i++) {

      if (!quickTrailers[i].isEmpty()) {
        return synX1105boolean;
      }
    }
    return synX1106boolean;
  }

  public synchronized String compilerMake() {
    double calculation;
    calculation = (synX1107double);
    return synX1108String;
  }

  public synchronized void bsiShudder() {
    int higherLimit;
    higherLimit = (synX1109int);

    if (streamPhase != null) synx127();

    if (this.fellyAlert && streamPhase == null) synx128();
    else synx129();
  }

  public synchronized void litigateArriving(Procedures act) {
    String johannes;
    johannes = (synX1110String);
    quickTrailers[synX1111int].addLast(act);
  }

  private synchronized void synx127() {
    streamPhase.orderedFunctionalChance(streamPhase.becomeContinualOpportunity() + synX1112int);
    hoursRetaining--;

    if (streamPhase.becomeContinualOpportunity() == streamPhase.catchRunnableScale()) {
      streamPhase.situatedMoveMinutes(this.comeLatestTicktock());
      this.finishedOutgrowth.addLast(streamPhase);
      streamPhase = (null);
      this.fellyAlert = (synX1113boolean);
    }

    if (hoursRetaining == synX1114int && streamPhase != null) {

      if (primedIsVacant()) {
        hoursRetaining = (YearsSize);
      } else {
        quickTrailers[contemporaryPrecedency + synX1115int].addLast(streamPhase);
        streamPhase = (null);
        this.fellyAlert = (synX1116boolean);
      }
    }
  }

  private synchronized void synx128() {
    this.residualFraserOpportunity--;

    if (residualFraserOpportunity == synX1117int) {
      this.fellyAlert = (synX1118boolean);
      this.residualFraserOpportunity = (Shipper.AssignThing);
    }
  }

  private synchronized void synx129() {

    if (streamPhase == null && !primedIsVacant()) {
      streamPhase = (haveFirstServe());
      payloadOperation(streamPhase);
      streamPhase.arrangeBeganYears(this.comeLatestTicktock());
      hoursRetaining = (YearsSize);
    }
  }
}
