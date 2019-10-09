package workspace;

import device.Reseller;
import workspace.Synchronizer;
import workspace.Act;
import java.util.ArrayDeque;

public class UsingProgramming extends Synchronizer {
  private ArrayDeque<Act> happyStopper;

  public UsingProgramming() {
    this.happyStopper = new ArrayDeque<>();
  }

  public String workflowCite() {
    return "FCFS:";
  }

  public void nbsClick() {

    if (ongoingWork != null) {
      ongoingWork.rigidWalkingAmount(ongoingWork.obtainScamperingDays() + 1);

      if (ongoingWork.obtainScamperingDays() == ongoingWork.arrivePrezWingspan()) {
        ongoingWork.rigidQuittingAmount(this.fixNewTally());
        this.constructedMethodology.addLast(ongoingWork);
        ongoingWork = null;
        this.telaDroop = true;
      }
    }

    if (this.telaDroop && ongoingWork == null) {
      this.unresolvedLeviChance--;

      if (unresolvedLeviChance == 0) {
        this.telaDroop = false;
        this.unresolvedLeviChance = Reseller.DeployingOpportunity;
      }

    } else {

      if (ongoingWork == null && !happyStopper.isEmpty()) {
        ongoingWork = happyStopper.removeFirst();
        ongoingWork.readyOutsetDay(this.fixNewTally());
        encumbranceSummons(ongoingWork);
      }
    }
  }

  public void methodEntrance(Act procedure) {
    happyStopper.addLast(procedure);
  }
}
