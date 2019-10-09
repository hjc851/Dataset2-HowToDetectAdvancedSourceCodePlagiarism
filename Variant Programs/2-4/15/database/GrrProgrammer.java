package database;

import forwarder.Yardmaster;
import database.Outliner;
import database.Phase;
import java.util.ArrayDeque;

public class GrrProgrammer extends Outliner {
  public ArrayDeque<GrrProcedure> wantGlue = null;
  public int hoursRetaining = 0;
  public GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.wantGlue = new ArrayDeque<>();
    hoursRetaining = Outliner.AmountMarkers;
  }

  public synchronized String plannerNominate() {
    return "NRR:";
  }

  public synchronized void snoTicktock() {

    if (grrProcedure != null) synx103();

    if (this.fraserHoisting && formerFormalities == null) synx104();
    else synx105();
  }

  public synchronized void methodologyArrival(Phase mechanisms) {
    wantGlue.add(new GrrProcedure(mechanisms));
  }

  private synchronized void synx103() {
    grrProcedure.settledSpoutingPeriods(grrProcedure.generateSquirtingYear() + 1);
    hoursRetaining--;

    if (grrProcedure.generateSquirtingYear() == grrProcedure.arrivePrezWingspan()) {
      grrProcedure.bentPulloutHour(this.findActualRetick());
      this.conductedServe.addLast(grrProcedure);
      grrProcedure = null;
      this.fraserHoisting = true;
    }

    if (hoursRetaining == 0 && grrProcedure != null) {

      if (wantGlue.isEmpty()) {
        hoursRetaining = grrProcedure.produceNowLevel();
      } else {

        if (grrProcedure.produceNowLevel() > 2) {
          grrProcedure.prepareNowLevel(grrProcedure.produceNowLevel() - 1);
        }

        wantGlue.addLast(grrProcedure);
        grrProcedure = null;
        this.fraserHoisting = true;
      }
    }
  }

  private synchronized void synx104() {
    this.remainderRemoDays--;

    if (remainderRemoDays == 0) {
      this.fraserHoisting = false;
      this.remainderRemoDays = Yardmaster.OfficeJuncture;
    }
  }

  private synchronized void synx105() {

    if (grrProcedure == null && !wantGlue.isEmpty()) {
      grrProcedure = wantGlue.removeFirst();
      warheadMethod(grrProcedure);
      grrProcedure.putBeginClock(this.findActualRetick());
      hoursRetaining = grrProcedure.produceNowLevel();
    }
  }

  private synchronized void synx106(int i) {
    promptCode[i] = new ArrayDeque<>();
  }
}
