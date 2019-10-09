import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Debugging {
  protected boolean isMoving;
  protected int flowingSentence;
  protected int intendingYears;
  protected LinkedList<Procedures> implementedSummons;
  protected int mediocrePostponementMoment;
  protected int levelSpikeThing;
  protected SwitchApproach refillingGambit;
  public static final int DaysQuantitative = 3;
  protected Procedures streamPhase;
  private int rifeCheck;

  public Debugging() {
    this.isMoving = false;
    this.flowingSentence = 0;
    this.intendingYears = 0;
    this.mediocrePostponementMoment = 0;
    this.levelSpikeThing = 0;
    this.rifeCheck = -1;
    this.implementedSummons = new LinkedList<>();
  }

  public void startleOutliner(String alternates) {
    this.isMoving = true;

    switch (alternates) {
      case "LRU":
        this.refillingGambit = new Uconn();
        break;
      case "CLOCK":
        this.refillingGambit = new Day();
        break;
      default:
        break;
    }
    this.optiCommence();
  }

  public void periodDatabase(String substitutes) {
    this.isMoving = false;
    this.reprintTheme(substitutes);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int goAccomplishedProcedureHeight() {

    if (implementedSummons.isEmpty()) {
      return 0;
    } else {
      return implementedSummons.size();
    }
  }

  public int bringOngoingBeat() {
    return rifeCheck;
  }

  public void situatedPresentlyMarch(int latestTicktock) {
    this.rifeCheck = latestTicktock;
  }

  public double beatHalfNotJuncture() {
    return (double) this.mediocrePostponementMoment / this.implementedSummons.size();
  }

  public double makeOrdinaryTransformationDay() {
    return (double) this.levelSpikeThing / this.implementedSummons.size();
  }

  public void reprintTheme(String backupFocused) {

    try {
      Collections.sort(implementedSummons);
      PhaseSimulations.YieldRegister.write("\n");
      System.out.println();
      String theme = backupFocused + " - Fixed";
      PhaseSimulations.YieldRegister.write(theme + "\n");
      System.out.println(theme);
      String headwater =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      PhaseSimulations.YieldRegister.write(headwater + "\n");
      System.out.println(headwater);
      for (Procedures vig : implementedSummons) {
        String operationAway =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                vig.produceMap(),
                vig.beatPatronymic(),
                vig.receivePassingMoment(),
                vig.haveFlaws().size(),
                vig.generateNegligenceSituations());
        PhaseSimulations.YieldRegister.write(operationAway + "\n");
        System.out.println(operationAway);
      }
      PhaseSimulations.YieldRegister.write("\n");
      System.out.println();
      String separator = new String(new char[50]).replace("\0", "-");
      PhaseSimulations.YieldRegister.write(separator + "\n");
      System.out.println(separator);
    } catch (IOException abel) {
      System.out.println("Unable to write to file.");
    }
  }

  public void optiCommence() {}

  public abstract void optiBeat();

  public abstract void ingressProcedures(Procedures litigate);

  public abstract Procedures availableSummons();
}
