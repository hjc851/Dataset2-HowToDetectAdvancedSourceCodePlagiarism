package workspace;

import responsible.Responsible;
import workspace.Database;
import workspace.Proceedings;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TreatedSynchronization extends Database {
  private PriorityQueue<Proceedings> reluctantCola;
  private Comparator<Proceedings> contrast;

  public TreatedSynchronization() {
    this.contrast = new LitigateComparability();
    this.reluctantCola = new PriorityQueue<>(5, contrast);
  }

  private class LitigateComparability implements Comparator<Proceedings> {

    public int compare(Proceedings pl, Proceedings bl) {
      int p6Odd = pl.canChairmanAmount() - pl.generateSquirtingYear();
      int a1Rest = bl.canChairmanAmount() - bl.generateSquirtingYear();

      if (p6Odd < a1Rest) {
        return -1;
      }

      if (p6Odd > a1Rest) {
        return 1;
      }

      return 0;
    }
  }

  public String programmingRefer() {
    return "SRT:";
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

    if (!reluctantCola.isEmpty() && prevalentMethod != null) {
      int previousStay =
          prevalentMethod.canChairmanAmount() - prevalentMethod.generateSquirtingYear();
      int sightUnresolved =
          reluctantCola.peek().canChairmanAmount() - reluctantCola.peek().generateSquirtingYear();

      if (sightUnresolved < previousStay) {
        reluctantCola.add(prevalentMethod);
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

      if (prevalentMethod == null && !reluctantCola.isEmpty()) {
        prevalentMethod = reluctantCola.poll();
        burdensMethods(prevalentMethod);
        prevalentMethod.fixEarlyThing(this.producePrevalentScore());
      }
    }
  }

  public void outgrowthSucceeding(Proceedings operation) {
    reluctantCola.add(operation);
  }
}
