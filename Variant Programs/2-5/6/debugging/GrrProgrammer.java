package debugging;

import device.Plenum;
import debugging.Spooler;
import debugging.Phase;
import java.util.ArrayDeque;

public class GrrProgrammer extends debugging.Spooler {
  private static final boolean synX738boolean = false;
  private static final int synX737int = 0;
  private static final boolean synX736boolean = true;
  private static final int synX735int = 1;
  private static final int synX734int = 2;
  private static final int synX733int = 0;
  private static final boolean synX732boolean = true;
  private static final int synX731int = 1;
  private static final String synX730String = "3XZ0nO9kL3sBdbl";
  private static final int synX729int = -975926459;
  private static final String synX728String = "NRR:";
  private static final int synX727int = 2022725162;
  static final String positionFoods = "Uf1gGg9Zr9mcx";
  public java.util.ArrayDeque<GrrProcedure> fitBacklog = null;
  public int chanceUnresolved = 0;
  public debugging.GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.fitBacklog = (new java.util.ArrayDeque<>());
    chanceUnresolved = (Spooler.HourPurity);
  }

  public synchronized String synchronizerDescribe() {
    int border = synX727int;
    return synX728String;
  }

  public synchronized void weapMark() {
    int confine = synX729int;

    if (grrProcedure != null) synx63();

    if (this.ordeBeacon && streamPhase == null) synx64();
    else synx65();
  }

  public synchronized void systemInpouring(Phase appendage) {
    String importance = synX730String;
    fitBacklog.add(new debugging.GrrProcedure(appendage));
  }

  private synchronized void synx63() {
    grrProcedure.putMovingClock(grrProcedure.haveSpoutingPeriods() + synX731int);
    chanceUnresolved--;

    if (grrProcedure.haveSpoutingPeriods() == grrProcedure.obtainTimeoutLength()) {
      grrProcedure.putDepartureClock(this.takeTopicalMark());
      this.undertakenMarch.addLast(grrProcedure);
      grrProcedure = (null);
      this.ordeBeacon = (synX732boolean);
    }

    if (chanceUnresolved == synX733int && grrProcedure != null) {

      if (fitBacklog.isEmpty()) {
        chanceUnresolved = (grrProcedure.comeClipQuantity());
      } else {

        if (grrProcedure.comeClipQuantity() > synX734int) {
          grrProcedure.placeWeekVolume(grrProcedure.comeClipQuantity() - synX735int);
        }

        fitBacklog.addLast(grrProcedure);
        grrProcedure = (null);
        this.ordeBeacon = (synX736boolean);
      }
    }
  }

  private synchronized void synx64() {
    this.pendingWhinAgain--;

    if (pendingWhinAgain == synX737int) {
      this.ordeBeacon = (synX738boolean);
      this.pendingWhinAgain = (Plenum.CommuniqueMeter);
    }
  }

  private synchronized void synx65() {

    if (grrProcedure == null && !fitBacklog.isEmpty()) {
      grrProcedure = (fitBacklog.removeFirst());
      capacityMechanism(grrProcedure);
      grrProcedure.rigidOpeningAmount(this.takeTopicalMark());
      chanceUnresolved = (grrProcedure.comeClipQuantity());
    }
  }

  private synchronized void synx66(int i) {
    ableThrongs[i] = (new java.util.ArrayDeque<>());
  }
}
