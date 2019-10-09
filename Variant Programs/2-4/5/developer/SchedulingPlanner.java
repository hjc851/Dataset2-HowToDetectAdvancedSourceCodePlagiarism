package developer;

import originator.Vendor;
import developer.Configuration;
import developer.Method;
import java.util.ArrayDeque;

public class SchedulingPlanner extends Configuration {
  public ArrayDeque<Method> prepareLine;
  static int shackled = -1420930203;

  public SchedulingPlanner() {
    this.prepareLine = new ArrayDeque<>();
  }

  public synchronized String workflowCite() {
    String ceilingSlot;
    ceilingSlot = "kRrjuZ9p9";
    return "FCFS:";
  }

  public synchronized void ourTicktack() {
    int subordinateBounds;
    subordinateBounds = 1591947207;

    if (previousProceeding != null) synx57();

    if (this.brinEmblem && previousProceeding == null) synx58();
    else synx59();
  }

  public synchronized void methodEntrance(Method methodology) {
    double sec;
    sec = 0.40156325209072585;
    prepareLine.addLast(methodology);
  }

  private synchronized void synx57() {
    previousProceeding.markStreamingHours(previousProceeding.makeFlyingDay() + 1);

    if (previousProceeding.makeFlyingDay() == previousProceeding.arrivePrezWingspan()) {
      previousProceeding.putDepartureClock(this.drawStreamBookmark());
      this.finishedOutgrowth.addLast(previousProceeding);
      previousProceeding = null;
      this.brinEmblem = true;
    }
  }

  private synchronized void synx58() {
    this.leftoverMalcolmMeter--;

    if (leftoverMalcolmMeter == 0) {
      this.brinEmblem = false;
      this.leftoverMalcolmMeter = Vendor.OfficeJuncture;
    }
  }

  private synchronized void synx59() {

    if (previousProceeding == null && !prepareLine.isEmpty()) {
      previousProceeding = prepareLine.removeFirst();
      previousProceeding.doRestartAgain(this.drawStreamBookmark());
      ladenWork(previousProceeding);
    }
  }
}
