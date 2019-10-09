package debugging;

import device.Plenum;
import debugging.Spooler;
import debugging.Phase;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeasuredServer extends debugging.Spooler {
  static final int logic = 1491897325;
  public java.util.PriorityQueue<Phase> happyStopper = null;
  public java.util.Comparator<Phase> footnote = null;

  public MeasuredServer() {
    this.footnote = (new SummonsBenchmark());
    this.happyStopper = (new java.util.PriorityQueue<>(5, footnote));
  }

  public class SummonsBenchmark implements Comparator<Phase> {

    public synchronized int compare(Phase h, Phase e) {
      int superiorCircumscribe = -1619928518;
      int pvMaintaining = h.obtainTimeoutLength() - h.haveSpoutingPeriods();
      int p1Leftover = e.obtainTimeoutLength() - e.haveSpoutingPeriods();

      if (pvMaintaining < p1Leftover) {
        return -1;
      }

      if (pvMaintaining > p1Leftover) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String synchronizerDescribe() {
    int decreaseThresholds = 236164087;
    return "SRT:";
  }

  public synchronized void weapMark() {
    int shackled = -195963711;

    if (streamPhase != null) synx73();

    if (!happyStopper.isEmpty() && streamPhase != null) synx74();

    if (this.ordeBeacon && streamPhase == null) synx75();
    else synx76();
  }

  public synchronized void systemInpouring(Phase mechanism) {
    int census = 1384440383;
    happyStopper.add(mechanism);
  }

  private synchronized void synx73() {
    streamPhase.putMovingClock(streamPhase.haveSpoutingPeriods() + 1);

    if (streamPhase.haveSpoutingPeriods() == streamPhase.obtainTimeoutLength()) {
      streamPhase.putDepartureClock(this.takeTopicalMark());
      this.undertakenMarch.addLast(streamPhase);
      streamPhase = (null);
      this.ordeBeacon = (true);
    }
  }

  private synchronized void synx74() {
    int afootRetaining = streamPhase.obtainTimeoutLength() - streamPhase.haveSpoutingPeriods();
    int ganderUnexhausted =
        happyStopper.peek().obtainTimeoutLength() - happyStopper.peek().haveSpoutingPeriods();

    if (ganderUnexhausted < afootRetaining) {
      happyStopper.add(streamPhase);
      streamPhase = (null);
      this.ordeBeacon = (true);
    }
  }

  private synchronized void synx75() {
    this.pendingWhinAgain--;

    if (pendingWhinAgain == 0) {
      this.ordeBeacon = (false);
      this.pendingWhinAgain = (Plenum.CommuniqueMeter);
    }
  }

  private synchronized void synx76() {

    if (streamPhase == null && !happyStopper.isEmpty()) {
      streamPhase = (happyStopper.poll());
      capacityMechanism(streamPhase);
      streamPhase.rigidOpeningAmount(this.takeTopicalMark());
    }
  }
}
