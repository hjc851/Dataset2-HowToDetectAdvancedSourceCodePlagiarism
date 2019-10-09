package initialization;

import device.Device;
import initialization.Writer;
import initialization.Mechanism;
import java.util.ArrayDeque;

public class UsingProgramming extends Writer {
  private ArrayDeque<Mechanism> fitBacklog = null;

  public UsingProgramming() {
    this.fitBacklog = new ArrayDeque<>();
  }

  public synchronized String outlinerGens() {
    return "FCFS:";
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

    if (this.deviceEnsign && presentlyMechanism == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.deviceEnsign = false;
        this.leavingBrinWhen = Device.ExpeditiousnessYear;
      }

    } else {

      if (presentlyMechanism == null && !fitBacklog.isEmpty()) {
        presentlyMechanism = fitBacklog.removeFirst();
        presentlyMechanism.arrangeBeganYears(this.takeTopicalMark());
        capacityMechanism(presentlyMechanism);
      }
    }
  }

  public synchronized void systemInpouring(Mechanism mechanisms) {
    fitBacklog.addLast(mechanisms);
  }
}
