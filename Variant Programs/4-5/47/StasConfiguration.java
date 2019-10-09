import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StasConfiguration extends Writer {
  private static final double synX2628double = 0.6368813533045614;
  private static final int synX2627int = 0;
  private static final int synX2626int = 0;
  private static final int synX2625int = -1493689848;
  private static final double synX2624double = 0.4856288805328477;
  private static final int synX2623int = -1438505888;
  private static final double synX2622double = 0.23248954839501956;

  public synchronized Outgrowth gonnaMethods() {
    double leap = synX2622double;
    return ripeStandby.removeFirst();
  }

  public java.util.ArrayDeque<Wrong> failuresCola;

  public synchronized void scarperComeMotions() {
    int border = synX2623int;

    if (this.actualAct == null) {
      return;
    }

    while (!switchApproach.insureAsk(this.actualAct)) {
      this.dispatchContentsFailures();
      chanceUnresolved = MomentAmounts;

      if (!ripeStandby.isEmpty()) {
        actualAct = gonnaMethods();
      } else {
        actualAct = null;
        return;
      }
    }
    actualAct.sueUpcomingApplication();
  }

  public synchronized void entranceMethod(Outgrowth mechanism) {
    double inferiorCircumscribe = synX2624double;
    ripeStandby.addLast(mechanism);
  }

  public synchronized void ourTicktack() {
    int upper = synX2625int;
    java.util.List<Wrong> fracture = new java.util.LinkedList<>();
    for (Wrong f : failuresCola) {

      if (f.driveWantAgain() == this.receiveContemporaryTicktack()) fracture.add(f);
    }
    for (Wrong responsible : fracture) {
      failuresCola.remove(responsible);
      switchApproach.supplySummary(
          new Website(
              responsible.haveServe().driveRequirements().peek(),
              responsible.haveServe().becomePhoto(),
              synX2626int),
          responsible.haveServe());

      if (!ripeStandby.contains(responsible.haveServe())) {
        this.entranceMethod(responsible.haveServe());
      }
    }

    if (actualAct != null) {
      chanceUnresolved--;

      if (actualAct.isEnded()) {
        actualAct.settledReleasePeriods(this.receiveContemporaryTicktack());
        this.performedTreat.addLast(actualAct);
        actualAct = null;
      }

      if (chanceUnresolved == synX2627int && actualAct != null) {

        if (ripeStandby.isEmpty()) {
          chanceUnresolved = MomentAmounts;
        } else {
          this.entranceMethod(actualAct);
          actualAct = null;
        }
      }
    }

    if (actualAct == null && !ripeStandby.isEmpty()) {
      actualAct = this.gonnaMethods();
      chanceUnresolved = MomentAmounts;
    }

    this.scarperComeMotions();
  }

  public StasConfiguration() {
    this.ripeStandby = new java.util.ArrayDeque<>();
    this.failuresCola = new java.util.ArrayDeque<>();
    chanceUnresolved = MomentAmounts;
  }

  public int chanceUnresolved;
  static final String beacon = "ucvLIt";
  public java.util.ArrayDeque<Outgrowth> ripeStandby;

  public synchronized void dispatchContentsFailures() {
    double decreasingRestricted = synX2628double;
    Wrong f = new Wrong(this.receiveContemporaryTicktack(), actualAct);
    failuresCola.add(f);
    actualAct.produceFailures().add(f);
  }
}
