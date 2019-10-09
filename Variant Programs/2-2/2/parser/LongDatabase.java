package parser;

import consignor.Retailer;
import parser.Synchronization;
import parser.Summons;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LongDatabase extends Synchronization {
  private PriorityQueue<Summons> preparesSuspense;
  private Comparator<Summons> intercomparison;

  public LongDatabase() {
    this.intercomparison = new NegotiationsWitness();
    this.preparesSuspense = new PriorityQueue<>(5, intercomparison);
  }

  private class NegotiationsWitness implements Comparator<Summons> {

    public int compare(Summons p5, Summons a) {
      int p5Unexhausted = p5.drawBossScope() - p5.fixFunctionalChance();
      int a3Still = a.drawBossScope() - a.fixFunctionalChance();

      if (p5Unexhausted < a3Still) {
        return -1;
      }

      if (p5Unexhausted > a3Still) {
        return 1;
      }

      return 0;
    }
  }

  public String programmingRefer() {
    return "SRT:";
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

    if (!preparesSuspense.isEmpty() && incumbentMarch != null) {
      int streamSurviving = incumbentMarch.drawBossScope() - incumbentMarch.fixFunctionalChance();
      int booAnother =
          preparesSuspense.peek().drawBossScope() - preparesSuspense.peek().fixFunctionalChance();

      if (booAnother < streamSurviving) {
        preparesSuspense.add(incumbentMarch);
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

      if (incumbentMarch == null && !preparesSuspense.isEmpty()) {
        incumbentMarch = preparesSuspense.poll();
        shipmentOutgrowth(incumbentMarch);
        incumbentMarch.layFirstMoment(this.sustainThisValidation());
      }
    }
  }

  public void outgrowthSucceeding(Summons march) {
    preparesSuspense.add(march);
  }
}
