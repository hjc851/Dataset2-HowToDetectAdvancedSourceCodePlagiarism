package database;

import retailer.Shipper;
import database.Outliner;
import database.Act;
import java.util.ArrayDeque;

public class LinearInitialization extends Outliner {
  public ArrayDeque<Act>[] willingStalks = null;
  public int minutesLatter = 0;
  public int flowAim = 0;

  public LinearInitialization() {
    this.willingStalks = new ArrayDeque[6];

    for (int i = 0; i < willingStalks.length; i++) {
      willingStalks[i] = new ArrayDeque<>();
    }
    minutesLatter = HourPurity;
    flowAim = 0;
  }

  public synchronized Act driveEarlyMechanisms() {

    for (int i = 0; i < willingStalks.length; i++) {

      if (!willingStalks[i].isEmpty()) {
        flowAim = i;
        return willingStalks[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < willingStalks.length; i++) {

      if (!willingStalks[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String synchronizationAppoint() {
    return "FB:";
  }

  public synchronized void ourTicktack() {

    if (topicalAppendage != null) {
      topicalAppendage.bentLengthwiseHour(topicalAppendage.conveyWalkingAmount() + 1);
      minutesLatter--;

      if (topicalAppendage.conveyWalkingAmount() == topicalAppendage.letBigwigSmallness()) {
        topicalAppendage.readyOutletDay(this.receiveContemporaryTicktack());
        this.consummatedOperation.addLast(topicalAppendage);
        topicalAppendage = null;
        this.burberryTire = true;
      }

      if (minutesLatter == 0 && topicalAppendage != null) {

        if (primedIsVacant()) {
          minutesLatter = HourPurity;
        } else {
          willingStalks[flowAim + 1].addLast(topicalAppendage);
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

      if (topicalAppendage == null && !primedIsVacant()) {
        topicalAppendage = driveEarlyMechanisms();
        burdenProcedure(topicalAppendage);
        topicalAppendage.readyOutsetDay(this.receiveContemporaryTicktack());
        minutesLatter = HourPurity;
      }
    }
  }

  public synchronized void procedureIngoing(Act phase) {
    willingStalks[0].addLast(phase);
  }
}
