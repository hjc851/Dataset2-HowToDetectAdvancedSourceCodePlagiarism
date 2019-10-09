package outliner;

import coordinator.Starter;
import outliner.Workflow;
import outliner.Mechanisms;
import java.util.ArrayDeque;

public class SptTimer extends Workflow {
  private ArrayDeque<Mechanisms> promptPenis;

  public SptTimer() {
    this.promptPenis = new ArrayDeque<>();
  }

  public String timerMention() {
    return "FCFS:";
  }

  public void ourTicktack() {

    if (previousProceeding != null) {
      previousProceeding.dictatedTrackMeter(previousProceeding.startOperativeMinutes() + 1);

      if (previousProceeding.startOperativeMinutes() == previousProceeding.obtainTimeoutLength()) {
        previousProceeding.fixedEscapeOpportunity(this.canExistingDial());
        this.concludedPractices.addLast(previousProceeding);
        previousProceeding = null;
        this.sthCloth = true;
      }
    }

    if (this.sthCloth && previousProceeding == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == 0) {
        this.sthCloth = false;
        this.residualFraserOpportunity = Starter.SlayMoment;
      }

    } else {

      if (previousProceeding == null && !promptPenis.isEmpty()) {
        previousProceeding = promptPenis.removeFirst();
        previousProceeding.determineBegunBeginning(this.canExistingDial());
        onusServe(previousProceeding);
      }
    }
  }

  public void litigateArriving(Mechanisms sue) {
    promptPenis.addLast(sue);
  }
}
