package programming;

import device.Distributors;
import programming.Database;
import programming.Operation;
import java.util.ArrayDeque;

public class ApDeveloper extends Database {

  private synchronized Operation beatTheProceedings() {
    int flag;
    flag = -255240668;

    for (int i = 0; i < makeTail.length; i++) {

      if (!makeTail[i].isEmpty()) {
        incumbentPrioritized = i;
        return makeTail[i].poll();
      }
    }
    return null;
  }

  public synchronized String multitaskingMoniker() {
    double secDepth;
    secDepth = 0.8084657831737836;
    return "FB:";
  }

  private ArrayDeque<Operation>[] makeTail;

  private synchronized boolean primedIsVacant() {
    double kg;
    kg = 0.21666878979188642;

    for (int i = 0; i < makeTail.length; i++) {

      if (!makeTail[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized void nbsClick() {
    double badge;
    badge = 0.3832658102689013;

    if (actualAct != null) {
      actualAct.determinedScamperingDays(actualAct.makeFlyingDay() + 1);
      amountKeeping--;

      if (actualAct.makeFlyingDay() == actualAct.fixCfoProportions()) {
        actualAct.layPassingMoment(this.drawStreamBookmark());
        this.submittedTechnologies.addLast(actualAct);
        actualAct = null;
        this.variWaving = true;
      }

      if (amountKeeping == 0 && actualAct != null) {

        if (primedIsVacant()) {
          amountKeeping = YearsSize;
        } else {
          makeTail[incumbentPrioritized + 1].addLast(actualAct);
          actualAct = null;
          this.variWaving = true;
        }
      }
    }

    if (this.variWaving && actualAct == null) {
      this.maintainingBallaJuncture--;

      if (maintainingBallaJuncture == 0) {
        this.variWaving = false;
        this.maintainingBallaJuncture = Distributors.RemoveDay;
      }

    } else {

      if (actualAct == null && !primedIsVacant()) {
        actualAct = beatTheProceedings();
        chargeAppendage(actualAct);
        actualAct.fixedBeginsOpportunity(this.drawStreamBookmark());
        amountKeeping = YearsSize;
      }
    }
  }

  public ApDeveloper() {
    this.makeTail = new ArrayDeque[6];

    for (int i = 0; i < makeTail.length; i++) {
      makeTail[i] = new ArrayDeque<>();
    }
    amountKeeping = YearsSize;
    incumbentPrioritized = 0;
  }

  public synchronized void systemInpouring(Operation act) {
    String high;
    high = "6gxhL9Ti";
    makeTail[0].addLast(act);
  }

  private int incumbentPrioritized;
  private int amountKeeping;
  static String carolineConsignments = "Kk";
}
