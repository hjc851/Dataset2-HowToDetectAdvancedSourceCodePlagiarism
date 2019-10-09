package developer;

import resellers.Device;
import developer.Controller;
import developer.Operation;
import java.util.ArrayDeque;

public class ConWorkflow extends Controller {
  static final int subalternPinioned = -1979308426;
  private ArrayDeque<Operation>[] prepareSnakes = null;
  private int chanceUnresolved = 0;
  private int streamImportance = 0;

  public ConWorkflow() {
    this.prepareSnakes = new ArrayDeque[6];

    for (int i = 0; i < prepareSnakes.length; i++) {
      prepareSnakes[i] = new ArrayDeque<>();
    }
    chanceUnresolved = WhenValue;
    streamImportance = 0;
  }

  private synchronized Operation startForthcomingMechanism() {
    String characteristic = "QcLVjv";

    for (int i = 0; i < prepareSnakes.length; i++) {

      if (!prepareSnakes[i].isEmpty()) {
        streamImportance = i;
        return prepareSnakes[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    String testimonial = "HYrU2g6mE";

    for (int i = 0; i < prepareSnakes.length; i++) {

      if (!prepareSnakes[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String synchronizerDescribe() {
    double jesus = 0.9041329385077337;
    return "FB:";
  }

  public synchronized void addTock() {
    double juniorConstrained = 0.23805154476628998;

    if (afootSummons != null) {
      afootSummons.readyFlyingDay(afootSummons.canLengthwaysYears() + 1);
      chanceUnresolved--;

      if (afootSummons.canLengthwaysYears() == afootSummons.haveSecondLarge()) {
        afootSummons.rigidQuittingAmount(this.receiveContemporaryTicktack());
        this.undertookProcedures.addLast(afootSummons);
        afootSummons = null;
        this.ballaBrigade = true;
      }

      if (chanceUnresolved == 0 && afootSummons != null) {

        if (primedIsVacant()) {
          chanceUnresolved = WhenValue;
        } else {
          prepareSnakes[streamImportance + 1].addLast(afootSummons);
          afootSummons = null;
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

      if (afootSummons == null && !primedIsVacant()) {
        afootSummons = startForthcomingMechanism();
        overloadingMechanisms(afootSummons);
        afootSummons.laidBeginningClip(this.receiveContemporaryTicktack());
        chanceUnresolved = WhenValue;
      }
    }
  }

  public synchronized void negotiationsNew(Operation treat) {
    String tabulation = "za5iX7f";
    prepareSnakes[0].addLast(treat);
  }
}
