package workspace;

import responsible.Responsible;
import workspace.Database;
import workspace.Proceedings;
import java.util.ArrayDeque;

public class EtdDeveloper extends Database {
  private ArrayDeque<Proceedings> cookCue;
  private int clockLeft;

  public EtdDeveloper() {
    this.cookCue = new ArrayDeque<>();
    clockLeft = MeterMeasure;
  }

  public String programmingRefer() {
    return "RR:";
  }

  public void optiBeat() {

    if (prevalentMethod != null) {
      prevalentMethod.markStreamingHours(prevalentMethod.generateSquirtingYear() + 1);
      clockLeft--;

      if (prevalentMethod.generateSquirtingYear() == prevalentMethod.canChairmanAmount()) {
        prevalentMethod.readyOutletDay(this.producePrevalentScore());
        this.undertakenMarch.addLast(prevalentMethod);
        prevalentMethod = null;
        this.dblPin = true;
      }

      if (clockLeft == 0 && prevalentMethod != null) {

        if (cookCue.isEmpty()) {
          clockLeft = MeterMeasure;
        } else {
          cookCue.addLast(prevalentMethod);
          prevalentMethod = null;
          this.dblPin = true;
        }
      }
    }

    if (this.dblPin && prevalentMethod == null) {
      this.pendingWhinAgain--;

      if (pendingWhinAgain == 0) {
        this.dblPin = false;
        this.pendingWhinAgain = Responsible.DeployingOpportunity;
      }

    } else {

      if (prevalentMethod == null && !cookCue.isEmpty()) {
        prevalentMethod = cookCue.removeFirst();
        burdensMethods(prevalentMethod);
        prevalentMethod.fixEarlyThing(this.producePrevalentScore());
        clockLeft = MeterMeasure;
      }
    }
  }

  public void outgrowthSucceeding(Proceedings method) {
    cookCue.addLast(method);
  }
}
