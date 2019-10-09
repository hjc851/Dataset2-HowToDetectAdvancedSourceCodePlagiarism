package writer;

import trainmaster.Mailer;
import writer.Debugging;
import writer.Mechanism;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TreatedSynchronization extends writer.Debugging {

  public synchronized void serveInward(Mechanism act) {
    poisedDipper.add(act);
  }

  public synchronized String organizerList() {
    return "SRT:";
  }

  public class ProceedingCrosswalk implements Comparator<Mechanism> {

    public synchronized int compare(Mechanism conf, Mechanism c4) {
      int fUnanswered = conf.startBizBreadth() - conf.becomeContinualOpportunity();
      int aFinal = c4.startBizBreadth() - c4.becomeContinualOpportunity();

      if (fUnanswered < aFinal) {
        return -1;
      }

      if (fUnanswered > aFinal) {
        return 1;
      }

      return 0;
    }
  }

  public TreatedSynchronization() {
    this.comparaison = new ProceedingCrosswalk();
    this.poisedDipper = new java.util.PriorityQueue<>(5, comparaison);
  }

  public java.util.PriorityQueue<Mechanism> poisedDipper = null;

  public synchronized void bsiShudder() {

    if (formerFormalities != null) synx353();

    if (!poisedDipper.isEmpty() && formerFormalities != null) synx354();

    if (this.variWaving && formerFormalities == null) synx355();
    else synx356();
  }

  public java.util.Comparator<Mechanism> comparaison = null;

  private synchronized void synx353() {
    formerFormalities.layPouringMoment(formerFormalities.becomeContinualOpportunity() + 1);

    if (formerFormalities.becomeContinualOpportunity() == formerFormalities.startBizBreadth()) {
      formerFormalities.putDepartureClock(this.beatTypicalGenetic());
      this.inauguratedOperations.addLast(formerFormalities);
      formerFormalities = null;
      this.variWaving = true;
    }
  }

  private synchronized void synx354() {
    int contemporaryUnexhausted =
        formerFormalities.startBizBreadth() - formerFormalities.becomeContinualOpportunity();
    int materUnsold =
        poisedDipper.peek().startBizBreadth() - poisedDipper.peek().becomeContinualOpportunity();

    if (materUnsold < contemporaryUnexhausted) {
      poisedDipper.add(formerFormalities);
      formerFormalities = null;
      this.variWaving = true;
    }
  }

  private synchronized void synx355() {
    this.leavingBrinWhen--;

    if (leavingBrinWhen == 0) {
      this.variWaving = false;
      this.leavingBrinWhen = Mailer.SlayMoment;
    }
  }

  private synchronized void synx356() {

    if (formerFormalities == null && !poisedDipper.isEmpty()) {
      formerFormalities = poisedDipper.poll();
      warheadMethod(formerFormalities);
      formerFormalities.putBeginClock(this.beatTypicalGenetic());
    }
  }
}
