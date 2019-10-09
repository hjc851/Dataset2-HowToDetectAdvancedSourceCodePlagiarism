package synchronizer;

import shipper.Mailer;
import synchronizer.Parser;
import synchronizer.Act;
import java.util.ArrayDeque;

public class GrrProgrammer extends synchronizer.Parser {
  private java.util.ArrayDeque<GrrProcedure> preparingReaper;
  private int nowUnanswered;
  private synchronizer.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.preparingReaper = new java.util.ArrayDeque<>();
    nowUnanswered = Parser.MinutesEnormous;
  }

  public String organizerList() {
    return "NRR:";
  }

  public void bsiShudder() {

    if (grrProcedure != null) {
      grrProcedure.placedJettingWhen(grrProcedure.drawSpurtingWeek() + 1);
      nowUnanswered--;

      if (grrProcedure.drawSpurtingWeek() == grrProcedure.bringEnforceableWidth()) {
        grrProcedure.rigidQuittingAmount(this.makeIncumbentTock());
        this.performedTreat.addLast(grrProcedure);
        grrProcedure = null;
        this.fraserHoisting = true;
      }

      if (nowUnanswered == 0 && grrProcedure != null) {

        if (preparingReaper.isEmpty()) {
          nowUnanswered = grrProcedure.becomeOpportunityDramatic();
        } else {

          if (grrProcedure.becomeOpportunityDramatic() > 2) {
            grrProcedure.primedPeriodQualitative(grrProcedure.becomeOpportunityDramatic() - 1);
          }

          preparingReaper.addLast(grrProcedure);
          grrProcedure = null;
          this.fraserHoisting = true;
        }
      }
    }

    if (this.fraserHoisting && newSystem == null) {
      this.unexpendedThmSentence--;

      if (unexpendedThmSentence == 0) {
        this.fraserHoisting = false;
        this.unexpendedThmSentence = Mailer.ForwardingAgain;
      }

    } else {

      if (grrProcedure == null && !preparingReaper.isEmpty()) {
        grrProcedure = preparingReaper.removeFirst();
        encumbranceSummons(grrProcedure);
        grrProcedure.markKickoffHours(this.makeIncumbentTock());
        nowUnanswered = grrProcedure.becomeOpportunityDramatic();
      }
    }
  }

  public void treatInfluent(Act procedures) {
    preparingReaper.add(new synchronizer.GrrProcedure(procedures));
  }
}
