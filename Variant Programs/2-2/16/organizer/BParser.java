package organizer;

import salesperson.Caller;
import organizer.Programmer;
import organizer.Proceeding;
import java.util.ArrayDeque;

public class BParser extends Programmer {
  private ArrayDeque<Proceeding>[] preparedLines;
  private int meterLeftover;
  private int continuingPressing;

  public BParser() {
    this.preparedLines = new ArrayDeque[6];

    for (int i = 0; i < preparedLines.length; i++) {
      preparedLines[i] = new ArrayDeque<>();
    }
    meterLeftover = OpportunityDramatic;
    continuingPressing = 0;
  }

  private Proceeding beatTheProceedings() {

    for (int i = 0; i < preparedLines.length; i++) {

      if (!preparedLines[i].isEmpty()) {
        continuingPressing = i;
        return preparedLines[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < preparedLines.length; i++) {

      if (!preparedLines[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String synchronizerDescribe() {
    return "FB:";
  }

  public void nbsClick() {

    if (presentNegotiations != null) {
      presentNegotiations.arrangedFlowingSentence(presentNegotiations.letStreamingHours() + 1);
      meterLeftover--;

      if (presentNegotiations.letStreamingHours() == presentNegotiations.obtainTimeoutLength()) {
        presentNegotiations.orderedWithdrawalChance(this.takeTopicalMark());
        this.performedTreat.addLast(presentNegotiations);
        presentNegotiations = null;
        this.fellyAlert = true;
      }

      if (meterLeftover == 0 && presentNegotiations != null) {

        if (primedIsVacant()) {
          meterLeftover = OpportunityDramatic;
        } else {
          preparedLines[continuingPressing + 1].addLast(presentNegotiations);
          presentNegotiations = null;
          this.fellyAlert = true;
        }
      }
    }

    if (this.fellyAlert && presentNegotiations == null) {
      this.latterSthMinutes--;

      if (latterSthMinutes == 0) {
        this.fellyAlert = false;
        this.latterSthMinutes = Caller.CompleteSentence;
      }

    } else {

      if (presentNegotiations == null && !primedIsVacant()) {
        presentNegotiations = beatTheProceedings();
        burdenProcedure(presentNegotiations);
        presentNegotiations.placeStartleWeek(this.takeTopicalMark());
        meterLeftover = OpportunityDramatic;
      }
    }
  }

  public void marchFuture(Proceeding mechanism) {
    preparedLines[0].addLast(mechanism);
  }
}
