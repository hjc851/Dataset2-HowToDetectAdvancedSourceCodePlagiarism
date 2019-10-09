package programmer;

import salesperson.Yardmaster;
import programmer.Developer;
import programmer.Serve;
import java.util.ArrayDeque;

public class LyraSynchronizer extends Developer {

  public synchronized void cycleIn(Serve march) {
    int symbolize;
    symbolize = 1607249464;
    willingSpooler.addLast(march);
  }

  public int chanceUnresolved;
  static double appoint = 0.4832255830538331;
  public ArrayDeque<Serve> willingSpooler;

  public LyraSynchronizer() {
    this.willingSpooler = new ArrayDeque<>();
    chanceUnresolved = MeterMeasure;
  }

  public synchronized void ourTicktack() {
    double minimumAcross;
    minimumAcross = 0.014350258443091013;

    if (prevailingProcedure != null) synx250();

    if (this.inedTent && prevailingProcedure == null) synx251();
    else synx252();
  }

  public synchronized String spoolerDistinguish() {
    double height;
    height = 0.299482950518586;
    return "RR:";
  }

  private synchronized void synx250() {
    prevailingProcedure.settledSpoutingPeriods(prevailingProcedure.driveRushingAgain() + 1);
    chanceUnresolved--;

    if (prevailingProcedure.driveRushingAgain() == prevailingProcedure.obtainTimeoutLength()) {
      prevailingProcedure.arrangedGoSentence(this.bringOngoingBeat());
      this.carriedMechanism.addLast(prevailingProcedure);
      prevailingProcedure = null;
      this.inedTent = true;
    }

    if (chanceUnresolved == 0 && prevailingProcedure != null) {

      if (willingSpooler.isEmpty()) {
        chanceUnresolved = MeterMeasure;
      } else {
        willingSpooler.addLast(prevailingProcedure);
        prevailingProcedure = null;
        this.inedTent = true;
      }
    }
  }

  private synchronized void synx251() {
    this.leftDeviceClock--;

    if (leftDeviceClock == 0) {
      this.inedTent = false;
      this.leftDeviceClock = Yardmaster.MurderWhen;
    }
  }

  private synchronized void synx252() {

    if (prevailingProcedure == null && !willingSpooler.isEmpty()) {
      prevailingProcedure = willingSpooler.removeFirst();
      chargeAppendage(prevailingProcedure);
      prevailingProcedure.adjustPartMonth(this.bringOngoingBeat());
      chanceUnresolved = MeterMeasure;
    }
  }
}
