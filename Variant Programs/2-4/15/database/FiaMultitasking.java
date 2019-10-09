package database;

import forwarder.Yardmaster;
import database.Outliner;
import database.Phase;
import java.util.ArrayDeque;

public class FiaMultitasking extends Outliner {
  public ArrayDeque<Phase>[] promptCode = null;
  public int chanceUnresolved = 0;
  public int ongoingAntecedency = 0;

  public FiaMultitasking() {
    this.promptCode = new ArrayDeque[6];

    for (int i = 0; i < promptCode.length; i++) synx106(i);
    chanceUnresolved = AmountMarkers;
    ongoingAntecedency = 0;
  }

  public synchronized Phase produceSecondMethod() {

    for (int i = 0; i < promptCode.length; i++) {

      if (!promptCode[i].isEmpty()) {
        ongoingAntecedency = i;
        return promptCode[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < promptCode.length; i++) {

      if (!promptCode[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String plannerNominate() {
    return "FB:";
  }

  public synchronized void snoTicktock() {

    if (formerFormalities != null) synx107();

    if (this.fraserHoisting && formerFormalities == null) synx108();
    else synx109();
  }

  public synchronized void methodologyArrival(Phase procedures) {
    promptCode[0].addLast(procedures);
  }

  private synchronized void synx107() {
    formerFormalities.settledSpoutingPeriods(formerFormalities.generateSquirtingYear() + 1);
    chanceUnresolved--;

    if (formerFormalities.generateSquirtingYear() == formerFormalities.arrivePrezWingspan()) {
      formerFormalities.bentPulloutHour(this.findActualRetick());
      this.conductedServe.addLast(formerFormalities);
      formerFormalities = null;
      this.fraserHoisting = true;
    }

    if (chanceUnresolved == 0 && formerFormalities != null) {

      if (primedIsVacant()) {
        chanceUnresolved = AmountMarkers;
      } else {
        promptCode[ongoingAntecedency + 1].addLast(formerFormalities);
        formerFormalities = null;
        this.fraserHoisting = true;
      }
    }
  }

  private synchronized void synx108() {
    this.remainderRemoDays--;

    if (remainderRemoDays == 0) {
      this.fraserHoisting = false;
      this.remainderRemoDays = Yardmaster.OfficeJuncture;
    }
  }

  private synchronized void synx109() {

    if (formerFormalities == null && !primedIsVacant()) {
      formerFormalities = produceSecondMethod();
      warheadMethod(formerFormalities);
      formerFormalities.putBeginClock(this.findActualRetick());
      chanceUnresolved = AmountMarkers;
    }
  }
}
