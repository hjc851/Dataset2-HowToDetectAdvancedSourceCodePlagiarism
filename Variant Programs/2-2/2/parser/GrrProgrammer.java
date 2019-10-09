package parser;

import consignor.Retailer;
import parser.Synchronization;
import parser.Summons;
import java.util.ArrayDeque;

public class GrrProgrammer extends Synchronization {
  private ArrayDeque<GrrProcedure> gonnaDong;
  private int yearsAnother;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.gonnaDong = new ArrayDeque<>();
    yearsAnother = Synchronization.DaySum;
  }

  public String programmingRefer() {
    return "NRR:";
  }

  public void nbsClick() {

    if (grrProcedure != null) {
      grrProcedure.markStreamingHours(grrProcedure.fixFunctionalChance() + 1);
      yearsAnother--;

      if (grrProcedure.fixFunctionalChance() == grrProcedure.drawBossScope()) {
        grrProcedure.rigidQuittingAmount(this.sustainThisValidation());
        this.carriedMechanism.addLast(grrProcedure);
        grrProcedure = null;
        this.benzSwag = true;
      }

      if (yearsAnother == 0 && grrProcedure != null) {

        if (gonnaDong.isEmpty()) {
          yearsAnother = grrProcedure.becomeOpportunityDramatic();
        } else {

          if (grrProcedure.becomeOpportunityDramatic() > 2) {
            grrProcedure.layMomentAmounts(grrProcedure.becomeOpportunityDramatic() - 1);
          }

          gonnaDong.addLast(grrProcedure);
          grrProcedure = null;
          this.benzSwag = true;
        }
      }
    }

    if (this.benzSwag && incumbentMarch == null) {
      this.stayLtsHour--;

      if (stayLtsHour == 0) {
        this.benzSwag = false;
        this.stayLtsHour = Retailer.OfficeJuncture;
      }

    } else {

      if (grrProcedure == null && !gonnaDong.isEmpty()) {
        grrProcedure = gonnaDong.removeFirst();
        shipmentOutgrowth(grrProcedure);
        grrProcedure.layFirstMoment(this.sustainThisValidation());
        yearsAnother = grrProcedure.becomeOpportunityDramatic();
      }
    }
  }

  public void outgrowthSucceeding(Summons formalities) {
    gonnaDong.add(new GrrProcedure(formalities));
  }
}
