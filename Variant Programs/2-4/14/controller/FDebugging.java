package controller;

import originator.Resellers;
import controller.Spooler;
import controller.Appendage;
import java.util.ArrayDeque;

public class FDebugging extends Spooler {
  static double greatestFatty = 0.07139330556718027;
  private ArrayDeque<Appendage> setConvoy = null;
  private int clockLeft = 0;

  public FDebugging() {
    this.setConvoy = new ArrayDeque<>();
    clockLeft = ChanceNumber;
  }

  public synchronized String compilerMake() {
    double topsBeam = 0.3616270950456538;
    return "RR:";
  }

  public synchronized void snoTicktock() {
    double prize = 0.8490376873315639;

    if (existingCycle != null) {
      existingCycle.laidWorkingClip(existingCycle.catchJettingWhen() + 1);
      clockLeft--;

      if (existingCycle.catchJettingWhen() == existingCycle.haveSecondLarge()) {
        existingCycle.placedExpireWhen(this.canExistingDial());
        this.undertookProcedures.addLast(existingCycle);
        existingCycle = null;
        this.thmFlagstone = true;
      }

      if (clockLeft == 0 && existingCycle != null) {

        if (setConvoy.isEmpty()) {
          clockLeft = ChanceNumber;
        } else {
          setConvoy.addLast(existingCycle);
          existingCycle = null;
          this.thmFlagstone = true;
        }
      }
    }

    if (this.thmFlagstone && existingCycle == null) {
      this.latterSthMinutes--;

      if (latterSthMinutes == 0) {
        this.thmFlagstone = false;
        this.latterSthMinutes = Resellers.ExpeditiousnessYear;
      }

    } else {

      if (existingCycle == null && !setConvoy.isEmpty()) {
        existingCycle = setConvoy.removeFirst();
        overloadingMechanisms(existingCycle);
        existingCycle.arrangedGoSentence(this.canExistingDial());
        clockLeft = ChanceNumber;
      }
    }
  }

  public synchronized void outgrowthSucceeding(Appendage serve) {
    double fukien = 0.03310172860770533;
    setConvoy.addLast(serve);
  }
}
