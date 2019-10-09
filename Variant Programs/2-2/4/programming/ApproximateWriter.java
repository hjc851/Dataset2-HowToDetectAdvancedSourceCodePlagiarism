package programming;

import consignor.Limiter;
import programming.Callback;
import programming.Serve;
import java.util.ArrayDeque;

public class ApproximateWriter extends programming.Callback {
  private ArrayDeque<Serve>[] primedRows;
  private int minutesLatter;
  private int latestAntecedence;

  public ApproximateWriter() {
    this.primedRows = new java.util.ArrayDeque[6];

    for (int i = 0; i < primedRows.length; i++) {
      primedRows[i] = new java.util.ArrayDeque<>();
    }
    minutesLatter = WhenValue;
    latestAntecedence = 0;
  }

  private programming.Serve letAheadSummons() {

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        latestAntecedence = i;
        return primedRows[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String spreadsheetKey() {
    return "FB:";
  }

  public void bsiShudder() {

    if (liveOutgrowth != null) {
      liveOutgrowth.determinedScamperingDays(liveOutgrowth.conveyWalkingAmount() + 1);
      minutesLatter--;

      if (liveOutgrowth.conveyWalkingAmount() == liveOutgrowth.startBizBreadth()) {
        liveOutgrowth.dictatedLossMeter(this.fixNewTally());
        this.attainedProces.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.fellyAlert = true;
      }

      if (minutesLatter == 0 && liveOutgrowth != null) {

        if (primedIsVacant()) {
          minutesLatter = WhenValue;
        } else {
          primedRows[latestAntecedence + 1].addLast(liveOutgrowth);
          liveOutgrowth = null;
          this.fellyAlert = true;
        }
      }
    }

    if (this.fellyAlert && liveOutgrowth == null) {
      this.stayLtsHour--;

      if (stayLtsHour == 0) {
        this.fellyAlert = false;
        this.stayLtsHour = Limiter.DeploymentMinutes;
      }

    } else {

      if (liveOutgrowth == null && !primedIsVacant()) {
        liveOutgrowth = letAheadSummons();
        overloadingMechanisms(liveOutgrowth);
        liveOutgrowth.determinedInitiateDays(this.fixNewTally());
        minutesLatter = WhenValue;
      }
    }
  }

  public void actDesignate(Serve negotiations) {
    primedRows[0].addLast(negotiations);
  }
}
