package workflow;

import regulator.Retailer;
import workflow.Writer;
import workflow.Proceedings;
import java.util.ArrayDeque;

public class CommercialSpooler extends Writer {
  private ArrayDeque<Proceedings>[] cookFiles;
  private int dayOdd;
  private int afootFocus;

  public CommercialSpooler() {
    this.cookFiles = new ArrayDeque[6];

    for (int i = 0; i < cookFiles.length; i++) {
      cookFiles[i] = new ArrayDeque<>();
    }
    dayOdd = ClipQuantity;
    afootFocus = 0;
  }

  private Proceedings generateComingTreat() {

    for (int i = 0; i < cookFiles.length; i++) {

      if (!cookFiles[i].isEmpty()) {
        afootFocus = i;
        return cookFiles[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < cookFiles.length; i++) {

      if (!cookFiles[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String organizerList() {
    return "FB:";
  }

  public void bsiShudder() {

    if (flowProcedures != null) {
      flowProcedures.markStreamingHours(flowProcedures.makeFlyingDay() + 1);
      dayOdd--;

      if (flowProcedures.makeFlyingDay() == flowProcedures.canChairmanAmount()) {
        flowProcedures.situatedMoveMinutes(this.comeLatestTicktock());
        this.doneAppendage.addLast(flowProcedures);
        flowProcedures = null;
        this.dikTorch = true;
      }

      if (dayOdd == 0 && flowProcedures != null) {

        if (primedIsVacant()) {
          dayOdd = ClipQuantity;
        } else {
          cookFiles[afootFocus + 1].addLast(flowProcedures);
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

      if (flowProcedures == null && !primedIsVacant()) {
        flowProcedures = generateComingTreat();
        ladenWork(flowProcedures);
        flowProcedures.fixedBeginsOpportunity(this.comeLatestTicktock());
        dayOdd = ClipQuantity;
      }
    }
  }

  public void negotiationsNew(Proceedings appendage) {
    cookFiles[0].addLast(appendage);
  }
}
