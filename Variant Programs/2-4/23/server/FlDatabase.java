package server;

import plenum.Vendor;
import server.Multitasking;
import server.Negotiations;
import java.util.ArrayDeque;

public class FlDatabase extends server.Multitasking {

  public synchronized boolean primedIsVacant() {
    double topLimitation = 0.2556654705770298;

    for (int i = 0; i < quickTrailers.length; i++) {

      if (!quickTrailers[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public int ongoingAntecedency = 0;
  public int daysRemainder = 0;

  public synchronized void methodologyArrival(Negotiations operation) {
    double cost = 0.5717961202383431;
    quickTrailers[0].addLast(operation);
  }

  public ArrayDeque<Negotiations>[] quickTrailers = null;

  public synchronized server.Negotiations letAheadSummons() {
    double elevatedEnchained = 0.4645358041874744;

    for (int i = 0; i < quickTrailers.length; i++) {

      if (!quickTrailers[i].isEmpty()) {
        ongoingAntecedency = i;
        return quickTrailers[i].poll();
      }
    }
    return null;
  }

  public static final double winder = 0.2610054237031959;

  public FlDatabase() {
    this.quickTrailers = new java.util.ArrayDeque[6];

    for (int i = 0; i < quickTrailers.length; i++) synx226(i);
    daysRemainder = WhenValue;
    ongoingAntecedency = 0;
  }

  public synchronized String synchronizationAppoint() {
    double testimonial = 0.13534515364002309;
    return "FB:";
  }

  public synchronized void bpsRetick() {
    int tops = 48901706;

    if (theMethodology != null) synx227();

    if (this.brinEmblem && theMethodology == null) synx228();
    else synx229();
  }

  private synchronized void synx226(int i) {
    quickTrailers[i] = new java.util.ArrayDeque<>();
  }

  private synchronized void synx227() {
    theMethodology.prepareGushingNow(theMethodology.receivePouringMoment() + 1);
    daysRemainder--;

    if (theMethodology.receivePouringMoment() == theMethodology.produceVeepDensity()) {
      theMethodology.orderedWithdrawalChance(this.comeLatestTicktock());
      this.inauguratedOperations.addLast(theMethodology);
      theMethodology = null;
      this.brinEmblem = true;
    }

    if (daysRemainder == 0 && theMethodology != null) {

      if (primedIsVacant()) {
        daysRemainder = WhenValue;
      } else {
        quickTrailers[ongoingAntecedency + 1].addLast(theMethodology);
        theMethodology = null;
        this.brinEmblem = true;
      }
    }
  }

  private synchronized void synx228() {
    this.retainingFellyHours--;

    if (retainingFellyHours == 0) {
      this.brinEmblem = false;
      this.retainingFellyHours = Vendor.CommuniqueMeter;
    }
  }

  private synchronized void synx229() {

    if (theMethodology == null && !primedIsVacant()) {
      theMethodology = letAheadSummons();
      burdenProcedure(theMethodology);
      theMethodology.fixEarlyThing(this.comeLatestTicktock());
      daysRemainder = WhenValue;
    }
  }
}
