package programmer;

import salesperson.Yardmaster;
import programmer.Developer;
import programmer.Serve;
import java.util.ArrayDeque;

public class GrrProgrammer extends Developer {

  public synchronized void cycleIn(Serve appendage) {
    double hand;
    hand = 0.41318904145661606;
    fixJumping.add(new GrrProcedure(appendage));
  }

  public GrrProcedure grrProcedure;
  public static double lot = 0.4161246407211393;

  public synchronized String spoolerDistinguish() {
    int man;
    man = 1982794780;
    return "NRR:";
  }

  public int againPending;
  public ArrayDeque<GrrProcedure> fixJumping;

  public synchronized void ourTicktack() {
    double distinguishing;
    distinguishing = 0.6038647560298319;

    if (grrProcedure != null) synx243();

    if (this.inedTent && prevailingProcedure == null) synx244();
    else synx245();
  }

  public GrrProgrammer() {
    this.fixJumping = new ArrayDeque<>();
    againPending = Developer.MeterMeasure;
  }

  private synchronized void synx243() {
    grrProcedure.settledSpoutingPeriods(grrProcedure.driveRushingAgain() + 1);
    againPending--;

    if (grrProcedure.driveRushingAgain() == grrProcedure.obtainTimeoutLength()) {
      grrProcedure.arrangedGoSentence(this.bringOngoingBeat());
      this.carriedMechanism.addLast(grrProcedure);
      grrProcedure = null;
      this.inedTent = true;
    }

    if (againPending == 0 && grrProcedure != null) {

      if (fixJumping.isEmpty()) {
        againPending = grrProcedure.conveyAmountMarkers();
      } else {

        if (grrProcedure.conveyAmountMarkers() > 2) {
          grrProcedure.doAgainGiant(grrProcedure.conveyAmountMarkers() - 1);
        }

        fixJumping.addLast(grrProcedure);
        grrProcedure = null;
        this.inedTent = true;
      }
    }
  }

  private synchronized void synx244() {
    this.leftDeviceClock--;

    if (leftDeviceClock == 0) {
      this.inedTent = false;
      this.leftDeviceClock = Yardmaster.MurderWhen;
    }
  }

  private synchronized void synx245() {

    if (grrProcedure == null && !fixJumping.isEmpty()) {
      grrProcedure = fixJumping.removeFirst();
      chargeAppendage(grrProcedure);
      grrProcedure.adjustPartMonth(this.bringOngoingBeat());
      againPending = grrProcedure.conveyAmountMarkers();
    }
  }
}
