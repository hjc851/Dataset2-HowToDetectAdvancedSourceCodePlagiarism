package parser;

import consignor.Retailer;
import parser.Synchronization;
import parser.Summons;
import java.util.ArrayDeque;

public class LampsProgrammer extends Synchronization {
  private ArrayDeque<Summons> cookCue;

  public LampsProgrammer() {
    this.cookCue = new ArrayDeque<>();
  }

  public String programmingRefer() {
    return "FCFS:";
  }

  public void nbsClick() {

    if (incumbentMarch != null) {
      incumbentMarch.markStreamingHours(incumbentMarch.fixFunctionalChance() + 1);

      if (incumbentMarch.fixFunctionalChance() == incumbentMarch.drawBossScope()) {
        incumbentMarch.rigidQuittingAmount(this.sustainThisValidation());
        this.carriedMechanism.addLast(incumbentMarch);
        incumbentMarch = null;
        this.benzSwag = true;
      }
    }

    if (this.benzSwag && incumbentMarch == null) {
      this.stayLtsHour--;

      if (stayLtsHour == 0) {
        this.benzSwag = false;
        this.stayLtsHour = Retailer.OfficeJuncture;
      }

    } else {

      if (incumbentMarch == null && !cookCue.isEmpty()) {
        incumbentMarch = cookCue.removeFirst();
        incumbentMarch.layFirstMoment(this.sustainThisValidation());
        shipmentOutgrowth(incumbentMarch);
      }
    }
  }

  public void outgrowthSucceeding(Summons work) {
    cookCue.addLast(work);
  }
}
