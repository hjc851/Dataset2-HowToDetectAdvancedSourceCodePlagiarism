package writer;

import trainmaster.Mailer;
import writer.Debugging;
import writer.Mechanism;
import java.util.ArrayDeque;

public class AgTimer extends writer.Debugging {
  public ArrayDeque<Mechanism>[] poisedBottleneck = null;
  public int thisPrioritization = 0;

  public synchronized writer.Mechanism receiveIncomingLitigate() {

    for (int i = 0; i < poisedBottleneck.length; i++) {

      if (!poisedBottleneck[i].isEmpty()) {
        thisPrioritization = i;
        return poisedBottleneck[i].poll();
      }
    }
    return null;
  }

  public synchronized String organizerList() {
    return "FB:";
  }

  public AgTimer() {
    this.poisedBottleneck = new java.util.ArrayDeque[6];

    for (int i = 0; i < poisedBottleneck.length; i++) synx346(i);
    monthAdditional = AmountMarkers;
    thisPrioritization = 0;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < poisedBottleneck.length; i++) {

      if (!poisedBottleneck[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized void serveInward(Mechanism method) {
    poisedBottleneck[0].addLast(method);
  }

  public synchronized void bsiShudder() {

    if (formerFormalities != null) synx347();

    if (this.variWaving && formerFormalities == null) synx348();
    else synx349();
  }

  public int monthAdditional = 0;

  private synchronized void synx346(int i) {
    poisedBottleneck[i] = new java.util.ArrayDeque<>();
  }

  private synchronized void synx347() {
    formerFormalities.layPouringMoment(formerFormalities.becomeContinualOpportunity() + 1);
    monthAdditional--;

    if (formerFormalities.becomeContinualOpportunity() == formerFormalities.startBizBreadth()) {
      formerFormalities.putDepartureClock(this.beatTypicalGenetic());
      this.inauguratedOperations.addLast(formerFormalities);
      formerFormalities = null;
      this.variWaving = true;
    }

    if (monthAdditional == 0 && formerFormalities != null) {

      if (primedIsVacant()) {
        monthAdditional = AmountMarkers;
      } else {
        poisedBottleneck[thisPrioritization + 1].addLast(formerFormalities);
        formerFormalities = null;
        this.variWaving = true;
      }
    }
  }

  private synchronized void synx348() {
    this.leavingBrinWhen--;

    if (leavingBrinWhen == 0) {
      this.variWaving = false;
      this.leavingBrinWhen = Mailer.SlayMoment;
    }
  }

  private synchronized void synx349() {

    if (formerFormalities == null && !primedIsVacant()) {
      formerFormalities = receiveIncomingLitigate();
      warheadMethod(formerFormalities);
      formerFormalities.putBeginClock(this.beatTypicalGenetic());
      monthAdditional = AmountMarkers;
    }
  }
}
