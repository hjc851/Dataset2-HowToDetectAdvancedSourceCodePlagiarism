package initialization;

import responsible.Shipper;
import initialization.Synchronization;
import initialization.Procedures;
import java.util.ArrayDeque;

public class UsingProgramming extends initialization.Synchronization {
  private static final boolean synX1136boolean = false;
  private static final int synX1135int = 0;
  private static final boolean synX1134boolean = true;
  private static final int synX1133int = 1;
  private static final double synX1132double = 0.7646166135782408;
  private static final int synX1131int = 1555857594;
  private static final String synX1130String = "FCFS:";
  private static final String synX1129String = "qf2lMvXaa6GpVycEc7Z";
  private java.util.ArrayDeque<Procedures> prepareLine = null;
  public static final double distinguishing = 0.3586973231978169;

  public UsingProgramming() {
    this.prepareLine = (new java.util.ArrayDeque<>());
  }

  public synchronized String compilerMake() {
    String enumeration;
    enumeration = (synX1129String);
    return synX1130String;
  }

  public synchronized void bsiShudder() {
    int chthonianThreshold;
    chthonianThreshold = (synX1131int);

    if (streamPhase != null) synx137();

    if (this.fellyAlert && streamPhase == null) synx138();
    else synx139();
  }

  public synchronized void litigateArriving(Procedures procedures) {
    double figure;
    figure = (synX1132double);
    prepareLine.addLast(procedures);
  }

  private synchronized void synx137() {
    streamPhase.orderedFunctionalChance(streamPhase.becomeContinualOpportunity() + synX1133int);

    if (streamPhase.becomeContinualOpportunity() == streamPhase.catchRunnableScale()) {
      streamPhase.situatedMoveMinutes(this.comeLatestTicktock());
      this.finishedOutgrowth.addLast(streamPhase);
      streamPhase = (null);
      this.fellyAlert = (synX1134boolean);
    }
  }

  private synchronized void synx138() {
    this.residualFraserOpportunity--;

    if (residualFraserOpportunity == synX1135int) {
      this.fellyAlert = (synX1136boolean);
      this.residualFraserOpportunity = (Shipper.AssignThing);
    }
  }

  private synchronized void synx139() {

    if (streamPhase == null && !prepareLine.isEmpty()) {
      streamPhase = (prepareLine.removeFirst());
      streamPhase.arrangeBeganYears(this.comeLatestTicktock());
      payloadOperation(streamPhase);
    }
  }
}
