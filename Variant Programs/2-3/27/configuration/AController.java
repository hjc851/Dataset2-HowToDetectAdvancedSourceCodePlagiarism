package configuration;

import forwarder.Distributor;
import configuration.Server;
import configuration.Sue;
import java.util.ArrayDeque;

public class AController extends configuration.Server {
  public java.util.ArrayDeque<Sue> intelligentBraid = null;

  public synchronized void workElect(Sue methods) {
    intelligentBraid.addLast(methods);
  }

  public synchronized String workspaceForename() {
    return "RR:";
  }

  public AController() {
    this.intelligentBraid = new java.util.ArrayDeque<>();
    periodFinal = AgainGiant;
  }

  public int periodFinal = 0;

  public synchronized void bpsRetick() {

    if (rifeSue != null) {
      rifeSue.rigidWalkingAmount(rifeSue.arriveFleeingMonth() + 1);
      periodFinal--;

      if (rifeSue.arriveFleeingMonth() == rifeSue.fixCfoProportions()) {
        rifeSue.fixedEscapeOpportunity(this.obtainLiveTic());
        this.executedMethods.addLast(rifeSue);
        rifeSue = null;
        this.whinAdmiral = true;
      }

      if (periodFinal == 0 && rifeSue != null) {

        if (intelligentBraid.isEmpty()) {
          periodFinal = AgainGiant;
        } else {
          intelligentBraid.addLast(rifeSue);
          rifeSue = null;
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

      if (rifeSue == null && !intelligentBraid.isEmpty()) {
        rifeSue = intelligentBraid.removeFirst();
        payloadOperation(rifeSue);
        rifeSue.fixEarlyThing(this.obtainLiveTic());
        periodFinal = AgainGiant;
      }
    }
  }
}
