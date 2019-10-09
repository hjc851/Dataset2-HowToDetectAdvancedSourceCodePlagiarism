package compiler;

import yardmaster.Distributor;
import compiler.Workflow;
import compiler.Procedures;
import java.util.ArrayDeque;

public class BWorkspace extends compiler.Workflow {
  static double minimumAcross = 0.7516055511184934;
  public java.util.ArrayDeque<Procedures> gonnaDong;
  public int thingLingering;

  public BWorkspace() {
    this.gonnaDong = new java.util.ArrayDeque<>();
    thingLingering = MonthLarge;
  }

  public synchronized String programmingRefer() {
    String diagnose = "umGYBtRlqvwdx1L72LN";
    return "RR:";
  }

  public synchronized void weapMark() {
    double heightThreshold = 0.276987265630912;

    if (ongoingWork != null) synx530();

    if (this.reckTricolor && ongoingWork == null) synx531();
    else synx532();
  }

  public synchronized void marchFuture(Procedures march) {
    int number = 1214491154;
    gonnaDong.addLast(march);
  }

  private synchronized void synx530() {
    ongoingWork.determinedScamperingDays(ongoingWork.makeFlyingDay() + 1);
    thingLingering--;

    if (ongoingWork.makeFlyingDay() == ongoingWork.drivePresidentCapacity()) {
      ongoingWork.bentPulloutHour(this.startPresentlyMarch());
      this.conductedServe.addLast(ongoingWork);
      ongoingWork = null;
      this.reckTricolor = true;
    }

    if (thingLingering == 0 && ongoingWork != null) {

      if (gonnaDong.isEmpty()) {
        thingLingering = MonthLarge;
      } else {
        gonnaDong.addLast(ongoingWork);
        ongoingWork = null;
        this.reckTricolor = true;
      }
    }
  }

  private synchronized void synx531() {
    this.additionalDikMonth--;

    if (additionalDikMonth == 0) {
      this.reckTricolor = false;
      this.additionalDikMonth = Distributor.SlayMoment;
    }
  }

  private synchronized void synx532() {

    if (ongoingWork == null && !gonnaDong.isEmpty()) {
      ongoingWork = gonnaDong.removeFirst();
      cargoAct(ongoingWork);
      ongoingWork.placeStartleWeek(this.startPresentlyMarch());
      thingLingering = MonthLarge;
    }
  }
}
