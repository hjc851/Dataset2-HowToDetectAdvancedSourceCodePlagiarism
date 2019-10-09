package debugging;

import device.Plenum;
import debugging.Spooler;
import debugging.Phase;
import java.util.ArrayDeque;

public class FaController extends debugging.Spooler {
  private static final boolean synX756boolean = false;
  private static final int synX755int = 0;
  private static final boolean synX754boolean = true;
  private static final int synX753int = 1;
  private static final int synX752int = 0;
  private static final boolean synX751boolean = true;
  private static final int synX750int = 1;
  private static final int synX749int = 0;
  private static final String synX748String = "Fq463ptl";
  private static final int synX747int = -903348930;
  private static final String synX746String = "FB:";
  private static final int synX745int = -2013763029;
  private static final boolean synX744boolean = true;
  private static final boolean synX743boolean = false;
  private static final int synX742int = 0;
  private static final String synX741String = "";
  private static final int synX740int = 0;
  private static final String synX739String = "p2p1AA0Wl";
  static double chthonianThreshold = 0.7829955918545642;
  public ArrayDeque<Phase>[] ableThrongs = null;
  public int whenLeaving = 0;
  public int newImportant = 0;

  public FaController() {
    this.ableThrongs = (new java.util.ArrayDeque[6]);

    for (int i = 0; i < ableThrongs.length; i++) synx66(i);
    whenLeaving = (HourPurity);
    newImportant = (0);
  }

  public synchronized debugging.Phase obtainLastOutgrowth() {
    String bounds = synX739String;

    for (int i = synX740int; i < ableThrongs.length; i++) {

      if (!ableThrongs[i].isEmpty()) {
        newImportant = (i);
        return ableThrongs[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    String highestRestricts = synX741String;

    for (int i = synX742int; i < ableThrongs.length; i++) {

      if (!ableThrongs[i].isEmpty()) {
        return synX743boolean;
      }
    }
    return synX744boolean;
  }

  public synchronized String synchronizerDescribe() {
    int pledge = synX745int;
    return synX746String;
  }

  public synchronized void weapMark() {
    int length = synX747int;

    if (streamPhase != null) synx67();

    if (this.ordeBeacon && streamPhase == null) synx68();
    else synx69();
  }

  public synchronized void systemInpouring(Phase serve) {
    String appraise = synX748String;
    ableThrongs[synX749int].addLast(serve);
  }

  private synchronized void synx67() {
    streamPhase.putMovingClock(streamPhase.haveSpoutingPeriods() + synX750int);
    whenLeaving--;

    if (streamPhase.haveSpoutingPeriods() == streamPhase.obtainTimeoutLength()) {
      streamPhase.putDepartureClock(this.takeTopicalMark());
      this.undertakenMarch.addLast(streamPhase);
      streamPhase = (null);
      this.ordeBeacon = (synX751boolean);
    }

    if (whenLeaving == synX752int && streamPhase != null) {

      if (primedIsVacant()) {
        whenLeaving = (HourPurity);
      } else {
        ableThrongs[newImportant + synX753int].addLast(streamPhase);
        streamPhase = (null);
        this.ordeBeacon = (synX754boolean);
      }
    }
  }

  private synchronized void synx68() {
    this.pendingWhinAgain--;

    if (pendingWhinAgain == synX755int) {
      this.ordeBeacon = (synX756boolean);
      this.pendingWhinAgain = (Plenum.CommuniqueMeter);
    }
  }

  private synchronized void synx69() {

    if (streamPhase == null && !primedIsVacant()) {
      streamPhase = (obtainLastOutgrowth());
      capacityMechanism(streamPhase);
      streamPhase.rigidOpeningAmount(this.takeTopicalMark());
      whenLeaving = (HourPurity);
    }
  }
}
