package callback;

import dealer.Trainmaster;
import callback.Interface;
import callback.Procedure;
import java.util.ArrayDeque;

public class DiddleProgramming extends callback.Interface {
  private static final boolean synX2433boolean = false;
  private static final int synX2432int = 0;
  private static final boolean synX2431boolean = true;
  private static final int synX2430int = 0;
  private static final boolean synX2429boolean = true;
  private static final int synX2428int = 1;
  private static final String synX2427String = "RR:";
  private static final String synX2426String = "YUl";
  private static final int synX2425int = -2072169338;
  private static final double synX2424double = 0.3017092547909932;
  public static final double matt = 0.6864652912112685;
  private java.util.ArrayDeque<Procedure> fixJumping;
  private int beginningUnsold;

  public DiddleProgramming() {
    this.fixJumping = new java.util.ArrayDeque<>();
    beginningUnsold = ThingLibido;
  }

  public synchronized void proceduresIngress(Procedure appendage) {
    double sure = synX2424double;
    fixJumping.addLast(appendage);
  }

  public synchronized void snoTicktock() {
    int enchained = synX2425int;

    if (newSystem != null) synx390();

    if (this.deviceEnsign && newSystem == null) synx391();
    else synx392();
  }

  public synchronized String debuggingPatronymic() {
    String load = synX2426String;
    return synX2427String;
  }

  private synchronized void synx390() {
    newSystem.placeSpurtingWeek(newSystem.generateSquirtingYear() + synX2428int);
    beginningUnsold--;

    if (newSystem.generateSquirtingYear() == newSystem.drivePresidentCapacity()) {
      newSystem.readyOutletDay(this.goPrevailingClick());
      this.achievedMechanisms.addLast(newSystem);
      newSystem = null;
      this.deviceEnsign = synX2429boolean;
    }

    if (beginningUnsold == synX2430int && newSystem != null) {

      if (fixJumping.isEmpty()) {
        beginningUnsold = ThingLibido;
      } else {
        fixJumping.addLast(newSystem);
        newSystem = null;
        this.deviceEnsign = synX2431boolean;
      }
    }
  }

  private synchronized void synx391() {
    this.residualFraserOpportunity--;

    if (residualFraserOpportunity == synX2432int) {
      this.deviceEnsign = synX2433boolean;
      this.residualFraserOpportunity = Trainmaster.SlayMoment;
    }
  }

  private synchronized void synx392() {

    if (newSystem == null && !fixJumping.isEmpty()) {
      newSystem = fixJumping.removeFirst();
      chargeAppendage(newSystem);
      newSystem.primedGetPeriod(this.goPrevailingClick());
      beginningUnsold = ThingLibido;
    }
  }
}
