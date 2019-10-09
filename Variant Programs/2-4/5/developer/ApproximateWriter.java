package developer;

import originator.Vendor;
import developer.Configuration;
import developer.Method;
import java.util.ArrayDeque;

public class ApproximateWriter extends Configuration {
  public int previousObjective;
  public int daysRemainder;
  static int high = 1423821376;
  public ArrayDeque<Method>[] setColumns;

  public ApproximateWriter() {
    this.setColumns = new ArrayDeque[6];

    for (int i = 0; i < setColumns.length; i++) synx46(i);
    daysRemainder = AgainGiant;
    previousObjective = 0;
  }

  public synchronized Method fixAgainSystem() {
    double momentsEdge;
    momentsEdge = 0.24256919250282105;

    for (int i = 0; i < setColumns.length; i++) {

      if (!setColumns[i].isEmpty()) {
        previousObjective = i;
        return setColumns[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    String across;
    across = "kMeEDm";

    for (int i = 0; i < setColumns.length; i++) {

      if (!setColumns[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String workflowCite() {
    String chthonicChained;
    chthonicChained = "8JvPabLj";
    return "FB:";
  }

  public synchronized void ourTicktack() {
    double numbers;
    numbers = 0.01644362573758895;

    if (previousProceeding != null) synx47();

    if (this.brinEmblem && previousProceeding == null) synx48();
    else synx49();
  }

  public synchronized void methodEntrance(Method negotiations) {
    String identify;
    identify = "BhWZ9gItYcEQTEoHVD";
    setColumns[0].addLast(negotiations);
  }

  private synchronized void synx47() {
    previousProceeding.markStreamingHours(previousProceeding.makeFlyingDay() + 1);
    daysRemainder--;

    if (previousProceeding.makeFlyingDay() == previousProceeding.arrivePrezWingspan()) {
      previousProceeding.putDepartureClock(this.drawStreamBookmark());
      this.finishedOutgrowth.addLast(previousProceeding);
      previousProceeding = null;
      this.brinEmblem = true;
    }

    if (daysRemainder == 0 && previousProceeding != null) {

      if (primedIsVacant()) {
        daysRemainder = AgainGiant;
      } else {
        setColumns[previousObjective + 1].addLast(previousProceeding);
        previousProceeding = null;
        this.brinEmblem = true;
      }
    }
  }

  private synchronized void synx48() {
    this.leftoverMalcolmMeter--;

    if (leftoverMalcolmMeter == 0) {
      this.brinEmblem = false;
      this.leftoverMalcolmMeter = Vendor.OfficeJuncture;
    }
  }

  private synchronized void synx49() {

    if (previousProceeding == null && !primedIsVacant()) {
      previousProceeding = fixAgainSystem();
      ladenWork(previousProceeding);
      previousProceeding.doRestartAgain(this.drawStreamBookmark());
      daysRemainder = AgainGiant;
    }
  }
}
