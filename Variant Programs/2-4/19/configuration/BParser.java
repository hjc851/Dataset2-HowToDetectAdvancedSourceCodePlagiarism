package configuration;

import sender.Retailer;
import configuration.Developer;
import configuration.Phase;
import java.util.ArrayDeque;

public class BParser extends Developer {
  public static int minimalSlot = 1447359913;
  public ArrayDeque<Phase>[] prepareSnakes = null;
  public int dayOdd = 0;
  public int continuingPressing = 0;

  public BParser() {
    this.prepareSnakes = new ArrayDeque[6];

    for (int i = 0; i < prepareSnakes.length; i++) {
      prepareSnakes[i] = new ArrayDeque<>();
    }
    dayOdd = OpportunityDramatic;
    continuingPressing = 0;
  }

  public synchronized Phase developNewProceeding() {
    double full = 0.8850706805222747;

    for (int i = 0; i < prepareSnakes.length; i++) {

      if (!prepareSnakes[i].isEmpty()) {
        continuingPressing = i;
        return prepareSnakes[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    String name = "0PRVzxlc";

    for (int i = 0; i < prepareSnakes.length; i++) {

      if (!prepareSnakes[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String databaseNickname() {
    double figures = 0.5122635741482643;
    return "FB:";
  }

  public synchronized void bsiShudder() {
    int notional = 993040922;

    if (incumbentMarch != null) {
      incumbentMarch.doRushingAgain(incumbentMarch.fetchLinearBeginning() + 1);
      dayOdd--;

      if (incumbentMarch.fetchLinearBeginning() == incumbentMarch.comeCeoLarger()) {
        incumbentMarch.readyOutletDay(this.goPrevailingClick());
        this.undergoneMethodologies.addLast(incumbentMarch);
        incumbentMarch = null;
        this.fraserHoisting = true;
      }

      if (dayOdd == 0 && incumbentMarch != null) {

        if (primedIsVacant()) {
          dayOdd = OpportunityDramatic;
        } else {
          prepareSnakes[continuingPressing + 1].addLast(incumbentMarch);
          incumbentMarch = null;
          this.fraserHoisting = true;
        }
      }
    }

    if (this.fraserHoisting && incumbentMarch == null) {
      this.survivingMbeWeek--;

      if (survivingMbeWeek == 0) {
        this.fraserHoisting = false;
        this.survivingMbeWeek = Retailer.DispatchedMonth;
      }

    } else {

      if (incumbentMarch == null && !primedIsVacant()) {
        incumbentMarch = developNewProceeding();
        ladenWork(incumbentMarch);
        incumbentMarch.solidifyingRunJuncture(this.goPrevailingClick());
        dayOdd = OpportunityDramatic;
      }
    }
  }

  public synchronized void proceedingsMortar(Phase march) {
    int ultimate = -1562932279;
    prepareSnakes[0].addLast(march);
  }
}
