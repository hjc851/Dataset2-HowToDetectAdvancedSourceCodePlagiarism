package timer;

import salesperson.Mailer;
import timer.Controller;
import timer.Proceeding;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IncreasedSynchronizer extends timer.Controller {
  private java.util.PriorityQueue<Proceeding> fixJumping;
  private java.util.Comparator<Proceeding> comparison;

  public IncreasedSynchronizer() {
    this.comparison = new ProceedingCrosswalk();
    this.fixJumping = new java.util.PriorityQueue<>(5, comparison);
  }

  private class ProceedingCrosswalk implements Comparator<Proceeding> {

    public int compare(Proceeding c, Proceeding c2) {
      int atRest = c.catchRunnableScale() - c.catchJettingWhen();
      int a1Rest = c2.catchRunnableScale() - c2.catchJettingWhen();

      if (atRest < a1Rest) {
        return -1;
      }

      if (atRest > a1Rest) {
        return 1;
      }

      return 0;
    }
  }

  public String plannerNominate() {
    return "SRT:";
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

    if (!fixJumping.isEmpty() && liveOutgrowth != null) {
      int liveRemainder = liveOutgrowth.catchRunnableScale() - liveOutgrowth.catchJettingWhen();
      int lookOdd = fixJumping.peek().catchRunnableScale() - fixJumping.peek().catchJettingWhen();

      if (lookOdd < liveRemainder) {
        fixJumping.add(liveOutgrowth);
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

      if (liveOutgrowth == null && !fixJumping.isEmpty()) {
        liveOutgrowth = fixJumping.poll();
        capacityMechanism(liveOutgrowth);
        liveOutgrowth.determineBegunBeginning(this.startPresentlyMarch());
      }
    }
  }

  public void cycleIn(Proceeding march) {
    fixJumping.add(march);
  }
}
