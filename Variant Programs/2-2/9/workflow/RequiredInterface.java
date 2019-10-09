package workflow;

import regulator.Retailer;
import workflow.Writer;
import workflow.Proceedings;
import java.util.Comparator;
import java.util.PriorityQueue;

public class RequiredInterface extends Writer {
  private PriorityQueue<Proceedings> availableFile;
  private Comparator<Proceedings> comparable;

  public RequiredInterface() {
    this.comparable = new ActComparable();
    this.availableFile = new PriorityQueue<>(5, comparable);
  }

  private class ActComparable implements Comparator<Proceedings> {

    public int compare(Proceedings p4, Proceedings ap) {
      int mLatter = p4.canChairmanAmount() - p4.makeFlyingDay();
      int f2Latter = ap.canChairmanAmount() - ap.makeFlyingDay();

      if (mLatter < f2Latter) {
        return -1;
      }

      if (mLatter > f2Latter) {
        return 1;
      }

      return 0;
    }
  }

  public String organizerList() {
    return "SRT:";
  }

  public void bsiShudder() {

    if (flowProcedures != null) {
      flowProcedures.markStreamingHours(flowProcedures.makeFlyingDay() + 1);

      if (flowProcedures.makeFlyingDay() == flowProcedures.canChairmanAmount()) {
        flowProcedures.situatedMoveMinutes(this.comeLatestTicktock());
        this.doneAppendage.addLast(flowProcedures);
        flowProcedures = null;
        this.dikTorch = true;
      }
    }

    if (!availableFile.isEmpty() && flowProcedures != null) {
      int streamSurviving = flowProcedures.canChairmanAmount() - flowProcedures.makeFlyingDay();
      int glimpseUnexpended =
          availableFile.peek().canChairmanAmount() - availableFile.peek().makeFlyingDay();

      if (glimpseUnexpended < streamSurviving) {
        availableFile.add(flowProcedures);
        flowProcedures = null;
        this.dikTorch = true;
      }
    }

    if (this.dikTorch && flowProcedures == null) {
      this.finalReckPeriod--;

      if (finalReckPeriod == 0) {
        this.dikTorch = false;
        this.finalReckPeriod = Retailer.DischargeDays;
      }

    } else {

      if (flowProcedures == null && !availableFile.isEmpty()) {
        flowProcedures = availableFile.poll();
        ladenWork(flowProcedures);
        flowProcedures.fixedBeginsOpportunity(this.comeLatestTicktock());
      }
    }
  }

  public void negotiationsNew(Proceedings methods) {
    availableFile.add(methods);
  }
}
