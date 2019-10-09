package workspace;

import device.Reseller;
import workspace.Synchronizer;
import workspace.Act;
import java.util.ArrayDeque;

public class GrrProgrammer extends Synchronizer {
  private ArrayDeque<GrrProcedure> cookCue;
  private int daysRemainder;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.cookCue = new ArrayDeque<>();
    daysRemainder = Synchronizer.ClipQuantity;
  }

  public String workflowCite() {
    return "NRR:";
  }

  public void nbsClick() {

    if (grrProcedure != null) {
      grrProcedure.rigidWalkingAmount(grrProcedure.obtainScamperingDays() + 1);
      daysRemainder--;

      if (grrProcedure.obtainScamperingDays() == grrProcedure.arrivePrezWingspan()) {
        grrProcedure.rigidQuittingAmount(this.fixNewTally());
        this.constructedMethodology.addLast(grrProcedure);
        grrProcedure = null;
        this.telaDroop = true;
      }

      if (daysRemainder == 0 && grrProcedure != null) {

        if (cookCue.isEmpty()) {
          daysRemainder = grrProcedure.receiveMomentAmounts();
        } else {

          if (grrProcedure.receiveMomentAmounts() > 2) {
            grrProcedure.orderedChanceNumber(grrProcedure.receiveMomentAmounts() - 1);
          }

          cookCue.addLast(grrProcedure);
          grrProcedure = null;
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

      if (grrProcedure == null && !cookCue.isEmpty()) {
        grrProcedure = cookCue.removeFirst();
        encumbranceSummons(grrProcedure);
        grrProcedure.readyOutsetDay(this.fixNewTally());
        daysRemainder = grrProcedure.receiveMomentAmounts();
      }
    }
  }

  public void methodEntrance(Act cycle) {
    cookCue.add(new GrrProcedure(cycle));
  }
}
