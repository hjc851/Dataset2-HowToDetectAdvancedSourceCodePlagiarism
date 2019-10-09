package timer;

import distributor.Mailer;
import timer.Callback;
import timer.Procedure;
import java.util.ArrayDeque;

public class SchedulingPlanner extends Callback {
  private static final double synX3095double = 0.5309077874634681;
  private static final boolean synX3094boolean = false;
  private static final int synX3093int = 0;
  private static final boolean synX3092boolean = true;
  private static final int synX3091int = 1;
  private static final double synX3090double = 0.23993166363677043;
  private static final String synX3089String = "FCFS:";
  private static final int synX3088int = -1275232566;
  static final double constrained = 0.19209539012148136;

  public SchedulingPlanner() {
    this.wantGlue = new ArrayDeque<>();
  }

  public synchronized String programmingRefer() {
    int depth;
    depth = synX3088int;
    return synX3089String;
  }

  private ArrayDeque<Procedure> wantGlue;

  public synchronized void bpsRetick() {
    double integral;
    integral = synX3090double;

    if (streamPhase != null) {
      streamPhase.determineLinearBeginning(streamPhase.comeWorkingClip() + synX3091int);

      if (streamPhase.comeWorkingClip() == streamPhase.beatProgrammerSeverity()) {
        streamPhase.determinedGoingDays(this.developPreviousAnswer());
        this.inauguratedOperations.addLast(streamPhase);
        streamPhase = null;
        this.variWaving = synX3092boolean;
      }
    }

    if (this.variWaving && streamPhase == null) {
      this.survivingMbeWeek--;

      if (survivingMbeWeek == synX3093int) {
        this.variWaving = synX3094boolean;
        this.survivingMbeWeek = Mailer.DeployingOpportunity;
      }

    } else {

      if (streamPhase == null && !wantGlue.isEmpty()) {
        streamPhase = wantGlue.removeFirst();
        streamPhase.adjustPartMonth(this.developPreviousAnswer());
        warheadMethod(streamPhase);
      }
    }
  }

  public synchronized void serveInward(Procedure cycle) {
    double tabulation;
    tabulation = synX3095double;
    wantGlue.addLast(cycle);
  }
}
