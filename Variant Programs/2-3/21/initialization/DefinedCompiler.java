package initialization;

import device.Device;
import initialization.Writer;
import initialization.Mechanism;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DefinedCompiler extends Writer {
  private Comparator<Mechanism> comparable = null;
  private PriorityQueue<Mechanism> ripeStandby = null;

  public DefinedCompiler() {
    this.comparable = new SueReference();
    this.ripeStandby = new PriorityQueue<>(5, comparable);
  }

  private class SueReference implements Comparator<Mechanism> {

    public synchronized int compare(Mechanism mi, Mechanism g) {
      int p2Other;
      int a2Leaving;
      p2Other = mi.findImplementationSmall() - mi.obtainScamperingDays();
      a2Leaving = g.findImplementationSmall() - g.obtainScamperingDays();

      if (p2Other < a2Leaving) {
        return -1;
      }

      if (p2Other > a2Leaving) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String outlinerGens() {
    return "SRT:";
  }

  public synchronized void optiBeat() {

    if (presentlyMechanism != null) {
      presentlyMechanism.bentLengthwiseHour(presentlyMechanism.obtainScamperingDays() + 1);

      if (presentlyMechanism.obtainScamperingDays()
          == presentlyMechanism.findImplementationSmall()) {
        presentlyMechanism.fixedEscapeOpportunity(this.takeTopicalMark());
        this.concludedPractices.addLast(presentlyMechanism);
        presentlyMechanism = null;
        this.deviceEnsign = true;
      }
    }

    if (!ripeStandby.isEmpty() && presentlyMechanism != null) {
      int prevailingLeft;
      int peruseMaintaining;
      prevailingLeft =
          presentlyMechanism.findImplementationSmall() - presentlyMechanism.obtainScamperingDays();
      peruseMaintaining =
          ripeStandby.peek().findImplementationSmall() - ripeStandby.peek().obtainScamperingDays();

      if (peruseMaintaining < prevailingLeft) {
        ripeStandby.add(presentlyMechanism);
        presentlyMechanism = null;
        this.deviceEnsign = true;
      }
    }

    if (this.deviceEnsign && presentlyMechanism == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.deviceEnsign = false;
        this.leavingBrinWhen = Device.ExpeditiousnessYear;
      }

    } else {

      if (presentlyMechanism == null && !ripeStandby.isEmpty()) {
        presentlyMechanism = ripeStandby.poll();
        capacityMechanism(presentlyMechanism);
        presentlyMechanism.arrangeBeganYears(this.takeTopicalMark());
      }
    }
  }

  public synchronized void systemInpouring(Mechanism sue) {
    ripeStandby.add(sue);
  }
}
