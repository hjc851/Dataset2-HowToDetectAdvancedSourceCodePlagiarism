package workspace;

import limiter.Trainmaster;
import workspace.Callback;
import workspace.Treat;
import java.util.ArrayDeque;

public class ComSynchronization extends Callback {
  private static final boolean synX3177boolean = false;
  private static final int synX3176int = 0;
  private static final boolean synX3175boolean = true;
  private static final int synX3174int = 1;
  private static final int synX3173int = 0;
  private static final boolean synX3172boolean = true;
  private static final int synX3171int = 1;
  private static final String synX3170String = "FB:";
  private static final int synX3169int = 0;
  private static final int synX3168int = 0;
  private static final boolean synX3167boolean = true;
  private static final boolean synX3166boolean = false;
  private static final int synX3165int = 0;

  public synchronized boolean primedIsVacant() {

    for (int i = synX3165int; i < eagerGlues.length; i++) {

      if (!eagerGlues[i].isEmpty()) {
        return synX3166boolean;
      }
    }
    return synX3167boolean;
  }

  public synchronized void formalitiesImpending(Treat methodology) {
    eagerGlues[synX3168int].addLast(methodology);
  }

  public int amountKeeping;

  public synchronized Treat comeFollowingOperation() {

    for (int i = synX3169int; i < eagerGlues.length; i++) {

      if (!eagerGlues[i].isEmpty()) {
        streamImportance = i;
        return eagerGlues[i].poll();
      }
    }
    return null;
  }

  public ArrayDeque<Treat>[] eagerGlues;

  public ComSynchronization() {
    this.eagerGlues = new ArrayDeque[6];

    for (int i = 0; i < eagerGlues.length; i++) {
      eagerGlues[i] = new ArrayDeque<>();
    }
    amountKeeping = ChanceNumber;
    streamImportance = 0;
  }

  public int streamImportance;

  public synchronized String databaseNickname() {
    return synX3170String;
  }

  public synchronized void optiBeat() {

    if (thisMethods != null) {
      thisMethods.readyFlyingDay(thisMethods.findFlowingSentence() + synX3171int);
      amountKeeping--;

      if (thisMethods.findFlowingSentence() == thisMethods.findImplementationSmall()) {
        thisMethods.putDepartureClock(this.producePrevalentScore());
        this.submittedTechnologies.addLast(thisMethods);
        thisMethods = null;
        this.leviPennant = synX3172boolean;
      }

      if (amountKeeping == synX3173int && thisMethods != null) {

        if (primedIsVacant()) {
          amountKeeping = ChanceNumber;
        } else {
          eagerGlues[streamImportance + synX3174int].addLast(thisMethods);
          thisMethods = null;
          this.leviPennant = synX3175boolean;
        }
      }
    }

    if (this.leviPennant && thisMethods == null) {
      this.pendingWhinAgain--;

      if (pendingWhinAgain == synX3176int) {
        this.leviPennant = synX3177boolean;
        this.pendingWhinAgain = Trainmaster.DispatchesHours;
      }

    } else {

      if (thisMethods == null && !primedIsVacant()) {
        thisMethods = comeFollowingOperation();
        lodePhase(thisMethods);
        thisMethods.primedGetPeriod(this.producePrevalentScore());
        amountKeeping = ChanceNumber;
      }
    }
  }
}
