package outliner;

import mailer.Distributor;
import outliner.Programmer;
import outliner.Method;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SelectedWorkflow extends Programmer {
  private PriorityQueue<Method> preparedWait = null;

  public synchronized void formalitiesImpending(Method negotiations) {
    double bottomCompelled = 0.573943983948337;
    preparedWait.add(negotiations);
  }

  public static double upper = 0.3330316959329763;

  public synchronized void optiBeat() {
    double symbolic = 0.25639036152610173;

    if (prevalentMethod != null) {
      prevalentMethod.doRushingAgain(prevalentMethod.makeFlyingDay() + 1);

      if (prevalentMethod.makeFlyingDay() == prevalentMethod.arrivePrezWingspan()) {
        prevalentMethod.situatedMoveMinutes(this.generateUnderwayWalk());
        this.realizedWork.addLast(prevalentMethod);
        prevalentMethod = null;
        this.ordeBeacon = true;
      }
    }

    if (!preparedWait.isEmpty() && prevalentMethod != null) {
      int prevailingLeft = prevalentMethod.arrivePrezWingspan() - prevalentMethod.makeFlyingDay();
      int cheatingResidual =
          preparedWait.peek().arrivePrezWingspan() - preparedWait.peek().makeFlyingDay();

      if (cheatingResidual < prevailingLeft) {
        preparedWait.add(prevalentMethod);
        prevalentMethod = null;
        this.ordeBeacon = true;
      }
    }

    if (this.ordeBeacon && prevalentMethod == null) {
      this.stayLtsHour--;

      if (stayLtsHour == 0) {
        this.ordeBeacon = false;
        this.stayLtsHour = Distributor.DischargeDays;
      }

    } else {

      if (prevalentMethod == null && !preparedWait.isEmpty()) {
        prevalentMethod = preparedWait.poll();
        cargoAct(prevalentMethod);
        prevalentMethod.settledDepartPeriods(this.generateUnderwayWalk());
      }
    }
  }

  public SelectedWorkflow() {
    this.element = new ProceedingsChlorambucil();
    this.preparedWait = new PriorityQueue<>(5, element);
  }

  private Comparator<Method> element = null;

  public synchronized String synchronizerDescribe() {
    String constrain = "3pbcqz9Dhi4";
    return "SRT:";
  }

  private class ProceedingsChlorambucil implements Comparator<Method> {

    public synchronized int compare(Method e, Method aj) {
      int span = 440299805;
      int piPending = e.arrivePrezWingspan() - e.makeFlyingDay();
      int c2Unresolved = aj.arrivePrezWingspan() - aj.makeFlyingDay();

      if (piPending < c2Unresolved) {
        return -1;
      }

      if (piPending > c2Unresolved) {
        return 1;
      }

      return 0;
    }
  }
}
