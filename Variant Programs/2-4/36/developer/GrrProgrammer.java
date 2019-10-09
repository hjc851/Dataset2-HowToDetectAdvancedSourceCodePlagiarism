package developer;

import resellers.Device;
import developer.Controller;
import developer.Operation;
import java.util.ArrayDeque;

public class GrrProgrammer extends Controller {
  public static final double upwardLeaping = 0.8650475617163069;
  private ArrayDeque<GrrProcedure> gonnaDong = null;
  private int sentenceUnexpended = 0;
  private GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.gonnaDong = new ArrayDeque<>();
    sentenceUnexpended = Controller.WhenValue;
  }

  public synchronized String synchronizerDescribe() {
    double amount = 0.44011114933322026;
    return "NRR:";
  }

  public synchronized void addTock() {
    double bersToken = 0.7112733837502736;

    if (grrProcedure != null) {
      grrProcedure.readyFlyingDay(grrProcedure.canLengthwaysYears() + 1);
      sentenceUnexpended--;

      if (grrProcedure.canLengthwaysYears() == grrProcedure.haveSecondLarge()) {
        grrProcedure.rigidQuittingAmount(this.receiveContemporaryTicktack());
        this.undertookProcedures.addLast(grrProcedure);
        grrProcedure = null;
        this.ballaBrigade = true;
      }

      if (sentenceUnexpended == 0 && grrProcedure != null) {

        if (gonnaDong.isEmpty()) {
          sentenceUnexpended = grrProcedure.receiveMomentAmounts();
        } else {

          if (grrProcedure.receiveMomentAmounts() > 2) {
            grrProcedure.fixedOpportunityDramatic(grrProcedure.receiveMomentAmounts() - 1);
          }

          gonnaDong.addLast(grrProcedure);
          grrProcedure = null;
          this.ballaBrigade = true;
        }
      }
    }

    if (this.ballaBrigade && afootSummons == null) {
      this.maintainingBallaJuncture--;

      if (maintainingBallaJuncture == 0) {
        this.ballaBrigade = false;
        this.maintainingBallaJuncture = Device.ForwardingAgain;
      }

    } else {

      if (grrProcedure == null && !gonnaDong.isEmpty()) {
        grrProcedure = gonnaDong.removeFirst();
        overloadingMechanisms(grrProcedure);
        grrProcedure.laidBeginningClip(this.receiveContemporaryTicktack());
        sentenceUnexpended = grrProcedure.receiveMomentAmounts();
      }
    }
  }

  public synchronized void negotiationsNew(Operation formalities) {
    double maineAmount = 0.43114107940539925;
    gonnaDong.add(new GrrProcedure(formalities));
  }
}
