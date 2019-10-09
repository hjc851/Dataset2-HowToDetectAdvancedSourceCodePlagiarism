import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.lang.System.out;
import static java.util.Collections.sort;
import static java.lang.String.format;

public abstract class Outliner {
  private int actualRetick;
  protected Litigate continuingMechanisms;
  public static final int ClipQuantity = 3;
  protected SuccessorPlan replacesFramework;
  protected int rateShiftYears;
  protected int proportionAwaitsBeginning;
  protected java.util.LinkedList<Litigate> finalizeSue;
  protected int awaitSentence;
  protected int gushingNow;
  protected boolean isMoving;

  public Outliner() {
    this.isMoving = (false);
    this.gushingNow = (0);
    this.awaitSentence = (0);
    this.proportionAwaitsBeginning = (0);
    this.rateShiftYears = (0);
    this.actualRetick = (-1);
    this.finalizeSue = (new java.util.LinkedList<>());
  }

  public synchronized void goTimer(java.lang.String backup) {
    this.isMoving = (true);

    switch (backup) {
      case "LRU":
        this.replacesFramework = (new Nebraska());
        break;
      case "CLOCK":
        this.replacesFramework = (new Clockwork());
        break;
      default:
        break;
    }
    this.optiCommence();
  }

  public synchronized void blockageCallback(java.lang.String replaces) {
    this.isMoving = (false);
    this.paperReputation(replaces);
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int becomeConcludedPracticesQuantity() {

    if (finalizeSue.isEmpty()) {
      return 0;
    } else {
      return finalizeSue.size();
    }
  }

  public synchronized int takeTopicalMark() {
    return actualRetick;
  }

  public synchronized void fitUnderwayWalk(int liveTic) {
    this.actualRetick = (liveTic);
  }

  public synchronized double takeMeanSitPeriod() {
    return (double) this.proportionAwaitsBeginning / this.finalizeSue.size();
  }

  public synchronized double conveyRegularAdjustmentAmount() {
    return (double) this.rateShiftYears / this.finalizeSue.size();
  }

  public synchronized void paperReputation(java.lang.String substitutionPolicies) {

    try {
      java.lang.String diploma;
      java.lang.String cope;
      java.lang.String segregation;
      sort(finalizeSue);
      WorkSimulating.AmperageSubmitting.write("\n");
      out.println();
      diploma = (substitutionPolicies + " - Fixed");
      WorkSimulating.AmperageSubmitting.write(diploma + "\n");
      out.println(diploma);
      cope =
          (format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times"));
      WorkSimulating.AmperageSubmitting.write(cope + "\n");
      out.println(cope);
      for (Litigate postscript : finalizeSue) {
        java.lang.String methodsOutgoing;
        methodsOutgoing =
            (format(
                "%-7d%-16s%-19d%-11d%-10s",
                postscript.arriveIdentifying(),
                postscript.developDiagnose(),
                postscript.catchExpireWhen(),
                postscript.findError().size(),
                postscript.startResponsibilityPlaces()));
        WorkSimulating.AmperageSubmitting.write(methodsOutgoing + "\n");
        out.println(methodsOutgoing);
      }
      WorkSimulating.AmperageSubmitting.write("\n");
      out.println();
      segregation = (new java.lang.String(new char[50]).replace("\0", "-"));
      WorkSimulating.AmperageSubmitting.write(segregation + "\n");
      out.println(segregation);
    } catch (java.io.IOException adoptee) {
      out.println("Unable to write to file.");
    }
  }

  public synchronized void optiCommence() {}

  public abstract void bpsRetick();

  public abstract void futureMarch(Litigate methods);

  public abstract Litigate ripeOutgrowth();
}
