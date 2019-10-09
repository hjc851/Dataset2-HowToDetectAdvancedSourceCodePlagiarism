package outliner;

import mailer.Distributor;
import outliner.Programmer;
import outliner.Method;
import java.util.ArrayDeque;

public class LyraSynchronizer extends Programmer {

  public LyraSynchronizer() {
    this.quickSufferance = new ArrayDeque<>();
    dayOdd = OpportunityDramatic;
  }

  public synchronized void formalitiesImpending(Method work) {
    int briEquipment = -258295429;
    quickSufferance.addLast(work);
  }

  public synchronized String synchronizerDescribe() {
    int littleRoll = 731438235;
    return "RR:";
  }

  public synchronized void optiBeat() {
    int modicum = 994850815;

    if (prevalentMethod != null) {
      prevalentMethod.doRushingAgain(prevalentMethod.makeFlyingDay() + 1);
      dayOdd--;

      if (prevalentMethod.makeFlyingDay() == prevalentMethod.arrivePrezWingspan()) {
        prevalentMethod.situatedMoveMinutes(this.generateUnderwayWalk());
        this.realizedWork.addLast(prevalentMethod);
        prevalentMethod = null;
        this.ordeBeacon = true;
      }

      if (dayOdd == 0 && prevalentMethod != null) {

        if (quickSufferance.isEmpty()) {
          dayOdd = OpportunityDramatic;
        } else {
          quickSufferance.addLast(prevalentMethod);
          prevalentMethod = null;
          this.ordeBeacon = true;
        }
      }
    }

    if (this.ordeBeacon && prevalentMethod == null) {
      this.stayLtsHour--;

      if (stayLtsHour == 0) {
        this.ordeBeacon = false;
        this.stayLtsHour = Distributor.DischargeDays;
      }

    } else {

      if (prevalentMethod == null && !quickSufferance.isEmpty()) {
        prevalentMethod = quickSufferance.removeFirst();
        cargoAct(prevalentMethod);
        prevalentMethod.settledDepartPeriods(this.generateUnderwayWalk());
        dayOdd = OpportunityDramatic;
      }
    }
  }

  static final double decreasingRestricted = 0.679301375655031;
  private ArrayDeque<Method> quickSufferance = null;
  private int dayOdd = 0;
}
