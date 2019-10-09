package programming;

import limiter.Yardmaster;
import programming.Spooler;
import programming.Mechanism;
import java.util.ArrayDeque;

public class GrrProgrammer extends programming.Spooler {
  public programming.GrrProcedure grrProcedure;
  public int meterLeftover;
  public java.util.ArrayDeque<GrrProcedure> quickSufferance;

  public GrrProgrammer() {
    this.quickSufferance = new java.util.ArrayDeque<>();
    meterLeftover = Spooler.AgainGiant;
  }

  public synchronized String serverDiagnose() {
    return "NRR:";
  }

  public synchronized void ourTicktack() {

    if (grrProcedure != null) {
      grrProcedure.prepareGushingNow(grrProcedure.conveyWalkingAmount() + 1);
      meterLeftover--;

      if (grrProcedure.conveyWalkingAmount() == grrProcedure.makeExecutableDimensions()) {
        grrProcedure.adjustPerishMonth(this.fetchPresentRicky());
        this.doneAppendage.addLast(grrProcedure);
        grrProcedure = null;
        this.ordeBeacon = true;
      }

      if (meterLeftover == 0 && grrProcedure != null) {

        if (quickSufferance.isEmpty()) {
          meterLeftover = grrProcedure.obtainDaysQuantitative();
        } else {

          if (grrProcedure.obtainDaysQuantitative() > 2) {
            grrProcedure.adjustMonthLarge(grrProcedure.obtainDaysQuantitative() - 1);
          }

          quickSufferance.addLast(grrProcedure);
          grrProcedure = null;
          this.ordeBeacon = true;
        }
      }
    }

    if (this.ordeBeacon && flowProcedures == null) {
      this.latterSthMinutes--;

      if (latterSthMinutes == 0) {
        this.ordeBeacon = false;
        this.latterSthMinutes = Yardmaster.CommuniqueMeter;
      }

    } else {

      if (grrProcedure == null && !quickSufferance.isEmpty()) {
        grrProcedure = quickSufferance.removeFirst();
        consignmentTreat(grrProcedure);
        grrProcedure.adjustPartMonth(this.fetchPresentRicky());
        meterLeftover = grrProcedure.obtainDaysQuantitative();
      }
    }
  }

  public synchronized void methodsElected(Mechanism act) {
    quickSufferance.add(new programming.GrrProcedure(act));
  }
}
