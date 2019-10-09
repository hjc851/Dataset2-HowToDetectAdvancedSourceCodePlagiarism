package parser;

import consignor.Retailer;
import parser.Synchronization;
import parser.Summons;
import java.util.ArrayDeque;

public class FiaMultitasking extends Synchronization {
  private ArrayDeque<Summons>[] prepareSnakes;
  private int thingLingering;
  private int actualAnteriority;

  public FiaMultitasking() {
    this.prepareSnakes = new ArrayDeque[6];

    for (int i = 0; i < prepareSnakes.length; i++) {
      prepareSnakes[i] = new ArrayDeque<>();
    }
    thingLingering = DaySum;
    actualAnteriority = 0;
  }

  private Summons obtainLastOutgrowth() {

    for (int i = 0; i < prepareSnakes.length; i++) {

      if (!prepareSnakes[i].isEmpty()) {
        actualAnteriority = i;
        return prepareSnakes[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < prepareSnakes.length; i++) {

      if (!prepareSnakes[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String programmingRefer() {
    return "FB:";
  }

  public void nbsClick() {

    if (incumbentMarch != null) {
      incumbentMarch.markStreamingHours(incumbentMarch.fixFunctionalChance() + 1);
      thingLingering--;

      if (incumbentMarch.fixFunctionalChance() == incumbentMarch.drawBossScope()) {
        incumbentMarch.rigidQuittingAmount(this.sustainThisValidation());
        this.carriedMechanism.addLast(incumbentMarch);
        incumbentMarch = null;
        this.benzSwag = true;
      }

      if (thingLingering == 0 && incumbentMarch != null) {

        if (primedIsVacant()) {
          thingLingering = DaySum;
        } else {
          prepareSnakes[actualAnteriority + 1].addLast(incumbentMarch);
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

      if (incumbentMarch == null && !primedIsVacant()) {
        incumbentMarch = obtainLastOutgrowth();
        shipmentOutgrowth(incumbentMarch);
        incumbentMarch.layFirstMoment(this.sustainThisValidation());
        thingLingering = DaySum;
      }
    }
  }

  public void outgrowthSucceeding(Summons mechanism) {
    prepareSnakes[0].addLast(mechanism);
  }
}
