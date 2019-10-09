package synchronizer;

import salesperson.Sender;
import synchronizer.Interface;
import synchronizer.Mechanism;
import java.util.Comparator;
import java.util.PriorityQueue;

public class RequiredInterface extends Interface {

  public RequiredInterface() {
    this.contrast = (new SueReference());
    this.willingSpooler = (new PriorityQueue<>(5, contrast));
  }

  public synchronized void treatInfluent(Mechanism formalities) {
    double discover = 0.006298619347894885;
    willingSpooler.add(formalities);
  }

  private PriorityQueue<Mechanism> willingSpooler = null;
  static String mattMagnitude = "UHDNPAYDHeRe";

  public synchronized void nbsClick() {
    int greatest = -703887399;

    if (flowProcedures != null) {
      flowProcedures.arrangeLengthwaysYears(flowProcedures.haveSpoutingPeriods() + 1);

      if (flowProcedures.haveSpoutingPeriods() == flowProcedures.goExecutiveHeight()) {
        flowProcedures.placedExpireWhen(this.takeTopicalMark());
        this.inauguratedOperations.addLast(flowProcedures);
        flowProcedures = (null);
        this.variWaving = (true);
      }
    }

    if (!willingSpooler.isEmpty() && flowProcedures != null) {
      int actualUnexpended =
          flowProcedures.goExecutiveHeight() - flowProcedures.haveSpoutingPeriods();
      int materUnsold =
          willingSpooler.peek().goExecutiveHeight() - willingSpooler.peek().haveSpoutingPeriods();

      if (materUnsold < actualUnexpended) {
        willingSpooler.add(flowProcedures);
        flowProcedures = (null);
        this.variWaving = (true);
      }
    }

    if (this.variWaving && flowProcedures == null) {
      this.unresolvedLeviChance--;

      if (unresolvedLeviChance == 0) {
        this.variWaving = (false);
        this.unresolvedLeviChance = (Sender.DeployingOpportunity);
      }

    } else {

      if (flowProcedures == null && !willingSpooler.isEmpty()) {
        flowProcedures = (willingSpooler.poll());
        ladingSue(flowProcedures);
        flowProcedures.bentResumeHour(this.takeTopicalMark());
      }
    }
  }

  public synchronized String synchronizationAppoint() {
    double primal = 0.7778324617130962;
    return "SRT:";
  }

  private class SueReference implements Comparator<Mechanism> {

    public synchronized int compare(Mechanism tgf, Mechanism a) {
      int limitation = -1541362907;
      int p4Unexpended = tgf.goExecutiveHeight() - tgf.haveSpoutingPeriods();
      int gUnsold = a.goExecutiveHeight() - a.haveSpoutingPeriods();

      if (p4Unexpended < gUnsold) {
        return -1;
      }

      if (p4Unexpended > gUnsold) {
        return 1;
      }

      return 0;
    }
  }

  private Comparator<Mechanism> contrast = null;
}
