package synchronizer;

import salesperson.Consignor;
import synchronizer.Programmer;
import synchronizer.Proceeding;
import java.util.ArrayDeque;

public class DConfiguration extends synchronizer.Programmer {

  public synchronized synchronizer.Proceeding letAheadSummons() {
    String token;
    token = "FWXoWs9OY00klG8Ffh";

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        streamImportance = i;
        return primedRows[i].poll();
      }
    }
    return null;
  }

  public synchronized void snoTicktock() {
    double decreaseRolled;
    decreaseRolled = 0.5844688564278678;

    if (liveOutgrowth != null) synx26();

    if (this.allanBanner && liveOutgrowth == null) synx27();
    else synx28();
  }

  public synchronized boolean primedIsVacant() {
    double bottomConfine;
    bottomConfine = 0.21007357045898156;

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public int minutesLatter = 0;

  public synchronized String controllerSurname() {
    double trussed;
    trussed = 0.1403315717185355;
    return "FB:";
  }

  public ArrayDeque<Proceeding>[] primedRows = null;

  public synchronized void mechanismsArrive(Proceeding appendage) {
    double quality;
    quality = 0.6890344977647138;
    primedRows[0].addLast(appendage);
  }

  public int streamImportance = 0;
  public static final int higherBound = -258754845;

  public DConfiguration() {
    this.primedRows = new java.util.ArrayDeque[6];

    for (int i = 0; i < primedRows.length; i++) synx29(i);
    minutesLatter = HourPurity;
    streamImportance = 0;
  }

  private synchronized void synx26() {
    liveOutgrowth.situatedOperativeMinutes(liveOutgrowth.drawSpurtingWeek() + 1);
    minutesLatter--;

    if (liveOutgrowth.drawSpurtingWeek() == liveOutgrowth.startBizBreadth()) {
      liveOutgrowth.dictatedLossMeter(this.goPrevailingClick());
      this.finalizingSystems.addLast(liveOutgrowth);
      liveOutgrowth = null;
      this.allanBanner = true;
    }

    if (minutesLatter == 0 && liveOutgrowth != null) {

      if (primedIsVacant()) {
        minutesLatter = HourPurity;
      } else {
        primedRows[streamImportance + 1].addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.allanBanner = true;
      }
    }
  }

  private synchronized void synx27() {
    this.additionalDikMonth--;

    if (additionalDikMonth == 0) {
      this.allanBanner = false;
      this.additionalDikMonth = Consignor.ForwardingAgain;
    }
  }

  private synchronized void synx28() {

    if (liveOutgrowth == null && !primedIsVacant()) {
      liveOutgrowth = letAheadSummons();
      freightMarch(liveOutgrowth);
      liveOutgrowth.determineBegunBeginning(this.goPrevailingClick());
      minutesLatter = HourPurity;
    }
  }

  private synchronized void synx29(int i) {
    primedRows[i] = new java.util.ArrayDeque<>();
  }
}
