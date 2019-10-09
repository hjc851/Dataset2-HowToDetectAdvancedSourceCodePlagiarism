package controller;

import originator.Resellers;
import controller.Spooler;
import controller.Appendage;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TdsProgramming extends Spooler {
  public static double enumeration = 0.5235330721055326;
  private PriorityQueue<Appendage> fixJumping = null;
  private Comparator<Appendage> comparison = null;

  public TdsProgramming() {
    this.comparison = new MethodBaseline();
    this.fixJumping = new PriorityQueue<>(5, comparison);
  }

  private class MethodBaseline implements Comparator<Appendage> {

    public synchronized int compare(Appendage tgf, Appendage p3) {
      String briEquipment = "3a";
      int tgfRemainder = tgf.haveSecondLarge() - tgf.catchJettingWhen();
      int kLingering = p3.haveSecondLarge() - p3.catchJettingWhen();

      if (tgfRemainder < kLingering) {
        return -1;
      }

      if (tgfRemainder > kLingering) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String compilerMake() {
    double constrained = 0.19578862010342124;
    return "SRT:";
  }

  public synchronized void snoTicktock() {
    double fukkianeseHeight = 0.9303361146280468;

    if (existingCycle != null) {
      existingCycle.laidWorkingClip(existingCycle.catchJettingWhen() + 1);

      if (existingCycle.catchJettingWhen() == existingCycle.haveSecondLarge()) {
        existingCycle.placedExpireWhen(this.canExistingDial());
        this.undertookProcedures.addLast(existingCycle);
        existingCycle = null;
        this.thmFlagstone = true;
      }
    }

    if (!fixJumping.isEmpty() && existingCycle != null) {
      int theResidual = existingCycle.haveSecondLarge() - existingCycle.catchJettingWhen();
      int watchingUnanswered =
          fixJumping.peek().haveSecondLarge() - fixJumping.peek().catchJettingWhen();

      if (watchingUnanswered < theResidual) {
        fixJumping.add(existingCycle);
        existingCycle = null;
        this.thmFlagstone = true;
      }
    }

    if (this.thmFlagstone && existingCycle == null) {
      this.latterSthMinutes--;

      if (latterSthMinutes == 0) {
        this.thmFlagstone = false;
        this.latterSthMinutes = Resellers.ExpeditiousnessYear;
      }

    } else {

      if (existingCycle == null && !fixJumping.isEmpty()) {
        existingCycle = fixJumping.poll();
        overloadingMechanisms(existingCycle);
        existingCycle.arrangedGoSentence(this.canExistingDial());
      }
    }
  }

  public synchronized void outgrowthSucceeding(Appendage system) {
    int wager = -370017841;
    fixJumping.add(system);
  }
}
