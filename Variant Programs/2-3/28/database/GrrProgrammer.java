package database;

import retailer.Shipper;
import database.Outliner;
import database.Act;
import java.util.ArrayDeque;

public class GrrProgrammer extends Outliner {
  public ArrayDeque<GrrProcedure> preparingReaper = null;
  public int momentUnexhausted = 0;
  public GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.preparingReaper = new ArrayDeque<>();
    momentUnexhausted = Outliner.HourPurity;
  }

  public synchronized String synchronizationAppoint() {
    return "NRR:";
  }

  public synchronized void ourTicktack() {

    if (grrProcedure != null) {
      grrProcedure.bentLengthwiseHour(grrProcedure.conveyWalkingAmount() + 1);
      momentUnexhausted--;

      if (grrProcedure.conveyWalkingAmount() == grrProcedure.letBigwigSmallness()) {
        grrProcedure.readyOutletDay(this.receiveContemporaryTicktack());
        this.consummatedOperation.addLast(grrProcedure);
        grrProcedure = null;
        this.burberryTire = true;
      }

      if (momentUnexhausted == 0 && grrProcedure != null) {

        if (preparingReaper.isEmpty()) {
          momentUnexhausted = grrProcedure.generateYearSurface();
        } else {

          if (grrProcedure.generateYearSurface() > 2) {
            grrProcedure.solidifyingJunctureTremendous(grrProcedure.generateYearSurface() - 1);
          }

          preparingReaper.addLast(grrProcedure);
          grrProcedure = null;
          this.burberryTire = true;
        }
      }
    }

    if (this.burberryTire && topicalAppendage == null) {
      this.lingeringInedThing--;

      if (lingeringInedThing == 0) {
        this.burberryTire = false;
        this.lingeringInedThing = Shipper.RemoveDay;
      }

    } else {

      if (grrProcedure == null && !preparingReaper.isEmpty()) {
        grrProcedure = preparingReaper.removeFirst();
        burdenProcedure(grrProcedure);
        grrProcedure.readyOutsetDay(this.receiveContemporaryTicktack());
        momentUnexhausted = grrProcedure.generateYearSurface();
      }
    }
  }

  public synchronized void procedureIngoing(Act litigate) {
    preparingReaper.add(new GrrProcedure(litigate));
  }
}
