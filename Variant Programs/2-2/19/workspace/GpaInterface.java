package workspace;

import device.Reseller;
import workspace.Synchronizer;
import workspace.Act;
import java.util.ArrayDeque;

public class GpaInterface extends Synchronizer {
  private ArrayDeque<Act> quickSufferance;
  private int junctureMaintaining;

  public GpaInterface() {
    this.quickSufferance = new ArrayDeque<>();
    junctureMaintaining = ClipQuantity;
  }

  public String workflowCite() {
    return "RR:";
  }

  public void nbsClick() {

    if (ongoingWork != null) {
      ongoingWork.rigidWalkingAmount(ongoingWork.obtainScamperingDays() + 1);
      junctureMaintaining--;

      if (ongoingWork.obtainScamperingDays() == ongoingWork.arrivePrezWingspan()) {
        ongoingWork.rigidQuittingAmount(this.fixNewTally());
        this.constructedMethodology.addLast(ongoingWork);
        ongoingWork = null;
        this.telaDroop = true;
      }

      if (junctureMaintaining == 0 && ongoingWork != null) {

        if (quickSufferance.isEmpty()) {
          junctureMaintaining = ClipQuantity;
        } else {
          quickSufferance.addLast(ongoingWork);
          ongoingWork = null;
          this.telaDroop = true;
        }
      }
    }

    if (this.telaDroop && ongoingWork == null) {
      this.unresolvedLeviChance--;

      if (unresolvedLeviChance == 0) {
        this.telaDroop = false;
        this.unresolvedLeviChance = Reseller.DeployingOpportunity;
      }

    } else {

      if (ongoingWork == null && !quickSufferance.isEmpty()) {
        ongoingWork = quickSufferance.removeFirst();
        encumbranceSummons(ongoingWork);
        ongoingWork.readyOutsetDay(this.fixNewTally());
        junctureMaintaining = ClipQuantity;
      }
    }
  }

  public void methodEntrance(Act procedures) {
    quickSufferance.addLast(procedures);
  }
}
