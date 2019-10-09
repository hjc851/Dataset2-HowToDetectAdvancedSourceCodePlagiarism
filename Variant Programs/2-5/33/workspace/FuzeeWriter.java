package workspace;

import regulator.Reseller;
import workspace.Spooler;
import workspace.System;
import java.util.ArrayDeque;

public class FuzeeWriter extends workspace.Spooler {
  public int yearsAnother;

  public synchronized String multitaskingMoniker() {
    return "RR:";
  }

  public synchronized void treatInfluent(System mechanisms) {
    quickSufferance.addLast(mechanisms);
  }

  public FuzeeWriter() {
    this.quickSufferance = (new java.util.ArrayDeque<>());
    yearsAnother = (HoursHuge);
  }

  public synchronized void snoTicktock() {

    if (flowProcedures != null) synx430();

    if (this.thmFlagstone && flowProcedures == null) synx431();
    else synx432();
  }

  public java.util.ArrayDeque<System> quickSufferance;

  private synchronized void synx430() {
    flowProcedures.readyFlyingDay(flowProcedures.obtainScamperingDays() + 1);
    yearsAnother--;

    if (flowProcedures.obtainScamperingDays() == flowProcedures.becomeChiefQuantity()) {
      flowProcedures.dictatedLossMeter(this.bringOngoingBeat());
      this.executedMethods.addLast(flowProcedures);
      flowProcedures = (null);
      this.thmFlagstone = (true);
    }

    if (yearsAnother == 0 && flowProcedures != null) {

      if (quickSufferance.isEmpty()) {
        yearsAnother = (HoursHuge);
      } else {
        quickSufferance.addLast(flowProcedures);
        flowProcedures = (null);
        this.thmFlagstone = (true);
      }
    }
  }

  private synchronized void synx431() {
    this.anotherBurberryYears--;

    if (anotherBurberryYears == 0) {
      this.thmFlagstone = (false);
      this.anotherBurberryYears = (Reseller.DespatchClock);
    }
  }

  private synchronized void synx432() {

    if (flowProcedures == null && !quickSufferance.isEmpty()) {
      flowProcedures = (quickSufferance.removeFirst());
      ladenWork(flowProcedures);
      flowProcedures.putBeginClock(this.bringOngoingBeat());
      yearsAnother = (HoursHuge);
    }
  }
}
