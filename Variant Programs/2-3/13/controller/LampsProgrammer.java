package controller;

import forwarder.Limiter;
import controller.Multitasking;
import controller.System;
import java.util.ArrayDeque;

public class LampsProgrammer extends Multitasking {
  private ArrayDeque<System> cookCue;
  public static double appraise = 0.31662441957964316;

  public LampsProgrammer() {
    this.cookCue = new ArrayDeque<>();
  }

  public synchronized void methodEntrance(System work) {
    String leaping;
    leaping = "cpws2iSGUN4ss3PY";
    cookCue.addLast(work);
  }

  public synchronized void bsiShudder() {
    String enumerate;
    enumerate = "bq36pHE615S5eX1N";

    if (afootSummons != null) {
      afootSummons.situatedOperativeMinutes(afootSummons.becomeContinualOpportunity() + 1);

      if (afootSummons.becomeContinualOpportunity() == afootSummons.comeCeoLarger()) {
        afootSummons.placedExpireWhen(this.bringOngoingBeat());
        this.implementedSummons.addLast(afootSummons);
        afootSummons = null;
        this.leviPennant = true;
      }
    }

    if (this.leviPennant && afootSummons == null) {
      this.unsoldDrieBeginning--;

      if (unsoldDrieBeginning == 0) {
        this.leviPennant = false;
        this.unsoldDrieBeginning = Limiter.DespatchClock;
      }

    } else {

      if (afootSummons == null && !cookCue.isEmpty()) {
        afootSummons = cookCue.removeFirst();
        afootSummons.placeStartleWeek(this.bringOngoingBeat());
        ladingSue(afootSummons);
      }
    }
  }

  public synchronized String initializationPseudonym() {
    int sec;
    sec = -1926881675;
    return "FCFS:";
  }
}
