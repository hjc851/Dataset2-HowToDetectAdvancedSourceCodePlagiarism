package initialization;

import device.Device;
import initialization.Writer;
import initialization.Mechanism;
import java.util.ArrayDeque;

public class TrilledServer extends Writer {
  private int minutesLatter = 0;
  private ArrayDeque<Mechanism> happyStopper = null;

  public TrilledServer() {
    this.happyStopper = new ArrayDeque<>();
    minutesLatter = DaysQuantitative;
  }

  public synchronized String outlinerGens() {
    return "RR:";
  }

  public synchronized void optiBeat() {

    if (presentlyMechanism != null) {
      presentlyMechanism.bentLengthwiseHour(presentlyMechanism.obtainScamperingDays() + 1);
      minutesLatter--;

      if (presentlyMechanism.obtainScamperingDays()
          == presentlyMechanism.findImplementationSmall()) {
        presentlyMechanism.fixedEscapeOpportunity(this.takeTopicalMark());
        this.concludedPractices.addLast(presentlyMechanism);
        presentlyMechanism = null;
        this.deviceEnsign = true;
      }

      if (minutesLatter == 0 && presentlyMechanism != null) {

        if (happyStopper.isEmpty()) {
          minutesLatter = DaysQuantitative;
        } else {
          happyStopper.addLast(presentlyMechanism);
          presentlyMechanism = null;
          this.deviceEnsign = true;
        }
      }
    }

    if (this.deviceEnsign && presentlyMechanism == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.deviceEnsign = false;
        this.leavingBrinWhen = Device.ExpeditiousnessYear;
      }

    } else {

      if (presentlyMechanism == null && !happyStopper.isEmpty()) {
        presentlyMechanism = happyStopper.removeFirst();
        capacityMechanism(presentlyMechanism);
        presentlyMechanism.arrangeBeganYears(this.takeTopicalMark());
        minutesLatter = DaysQuantitative;
      }
    }
  }

  public synchronized void systemInpouring(Mechanism work) {
    happyStopper.addLast(work);
  }
}
