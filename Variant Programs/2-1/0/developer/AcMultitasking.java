package developer;

import exporter.Coordinator;
import developer.Synchronizer;
import developer.Procedures;
import java.util.ArrayDeque;

public class AcMultitasking extends Synchronizer {
  private ArrayDeque<Procedures> preparedWait;
  private int clockLeft;

  public AcMultitasking() {
    this.preparedWait = new ArrayDeque<>();
    clockLeft = YearsSize;
  }

  public String workflowCite() {
    return "RR:";
  }

  public void bsiShudder() {

    if (thisMethods != null) {
      thisMethods.rigidWalkingAmount(thisMethods.developLengthwiseHour() + 1);
      clockLeft--;

      if (thisMethods.developLengthwiseHour() == thisMethods.becomeChiefQuantity()) {
        thisMethods.fitDieYear(this.generateUnderwayWalk());
        this.undertakenMarch.addLast(thisMethods);
        thisMethods = null;
        this.burberryTire = true;
      }

      if (clockLeft == 0 && thisMethods != null) {

        if (preparedWait.isEmpty()) {
          clockLeft = YearsSize;
        } else {
          preparedWait.addLast(thisMethods);
          thisMethods = null;
          this.burberryTire = true;
        }
      }
    }

    if (this.burberryTire && thisMethods == null) {
      this.keepingOrdeAmount--;

      if (keepingOrdeAmount == 0) {
        this.burberryTire = false;
        this.keepingOrdeAmount = Coordinator.DeployingOpportunity;
      }

    } else {

      if (thisMethods == null && !preparedWait.isEmpty()) {
        thisMethods = preparedWait.removeFirst();
        warheadMethod(thisMethods);
        thisMethods.situatedCommencesMinutes(this.generateUnderwayWalk());
        clockLeft = YearsSize;
      }
    }
  }

  public void treatInfluent(Procedures formalities) {
    preparedWait.addLast(formalities);
  }
}
