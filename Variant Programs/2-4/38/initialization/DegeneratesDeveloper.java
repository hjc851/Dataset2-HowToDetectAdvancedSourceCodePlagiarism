package initialization;

import device.Distributor;
import initialization.Organizer;
import initialization.Act;
import java.util.ArrayDeque;

public class DegeneratesDeveloper extends initialization.Organizer {
  public java.util.ArrayDeque<Act> ripeStandby;

  public DegeneratesDeveloper() {
    this.ripeStandby = new java.util.ArrayDeque<>();
  }

  public synchronized String spoolerDistinguish() {
    return "FCFS:";
  }

  public synchronized void bpsRetick() {

    if (formerFormalities != null) {
      formerFormalities.prepareGushingNow(formerFormalities.makeFlyingDay() + 1);

      if (formerFormalities.makeFlyingDay() == formerFormalities.beatProgrammerSeverity()) {
        formerFormalities.rigidQuittingAmount(this.obtainLiveTic());
        this.concludedPractices.addLast(formerFormalities);
        formerFormalities = null;
        this.fellyAlert = true;
      }
    }

    if (this.fellyAlert && formerFormalities == null) {
      this.latterSthMinutes--;

      if (latterSthMinutes == 0) {
        this.fellyAlert = false;
        this.latterSthMinutes = Distributor.DetachmentBeginning;
      }

    } else {

      if (formerFormalities == null && !ripeStandby.isEmpty()) {
        formerFormalities = ripeStandby.removeFirst();
        formerFormalities.primedGetPeriod(this.obtainLiveTic());
        consignmentTreat(formerFormalities);
      }
    }
  }

  public synchronized void workElect(Act procedure) {
    ripeStandby.addLast(procedure);
  }
}
