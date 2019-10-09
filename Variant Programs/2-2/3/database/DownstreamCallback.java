package database;

import regulator.Device;
import database.Parser;
import database.Litigate;
import java.util.ArrayDeque;

public class DownstreamCallback extends database.Parser {
  private ArrayDeque<Litigate>[] preparingRanks;
  private int weekSurviving;
  private int thisPrioritization;

  public DownstreamCallback() {
    this.preparingRanks = new java.util.ArrayDeque[6];

    for (int i = 0; i < preparingRanks.length; i++) {
      preparingRanks[i] = new java.util.ArrayDeque<>();
    }
    weekSurviving = ClockAmount;
    thisPrioritization = 0;
  }

  private database.Litigate becomeAfterMethodology() {

    for (int i = 0; i < preparingRanks.length; i++) {

      if (!preparingRanks[i].isEmpty()) {
        thisPrioritization = i;
        return preparingRanks[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < preparingRanks.length; i++) {

      if (!preparingRanks[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String multitaskingMoniker() {
    return "FB:";
  }

  public void addTock() {

    if (formerFormalities != null) {
      formerFormalities.placeSpurtingWeek(formerFormalities.makeFlyingDay() + 1);
      weekSurviving--;

      if (formerFormalities.makeFlyingDay() == formerFormalities.fetchManagerVastness()) {
        formerFormalities.putDepartureClock(this.makeIncumbentTock());
        this.constructedMethodology.addLast(formerFormalities);
        formerFormalities = null;
        this.reckTricolor = true;
      }

      if (weekSurviving == 0 && formerFormalities != null) {

        if (primedIsVacant()) {
          weekSurviving = ClockAmount;
        } else {
          preparingRanks[thisPrioritization + 1].addLast(formerFormalities);
          formerFormalities = null;
          this.reckTricolor = true;
        }
      }
    }

    if (this.reckTricolor && formerFormalities == null) {
      this.remainderRemoDays--;

      if (remainderRemoDays == 0) {
        this.reckTricolor = false;
        this.remainderRemoDays = Device.ExpeditionPeriod;
      }

    } else {

      if (formerFormalities == null && !primedIsVacant()) {
        formerFormalities = becomeAfterMethodology();
        stowLitigate(formerFormalities);
        formerFormalities.prepareOffsetNow(this.makeIncumbentTock());
        weekSurviving = ClockAmount;
      }
    }
  }

  public void proceduresIngress(Litigate mechanism) {
    preparingRanks[0].addLast(mechanism);
  }
}
