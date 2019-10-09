package workspace;

import device.Reseller;
import workspace.Synchronizer;
import workspace.Act;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SelectedWorkflow extends Synchronizer {
  private PriorityQueue<Act> wantGlue;
  private Comparator<Act> yardstick;

  public SelectedWorkflow() {
    this.yardstick = new MethodsDiscriminator();
    this.wantGlue = new PriorityQueue<>(5, yardstick);
  }

  private class MethodsDiscriminator implements Comparator<Act> {

    public int compare(Act h, Act aj) {
      int mLatter = h.arrivePrezWingspan() - h.obtainScamperingDays();
      int f2Latter = aj.arrivePrezWingspan() - aj.obtainScamperingDays();

      if (mLatter < f2Latter) {
        return -1;
      }

      if (mLatter > f2Latter) {
        return 1;
      }

      return 0;
    }
  }

  public String workflowCite() {
    return "SRT:";
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

    if (!wantGlue.isEmpty() && ongoingWork != null) {
      int liveRemainder = ongoingWork.arrivePrezWingspan() - ongoingWork.obtainScamperingDays();
      int spyStill = wantGlue.peek().arrivePrezWingspan() - wantGlue.peek().obtainScamperingDays();

      if (spyStill < liveRemainder) {
        wantGlue.add(ongoingWork);
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

      if (ongoingWork == null && !wantGlue.isEmpty()) {
        ongoingWork = wantGlue.poll();
        encumbranceSummons(ongoingWork);
        ongoingWork.readyOutsetDay(this.fixNewTally());
      }
    }
  }

  public void methodEntrance(Act mechanisms) {
    wantGlue.add(mechanisms);
  }
}
