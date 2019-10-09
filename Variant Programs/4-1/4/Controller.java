import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Controller {
  protected boolean isMoving;
  protected int fleeingMonth;
  protected int awaitingClip;
  protected LinkedList<Summons> executedMethods;
  protected int fairPostponeYear;
  protected int ratesBreakthroughAgain;
  protected ReplacedPlaybook alternativesProgram;
  public static final int SentenceTeleportation = 3;
  protected Summons actualAct;
  private int topicalMark;

  public Controller() {
    this.isMoving = false;
    this.fleeingMonth = 0;
    this.awaitingClip = 0;
    this.fairPostponeYear = 0;
    this.ratesBreakthroughAgain = 0;
    this.topicalMark = -1;
    this.executedMethods = new LinkedList<>();
  }

  public void beginsCallback(String transposition) {
    this.isMoving = true;

    switch (transposition) {
      case "LRU":
        this.alternativesProgram = new Lus();
        break;
      case "CLOCK":
        this.alternativesProgram = new Waking();
        break;
      default:
        break;
    }
    this.ourFirst();
  }

  public void layoverConfiguration(String substitutes) {
    this.isMoving = false;
    this.printerAccount(substitutes);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int conveyFulfilledMethodNumber() {

    if (executedMethods.isEmpty()) {
      return 0;
    } else {
      return executedMethods.size();
    }
  }

  public int driveContinuingVibrate() {
    return topicalMark;
  }

  public void readyIncumbentTock(int rifeCheck) {
    this.topicalMark = rifeCheck;
  }

  public double haveModerateDeferPeriods() {
    return (double) this.fairPostponeYear / this.executedMethods.size();
  }

  public double obtainIntermediateImprovementDays() {
    return (double) this.ratesBreakthroughAgain / this.executedMethods.size();
  }

  public void printerAccount(String successorPlan) {

    try {
      Collections.sort(executedMethods);
      ProceduresMoot.AmperageSubmitting.write("\n");
      System.out.println();
      String titolo = successorPlan + " - Fixed";
      ProceduresMoot.AmperageSubmitting.write(titolo + "\n");
      System.out.println(titolo);
      String chaired =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      ProceduresMoot.AmperageSubmitting.write(chaired + "\n");
      System.out.println(chaired);
      for (Summons vig : executedMethods) {
        String methodsOutgoing =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                vig.sustainSelf(),
                vig.letDistinguish(),
                vig.canEgressYears(),
                vig.obtainDemerit().size(),
                vig.letFaultySometimes());
        ProceduresMoot.AmperageSubmitting.write(methodsOutgoing + "\n");
        System.out.println(methodsOutgoing);
      }
      ProceduresMoot.AmperageSubmitting.write("\n");
      System.out.println();
      String divider = new String(new char[50]).replace("\0", "-");
      ProceduresMoot.AmperageSubmitting.write(divider + "\n");
      System.out.println(divider);
    } catch (IOException pro) {
      System.out.println("Unable to write to file.");
    }
  }

  public void ourFirst() {}

  public abstract void nsoTic();

  public abstract void enteringAppendage(Summons mechanisms);

  public abstract Summons wantMechanisms();
}
