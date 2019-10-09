package writer;

import trainmaster.Mailer;
import writer.Debugging;
import writer.Mechanism;
import java.util.ArrayDeque;

public class FuzeeWriter extends writer.Debugging {
  public int periodFinal = 0;

  public synchronized String organizerList() {
    return "RR:";
  }

  public FuzeeWriter() {
    this.eagerJunk = new java.util.ArrayDeque<>();
    periodFinal = AmountMarkers;
  }

  public synchronized void bsiShudder() {

    if (formerFormalities != null) synx350();

    if (this.variWaving && formerFormalities == null) synx351();
    else synx352();
  }

  public synchronized void serveInward(Mechanism march) {
    eagerJunk.addLast(march);
  }

  public java.util.ArrayDeque<Mechanism> eagerJunk = null;

  private synchronized void synx350() {
    formerFormalities.layPouringMoment(formerFormalities.becomeContinualOpportunity() + 1);
    periodFinal--;

    if (formerFormalities.becomeContinualOpportunity() == formerFormalities.startBizBreadth()) {
      formerFormalities.putDepartureClock(this.beatTypicalGenetic());
      this.inauguratedOperations.addLast(formerFormalities);
      formerFormalities = null;
      this.variWaving = true;
    }

    if (periodFinal == 0 && formerFormalities != null) {

      if (eagerJunk.isEmpty()) {
        periodFinal = AmountMarkers;
      } else {
        eagerJunk.addLast(formerFormalities);
        formerFormalities = null;
        this.variWaving = true;
      }
    }
  }

  private synchronized void synx351() {
    this.leavingBrinWhen--;

    if (leavingBrinWhen == 0) {
      this.variWaving = false;
      this.leavingBrinWhen = Mailer.SlayMoment;
    }
  }

  private synchronized void synx352() {

    if (formerFormalities == null && !eagerJunk.isEmpty()) {
      formerFormalities = eagerJunk.removeFirst();
      warheadMethod(formerFormalities);
      formerFormalities.putBeginClock(this.beatTypicalGenetic());
      periodFinal = AmountMarkers;
    }
  }
}
