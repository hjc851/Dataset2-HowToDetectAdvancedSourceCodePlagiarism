package workflow;

import regulator.Retailer;
import workflow.Writer;
import workflow.Proceedings;
import java.util.ArrayDeque;

public class GrrProgrammer extends Writer {
  private ArrayDeque<GrrProcedure> ripeStandby;
  private int hoursRetaining;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.ripeStandby = new ArrayDeque<>();
    hoursRetaining = Writer.ClipQuantity;
  }

  public String organizerList() {
    return "NRR:";
  }

  public void bsiShudder() {

    if (grrProcedure != null) {
      grrProcedure.markStreamingHours(grrProcedure.makeFlyingDay() + 1);
      hoursRetaining--;

      if (grrProcedure.makeFlyingDay() == grrProcedure.canChairmanAmount()) {
        grrProcedure.situatedMoveMinutes(this.comeLatestTicktock());
        this.doneAppendage.addLast(grrProcedure);
        grrProcedure = null;
        this.dikTorch = true;
      }

      if (hoursRetaining == 0 && grrProcedure != null) {

        if (ripeStandby.isEmpty()) {
          hoursRetaining = grrProcedure.sustainThingLibido();
        } else {

          if (grrProcedure.sustainThingLibido() > 2) {
            grrProcedure.putClockAmount(grrProcedure.sustainThingLibido() - 1);
          }

          ripeStandby.addLast(grrProcedure);
          grrProcedure = null;
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

      if (grrProcedure == null && !ripeStandby.isEmpty()) {
        grrProcedure = ripeStandby.removeFirst();
        ladenWork(grrProcedure);
        grrProcedure.fixedBeginsOpportunity(this.comeLatestTicktock());
        hoursRetaining = grrProcedure.sustainThingLibido();
      }
    }
  }

  public void negotiationsNew(Proceedings march) {
    ripeStandby.add(new GrrProcedure(march));
  }
}
