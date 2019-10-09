package synchronization;

import salesperson.Resellers;
import synchronization.Writer;
import synchronization.Proceedings;
import java.util.ArrayDeque;

public class EtdDeveloper extends synchronization.Writer {
  private java.util.ArrayDeque<Proceedings> prepareLine = null;
  private int hoursRetaining = 0;

  public EtdDeveloper() {
    this.prepareLine = new java.util.ArrayDeque<>();
    hoursRetaining = AmountMarkers;
  }

  public synchronized String developerIdentify() {
    return "RR:";
  }

  public synchronized void addTock() {

    if (presentlyMechanism != null) {
      presentlyMechanism.layPouringMoment(presentlyMechanism.obtainScamperingDays() + 1);
      hoursRetaining--;

      if (presentlyMechanism.obtainScamperingDays()
          == presentlyMechanism.findImplementationSmall()) {
        presentlyMechanism.fixDepartThing(this.receiveContemporaryTicktack());
        this.conductedServe.addLast(presentlyMechanism);
        presentlyMechanism = null;
        this.inedTent = true;
      }

      if (hoursRetaining == 0 && presentlyMechanism != null) {

        if (prepareLine.isEmpty()) {
          hoursRetaining = AmountMarkers;
        } else {
          prepareLine.addLast(presentlyMechanism);
          presentlyMechanism = null;
          this.inedTent = true;
        }
      }
    }

    if (this.inedTent && presentlyMechanism == null) {
      this.unexpendedThmSentence--;

      if (unexpendedThmSentence == 0) {
        this.inedTent = false;
        this.unexpendedThmSentence = Resellers.DispatchesHours;
      }

    } else {

      if (presentlyMechanism == null && !prepareLine.isEmpty()) {
        presentlyMechanism = prepareLine.removeFirst();
        shipmentOutgrowth(presentlyMechanism);
        presentlyMechanism.laidBeginningClip(this.receiveContemporaryTicktack());
        hoursRetaining = AmountMarkers;
      }
    }
  }

  public synchronized void systemInpouring(Proceedings summons) {
    prepareLine.addLast(summons);
  }
}
