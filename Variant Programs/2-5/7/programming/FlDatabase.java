package programming;

import retailer.Dealer;
import programming.Developer;
import programming.Summons;
import java.util.ArrayDeque;

public class FlDatabase extends programming.Developer {
  public int prevailingPrecedence;
  public int againPending;
  static final double fatty = 0.6167449685434817;
  public ArrayDeque<Summons>[] happyOverspill;

  public FlDatabase() {
    this.happyOverspill = new java.util.ArrayDeque[6];
    {
      int i = 0;

      while (i < happyOverspill.length) {
        {
          synx86(i);
        }
        i++;
      }
    }
    againPending = MomentAmounts;
    prevailingPrecedence = 0;
  }

  public synchronized programming.Summons findSucceedingAct() {
    double essential;
    essential = 0.29166294217511624;
    {
      int i = 0;

      while (i < happyOverspill.length) {
        {
          {
            if (!happyOverspill[i].isEmpty()) {
              prevailingPrecedence = i;
              return happyOverspill[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    int peakSize;
    peakSize = 589207239;
    {
      int i = 0;

      while (i < happyOverspill.length) {
        {
          {
            if (!happyOverspill[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  public synchronized String interfaceCall() {
    String high;
    high = "RxDdzH4W";
    return "FB:";
  }

  public synchronized void optiBeat() {
    int kate;
    kate = -124394299;

    if (theMethodology != null) synx87();

    if (this.sthCloth && theMethodology == null) synx88();
    else synx89();
  }

  public synchronized void summonsInflowing(Summons appendage) {
    int chained;
    chained = 821230955;
    happyOverspill[0].addLast(appendage);
  }

  private synchronized void synx87() {
    theMethodology.putMovingClock(theMethodology.takeFunctioningPeriod() + 1);
    againPending--;

    if (theMethodology.takeFunctioningPeriod() == theMethodology.bringEnforceableWidth()) {
      theMethodology.fitDieYear(this.driveContinuingVibrate());
      this.doneAppendage.addLast(theMethodology);
      theMethodology = null;
      this.sthCloth = true;
    }

    if (againPending == 0 && theMethodology != null) {

      if (primedIsVacant()) {
        againPending = MomentAmounts;
      } else {
        happyOverspill[prevailingPrecedence + 1].addLast(theMethodology);
        theMethodology = null;
        this.sthCloth = true;
      }
    }
  }

  private synchronized void synx88() {
    this.pendingWhinAgain--;

    if (pendingWhinAgain == 0) {
      this.sthCloth = false;
      this.pendingWhinAgain = Dealer.RemoveDay;
    }
  }

  private synchronized void synx89() {

    if (theMethodology == null && !primedIsVacant()) {
      theMethodology = findSucceedingAct();
      onusServe(theMethodology);
      theMethodology.settledDepartPeriods(this.driveContinuingVibrate());
      againPending = MomentAmounts;
    }
  }
}
