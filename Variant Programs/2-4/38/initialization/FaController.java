package initialization;

import device.Distributor;
import initialization.Organizer;
import initialization.Act;
import java.util.ArrayDeque;

public class FaController extends initialization.Organizer {
  public int formerTask;
  public int junctureMaintaining;
  public ArrayDeque<Act>[] preppedDelays;

  public FaController() {
    this.preppedDelays = new java.util.ArrayDeque[6];

    for (int i = 0; i < preppedDelays.length; i++) {
      preppedDelays[i] = new java.util.ArrayDeque<>();
    }
    junctureMaintaining = HoursHuge;
    formerTask = 0;
  }

  public synchronized initialization.Act generateComingTreat() {

    for (int i = 0; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        formerTask = i;
        return preppedDelays[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String spoolerDistinguish() {
    return "FB:";
  }

  public synchronized void bpsRetick() {

    if (formerFormalities != null) {
      formerFormalities.prepareGushingNow(formerFormalities.makeFlyingDay() + 1);
      junctureMaintaining--;

      if (formerFormalities.makeFlyingDay() == formerFormalities.beatProgrammerSeverity()) {
        formerFormalities.rigidQuittingAmount(this.obtainLiveTic());
        this.concludedPractices.addLast(formerFormalities);
        formerFormalities = null;
        this.fellyAlert = true;
      }

      if (junctureMaintaining == 0 && formerFormalities != null) {

        if (primedIsVacant()) {
          junctureMaintaining = HoursHuge;
        } else {
          preppedDelays[formerTask + 1].addLast(formerFormalities);
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

      if (formerFormalities == null && !primedIsVacant()) {
        formerFormalities = generateComingTreat();
        consignmentTreat(formerFormalities);
        formerFormalities.primedGetPeriod(this.obtainLiveTic());
        junctureMaintaining = HoursHuge;
      }
    }
  }

  public synchronized void workElect(Act outgrowth) {
    preppedDelays[0].addLast(outgrowth);
  }
}
