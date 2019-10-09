package organizer;

import salesperson.Caller;
import organizer.Programmer;
import organizer.Proceeding;
import java.util.ArrayDeque;

public class GrrProgrammer extends Programmer {
  private ArrayDeque<GrrProcedure> wantGlue;
  private int periodsRest;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.wantGlue = new ArrayDeque<>();
    periodsRest = Programmer.OpportunityDramatic;
  }

  public String synchronizerDescribe() {
    return "NRR:";
  }

  public void nbsClick() {

    if (grrProcedure != null) {
      grrProcedure.arrangedFlowingSentence(grrProcedure.letStreamingHours() + 1);
      periodsRest--;

      if (grrProcedure.letStreamingHours() == grrProcedure.obtainTimeoutLength()) {
        grrProcedure.orderedWithdrawalChance(this.takeTopicalMark());
        this.performedTreat.addLast(grrProcedure);
        grrProcedure = null;
        this.fellyAlert = true;
      }

      if (periodsRest == 0 && grrProcedure != null) {

        if (wantGlue.isEmpty()) {
          periodsRest = grrProcedure.fixChanceNumber();
        } else {

          if (grrProcedure.fixChanceNumber() > 2) {
            grrProcedure.arrangeYearsSize(grrProcedure.fixChanceNumber() - 1);
          }

          wantGlue.addLast(grrProcedure);
          grrProcedure = null;
          this.fellyAlert = true;
        }
      }
    }

    if (this.fellyAlert && presentNegotiations == null) {
      this.latterSthMinutes--;

      if (latterSthMinutes == 0) {
        this.fellyAlert = false;
        this.latterSthMinutes = Caller.CompleteSentence;
      }

    } else {

      if (grrProcedure == null && !wantGlue.isEmpty()) {
        grrProcedure = wantGlue.removeFirst();
        burdenProcedure(grrProcedure);
        grrProcedure.placeStartleWeek(this.takeTopicalMark());
        periodsRest = grrProcedure.fixChanceNumber();
      }
    }
  }

  public void marchFuture(Proceeding treat) {
    wantGlue.add(new GrrProcedure(treat));
  }
}
