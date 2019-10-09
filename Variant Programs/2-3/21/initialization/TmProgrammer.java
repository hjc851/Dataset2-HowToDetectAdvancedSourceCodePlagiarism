package initialization;

import device.Device;
import initialization.Writer;
import initialization.Mechanism;
import java.util.ArrayDeque;

public class TmProgrammer extends Writer {
  private int incumbentPrioritized = 0;
  private int thingLingering = 0;
  private ArrayDeque<Mechanism>[] preppedDelays = null;

  public TmProgrammer() {
    this.preppedDelays = new ArrayDeque[6];

    for (int i = 0; i < preppedDelays.length; i++) {
      preppedDelays[i] = new ArrayDeque<>();
    }
    thingLingering = DaysQuantitative;
    incumbentPrioritized = 0;
  }

  private synchronized Mechanism makeAdjacentMarch() {

    for (int i = 0; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        incumbentPrioritized = i;
        return preppedDelays[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {

    for (int i = 0; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String outlinerGens() {
    return "FB:";
  }

  public synchronized void optiBeat() {

    if (presentlyMechanism != null) {
      presentlyMechanism.bentLengthwiseHour(presentlyMechanism.obtainScamperingDays() + 1);
      thingLingering--;

      if (presentlyMechanism.obtainScamperingDays()
          == presentlyMechanism.findImplementationSmall()) {
        presentlyMechanism.fixedEscapeOpportunity(this.takeTopicalMark());
        this.concludedPractices.addLast(presentlyMechanism);
        presentlyMechanism = null;
        this.deviceEnsign = true;
      }

      if (thingLingering == 0 && presentlyMechanism != null) {

        if (primedIsVacant()) {
          thingLingering = DaysQuantitative;
        } else {
          preppedDelays[incumbentPrioritized + 1].addLast(presentlyMechanism);
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

      if (presentlyMechanism == null && !primedIsVacant()) {
        presentlyMechanism = makeAdjacentMarch();
        capacityMechanism(presentlyMechanism);
        presentlyMechanism.arrangeBeganYears(this.takeTopicalMark());
        thingLingering = DaysQuantitative;
      }
    }
  }

  public synchronized void systemInpouring(Mechanism operation) {
    preppedDelays[0].addLast(operation);
  }
}
