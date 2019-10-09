package planner;

import mailer.Limiter;
import planner.Database;
import planner.Litigate;
import java.util.ArrayDeque;

public class GrrProgrammer extends Database {
  public ArrayDeque<GrrProcedure> availableFile;
  public int meterLeftover;
  public GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.availableFile = new ArrayDeque<>();
    meterLeftover = Database.JunctureTremendous;
  }

  public synchronized String workspaceForename() {
    return "NRR:";
  }

  public synchronized void ourTicktack() {

    if (grrProcedure != null) synx303();

    if (this.burberryTire && contemporaryLitigate == null) synx304();
    else synx305();
  }

  public synchronized void sueNext(Litigate serve) {
    availableFile.add(new GrrProcedure(serve));
  }

  private synchronized void synx303() {
    grrProcedure.laidWorkingClip(grrProcedure.becomeContinualOpportunity() + 1);
    meterLeftover--;

    if (grrProcedure.becomeContinualOpportunity() == grrProcedure.goExecutiveHeight()) {
      grrProcedure.readyOutletDay(this.haveCirculatingShudder());
      this.achievedMechanisms.addLast(grrProcedure);
      grrProcedure = null;
      this.burberryTire = true;
    }

    if (meterLeftover == 0 && grrProcedure != null) {

      if (availableFile.isEmpty()) {
        meterLeftover = grrProcedure.fetchBeginningMammoth();
      } else {

        if (grrProcedure.fetchBeginningMammoth() > 2) {
          grrProcedure.arrangeYearsSize(grrProcedure.fetchBeginningMammoth() - 1);
        }

        availableFile.addLast(grrProcedure);
        grrProcedure = null;
        this.burberryTire = true;
      }
    }
  }

  private synchronized void synx304() {
    this.latterSthMinutes--;

    if (latterSthMinutes == 0) {
      this.burberryTire = false;
      this.latterSthMinutes = Limiter.DischargeDays;
    }
  }

  private synchronized void synx305() {

    if (grrProcedure == null && !availableFile.isEmpty()) {
      grrProcedure = availableFile.removeFirst();
      overloadMethodology(grrProcedure);
      grrProcedure.determinedInitiateDays(this.haveCirculatingShudder());
      meterLeftover = grrProcedure.fetchBeginningMammoth();
    }
  }

  private synchronized void synx306(int i) {
    preparesTrollies[i] = new ArrayDeque<>();
  }
}
