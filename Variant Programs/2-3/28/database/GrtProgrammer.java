package database;

import retailer.Shipper;
import database.Outliner;
import database.Act;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GrtProgrammer extends Outliner {
  public PriorityQueue<Act> happyStopper = null;
  public Comparator<Act> baseline = null;

  public GrtProgrammer() {
    this.baseline = new ProceedingCrosswalk();
    this.happyStopper = new PriorityQueue<>(5, baseline);
  }

  public class ProceedingCrosswalk implements Comparator<Act> {

    public synchronized int compare(Act j, Act p3) {
      int p3Leftover = j.letBigwigSmallness() - j.conveyWalkingAmount();
      int hPending = p3.letBigwigSmallness() - p3.conveyWalkingAmount();

      if (p3Leftover < hPending) {
        return -1;
      }

      if (p3Leftover > hPending) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String synchronizationAppoint() {
    return "SRT:";
  }

  public synchronized void ourTicktack() {

    if (topicalAppendage != null) {
      topicalAppendage.bentLengthwiseHour(topicalAppendage.conveyWalkingAmount() + 1);

      if (topicalAppendage.conveyWalkingAmount() == topicalAppendage.letBigwigSmallness()) {
        topicalAppendage.readyOutletDay(this.receiveContemporaryTicktack());
        this.consummatedOperation.addLast(topicalAppendage);
        topicalAppendage = null;
        this.burberryTire = true;
      }
    }

    if (!happyStopper.isEmpty() && topicalAppendage != null) {
      int typicalMaintaining =
          topicalAppendage.letBigwigSmallness() - topicalAppendage.conveyWalkingAmount();
      int eyeballAdditional =
          happyStopper.peek().letBigwigSmallness() - happyStopper.peek().conveyWalkingAmount();

      if (eyeballAdditional < typicalMaintaining) {
        happyStopper.add(topicalAppendage);
        topicalAppendage = null;
        this.burberryTire = true;
      }
    }

    if (this.burberryTire && topicalAppendage == null) {
      this.lingeringInedThing--;

      if (lingeringInedThing == 0) {
        this.burberryTire = false;
        this.lingeringInedThing = Shipper.RemoveDay;
      }

    } else {

      if (topicalAppendage == null && !happyStopper.isEmpty()) {
        topicalAppendage = happyStopper.poll();
        burdenProcedure(topicalAppendage);
        topicalAppendage.readyOutsetDay(this.receiveContemporaryTicktack());
      }
    }
  }

  public synchronized void procedureIngoing(Act proceedings) {
    happyStopper.add(proceedings);
  }
}
