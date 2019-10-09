package outliner;

import coordinator.Starter;
import outliner.Workflow;
import outliner.Mechanisms;
import java.util.ArrayDeque;

public class GrrProgrammer extends Workflow {
  private ArrayDeque<GrrProcedure> preppedDragon;
  private int amountKeeping;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.preppedDragon = new ArrayDeque<>();
    amountKeeping = Workflow.WhenValue;
  }

  public String timerMention() {
    return "NRR:";
  }

  public void ourTicktack() {

    if (grrProcedure != null) {
      grrProcedure.dictatedTrackMeter(grrProcedure.startOperativeMinutes() + 1);
      amountKeeping--;

      if (grrProcedure.startOperativeMinutes() == grrProcedure.obtainTimeoutLength()) {
        grrProcedure.fixedEscapeOpportunity(this.canExistingDial());
        this.concludedPractices.addLast(grrProcedure);
        grrProcedure = null;
        this.sthCloth = true;
      }

      if (amountKeeping == 0 && grrProcedure != null) {

        if (preppedDragon.isEmpty()) {
          amountKeeping = grrProcedure.catchWhenValue();
        } else {

          if (grrProcedure.catchWhenValue() > 2) {
            grrProcedure.arrangeYearsSize(grrProcedure.catchWhenValue() - 1);
          }

          preppedDragon.addLast(grrProcedure);
          grrProcedure = null;
          this.sthCloth = true;
        }
      }
    }

    if (this.sthCloth && previousProceeding == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == 0) {
        this.sthCloth = false;
        this.residualFraserOpportunity = Starter.SlayMoment;
      }

    } else {

      if (grrProcedure == null && !preppedDragon.isEmpty()) {
        grrProcedure = preppedDragon.removeFirst();
        onusServe(grrProcedure);
        grrProcedure.determineBegunBeginning(this.canExistingDial());
        amountKeeping = grrProcedure.catchWhenValue();
      }
    }
  }

  public void litigateArriving(Mechanisms mechanism) {
    preppedDragon.add(new GrrProcedure(mechanism));
  }
}
