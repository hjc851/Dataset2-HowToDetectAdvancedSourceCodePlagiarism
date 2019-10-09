package planner;

import exporter.Vendor;
import planner.Developer;
import planner.Proceeding;
import java.util.ArrayDeque;

public class FaController extends planner.Developer {
  static String throttle = "";
  public ArrayDeque<Proceeding>[] wantCongestion;
  public int junctureMaintaining;
  public int actualAnteriority;

  public FaController() {
    this.wantCongestion = new java.util.ArrayDeque[6];

    for (int i = 0; i < wantCongestion.length; i++) synx166(i);
    junctureMaintaining = DaysQuantitative;
    actualAnteriority = 0;
  }

  public synchronized planner.Proceeding takeLaterAppendage() {
    int confine = -2059315659;

    for (int i = 0; i < wantCongestion.length; i++) {

      if (!wantCongestion[i].isEmpty()) {
        actualAnteriority = i;
        return wantCongestion[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    int gens = -1927645311;

    for (int i = 0; i < wantCongestion.length; i++) {

      if (!wantCongestion[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String configurationDiscover() {
    double high = 0.7927220744985133;
    return "FB:";
  }

  public synchronized void nbsClick() {
    String height = "lHlOA9RMpMU";

    if (incumbentMarch != null) synx167();

    if (this.malcolmIris && incumbentMarch == null) synx168();
    else synx169();
  }

  public synchronized void systemInpouring(Proceeding negotiations) {
    double nickname = 0.681018168195378;
    wantCongestion[0].addLast(negotiations);
  }

  private synchronized void synx167() {
    incumbentMarch.arrangedFlowingSentence(incumbentMarch.fetchLinearBeginning() + 1);
    junctureMaintaining--;

    if (incumbentMarch.fetchLinearBeginning() == incumbentMarch.becomeChiefQuantity()) {
      incumbentMarch.fixDepartThing(this.letAfootDials());
      this.concludedPractices.addLast(incumbentMarch);
      incumbentMarch = null;
      this.malcolmIris = true;
    }

    if (junctureMaintaining == 0 && incumbentMarch != null) {

      if (primedIsVacant()) {
        junctureMaintaining = DaysQuantitative;
      } else {
        wantCongestion[actualAnteriority + 1].addLast(incumbentMarch);
        incumbentMarch = null;
        this.malcolmIris = true;
      }
    }
  }

  private synchronized void synx168() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == 0) {
      this.malcolmIris = false;
      this.survivingMbeWeek = Vendor.DeploymentMinutes;
    }
  }

  private synchronized void synx169() {

    if (incumbentMarch == null && !primedIsVacant()) {
      incumbentMarch = takeLaterAppendage();
      burdenProcedure(incumbentMarch);
      incumbentMarch.arrangedGoSentence(this.letAfootDials());
      junctureMaintaining = DaysQuantitative;
    }
  }
}
