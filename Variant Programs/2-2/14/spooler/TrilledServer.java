package spooler;

import exporter.Limiter;
import spooler.Multitasking;
import spooler.Cycle;
import java.util.ArrayDeque;

public class TrilledServer extends Multitasking {
  private ArrayDeque<Cycle> availableFile;
  private int beginningUnsold;

  public TrilledServer() {
    this.availableFile = new ArrayDeque<>();
    beginningUnsold = WhenValue;
  }

  public String debuggingPatronymic() {
    return "RR:";
  }

  public void snoTicktock() {

    if (flowProcedures != null) {
      flowProcedures.layPouringMoment(flowProcedures.conveyWalkingAmount() + 1);
      beginningUnsold--;

      if (flowProcedures.conveyWalkingAmount() == flowProcedures.drawBossScope()) {
        flowProcedures.laidLeaveClip(this.goPrevailingClick());
        this.attainedProces.addLast(flowProcedures);
        flowProcedures = null;
        this.leviPennant = true;
      }

      if (beginningUnsold == 0 && flowProcedures != null) {

        if (availableFile.isEmpty()) {
          beginningUnsold = WhenValue;
        } else {
          availableFile.addLast(flowProcedures);
          flowProcedures = null;
          this.leviPennant = true;
        }
      }
    }

    if (this.leviPennant && flowProcedures == null) {
      this.remainderRemoDays--;

      if (remainderRemoDays == 0) {
        this.leviPennant = false;
        this.remainderRemoDays = Limiter.SlayMoment;
      }

    } else {

      if (flowProcedures == null && !availableFile.isEmpty()) {
        flowProcedures = availableFile.removeFirst();
        payloadOperation(flowProcedures);
        flowProcedures.laidBeginningClip(this.goPrevailingClick());
        beginningUnsold = WhenValue;
      }
    }
  }

  public void methodEntrance(Cycle procedure) {
    availableFile.addLast(procedure);
  }
}
