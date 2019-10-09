package initialization;

import device.Distributor;
import initialization.Organizer;
import initialization.Act;
import java.util.ArrayDeque;

public class GrrProgrammer extends initialization.Organizer {
  public initialization.GrrProcedure grrProcedure;
  public int periodsRest;
  public java.util.ArrayDeque<GrrProcedure> eagerJunk;

  public GrrProgrammer() {
    this.eagerJunk = new java.util.ArrayDeque<>();
    periodsRest = Organizer.HoursHuge;
  }

  public synchronized String spoolerDistinguish() {
    return "NRR:";
  }

  public synchronized void bpsRetick() {

    if (grrProcedure != null) {
      grrProcedure.prepareGushingNow(grrProcedure.makeFlyingDay() + 1);
      periodsRest--;

      if (grrProcedure.makeFlyingDay() == grrProcedure.beatProgrammerSeverity()) {
        grrProcedure.rigidQuittingAmount(this.obtainLiveTic());
        this.concludedPractices.addLast(grrProcedure);
        grrProcedure = null;
        this.fellyAlert = true;
      }

      if (periodsRest == 0 && grrProcedure != null) {

        if (eagerJunk.isEmpty()) {
          periodsRest = grrProcedure.generateYearSurface();
        } else {

          if (grrProcedure.generateYearSurface() > 2) {
            grrProcedure.placedWhenValue(grrProcedure.generateYearSurface() - 1);
          }

          eagerJunk.addLast(grrProcedure);
          grrProcedure = null;
          this.fellyAlert = true;
        }
      }
    }

    if (this.fellyAlert && formerFormalities == null) {
      this.latterSthMinutes--;

      if (latterSthMinutes == 0) {
        this.fellyAlert = false;
        this.latterSthMinutes = Distributor.DetachmentBeginning;
      }

    } else {

      if (grrProcedure == null && !eagerJunk.isEmpty()) {
        grrProcedure = eagerJunk.removeFirst();
        consignmentTreat(grrProcedure);
        grrProcedure.primedGetPeriod(this.obtainLiveTic());
        periodsRest = grrProcedure.generateYearSurface();
      }
    }
  }

  public synchronized void workElect(Act march) {
    eagerJunk.add(new initialization.GrrProcedure(march));
  }
}
