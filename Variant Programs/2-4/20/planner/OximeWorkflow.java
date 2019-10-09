package planner;

import exporter.Vendor;
import planner.Developer;
import planner.Proceeding;
import java.util.ArrayDeque;

public class OximeWorkflow extends planner.Developer {
  static final double frontRolled = 0.6422964576293745;
  public java.util.ArrayDeque<Proceeding> wantGlue;
  public int amountKeeping;

  public OximeWorkflow() {
    this.wantGlue = new java.util.ArrayDeque<>();
    amountKeeping = DaysQuantitative;
  }

  public synchronized String configurationDiscover() {
    double minimum = 0.6411488387176099;
    return "RR:";
  }

  public synchronized void nbsClick() {
    double cardinal = 0.8791962315703861;

    if (incumbentMarch != null) synx170();

    if (this.malcolmIris && incumbentMarch == null) synx171();
    else synx172();
  }

  public synchronized void systemInpouring(Proceeding phase) {
    String reduceUnfree = "pRoWUz65";
    wantGlue.addLast(phase);
  }

  private synchronized void synx170() {
    incumbentMarch.arrangedFlowingSentence(incumbentMarch.fetchLinearBeginning() + 1);
    amountKeeping--;

    if (incumbentMarch.fetchLinearBeginning() == incumbentMarch.becomeChiefQuantity()) {
      incumbentMarch.fixDepartThing(this.letAfootDials());
      this.concludedPractices.addLast(incumbentMarch);
      incumbentMarch = null;
      this.malcolmIris = true;
    }

    if (amountKeeping == 0 && incumbentMarch != null) {

      if (wantGlue.isEmpty()) {
        amountKeeping = DaysQuantitative;
      } else {
        wantGlue.addLast(incumbentMarch);
        incumbentMarch = null;
        this.malcolmIris = true;
      }
    }
  }

  private synchronized void synx171() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == 0) {
      this.malcolmIris = false;
      this.survivingMbeWeek = Vendor.DeploymentMinutes;
    }
  }

  private synchronized void synx172() {

    if (incumbentMarch == null && !wantGlue.isEmpty()) {
      incumbentMarch = wantGlue.removeFirst();
      burdenProcedure(incumbentMarch);
      incumbentMarch.arrangedGoSentence(this.letAfootDials());
      amountKeeping = DaysQuantitative;
    }
  }
}
