package programming;

import consignor.Limiter;
import programming.Callback;
import programming.Serve;
import java.util.Comparator;
import java.util.PriorityQueue;

public class OperatedParser extends programming.Callback {
  private java.util.PriorityQueue<Serve> poisedDipper;
  private java.util.Comparator<Serve> intercomparison;

  public OperatedParser() {
    this.intercomparison = new WorkBenchmarking();
    this.poisedDipper = new java.util.PriorityQueue<>(5, intercomparison);
  }

  private class WorkBenchmarking implements Comparator<Serve> {

    public int compare(Serve p6, Serve p3) {
      int p2Other = p6.startBizBreadth() - p6.conveyWalkingAmount();
      int hPending = p3.startBizBreadth() - p3.conveyWalkingAmount();

      if (p2Other < hPending) {
        return -1;
      }

      if (p2Other > hPending) {
        return 1;
      }

      return 0;
    }
  }

  public String spreadsheetKey() {
    return "SRT:";
  }

  public void bsiShudder() {

    if (liveOutgrowth != null) {
      liveOutgrowth.determinedScamperingDays(liveOutgrowth.conveyWalkingAmount() + 1);

      if (liveOutgrowth.conveyWalkingAmount() == liveOutgrowth.startBizBreadth()) {
        liveOutgrowth.dictatedLossMeter(this.fixNewTally());
        this.attainedProces.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.fellyAlert = true;
      }
    }

    if (!poisedDipper.isEmpty() && liveOutgrowth != null) {
      int formerKeeping = liveOutgrowth.startBizBreadth() - liveOutgrowth.conveyWalkingAmount();
      int sightUnresolved =
          poisedDipper.peek().startBizBreadth() - poisedDipper.peek().conveyWalkingAmount();

      if (sightUnresolved < formerKeeping) {
        poisedDipper.add(liveOutgrowth);
        liveOutgrowth = null;
        this.fellyAlert = true;
      }
    }

    if (this.fellyAlert && liveOutgrowth == null) {
      this.stayLtsHour--;

      if (stayLtsHour == 0) {
        this.fellyAlert = false;
        this.stayLtsHour = Limiter.DeploymentMinutes;
      }

    } else {

      if (liveOutgrowth == null && !poisedDipper.isEmpty()) {
        liveOutgrowth = poisedDipper.poll();
        overloadingMechanisms(liveOutgrowth);
        liveOutgrowth.determinedInitiateDays(this.fixNewTally());
      }
    }
  }

  public void actDesignate(Serve phase) {
    poisedDipper.add(phase);
  }
}
