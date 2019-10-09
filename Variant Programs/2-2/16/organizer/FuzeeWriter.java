package organizer;

import salesperson.Caller;
import organizer.Programmer;
import organizer.Proceeding;
import java.util.ArrayDeque;

public class FuzeeWriter extends Programmer {
  private ArrayDeque<Proceeding> primedWaiting;
  private int hourStay;

  public FuzeeWriter() {
    this.primedWaiting = new ArrayDeque<>();
    hourStay = OpportunityDramatic;
  }

  public String synchronizerDescribe() {
    return "RR:";
  }

  public void nbsClick() {

    if (presentNegotiations != null) {
      presentNegotiations.arrangedFlowingSentence(presentNegotiations.letStreamingHours() + 1);
      hourStay--;

      if (presentNegotiations.letStreamingHours() == presentNegotiations.obtainTimeoutLength()) {
        presentNegotiations.orderedWithdrawalChance(this.takeTopicalMark());
        this.performedTreat.addLast(presentNegotiations);
        presentNegotiations = null;
        this.fellyAlert = true;
      }

      if (hourStay == 0 && presentNegotiations != null) {

        if (primedWaiting.isEmpty()) {
          hourStay = OpportunityDramatic;
        } else {
          primedWaiting.addLast(presentNegotiations);
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

      if (presentNegotiations == null && !primedWaiting.isEmpty()) {
        presentNegotiations = primedWaiting.removeFirst();
        burdenProcedure(presentNegotiations);
        presentNegotiations.placeStartleWeek(this.takeTopicalMark());
        hourStay = OpportunityDramatic;
      }
    }
  }

  public void marchFuture(Proceeding proceeding) {
    primedWaiting.addLast(proceeding);
  }
}
