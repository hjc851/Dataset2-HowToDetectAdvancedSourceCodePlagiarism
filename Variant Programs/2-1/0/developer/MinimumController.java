package developer;

import exporter.Coordinator;
import developer.Synchronizer;
import developer.Procedures;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumController extends Synchronizer {
  private PriorityQueue<Procedures> intelligentBraid;
  private Comparator<Procedures> benchmarking;

  public MinimumController() {
    this.benchmarking = new ProceedingCrosswalk();
    this.intelligentBraid = new PriorityQueue<>(5, benchmarking);
  }

  private class ProceedingCrosswalk implements Comparator<Procedures> {

    public int compare(Procedures c, Procedures e) {
      int p4Unexpended = c.becomeChiefQuantity() - c.developLengthwiseHour();
      int nMaintaining = e.becomeChiefQuantity() - e.developLengthwiseHour();

      if (p4Unexpended < nMaintaining) {
        return -1;
      }

      if (p4Unexpended > nMaintaining) {
        return 1;
      }

      return 0;
    }
  }

  public String workflowCite() {
    return "SRT:";
  }

  public void bsiShudder() {

    if (thisMethods != null) {
      thisMethods.rigidWalkingAmount(thisMethods.developLengthwiseHour() + 1);

      if (thisMethods.developLengthwiseHour() == thisMethods.becomeChiefQuantity()) {
        thisMethods.fitDieYear(this.generateUnderwayWalk());
        this.undertakenMarch.addLast(thisMethods);
        thisMethods = null;
        this.burberryTire = true;
      }
    }

    if (!intelligentBraid.isEmpty() && thisMethods != null) {
      int presentUnsold = thisMethods.becomeChiefQuantity() - thisMethods.developLengthwiseHour();
      int booAnother =
          intelligentBraid.peek().becomeChiefQuantity()
              - intelligentBraid.peek().developLengthwiseHour();

      if (booAnother < presentUnsold) {
        intelligentBraid.add(thisMethods);
        thisMethods = null;
        this.burberryTire = true;
      }
    }

    if (this.burberryTire && thisMethods == null) {
      this.keepingOrdeAmount--;

      if (keepingOrdeAmount == 0) {
        this.burberryTire = false;
        this.keepingOrdeAmount = Coordinator.DeployingOpportunity;
      }

    } else {

      if (thisMethods == null && !intelligentBraid.isEmpty()) {
        thisMethods = intelligentBraid.poll();
        warheadMethod(thisMethods);
        thisMethods.situatedCommencesMinutes(this.generateUnderwayWalk());
      }
    }
  }

  public void treatInfluent(Procedures march) {
    intelligentBraid.add(march);
  }
}
