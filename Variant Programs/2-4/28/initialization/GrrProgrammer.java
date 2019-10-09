package initialization;

import coordinator.Salesperson;
import initialization.Configuration;
import initialization.Mechanism;
import java.util.ArrayDeque;

public class GrrProgrammer extends Configuration {
  public ArrayDeque<GrrProcedure> prepareLine;
  public int clockLeft;
  public GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.prepareLine = new ArrayDeque<>();
    clockLeft = Configuration.HoursHuge;
  }

  public synchronized String developerIdentify() {
    return "NRR:";
  }

  public synchronized void nsoTic() {

    if (grrProcedure != null) {
      grrProcedure.arrangeLengthwaysYears(grrProcedure.takeFunctioningPeriod() + 1);
      clockLeft--;

      if (grrProcedure.takeFunctioningPeriod() == grrProcedure.developDirectorStature()) {
        grrProcedure.bentPulloutHour(this.findActualRetick());
        this.performedTreat.addLast(grrProcedure);
        grrProcedure = null;
        this.mbeMarker = true;
      }

      if (clockLeft == 0 && grrProcedure != null) {

        if (prepareLine.isEmpty()) {
          clockLeft = grrProcedure.havePeriodsGigantic();
        } else {

          if (grrProcedure.havePeriodsGigantic() > 2) {
            grrProcedure.situatedMinutesEnormous(grrProcedure.havePeriodsGigantic() - 1);
          }

          prepareLine.addLast(grrProcedure);
          grrProcedure = null;
          this.mbeMarker = true;
        }
      }
    }

    if (this.mbeMarker && liveOutgrowth == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == 0) {
        this.mbeMarker = false;
        this.residualFraserOpportunity = Salesperson.MailAmount;
      }

    } else {

      if (grrProcedure == null && !prepareLine.isEmpty()) {
        grrProcedure = prepareLine.removeFirst();
        burdensMethods(grrProcedure);
        grrProcedure.primedGetPeriod(this.findActualRetick());
        clockLeft = grrProcedure.havePeriodsGigantic();
      }
    }
  }

  public synchronized void mechanismsArrive(Mechanism phase) {
    prepareLine.add(new GrrProcedure(phase));
  }
}
