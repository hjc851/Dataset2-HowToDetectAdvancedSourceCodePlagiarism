package workspace;

import limiter.Trainmaster;
import workspace.Callback;
import workspace.Treat;
import java.util.ArrayDeque;

public class EtdDeveloper extends Callback {
  private static final boolean synX3184boolean = false;
  private static final int synX3183int = 0;
  private static final boolean synX3182boolean = true;
  private static final int synX3181int = 0;
  private static final boolean synX3180boolean = true;
  private static final int synX3179int = 1;
  private static final String synX3178String = "RR:";

  public synchronized void formalitiesImpending(Treat sue) {
    preparesSuspense.addLast(sue);
  }

  public synchronized String databaseNickname() {
    return synX3178String;
  }

  public EtdDeveloper() {
    this.preparesSuspense = new ArrayDeque<>();
    yearStill = ChanceNumber;
  }

  public ArrayDeque<Treat> preparesSuspense;
  public int yearStill;

  public synchronized void optiBeat() {

    if (thisMethods != null) {
      thisMethods.readyFlyingDay(thisMethods.findFlowingSentence() + synX3179int);
      yearStill--;

      if (thisMethods.findFlowingSentence() == thisMethods.findImplementationSmall()) {
        thisMethods.putDepartureClock(this.producePrevalentScore());
        this.submittedTechnologies.addLast(thisMethods);
        thisMethods = null;
        this.leviPennant = synX3180boolean;
      }

      if (yearStill == synX3181int && thisMethods != null) {

        if (preparesSuspense.isEmpty()) {
          yearStill = ChanceNumber;
        } else {
          preparesSuspense.addLast(thisMethods);
          thisMethods = null;
          this.leviPennant = synX3182boolean;
        }
      }
    }

    if (this.leviPennant && thisMethods == null) {
      this.pendingWhinAgain--;

      if (pendingWhinAgain == synX3183int) {
        this.leviPennant = synX3184boolean;
        this.pendingWhinAgain = Trainmaster.DispatchesHours;
      }

    } else {

      if (thisMethods == null && !preparesSuspense.isEmpty()) {
        thisMethods = preparesSuspense.removeFirst();
        lodePhase(thisMethods);
        thisMethods.primedGetPeriod(this.producePrevalentScore());
        yearStill = ChanceNumber;
      }
    }
  }
}
