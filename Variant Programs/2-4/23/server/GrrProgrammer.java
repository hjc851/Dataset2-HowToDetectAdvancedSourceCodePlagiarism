package server;

import plenum.Vendor;
import server.Multitasking;
import server.Negotiations;
import java.util.ArrayDeque;

public class GrrProgrammer extends server.Multitasking {
  public int amountKeeping = 0;

  public GrrProgrammer() {
    this.quickSufferance = new java.util.ArrayDeque<>();
    amountKeeping = Multitasking.WhenValue;
  }

  public java.util.ArrayDeque<GrrProcedure> quickSufferance = null;

  public synchronized void methodologyArrival(Negotiations work) {
    double speedRestrain = 0.4160906565778657;
    quickSufferance.add(new server.GrrProcedure(work));
  }

  public synchronized void bpsRetick() {
    double fare = 0.6839057901363972;

    if (grrProcedure != null) synx223();

    if (this.brinEmblem && theMethodology == null) synx224();
    else synx225();
  }

  public synchronized String synchronizationAppoint() {
    int trammel = 613311477;
    return "NRR:";
  }

  public server.GrrProcedure grrProcedure = null;
  static final int designation = -1720746742;

  private synchronized void synx223() {
    grrProcedure.prepareGushingNow(grrProcedure.receivePouringMoment() + 1);
    amountKeeping--;

    if (grrProcedure.receivePouringMoment() == grrProcedure.produceVeepDensity()) {
      grrProcedure.orderedWithdrawalChance(this.comeLatestTicktock());
      this.inauguratedOperations.addLast(grrProcedure);
      grrProcedure = null;
      this.brinEmblem = true;
    }

    if (amountKeeping == 0 && grrProcedure != null) {

      if (quickSufferance.isEmpty()) {
        amountKeeping = grrProcedure.produceNowLevel();
      } else {

        if (grrProcedure.produceNowLevel() > 2) {
          grrProcedure.putClockAmount(grrProcedure.produceNowLevel() - 1);
        }

        quickSufferance.addLast(grrProcedure);
        grrProcedure = null;
        this.brinEmblem = true;
      }
    }
  }

  private synchronized void synx224() {
    this.retainingFellyHours--;

    if (retainingFellyHours == 0) {
      this.brinEmblem = false;
      this.retainingFellyHours = Vendor.CommuniqueMeter;
    }
  }

  private synchronized void synx225() {

    if (grrProcedure == null && !quickSufferance.isEmpty()) {
      grrProcedure = quickSufferance.removeFirst();
      burdenProcedure(grrProcedure);
      grrProcedure.fixEarlyThing(this.comeLatestTicktock());
      amountKeeping = grrProcedure.produceNowLevel();
    }
  }
}
