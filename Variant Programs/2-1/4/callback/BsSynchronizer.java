package callback;

import salesperson.Distributors;
import callback.Callback;
import callback.Proceeding;
import java.util.ArrayDeque;

public class BsSynchronizer extends Callback {
  private ArrayDeque<Proceeding>[] cookFiles;
  private int momentUnexhausted;
  private int streamImportance;

  public BsSynchronizer() {
    this.cookFiles = new ArrayDeque[6];

    for (int i = 0; i < cookFiles.length; i++) {
      cookFiles[i] = new ArrayDeque<>();
    }
    momentUnexhausted = BeginningMammoth;
    streamImportance = 0;
  }

  private Proceeding letAheadSummons() {

    for (int i = 0; i < cookFiles.length; i++) {

      if (!cookFiles[i].isEmpty()) {
        streamImportance = i;
        return cookFiles[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < cookFiles.length; i++) {

      if (!cookFiles[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String serverDiagnose() {
    return "FB:";
  }

  public void nsoTic() {

    if (theMethodology != null) {
      theMethodology.determineLinearBeginning(theMethodology.bringTrackMeter() + 1);
      momentUnexhausted--;

      if (theMethodology.bringTrackMeter() == theMethodology.fixCfoProportions()) {
        theMethodology.arrangedGoSentence(this.goPrevailingClick());
        this.finishedOutgrowth.addLast(theMethodology);
        theMethodology = null;
        this.dblPin = true;
      }

      if (momentUnexhausted == 0 && theMethodology != null) {

        if (primedIsVacant()) {
          momentUnexhausted = BeginningMammoth;
        } else {
          cookFiles[streamImportance + 1].addLast(theMethodology);
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

      if (theMethodology == null && !primedIsVacant()) {
        theMethodology = letAheadSummons();
        loaderNegotiations(theMethodology);
        theMethodology.primedGetPeriod(this.goPrevailingClick());
        momentUnexhausted = BeginningMammoth;
      }
    }
  }

  public void appendageEntering(Proceeding sue) {
    cookFiles[0].addLast(sue);
  }
}
