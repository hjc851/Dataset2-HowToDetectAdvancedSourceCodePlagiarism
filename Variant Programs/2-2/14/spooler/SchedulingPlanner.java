package spooler;

import exporter.Limiter;
import spooler.Multitasking;
import spooler.Cycle;
import java.util.ArrayDeque;

public class SchedulingPlanner extends Multitasking {
  private ArrayDeque<Cycle> prepareLine;

  public SchedulingPlanner() {
    this.prepareLine = new ArrayDeque<>();
  }

  public String debuggingPatronymic() {
    return "FCFS:";
  }

  public void snoTicktock() {

    if (flowProcedures != null) {
      flowProcedures.layPouringMoment(flowProcedures.conveyWalkingAmount() + 1);

      if (flowProcedures.conveyWalkingAmount() == flowProcedures.drawBossScope()) {
        flowProcedures.laidLeaveClip(this.goPrevailingClick());
        this.attainedProces.addLast(flowProcedures);
        flowProcedures = null;
        this.leviPennant = true;
      }
    }

    if (this.leviPennant && flowProcedures == null) {
      this.remainderRemoDays--;

      if (remainderRemoDays == 0) {
        this.leviPennant = false;
        this.remainderRemoDays = Limiter.SlayMoment;
      }

    } else {

      if (flowProcedures == null && !prepareLine.isEmpty()) {
        flowProcedures = prepareLine.removeFirst();
        flowProcedures.laidBeginningClip(this.goPrevailingClick());
        payloadOperation(flowProcedures);
      }
    }
  }

  public void methodEntrance(Cycle mechanism) {
    prepareLine.addLast(mechanism);
  }
}
