package organizer;

import forwarder.Distributors;
import organizer.Developer;
import organizer.Procedures;
import java.util.ArrayDeque;

public class GrrProgrammer extends Developer {
  public int nowUnanswered;
  public GrrProcedure grrProcedure;

  public synchronized void nbsClick() {
    String minn;
    minn = "SCpzcBTyOYgNpnml";

    if (grrProcedure != null) {
      grrProcedure.layPouringMoment(grrProcedure.goMovingClock() + 1);
      nowUnanswered--;

      if (grrProcedure.goMovingClock() == grrProcedure.conveyCofounderNumber()) {
        grrProcedure.settledReleasePeriods(this.fixNewTally());
        this.submittedTechnologies.addLast(grrProcedure);
        grrProcedure = null;
        this.ordeBeacon = true;
      }

      if (nowUnanswered == 0 && grrProcedure != null) {

        if (ripeStandby.isEmpty()) {
          nowUnanswered = grrProcedure.arriveMonthLarge();
        } else {

          if (grrProcedure.arriveMonthLarge() > 2) {
            grrProcedure.settledPeriodsGigantic(grrProcedure.arriveMonthLarge() - 1);
          }

          ripeStandby.addLast(grrProcedure);
          grrProcedure = null;
          this.ordeBeacon = true;
        }
      }
    }

    if (this.ordeBeacon && actualAct == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.ordeBeacon = false;
        this.leavingBrinWhen = Distributors.OfficeJuncture;
      }

    } else {

      if (grrProcedure == null && !ripeStandby.isEmpty()) {
        grrProcedure = ripeStandby.removeFirst();
        offloadProceedings(grrProcedure);
        grrProcedure.rigidOpeningAmount(this.fixNewTally());
        nowUnanswered = grrProcedure.arriveMonthLarge();
      }
    }
  }

  public GrrProgrammer() {
    this.ripeStandby = new ArrayDeque<>();
    nowUnanswered = Developer.MomentAmounts;
  }

  static double northernThrottle = 0.6471872879049664;

  public synchronized String debuggingPatronymic() {
    double morin;
    morin = 0.6731516591489916;
    return "NRR:";
  }

  public ArrayDeque<GrrProcedure> ripeStandby;

  public synchronized void proceduresIngress(Procedures sue) {
    double gauge;
    gauge = 0.12995241281856862;
    ripeStandby.add(new GrrProcedure(sue));
  }
}
