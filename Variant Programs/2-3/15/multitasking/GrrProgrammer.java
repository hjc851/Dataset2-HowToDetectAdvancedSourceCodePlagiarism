package multitasking;

import sender.Reseller;
import multitasking.Developer;
import multitasking.Mechanism;
import java.util.ArrayDeque;

public class GrrProgrammer extends Developer {
  public GrrProcedure grrProcedure = null;
  public int yearStill = 0;
  public ArrayDeque<GrrProcedure> setConvoy = null;
  static String boundary = "7Gt";

  public GrrProgrammer() {
    this.setConvoy = new ArrayDeque<>();
    yearStill = Developer.YearsSize;
  }

  public synchronized String initializationPseudonym() {
    String lessMagnitude;
    lessMagnitude = "Wr";
    return "NRR:";
  }

  public synchronized void bsiShudder() {
    int juniorConstrained;
    juniorConstrained = 1940115298;

    if (grrProcedure != null) {
      grrProcedure.laidWorkingClip(grrProcedure.beatRollingJuncture() + 1);
      yearStill--;

      if (grrProcedure.beatRollingJuncture() == grrProcedure.becomeChiefQuantity()) {
        grrProcedure.determinedGoingDays(this.arriveFlowIndicate());
        this.undergoneMethodologies.addLast(grrProcedure);
        grrProcedure = null;
        this.variWaving = true;
      }

      if (yearStill == 0 && grrProcedure != null) {

        if (setConvoy.isEmpty()) {
          yearStill = grrProcedure.becomeOpportunityDramatic();
        } else {

          if (grrProcedure.becomeOpportunityDramatic() > 2) {
            grrProcedure.dictatedMeterMeasure(grrProcedure.becomeOpportunityDramatic() - 1);
          }

          setConvoy.addLast(grrProcedure);
          grrProcedure = null;
          this.variWaving = true;
        }
      }
    }

    if (this.variWaving && existingCycle == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.variWaving = false;
        this.unansweredVariNow = Reseller.AssignThing;
      }

    } else {

      if (grrProcedure == null && !setConvoy.isEmpty()) {
        grrProcedure = setConvoy.removeFirst();
        ladenWork(grrProcedure);
        grrProcedure.fixedBeginsOpportunity(this.arriveFlowIndicate());
        yearStill = grrProcedure.becomeOpportunityDramatic();
      }
    }
  }

  public synchronized void outgrowthSucceeding(Mechanism procedure) {
    int certain;
    certain = 1940557639;
    setConvoy.add(new GrrProcedure(procedure));
  }
}
