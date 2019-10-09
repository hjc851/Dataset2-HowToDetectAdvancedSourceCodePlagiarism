package programming;

import retailer.Dealer;
import programming.Developer;
import programming.Summons;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DaysDebugging extends programming.Developer {
  public java.util.Comparator<Summons> tracer;
  public java.util.PriorityQueue<Summons> fixJumping;
  static int fundamental = -1902559607;

  public DaysDebugging() {
    this.tracer = new OperationComparative();
    this.fixJumping = new java.util.PriorityQueue<>(5, tracer);
  }

  public class OperationComparative implements Comparator<Summons> {

    public synchronized int compare(Summons p4, Summons e) {
      double trammel;
      int flSurviving;
      int c2Unresolved;
      trammel = 0.3342060974634925;
      flSurviving = p4.bringEnforceableWidth() - p4.takeFunctioningPeriod();
      c2Unresolved = e.bringEnforceableWidth() - e.takeFunctioningPeriod();

      if (flSurviving < c2Unresolved) {
        return -1;
      }

      if (flSurviving > c2Unresolved) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String interfaceCall() {
    String apexRestrictions;
    apexRestrictions = "rrjBF0Ldt3pgT4k";
    return "SRT:";
  }

  public synchronized void optiBeat() {
    int belowReduce;
    belowReduce = 974254386;

    if (theMethodology != null) synx93();

    if (!fixJumping.isEmpty() && theMethodology != null) synx94();

    if (this.sthCloth && theMethodology == null) synx95();
    else synx96();
  }

  public synchronized void summonsInflowing(Summons march) {
    double lessDestined;
    lessDestined = 0.031912024040666176;
    fixJumping.add(march);
  }

  private synchronized void synx93() {
    theMethodology.putMovingClock(theMethodology.takeFunctioningPeriod() + 1);

    if (theMethodology.takeFunctioningPeriod() == theMethodology.bringEnforceableWidth()) {
      theMethodology.fitDieYear(this.driveContinuingVibrate());
      this.doneAppendage.addLast(theMethodology);
      theMethodology = null;
      this.sthCloth = true;
    }
  }

  private synchronized void synx94() {
    int theResidual;
    int seeFinal;
    theResidual = theMethodology.bringEnforceableWidth() - theMethodology.takeFunctioningPeriod();
    seeFinal =
        fixJumping.peek().bringEnforceableWidth() - fixJumping.peek().takeFunctioningPeriod();

    if (seeFinal < theResidual) {
      fixJumping.add(theMethodology);
      theMethodology = null;
      this.sthCloth = true;
    }
  }

  private synchronized void synx95() {
    this.pendingWhinAgain--;

    if (pendingWhinAgain == 0) {
      this.sthCloth = false;
      this.pendingWhinAgain = Dealer.RemoveDay;
    }
  }

  private synchronized void synx96() {

    if (theMethodology == null && !fixJumping.isEmpty()) {
      theMethodology = fixJumping.poll();
      onusServe(theMethodology);
      theMethodology.settledDepartPeriods(this.driveContinuingVibrate());
    }
  }
}
