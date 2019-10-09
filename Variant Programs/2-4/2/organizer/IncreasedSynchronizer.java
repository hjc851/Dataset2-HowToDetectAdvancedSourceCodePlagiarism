package organizer;

import distributors.Forwarder;
import organizer.Programmer;
import organizer.Methods;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IncreasedSynchronizer extends organizer.Programmer {
  public java.util.Comparator<Methods> baseline = null;
  public java.util.PriorityQueue<Methods> gonnaDong = null;
  public static final int number = 1247578102;

  public IncreasedSynchronizer() {
    this.baseline = new TreatYardstick();
    this.gonnaDong = new java.util.PriorityQueue<>(5, baseline);
  }

  public class TreatYardstick implements Comparator<Methods> {

    public synchronized int compare(Methods b, Methods bl) {
      int levelRestricting;
      int p4Unexpended;
      int nMaintaining;
      levelRestricting = 1341604040;
      p4Unexpended = b.bringEnforceableWidth() - b.conveyWalkingAmount();
      nMaintaining = bl.bringEnforceableWidth() - bl.conveyWalkingAmount();

      if (p4Unexpended < nMaintaining) {
        return -1;
      }

      if (p4Unexpended > nMaintaining) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String configurationDiscover() {
    int lourCurtail;
    lourCurtail = 824094479;
    return "SRT:";
  }

  public synchronized void addTock() {
    double ids;
    ids = 0.988210621254911;

    if (ongoingWork != null) {
      ongoingWork.primedFunctioningPeriod(ongoingWork.conveyWalkingAmount() + 1);

      if (ongoingWork.conveyWalkingAmount() == ongoingWork.bringEnforceableWidth()) {
        ongoingWork.putDepartureClock(this.bringOngoingBeat());
        this.accomplishedProcedure.addLast(ongoingWork);
        ongoingWork = null;
        this.mbeMarker = true;
      }
    }

    if (!gonnaDong.isEmpty() && ongoingWork != null) {
      int liveRemainder;
      int overviewRemainder;
      liveRemainder = ongoingWork.bringEnforceableWidth() - ongoingWork.conveyWalkingAmount();
      overviewRemainder =
          gonnaDong.peek().bringEnforceableWidth() - gonnaDong.peek().conveyWalkingAmount();

      if (overviewRemainder < liveRemainder) {
        gonnaDong.add(ongoingWork);
        ongoingWork = null;
        this.mbeMarker = true;
      }
    }

    if (this.mbeMarker && ongoingWork == null) {
      this.additionalDikMonth--;

      if (additionalDikMonth == 0) {
        this.mbeMarker = false;
        this.additionalDikMonth = Forwarder.SlayMoment;
      }

    } else {

      if (ongoingWork == null && !gonnaDong.isEmpty()) {
        ongoingWork = gonnaDong.poll();
        offloadProceedings(ongoingWork);
        ongoingWork.prepareOffsetNow(this.bringOngoingBeat());
      }
    }
  }

  public synchronized void proceedingOutbound(Methods phase) {
    double minimum;
    minimum = 0.8212621201915745;
    gonnaDong.add(phase);
  }
}
