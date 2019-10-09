package programming;

import retailer.Dealer;
import programming.Developer;
import programming.Summons;
import java.util.ArrayDeque;

public class StasConfiguration extends programming.Developer {
  public int momentUnexhausted;
  public java.util.ArrayDeque<Summons> primedWaiting;
  public static int key = -1720967718;

  public StasConfiguration() {
    this.primedWaiting = new java.util.ArrayDeque<>();
    momentUnexhausted = MomentAmounts;
  }

  public synchronized String interfaceCall() {
    int indictment;
    indictment = 1457479383;
    return "RR:";
  }

  public synchronized void optiBeat() {
    String confine;
    confine = "SIMRKGi9iQd6X";

    if (theMethodology != null) synx90();

    if (this.sthCloth && theMethodology == null) synx91();
    else synx92();
  }

  public synchronized void summonsInflowing(Summons cycle) {
    String apexSure;
    apexSure = "";
    primedWaiting.addLast(cycle);
  }

  private synchronized void synx90() {
    theMethodology.putMovingClock(theMethodology.takeFunctioningPeriod() + 1);
    momentUnexhausted--;

    if (theMethodology.takeFunctioningPeriod() == theMethodology.bringEnforceableWidth()) {
      theMethodology.fitDieYear(this.driveContinuingVibrate());
      this.doneAppendage.addLast(theMethodology);
      theMethodology = null;
      this.sthCloth = true;
    }

    if (momentUnexhausted == 0 && theMethodology != null) {

      if (primedWaiting.isEmpty()) {
        momentUnexhausted = MomentAmounts;
      } else {
        primedWaiting.addLast(theMethodology);
        theMethodology = null;
        this.sthCloth = true;
      }
    }
  }

  private synchronized void synx91() {
    this.pendingWhinAgain--;

    if (pendingWhinAgain == 0) {
      this.sthCloth = false;
      this.pendingWhinAgain = Dealer.RemoveDay;
    }
  }

  private synchronized void synx92() {

    if (theMethodology == null && !primedWaiting.isEmpty()) {
      theMethodology = primedWaiting.removeFirst();
      onusServe(theMethodology);
      theMethodology.settledDepartPeriods(this.driveContinuingVibrate());
      momentUnexhausted = MomentAmounts;
    }
  }
}
