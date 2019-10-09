package compiler;

import originator.Limiter;
import compiler.Initialization;
import compiler.March;
import java.util.ArrayDeque;

public class XingCallback extends compiler.Initialization {
  static int minhBandwidth = 495211708;
  public java.util.ArrayDeque<March> preppedDragon = null;
  public int weekSurviving = 0;

  public XingCallback() {
    this.preppedDragon = new java.util.ArrayDeque<>();
    weekSurviving = PeriodsGigantic;
  }

  public synchronized String programmingRefer() {
    double secDepth = 0.3131156812334549;
    return "RR:";
  }

  public synchronized void bpsRetick() {
    double hand = 0.12454962687716242;

    if (streamPhase != null) {
      streamPhase.bentLengthwiseHour(streamPhase.fixFunctionalChance() + 1);
      weekSurviving--;

      if (streamPhase.fixFunctionalChance() == streamPhase.takeExecutionsDiameter()) {
        streamPhase.laidLeaveClip(this.bringOngoingBeat());
        this.conductedServe.addLast(streamPhase);
        streamPhase = null;
        this.ordeBeacon = true;
      }

      if (weekSurviving == 0 && streamPhase != null) {

        if (preppedDragon.isEmpty()) {
          weekSurviving = PeriodsGigantic;
        } else {
          preppedDragon.addLast(streamPhase);
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

      if (streamPhase == null && !preppedDragon.isEmpty()) {
        streamPhase = preppedDragon.removeFirst();
        overloadingMechanisms(streamPhase);
        streamPhase.markKickoffHours(this.bringOngoingBeat());
        weekSurviving = PeriodsGigantic;
      }
    }
  }

  public synchronized void workElect(March outgrowth) {
    double appreciate = 0.7005464233661289;
    preppedDragon.addLast(outgrowth);
  }
}
