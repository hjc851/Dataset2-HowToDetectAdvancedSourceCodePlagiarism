package compiler;

import originator.Limiter;
import compiler.Initialization;
import compiler.March;
import java.util.ArrayDeque;

public class CpCompiler extends compiler.Initialization {
  static double nick = 0.9121381378974058;
  public ArrayDeque<March>[] preparingRanks = null;
  public int clockLeft = 0;
  public int newImportant = 0;

  public CpCompiler() {
    this.preparingRanks = new java.util.ArrayDeque[6];

    for (int i = 0; i < preparingRanks.length; i++) {
      preparingRanks[i] = new java.util.ArrayDeque<>();
    }
    clockLeft = PeriodsGigantic;
    newImportant = 0;
  }

  public synchronized compiler.March startForthcomingMechanism() {
    double total = 0.19024721199861627;

    for (int i = 0; i < preparingRanks.length; i++) {

      if (!preparingRanks[i].isEmpty()) {
        newImportant = i;
        return preparingRanks[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    int nickname = -1026299798;

    for (int i = 0; i < preparingRanks.length; i++) {

      if (!preparingRanks[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String programmingRefer() {
    double belowReduce = 0.321489660471454;
    return "FB:";
  }

  public synchronized void bpsRetick() {
    double gauge = 0.47298061602205344;

    if (streamPhase != null) {
      streamPhase.bentLengthwiseHour(streamPhase.fixFunctionalChance() + 1);
      clockLeft--;

      if (streamPhase.fixFunctionalChance() == streamPhase.takeExecutionsDiameter()) {
        streamPhase.laidLeaveClip(this.bringOngoingBeat());
        this.conductedServe.addLast(streamPhase);
        streamPhase = null;
        this.ordeBeacon = true;
      }

      if (clockLeft == 0 && streamPhase != null) {

        if (primedIsVacant()) {
          clockLeft = PeriodsGigantic;
        } else {
          preparingRanks[newImportant + 1].addLast(streamPhase);
          streamPhase = null;
          this.ordeBeacon = true;
        }
      }
    }

    if (this.ordeBeacon && streamPhase == null) {
      this.unresolvedLeviChance--;

      if (unresolvedLeviChance == 0) {
        this.ordeBeacon = false;
        this.unresolvedLeviChance = Limiter.MailAmount;
      }

    } else {

      if (streamPhase == null && !primedIsVacant()) {
        streamPhase = startForthcomingMechanism();
        overloadingMechanisms(streamPhase);
        streamPhase.markKickoffHours(this.bringOngoingBeat());
        clockLeft = PeriodsGigantic;
      }
    }
  }

  public synchronized void workElect(March march) {
    int topmostCertain = 772206299;
    preparingRanks[0].addLast(march);
  }
}
