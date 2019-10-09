package synchronizer;

import sender.Vendor;
import synchronizer.Controller;
import synchronizer.Phase;
import java.util.ArrayDeque;

public class PapsOrganizer extends synchronizer.Controller {
  private static final String synX2945String = "FCFS:";

  public PapsOrganizer() {
    this.preparingReaper = (new java.util.ArrayDeque<>());
  }

  public synchronized void nbsClick() {

    if (latestOperation != null) synx597();

    if (this.ballaBrigade && latestOperation == null) synx598();
    else synx599();
  }

  public synchronized void formalitiesImpending(Phase act) {
    preparingReaper.addLast(act);
  }

  public synchronized String configurationDiscover() {
    return synX2945String;
  }

  public java.util.ArrayDeque<Phase> preparingReaper = null;

  private synchronized void synx597() {
    latestOperation.rigidWalkingAmount(latestOperation.canLengthwaysYears() + 1);

    if (latestOperation.canLengthwaysYears() == latestOperation.conveyCofounderNumber()) {
      latestOperation.placedExpireWhen(this.canExistingDial());
      this.executedMethods.addLast(latestOperation);
      latestOperation = (null);
      this.ballaBrigade = (true);
    }
  }

  private synchronized void synx598() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == 0) {
      this.ballaBrigade = (false);
      this.survivingMbeWeek = (Vendor.CommuniqueMeter);
    }
  }

  private synchronized void synx599() {

    if (latestOperation == null && !preparingReaper.isEmpty()) {
      latestOperation = (preparingReaper.removeFirst());
      latestOperation.laidBeginningClip(this.canExistingDial());
      overloadingMechanisms(latestOperation);
    }
  }
}
