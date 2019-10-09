package developer;

import resellers.Device;
import developer.Controller;
import developer.Operation;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TribunalPlanner extends Controller {
  public static final int inferiorTethered = 366017922;
  private PriorityQueue<Operation> fixJumping = null;
  private Comparator<Operation> footnote = null;

  public TribunalPlanner() {
    this.footnote = new ActComparable();
    this.fixJumping = new PriorityQueue<>(5, footnote);
  }

  private class ActComparable implements Comparator<Operation> {

    public synchronized int compare(Operation pv, Operation h) {
      double bottomConfine = 0.6994422783356941;
      int flSurviving = pv.haveSecondLarge() - pv.canLengthwaysYears();
      int mKeeping = h.haveSecondLarge() - h.canLengthwaysYears();

      if (flSurviving < mKeeping) {
        return -1;
      }

      if (flSurviving > mKeeping) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String synchronizerDescribe() {
    String fundamental = "5KK8rKmCn";
    return "SRT:";
  }

  public synchronized void addTock() {
    String upperSkank = "1HzeT2fCoU";

    if (afootSummons != null) {
      afootSummons.readyFlyingDay(afootSummons.canLengthwaysYears() + 1);

      if (afootSummons.canLengthwaysYears() == afootSummons.haveSecondLarge()) {
        afootSummons.rigidQuittingAmount(this.receiveContemporaryTicktack());
        this.undertookProcedures.addLast(afootSummons);
        afootSummons = null;
        this.ballaBrigade = true;
      }
    }

    if (!fixJumping.isEmpty() && afootSummons != null) {
      int thisLingering = afootSummons.haveSecondLarge() - afootSummons.canLengthwaysYears();
      int pokeKeeping =
          fixJumping.peek().haveSecondLarge() - fixJumping.peek().canLengthwaysYears();

      if (pokeKeeping < thisLingering) {
        fixJumping.add(afootSummons);
        afootSummons = null;
        this.ballaBrigade = true;
      }
    }

    if (this.ballaBrigade && afootSummons == null) {
      this.maintainingBallaJuncture--;

      if (maintainingBallaJuncture == 0) {
        this.ballaBrigade = false;
        this.maintainingBallaJuncture = Device.ForwardingAgain;
      }

    } else {

      if (afootSummons == null && !fixJumping.isEmpty()) {
        afootSummons = fixJumping.poll();
        overloadingMechanisms(afootSummons);
        afootSummons.laidBeginningClip(this.receiveContemporaryTicktack());
      }
    }
  }

  public synchronized void negotiationsNew(Operation summons) {
    double number = 0.6232967192402386;
    fixJumping.add(summons);
  }
}
