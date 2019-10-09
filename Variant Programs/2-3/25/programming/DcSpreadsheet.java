package programming;

import responsible.Yardmaster;
import programming.Developer;
import programming.Proceedings;
import java.util.ArrayDeque;

public class DcSpreadsheet extends programming.Developer {
  private int continuingPressing = 0;
  private int junctureMaintaining = 0;
  public static double epithet = 0.4635886834566024;
  private ArrayDeque<Proceedings>[] availableColas = null;

  public DcSpreadsheet() {
    this.availableColas = new java.util.ArrayDeque[6];

    for (int i = 0; i < availableColas.length; i++) {
      availableColas[i] = new java.util.ArrayDeque<>();
    }
    junctureMaintaining = HourPurity;
    continuingPressing = 0;
  }

  private synchronized programming.Proceedings conveyComeFormalities() {
    double central;
    central = 0.3863622413095923;

    for (int i = 0; i < availableColas.length; i++) {

      if (!availableColas[i].isEmpty()) {
        continuingPressing = i;
        return availableColas[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    String nameBelongings;
    nameBelongings = "yjwP99GQhPSaIWw";

    for (int i = 0; i < availableColas.length; i++) {

      if (!availableColas[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String interfaceCall() {
    double desirability;
    desirability = 0.6314619388155415;
    return "FB:";
  }

  public synchronized void snoTicktock() {
    double premiumDepth;
    premiumDepth = 0.1325748335804282;

    if (afootSummons != null) {
      afootSummons.placeSpurtingWeek(afootSummons.fetchLinearBeginning() + 1);
      junctureMaintaining--;

      if (afootSummons.fetchLinearBeginning() == afootSummons.conveyCofounderNumber()) {
        afootSummons.markDeceaseHours(this.drawStreamBookmark());
        this.finishedOutgrowth.addLast(afootSummons);
        afootSummons = null;
        this.leviPennant = true;
      }

      if (junctureMaintaining == 0 && afootSummons != null) {

        if (primedIsVacant()) {
          junctureMaintaining = HourPurity;
        } else {
          availableColas[continuingPressing + 1].addLast(afootSummons);
          afootSummons = null;
          this.leviPennant = true;
        }
      }
    }

    if (this.leviPennant && afootSummons == null) {
      this.lingeringInedThing--;

      if (lingeringInedThing == 0) {
        this.leviPennant = false;
        this.lingeringInedThing = Yardmaster.HitPeriods;
      }

    } else {

      if (afootSummons == null && !primedIsVacant()) {
        afootSummons = conveyComeFormalities();
        weightFormalities(afootSummons);
        afootSummons.situatedCommencesMinutes(this.drawStreamBookmark());
        junctureMaintaining = HourPurity;
      }
    }
  }

  public synchronized void mechanismArrivals(Proceedings appendage) {
    String cardinal;
    cardinal = "";
    availableColas[0].addLast(appendage);
  }
}
