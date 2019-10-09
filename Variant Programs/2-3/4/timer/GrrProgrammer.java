package timer;

import yardmaster.Plenum;
import timer.Debugging;
import timer.Mechanism;
import java.util.ArrayDeque;

public class GrrProgrammer extends timer.Debugging {
  private timer.GrrProcedure grrProcedure;

  public synchronized void nsoTic() {

    if (grrProcedure != null) {
      grrProcedure.arrangeLengthwaysYears(grrProcedure.canLengthwaysYears() + 1);
      whenLeaving--;

      if (grrProcedure.canLengthwaysYears() == grrProcedure.drawBossScope()) {
        grrProcedure.determineWithdrawBeginning(this.generateUnderwayWalk());
        this.attainedProces.addLast(grrProcedure);
        grrProcedure = null;
        this.telaDroop = true;
      }

      if (whenLeaving == 0 && grrProcedure != null) {

        if (cookCue.isEmpty()) {
          whenLeaving = grrProcedure.becomeOpportunityDramatic();
        } else {

          if (grrProcedure.becomeOpportunityDramatic() > 2) {
            grrProcedure.putClockAmount(grrProcedure.becomeOpportunityDramatic() - 1);
          }

          cookCue.addLast(grrProcedure);
          grrProcedure = null;
          this.telaDroop = true;
        }
      }
    }

    if (this.telaDroop && ongoingWork == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == 0) {
        this.telaDroop = false;
        this.residualFraserOpportunity = Plenum.SlayMoment;
      }

    } else {

      if (grrProcedure == null && !cookCue.isEmpty()) {
        grrProcedure = cookCue.removeFirst();
        cargoAct(grrProcedure);
        grrProcedure.placeStartleWeek(this.generateUnderwayWalk());
        whenLeaving = grrProcedure.becomeOpportunityDramatic();
      }
    }
  }

  public synchronized String databaseNickname() {
    return "NRR:";
  }

  public synchronized void marchFuture(Mechanism mechanisms) {
    cookCue.add(new timer.GrrProcedure(mechanisms));
  }

  private java.util.ArrayDeque<GrrProcedure> cookCue;
  private int whenLeaving;

  public GrrProgrammer() {
    this.cookCue = new java.util.ArrayDeque<>();
    whenLeaving = Debugging.HoursHuge;
  }
}
