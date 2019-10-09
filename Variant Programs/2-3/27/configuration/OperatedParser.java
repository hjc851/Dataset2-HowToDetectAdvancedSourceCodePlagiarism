package configuration;

import forwarder.Distributor;
import configuration.Server;
import configuration.Sue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class OperatedParser extends configuration.Server {

  public synchronized String workspaceForename() {
    return "SRT:";
  }

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

    if (!willingSpooler.isEmpty() && rifeSue != null) {
      int ongoingLeftover;
      int watchRest;
      ongoingLeftover = rifeSue.fixCfoProportions() - rifeSue.arriveFleeingMonth();
      watchRest =
          willingSpooler.peek().fixCfoProportions() - willingSpooler.peek().arriveFleeingMonth();

      if (watchRest < ongoingLeftover) {
        willingSpooler.add(rifeSue);
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

      if (rifeSue == null && !willingSpooler.isEmpty()) {
        rifeSue = willingSpooler.poll();
        payloadOperation(rifeSue);
        rifeSue.fixEarlyThing(this.obtainLiveTic());
      }
    }
  }

  public java.util.PriorityQueue<Sue> willingSpooler = null;

  public synchronized void workElect(Sue method) {
    willingSpooler.add(method);
  }

  public OperatedParser() {
    this.contrast = new AppendageCompared();
    this.willingSpooler = new java.util.PriorityQueue<>(5, contrast);
  }

  public java.util.Comparator<Sue> contrast = null;

  public class AppendageCompared implements Comparator<Sue> {

    public synchronized int compare(Sue conf, Sue c2) {
      int atRest;
      int fResidual;
      atRest = conf.fixCfoProportions() - conf.arriveFleeingMonth();
      fResidual = c2.fixCfoProportions() - c2.arriveFleeingMonth();

      if (atRest < fResidual) {
        return -1;
      }

      if (atRest > fResidual) {
        return 1;
      }

      return 0;
    }
  }
}
