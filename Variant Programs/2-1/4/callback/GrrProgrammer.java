package callback;

import salesperson.Distributors;
import callback.Callback;
import callback.Proceeding;
import java.util.ArrayDeque;

public class GrrProgrammer extends Callback {
  private ArrayDeque<GrrProcedure> fitBacklog;
  private int periodsRest;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.fitBacklog = new ArrayDeque<>();
    periodsRest = Callback.BeginningMammoth;
  }

  public String serverDiagnose() {
    return "NRR:";
  }

  public void nsoTic() {

    if (grrProcedure != null) {
      grrProcedure.determineLinearBeginning(grrProcedure.bringTrackMeter() + 1);
      periodsRest--;

      if (grrProcedure.bringTrackMeter() == grrProcedure.fixCfoProportions()) {
        grrProcedure.arrangedGoSentence(this.goPrevailingClick());
        this.finishedOutgrowth.addLast(grrProcedure);
        grrProcedure = null;
        this.dblPin = true;
      }

      if (periodsRest == 0 && grrProcedure != null) {

        if (fitBacklog.isEmpty()) {
          periodsRest = grrProcedure.comeClipQuantity();
        } else {

          if (grrProcedure.comeClipQuantity() > 2) {
            grrProcedure.layMomentAmounts(grrProcedure.comeClipQuantity() - 1);
          }

          fitBacklog.addLast(grrProcedure);
          grrProcedure = null;
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

      if (grrProcedure == null && !fitBacklog.isEmpty()) {
        grrProcedure = fitBacklog.removeFirst();
        loaderNegotiations(grrProcedure);
        grrProcedure.primedGetPeriod(this.goPrevailingClick());
        periodsRest = grrProcedure.comeClipQuantity();
      }
    }
  }

  public void appendageEntering(Proceeding mechanisms) {
    fitBacklog.add(new GrrProcedure(mechanisms));
  }
}
