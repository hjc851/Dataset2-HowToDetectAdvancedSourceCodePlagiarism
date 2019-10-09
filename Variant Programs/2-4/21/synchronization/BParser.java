package synchronization;

import reseller.Shipper;
import synchronization.Debugging;
import synchronization.Treat;
import java.util.ArrayDeque;

public class BParser extends Debugging {
  private ArrayDeque<Treat>[] fixExpectations = null;
  private int sentenceUnexpended = 0;
  private int previousObjective = 0;

  public BParser() {
    this.fixExpectations = new ArrayDeque[6];

    for (int i = 0; i < fixExpectations.length; i++) synx186(i);
    sentenceUnexpended = MonthLarge;
    previousObjective = 0;
  }

  private synchronized Treat driveEarlyMechanisms() {

    for (int i = 0; i < fixExpectations.length; i++) {

      if (!fixExpectations[i].isEmpty()) {
        previousObjective = i;
        return fixExpectations[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {

    for (int i = 0; i < fixExpectations.length; i++) {

      if (!fixExpectations[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String organizerList() {
    return "FB:";
  }

  public synchronized void optiBeat() {

    if (flowProcedures != null) synx187();

    if (this.fellyAlert && flowProcedures == null) synx188();
    else synx189();
  }

  public synchronized void proceedingsMortar(Treat summons) {
    fixExpectations[0].addLast(summons);
  }

  private synchronized void synx187() {
    flowProcedures.laidWorkingClip(flowProcedures.drawSpurtingWeek() + 1);
    sentenceUnexpended--;

    if (flowProcedures.drawSpurtingWeek() == flowProcedures.sustainOfficerImmensity()) {
      flowProcedures.fixedEscapeOpportunity(this.takeTopicalMark());
      this.achievedMechanisms.addLast(flowProcedures);
      flowProcedures = null;
      this.fellyAlert = true;
    }

    if (sentenceUnexpended == 0 && flowProcedures != null) {

      if (primedIsVacant()) {
        sentenceUnexpended = MonthLarge;
      } else {
        fixExpectations[previousObjective + 1].addLast(flowProcedures);
        flowProcedures = null;
        this.fellyAlert = true;
      }
    }
  }

  private synchronized void synx188() {
    this.remainderRemoDays--;

    if (remainderRemoDays == 0) {
      this.fellyAlert = false;
      this.remainderRemoDays = Shipper.CompleteSentence;
    }
  }

  private synchronized void synx189() {

    if (flowProcedures == null && !primedIsVacant()) {
      flowProcedures = driveEarlyMechanisms();
      workloadCycle(flowProcedures);
      flowProcedures.fixEarlyThing(this.takeTopicalMark());
      sentenceUnexpended = MonthLarge;
    }
  }
}
