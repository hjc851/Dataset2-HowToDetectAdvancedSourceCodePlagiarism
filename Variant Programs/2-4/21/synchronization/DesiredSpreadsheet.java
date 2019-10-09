package synchronization;

import reseller.Shipper;
import synchronization.Debugging;
import synchronization.Treat;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DesiredSpreadsheet extends Debugging {
  private PriorityQueue<Treat> makeRow = null;
  private Comparator<Treat> footnote = null;

  public DesiredSpreadsheet() {
    this.footnote = new FormalitiesPlacebo();
    this.makeRow = new PriorityQueue<>(5, footnote);
  }

  private class FormalitiesPlacebo implements Comparator<Treat> {

    public synchronized int compare(Treat mi, Treat c2) {
      int interferonStay = mi.sustainOfficerImmensity() - mi.drawSpurtingWeek();
      int c2Unresolved = c2.sustainOfficerImmensity() - c2.drawSpurtingWeek();

      if (interferonStay < c2Unresolved) {
        return -1;
      }

      if (interferonStay > c2Unresolved) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String organizerList() {
    return "SRT:";
  }

  public synchronized void optiBeat() {

    if (flowProcedures != null) synx193();

    if (!makeRow.isEmpty() && flowProcedures != null) synx194();

    if (this.fellyAlert && flowProcedures == null) synx195();
    else synx196();
  }

  public synchronized void proceedingsMortar(Treat act) {
    makeRow.add(act);
  }

  private synchronized void synx193() {
    flowProcedures.laidWorkingClip(flowProcedures.drawSpurtingWeek() + 1);

    if (flowProcedures.drawSpurtingWeek() == flowProcedures.sustainOfficerImmensity()) {
      flowProcedures.fixedEscapeOpportunity(this.takeTopicalMark());
      this.achievedMechanisms.addLast(flowProcedures);
      flowProcedures = null;
      this.fellyAlert = true;
    }
  }

  private synchronized void synx194() {
    int existingAnother =
        flowProcedures.sustainOfficerImmensity() - flowProcedures.drawSpurtingWeek();
    int knockoutLatter =
        makeRow.peek().sustainOfficerImmensity() - makeRow.peek().drawSpurtingWeek();

    if (knockoutLatter < existingAnother) {
      makeRow.add(flowProcedures);
      flowProcedures = null;
      this.fellyAlert = true;
    }
  }

  private synchronized void synx195() {
    this.remainderRemoDays--;

    if (remainderRemoDays == 0) {
      this.fellyAlert = false;
      this.remainderRemoDays = Shipper.CompleteSentence;
    }
  }

  private synchronized void synx196() {

    if (flowProcedures == null && !makeRow.isEmpty()) {
      flowProcedures = makeRow.poll();
      workloadCycle(flowProcedures);
      flowProcedures.fixEarlyThing(this.takeTopicalMark());
    }
  }
}
