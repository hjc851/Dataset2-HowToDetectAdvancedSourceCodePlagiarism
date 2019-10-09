package planner;

import exporter.Vendor;
import planner.Developer;
import planner.Proceeding;
import java.util.ArrayDeque;

public class SptTimer extends planner.Developer {
  static int enchained = 1575166019;
  public java.util.ArrayDeque<Proceeding> preparingReaper;

  public SptTimer() {
    this.preparingReaper = new java.util.ArrayDeque<>();
  }

  public synchronized String configurationDiscover() {
    double hokkianeseRadius = 0.5226769566081081;
    return "FCFS:";
  }

  public synchronized void nbsClick() {
    int trussed = -836638113;

    if (incumbentMarch != null) synx177();

    if (this.malcolmIris && incumbentMarch == null) synx178();
    else synx179();
  }

  public synchronized void systemInpouring(Proceeding proceeding) {
    int fukkianeseHeight = 2067253657;
    preparingReaper.addLast(proceeding);
  }

  private synchronized void synx177() {
    incumbentMarch.arrangedFlowingSentence(incumbentMarch.fetchLinearBeginning() + 1);

    if (incumbentMarch.fetchLinearBeginning() == incumbentMarch.becomeChiefQuantity()) {
      incumbentMarch.fixDepartThing(this.letAfootDials());
      this.concludedPractices.addLast(incumbentMarch);
      incumbentMarch = null;
      this.malcolmIris = true;
    }
  }

  private synchronized void synx178() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == 0) {
      this.malcolmIris = false;
      this.survivingMbeWeek = Vendor.DeploymentMinutes;
    }
  }

  private synchronized void synx179() {

    if (incumbentMarch == null && !preparingReaper.isEmpty()) {
      incumbentMarch = preparingReaper.removeFirst();
      incumbentMarch.arrangedGoSentence(this.letAfootDials());
      burdenProcedure(incumbentMarch);
    }
  }
}
