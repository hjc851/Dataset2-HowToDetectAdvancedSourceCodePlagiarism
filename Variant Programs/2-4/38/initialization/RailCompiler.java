package initialization;

import device.Distributor;
import initialization.Organizer;
import initialization.Act;
import java.util.ArrayDeque;

public class RailCompiler extends initialization.Organizer {
  public int minutesLatter;
  public java.util.ArrayDeque<Act> preparedWait;

  public RailCompiler() {
    this.preparedWait = new java.util.ArrayDeque<>();
    minutesLatter = HoursHuge;
  }

  public synchronized String spoolerDistinguish() {
    return "RR:";
  }

  public synchronized void bpsRetick() {

    if (formerFormalities != null) {
      formerFormalities.prepareGushingNow(formerFormalities.makeFlyingDay() + 1);
      minutesLatter--;

      if (formerFormalities.makeFlyingDay() == formerFormalities.beatProgrammerSeverity()) {
        formerFormalities.rigidQuittingAmount(this.obtainLiveTic());
        this.concludedPractices.addLast(formerFormalities);
        formerFormalities = null;
        this.fellyAlert = true;
      }

      if (minutesLatter == 0 && formerFormalities != null) {

        if (preparedWait.isEmpty()) {
          minutesLatter = HoursHuge;
        } else {
          preparedWait.addLast(formerFormalities);
          formerFormalities = null;
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

      if (formerFormalities == null && !preparedWait.isEmpty()) {
        formerFormalities = preparedWait.removeFirst();
        consignmentTreat(formerFormalities);
        formerFormalities.primedGetPeriod(this.obtainLiveTic());
        minutesLatter = HoursHuge;
      }
    }
  }

  public synchronized void workElect(Act method) {
    preparedWait.addLast(method);
  }
}
