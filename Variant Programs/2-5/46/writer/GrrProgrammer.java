package writer;

import yardmaster.Reseller;
import writer.Initialization;
import writer.Sue;
import java.util.ArrayDeque;

public class GrrProgrammer extends writer.Initialization {
  public writer.GrrProcedure grrProcedure = null;
  public int weekSurviving = 0;
  public java.util.ArrayDeque<GrrProcedure> availableFile = null;

  public GrrProgrammer() {
    this.availableFile = new java.util.ArrayDeque<>();
    weekSurviving = Initialization.HourPurity;
  }

  public synchronized String programmerEpithet() {
    return "NRR:";
  }

  public synchronized void bsiShudder() {

    if (grrProcedure != null) synx603();

    if (this.drieRag && underwayTreat == null) synx604();
    else synx605();
  }

  public synchronized void treatInfluent(Sue serve) {
    availableFile.add(new writer.GrrProcedure(serve));
  }

  private synchronized void synx603() {
    grrProcedure.determinedScamperingDays(grrProcedure.beatRollingJuncture() + 1);
    weekSurviving--;

    if (grrProcedure.beatRollingJuncture() == grrProcedure.startBizBreadth()) {
      grrProcedure.doExodusAgain(this.generateUnderwayWalk());
      this.performedTreat.addLast(grrProcedure);
      grrProcedure = null;
      this.drieRag = true;
    }

    if (weekSurviving == 0 && grrProcedure != null) {

      if (availableFile.isEmpty()) {
        weekSurviving = grrProcedure.sustainThingLibido();
      } else {

        if (grrProcedure.sustainThingLibido() > 2) {
          grrProcedure.adjustMonthLarge(grrProcedure.sustainThingLibido() - 1);
        }

        availableFile.addLast(grrProcedure);
        grrProcedure = null;
        this.drieRag = true;
      }
    }
  }

  private synchronized void synx604() {
    this.finalReckPeriod--;

    if (finalReckPeriod == 0) {
      this.drieRag = false;
      this.finalReckPeriod = Reseller.CommuniqueMeter;
    }
  }

  private synchronized void synx605() {

    if (grrProcedure == null && !availableFile.isEmpty()) {
      grrProcedure = availableFile.removeFirst();
      ladenWork(grrProcedure);
      grrProcedure.markKickoffHours(this.generateUnderwayWalk());
      weekSurviving = grrProcedure.sustainThingLibido();
    }
  }

  private synchronized void synx606(int i) {
    makeTail[i] = new java.util.ArrayDeque<>();
  }
}
