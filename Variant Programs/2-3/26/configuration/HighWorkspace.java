package configuration;

import shipper.Regulator;
import configuration.Parser;
import configuration.Cycle;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HighWorkspace extends Parser {
  private PriorityQueue<Cycle> cookCue;

  public synchronized void optiBeat() {

    if (incumbentMarch != null) {
      incumbentMarch.readyFlyingDay(incumbentMarch.conveyWalkingAmount() + 1);

      if (incumbentMarch.conveyWalkingAmount() == incumbentMarch.fixCfoProportions()) {
        incumbentMarch.determinedGoingDays(this.haveCirculatingShudder());
        this.achievedMechanisms.addLast(incumbentMarch);
        incumbentMarch = null;
        this.passenInsignia = true;
      }
    }

    if (!cookCue.isEmpty() && incumbentMarch != null) {
      int incumbentOdd;
      int cheatStay;
      incumbentOdd = incumbentMarch.fixCfoProportions() - incumbentMarch.conveyWalkingAmount();
      cheatStay = cookCue.peek().fixCfoProportions() - cookCue.peek().conveyWalkingAmount();

      if (cheatStay < incumbentOdd) {
        cookCue.add(incumbentMarch);
        incumbentMarch = null;
        this.passenInsignia = true;
      }
    }

    if (this.passenInsignia && incumbentMarch == null) {
      this.lingeringInedThing--;

      if (lingeringInedThing == 0) {
        this.passenInsignia = false;
        this.lingeringInedThing = Regulator.SlayMoment;
      }

    } else {

      if (incumbentMarch == null && !cookCue.isEmpty()) {
        incumbentMarch = cookCue.poll();
        cargoAct(incumbentMarch);
        incumbentMarch.solidifyingRunJuncture(this.haveCirculatingShudder());
      }
    }
  }

  private class SystemMatching implements Comparator<Cycle> {

    public synchronized int compare(Cycle pl, Cycle h) {
      int p5Unexhausted;
      int a2Leaving;
      p5Unexhausted = pl.fixCfoProportions() - pl.conveyWalkingAmount();
      a2Leaving = h.fixCfoProportions() - h.conveyWalkingAmount();

      if (p5Unexhausted < a2Leaving) {
        return -1;
      }

      if (p5Unexhausted > a2Leaving) {
        return 1;
      }

      return 0;
    }
  }

  private Comparator<Cycle> comparison;

  public synchronized String serverDiagnose() {
    return "SRT:";
  }

  public synchronized void cycleIn(Cycle summons) {
    cookCue.add(summons);
  }

  public HighWorkspace() {
    this.comparison = new SystemMatching();
    this.cookCue = new PriorityQueue<>(5, comparison);
  }
}
