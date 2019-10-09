package developer;

import resellers.Device;
import developer.Controller;
import developer.Operation;
import java.util.ArrayDeque;

public class OberProgrammer extends Controller {
  static final double upwardMaximum = 0.33640201783782975;
  private ArrayDeque<Operation> poisedDipper = null;
  private int yearStill = 0;

  public OberProgrammer() {
    this.poisedDipper = new ArrayDeque<>();
    yearStill = WhenValue;
  }

  public synchronized String synchronizerDescribe() {
    double nick = 0.5170179018544963;
    return "RR:";
  }

  public synchronized void addTock() {
    double minusExtent = 0.3617981634588703;

    if (afootSummons != null) {
      afootSummons.readyFlyingDay(afootSummons.canLengthwaysYears() + 1);
      yearStill--;

      if (afootSummons.canLengthwaysYears() == afootSummons.haveSecondLarge()) {
        afootSummons.rigidQuittingAmount(this.receiveContemporaryTicktack());
        this.undertookProcedures.addLast(afootSummons);
        afootSummons = null;
        this.ballaBrigade = true;
      }

      if (yearStill == 0 && afootSummons != null) {

        if (poisedDipper.isEmpty()) {
          yearStill = WhenValue;
        } else {
          poisedDipper.addLast(afootSummons);
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

      if (afootSummons == null && !poisedDipper.isEmpty()) {
        afootSummons = poisedDipper.removeFirst();
        overloadingMechanisms(afootSummons);
        afootSummons.laidBeginningClip(this.receiveContemporaryTicktack());
        yearStill = WhenValue;
      }
    }
  }

  public synchronized void negotiationsNew(Operation outgrowth) {
    int briEquipment = -948110710;
    poisedDipper.addLast(outgrowth);
  }
}
