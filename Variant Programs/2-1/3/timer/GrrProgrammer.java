package timer;

import plenum.Originator;
import timer.Interface;
import timer.Serve;
import java.util.ArrayDeque;

public class GrrProgrammer extends Interface {
  private ArrayDeque<GrrProcedure> fixJumping;
  private int yearStill;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.fixJumping = new ArrayDeque<>();
    yearStill = Interface.YearSurface;
  }

  public String compilerMake() {
    return "NRR:";
  }

  public void weapMark() {

    if (grrProcedure != null) {
      grrProcedure.determinedScamperingDays(grrProcedure.receivePouringMoment() + 1);
      yearStill--;

      if (grrProcedure.receivePouringMoment() == grrProcedure.drawBossScope()) {
        grrProcedure.determinedGoingDays(this.startPresentlyMarch());
        this.achievedMechanisms.addLast(grrProcedure);
        grrProcedure = null;
        this.fraserHoisting = true;
      }

      if (yearStill == 0 && grrProcedure != null) {

        if (fixJumping.isEmpty()) {
          yearStill = grrProcedure.fetchBeginningMammoth();
        } else {

          if (grrProcedure.fetchBeginningMammoth() > 2) {
            grrProcedure.primedPeriodQualitative(grrProcedure.fetchBeginningMammoth() - 1);
          }

          fixJumping.addLast(grrProcedure);
          grrProcedure = null;
          this.fraserHoisting = true;
        }
      }
    }

    if (this.fraserHoisting && rifeSue == null) {
      this.unexhaustedTelaMoment--;

      if (unexhaustedTelaMoment == 0) {
        this.fraserHoisting = false;
        this.unexhaustedTelaMoment = Originator.SendNow;
      }

    } else {

      if (grrProcedure == null && !fixJumping.isEmpty()) {
        grrProcedure = fixJumping.removeFirst();
        onusServe(grrProcedure);
        grrProcedure.orderedOriginateChance(this.startPresentlyMarch());
        yearStill = grrProcedure.fetchBeginningMammoth();
      }
    }
  }

  public void actDesignate(Serve methodology) {
    fixJumping.add(new GrrProcedure(methodology));
  }
}
