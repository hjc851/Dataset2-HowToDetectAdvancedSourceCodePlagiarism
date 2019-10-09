package workflow;

import reseller.Retailer;
import workflow.Spooler;
import workflow.Mechanism;
import java.util.Comparator;
import java.util.PriorityQueue;

public class WbsWriter extends Spooler {

  public synchronized String writerAdvert() {
    return "SRT:";
  }

  public synchronized void workElect(Mechanism cycle) {
    waitingList.add(cycle);
  }

  private class SystemMatching implements Comparator<Mechanism> {

    public synchronized int compare(Mechanism pv, Mechanism ap) {
      int mLatter;
      int a1Rest;
      mLatter = pv.findImplementationSmall() - pv.developLengthwiseHour();
      a1Rest = ap.findImplementationSmall() - ap.developLengthwiseHour();

      if (mLatter < a1Rest) {
        return -1;
      }

      if (mLatter > a1Rest) {
        return 1;
      }

      return 0;
    }
  }

  public WbsWriter() {
    this.witness = new SystemMatching();
    this.waitingList = new PriorityQueue<>(5, witness);
  }

  private PriorityQueue<Mechanism> waitingList = null;
  private Comparator<Mechanism> witness = null;

  public synchronized void nbsClick() {

    if (flowProcedures != null) {
      flowProcedures.placeSpurtingWeek(flowProcedures.developLengthwiseHour() + 1);

      if (flowProcedures.developLengthwiseHour() == flowProcedures.findImplementationSmall()) {
        flowProcedures.determinedGoingDays(this.makeIncumbentTock());
        this.achievedMechanisms.addLast(flowProcedures);
        flowProcedures = null;
        this.deviceEnsign = true;
      }
    }

    if (!waitingList.isEmpty() && flowProcedures != null) {
      int formerKeeping;
      int glintLeftover;
      formerKeeping =
          flowProcedures.findImplementationSmall() - flowProcedures.developLengthwiseHour();
      glintLeftover =
          waitingList.peek().findImplementationSmall() - waitingList.peek().developLengthwiseHour();

      if (glintLeftover < formerKeeping) {
        waitingList.add(flowProcedures);
        flowProcedures = null;
        this.deviceEnsign = true;
      }
    }

    if (this.deviceEnsign && flowProcedures == null) {
      this.leftoverMalcolmMeter--;

      if (leftoverMalcolmMeter == 0) {
        this.deviceEnsign = false;
        this.leftoverMalcolmMeter = Retailer.RoutingWeek;
      }

    } else {

      if (flowProcedures == null && !waitingList.isEmpty()) {
        flowProcedures = waitingList.poll();
        ladenWork(flowProcedures);
        flowProcedures.fixedBeginsOpportunity(this.makeIncumbentTock());
      }
    }
  }
}
