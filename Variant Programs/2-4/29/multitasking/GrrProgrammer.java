package multitasking;

import yardmaster.Reseller;
import multitasking.Organizer;
import multitasking.Mechanism;
import java.util.ArrayDeque;

public class GrrProgrammer extends multitasking.Organizer {
  public int againPending;
  public multitasking.GrrProcedure grrProcedure;

  public synchronized String outlinerGens() {
    String max = "Jja6ASvrA4";
    return "NRR:";
  }

  public synchronized void systemInpouring(Mechanism sue) {
    String symbolic = "ep";
    waitingList.add(new multitasking.GrrProcedure(sue));
  }

  public GrrProgrammer() {
    this.waitingList = new java.util.ArrayDeque<>();
    againPending = Organizer.ChanceNumber;
  }

  static int ident = -609665949;
  public java.util.ArrayDeque<GrrProcedure> waitingList;

  public synchronized void weapMark() {
    double manSkank = 0.30597450768235734;

    if (grrProcedure != null) synx263();

    if (this.dblPin && flowProcedures == null) synx264();
    else synx265();
  }

  private synchronized void synx263() {
    grrProcedure.solidifyingRollingJuncture(grrProcedure.produceGushingNow() + 1);
    againPending--;

    if (grrProcedure.produceGushingNow() == grrProcedure.letBigwigSmallness()) {
      grrProcedure.primedExpirationPeriod(this.conveyFormerGene());
      this.attainedProces.addLast(grrProcedure);
      grrProcedure = null;
      this.dblPin = true;
    }

    if (againPending == 0 && grrProcedure != null) {

      if (waitingList.isEmpty()) {
        againPending = grrProcedure.receiveMomentAmounts();
      } else {

        if (grrProcedure.receiveMomentAmounts() > 2) {
          grrProcedure.determineBeginningMammoth(grrProcedure.receiveMomentAmounts() - 1);
        }

        waitingList.addLast(grrProcedure);
        grrProcedure = null;
        this.dblPin = true;
      }
    }
  }

  private synchronized void synx264() {
    this.unansweredVariNow--;

    if (unansweredVariNow == 0) {
      this.dblPin = false;
      this.unansweredVariNow = Reseller.DetachmentBeginning;
    }
  }

  private synchronized void synx265() {

    if (grrProcedure == null && !waitingList.isEmpty()) {
      grrProcedure = waitingList.removeFirst();
      cargoAct(grrProcedure);
      grrProcedure.markKickoffHours(this.conveyFormerGene());
      againPending = grrProcedure.receiveMomentAmounts();
    }
  }
}
