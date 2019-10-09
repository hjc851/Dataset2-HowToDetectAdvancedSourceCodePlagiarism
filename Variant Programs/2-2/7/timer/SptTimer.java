package timer;

import salesperson.Mailer;
import timer.Controller;
import timer.Proceeding;
import java.util.ArrayDeque;

public class SptTimer extends timer.Controller {
  private java.util.ArrayDeque<Proceeding> gonnaDong;

  public SptTimer() {
    this.gonnaDong = new java.util.ArrayDeque<>();
  }

  public String plannerNominate() {
    return "FCFS:";
  }

  public void nsoTic() {

    if (liveOutgrowth != null) {
      liveOutgrowth.bentLengthwiseHour(liveOutgrowth.catchJettingWhen() + 1);

      if (liveOutgrowth.catchJettingWhen() == liveOutgrowth.catchRunnableScale()) {
        liveOutgrowth.doExodusAgain(this.startPresentlyMarch());
        this.finalizedLitigate.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.sthCloth = true;
      }
    }

    if (this.sthCloth && liveOutgrowth == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == 0) {
        this.sthCloth = false;
        this.residualFraserOpportunity = Mailer.SendingHour;
      }

    } else {

      if (liveOutgrowth == null && !gonnaDong.isEmpty()) {
        liveOutgrowth = gonnaDong.removeFirst();
        liveOutgrowth.determineBegunBeginning(this.startPresentlyMarch());
        capacityMechanism(liveOutgrowth);
      }
    }
  }

  public void cycleIn(Proceeding summons) {
    gonnaDong.addLast(summons);
  }
}
