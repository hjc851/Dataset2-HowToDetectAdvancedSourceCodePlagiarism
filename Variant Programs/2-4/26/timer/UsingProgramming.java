package timer;

import device.Forwarder;
import timer.Workspace;
import timer.Operation;
import java.util.ArrayDeque;

public class UsingProgramming extends Workspace {
  public ArrayDeque<Operation> willingSpooler = null;

  public UsingProgramming() {
    this.willingSpooler = new ArrayDeque<>();
  }

  public synchronized String synchronizationAppoint() {
    return "FCFS:";
  }

  public synchronized void ourTicktack() {

    if (rifeSue != null) {
      rifeSue.bentLengthwiseHour(rifeSue.conveyWalkingAmount() + 1);

      if (rifeSue.conveyWalkingAmount() == rifeSue.arrivePrezWingspan()) {
        rifeSue.fixDepartThing(this.receiveContemporaryTicktack());
        this.constructedMethodology.addLast(rifeSue);
        rifeSue = null;
        this.ballaBrigade = true;
      }
    }

    if (this.ballaBrigade && rifeSue == null) {
      this.restAllanPeriods--;

      if (restAllanPeriods == 0) {
        this.ballaBrigade = false;
        this.restAllanPeriods = Forwarder.ShipmentClip;
      }

    } else {

      if (rifeSue == null && !willingSpooler.isEmpty()) {
        rifeSue = willingSpooler.removeFirst();
        rifeSue.markKickoffHours(this.receiveContemporaryTicktack());
        offloadProceedings(rifeSue);
      }
    }
  }

  public synchronized void litigateArriving(Operation methods) {
    willingSpooler.addLast(methods);
  }
}
