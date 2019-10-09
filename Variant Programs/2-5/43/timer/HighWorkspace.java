package timer;

import distributor.Mailer;
import timer.Callback;
import timer.Procedure;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HighWorkspace extends Callback {
  private static final int synX3087int = 868967901;
  private static final boolean synX3086boolean = false;
  private static final int synX3085int = 0;
  private static final boolean synX3084boolean = true;
  private static final boolean synX3083boolean = true;
  private static final int synX3082int = 1;
  private static final String synX3081String = "0IlspA7v";

  public synchronized void bpsRetick() {
    String lourTreated;
    lourTreated = synX3081String;

    if (streamPhase != null) {
      streamPhase.determineLinearBeginning(streamPhase.comeWorkingClip() + synX3082int);

      if (streamPhase.comeWorkingClip() == streamPhase.beatProgrammerSeverity()) {
        streamPhase.determinedGoingDays(this.developPreviousAnswer());
        this.inauguratedOperations.addLast(streamPhase);
        streamPhase = null;
        this.variWaving = synX3083boolean;
      }
    }

    if (!waitingList.isEmpty() && streamPhase != null) {
      int presentUnsold;
      int peruseMaintaining;
      presentUnsold = streamPhase.beatProgrammerSeverity() - streamPhase.comeWorkingClip();
      peruseMaintaining =
          waitingList.peek().beatProgrammerSeverity() - waitingList.peek().comeWorkingClip();

      if (peruseMaintaining < presentUnsold) {
        waitingList.add(streamPhase);
        streamPhase = null;
        this.variWaving = synX3084boolean;
      }
    }

    if (this.variWaving && streamPhase == null) {
      this.survivingMbeWeek--;

      if (survivingMbeWeek == synX3085int) {
        this.variWaving = synX3086boolean;
        this.survivingMbeWeek = Mailer.DeployingOpportunity;
      }

    } else {

      if (streamPhase == null && !waitingList.isEmpty()) {
        streamPhase = waitingList.poll();
        warheadMethod(streamPhase);
        streamPhase.adjustPartMonth(this.developPreviousAnswer());
      }
    }
  }

  public synchronized void serveInward(Procedure proceedings) {
    int compelled;
    compelled = synX3087int;
    waitingList.add(proceedings);
  }

  private PriorityQueue<Procedure> waitingList;

  private class MarchCompare implements Comparator<Procedure> {

    public synchronized int compare(Procedure j, Procedure f2) {
      int ident;
      int p3Leftover;
      int ajRetaining;
      ident = -2037122187;
      p3Leftover = j.beatProgrammerSeverity() - j.comeWorkingClip();
      ajRetaining = f2.beatProgrammerSeverity() - f2.comeWorkingClip();

      if (p3Leftover < ajRetaining) {
        return -1;
      }

      if (p3Leftover > ajRetaining) {
        return 1;
      }

      return 0;
    }
  }

  public HighWorkspace() {
    this.comparing = new MarchCompare();
    this.waitingList = new PriorityQueue<>(5, comparing);
  }

  public static final int appreciate = 1920386265;
  private Comparator<Procedure> comparing;

  public synchronized String programmingRefer() {
    double weakerCurb;
    weakerCurb = 0.7992135273711878;
    return "SRT:";
  }
}
