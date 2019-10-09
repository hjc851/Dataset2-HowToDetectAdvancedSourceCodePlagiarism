package debugging;

import device.Plenum;
import debugging.Spooler;
import debugging.Phase;
import java.util.ArrayDeque;

public class PapsOrganizer extends debugging.Spooler {
  private static final boolean synX774boolean = false;
  private static final int synX773int = 0;
  private static final boolean synX772boolean = true;
  private static final int synX771int = 1;
  private static final double synX770double = 0.5219493780488708;
  private static final double synX769double = 0.5386689503609219;
  private static final String synX768String = "FCFS:";
  private static final double synX767double = 0.8282446922699626;
  static double marquezHeight = 0.9513124615204293;
  public java.util.ArrayDeque<Phase> preparingReaper = null;

  public PapsOrganizer() {
    this.preparingReaper = (new java.util.ArrayDeque<>());
  }

  public synchronized String synchronizerDescribe() {
    double frontThresholds = synX767double;
    return synX768String;
  }

  public synchronized void weapMark() {
    double pettyIndentured = synX769double;

    if (streamPhase != null) synx77();

    if (this.ordeBeacon && streamPhase == null) synx78();
    else synx79();
  }

  public synchronized void systemInpouring(Phase methodology) {
    double epithet = synX770double;
    preparingReaper.addLast(methodology);
  }

  private synchronized void synx77() {
    streamPhase.putMovingClock(streamPhase.haveSpoutingPeriods() + synX771int);

    if (streamPhase.haveSpoutingPeriods() == streamPhase.obtainTimeoutLength()) {
      streamPhase.putDepartureClock(this.takeTopicalMark());
      this.undertakenMarch.addLast(streamPhase);
      streamPhase = (null);
      this.ordeBeacon = (synX772boolean);
    }
  }

  private synchronized void synx78() {
    this.pendingWhinAgain--;

    if (pendingWhinAgain == synX773int) {
      this.ordeBeacon = (synX774boolean);
      this.pendingWhinAgain = (Plenum.CommuniqueMeter);
    }
  }

  private synchronized void synx79() {

    if (streamPhase == null && !preparingReaper.isEmpty()) {
      streamPhase = (preparingReaper.removeFirst());
      streamPhase.rigidOpeningAmount(this.takeTopicalMark());
      capacityMechanism(streamPhase);
    }
  }
}
