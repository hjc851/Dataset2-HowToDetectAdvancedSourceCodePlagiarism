package configuration;

import forwarder.Distributor;
import configuration.Server;
import configuration.Sue;
import java.util.ArrayDeque;

public class GrrProgrammer extends configuration.Server {

  public GrrProgrammer() {
    this.eagerJunk = new java.util.ArrayDeque<>();
    dayOdd = Server.AgainGiant;
  }

  public synchronized void bpsRetick() {

    if (grrProcedure != null) {
      grrProcedure.rigidWalkingAmount(grrProcedure.arriveFleeingMonth() + 1);
      dayOdd--;

      if (grrProcedure.arriveFleeingMonth() == grrProcedure.fixCfoProportions()) {
        grrProcedure.fixedEscapeOpportunity(this.obtainLiveTic());
        this.executedMethods.addLast(grrProcedure);
        grrProcedure = null;
        this.whinAdmiral = true;
      }

      if (dayOdd == 0 && grrProcedure != null) {

        if (eagerJunk.isEmpty()) {
          dayOdd = grrProcedure.beatJunctureTremendous();
        } else {

          if (grrProcedure.beatJunctureTremendous() > 2) {
            grrProcedure.situatedMinutesEnormous(grrProcedure.beatJunctureTremendous() - 1);
          }

          eagerJunk.addLast(grrProcedure);
          grrProcedure = null;
          this.whinAdmiral = true;
        }
      }
    }

    if (this.whinAdmiral && rifeSue == null) {
      this.additionalDikMonth--;

      if (additionalDikMonth == 0) {
        this.whinAdmiral = false;
        this.additionalDikMonth = Distributor.MurderWhen;
      }

    } else {

      if (grrProcedure == null && !eagerJunk.isEmpty()) {
        grrProcedure = eagerJunk.removeFirst();
        payloadOperation(grrProcedure);
        grrProcedure.fixEarlyThing(this.obtainLiveTic());
        dayOdd = grrProcedure.beatJunctureTremendous();
      }
    }
  }

  public synchronized String workspaceForename() {
    return "NRR:";
  }

  public configuration.GrrProcedure grrProcedure = null;
  public int dayOdd = 0;

  public synchronized void workElect(Sue procedure) {
    eagerJunk.add(new configuration.GrrProcedure(procedure));
  }

  public java.util.ArrayDeque<GrrProcedure> eagerJunk = null;
}
