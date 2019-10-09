package programmer;

import salesperson.Distributor;
import programmer.Workspace;
import programmer.Mechanisms;
import java.util.ArrayDeque;

public class GrrProgrammer extends programmer.Workspace {

  public synchronized String serverDiagnose() {
    return "NRR:";
  }

  public java.util.ArrayDeque<GrrProcedure> cookCue;
  public programmer.GrrProcedure grrProcedure;
  public int monthAdditional;

  public synchronized void procedureIngoing(Mechanisms proceeding) {
    cookCue.add(new programmer.GrrProcedure(proceeding));
  }

  public GrrProgrammer() {
    this.cookCue = new java.util.ArrayDeque<>();
    monthAdditional = Workspace.ClipQuantity;
  }

  public synchronized void snoTicktock() {

    if (grrProcedure != null) {
      grrProcedure.settledSpoutingPeriods(grrProcedure.arriveFleeingMonth() + 1);
      monthAdditional--;

      if (grrProcedure.arriveFleeingMonth() == grrProcedure.catchRunnableScale()) {
        grrProcedure.fitDieYear(this.obtainLiveTic());
        this.performedTreat.addLast(grrProcedure);
        grrProcedure = null;
        this.ordeBeacon = true;
      }

      if (monthAdditional == 0 && grrProcedure != null) {

        if (cookCue.isEmpty()) {
          monthAdditional = grrProcedure.bringMeterMeasure();
        } else {

          if (grrProcedure.bringMeterMeasure() > 2) {
            grrProcedure.fixedOpportunityDramatic(grrProcedure.bringMeterMeasure() - 1);
          }

          cookCue.addLast(grrProcedure);
          grrProcedure = null;
          this.ordeBeacon = true;
        }
      }
    }

    if (this.ordeBeacon && flowProcedures == null) {
      this.anotherBurberryYears--;

      if (anotherBurberryYears == 0) {
        this.ordeBeacon = false;
        this.anotherBurberryYears = Distributor.DispatchesHours;
      }

    } else {

      if (grrProcedure == null && !cookCue.isEmpty()) {
        grrProcedure = cookCue.removeFirst();
        ladingSue(grrProcedure);
        grrProcedure.fixEarlyThing(this.obtainLiveTic());
        monthAdditional = grrProcedure.bringMeterMeasure();
      }
    }
  }
}
