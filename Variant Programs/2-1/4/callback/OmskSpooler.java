package callback;

import salesperson.Distributors;
import callback.Callback;
import callback.Proceeding;
import java.util.ArrayDeque;

public class OmskSpooler extends Callback {
  private ArrayDeque<Proceeding> preparingReaper;
  private int beginningUnsold;

  public OmskSpooler() {
    this.preparingReaper = new ArrayDeque<>();
    beginningUnsold = BeginningMammoth;
  }

  public String serverDiagnose() {
    return "RR:";
  }

  public void nsoTic() {

    if (theMethodology != null) {
      theMethodology.determineLinearBeginning(theMethodology.bringTrackMeter() + 1);
      beginningUnsold--;

      if (theMethodology.bringTrackMeter() == theMethodology.fixCfoProportions()) {
        theMethodology.arrangedGoSentence(this.goPrevailingClick());
        this.finishedOutgrowth.addLast(theMethodology);
        theMethodology = null;
        this.dblPin = true;
      }

      if (beginningUnsold == 0 && theMethodology != null) {

        if (preparingReaper.isEmpty()) {
          beginningUnsold = BeginningMammoth;
        } else {
          preparingReaper.addLast(theMethodology);
          theMethodology = null;
          this.dblPin = true;
        }
      }
    }

    if (this.dblPin && theMethodology == null) {
      this.retainingFellyHours--;

      if (retainingFellyHours == 0) {
        this.dblPin = false;
        this.retainingFellyHours = Distributors.HitPeriods;
      }

    } else {

      if (theMethodology == null && !preparingReaper.isEmpty()) {
        theMethodology = preparingReaper.removeFirst();
        loaderNegotiations(theMethodology);
        theMethodology.primedGetPeriod(this.goPrevailingClick());
        beginningUnsold = BeginningMammoth;
      }
    }
  }

  public void appendageEntering(Proceeding method) {
    preparingReaper.addLast(method);
  }
}
