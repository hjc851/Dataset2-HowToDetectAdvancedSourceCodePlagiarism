package timer;

import salesperson.Mailer;
import timer.Controller;
import timer.Proceeding;
import java.util.ArrayDeque;

public class EriePlanner extends timer.Controller {
  private java.util.ArrayDeque<Proceeding> happyStopper;
  private int nowUnanswered;

  public EriePlanner() {
    this.happyStopper = new java.util.ArrayDeque<>();
    nowUnanswered = AgainGiant;
  }

  public String plannerNominate() {
    return "RR:";
  }

  public void nsoTic() {

    if (liveOutgrowth != null) {
      liveOutgrowth.bentLengthwiseHour(liveOutgrowth.catchJettingWhen() + 1);
      nowUnanswered--;

      if (liveOutgrowth.catchJettingWhen() == liveOutgrowth.catchRunnableScale()) {
        liveOutgrowth.doExodusAgain(this.startPresentlyMarch());
        this.finalizedLitigate.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.sthCloth = true;
      }

      if (nowUnanswered == 0 && liveOutgrowth != null) {

        if (happyStopper.isEmpty()) {
          nowUnanswered = AgainGiant;
        } else {
          happyStopper.addLast(liveOutgrowth);
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

      if (liveOutgrowth == null && !happyStopper.isEmpty()) {
        liveOutgrowth = happyStopper.removeFirst();
        capacityMechanism(liveOutgrowth);
        liveOutgrowth.determineBegunBeginning(this.startPresentlyMarch());
        nowUnanswered = AgainGiant;
      }
    }
  }

  public void cycleIn(Proceeding methods) {
    happyStopper.addLast(methods);
  }
}
