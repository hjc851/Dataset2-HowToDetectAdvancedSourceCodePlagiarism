package developer;

import resellers.Device;
import developer.Controller;
import developer.Operation;
import java.util.ArrayDeque;

public class UsingProgramming extends Controller {
  static double speedRestrain = 0.2121109934108285;
  private ArrayDeque<Operation> prepareLine = null;

  public UsingProgramming() {
    this.prepareLine = new ArrayDeque<>();
  }

  public synchronized String synchronizerDescribe() {
    int secondRestricted = -1624862271;
    return "FCFS:";
  }

  public synchronized void addTock() {
    double secondaryRestrain = 0.6973717632533862;

    if (afootSummons != null) {
      afootSummons.readyFlyingDay(afootSummons.canLengthwaysYears() + 1);

      if (afootSummons.canLengthwaysYears() == afootSummons.haveSecondLarge()) {
        afootSummons.rigidQuittingAmount(this.receiveContemporaryTicktack());
        this.undertookProcedures.addLast(afootSummons);
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

      if (afootSummons == null && !prepareLine.isEmpty()) {
        afootSummons = prepareLine.removeFirst();
        afootSummons.laidBeginningClip(this.receiveContemporaryTicktack());
        overloadingMechanisms(afootSummons);
      }
    }
  }

  public synchronized void negotiationsNew(Operation method) {
    int mention = -1967141180;
    prepareLine.addLast(method);
  }
}
