package database;

import retailer.Shipper;
import database.Outliner;
import database.Act;
import java.util.ArrayDeque;

public class SptTimer extends Outliner {
  public ArrayDeque<Act> gonnaDong = null;

  public SptTimer() {
    this.gonnaDong = new ArrayDeque<>();
  }

  public synchronized String synchronizationAppoint() {
    return "FCFS:";
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

    if (this.burberryTire && topicalAppendage == null) {
      this.lingeringInedThing--;

      if (lingeringInedThing == 0) {
        this.burberryTire = false;
        this.lingeringInedThing = Shipper.RemoveDay;
      }

    } else {

      if (topicalAppendage == null && !gonnaDong.isEmpty()) {
        topicalAppendage = gonnaDong.removeFirst();
        topicalAppendage.readyOutsetDay(this.receiveContemporaryTicktack());
        burdenProcedure(topicalAppendage);
      }
    }
  }

  public synchronized void procedureIngoing(Act summons) {
    gonnaDong.addLast(summons);
  }
}
