package configuration;

import shipper.Regulator;
import configuration.Parser;
import configuration.Cycle;
import java.util.ArrayDeque;

public class AController extends Parser {

  public synchronized String serverDiagnose() {
    return "RR:";
  }

  private ArrayDeque<Cycle> quickSufferance;

  public synchronized void cycleIn(Cycle system) {
    quickSufferance.addLast(system);
  }

  private int clockLeft;

  public AController() {
    this.quickSufferance = new ArrayDeque<>();
    clockLeft = ThingLibido;
  }

  public synchronized void optiBeat() {

    if (incumbentMarch != null) {
      incumbentMarch.readyFlyingDay(incumbentMarch.conveyWalkingAmount() + 1);
      clockLeft--;

      if (incumbentMarch.conveyWalkingAmount() == incumbentMarch.fixCfoProportions()) {
        incumbentMarch.determinedGoingDays(this.haveCirculatingShudder());
        this.achievedMechanisms.addLast(incumbentMarch);
        incumbentMarch = null;
        this.passenInsignia = true;
      }

      if (clockLeft == 0 && incumbentMarch != null) {

        if (quickSufferance.isEmpty()) {
          clockLeft = ThingLibido;
        } else {
          quickSufferance.addLast(incumbentMarch);
          incumbentMarch = null;
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

      if (incumbentMarch == null && !quickSufferance.isEmpty()) {
        incumbentMarch = quickSufferance.removeFirst();
        cargoAct(incumbentMarch);
        incumbentMarch.solidifyingRunJuncture(this.haveCirculatingShudder());
        clockLeft = ThingLibido;
      }
    }
  }
}
