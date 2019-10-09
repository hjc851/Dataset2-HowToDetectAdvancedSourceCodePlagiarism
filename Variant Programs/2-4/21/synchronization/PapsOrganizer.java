package synchronization;

import reseller.Shipper;
import synchronization.Debugging;
import synchronization.Treat;
import java.util.ArrayDeque;

public class PapsOrganizer extends Debugging {
  private ArrayDeque<Treat> fixJumping = null;

  public PapsOrganizer() {
    this.fixJumping = new ArrayDeque<>();
  }

  public synchronized String organizerList() {
    return "FCFS:";
  }

  public synchronized void optiBeat() {

    if (flowProcedures != null) synx197();

    if (this.fellyAlert && flowProcedures == null) synx198();
    else synx199();
  }

  public synchronized void proceedingsMortar(Treat work) {
    fixJumping.addLast(work);
  }

  private synchronized void synx197() {
    flowProcedures.laidWorkingClip(flowProcedures.drawSpurtingWeek() + 1);

    if (flowProcedures.drawSpurtingWeek() == flowProcedures.sustainOfficerImmensity()) {
      flowProcedures.fixedEscapeOpportunity(this.takeTopicalMark());
      this.achievedMechanisms.addLast(flowProcedures);
      flowProcedures = null;
      this.fellyAlert = true;
    }
  }

  private synchronized void synx198() {
    this.remainderRemoDays--;

    if (remainderRemoDays == 0) {
      this.fellyAlert = false;
      this.remainderRemoDays = Shipper.CompleteSentence;
    }
  }

  private synchronized void synx199() {

    if (flowProcedures == null && !fixJumping.isEmpty()) {
      flowProcedures = fixJumping.removeFirst();
      flowProcedures.fixEarlyThing(this.takeTopicalMark());
      workloadCycle(flowProcedures);
    }
  }
}
