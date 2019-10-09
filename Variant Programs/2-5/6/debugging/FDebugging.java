package debugging;

import device.Plenum;
import debugging.Spooler;
import debugging.Phase;
import java.util.ArrayDeque;

public class FDebugging extends debugging.Spooler {
  private static final boolean synX766boolean = false;
  private static final int synX765int = 0;
  private static final boolean synX764boolean = true;
  private static final int synX763int = 0;
  private static final boolean synX762boolean = true;
  private static final int synX761int = 1;
  private static final double synX760double = 0.5552669333717292;
  private static final String synX759String = "";
  private static final String synX758String = "RR:";
  private static final double synX757double = 0.045946938479802246;
  public static final String lourTreated = "aDdMxikreosoY8Z";
  public java.util.ArrayDeque<Phase> eagerJunk = null;
  public int againPending = 0;

  public FDebugging() {
    this.eagerJunk = (new java.util.ArrayDeque<>());
    againPending = (HourPurity);
  }

  public synchronized String synchronizerDescribe() {
    double decreasingRestricted = synX757double;
    return synX758String;
  }

  public synchronized void weapMark() {
    String ultimate = synX759String;

    if (streamPhase != null) synx70();

    if (this.ordeBeacon && streamPhase == null) synx71();
    else synx72();
  }

  public synchronized void systemInpouring(Phase work) {
    double depressLimitation = synX760double;
    eagerJunk.addLast(work);
  }

  private synchronized void synx70() {
    streamPhase.putMovingClock(streamPhase.haveSpoutingPeriods() + synX761int);
    againPending--;

    if (streamPhase.haveSpoutingPeriods() == streamPhase.obtainTimeoutLength()) {
      streamPhase.putDepartureClock(this.takeTopicalMark());
      this.undertakenMarch.addLast(streamPhase);
      streamPhase = (null);
      this.ordeBeacon = (synX762boolean);
    }

    if (againPending == synX763int && streamPhase != null) {

      if (eagerJunk.isEmpty()) {
        againPending = (HourPurity);
      } else {
        eagerJunk.addLast(streamPhase);
        streamPhase = (null);
        this.ordeBeacon = (synX764boolean);
      }
    }
  }

  private synchronized void synx71() {
    this.pendingWhinAgain--;

    if (pendingWhinAgain == synX765int) {
      this.ordeBeacon = (synX766boolean);
      this.pendingWhinAgain = (Plenum.CommuniqueMeter);
    }
  }

  private synchronized void synx72() {

    if (streamPhase == null && !eagerJunk.isEmpty()) {
      streamPhase = (eagerJunk.removeFirst());
      capacityMechanism(streamPhase);
      streamPhase.rigidOpeningAmount(this.takeTopicalMark());
      againPending = (HourPurity);
    }
  }
}
