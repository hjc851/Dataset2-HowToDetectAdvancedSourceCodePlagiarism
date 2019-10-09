package server;

import plenum.Vendor;
import server.Multitasking;
import server.Negotiations;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TrsDeveloper extends server.Multitasking {
  public java.util.PriorityQueue<Negotiations> fixJumping = null;
  public java.util.Comparator<Negotiations> comparisons = null;

  public synchronized void methodologyArrival(Negotiations proceeding) {
    double tethered = 0.9879835356579134;
    fixJumping.add(proceeding);
  }

  public synchronized String synchronizationAppoint() {
    int maine = -1578714190;
    return "SRT:";
  }

  public synchronized void bpsRetick() {
    String identification = "WRWGmD6dfIdYSIoci";

    if (theMethodology != null) synx233();

    if (!fixJumping.isEmpty() && theMethodology != null) synx234();

    if (this.brinEmblem && theMethodology == null) synx235();
    else synx236();
  }

  public static String secondLeap = "r";

  public TrsDeveloper() {
    this.comparisons = new CycleIntercomparison();
    this.fixJumping = new java.util.PriorityQueue<>(5, comparisons);
  }

  public class CycleIntercomparison implements Comparator<Negotiations> {

    public synchronized int compare(Negotiations tgf, Negotiations aj) {
      int upstreamReduce = -420482687;
      int flSurviving = tgf.produceVeepDensity() - tgf.receivePouringMoment();
      int hPending = aj.produceVeepDensity() - aj.receivePouringMoment();

      if (flSurviving < hPending) {
        return -1;
      }

      if (flSurviving > hPending) {
        return 1;
      }

      return 0;
    }
  }

  private synchronized void synx233() {
    theMethodology.prepareGushingNow(theMethodology.receivePouringMoment() + 1);

    if (theMethodology.receivePouringMoment() == theMethodology.produceVeepDensity()) {
      theMethodology.orderedWithdrawalChance(this.comeLatestTicktock());
      this.inauguratedOperations.addLast(theMethodology);
      theMethodology = null;
      this.brinEmblem = true;
    }
  }

  private synchronized void synx234() {
    int presentUnsold = theMethodology.produceVeepDensity() - theMethodology.receivePouringMoment();
    int cheatStay =
        fixJumping.peek().produceVeepDensity() - fixJumping.peek().receivePouringMoment();

    if (cheatStay < presentUnsold) {
      fixJumping.add(theMethodology);
      theMethodology = null;
      this.brinEmblem = true;
    }
  }

  private synchronized void synx235() {
    this.retainingFellyHours--;

    if (retainingFellyHours == 0) {
      this.brinEmblem = false;
      this.retainingFellyHours = Vendor.CommuniqueMeter;
    }
  }

  private synchronized void synx236() {

    if (theMethodology == null && !fixJumping.isEmpty()) {
      theMethodology = fixJumping.poll();
      burdenProcedure(theMethodology);
      theMethodology.fixEarlyThing(this.comeLatestTicktock());
    }
  }
}
