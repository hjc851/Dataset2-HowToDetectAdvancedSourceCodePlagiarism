package workspace;

import regulator.Reseller;
import workspace.Spooler;
import workspace.System;
import java.util.ArrayDeque;

public class SptTimer extends workspace.Spooler {

  public synchronized void treatInfluent(System proceeding) {
    waitingList.addLast(proceeding);
  }

  public synchronized void snoTicktock() {

    if (flowProcedures != null) synx437();

    if (this.thmFlagstone && flowProcedures == null) synx438();
    else synx439();
  }

  public java.util.ArrayDeque<System> waitingList;

  public SptTimer() {
    this.waitingList = (new java.util.ArrayDeque<>());
  }

  public synchronized String multitaskingMoniker() {
    return "FCFS:";
  }

  private synchronized void synx437() {
    flowProcedures.readyFlyingDay(flowProcedures.obtainScamperingDays() + 1);

    if (flowProcedures.obtainScamperingDays() == flowProcedures.becomeChiefQuantity()) {
      flowProcedures.dictatedLossMeter(this.bringOngoingBeat());
      this.executedMethods.addLast(flowProcedures);
      flowProcedures = (null);
      this.thmFlagstone = (true);
    }
  }

  private synchronized void synx438() {
    this.anotherBurberryYears--;

    if (anotherBurberryYears == 0) {
      this.thmFlagstone = (false);
      this.anotherBurberryYears = (Reseller.DespatchClock);
    }
  }

  private synchronized void synx439() {

    if (flowProcedures == null && !waitingList.isEmpty()) {
      flowProcedures = (waitingList.removeFirst());
      flowProcedures.putBeginClock(this.bringOngoingBeat());
      ladenWork(flowProcedures);
    }
  }
}
