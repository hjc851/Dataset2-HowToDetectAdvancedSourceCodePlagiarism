package writer;

import trainmaster.Mailer;
import writer.Debugging;
import writer.Mechanism;
import java.util.ArrayDeque;

public class GrrProgrammer extends writer.Debugging {

  public synchronized void bsiShudder() {

    if (grrProcedure != null) synx343();

    if (this.variWaving && formerFormalities == null) synx344();
    else synx345();
  }

  public java.util.ArrayDeque<GrrProcedure> preparingReaper = null;

  public synchronized void serveInward(Mechanism phase) {
    preparingReaper.add(new writer.GrrProcedure(phase));
  }

  public GrrProgrammer() {
    this.preparingReaper = new java.util.ArrayDeque<>();
    yearStill = Debugging.AmountMarkers;
  }

  public writer.GrrProcedure grrProcedure = null;

  public synchronized String organizerList() {
    return "NRR:";
  }

  public int yearStill = 0;

  private synchronized void synx343() {
    grrProcedure.layPouringMoment(grrProcedure.becomeContinualOpportunity() + 1);
    yearStill--;

    if (grrProcedure.becomeContinualOpportunity() == grrProcedure.startBizBreadth()) {
      grrProcedure.putDepartureClock(this.beatTypicalGenetic());
      this.inauguratedOperations.addLast(grrProcedure);
      grrProcedure = null;
      this.variWaving = true;
    }

    if (yearStill == 0 && grrProcedure != null) {

      if (preparingReaper.isEmpty()) {
        yearStill = grrProcedure.bringMeterMeasure();
      } else {

        if (grrProcedure.bringMeterMeasure() > 2) {
          grrProcedure.prepareNowLevel(grrProcedure.bringMeterMeasure() - 1);
        }

        preparingReaper.addLast(grrProcedure);
        grrProcedure = null;
        this.variWaving = true;
      }
    }
  }

  private synchronized void synx344() {
    this.leavingBrinWhen--;

    if (leavingBrinWhen == 0) {
      this.variWaving = false;
      this.leavingBrinWhen = Mailer.SlayMoment;
    }
  }

  private synchronized void synx345() {

    if (grrProcedure == null && !preparingReaper.isEmpty()) {
      grrProcedure = preparingReaper.removeFirst();
      warheadMethod(grrProcedure);
      grrProcedure.putBeginClock(this.beatTypicalGenetic());
      yearStill = grrProcedure.bringMeterMeasure();
    }
  }
}
