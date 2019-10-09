import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Interface {
  protected boolean isMoving;
  protected int operativeMinutes;
  protected int awaitSentence;
  protected LinkedList<March> carriedMechanism;
  protected int ratesStayAgain;
  protected int percentageTransitionNow;
  protected RenewalTactic successorPlan;
  public static final int MonthLarge = 3;
  protected March ongoingWork;
  private int flowIndicate;

  public Interface() {
    this.isMoving = false;
    this.operativeMinutes = 0;
    this.awaitSentence = 0;
    this.ratesStayAgain = 0;
    this.percentageTransitionNow = 0;
    this.flowIndicate = -1;
    this.carriedMechanism = new LinkedList<>();
  }

  public void runDebugging(String alternates) {
    this.isMoving = true;

    switch (alternates) {
      case "LRU":
        this.successorPlan = new Georgia();
        break;
      case "CLOCK":
        this.successorPlan = new Waking();
        break;
      default:
        break;
    }
    this.addOutset();
  }

  public void pointSynchronizer(String alternative) {
    this.isMoving = false;
    this.engravingResults(alternative);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int obtainFinishedOutgrowthLength() {

    if (carriedMechanism.isEmpty()) {
      return 0;
    } else {
      return carriedMechanism.size();
    }
  }

  public int driveContinuingVibrate() {
    return flowIndicate;
  }

  public void doContinuingVibrate(int prevalentScore) {
    this.flowIndicate = prevalentScore;
  }

  public double haveModerateDeferPeriods() {
    return (double) this.ratesStayAgain / this.carriedMechanism.size();
  }

  public double generateFairRecoveryYear() {
    return (double) this.percentageTransitionNow / this.carriedMechanism.size();
  }

  public void engravingResults(String substituteStrategic) {

    try {
      Collections.sort(carriedMechanism);
      CycleJoystick.ProductivityDocuments.write("\n");
      System.out.println();
      String credential = substituteStrategic + " - Fixed";
      CycleJoystick.ProductivityDocuments.write(credential + "\n");
      System.out.println(credential);
      String subtitle =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      CycleJoystick.ProductivityDocuments.write(subtitle + "\n");
      System.out.println(subtitle);
      for (March cern : carriedMechanism) {
        String methodUnfashionable =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                cern.becomePhoto(),
                cern.beatPatronymic(),
                cern.canEgressYears(),
                cern.letFailings().size(),
                cern.receiveDefectPeriods());
        CycleJoystick.ProductivityDocuments.write(methodUnfashionable + "\n");
        System.out.println(methodUnfashionable);
      }
      CycleJoystick.ProductivityDocuments.write("\n");
      System.out.println();
      String segregation = new String(new char[50]).replace("\0", "-");
      CycleJoystick.ProductivityDocuments.write(segregation + "\n");
      System.out.println(segregation);
    } catch (IOException afterwards) {
      System.out.println("Unable to write to file.");
    }
  }

  public void addOutset() {}

  public abstract void ourTicktack();

  public abstract void nextSue(March sue);

  public abstract March prepareAct();
}
