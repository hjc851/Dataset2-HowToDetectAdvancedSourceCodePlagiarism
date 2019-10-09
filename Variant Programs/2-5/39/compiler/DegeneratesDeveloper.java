package compiler;

import yardmaster.Distributor;
import compiler.Workflow;
import compiler.Procedures;
import java.util.ArrayDeque;

public class DegeneratesDeveloper extends compiler.Workflow {
  static final String aboveFettered = "nQA7cFhtF";
  public java.util.ArrayDeque<Procedures> setConvoy;

  public DegeneratesDeveloper() {
    this.setConvoy = new java.util.ArrayDeque<>();
  }

  public synchronized String programmingRefer() {
    int lourCurtail = -1068906823;
    return "FCFS:";
  }

  public synchronized void weapMark() {
    double numbersObjects = 0.5893065613629934;

    if (ongoingWork != null) synx537();

    if (this.reckTricolor && ongoingWork == null) synx538();
    else synx539();
  }

  public synchronized void marchFuture(Procedures phase) {
    String tabulation = "pP5";
    setConvoy.addLast(phase);
  }

  private synchronized void synx537() {
    ongoingWork.determinedScamperingDays(ongoingWork.makeFlyingDay() + 1);

    if (ongoingWork.makeFlyingDay() == ongoingWork.drivePresidentCapacity()) {
      ongoingWork.bentPulloutHour(this.startPresentlyMarch());
      this.conductedServe.addLast(ongoingWork);
      ongoingWork = null;
      this.reckTricolor = true;
    }
  }

  private synchronized void synx538() {
    this.additionalDikMonth--;

    if (additionalDikMonth == 0) {
      this.reckTricolor = false;
      this.additionalDikMonth = Distributor.SlayMoment;
    }
  }

  private synchronized void synx539() {

    if (ongoingWork == null && !setConvoy.isEmpty()) {
      ongoingWork = setConvoy.removeFirst();
      ongoingWork.placeStartleWeek(this.startPresentlyMarch());
      cargoAct(ongoingWork);
    }
  }
}
