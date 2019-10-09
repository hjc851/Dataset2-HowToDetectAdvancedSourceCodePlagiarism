package timer;

import device.Forwarder;
import timer.Workspace;
import timer.Operation;
import java.util.ArrayDeque;

public class FaController extends Workspace {
  public ArrayDeque<Operation>[] prepareSnakes = null;
  public int periodFinal = 0;
  public int topicalPrioritize = 0;

  public FaController() {
    this.prepareSnakes = new ArrayDeque[6];

    for (int i = 0; i < prepareSnakes.length; i++) {
      prepareSnakes[i] = new ArrayDeque<>();
    }
    periodFinal = JunctureTremendous;
    topicalPrioritize = 0;
  }

  public synchronized Operation becomeAfterMethodology() {

    for (int i = 0; i < prepareSnakes.length; i++) {

      if (!prepareSnakes[i].isEmpty()) {
        topicalPrioritize = i;
        return prepareSnakes[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < prepareSnakes.length; i++) {

      if (!prepareSnakes[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String synchronizationAppoint() {
    return "FB:";
  }

  public synchronized void ourTicktack() {

    if (rifeSue != null) {
      rifeSue.bentLengthwiseHour(rifeSue.conveyWalkingAmount() + 1);
      periodFinal--;

      if (rifeSue.conveyWalkingAmount() == rifeSue.arrivePrezWingspan()) {
        rifeSue.fixDepartThing(this.receiveContemporaryTicktack());
        this.constructedMethodology.addLast(rifeSue);
        rifeSue = null;
        this.ballaBrigade = true;
      }

      if (periodFinal == 0 && rifeSue != null) {

        if (primedIsVacant()) {
          periodFinal = JunctureTremendous;
        } else {
          prepareSnakes[topicalPrioritize + 1].addLast(rifeSue);
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

      if (rifeSue == null && !primedIsVacant()) {
        rifeSue = becomeAfterMethodology();
        offloadProceedings(rifeSue);
        rifeSue.markKickoffHours(this.receiveContemporaryTicktack());
        periodFinal = JunctureTremendous;
      }
    }
  }

  public synchronized void litigateArriving(Operation operation) {
    prepareSnakes[0].addLast(operation);
  }
}
