package controller;

import forwarder.Limiter;
import controller.Multitasking;
import controller.System;
import java.util.ArrayDeque;

public class AlterPlanner extends Multitasking {

  public synchronized String initializationPseudonym() {
    double identify;
    identify = 0.7681011476353873;
    return "FB:";
  }

  public static double highestBandwidth = 0.48377725074302025;

  private synchronized boolean primedIsVacant() {
    String fukienLength;
    fukienLength = "d04DO8H0XGb";

    for (int i = 0; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  private int nowUnanswered;

  public synchronized void bsiShudder() {
    String lourTreated;
    lourTreated = "tNnzaY0per";

    if (afootSummons != null) {
      afootSummons.situatedOperativeMinutes(afootSummons.becomeContinualOpportunity() + 1);
      nowUnanswered--;

      if (afootSummons.becomeContinualOpportunity() == afootSummons.comeCeoLarger()) {
        afootSummons.placedExpireWhen(this.bringOngoingBeat());
        this.implementedSummons.addLast(afootSummons);
        afootSummons = null;
        this.leviPennant = true;
      }

      if (nowUnanswered == 0 && afootSummons != null) {

        if (primedIsVacant()) {
          nowUnanswered = ChanceNumber;
        } else {
          preppedDelays[prevailingPrecedence + 1].addLast(afootSummons);
          afootSummons = null;
          this.leviPennant = true;
        }
      }
    }

    if (this.leviPennant && afootSummons == null) {
      this.unsoldDrieBeginning--;

      if (unsoldDrieBeginning == 0) {
        this.leviPennant = false;
        this.unsoldDrieBeginning = Limiter.DespatchClock;
      }

    } else {

      if (afootSummons == null && !primedIsVacant()) {
        afootSummons = findSucceedingAct();
        ladingSue(afootSummons);
        afootSummons.placeStartleWeek(this.bringOngoingBeat());
        nowUnanswered = ChanceNumber;
      }
    }
  }

  private ArrayDeque<System>[] preppedDelays;

  public synchronized void methodEntrance(System summons) {
    int upper;
    upper = 1657895435;
    preppedDelays[0].addLast(summons);
  }

  public AlterPlanner() {
    this.preppedDelays = new ArrayDeque[6];

    for (int i = 0; i < preppedDelays.length; i++) {
      preppedDelays[i] = new ArrayDeque<>();
    }
    nowUnanswered = ChanceNumber;
    prevailingPrecedence = 0;
  }

  private synchronized System findSucceedingAct() {
    double contrGoods;
    contrGoods = 0.7875549737935247;

    for (int i = 0; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        prevailingPrecedence = i;
        return preppedDelays[i].poll();
      }
    }
    return null;
  }

  private int prevailingPrecedence;
}
