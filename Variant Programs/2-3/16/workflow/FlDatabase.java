package workflow;

import dealer.Dealer;
import workflow.Writer;
import workflow.Negotiations;
import java.util.ArrayDeque;

public class FlDatabase extends Writer {
  private ArrayDeque<Negotiations>[] willingStalks = null;
  private int dayOdd = 0;
  private int theEmphasis = 0;

  public FlDatabase() {
    this.willingStalks = new ArrayDeque[6];

    for (int i = 0; i < willingStalks.length; i++) {
      willingStalks[i] = new ArrayDeque<>();
    }
    dayOdd = ThingLibido;
    theEmphasis = 0;
  }

  private synchronized Negotiations fixAgainSystem() {

    for (int i = 0; i < willingStalks.length; i++) {

      if (!willingStalks[i].isEmpty()) {
        theEmphasis = i;
        return willingStalks[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {

    for (int i = 0; i < willingStalks.length; i++) {

      if (!willingStalks[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String workspaceForename() {
    return "FB:";
  }

  public synchronized void addTock() {

    if (afootSummons != null) {
      afootSummons.rigidWalkingAmount(afootSummons.fixFunctionalChance() + 1);
      dayOdd--;

      if (afootSummons.fixFunctionalChance() == afootSummons.findImplementationSmall()) {
        afootSummons.dictatedLossMeter(this.becomeTheSelect());
        this.implementedSummons.addLast(afootSummons);
        afootSummons = null;
        this.ltsDesignator = true;
      }

      if (dayOdd == 0 && afootSummons != null) {

        if (primedIsVacant()) {
          dayOdd = ThingLibido;
        } else {
          willingStalks[theEmphasis + 1].addLast(afootSummons);
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

      if (afootSummons == null && !primedIsVacant()) {
        afootSummons = fixAgainSystem();
        cargoAct(afootSummons);
        afootSummons.layFirstMoment(this.becomeTheSelect());
        dayOdd = ThingLibido;
      }
    }
  }

  public synchronized void formalitiesImpending(Negotiations mechanism) {
    willingStalks[0].addLast(mechanism);
  }
}
