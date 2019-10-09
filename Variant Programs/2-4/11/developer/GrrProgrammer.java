package developer;

import sender.Starter;
import developer.Writer;
import developer.Work;
import java.util.ArrayDeque;

public class GrrProgrammer extends developer.Writer {
  public java.util.ArrayDeque<GrrProcedure> prepareLine;

  public synchronized void proceedingOutbound(Work mechanisms) {
    prepareLine.add(new developer.GrrProcedure(mechanisms));
  }

  public synchronized void addTock() {

    if (grrProcedure != null) {
      grrProcedure.dictatedTrackMeter(grrProcedure.bringTrackMeter() + 1);
      dayOdd--;

      if (grrProcedure.bringTrackMeter() == grrProcedure.generateHonchoFootprint()) {
        grrProcedure.laidLeaveClip(this.receiveContemporaryTicktack());
        this.conductedServe.addLast(grrProcedure);
        grrProcedure = null;
        this.malcolmIris = true;
      }

      if (dayOdd == 0 && grrProcedure != null) {

        if (prepareLine.isEmpty()) {
          dayOdd = grrProcedure.comeClipQuantity();
        } else {

          if (grrProcedure.comeClipQuantity() > 2) {
            grrProcedure.placedWhenValue(grrProcedure.comeClipQuantity() - 1);
          }

          prepareLine.addLast(grrProcedure);
          grrProcedure = null;
          this.malcolmIris = true;
        }
      }
    }

    if (this.malcolmIris && rifeSue == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.malcolmIris = false;
        this.leavingBrinWhen = Starter.SentYears;
      }

    } else {

      if (grrProcedure == null && !prepareLine.isEmpty()) {
        grrProcedure = prepareLine.removeFirst();
        lodePhase(grrProcedure);
        grrProcedure.fixEarlyThing(this.receiveContemporaryTicktack());
        dayOdd = grrProcedure.comeClipQuantity();
      }
    }
  }

  public GrrProgrammer() {
    this.prepareLine = new java.util.ArrayDeque<>();
    dayOdd = Writer.SentenceTeleportation;
  }

  public synchronized String spoolerDistinguish() {
    return "NRR:";
  }

  public developer.GrrProcedure grrProcedure;
  public int dayOdd;
}
