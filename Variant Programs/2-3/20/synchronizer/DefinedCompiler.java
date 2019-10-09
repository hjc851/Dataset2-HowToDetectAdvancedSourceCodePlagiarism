package synchronizer;

import exporter.Shipper;
import synchronizer.Workspace;
import synchronizer.Act;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DefinedCompiler extends synchronizer.Workspace {
  public java.util.Comparator<Act> comparative;

  public synchronized void negotiationsNew(Act negotiations) {
    preparesSuspense.add(negotiations);
  }

  public synchronized String synchronizerDescribe() {
    return "SRT:";
  }

  public java.util.PriorityQueue<Act> preparesSuspense;

  public class CycleIntercomparison implements Comparator<Act> {

    public synchronized int compare(Act f, Act h) {
      int aFinal = f.drivePresidentCapacity() - f.driveRushingAgain();
      int blSurviving = h.drivePresidentCapacity() - h.driveRushingAgain();

      if (aFinal < blSurviving) {
        return -1;
      }

      if (aFinal > blSurviving) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized void optiBeat() {

    if (prevailingProcedure != null) {
      prevailingProcedure.solidifyingRollingJuncture(prevailingProcedure.driveRushingAgain() + 1);

      if (prevailingProcedure.driveRushingAgain() == prevailingProcedure.drivePresidentCapacity()) {
        prevailingProcedure.putDepartureClock(this.fixNewTally());
        this.finalizedLitigate.addLast(prevailingProcedure);
        prevailingProcedure = null;
        this.ballaBrigade = true;
      }
    }

    if (!preparesSuspense.isEmpty() && prevailingProcedure != null) {
      int ongoingLeftover =
          prevailingProcedure.drivePresidentCapacity() - prevailingProcedure.driveRushingAgain();
      int spyStill =
          preparesSuspense.peek().drivePresidentCapacity()
              - preparesSuspense.peek().driveRushingAgain();

      if (spyStill < ongoingLeftover) {
        preparesSuspense.add(prevailingProcedure);
        prevailingProcedure = null;
        this.ballaBrigade = true;
      }
    }

    if (this.ballaBrigade && prevailingProcedure == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.ballaBrigade = false;
        this.leavingBrinWhen = Shipper.OfficeJuncture;
      }

    } else {

      if (prevailingProcedure == null && !preparesSuspense.isEmpty()) {
        prevailingProcedure = preparesSuspense.poll();
        freightMarch(prevailingProcedure);
        prevailingProcedure.fitCommencementYear(this.fixNewTally());
      }
    }
  }

  public DefinedCompiler() {
    this.comparative = new CycleIntercomparison();
    this.preparesSuspense = new java.util.PriorityQueue<>(5, comparative);
  }
}
