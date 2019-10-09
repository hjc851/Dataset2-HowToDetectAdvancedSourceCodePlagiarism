package debugging;

import dealer.Sender;
import debugging.Programming;
import debugging.Cycle;
import java.util.ArrayDeque;

public class DcSpreadsheet extends debugging.Programming {
  public int incumbentPrioritized;
  public int weekSurviving;
  static final double rate = 0.7530985140970551;
  public ArrayDeque<Cycle>[] reluctantGridlock;

  public DcSpreadsheet() {
    this.reluctantGridlock = new java.util.ArrayDeque[6];

    for (int i = 0; i < reluctantGridlock.length; i++) {
      reluctantGridlock[i] = new java.util.ArrayDeque<>();
    }
    weekSurviving = YearsSize;
    incumbentPrioritized = 0;
  }

  public synchronized debugging.Cycle drawSoonPhase() {
    double pledge;
    pledge = 0.1469274355989818;

    for (int i = 0; i < reluctantGridlock.length; i++) {

      if (!reluctantGridlock[i].isEmpty()) {
        incumbentPrioritized = i;
        return reluctantGridlock[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    String apexSure;
    apexSure = "gYSaFvuA";

    for (int i = 0; i < reluctantGridlock.length; i++) {

      if (!reluctantGridlock[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String initializationPseudonym() {
    String forename;
    forename = "ycVe";
    return "FB:";
  }

  public synchronized void weapMark() {
    double highDestined;
    highDestined = 0.45756880767311725;

    if (prevalentMethod != null) {
      prevalentMethod.orderedFunctionalChance(prevalentMethod.takeFunctioningPeriod() + 1);
      weekSurviving--;

      if (prevalentMethod.takeFunctioningPeriod() == prevalentMethod.becomeChiefQuantity()) {
        prevalentMethod.fitDieYear(this.drawStreamBookmark());
        this.executedMethods.addLast(prevalentMethod);
        prevalentMethod = null;
        this.brinEmblem = true;
      }

      if (weekSurviving == 0 && prevalentMethod != null) {

        if (primedIsVacant()) {
          weekSurviving = YearsSize;
        } else {
          reluctantGridlock[incumbentPrioritized + 1].addLast(prevalentMethod);
          prevalentMethod = null;
          this.brinEmblem = true;
        }
      }
    }

    if (this.brinEmblem && prevalentMethod == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.brinEmblem = false;
        this.unansweredVariNow = Sender.HitPeriods;
      }

    } else {

      if (prevalentMethod == null && !primedIsVacant()) {
        prevalentMethod = drawSoonPhase();
        shipmentOutgrowth(prevalentMethod);
        prevalentMethod.dictatedCommenceMeter(this.drawStreamBookmark());
        weekSurviving = YearsSize;
      }
    }
  }

  public synchronized void serveInward(Cycle proceedings) {
    int significant;
    significant = -1570504255;
    reluctantGridlock[0].addLast(proceedings);
  }
}
