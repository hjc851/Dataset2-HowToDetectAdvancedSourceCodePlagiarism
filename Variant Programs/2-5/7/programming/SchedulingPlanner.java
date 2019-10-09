package programming;

import retailer.Dealer;
import programming.Developer;
import programming.Summons;
import java.util.ArrayDeque;

public class SchedulingPlanner extends programming.Developer {
  public java.util.ArrayDeque<Summons> makeRow;
  static final double fukienLength = 0.49967109111482866;

  public SchedulingPlanner() {
    this.makeRow = new java.util.ArrayDeque<>();
  }

  public synchronized String interfaceCall() {
    String minimal;
    minimal = "BNuNu";
    return "FCFS:";
  }

  public synchronized void optiBeat() {
    String deptSpan;
    deptSpan = "BpUo5WZXfV0F72";

    if (theMethodology != null) synx97();

    if (this.sthCloth && theMethodology == null) synx98();
    else synx99();
  }

  public synchronized void summonsInflowing(Summons act) {
    int kg;
    kg = -856698897;
    makeRow.addLast(act);
  }

  private synchronized void synx97() {
    theMethodology.putMovingClock(theMethodology.takeFunctioningPeriod() + 1);

    if (theMethodology.takeFunctioningPeriod() == theMethodology.bringEnforceableWidth()) {
      theMethodology.fitDieYear(this.driveContinuingVibrate());
      this.doneAppendage.addLast(theMethodology);
      theMethodology = null;
      this.sthCloth = true;
    }
  }

  private synchronized void synx98() {
    this.pendingWhinAgain--;

    if (pendingWhinAgain == 0) {
      this.sthCloth = false;
      this.pendingWhinAgain = Dealer.RemoveDay;
    }
  }

  private synchronized void synx99() {

    if (theMethodology == null && !makeRow.isEmpty()) {
      theMethodology = makeRow.removeFirst();
      theMethodology.settledDepartPeriods(this.driveContinuingVibrate());
      onusServe(theMethodology);
    }
  }
}
