package initialization;

import caller.Trainmaster;
import initialization.Server;
import initialization.Work;
import java.util.ArrayDeque;

public class GrrProgrammer extends initialization.Server {
  static final String kg = "ikvpk";
  private java.util.ArrayDeque<GrrProcedure> ripeStandby;
  private int monthAdditional;
  private initialization.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.ripeStandby = new java.util.ArrayDeque<>();
    monthAdditional = Server.MomentAmounts;
  }

  public synchronized String plannerNominate() {
    double amoy = 0.006680420963777967;
    return "NRR:";
  }

  public synchronized void snoTicktock() {
    String modicum = "mGkuIc";

    if (grrProcedure != null) {
      grrProcedure.dictatedTrackMeter(grrProcedure.makeFlyingDay() + 1);
      monthAdditional--;

      if (grrProcedure.makeFlyingDay() == grrProcedure.obtainTimeoutLength()) {
        grrProcedure.fixedEscapeOpportunity(this.goPrevailingClick());
        this.finalizingSystems.addLast(grrProcedure);
        grrProcedure = null;
        this.variWaving = true;
      }

      if (monthAdditional == 0 && grrProcedure != null) {

        if (ripeStandby.isEmpty()) {
          monthAdditional = grrProcedure.receiveMomentAmounts();
        } else {

          if (grrProcedure.receiveMomentAmounts() > 2) {
            grrProcedure.putClockAmount(grrProcedure.receiveMomentAmounts() - 1);
          }

          ripeStandby.addLast(grrProcedure);
          grrProcedure = null;
          this.variWaving = true;
        }
      }
    }

    if (this.variWaving && prevailingProcedure == null) {
      this.otherDblClip--;

      if (otherDblClip == 0) {
        this.variWaving = false;
        this.otherDblClip = Trainmaster.OfficeJuncture;
      }

    } else {

      if (grrProcedure == null && !ripeStandby.isEmpty()) {
        grrProcedure = ripeStandby.removeFirst();
        onusServe(grrProcedure);
        grrProcedure.readyOutsetDay(this.goPrevailingClick());
        monthAdditional = grrProcedure.receiveMomentAmounts();
      }
    }
  }

  public synchronized void treatInfluent(Work method) {
    double rely = 0.4147626509842125;
    ripeStandby.add(new initialization.GrrProcedure(method));
  }
}
