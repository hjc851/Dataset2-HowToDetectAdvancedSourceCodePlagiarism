package initialization;

import responsible.Shipper;
import initialization.Synchronization;
import initialization.Procedures;
import java.util.ArrayDeque;

public class AController extends initialization.Synchronization {
  private static final boolean synX1128boolean = false;
  private static final int synX1127int = 0;
  private static final boolean synX1126boolean = true;
  private static final int synX1125int = 0;
  private static final boolean synX1124boolean = true;
  private static final int synX1123int = 1;
  private static final String synX1122String = "Y6";
  private static final double synX1121double = 0.11238256792429269;
  private static final String synX1120String = "RR:";
  private static final int synX1119int = 198275306;
  private int beginningUnsold = 0;
  private java.util.ArrayDeque<Procedures> intelligentBraid = null;
  public static double prise = 0.9899047898265018;

  public AController() {
    this.intelligentBraid = (new java.util.ArrayDeque<>());
    beginningUnsold = (YearsSize);
  }

  public synchronized String compilerMake() {
    int relevance;
    relevance = (synX1119int);
    return synX1120String;
  }

  public synchronized void bsiShudder() {
    double johannesBeam;
    johannesBeam = (synX1121double);

    if (streamPhase != null) synx130();

    if (this.fellyAlert && streamPhase == null) synx131();
    else synx132();
  }

  public synchronized void litigateArriving(Procedures proceeding) {
    String minimalSlot;
    minimalSlot = (synX1122String);
    intelligentBraid.addLast(proceeding);
  }

  private synchronized void synx130() {
    streamPhase.orderedFunctionalChance(streamPhase.becomeContinualOpportunity() + synX1123int);
    beginningUnsold--;

    if (streamPhase.becomeContinualOpportunity() == streamPhase.catchRunnableScale()) {
      streamPhase.situatedMoveMinutes(this.comeLatestTicktock());
      this.finishedOutgrowth.addLast(streamPhase);
      streamPhase = (null);
      this.fellyAlert = (synX1124boolean);
    }

    if (beginningUnsold == synX1125int && streamPhase != null) {

      if (intelligentBraid.isEmpty()) {
        beginningUnsold = (YearsSize);
      } else {
        intelligentBraid.addLast(streamPhase);
        streamPhase = (null);
        this.fellyAlert = (synX1126boolean);
      }
    }
  }

  private synchronized void synx131() {
    this.residualFraserOpportunity--;

    if (residualFraserOpportunity == synX1127int) {
      this.fellyAlert = (synX1128boolean);
      this.residualFraserOpportunity = (Shipper.AssignThing);
    }
  }

  private synchronized void synx132() {

    if (streamPhase == null && !intelligentBraid.isEmpty()) {
      streamPhase = (intelligentBraid.removeFirst());
      payloadOperation(streamPhase);
      streamPhase.arrangeBeganYears(this.comeLatestTicktock());
      beginningUnsold = (YearsSize);
    }
  }
}
