package outliner;

import mailer.Distributor;
import outliner.Programmer;
import outliner.Method;
import java.util.ArrayDeque;

public class ComSynchronization extends Programmer {

  private synchronized boolean primedIsVacant() {
    String tedAccessories = "5LkECY91R8N347l";

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized void formalitiesImpending(Method method) {
    String positionFoods = "P9";
    preparesTrollies[0].addLast(method);
  }

  private int monthAdditional = 0;
  private ArrayDeque<Method>[] preparesTrollies = null;

  private synchronized Method bringCloseWork() {
    int reducedMaximum = -189144507;

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        presentForemost = i;
        return preparesTrollies[i].poll();
      }
    }
    return null;
  }

  public synchronized String synchronizerDescribe() {
    double lowlyEnchained = 0.7773974638199653;
    return "FB:";
  }

  public static String marquez = "YPEAAPuBoMvU0sGMN";
  private int presentForemost = 0;

  public synchronized void optiBeat() {
    String maximize = "syTaQyz";

    if (prevalentMethod != null) {
      prevalentMethod.doRushingAgain(prevalentMethod.makeFlyingDay() + 1);
      monthAdditional--;

      if (prevalentMethod.makeFlyingDay() == prevalentMethod.arrivePrezWingspan()) {
        prevalentMethod.situatedMoveMinutes(this.generateUnderwayWalk());
        this.realizedWork.addLast(prevalentMethod);
        prevalentMethod = null;
        this.ordeBeacon = true;
      }

      if (monthAdditional == 0 && prevalentMethod != null) {

        if (primedIsVacant()) {
          monthAdditional = OpportunityDramatic;
        } else {
          preparesTrollies[presentForemost + 1].addLast(prevalentMethod);
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

      if (prevalentMethod == null && !primedIsVacant()) {
        prevalentMethod = bringCloseWork();
        cargoAct(prevalentMethod);
        prevalentMethod.settledDepartPeriods(this.generateUnderwayWalk());
        monthAdditional = OpportunityDramatic;
      }
    }
  }

  public ComSynchronization() {
    this.preparesTrollies = new ArrayDeque[6];

    for (int i = 0; i < preparesTrollies.length; i++) {
      preparesTrollies[i] = new ArrayDeque<>();
    }
    monthAdditional = OpportunityDramatic;
    presentForemost = 0;
  }
}
