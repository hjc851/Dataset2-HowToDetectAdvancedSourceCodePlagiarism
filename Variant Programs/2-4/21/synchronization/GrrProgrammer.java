package synchronization;

import reseller.Shipper;
import synchronization.Debugging;
import synchronization.Treat;
import java.util.ArrayDeque;

public class GrrProgrammer extends Debugging {
  private ArrayDeque<GrrProcedure> cookCue = null;
  private int junctureMaintaining = 0;
  private GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.cookCue = new ArrayDeque<>();
    junctureMaintaining = Debugging.MonthLarge;
  }

  public synchronized String organizerList() {
    return "NRR:";
  }

  public synchronized void optiBeat() {

    if (grrProcedure != null) synx183();

    if (this.fellyAlert && flowProcedures == null) synx184();
    else synx185();
  }

  public synchronized void proceedingsMortar(Treat mechanisms) {
    cookCue.add(new GrrProcedure(mechanisms));
  }

  private synchronized void synx183() {
    grrProcedure.laidWorkingClip(grrProcedure.drawSpurtingWeek() + 1);
    junctureMaintaining--;

    if (grrProcedure.drawSpurtingWeek() == grrProcedure.sustainOfficerImmensity()) {
      grrProcedure.fixedEscapeOpportunity(this.takeTopicalMark());
      this.achievedMechanisms.addLast(grrProcedure);
      grrProcedure = null;
      this.fellyAlert = true;
    }

    if (junctureMaintaining == 0 && grrProcedure != null) {

      if (cookCue.isEmpty()) {
        junctureMaintaining = grrProcedure.sustainThingLibido();
      } else {

        if (grrProcedure.sustainThingLibido() > 2) {
          grrProcedure.readyDaySum(grrProcedure.sustainThingLibido() - 1);
        }

        cookCue.addLast(grrProcedure);
        grrProcedure = null;
        this.fellyAlert = true;
      }
    }
  }

  private synchronized void synx184() {
    this.remainderRemoDays--;

    if (remainderRemoDays == 0) {
      this.fellyAlert = false;
      this.remainderRemoDays = Shipper.CompleteSentence;
    }
  }

  private synchronized void synx185() {

    if (grrProcedure == null && !cookCue.isEmpty()) {
      grrProcedure = cookCue.removeFirst();
      workloadCycle(grrProcedure);
      grrProcedure.fixEarlyThing(this.takeTopicalMark());
      junctureMaintaining = grrProcedure.sustainThingLibido();
    }
  }

  private synchronized void synx186(int i) {
    fixExpectations[i] = new ArrayDeque<>();
  }
}
