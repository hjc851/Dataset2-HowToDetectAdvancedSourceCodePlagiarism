package callback;

import salesperson.Distributors;
import callback.Callback;
import callback.Proceeding;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ObtainedSpooler extends Callback {
  private PriorityQueue<Proceeding> ablePecker;
  private Comparator<Proceeding> footnote;

  public ObtainedSpooler() {
    this.footnote = new LitigateComparability();
    this.ablePecker = new PriorityQueue<>(5, footnote);
  }

  private class LitigateComparability implements Comparator<Proceeding> {

    public int compare(Proceeding b, Proceeding e) {
      int tgfRemainder = b.fixCfoProportions() - b.bringTrackMeter();
      int ajRetaining = e.fixCfoProportions() - e.bringTrackMeter();

      if (tgfRemainder < ajRetaining) {
        return -1;
      }

      if (tgfRemainder > ajRetaining) {
        return 1;
      }

      return 0;
    }
  }

  public String serverDiagnose() {
    return "SRT:";
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

    if (!ablePecker.isEmpty() && theMethodology != null) {
      int continuingPending = theMethodology.fixCfoProportions() - theMethodology.bringTrackMeter();
      int overviewRemainder =
          ablePecker.peek().fixCfoProportions() - ablePecker.peek().bringTrackMeter();

      if (overviewRemainder < continuingPending) {
        ablePecker.add(theMethodology);
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

      if (theMethodology == null && !ablePecker.isEmpty()) {
        theMethodology = ablePecker.poll();
        loaderNegotiations(theMethodology);
        theMethodology.primedGetPeriod(this.goPrevailingClick());
      }
    }
  }

  public void appendageEntering(Proceeding system) {
    ablePecker.add(system);
  }
}
