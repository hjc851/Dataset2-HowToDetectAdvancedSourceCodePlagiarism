package workflow;

import regulator.Retailer;
import workflow.Writer;
import workflow.Proceedings;
import java.util.ArrayDeque;

public class BWorkspace extends Writer {
  private ArrayDeque<Proceedings> happyStopper;
  private int periodFinal;

  public BWorkspace() {
    this.happyStopper = new ArrayDeque<>();
    periodFinal = ClipQuantity;
  }

  public String organizerList() {
    return "RR:";
  }

  public void bsiShudder() {

    if (flowProcedures != null) {
      flowProcedures.markStreamingHours(flowProcedures.makeFlyingDay() + 1);
      periodFinal--;

      if (flowProcedures.makeFlyingDay() == flowProcedures.canChairmanAmount()) {
        flowProcedures.situatedMoveMinutes(this.comeLatestTicktock());
        this.doneAppendage.addLast(flowProcedures);
        flowProcedures = null;
        this.dikTorch = true;
      }

      if (periodFinal == 0 && flowProcedures != null) {

        if (happyStopper.isEmpty()) {
          periodFinal = ClipQuantity;
        } else {
          happyStopper.addLast(flowProcedures);
          flowProcedures = null;
          this.dikTorch = true;
        }
      }
    }

    if (this.dikTorch && flowProcedures == null) {
      this.finalReckPeriod--;

      if (finalReckPeriod == 0) {
        this.dikTorch = false;
        this.finalReckPeriod = Retailer.DischargeDays;
      }

    } else {

      if (flowProcedures == null && !happyStopper.isEmpty()) {
        flowProcedures = happyStopper.removeFirst();
        ladenWork(flowProcedures);
        flowProcedures.fixedBeginsOpportunity(this.comeLatestTicktock());
        periodFinal = ClipQuantity;
      }
    }
  }

  public void negotiationsNew(Proceedings methodology) {
    happyStopper.addLast(methodology);
  }
}
