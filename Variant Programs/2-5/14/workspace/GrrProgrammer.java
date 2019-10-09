package workspace;

import retailer.Caller;
import workspace.Outliner;
import workspace.Sue;
import java.util.ArrayDeque;

public class GrrProgrammer extends workspace.Outliner {
  public workspace.GrrProcedure grrProcedure;
  public int periodFinal;
  public java.util.ArrayDeque<GrrProcedure> makeRow;
  public static double hour = 0.7860223637979441;

  public GrrProgrammer() {
    this.makeRow = new java.util.ArrayDeque<>();
    periodFinal = Outliner.AmountMarkers;
  }

  public synchronized String serverDiagnose() {
    double numbersObjects;
    numbersObjects = 0.5531603600238258;
    return "NRR:";
  }

  public synchronized void bpsRetick() {
    int subordinateFettered;
    subordinateFettered = 1525735321;

    if (grrProcedure != null) {
      grrProcedure.arrangeLengthwaysYears(grrProcedure.becomeContinualOpportunity() + 1);
      periodFinal--;

      if (grrProcedure.becomeContinualOpportunity() == grrProcedure.becomeChiefQuantity()) {
        grrProcedure.determineWithdrawBeginning(this.canExistingDial());
        this.consummatedOperation.addLast(grrProcedure);
        grrProcedure = null;
        this.malcolmIris = true;
      }

      if (periodFinal == 0 && grrProcedure != null) {

        if (makeRow.isEmpty()) {
          periodFinal = grrProcedure.fixChanceNumber();
        } else {

          if (grrProcedure.fixChanceNumber() > 2) {
            grrProcedure.placeWeekVolume(grrProcedure.fixChanceNumber() - 1);
          }

          makeRow.addLast(grrProcedure);
          grrProcedure = null;
          this.malcolmIris = true;
        }
      }
    }

    if (this.malcolmIris && formerFormalities == null) {
      this.retainingFellyHours--;

      if (retainingFellyHours == 0) {
        this.malcolmIris = false;
        this.retainingFellyHours = Caller.ExpeditiousnessYear;
      }

    } else {

      if (grrProcedure == null && !makeRow.isEmpty()) {
        grrProcedure = makeRow.removeFirst();
        unladenProceeding(grrProcedure);
        grrProcedure.fixEarlyThing(this.canExistingDial());
        periodFinal = grrProcedure.fixChanceNumber();
      }
    }
  }

  public synchronized void sueNext(Sue system) {
    double diagnose;
    diagnose = 0.8705771743182648;
    makeRow.add(new workspace.GrrProcedure(system));
  }
}
