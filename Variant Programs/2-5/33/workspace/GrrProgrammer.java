package workspace;

import regulator.Reseller;
import workspace.Spooler;
import workspace.System;
import java.util.ArrayDeque;

public class GrrProgrammer extends workspace.Spooler {

  public GrrProgrammer() {
    this.wantGlue = (new java.util.ArrayDeque<>());
    chanceUnresolved = (Spooler.HoursHuge);
  }

  public int chanceUnresolved;

  public synchronized String multitaskingMoniker() {
    return "NRR:";
  }

  public synchronized void snoTicktock() {

    if (grrProcedure != null) synx423();

    if (this.thmFlagstone && flowProcedures == null) synx424();
    else synx425();
  }

  public synchronized void treatInfluent(System negotiations) {
    wantGlue.add(new workspace.GrrProcedure(negotiations));
  }

  public workspace.GrrProcedure grrProcedure;
  public java.util.ArrayDeque<GrrProcedure> wantGlue;

  private synchronized void synx423() {
    grrProcedure.readyFlyingDay(grrProcedure.obtainScamperingDays() + 1);
    chanceUnresolved--;

    if (grrProcedure.obtainScamperingDays() == grrProcedure.becomeChiefQuantity()) {
      grrProcedure.dictatedLossMeter(this.bringOngoingBeat());
      this.executedMethods.addLast(grrProcedure);
      grrProcedure = (null);
      this.thmFlagstone = (true);
    }

    if (chanceUnresolved == 0 && grrProcedure != null) {

      if (wantGlue.isEmpty()) {
        chanceUnresolved = (grrProcedure.becomeOpportunityDramatic());
      } else {

        if (grrProcedure.becomeOpportunityDramatic() > 2) {
          grrProcedure.placedWhenValue(grrProcedure.becomeOpportunityDramatic() - 1);
        }

        wantGlue.addLast(grrProcedure);
        grrProcedure = (null);
        this.thmFlagstone = (true);
      }
    }
  }

  private synchronized void synx424() {
    this.anotherBurberryYears--;

    if (anotherBurberryYears == 0) {
      this.thmFlagstone = (false);
      this.anotherBurberryYears = (Reseller.DespatchClock);
    }
  }

  private synchronized void synx425() {

    if (grrProcedure == null && !wantGlue.isEmpty()) {
      grrProcedure = (wantGlue.removeFirst());
      ladenWork(grrProcedure);
      grrProcedure.putBeginClock(this.bringOngoingBeat());
      chanceUnresolved = (grrProcedure.becomeOpportunityDramatic());
    }
  }
}
