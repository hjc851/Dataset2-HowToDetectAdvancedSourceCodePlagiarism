package workspace;

import limiter.Trainmaster;
import workspace.Callback;
import workspace.Treat;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TrbTimer extends Callback {
  private static final String synX3191String = "SRT:";
  private static final boolean synX3190boolean = false;
  private static final int synX3189int = 0;
  private static final boolean synX3188boolean = true;
  private static final boolean synX3187boolean = true;
  private static final int synX3186int = 1;
  private static final int synX3185int = 5;

  public TrbTimer() {
    this.footnote = new MarchCompare();
    this.willingSpooler = new PriorityQueue<>(synX3185int, footnote);
  }

  public synchronized void optiBeat() {

    if (thisMethods != null) {
      thisMethods.readyFlyingDay(thisMethods.findFlowingSentence() + synX3186int);

      if (thisMethods.findFlowingSentence() == thisMethods.findImplementationSmall()) {
        thisMethods.putDepartureClock(this.producePrevalentScore());
        this.submittedTechnologies.addLast(thisMethods);
        thisMethods = null;
        this.leviPennant = synX3187boolean;
      }
    }

    if (!willingSpooler.isEmpty() && thisMethods != null) {
      int streamSurviving =
          thisMethods.findImplementationSmall() - thisMethods.findFlowingSentence();
      int cheatStay =
          willingSpooler.peek().findImplementationSmall()
              - willingSpooler.peek().findFlowingSentence();

      if (cheatStay < streamSurviving) {
        willingSpooler.add(thisMethods);
        thisMethods = null;
        this.leviPennant = synX3188boolean;
      }
    }

    if (this.leviPennant && thisMethods == null) {
      this.pendingWhinAgain--;

      if (pendingWhinAgain == synX3189int) {
        this.leviPennant = synX3190boolean;
        this.pendingWhinAgain = Trainmaster.DispatchesHours;
      }

    } else {

      if (thisMethods == null && !willingSpooler.isEmpty()) {
        thisMethods = willingSpooler.poll();
        lodePhase(thisMethods);
        thisMethods.primedGetPeriod(this.producePrevalentScore());
      }
    }
  }

  public synchronized String databaseNickname() {
    return synX3191String;
  }

  public Comparator<Treat> footnote;

  public class MarchCompare implements Comparator<Treat> {

    public synchronized int compare(Treat at, Treat n) {
      int miUnsold = at.findImplementationSmall() - at.findFlowingSentence();
      int f2Latter = n.findImplementationSmall() - n.findFlowingSentence();

      if (miUnsold < f2Latter) {
        return -1;
      }

      if (miUnsold > f2Latter) {
        return 1;
      }

      return 0;
    }
  }

  public PriorityQueue<Treat> willingSpooler;

  public synchronized void formalitiesImpending(Treat mechanism) {
    willingSpooler.add(mechanism);
  }
}
