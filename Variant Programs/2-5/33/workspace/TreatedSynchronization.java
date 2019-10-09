package workspace;

import regulator.Reseller;
import workspace.Spooler;
import workspace.System;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TreatedSynchronization extends workspace.Spooler {
  public java.util.Comparator<System> tracer;

  public synchronized void treatInfluent(System work) {
    cookCue.add(work);
  }

  public java.util.PriorityQueue<System> cookCue;

  public synchronized String multitaskingMoniker() {
    return "SRT:";
  }

  public class SummonsBenchmark implements Comparator<System> {

    public synchronized int compare(System a, System n1) {
      int tgfRemainder;
      int n1Other;
      tgfRemainder = (a.becomeChiefQuantity() - a.obtainScamperingDays());
      n1Other = (n1.becomeChiefQuantity() - n1.obtainScamperingDays());

      if (tgfRemainder < n1Other) {
        return -1;
      }

      if (tgfRemainder > n1Other) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized void snoTicktock() {

    if (flowProcedures != null) synx433();

    if (!cookCue.isEmpty() && flowProcedures != null) synx434();

    if (this.thmFlagstone && flowProcedures == null) synx435();
    else synx436();
  }

  public TreatedSynchronization() {
    this.tracer = (new SummonsBenchmark());
    this.cookCue = (new java.util.PriorityQueue<>(5, tracer));
  }

  private synchronized void synx433() {
    flowProcedures.readyFlyingDay(flowProcedures.obtainScamperingDays() + 1);

    if (flowProcedures.obtainScamperingDays() == flowProcedures.becomeChiefQuantity()) {
      flowProcedures.dictatedLossMeter(this.bringOngoingBeat());
      this.executedMethods.addLast(flowProcedures);
      flowProcedures = (null);
      this.thmFlagstone = (true);
    }
  }

  private synchronized void synx434() {
    int typicalMaintaining;
    int cheatStay;
    typicalMaintaining =
        (flowProcedures.becomeChiefQuantity() - flowProcedures.obtainScamperingDays());
    cheatStay = (cookCue.peek().becomeChiefQuantity() - cookCue.peek().obtainScamperingDays());

    if (cheatStay < typicalMaintaining) {
      cookCue.add(flowProcedures);
      flowProcedures = (null);
      this.thmFlagstone = (true);
    }
  }

  private synchronized void synx435() {
    this.anotherBurberryYears--;

    if (anotherBurberryYears == 0) {
      this.thmFlagstone = (false);
      this.anotherBurberryYears = (Reseller.DespatchClock);
    }
  }

  private synchronized void synx436() {

    if (flowProcedures == null && !cookCue.isEmpty()) {
      flowProcedures = (cookCue.poll());
      ladenWork(flowProcedures);
      flowProcedures.putBeginClock(this.bringOngoingBeat());
    }
  }
}
