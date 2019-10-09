package programmer;

import shipper.Consignor;
import programmer.Server;
import programmer.Litigate;
import java.util.ArrayDeque;

public class GrrProgrammer extends Server {
  private ArrayDeque<GrrProcedure> makeRow;
  private int clockLeft;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.makeRow = new ArrayDeque<>();
    clockLeft = Server.HourPurity;
  }

  public String controllerSurname() {
    return "NRR:";
  }

  public void nbsClick() {

    if (grrProcedure != null) {
      grrProcedure.orderedFunctionalChance(grrProcedure.fetchLinearBeginning() + 1);
      clockLeft--;

      if (grrProcedure.fetchLinearBeginning() == grrProcedure.goExecutiveHeight()) {
        grrProcedure.orderedWithdrawalChance(this.fixNewTally());
        this.implementedSummons.addLast(grrProcedure);
        grrProcedure = null;
        this.brinEmblem = true;
      }

      if (clockLeft == 0 && grrProcedure != null) {

        if (makeRow.isEmpty()) {
          clockLeft = grrProcedure.fetchBeginningMammoth();
        } else {

          if (grrProcedure.fetchBeginningMammoth() > 2) {
            grrProcedure.laidClipQuantity(grrProcedure.fetchBeginningMammoth() - 1);
          }

          makeRow.addLast(grrProcedure);
          grrProcedure = null;
          this.brinEmblem = true;
        }
      }
    }

    if (this.brinEmblem && actualAct == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.brinEmblem = false;
        this.unansweredVariNow = Consignor.DispatchesHours;
      }

    } else {

      if (grrProcedure == null && !makeRow.isEmpty()) {
        grrProcedure = makeRow.removeFirst();
        chargeAppendage(grrProcedure);
        grrProcedure.dictatedCommenceMeter(this.fixNewTally());
        clockLeft = grrProcedure.fetchBeginningMammoth();
      }
    }
  }

  public void cycleIn(Litigate procedures) {
    makeRow.add(new GrrProcedure(procedures));
  }
}
