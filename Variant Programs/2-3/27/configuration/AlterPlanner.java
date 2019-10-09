package configuration;

import forwarder.Distributor;
import configuration.Server;
import configuration.Sue;
import java.util.ArrayDeque;

public class AlterPlanner extends configuration.Server {
  public ArrayDeque<Sue>[] waitingFile = null;
  public int prevailingPrecedence = 0;

  public synchronized String workspaceForename() {
    return "FB:";
  }

  public synchronized configuration.Sue fixAgainSystem() {

    for (int i = 0; i < waitingFile.length; i++) {

      if (!waitingFile[i].isEmpty()) {
        prevailingPrecedence = i;
        return waitingFile[i].poll();
      }
    }
    return null;
  }

  public AlterPlanner() {
    this.waitingFile = new java.util.ArrayDeque[6];

    for (int i = 0; i < waitingFile.length; i++) {
      waitingFile[i] = new java.util.ArrayDeque<>();
    }
    momentUnexhausted = AgainGiant;
    prevailingPrecedence = 0;
  }

  public synchronized void bpsRetick() {

    if (rifeSue != null) {
      rifeSue.rigidWalkingAmount(rifeSue.arriveFleeingMonth() + 1);
      momentUnexhausted--;

      if (rifeSue.arriveFleeingMonth() == rifeSue.fixCfoProportions()) {
        rifeSue.fixedEscapeOpportunity(this.obtainLiveTic());
        this.executedMethods.addLast(rifeSue);
        rifeSue = null;
        this.whinAdmiral = true;
      }

      if (momentUnexhausted == 0 && rifeSue != null) {

        if (primedIsVacant()) {
          momentUnexhausted = AgainGiant;
        } else {
          waitingFile[prevailingPrecedence + 1].addLast(rifeSue);
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

      if (rifeSue == null && !primedIsVacant()) {
        rifeSue = fixAgainSystem();
        payloadOperation(rifeSue);
        rifeSue.fixEarlyThing(this.obtainLiveTic());
        momentUnexhausted = AgainGiant;
      }
    }
  }

  public synchronized void workElect(Sue act) {
    waitingFile[0].addLast(act);
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < waitingFile.length; i++) {

      if (!waitingFile[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public int momentUnexhausted = 0;
}
