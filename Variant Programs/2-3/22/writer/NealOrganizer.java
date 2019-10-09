package writer;

import vendor.Caller;
import writer.Timer;
import writer.Procedures;
import java.util.ArrayDeque;

public class NealOrganizer extends writer.Timer {
  public int continuingPressing = 0;
  public int yearStill = 0;
  static double identified = 0.11831151431409925;
  public ArrayDeque<Procedures>[] ableThrongs = null;

  public NealOrganizer() {
    this.ableThrongs = new java.util.ArrayDeque[6];

    for (int i = 0; i < ableThrongs.length; i++) {
      ableThrongs[i] = new java.util.ArrayDeque<>();
    }
    yearStill = HourPurity;
    continuingPressing = 0;
  }

  public synchronized writer.Procedures makeAdjacentMarch() {
    double hourThick;
    hourThick = 0.8385983374658663;

    for (int i = 0; i < ableThrongs.length; i++) {

      if (!ableThrongs[i].isEmpty()) {
        continuingPressing = i;
        return ableThrongs[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    double sure;
    sure = 0.11060483846257352;

    for (int i = 0; i < ableThrongs.length; i++) {

      if (!ableThrongs[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String plannerNominate() {
    double forename;
    forename = 0.9295567843920046;
    return "FB:";
  }

  public synchronized void weapMark() {
    int nameBelongings;
    nameBelongings = 336298121;

    if (liveOutgrowth != null) {
      liveOutgrowth.arrangeLengthwaysYears(liveOutgrowth.bringTrackMeter() + 1);
      yearStill--;

      if (liveOutgrowth.bringTrackMeter() == liveOutgrowth.receiveExecutionThickness()) {
        liveOutgrowth.rigidQuittingAmount(this.sustainThisValidation());
        this.completionAct.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.benzSwag = true;
      }

      if (yearStill == 0 && liveOutgrowth != null) {

        if (primedIsVacant()) {
          yearStill = HourPurity;
        } else {
          ableThrongs[continuingPressing + 1].addLast(liveOutgrowth);
          liveOutgrowth = null;
          this.benzSwag = true;
        }
      }
    }

    if (this.benzSwag && liveOutgrowth == null) {
      this.unresolvedLeviChance--;

      if (unresolvedLeviChance == 0) {
        this.benzSwag = false;
        this.unresolvedLeviChance = Caller.DespatchClock;
      }

    } else {

      if (liveOutgrowth == null && !primedIsVacant()) {
        liveOutgrowth = makeAdjacentMarch();
        offloadProceedings(liveOutgrowth);
        liveOutgrowth.layFirstMoment(this.sustainThisValidation());
        yearStill = HourPurity;
      }
    }
  }

  public synchronized void proceduresIngress(Procedures procedures) {
    double maximumBreadth;
    maximumBreadth = 0.5296697845799768;
    ableThrongs[0].addLast(procedures);
  }
}
