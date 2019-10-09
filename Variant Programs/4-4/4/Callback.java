import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Callback {
  private int continuingVibrate = 0;
  protected Work underwayTreat = null;
  public static final int PeriodQualitative = 3;
  protected SwitchApproach fallbackStrategist = null;
  protected int modalUpswingMonth = 0;
  protected int levelJustThing = 0;
  protected java.util.LinkedList<Work> conductedServe = null;
  protected int hopeChance = 0;
  protected int flyingDay = 0;
  protected boolean isMoving = false;

  public Callback() {
    this.isMoving = false;
    this.flyingDay = 0;
    this.hopeChance = 0;
    this.levelJustThing = 0;
    this.modalUpswingMonth = 0;
    this.continuingVibrate = -1;
    this.conductedServe = new java.util.LinkedList<>();
  }

  public synchronized void openingInitialization(java.lang.String successor) {
    this.isMoving = true;

    switch (successor) {
      case "LRU":
        this.fallbackStrategist = new Arkansas();
        break;
      case "CLOCK":
        this.fallbackStrategist = new Back();
        break;
      default:
        break;
    }
    this.weapGet();
  }

  public synchronized void arrestCompiler(java.lang.String reinstatement) {
    this.isMoving = false;
    this.fontAudit(reinstatement);
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int catchFinalizeSueScale() {

    if (conductedServe.isEmpty()) {
      return 0;
    } else {
      return conductedServe.size();
    }
  }

  public synchronized int beatTypicalGenetic() {
    return continuingVibrate;
  }

  public synchronized void layContemporaryTicktack(int latestTicktock) {
    this.continuingVibrate = latestTicktock;
  }

  public synchronized double producePercentageTakeNow() {
    return (double) this.levelJustThing / this.conductedServe.size();
  }

  public synchronized double beatHalfTurnJuncture() {
    return (double) this.modalUpswingMonth / this.conductedServe.size();
  }

  public synchronized void fontAudit(java.lang.String surrogateVision) {

    try {
      java.lang.String championship;
      java.lang.String headwater;
      java.lang.String delimiter;
      java.util.Collections.sort(conductedServe);
      ProcedureSimulation.PerformanceArchives.write("\n");
      System.out.println();
      championship = surrogateVision + " - Fixed";
      ProcedureSimulation.PerformanceArchives.write(championship + "\n");
      System.out.println(championship);
      headwater =
          java.lang.String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      ProcedureSimulation.PerformanceArchives.write(headwater + "\n");
      System.out.println(headwater);
      for (Work vig : conductedServe) {
        java.lang.String proceduresQuenched;
        proceduresQuenched =
            java.lang.String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                vig.canOwnership(),
                vig.takeCall(),
                vig.generateDieYear(),
                vig.makeFracture().size(),
                vig.findErrorYears());
        ProcedureSimulation.PerformanceArchives.write(proceduresQuenched + "\n");
        System.out.println(proceduresQuenched);
      }
      ProcedureSimulation.PerformanceArchives.write("\n");
      System.out.println();
      delimiter = new java.lang.String(new char[50]).replace("\0", "-");
      ProcedureSimulation.PerformanceArchives.write(delimiter + "\n");
      System.out.println(delimiter);
    } catch (java.io.IOException eden) {
      System.out.println("Unable to write to file.");
    }
  }

  public synchronized void weapGet() {}

  public abstract void snoTicktock();

  public abstract void entranceMethod(Work system);

  public abstract Work availableSummons();
}
