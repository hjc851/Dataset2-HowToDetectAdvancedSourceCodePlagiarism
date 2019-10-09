package configuration;

import shipper.Regulator;
import configuration.Parser;
import configuration.Cycle;
import java.util.ArrayDeque;

public class DegeneratesDeveloper extends Parser {

  public synchronized void cycleIn(Cycle treat) {
    eagerJunk.addLast(treat);
  }

  public synchronized String serverDiagnose() {
    return "FCFS:";
  }

  public DegeneratesDeveloper() {
    this.eagerJunk = new ArrayDeque<>();
  }

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

    if (this.passenInsignia && incumbentMarch == null) {
      this.lingeringInedThing--;

      if (lingeringInedThing == 0) {
        this.passenInsignia = false;
        this.lingeringInedThing = Regulator.SlayMoment;
      }

    } else {

      if (incumbentMarch == null && !eagerJunk.isEmpty()) {
        incumbentMarch = eagerJunk.removeFirst();
        incumbentMarch.solidifyingRunJuncture(this.haveCirculatingShudder());
        cargoAct(incumbentMarch);
      }
    }
  }

  private ArrayDeque<Cycle> eagerJunk;
}
