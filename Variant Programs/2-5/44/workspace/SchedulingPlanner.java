package workspace;

import limiter.Trainmaster;
import workspace.Callback;
import workspace.Treat;
import java.util.ArrayDeque;

public class SchedulingPlanner extends Callback {
  private static final String synX3196String = "FCFS:";
  private static final boolean synX3195boolean = false;
  private static final int synX3194int = 0;
  private static final boolean synX3193boolean = true;
  private static final int synX3192int = 1;
  public ArrayDeque<Treat> eagerJunk;

  public synchronized void optiBeat() {

    if (thisMethods != null) {
      thisMethods.readyFlyingDay(thisMethods.findFlowingSentence() + synX3192int);

      if (thisMethods.findFlowingSentence() == thisMethods.findImplementationSmall()) {
        thisMethods.putDepartureClock(this.producePrevalentScore());
        this.submittedTechnologies.addLast(thisMethods);
        thisMethods = null;
        this.leviPennant = synX3193boolean;
      }
    }

    if (this.leviPennant && thisMethods == null) {
      this.pendingWhinAgain--;

      if (pendingWhinAgain == synX3194int) {
        this.leviPennant = synX3195boolean;
        this.pendingWhinAgain = Trainmaster.DispatchesHours;
      }

    } else {

      if (thisMethods == null && !eagerJunk.isEmpty()) {
        thisMethods = eagerJunk.removeFirst();
        thisMethods.primedGetPeriod(this.producePrevalentScore());
        lodePhase(thisMethods);
      }
    }
  }

  public SchedulingPlanner() {
    this.eagerJunk = new ArrayDeque<>();
  }

  public synchronized String databaseNickname() {
    return synX3196String;
  }

  public synchronized void formalitiesImpending(Treat act) {
    eagerJunk.addLast(act);
  }
}
