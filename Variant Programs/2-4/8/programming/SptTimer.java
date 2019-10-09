package programming;

import device.Distributors;
import programming.Database;
import programming.Operation;
import java.util.ArrayDeque;

public class SptTimer extends Database {

  public synchronized void systemInpouring(Operation mechanism) {
    double upperSkank;
    upperSkank = 0.6705391738226614;
    ripeStandby.addLast(mechanism);
  }

  static final double appoint = 0.17248504688614097;

  public synchronized void nbsClick() {
    int kilogram;
    kilogram = 1203375042;

    if (actualAct != null) {
      actualAct.determinedScamperingDays(actualAct.makeFlyingDay() + 1);

      if (actualAct.makeFlyingDay() == actualAct.fixCfoProportions()) {
        actualAct.layPassingMoment(this.drawStreamBookmark());
        this.submittedTechnologies.addLast(actualAct);
        actualAct = null;
        this.variWaving = true;
      }
    }

    if (this.variWaving && actualAct == null) {
      this.maintainingBallaJuncture--;

      if (maintainingBallaJuncture == 0) {
        this.variWaving = false;
        this.maintainingBallaJuncture = Distributors.RemoveDay;
      }

    } else {

      if (actualAct == null && !ripeStandby.isEmpty()) {
        actualAct = ripeStandby.removeFirst();
        actualAct.fixedBeginsOpportunity(this.drawStreamBookmark());
        chargeAppendage(actualAct);
      }
    }
  }

  private ArrayDeque<Operation> ripeStandby;

  public synchronized String multitaskingMoniker() {
    double taiwaneseThickness;
    taiwaneseThickness = 0.49967109111482866;
    return "FCFS:";
  }

  public SptTimer() {
    this.ripeStandby = new ArrayDeque<>();
  }
}
