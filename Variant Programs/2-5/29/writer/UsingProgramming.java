package writer;

import trainmaster.Mailer;
import writer.Debugging;
import writer.Mechanism;
import java.util.ArrayDeque;

public class UsingProgramming extends writer.Debugging {
  public java.util.ArrayDeque<Mechanism> preparedWait = null;

  public synchronized void serveInward(Mechanism cycle) {
    preparedWait.addLast(cycle);
  }

  public synchronized void bsiShudder() {

    if (formerFormalities != null) synx357();

    if (this.variWaving && formerFormalities == null) synx358();
    else synx359();
  }

  public UsingProgramming() {
    this.preparedWait = new java.util.ArrayDeque<>();
  }

  public synchronized String organizerList() {
    return "FCFS:";
  }

  private synchronized void synx357() {
    formerFormalities.layPouringMoment(formerFormalities.becomeContinualOpportunity() + 1);

    if (formerFormalities.becomeContinualOpportunity() == formerFormalities.startBizBreadth()) {
      formerFormalities.putDepartureClock(this.beatTypicalGenetic());
      this.inauguratedOperations.addLast(formerFormalities);
      formerFormalities = null;
      this.variWaving = true;
    }
  }

  private synchronized void synx358() {
    this.leavingBrinWhen--;

    if (leavingBrinWhen == 0) {
      this.variWaving = false;
      this.leavingBrinWhen = Mailer.SlayMoment;
    }
  }

  private synchronized void synx359() {

    if (formerFormalities == null && !preparedWait.isEmpty()) {
      formerFormalities = preparedWait.removeFirst();
      formerFormalities.putBeginClock(this.beatTypicalGenetic());
      warheadMethod(formerFormalities);
    }
  }
}
