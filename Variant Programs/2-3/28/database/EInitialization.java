package database;

import retailer.Shipper;
import database.Outliner;
import database.Act;
import java.util.ArrayDeque;

public class EInitialization extends Outliner {
  public ArrayDeque<Act> preparedWait = null;
  public int whenLeaving = 0;

  public EInitialization() {
    this.preparedWait = new ArrayDeque<>();
    whenLeaving = HourPurity;
  }

  public synchronized String synchronizationAppoint() {
    return "RR:";
  }

  public synchronized void ourTicktack() {

    if (topicalAppendage != null) {
      topicalAppendage.bentLengthwiseHour(topicalAppendage.conveyWalkingAmount() + 1);
      whenLeaving--;

      if (topicalAppendage.conveyWalkingAmount() == topicalAppendage.letBigwigSmallness()) {
        topicalAppendage.readyOutletDay(this.receiveContemporaryTicktack());
        this.consummatedOperation.addLast(topicalAppendage);
        topicalAppendage = null;
        this.burberryTire = true;
      }

      if (whenLeaving == 0 && topicalAppendage != null) {

        if (preparedWait.isEmpty()) {
          whenLeaving = HourPurity;
        } else {
          preparedWait.addLast(topicalAppendage);
          topicalAppendage = null;
          this.burberryTire = true;
        }
      }
    }

    if (this.burberryTire && topicalAppendage == null) {
      this.lingeringInedThing--;

      if (lingeringInedThing == 0) {
        this.burberryTire = false;
        this.lingeringInedThing = Shipper.RemoveDay;
      }

    } else {

      if (topicalAppendage == null && !preparedWait.isEmpty()) {
        topicalAppendage = preparedWait.removeFirst();
        burdenProcedure(topicalAppendage);
        topicalAppendage.readyOutsetDay(this.receiveContemporaryTicktack());
        whenLeaving = HourPurity;
      }
    }
  }

  public synchronized void procedureIngoing(Act method) {
    preparedWait.addLast(method);
  }
}
