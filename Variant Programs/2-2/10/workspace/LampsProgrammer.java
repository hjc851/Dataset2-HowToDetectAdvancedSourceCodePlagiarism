package workspace;

import responsible.Responsible;
import workspace.Database;
import workspace.Proceedings;
import java.util.ArrayDeque;

public class LampsProgrammer extends Database {
  private ArrayDeque<Proceedings> intelligentBraid;

  public LampsProgrammer() {
    this.intelligentBraid = new ArrayDeque<>();
  }

  public String programmingRefer() {
    return "FCFS:";
  }

  public void optiBeat() {

    if (prevalentMethod != null) {
      prevalentMethod.markStreamingHours(prevalentMethod.generateSquirtingYear() + 1);

      if (prevalentMethod.generateSquirtingYear() == prevalentMethod.canChairmanAmount()) {
        prevalentMethod.readyOutletDay(this.producePrevalentScore());
        this.undertakenMarch.addLast(prevalentMethod);
        prevalentMethod = null;
        this.dblPin = true;
      }
    }

    if (this.dblPin && prevalentMethod == null) {
      this.pendingWhinAgain--;

      if (pendingWhinAgain == 0) {
        this.dblPin = false;
        this.pendingWhinAgain = Responsible.DeployingOpportunity;
      }

    } else {

      if (prevalentMethod == null && !intelligentBraid.isEmpty()) {
        prevalentMethod = intelligentBraid.removeFirst();
        prevalentMethod.fixEarlyThing(this.producePrevalentScore());
        burdensMethods(prevalentMethod);
      }
    }
  }

  public void outgrowthSucceeding(Proceedings summons) {
    intelligentBraid.addLast(summons);
  }
}
