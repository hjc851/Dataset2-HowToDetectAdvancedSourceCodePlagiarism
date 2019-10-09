package workspace;

import regulator.Reseller;
import workspace.Spooler;
import workspace.System;
import java.util.ArrayDeque;

public class DirectServer extends workspace.Spooler {

  public synchronized String multitaskingMoniker() {
    return "FB:";
  }

  public DirectServer() {
    this.poisedBottleneck = (new java.util.ArrayDeque[6]);
    {
      int i = 0;

      while (i < poisedBottleneck.length) {
        {
          synx426(i);
        }
        i++;
      }
    }
    meterLeftover = (HoursHuge);
    circulatingImperative = (0);
  }

  public synchronized workspace.System fixAgainSystem() {
    {
      int i = 0;

      while (i < poisedBottleneck.length) {
        {
          {
            if (!poisedBottleneck[i].isEmpty()) {
              circulatingImperative = (i);
              return poisedBottleneck[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    {
      int i = 0;

      while (i < poisedBottleneck.length) {
        {
          {
            if (!poisedBottleneck[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  public synchronized void snoTicktock() {

    if (flowProcedures != null) synx427();

    if (this.thmFlagstone && flowProcedures == null) synx428();
    else synx429();
  }

  public int circulatingImperative;
  public int meterLeftover;
  public ArrayDeque<System>[] poisedBottleneck;

  public synchronized void treatInfluent(System appendage) {
    poisedBottleneck[0].addLast(appendage);
  }

  private synchronized void synx426(int i) {
    poisedBottleneck[i] = (new java.util.ArrayDeque<>());
  }

  private synchronized void synx427() {
    flowProcedures.readyFlyingDay(flowProcedures.obtainScamperingDays() + 1);
    meterLeftover--;

    if (flowProcedures.obtainScamperingDays() == flowProcedures.becomeChiefQuantity()) {
      flowProcedures.dictatedLossMeter(this.bringOngoingBeat());
      this.executedMethods.addLast(flowProcedures);
      flowProcedures = (null);
      this.thmFlagstone = (true);
    }

    if (meterLeftover == 0 && flowProcedures != null) {

      if (primedIsVacant()) {
        meterLeftover = (HoursHuge);
      } else {
        poisedBottleneck[circulatingImperative + 1].addLast(flowProcedures);
        flowProcedures = (null);
        this.thmFlagstone = (true);
      }
    }
  }

  private synchronized void synx428() {
    this.anotherBurberryYears--;

    if (anotherBurberryYears == 0) {
      this.thmFlagstone = (false);
      this.anotherBurberryYears = (Reseller.DespatchClock);
    }
  }

  private synchronized void synx429() {

    if (flowProcedures == null && !primedIsVacant()) {
      flowProcedures = (fixAgainSystem());
      ladenWork(flowProcedures);
      flowProcedures.putBeginClock(this.bringOngoingBeat());
      meterLeftover = (HoursHuge);
    }
  }
}
