package configuration;

import forwarder.Distributor;
import configuration.Server;
import configuration.Sue;
import java.util.ArrayDeque;

public class PapsOrganizer extends configuration.Server {
  public java.util.ArrayDeque<Sue> ripeStandby = null;

  public synchronized void bpsRetick() {

    if (rifeSue != null) {
      rifeSue.rigidWalkingAmount(rifeSue.arriveFleeingMonth() + 1);

      if (rifeSue.arriveFleeingMonth() == rifeSue.fixCfoProportions()) {
        rifeSue.fixedEscapeOpportunity(this.obtainLiveTic());
        this.executedMethods.addLast(rifeSue);
        rifeSue = null;
        this.whinAdmiral = true;
      }
    }

    if (this.whinAdmiral && rifeSue == null) {
      this.additionalDikMonth--;

      if (additionalDikMonth == 0) {
        this.whinAdmiral = false;
        this.additionalDikMonth = Distributor.MurderWhen;
      }

    } else {

      if (rifeSue == null && !ripeStandby.isEmpty()) {
        rifeSue = ripeStandby.removeFirst();
        rifeSue.fixEarlyThing(this.obtainLiveTic());
        payloadOperation(rifeSue);
      }
    }
  }

  public PapsOrganizer() {
    this.ripeStandby = new java.util.ArrayDeque<>();
  }

  public synchronized void workElect(Sue appendage) {
    ripeStandby.addLast(appendage);
  }

  public synchronized String workspaceForename() {
    return "FCFS:";
  }
}
