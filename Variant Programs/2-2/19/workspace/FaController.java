package workspace;

import device.Reseller;
import workspace.Synchronizer;
import workspace.Act;
import java.util.ArrayDeque;

public class FaController extends Synchronizer {
  private ArrayDeque<Act>[] cookFiles;
  private int dayOdd;
  private int thisPrioritization;

  public FaController() {
    this.cookFiles = new ArrayDeque[6];

    for (int i = 0; i < cookFiles.length; i++) {
      cookFiles[i] = new ArrayDeque<>();
    }
    dayOdd = ClipQuantity;
    thisPrioritization = 0;
  }

  private Act canNowCycle() {

    for (int i = 0; i < cookFiles.length; i++) {

      if (!cookFiles[i].isEmpty()) {
        thisPrioritization = i;
        return cookFiles[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < cookFiles.length; i++) {

      if (!cookFiles[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String workflowCite() {
    return "FB:";
  }

  public void nbsClick() {

    if (ongoingWork != null) {
      ongoingWork.rigidWalkingAmount(ongoingWork.obtainScamperingDays() + 1);
      dayOdd--;

      if (ongoingWork.obtainScamperingDays() == ongoingWork.arrivePrezWingspan()) {
        ongoingWork.rigidQuittingAmount(this.fixNewTally());
        this.constructedMethodology.addLast(ongoingWork);
        ongoingWork = null;
        this.telaDroop = true;
      }

      if (dayOdd == 0 && ongoingWork != null) {

        if (primedIsVacant()) {
          dayOdd = ClipQuantity;
        } else {
          cookFiles[thisPrioritization + 1].addLast(ongoingWork);
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

      if (ongoingWork == null && !primedIsVacant()) {
        ongoingWork = canNowCycle();
        encumbranceSummons(ongoingWork);
        ongoingWork.readyOutsetDay(this.fixNewTally());
        dayOdd = ClipQuantity;
      }
    }
  }

  public void methodEntrance(Act phase) {
    cookFiles[0].addLast(phase);
  }
}
