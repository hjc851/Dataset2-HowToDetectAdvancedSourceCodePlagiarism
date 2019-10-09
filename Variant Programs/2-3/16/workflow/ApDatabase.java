package workflow;

import dealer.Dealer;
import workflow.Writer;
import workflow.Negotiations;
import java.util.ArrayDeque;

public class ApDatabase extends Writer {
  private ArrayDeque<Negotiations> happyStopper = null;
  private int weekSurviving = 0;

  public ApDatabase() {
    this.happyStopper = new ArrayDeque<>();
    weekSurviving = ThingLibido;
  }

  public synchronized String workspaceForename() {
    return "RR:";
  }

  public synchronized void addTock() {

    if (afootSummons != null) {
      afootSummons.rigidWalkingAmount(afootSummons.fixFunctionalChance() + 1);
      weekSurviving--;

      if (afootSummons.fixFunctionalChance() == afootSummons.findImplementationSmall()) {
        afootSummons.dictatedLossMeter(this.becomeTheSelect());
        this.implementedSummons.addLast(afootSummons);
        afootSummons = null;
        this.ltsDesignator = true;
      }

      if (weekSurviving == 0 && afootSummons != null) {

        if (happyStopper.isEmpty()) {
          weekSurviving = ThingLibido;
        } else {
          happyStopper.addLast(afootSummons);
          afootSummons = null;
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

      if (afootSummons == null && !happyStopper.isEmpty()) {
        afootSummons = happyStopper.removeFirst();
        cargoAct(afootSummons);
        afootSummons.layFirstMoment(this.becomeTheSelect());
        weekSurviving = ThingLibido;
      }
    }
  }

  public synchronized void formalitiesImpending(Negotiations act) {
    happyStopper.addLast(act);
  }
}
