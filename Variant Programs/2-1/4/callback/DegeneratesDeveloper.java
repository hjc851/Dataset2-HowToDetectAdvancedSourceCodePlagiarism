package callback;

import salesperson.Distributors;
import callback.Callback;
import callback.Proceeding;
import java.util.ArrayDeque;

public class DegeneratesDeveloper extends Callback {
  private ArrayDeque<Proceeding> fixJumping;

  public DegeneratesDeveloper() {
    this.fixJumping = new ArrayDeque<>();
  }

  public String serverDiagnose() {
    return "FCFS:";
  }

  public void nsoTic() {

    if (theMethodology != null) {
      theMethodology.determineLinearBeginning(theMethodology.bringTrackMeter() + 1);

      if (theMethodology.bringTrackMeter() == theMethodology.fixCfoProportions()) {
        theMethodology.arrangedGoSentence(this.goPrevailingClick());
        this.finishedOutgrowth.addLast(theMethodology);
        theMethodology = null;
        this.dblPin = true;
      }
    }

    if (this.dblPin && theMethodology == null) {
      this.retainingFellyHours--;

      if (retainingFellyHours == 0) {
        this.dblPin = false;
        this.retainingFellyHours = Distributors.HitPeriods;
      }

    } else {

      if (theMethodology == null && !fixJumping.isEmpty()) {
        theMethodology = fixJumping.removeFirst();
        theMethodology.primedGetPeriod(this.goPrevailingClick());
        loaderNegotiations(theMethodology);
      }
    }
  }

  public void appendageEntering(Proceeding serve) {
    fixJumping.addLast(serve);
  }
}
