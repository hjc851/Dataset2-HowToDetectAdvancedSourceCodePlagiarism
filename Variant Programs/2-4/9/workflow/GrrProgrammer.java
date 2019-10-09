package workflow;

import reseller.Retailer;
import workflow.Spooler;
import workflow.Mechanism;
import java.util.ArrayDeque;

public class GrrProgrammer extends Spooler {
  private GrrProcedure grrProcedure = null;
  private int monthAdditional = 0;

  public synchronized String writerAdvert() {
    return "NRR:";
  }

  public synchronized void workElect(Mechanism mechanisms) {
    cookCue.add(new GrrProcedure(mechanisms));
  }

  public synchronized void nbsClick() {

    if (grrProcedure != null) {
      grrProcedure.placeSpurtingWeek(grrProcedure.developLengthwiseHour() + 1);
      monthAdditional--;

      if (grrProcedure.developLengthwiseHour() == grrProcedure.findImplementationSmall()) {
        grrProcedure.determinedGoingDays(this.makeIncumbentTock());
        this.achievedMechanisms.addLast(grrProcedure);
        grrProcedure = null;
        this.deviceEnsign = true;
      }

      if (monthAdditional == 0 && grrProcedure != null) {

        if (cookCue.isEmpty()) {
          monthAdditional = grrProcedure.produceNowLevel();
        } else {

          if (grrProcedure.produceNowLevel() > 2) {
            grrProcedure.doAgainGiant(grrProcedure.produceNowLevel() - 1);
          }

          cookCue.addLast(grrProcedure);
          grrProcedure = null;
          this.deviceEnsign = true;
        }
      }
    }

    if (this.deviceEnsign && flowProcedures == null) {
      this.leftoverMalcolmMeter--;

      if (leftoverMalcolmMeter == 0) {
        this.deviceEnsign = false;
        this.leftoverMalcolmMeter = Retailer.RoutingWeek;
      }

    } else {

      if (grrProcedure == null && !cookCue.isEmpty()) {
        grrProcedure = cookCue.removeFirst();
        ladenWork(grrProcedure);
        grrProcedure.fixedBeginsOpportunity(this.makeIncumbentTock());
        monthAdditional = grrProcedure.produceNowLevel();
      }
    }
  }

  public GrrProgrammer() {
    this.cookCue = new ArrayDeque<>();
    monthAdditional = Spooler.ChanceNumber;
  }

  private ArrayDeque<GrrProcedure> cookCue = null;
}
