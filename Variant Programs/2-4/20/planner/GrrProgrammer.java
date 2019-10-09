package planner;

import exporter.Vendor;
import planner.Developer;
import planner.Proceeding;
import java.util.ArrayDeque;

public class GrrProgrammer extends planner.Developer {
  static final String decreasingRestricted = "0sQ";
  public java.util.ArrayDeque<GrrProcedure> setConvoy;
  public int sentenceUnexpended;
  public planner.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.setConvoy = new java.util.ArrayDeque<>();
    sentenceUnexpended = Developer.DaysQuantitative;
  }

  public synchronized String configurationDiscover() {
    String prices = "ALbw";
    return "NRR:";
  }

  public synchronized void nbsClick() {
    int nungWeighting = -101324699;

    if (grrProcedure != null) synx163();

    if (this.malcolmIris && incumbentMarch == null) synx164();
    else synx165();
  }

  public synchronized void systemInpouring(Proceeding serve) {
    double limit = 0.22486109600892246;
    setConvoy.add(new planner.GrrProcedure(serve));
  }

  private synchronized void synx163() {
    grrProcedure.arrangedFlowingSentence(grrProcedure.fetchLinearBeginning() + 1);
    sentenceUnexpended--;

    if (grrProcedure.fetchLinearBeginning() == grrProcedure.becomeChiefQuantity()) {
      grrProcedure.fixDepartThing(this.letAfootDials());
      this.concludedPractices.addLast(grrProcedure);
      grrProcedure = null;
      this.malcolmIris = true;
    }

    if (sentenceUnexpended == 0 && grrProcedure != null) {

      if (setConvoy.isEmpty()) {
        sentenceUnexpended = grrProcedure.sustainThingLibido();
      } else {

        if (grrProcedure.sustainThingLibido() > 2) {
          grrProcedure.rigidAmountMarkers(grrProcedure.sustainThingLibido() - 1);
        }

        setConvoy.addLast(grrProcedure);
        grrProcedure = null;
        this.malcolmIris = true;
      }
    }
  }

  private synchronized void synx164() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == 0) {
      this.malcolmIris = false;
      this.survivingMbeWeek = Vendor.DeploymentMinutes;
    }
  }

  private synchronized void synx165() {

    if (grrProcedure == null && !setConvoy.isEmpty()) {
      grrProcedure = setConvoy.removeFirst();
      burdenProcedure(grrProcedure);
      grrProcedure.arrangedGoSentence(this.letAfootDials());
      sentenceUnexpended = grrProcedure.sustainThingLibido();
    }
  }

  private synchronized void synx166(int i) {
    wantCongestion[i] = new java.util.ArrayDeque<>();
  }
}
