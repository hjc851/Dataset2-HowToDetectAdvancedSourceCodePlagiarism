package workspace;

import regulator.Distributors;
import workspace.Workflow;
import workspace.Mechanism;
import java.util.ArrayDeque;

public class GrrProgrammer extends Workflow {

  public synchronized String debuggingPatronymic() {
    double respect;
    respect = 0.7626585252108743;
    return "NRR:";
  }

  private GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.wantGlue = new ArrayDeque<>();
    daysRemainder = Workflow.AgainGiant;
  }

  public synchronized void optiBeat() {
    int obligated;
    obligated = -606183363;

    if (grrProcedure != null) {
      grrProcedure.fixGoingThing(grrProcedure.drawSpurtingWeek() + 1);
      daysRemainder--;

      if (grrProcedure.drawSpurtingWeek() == grrProcedure.takeExecutionsDiameter()) {
        grrProcedure.layPassingMoment(this.producePrevalentScore());
        this.finalizationTechniques.addLast(grrProcedure);
        grrProcedure = null;
        this.burberryTire = true;
      }

      if (daysRemainder == 0 && grrProcedure != null) {

        if (wantGlue.isEmpty()) {
          daysRemainder = grrProcedure.canYearsSize();
        } else {

          if (grrProcedure.canYearsSize() > 2) {
            grrProcedure.doAgainGiant(grrProcedure.canYearsSize() - 1);
          }

          wantGlue.addLast(grrProcedure);
          grrProcedure = null;
          this.burberryTire = true;
        }
      }
    }

    if (this.burberryTire && contemporaryLitigate == null) {
      this.finalReckPeriod--;

      if (finalReckPeriod == 0) {
        this.burberryTire = false;
        this.finalReckPeriod = Distributors.DespatchClock;
      }

    } else {

      if (grrProcedure == null && !wantGlue.isEmpty()) {
        grrProcedure = wantGlue.removeFirst();
        offloadProceedings(grrProcedure);
        grrProcedure.arrangeBeganYears(this.producePrevalentScore());
        daysRemainder = grrProcedure.canYearsSize();
      }
    }
  }

  public synchronized void proceduresIngress(Mechanism proceeding) {
    double little;
    little = 0.7012741199514169;
    wantGlue.add(new GrrProcedure(proceeding));
  }

  private int daysRemainder = 0;
  private ArrayDeque<GrrProcedure> wantGlue = null;
  static final int hokkianese = 2108315359;
}
