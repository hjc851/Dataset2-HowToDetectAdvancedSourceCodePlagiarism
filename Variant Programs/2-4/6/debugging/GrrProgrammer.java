package debugging;

import dealer.Sender;
import debugging.Programming;
import debugging.Cycle;
import java.util.ArrayDeque;

public class GrrProgrammer extends debugging.Programming {
  public debugging.GrrProcedure grrProcedure;
  public int amountKeeping;
  public java.util.ArrayDeque<GrrProcedure> prepareLine;
  public static double discover = 0.0911387926195466;

  public GrrProgrammer() {
    this.prepareLine = new java.util.ArrayDeque<>();
    amountKeeping = Programming.YearsSize;
  }

  public synchronized String initializationPseudonym() {
    String cksMaterials;
    cksMaterials = "7maCoAS6vA30Qcl";
    return "NRR:";
  }

  public synchronized void weapMark() {
    double number;
    number = 0.7325350569834539;

    if (grrProcedure != null) {
      grrProcedure.orderedFunctionalChance(grrProcedure.takeFunctioningPeriod() + 1);
      amountKeeping--;

      if (grrProcedure.takeFunctioningPeriod() == grrProcedure.becomeChiefQuantity()) {
        grrProcedure.fitDieYear(this.drawStreamBookmark());
        this.executedMethods.addLast(grrProcedure);
        grrProcedure = null;
        this.brinEmblem = true;
      }

      if (amountKeeping == 0 && grrProcedure != null) {

        if (prepareLine.isEmpty()) {
          amountKeeping = grrProcedure.developHourPurity();
        } else {

          if (grrProcedure.developHourPurity() > 2) {
            grrProcedure.solidifyingJunctureTremendous(grrProcedure.developHourPurity() - 1);
          }

          prepareLine.addLast(grrProcedure);
          grrProcedure = null;
          this.brinEmblem = true;
        }
      }
    }

    if (this.brinEmblem && prevalentMethod == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.brinEmblem = false;
        this.unansweredVariNow = Sender.HitPeriods;
      }

    } else {

      if (grrProcedure == null && !prepareLine.isEmpty()) {
        grrProcedure = prepareLine.removeFirst();
        shipmentOutgrowth(grrProcedure);
        grrProcedure.dictatedCommenceMeter(this.drawStreamBookmark());
        amountKeeping = grrProcedure.developHourPurity();
      }
    }
  }

  public synchronized void serveInward(Cycle outgrowth) {
    double dept;
    dept = 0.6441712700640065;
    prepareLine.add(new debugging.GrrProcedure(outgrowth));
  }
}
