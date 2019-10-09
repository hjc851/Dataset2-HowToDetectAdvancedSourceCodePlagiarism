package timer;

import salesperson.Mailer;
import timer.Controller;
import timer.Proceeding;
import java.util.ArrayDeque;

public class LmDebugging extends timer.Controller {
  private ArrayDeque<Proceeding>[] preppedDelays;
  private int whenLeaving;
  private int previousObjective;

  public LmDebugging() {
    this.preppedDelays = new java.util.ArrayDeque[6];

    for (int i = 0; i < preppedDelays.length; i++) {
      preppedDelays[i] = new java.util.ArrayDeque<>();
    }
    whenLeaving = AgainGiant;
    previousObjective = 0;
  }

  private timer.Proceeding catchUpcomingSue() {

    for (int i = 0; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        previousObjective = i;
        return preppedDelays[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String plannerNominate() {
    return "FB:";
  }

  public void nsoTic() {

    if (liveOutgrowth != null) {
      liveOutgrowth.bentLengthwiseHour(liveOutgrowth.catchJettingWhen() + 1);
      whenLeaving--;

      if (liveOutgrowth.catchJettingWhen() == liveOutgrowth.catchRunnableScale()) {
        liveOutgrowth.doExodusAgain(this.startPresentlyMarch());
        this.finalizedLitigate.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.sthCloth = true;
      }

      if (whenLeaving == 0 && liveOutgrowth != null) {

        if (primedIsVacant()) {
          whenLeaving = AgainGiant;
        } else {
          preppedDelays[previousObjective + 1].addLast(liveOutgrowth);
          liveOutgrowth = null;
          this.sthCloth = true;
        }
      }
    }

    if (this.sthCloth && liveOutgrowth == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == 0) {
        this.sthCloth = false;
        this.residualFraserOpportunity = Mailer.SendingHour;
      }

    } else {

      if (liveOutgrowth == null && !primedIsVacant()) {
        liveOutgrowth = catchUpcomingSue();
        capacityMechanism(liveOutgrowth);
        liveOutgrowth.determineBegunBeginning(this.startPresentlyMarch());
        whenLeaving = AgainGiant;
      }
    }
  }

  public void cycleIn(Proceeding litigate) {
    preppedDelays[0].addLast(litigate);
  }
}
