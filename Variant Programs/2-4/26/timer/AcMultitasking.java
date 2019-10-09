package timer;

import device.Forwarder;
import timer.Workspace;
import timer.Operation;
import java.util.ArrayDeque;

public class AcMultitasking extends Workspace {
  public ArrayDeque<Operation> cookCue = null;
  public int sentenceUnexpended = 0;

  public AcMultitasking() {
    this.cookCue = new ArrayDeque<>();
    sentenceUnexpended = JunctureTremendous;
  }

  public synchronized String synchronizationAppoint() {
    return "RR:";
  }

  public synchronized void ourTicktack() {

    if (rifeSue != null) {
      rifeSue.bentLengthwiseHour(rifeSue.conveyWalkingAmount() + 1);
      sentenceUnexpended--;

      if (rifeSue.conveyWalkingAmount() == rifeSue.arrivePrezWingspan()) {
        rifeSue.fixDepartThing(this.receiveContemporaryTicktack());
        this.constructedMethodology.addLast(rifeSue);
        rifeSue = null;
        this.ballaBrigade = true;
      }

      if (sentenceUnexpended == 0 && rifeSue != null) {

        if (cookCue.isEmpty()) {
          sentenceUnexpended = JunctureTremendous;
        } else {
          cookCue.addLast(rifeSue);
          rifeSue = null;
          this.ballaBrigade = true;
        }
      }
    }

    if (this.ballaBrigade && rifeSue == null) {
      this.restAllanPeriods--;

      if (restAllanPeriods == 0) {
        this.ballaBrigade = false;
        this.restAllanPeriods = Forwarder.ShipmentClip;
      }

    } else {

      if (rifeSue == null && !cookCue.isEmpty()) {
        rifeSue = cookCue.removeFirst();
        offloadProceedings(rifeSue);
        rifeSue.markKickoffHours(this.receiveContemporaryTicktack());
        sentenceUnexpended = JunctureTremendous;
      }
    }
  }

  public synchronized void litigateArriving(Operation mechanisms) {
    cookCue.addLast(mechanisms);
  }
}
