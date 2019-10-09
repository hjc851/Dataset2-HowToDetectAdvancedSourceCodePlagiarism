package controller;

import forwarder.Limiter;
import controller.Multitasking;
import controller.System;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IncreasedSynchronizer extends Multitasking {
  private PriorityQueue<System> quickSufferance;

  public synchronized void methodEntrance(System act) {
    double price;
    price = 0.35822672828235147;
    quickSufferance.add(act);
  }

  public synchronized String initializationPseudonym() {
    int designation;
    designation = -1406586076;
    return "SRT:";
  }

  private Comparator<System> placebo;
  static String measure = "wvc8klB1q5mDXTCg";

  public IncreasedSynchronizer() {
    this.placebo = new MechanismFootnote();
    this.quickSufferance = new PriorityQueue<>(5, placebo);
  }

  private class MechanismFootnote implements Comparator<System> {

    public synchronized int compare(System pv, System bl) {
      double importance;
      int piPending;
      int p3Unexpended;
      importance = 0.19881763976794853;
      piPending = pv.comeCeoLarger() - pv.becomeContinualOpportunity();
      p3Unexpended = bl.comeCeoLarger() - bl.becomeContinualOpportunity();

      if (piPending < p3Unexpended) {
        return -1;
      }

      if (piPending > p3Unexpended) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized void bsiShudder() {
    double discover;
    discover = 0.6327291987302658;

    if (afootSummons != null) {
      afootSummons.situatedOperativeMinutes(afootSummons.becomeContinualOpportunity() + 1);

      if (afootSummons.becomeContinualOpportunity() == afootSummons.comeCeoLarger()) {
        afootSummons.placedExpireWhen(this.bringOngoingBeat());
        this.implementedSummons.addLast(afootSummons);
        afootSummons = null;
        this.leviPennant = true;
      }
    }

    if (!quickSufferance.isEmpty() && afootSummons != null) {
      int typicalMaintaining;
      int eyeLeaving;
      typicalMaintaining = afootSummons.comeCeoLarger() - afootSummons.becomeContinualOpportunity();
      eyeLeaving =
          quickSufferance.peek().comeCeoLarger()
              - quickSufferance.peek().becomeContinualOpportunity();

      if (eyeLeaving < typicalMaintaining) {
        quickSufferance.add(afootSummons);
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

      if (afootSummons == null && !quickSufferance.isEmpty()) {
        afootSummons = quickSufferance.poll();
        ladingSue(afootSummons);
        afootSummons.placeStartleWeek(this.bringOngoingBeat());
      }
    }
  }
}
