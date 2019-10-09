package timer;

import device.Forwarder;
import timer.Workspace;
import timer.Operation;
import java.util.ArrayDeque;

public class GrrProgrammer extends Workspace {
  public ArrayDeque<GrrProcedure> primedWaiting = null;
  public int monthAdditional = 0;
  public GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.primedWaiting = new ArrayDeque<>();
    monthAdditional = Workspace.JunctureTremendous;
  }

  public synchronized String synchronizationAppoint() {
    return "NRR:";
  }

  public synchronized void ourTicktack() {

    if (grrProcedure != null) {
      grrProcedure.bentLengthwiseHour(grrProcedure.conveyWalkingAmount() + 1);
      monthAdditional--;

      if (grrProcedure.conveyWalkingAmount() == grrProcedure.arrivePrezWingspan()) {
        grrProcedure.fixDepartThing(this.receiveContemporaryTicktack());
        this.constructedMethodology.addLast(grrProcedure);
        grrProcedure = null;
        this.ballaBrigade = true;
      }

      if (monthAdditional == 0 && grrProcedure != null) {

        if (primedWaiting.isEmpty()) {
          monthAdditional = grrProcedure.startMinutesEnormous();
        } else {

          if (grrProcedure.startMinutesEnormous() > 2) {
            grrProcedure.determineBeginningMammoth(grrProcedure.startMinutesEnormous() - 1);
          }

          primedWaiting.addLast(grrProcedure);
          grrProcedure = null;
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

      if (grrProcedure == null && !primedWaiting.isEmpty()) {
        grrProcedure = primedWaiting.removeFirst();
        offloadProceedings(grrProcedure);
        grrProcedure.markKickoffHours(this.receiveContemporaryTicktack());
        monthAdditional = grrProcedure.startMinutesEnormous();
      }
    }
  }

  public synchronized void litigateArriving(Operation proceeding) {
    primedWaiting.add(new GrrProcedure(proceeding));
  }
}
