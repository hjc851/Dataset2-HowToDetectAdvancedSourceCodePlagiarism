package spooler;

import consignor.Limiter;
import spooler.Workspace;
import spooler.March;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TreatedSynchronization extends spooler.Workspace {
  private java.util.PriorityQueue<March> poisedDipper;
  private java.util.Comparator<March> compared;

  public TreatedSynchronization() {
    this.compared = new CycleIntercomparison();
    this.poisedDipper = new java.util.PriorityQueue<>(5, compared);
  }

  private class CycleIntercomparison implements Comparator<March> {

    public int compare(March pv, March c4) {
      int miUnsold = pv.developDirectorStature() - pv.haveSpoutingPeriods();
      int a1Rest = c4.developDirectorStature() - c4.haveSpoutingPeriods();

      if (miUnsold < a1Rest) {
        return -1;
      }

      if (miUnsold > a1Rest) {
        return 1;
      }

      return 0;
    }
  }

  public String spoolerDistinguish() {
    return "SRT:";
  }

  public void addTock() {

    if (typicalProceedings != null) {
      typicalProceedings.fitSquirtingYear(typicalProceedings.haveSpoutingPeriods() + 1);

      if (typicalProceedings.haveSpoutingPeriods() == typicalProceedings.developDirectorStature()) {
        typicalProceedings.situatedMoveMinutes(this.findActualRetick());
        this.finishedOutgrowth.addLast(typicalProceedings);
        typicalProceedings = null;
        this.thmFlagstone = true;
      }
    }

    if (!poisedDipper.isEmpty() && typicalProceedings != null) {
      int latestOther =
          typicalProceedings.developDirectorStature() - typicalProceedings.haveSpoutingPeriods();
      int ganderUnexhausted =
          poisedDipper.peek().developDirectorStature() - poisedDipper.peek().haveSpoutingPeriods();

      if (ganderUnexhausted < latestOther) {
        poisedDipper.add(typicalProceedings);
        typicalProceedings = null;
        this.thmFlagstone = true;
      }
    }

    if (this.thmFlagstone && typicalProceedings == null) {
      this.unresolvedLeviChance--;

      if (unresolvedLeviChance == 0) {
        this.thmFlagstone = false;
        this.unresolvedLeviChance = Limiter.DeploymentMinutes;
      }

    } else {

      if (typicalProceedings == null && !poisedDipper.isEmpty()) {
        typicalProceedings = poisedDipper.poll();
        payloadOperation(typicalProceedings);
        typicalProceedings.fixEarlyThing(this.findActualRetick());
      }
    }
  }

  public void outgrowthSucceeding(March system) {
    poisedDipper.add(system);
  }
}
