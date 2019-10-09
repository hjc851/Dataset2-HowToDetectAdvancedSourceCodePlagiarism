package timer;

import starter.Starter;
import timer.Parser;
import timer.Method;
import java.util.ArrayDeque;

public class GrrProgrammer extends timer.Parser {
  public java.util.ArrayDeque<GrrProcedure> preparingReaper;

  public synchronized void ourTicktack() {

    if (grrProcedure != null) {
      grrProcedure.bentLengthwiseHour(grrProcedure.produceGushingNow() + 1);
      clockLeft--;

      if (grrProcedure.produceGushingNow() == grrProcedure.obtainTimeoutLength()) {
        grrProcedure.markDeceaseHours(this.canExistingDial());
        this.consummatedOperation.addLast(grrProcedure);
        grrProcedure = null;
        this.sthCloth = true;
      }

      if (clockLeft == 0 && grrProcedure != null) {

        if (preparingReaper.isEmpty()) {
          clockLeft = grrProcedure.drawWeekVolume();
        } else {

          if (grrProcedure.drawWeekVolume() > 2) {
            grrProcedure.markHoursHuge(grrProcedure.drawWeekVolume() - 1);
          }

          preparingReaper.addLast(grrProcedure);
          grrProcedure = null;
          this.sthCloth = true;
        }
      }
    }

    if (this.sthCloth && latestOperation == null) {
      this.stillPassenYear--;

      if (stillPassenYear == 0) {
        this.sthCloth = false;
        this.stillPassenYear = Starter.DetachmentBeginning;
      }

    } else {

      if (grrProcedure == null && !preparingReaper.isEmpty()) {
        grrProcedure = preparingReaper.removeFirst();
        loaderNegotiations(grrProcedure);
        grrProcedure.arrangedGoSentence(this.canExistingDial());
        clockLeft = grrProcedure.drawWeekVolume();
      }
    }
  }

  public synchronized void operationInbound(Method appendage) {
    preparingReaper.add(new timer.GrrProcedure(appendage));
  }

  public GrrProgrammer() {
    this.preparingReaper = new java.util.ArrayDeque<>();
    clockLeft = Parser.DaySum;
  }

  public synchronized String synchronizationAppoint() {
    return "NRR:";
  }

  public int clockLeft;
  public timer.GrrProcedure grrProcedure;
}
