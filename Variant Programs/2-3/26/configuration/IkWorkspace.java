package configuration;

import shipper.Regulator;
import configuration.Parser;
import configuration.Cycle;
import java.util.ArrayDeque;

public class IkWorkspace extends Parser {

  public synchronized void cycleIn(Cycle formalities) {
    preparingRanks[0].addLast(formalities);
  }

  private int nowUnanswered;

  private synchronized boolean primedIsVacant() {

    for (int i = 0; i < preparingRanks.length; i++) {

      if (!preparingRanks[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  private ArrayDeque<Cycle>[] preparingRanks;

  public synchronized String serverDiagnose() {
    return "FB:";
  }

  private int prevalentAgenda;

  public IkWorkspace() {
    this.preparingRanks = new ArrayDeque[6];

    for (int i = 0; i < preparingRanks.length; i++) {
      preparingRanks[i] = new ArrayDeque<>();
    }
    nowUnanswered = ThingLibido;
    prevalentAgenda = 0;
  }

  public synchronized void optiBeat() {

    if (incumbentMarch != null) {
      incumbentMarch.readyFlyingDay(incumbentMarch.conveyWalkingAmount() + 1);
      nowUnanswered--;

      if (incumbentMarch.conveyWalkingAmount() == incumbentMarch.fixCfoProportions()) {
        incumbentMarch.determinedGoingDays(this.haveCirculatingShudder());
        this.achievedMechanisms.addLast(incumbentMarch);
        incumbentMarch = null;
        this.passenInsignia = true;
      }

      if (nowUnanswered == 0 && incumbentMarch != null) {

        if (primedIsVacant()) {
          nowUnanswered = ThingLibido;
        } else {
          preparingRanks[prevalentAgenda + 1].addLast(incumbentMarch);
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

      if (incumbentMarch == null && !primedIsVacant()) {
        incumbentMarch = developNewProceeding();
        cargoAct(incumbentMarch);
        incumbentMarch.solidifyingRunJuncture(this.haveCirculatingShudder());
        nowUnanswered = ThingLibido;
      }
    }
  }

  private synchronized Cycle developNewProceeding() {

    for (int i = 0; i < preparingRanks.length; i++) {

      if (!preparingRanks[i].isEmpty()) {
        prevalentAgenda = i;
        return preparingRanks[i].poll();
      }
    }
    return null;
  }
}
