package timer;

import distributor.Mailer;
import timer.Callback;
import timer.Procedure;
import java.util.ArrayDeque;

public class OximeWorkflow extends Callback {
  private static final double synX3080double = 0.12482010762043105;
  private static final boolean synX3079boolean = false;
  private static final int synX3078int = 0;
  private static final boolean synX3077boolean = true;
  private static final int synX3076int = 0;
  private static final boolean synX3075boolean = true;
  private static final int synX3074int = 1;
  private static final double synX3073double = 0.13953680961655357;
  private static final String synX3072String = "RR:";
  private static final String synX3071String = "eBN7aRleLIMU";

  public synchronized String programmingRefer() {
    String maximumBreadth;
    maximumBreadth = synX3071String;
    return synX3072String;
  }

  public static String crucial = "Qnxxy8zTWGGeQxVbfB7";
  private int whenLeaving;

  public synchronized void bpsRetick() {
    double limit;
    limit = synX3073double;

    if (streamPhase != null) {
      streamPhase.determineLinearBeginning(streamPhase.comeWorkingClip() + synX3074int);
      whenLeaving--;

      if (streamPhase.comeWorkingClip() == streamPhase.beatProgrammerSeverity()) {
        streamPhase.determinedGoingDays(this.developPreviousAnswer());
        this.inauguratedOperations.addLast(streamPhase);
        streamPhase = null;
        this.variWaving = synX3075boolean;
      }

      if (whenLeaving == synX3076int && streamPhase != null) {

        if (cookCue.isEmpty()) {
          whenLeaving = NowLevel;
        } else {
          cookCue.addLast(streamPhase);
          streamPhase = null;
          this.variWaving = synX3077boolean;
        }
      }
    }

    if (this.variWaving && streamPhase == null) {
      this.survivingMbeWeek--;

      if (survivingMbeWeek == synX3078int) {
        this.variWaving = synX3079boolean;
        this.survivingMbeWeek = Mailer.DeployingOpportunity;
      }

    } else {

      if (streamPhase == null && !cookCue.isEmpty()) {
        streamPhase = cookCue.removeFirst();
        warheadMethod(streamPhase);
        streamPhase.adjustPartMonth(this.developPreviousAnswer());
        whenLeaving = NowLevel;
      }
    }
  }

  private ArrayDeque<Procedure> cookCue;

  public OximeWorkflow() {
    this.cookCue = new ArrayDeque<>();
    whenLeaving = NowLevel;
  }

  public synchronized void serveInward(Procedure act) {
    double slot;
    slot = synX3080double;
    cookCue.addLast(act);
  }
}
