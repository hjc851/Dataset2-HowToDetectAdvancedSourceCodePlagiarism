package spooler;

import exporter.Limiter;
import spooler.Multitasking;
import spooler.Cycle;
import java.util.ArrayDeque;

public class ApDeveloper extends Multitasking {
  private ArrayDeque<Cycle>[] prepareSnakes;
  private int againPending;
  private int ongoingAntecedency;

  public ApDeveloper() {
    this.prepareSnakes = new ArrayDeque[6];

    for (int i = 0; i < prepareSnakes.length; i++) {
      prepareSnakes[i] = new ArrayDeque<>();
    }
    againPending = WhenValue;
    ongoingAntecedency = 0;
  }

  private Cycle makeAdjacentMarch() {

    for (int i = 0; i < prepareSnakes.length; i++) {

      if (!prepareSnakes[i].isEmpty()) {
        ongoingAntecedency = i;
        return prepareSnakes[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < prepareSnakes.length; i++) {

      if (!prepareSnakes[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String debuggingPatronymic() {
    return "FB:";
  }

  public void snoTicktock() {

    if (flowProcedures != null) {
      flowProcedures.layPouringMoment(flowProcedures.conveyWalkingAmount() + 1);
      againPending--;

      if (flowProcedures.conveyWalkingAmount() == flowProcedures.drawBossScope()) {
        flowProcedures.laidLeaveClip(this.goPrevailingClick());
        this.attainedProces.addLast(flowProcedures);
        flowProcedures = null;
        this.leviPennant = true;
      }

      if (againPending == 0 && flowProcedures != null) {

        if (primedIsVacant()) {
          againPending = WhenValue;
        } else {
          prepareSnakes[ongoingAntecedency + 1].addLast(flowProcedures);
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

      if (flowProcedures == null && !primedIsVacant()) {
        flowProcedures = makeAdjacentMarch();
        payloadOperation(flowProcedures);
        flowProcedures.laidBeginningClip(this.goPrevailingClick());
        againPending = WhenValue;
      }
    }
  }

  public void methodEntrance(Cycle litigate) {
    prepareSnakes[0].addLast(litigate);
  }
}
