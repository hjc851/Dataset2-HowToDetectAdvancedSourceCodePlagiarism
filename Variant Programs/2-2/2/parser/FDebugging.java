package parser;

import consignor.Retailer;
import parser.Synchronization;
import parser.Summons;
import java.util.ArrayDeque;

public class FDebugging extends Synchronization {
  private ArrayDeque<Summons> reluctantCola;
  private int minutesLatter;

  public FDebugging() {
    this.reluctantCola = new ArrayDeque<>();
    minutesLatter = DaySum;
  }

  public String programmingRefer() {
    return "RR:";
  }

  public void nbsClick() {

    if (incumbentMarch != null) {
      incumbentMarch.markStreamingHours(incumbentMarch.fixFunctionalChance() + 1);
      minutesLatter--;

      if (incumbentMarch.fixFunctionalChance() == incumbentMarch.drawBossScope()) {
        incumbentMarch.rigidQuittingAmount(this.sustainThisValidation());
        this.carriedMechanism.addLast(incumbentMarch);
        incumbentMarch = null;
        this.benzSwag = true;
      }

      if (minutesLatter == 0 && incumbentMarch != null) {

        if (reluctantCola.isEmpty()) {
          minutesLatter = DaySum;
        } else {
          reluctantCola.addLast(incumbentMarch);
          incumbentMarch = null;
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

      if (incumbentMarch == null && !reluctantCola.isEmpty()) {
        incumbentMarch = reluctantCola.removeFirst();
        shipmentOutgrowth(incumbentMarch);
        incumbentMarch.layFirstMoment(this.sustainThisValidation());
        minutesLatter = DaySum;
      }
    }
  }

  public void outgrowthSucceeding(Summons procedure) {
    reluctantCola.addLast(procedure);
  }
}
