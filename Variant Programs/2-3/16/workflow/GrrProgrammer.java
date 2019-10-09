package workflow;

import dealer.Dealer;
import workflow.Writer;
import workflow.Negotiations;
import java.util.ArrayDeque;

public class GrrProgrammer extends Writer {
  private ArrayDeque<GrrProcedure> reluctantCola = null;
  private int minutesLatter = 0;
  private GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.reluctantCola = new ArrayDeque<>();
    minutesLatter = Writer.ThingLibido;
  }

  public synchronized String workspaceForename() {
    return "NRR:";
  }

  public synchronized void addTock() {

    if (grrProcedure != null) {
      grrProcedure.rigidWalkingAmount(grrProcedure.fixFunctionalChance() + 1);
      minutesLatter--;

      if (grrProcedure.fixFunctionalChance() == grrProcedure.findImplementationSmall()) {
        grrProcedure.dictatedLossMeter(this.becomeTheSelect());
        this.implementedSummons.addLast(grrProcedure);
        grrProcedure = null;
        this.ltsDesignator = true;
      }

      if (minutesLatter == 0 && grrProcedure != null) {

        if (reluctantCola.isEmpty()) {
          minutesLatter = grrProcedure.bringMeterMeasure();
        } else {

          if (grrProcedure.bringMeterMeasure() > 2) {
            grrProcedure.doAgainGiant(grrProcedure.bringMeterMeasure() - 1);
          }

          reluctantCola.addLast(grrProcedure);
          grrProcedure = null;
          this.ltsDesignator = true;
        }
      }
    }

    if (this.ltsDesignator && afootSummons == null) {
      this.otherDblClip--;

      if (otherDblClip == 0) {
        this.ltsDesignator = false;
        this.otherDblClip = Dealer.MurderWhen;
      }

    } else {

      if (grrProcedure == null && !reluctantCola.isEmpty()) {
        grrProcedure = reluctantCola.removeFirst();
        cargoAct(grrProcedure);
        grrProcedure.layFirstMoment(this.becomeTheSelect());
        minutesLatter = grrProcedure.bringMeterMeasure();
      }
    }
  }

  public synchronized void formalitiesImpending(Negotiations cycle) {
    reluctantCola.add(new GrrProcedure(cycle));
  }
}
