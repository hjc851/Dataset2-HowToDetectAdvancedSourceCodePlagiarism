import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Developer {
  protected boolean isMoving;
  protected int jettingWhen;
  protected int lagAgain;
  protected LinkedList<March> conductedServe;
  protected int meanSitPeriod;
  protected int intermediateImprovementDays;
  protected ReplacingScheme successorPlan;
  public static final int ChanceNumber = 3;
  protected March ongoingWork;
  private int rifeCheck;

  public Developer() {
    this.isMoving = false;
    this.jettingWhen = 0;
    this.lagAgain = 0;
    this.meanSitPeriod = 0;
    this.intermediateImprovementDays = 0;
    this.rifeCheck = -1;
    this.conductedServe = new LinkedList<>();
  }

  public void runDebugging(String replaces) {
    this.isMoving = true;

    switch (replaces) {
      case "LRU":
        this.successorPlan = new Alabama();
        break;
      case "CLOCK":
        this.successorPlan = new Time();
        break;
      default:
        break;
    }
    this.addOutset();
  }

  public void stoppageController(String alternatives) {
    this.isMoving = false;
    this.printerAccount(alternatives);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int conveyFulfilledMethodNumber() {

    if (conductedServe.isEmpty()) {
      return 0;
    } else {
      return conductedServe.size();
    }
  }

  public int sustainThisValidation() {
    return rifeCheck;
  }

  public void primedTopicalMark(int continuingVibrate) {
    this.rifeCheck = continuingVibrate;
  }

  public double haveModerateDeferPeriods() {
    return (double) this.meanSitPeriod / this.conductedServe.size();
  }

  public double catchCommonRevivalWhen() {
    return (double) this.intermediateImprovementDays / this.conductedServe.size();
  }

  public void printerAccount(String substituteStrategic) {

    try {
      Collections.sort(conductedServe);
      WorkSimulating.ProducerSubmitted.write("\n");
      System.out.println();
      String rights = substituteStrategic + " - Fixed";
      WorkSimulating.ProducerSubmitted.write(rights + "\n");
      System.out.println(rights);
      String drainpipe =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      WorkSimulating.ProducerSubmitted.write(drainpipe + "\n");
      System.out.println(drainpipe);
      for (March vig : conductedServe) {
        String sueUnstylish =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                vig.driveSecurity(),
                vig.haveFigure(),
                vig.bringLossMeter(),
                vig.findError().size(),
                vig.beatFailuresCircumstances());
        WorkSimulating.ProducerSubmitted.write(sueUnstylish + "\n");
        System.out.println(sueUnstylish);
      }
      WorkSimulating.ProducerSubmitted.write("\n");
      System.out.println();
      String supplement = new String(new char[50]).replace("\0", "-");
      WorkSimulating.ProducerSubmitted.write(supplement + "\n");
      System.out.println(supplement);
    } catch (IOException vet) {
      System.out.println("Unable to write to file.");
    }
  }

  public void addOutset() {}

  public abstract void bsiShudder();

  public abstract void inwardServe(March work);

  public abstract March ableMechanism();
}
