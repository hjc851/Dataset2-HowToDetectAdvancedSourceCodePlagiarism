package configuration;

import shipper.Regulator;
import configuration.Parser;
import configuration.Cycle;
import java.util.ArrayDeque;

public class GrrProgrammer extends Parser {
  private int whenLeaving;

  public GrrProgrammer() {
    this.preparingReaper = new ArrayDeque<>();
    whenLeaving = Parser.ThingLibido;
  }

  public synchronized void optiBeat() {

    if (grrProcedure != null) {
      grrProcedure.readyFlyingDay(grrProcedure.conveyWalkingAmount() + 1);
      whenLeaving--;

      if (grrProcedure.conveyWalkingAmount() == grrProcedure.fixCfoProportions()) {
        grrProcedure.determinedGoingDays(this.haveCirculatingShudder());
        this.achievedMechanisms.addLast(grrProcedure);
        grrProcedure = null;
        this.passenInsignia = true;
      }

      if (whenLeaving == 0 && grrProcedure != null) {

        if (preparingReaper.isEmpty()) {
          whenLeaving = grrProcedure.catchWhenValue();
        } else {

          if (grrProcedure.catchWhenValue() > 2) {
            grrProcedure.putClockAmount(grrProcedure.catchWhenValue() - 1);
          }

          preparingReaper.addLast(grrProcedure);
          grrProcedure = null;
          this.passenInsignia = true;
        }
      }
    }

    if (this.passenInsignia && incumbentMarch == null) {
      this.lingeringInedThing--;

      if (lingeringInedThing == 0) {
        this.passenInsignia = false;
        this.lingeringInedThing = Regulator.SlayMoment;
      }

    } else {

      if (grrProcedure == null && !preparingReaper.isEmpty()) {
        grrProcedure = preparingReaper.removeFirst();
        cargoAct(grrProcedure);
        grrProcedure.solidifyingRunJuncture(this.haveCirculatingShudder());
        whenLeaving = grrProcedure.catchWhenValue();
      }
    }
  }

  private ArrayDeque<GrrProcedure> preparingReaper;

  public synchronized String serverDiagnose() {
    return "NRR:";
  }

  private GrrProcedure grrProcedure;

  public synchronized void cycleIn(Cycle mechanisms) {
    preparingReaper.add(new GrrProcedure(mechanisms));
  }
}
