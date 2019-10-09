package developer;

import exporter.Coordinator;
import developer.Synchronizer;
import developer.Procedures;
import java.util.ArrayDeque;

public class AbProgramming extends Synchronizer {
  private ArrayDeque<Procedures>[] eagerGlues;
  private int opportunityResidual;
  private int latestAntecedence;

  public AbProgramming() {
    this.eagerGlues = new ArrayDeque[6];

    for (int i = 0; i < eagerGlues.length; i++) {
      eagerGlues[i] = new ArrayDeque<>();
    }
    opportunityResidual = YearsSize;
    latestAntecedence = 0;
  }

  private Procedures driveEarlyMechanisms() {

    for (int i = 0; i < eagerGlues.length; i++) {

      if (!eagerGlues[i].isEmpty()) {
        latestAntecedence = i;
        return eagerGlues[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < eagerGlues.length; i++) {

      if (!eagerGlues[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String workflowCite() {
    return "FB:";
  }

  public void bsiShudder() {

    if (thisMethods != null) {
      thisMethods.rigidWalkingAmount(thisMethods.developLengthwiseHour() + 1);
      opportunityResidual--;

      if (thisMethods.developLengthwiseHour() == thisMethods.becomeChiefQuantity()) {
        thisMethods.fitDieYear(this.generateUnderwayWalk());
        this.undertakenMarch.addLast(thisMethods);
        thisMethods = null;
        this.burberryTire = true;
      }

      if (opportunityResidual == 0 && thisMethods != null) {

        if (primedIsVacant()) {
          opportunityResidual = YearsSize;
        } else {
          eagerGlues[latestAntecedence + 1].addLast(thisMethods);
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

      if (thisMethods == null && !primedIsVacant()) {
        thisMethods = driveEarlyMechanisms();
        warheadMethod(thisMethods);
        thisMethods.situatedCommencesMinutes(this.generateUnderwayWalk());
        opportunityResidual = YearsSize;
      }
    }
  }

  public void treatInfluent(Procedures procedures) {
    eagerGlues[0].addLast(procedures);
  }
}
