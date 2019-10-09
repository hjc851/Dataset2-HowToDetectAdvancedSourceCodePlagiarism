import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Workspace {
  protected boolean isMoving;
  protected int gushingNow;
  protected int awaitedDay;
  protected LinkedList<Mechanism> conductedServe;
  protected int moderateDeferPeriods;
  protected int typicalRevitalizationHour;
  protected SuccessorPlan fallbackStrategist;
  public static final int PeriodsGigantic = 3;
  protected Mechanism theMethodology;
  private int prevalentScore;

  public Workspace() {
    this.isMoving = false;
    this.gushingNow = 0;
    this.awaitedDay = 0;
    this.moderateDeferPeriods = 0;
    this.typicalRevitalizationHour = 0;
    this.prevalentScore = -1;
    this.conductedServe = new LinkedList<>();
  }

  public void earlyWorkspace(String replaces) {
    this.isMoving = true;

    switch (replaces) {
      case "LRU":
        this.fallbackStrategist = new Lus();
        break;
      case "CLOCK":
        this.fallbackStrategist = new Stopwatch();
        break;
      default:
        break;
    }
    this.nsoInitiate();
  }

  public void diaphragmWorkspace(String replacing) {
    this.isMoving = false;
    this.reprintingSurvey(replacing);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int developSubmittedTechnologiesStature() {

    if (conductedServe.isEmpty()) {
      return 0;
    } else {
      return conductedServe.size();
    }
  }

  public int conveyFormerGene() {
    return prevalentScore;
  }

  public void bentPreviousAnswer(int streamBookmark) {
    this.prevalentScore = streamBookmark;
  }

  public double makeOrdinaryHoldDay() {
    return (double) this.moderateDeferPeriods / this.conductedServe.size();
  }

  public double bringMiddlingTurnaboutMeter() {
    return (double) this.typicalRevitalizationHour / this.conductedServe.size();
  }

  public void reprintingSurvey(String replacedPlaybook) {

    try {
      Collections.sort(conductedServe);
      MethodologyEmulator.YieldRegister.write("\n");
      System.out.println();
      String claim = replacedPlaybook + " - Fixed";
      MethodologyEmulator.YieldRegister.write(claim + "\n");
      System.out.println(claim);
      String manifold =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      MethodologyEmulator.YieldRegister.write(manifold + "\n");
      System.out.println(manifold);
      for (Mechanism postscript : conductedServe) {
        String methodologyProhibited =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                postscript.findIdentifier(),
                postscript.generateAppoint(),
                postscript.goDepartureClock(),
                postscript.arriveDeficiencies().size(),
                postscript.canProblemIntervals());
        MethodologyEmulator.YieldRegister.write(methodologyProhibited + "\n");
        System.out.println(methodologyProhibited);
      }
      MethodologyEmulator.YieldRegister.write("\n");
      System.out.println();
      String splitting = new String(new char[50]).replace("\0", "-");
      MethodologyEmulator.YieldRegister.write(splitting + "\n");
      System.out.println(splitting);
    } catch (IOException abbe) {
      System.out.println("Unable to write to file.");
    }
  }

  public void nsoInitiate() {}

  public abstract void ourTicktack();

  public abstract void enteringAppendage(Mechanism methodology);

  public abstract Mechanism fitMarch();
}
