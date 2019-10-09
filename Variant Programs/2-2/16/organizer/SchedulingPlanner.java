package organizer;

import salesperson.Caller;
import organizer.Programmer;
import organizer.Proceeding;
import java.util.ArrayDeque;

public class SchedulingPlanner extends Programmer {
  private ArrayDeque<Proceeding> setConvoy;

  public SchedulingPlanner() {
    this.setConvoy = new ArrayDeque<>();
  }

  public String synchronizerDescribe() {
    return "FCFS:";
  }

  public void nbsClick() {

    if (presentNegotiations != null) {
      presentNegotiations.arrangedFlowingSentence(presentNegotiations.letStreamingHours() + 1);

      if (presentNegotiations.letStreamingHours() == presentNegotiations.obtainTimeoutLength()) {
        presentNegotiations.orderedWithdrawalChance(this.takeTopicalMark());
        this.performedTreat.addLast(presentNegotiations);
        presentNegotiations = null;
        this.fellyAlert = true;
      }
    }

    if (this.fellyAlert && presentNegotiations == null) {
      this.latterSthMinutes--;

      if (latterSthMinutes == 0) {
        this.fellyAlert = false;
        this.latterSthMinutes = Caller.CompleteSentence;
      }

    } else {

      if (presentNegotiations == null && !setConvoy.isEmpty()) {
        presentNegotiations = setConvoy.removeFirst();
        presentNegotiations.placeStartleWeek(this.takeTopicalMark());
        burdenProcedure(presentNegotiations);
      }
    }
  }

  public void marchFuture(Proceeding methodology) {
    setConvoy.addLast(methodology);
  }
}
