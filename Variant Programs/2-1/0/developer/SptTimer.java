package developer;

import exporter.Coordinator;
import developer.Synchronizer;
import developer.Procedures;
import java.util.ArrayDeque;

public class SptTimer extends Synchronizer {
  private ArrayDeque<Procedures> gonnaDong;

  public SptTimer() {
    this.gonnaDong = new ArrayDeque<>();
  }

  public String workflowCite() {
    return "FCFS:";
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

    if (this.burberryTire && thisMethods == null) {
      this.keepingOrdeAmount--;

      if (keepingOrdeAmount == 0) {
        this.burberryTire = false;
        this.keepingOrdeAmount = Coordinator.DeployingOpportunity;
      }

    } else {

      if (thisMethods == null && !gonnaDong.isEmpty()) {
        thisMethods = gonnaDong.removeFirst();
        thisMethods.situatedCommencesMinutes(this.generateUnderwayWalk());
        warheadMethod(thisMethods);
      }
    }
  }

  public void treatInfluent(Procedures mechanisms) {
    gonnaDong.addLast(mechanisms);
  }
}
