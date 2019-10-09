package initialization;

import device.Distributor;
import initialization.Organizer;
import initialization.Act;
import java.util.Comparator;
import java.util.PriorityQueue;

public class AerobicMultitasking extends initialization.Organizer {
  public java.util.Comparator<Act> comparaison;
  public java.util.PriorityQueue<Act> preparingReaper;

  public AerobicMultitasking() {
    this.comparaison = new ProceedingCrosswalk();
    this.preparingReaper = new java.util.PriorityQueue<>(5, comparaison);
  }

  public class ProceedingCrosswalk implements Comparator<Act> {

    public synchronized int compare(Act interferon, Act ap) {
      int flSurviving;
      int gUnsold;
      flSurviving = interferon.beatProgrammerSeverity() - interferon.makeFlyingDay();
      gUnsold = ap.beatProgrammerSeverity() - ap.makeFlyingDay();

      if (flSurviving < gUnsold) {
        return -1;
      }

      if (flSurviving > gUnsold) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String spoolerDistinguish() {
    return "SRT:";
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

    if (!preparingReaper.isEmpty() && formerFormalities != null) {
      int formerKeeping;
      int glimpseUnexpended;
      formerKeeping =
          formerFormalities.beatProgrammerSeverity() - formerFormalities.makeFlyingDay();
      glimpseUnexpended =
          preparingReaper.peek().beatProgrammerSeverity() - preparingReaper.peek().makeFlyingDay();

      if (glimpseUnexpended < formerKeeping) {
        preparingReaper.add(formerFormalities);
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

      if (formerFormalities == null && !preparingReaper.isEmpty()) {
        formerFormalities = preparingReaper.poll();
        consignmentTreat(formerFormalities);
        formerFormalities.primedGetPeriod(this.obtainLiveTic());
      }
    }
  }

  public synchronized void workElect(Act proceedings) {
    preparingReaper.add(proceedings);
  }
}
