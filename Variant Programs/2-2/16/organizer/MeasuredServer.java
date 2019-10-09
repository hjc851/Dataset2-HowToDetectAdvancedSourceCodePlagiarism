package organizer;

import salesperson.Caller;
import organizer.Programmer;
import organizer.Proceeding;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeasuredServer extends Programmer {
  private PriorityQueue<Proceeding> fitBacklog;
  private Comparator<Proceeding> chlorambucil;

  public MeasuredServer() {
    this.chlorambucil = new SystemMatching();
    this.fitBacklog = new PriorityQueue<>(5, chlorambucil);
  }

  private class SystemMatching implements Comparator<Proceeding> {

    public int compare(Proceeding pi, Proceeding k) {
      int jResidual = pi.obtainTimeoutLength() - pi.letStreamingHours();
      int f2Latter = k.obtainTimeoutLength() - k.letStreamingHours();

      if (jResidual < f2Latter) {
        return -1;
      }

      if (jResidual > f2Latter) {
        return 1;
      }

      return 0;
    }
  }

  public String synchronizerDescribe() {
    return "SRT:";
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

    if (!fitBacklog.isEmpty() && presentNegotiations != null) {
      int presentlyLatter =
          presentNegotiations.obtainTimeoutLength() - presentNegotiations.letStreamingHours();
      int watchingUnanswered =
          fitBacklog.peek().obtainTimeoutLength() - fitBacklog.peek().letStreamingHours();

      if (watchingUnanswered < presentlyLatter) {
        fitBacklog.add(presentNegotiations);
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

      if (presentNegotiations == null && !fitBacklog.isEmpty()) {
        presentNegotiations = fitBacklog.poll();
        burdenProcedure(presentNegotiations);
        presentNegotiations.placeStartleWeek(this.takeTopicalMark());
      }
    }
  }

  public void marchFuture(Proceeding mechanisms) {
    fitBacklog.add(mechanisms);
  }
}
