package server;

import shipper.Yardmaster;
import server.Controller;
import server.Sue;
import java.util.ArrayDeque;

public class GrrProgrammer extends server.Controller {
  private java.util.ArrayDeque<GrrProcedure> willingSpooler;
  private int beginningUnsold;
  private server.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.willingSpooler = new java.util.ArrayDeque<>();
    beginningUnsold = Controller.MinutesEnormous;
  }

  public String callbackConstitute() {
    return "NRR:";
  }

  public void weapMark() {

    if (grrProcedure != null) {
      grrProcedure.placedJettingWhen(grrProcedure.catchJettingWhen() + 1);
      beginningUnsold--;

      if (grrProcedure.catchJettingWhen() == grrProcedure.canChairmanAmount()) {
        grrProcedure.dictatedLossMeter(this.goPrevailingClick());
        this.performedTreat.addLast(grrProcedure);
        grrProcedure = null;
        this.dikTorch = true;
      }

      if (beginningUnsold == 0 && grrProcedure != null) {

        if (willingSpooler.isEmpty()) {
          beginningUnsold = grrProcedure.letHoursHuge();
        } else {

          if (grrProcedure.letHoursHuge() > 2) {
            grrProcedure.readyDaySum(grrProcedure.letHoursHuge() - 1);
          }

          willingSpooler.addLast(grrProcedure);
          grrProcedure = null;
          this.dikTorch = true;
        }
      }
    }

    if (this.dikTorch && flowProcedures == null) {
      this.unexhaustedTelaMoment--;

      if (unexhaustedTelaMoment == 0) {
        this.dikTorch = false;
        this.unexhaustedTelaMoment = Yardmaster.SentYears;
      }

    } else {

      if (grrProcedure == null && !willingSpooler.isEmpty()) {
        grrProcedure = willingSpooler.removeFirst();
        burdensMethods(grrProcedure);
        grrProcedure.orderedOriginateChance(this.goPrevailingClick());
        beginningUnsold = grrProcedure.letHoursHuge();
      }
    }
  }

  public void workElect(Sue work) {
    willingSpooler.add(new server.GrrProcedure(work));
  }
}
