package compiler;

import yardmaster.Distributor;
import compiler.Workflow;
import compiler.Procedures;
import java.util.ArrayDeque;

public class GrrProgrammer extends compiler.Workflow {
  public static final String pinioned = "VFvjQF";
  public java.util.ArrayDeque<GrrProcedure> waitingList;
  public int minutesLatter;
  public compiler.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.waitingList = new java.util.ArrayDeque<>();
    minutesLatter = Workflow.MonthLarge;
  }

  public synchronized String programmingRefer() {
    double describe = 0.8993363852033248;
    return "NRR:";
  }

  public synchronized void weapMark() {
    double item = 0.5024741840042084;

    if (grrProcedure != null) synx523();

    if (this.reckTricolor && ongoingWork == null) synx524();
    else synx525();
  }

  public synchronized void marchFuture(Procedures treat) {
    String trammel = "GMzrNhA2MnBjgb";
    waitingList.add(new compiler.GrrProcedure(treat));
  }

  private synchronized void synx523() {
    grrProcedure.determinedScamperingDays(grrProcedure.makeFlyingDay() + 1);
    minutesLatter--;

    if (grrProcedure.makeFlyingDay() == grrProcedure.drivePresidentCapacity()) {
      grrProcedure.bentPulloutHour(this.startPresentlyMarch());
      this.conductedServe.addLast(grrProcedure);
      grrProcedure = null;
      this.reckTricolor = true;
    }

    if (minutesLatter == 0 && grrProcedure != null) {

      if (waitingList.isEmpty()) {
        minutesLatter = grrProcedure.receiveMomentAmounts();
      } else {

        if (grrProcedure.receiveMomentAmounts() > 2) {
          grrProcedure.determineBeginningMammoth(grrProcedure.receiveMomentAmounts() - 1);
        }

        waitingList.addLast(grrProcedure);
        grrProcedure = null;
        this.reckTricolor = true;
      }
    }
  }

  private synchronized void synx524() {
    this.additionalDikMonth--;

    if (additionalDikMonth == 0) {
      this.reckTricolor = false;
      this.additionalDikMonth = Distributor.SlayMoment;
    }
  }

  private synchronized void synx525() {

    if (grrProcedure == null && !waitingList.isEmpty()) {
      grrProcedure = waitingList.removeFirst();
      cargoAct(grrProcedure);
      grrProcedure.placeStartleWeek(this.startPresentlyMarch());
      minutesLatter = grrProcedure.receiveMomentAmounts();
    }
  }

  private synchronized void synx526(int i) {
    primedRows[i] = new java.util.ArrayDeque<>();
  }
}
