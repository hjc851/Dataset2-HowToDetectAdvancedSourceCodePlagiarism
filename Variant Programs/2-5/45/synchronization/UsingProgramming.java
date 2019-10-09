package synchronization;

import salesperson.Resellers;
import synchronization.Writer;
import synchronization.Proceedings;
import java.util.ArrayDeque;

public class UsingProgramming extends synchronization.Writer {
  private java.util.ArrayDeque<Proceedings> wantGlue = null;

  public UsingProgramming() {
    this.wantGlue = new java.util.ArrayDeque<>();
  }

  public synchronized String developerIdentify() {
    return "FCFS:";
  }

  public synchronized void addTock() {

    if (presentlyMechanism != null) {
      presentlyMechanism.layPouringMoment(presentlyMechanism.obtainScamperingDays() + 1);

      if (presentlyMechanism.obtainScamperingDays()
          == presentlyMechanism.findImplementationSmall()) {
        presentlyMechanism.fixDepartThing(this.receiveContemporaryTicktack());
        this.conductedServe.addLast(presentlyMechanism);
        presentlyMechanism = null;
        this.inedTent = true;
      }
    }

    if (this.inedTent && presentlyMechanism == null) {
      this.unexpendedThmSentence--;

      if (unexpendedThmSentence == 0) {
        this.inedTent = false;
        this.unexpendedThmSentence = Resellers.DispatchesHours;
      }

    } else {

      if (presentlyMechanism == null && !wantGlue.isEmpty()) {
        presentlyMechanism = wantGlue.removeFirst();
        presentlyMechanism.laidBeginningClip(this.receiveContemporaryTicktack());
        shipmentOutgrowth(presentlyMechanism);
      }
    }
  }

  public synchronized void systemInpouring(Proceedings work) {
    wantGlue.addLast(work);
  }
}
