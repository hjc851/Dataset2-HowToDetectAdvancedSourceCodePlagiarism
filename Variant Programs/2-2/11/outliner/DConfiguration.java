package outliner;

import coordinator.Starter;
import outliner.Workflow;
import outliner.Mechanisms;
import java.util.ArrayDeque;

public class DConfiguration extends Workflow {
  private ArrayDeque<Mechanisms>[] preparingRanks;
  private int clipOther;
  private int presentlyPreference;

  public DConfiguration() {
    this.preparingRanks = new ArrayDeque[6];

    for (int i = 0; i < preparingRanks.length; i++) {
      preparingRanks[i] = new ArrayDeque<>();
    }
    clipOther = WhenValue;
    presentlyPreference = 0;
  }

  private Mechanisms letAheadSummons() {

    for (int i = 0; i < preparingRanks.length; i++) {

      if (!preparingRanks[i].isEmpty()) {
        presentlyPreference = i;
        return preparingRanks[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < preparingRanks.length; i++) {

      if (!preparingRanks[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String timerMention() {
    return "FB:";
  }

  public void ourTicktack() {

    if (previousProceeding != null) {
      previousProceeding.dictatedTrackMeter(previousProceeding.startOperativeMinutes() + 1);
      clipOther--;

      if (previousProceeding.startOperativeMinutes() == previousProceeding.obtainTimeoutLength()) {
        previousProceeding.fixedEscapeOpportunity(this.canExistingDial());
        this.concludedPractices.addLast(previousProceeding);
        previousProceeding = null;
        this.sthCloth = true;
      }

      if (clipOther == 0 && previousProceeding != null) {

        if (primedIsVacant()) {
          clipOther = WhenValue;
        } else {
          preparingRanks[presentlyPreference + 1].addLast(previousProceeding);
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

      if (previousProceeding == null && !primedIsVacant()) {
        previousProceeding = letAheadSummons();
        onusServe(previousProceeding);
        previousProceeding.determineBegunBeginning(this.canExistingDial());
        clipOther = WhenValue;
      }
    }
  }

  public void litigateArriving(Mechanisms phase) {
    preparingRanks[0].addLast(phase);
  }
}
