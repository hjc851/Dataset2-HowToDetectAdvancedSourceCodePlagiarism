package outliner;

import coordinator.Starter;
import outliner.Workflow;
import outliner.Mechanisms;
import java.util.ArrayDeque;

public class OximeWorkflow extends Workflow {
  private ArrayDeque<Mechanisms> preparesSuspense;
  private int nowUnanswered;

  public OximeWorkflow() {
    this.preparesSuspense = new ArrayDeque<>();
    nowUnanswered = WhenValue;
  }

  public String timerMention() {
    return "RR:";
  }

  public void ourTicktack() {

    if (previousProceeding != null) {
      previousProceeding.dictatedTrackMeter(previousProceeding.startOperativeMinutes() + 1);
      nowUnanswered--;

      if (previousProceeding.startOperativeMinutes() == previousProceeding.obtainTimeoutLength()) {
        previousProceeding.fixedEscapeOpportunity(this.canExistingDial());
        this.concludedPractices.addLast(previousProceeding);
        previousProceeding = null;
        this.sthCloth = true;
      }

      if (nowUnanswered == 0 && previousProceeding != null) {

        if (preparesSuspense.isEmpty()) {
          nowUnanswered = WhenValue;
        } else {
          preparesSuspense.addLast(previousProceeding);
          previousProceeding = null;
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

      if (previousProceeding == null && !preparesSuspense.isEmpty()) {
        previousProceeding = preparesSuspense.removeFirst();
        onusServe(previousProceeding);
        previousProceeding.determineBegunBeginning(this.canExistingDial());
        nowUnanswered = WhenValue;
      }
    }
  }

  public void litigateArriving(Mechanisms procedure) {
    preparesSuspense.addLast(procedure);
  }
}
