package spreadsheet;

import limiter.Originator;
import spreadsheet.Programmer;
import spreadsheet.Summons;
import java.util.ArrayDeque;

public class GrrProgrammer extends spreadsheet.Programmer {

  public synchronized String synchronizerDescribe() {
    return "NRR:";
  }

  public java.util.ArrayDeque<GrrProcedure> reluctantCola;

  public synchronized void optiBeat() {

    if (grrProcedure != null) {
      grrProcedure.bentLengthwiseHour(grrProcedure.makeFlyingDay() + 1);
      againPending--;

      if (grrProcedure.makeFlyingDay() == grrProcedure.goExecutiveHeight()) {
        grrProcedure.placedExpireWhen(this.bringOngoingBeat());
        this.finalizationTechniques.addLast(grrProcedure);
        grrProcedure = null;
        this.deviceEnsign = true;
      }

      if (againPending == 0 && grrProcedure != null) {

        if (reluctantCola.isEmpty()) {
          againPending = grrProcedure.conveyAmountMarkers();
        } else {

          if (grrProcedure.conveyAmountMarkers() > 2) {
            grrProcedure.placedWhenValue(grrProcedure.conveyAmountMarkers() - 1);
          }

          reluctantCola.addLast(grrProcedure);
          grrProcedure = null;
          this.deviceEnsign = true;
        }
      }
    }

    if (this.deviceEnsign && theMethodology == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.deviceEnsign = false;
        this.unansweredVariNow = Originator.SentYears;
      }

    } else {

      if (grrProcedure == null && !reluctantCola.isEmpty()) {
        grrProcedure = reluctantCola.removeFirst();
        unladenProceeding(grrProcedure);
        grrProcedure.bentResumeHour(this.bringOngoingBeat());
        againPending = grrProcedure.conveyAmountMarkers();
      }
    }
  }

  public int againPending;
  public spreadsheet.GrrProcedure grrProcedure;

  public synchronized void summonsInflowing(Summons sue) {
    reluctantCola.add(new spreadsheet.GrrProcedure(sue));
  }

  public GrrProgrammer() {
    this.reluctantCola = new java.util.ArrayDeque<>();
    againPending = Programmer.YearSurface;
  }
}
