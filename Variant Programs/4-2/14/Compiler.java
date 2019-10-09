import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Compiler {
  protected boolean isMoving;
  protected int rushingAgain;
  protected int delayHour;
  protected LinkedList<Mechanisms> finalizingSystems;
  protected int normLookSentence;
  protected int ordinaryTransformationDay;
  protected ReplaceableSds substitutionPolicies;
  public static final int ChanceNumber = 3;
  protected Mechanisms topicalAppendage;
  private int incumbentTock;

  public Compiler() {
    this.isMoving = false;
    this.rushingAgain = 0;
    this.delayHour = 0;
    this.normLookSentence = 0;
    this.ordinaryTransformationDay = 0;
    this.incumbentTock = -1;
    this.finalizingSystems = new LinkedList<>();
  }

  public void kickoffSpooler(String successor) {
    this.isMoving = true;

    switch (successor) {
      case "LRU":
        this.substitutionPolicies = new Memphis();
        break;
      case "CLOCK":
        this.substitutionPolicies = new Hours();
        break;
      default:
        break;
    }
    this.snoBeginning();
  }

  public void stoppageController(String substitution) {
    this.isMoving = false;
    this.publicationsFindings(substitution);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int fixAchievedMechanismsProportions() {

    if (finalizingSystems.isEmpty()) {
      return 0;
    } else {
      return finalizingSystems.size();
    }
  }

  public int takeTopicalMark() {
    return incumbentTock;
  }

  public void primedTopicalMark(int underwayWalk) {
    this.incumbentTock = underwayWalk;
  }

  public double fixRatioLeaveChance() {
    return (double) this.normLookSentence / this.finalizingSystems.size();
  }

  public double becomeApproximatelyChangeOpportunity() {
    return (double) this.ordinaryTransformationDay / this.finalizingSystems.size();
  }

  public void publicationsFindings(String transpositionInitiative) {

    try {
      Collections.sort(finalizingSystems);
      CycleJoystick.IntensityReadme.write("\n");
      System.out.println();
      String trophy = transpositionInitiative + " - Fixed";
      CycleJoystick.IntensityReadme.write(trophy + "\n");
      System.out.println(trophy);
      String heading =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      CycleJoystick.IntensityReadme.write(heading + "\n");
      System.out.println(heading);
      for (Mechanisms writes : finalizingSystems) {
        String cycleProscribed =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                writes.beatUser(),
                writes.conveyPseudonym(),
                writes.haveReleasePeriods(),
                writes.startMalfunctions().size(),
                writes.findErrorYears());
        CycleJoystick.IntensityReadme.write(cycleProscribed + "\n");
        System.out.println(cycleProscribed);
      }
      CycleJoystick.IntensityReadme.write("\n");
      System.out.println();
      String distance = new String(new char[50]).replace("\0", "-");
      CycleJoystick.IntensityReadme.write(distance + "\n");
      System.out.println(distance);
    } catch (IOException abel) {
      System.out.println("Unable to write to file.");
    }
  }

  public void snoBeginning() {}

  public abstract void nsoTic();

  public abstract void inpouringSystem(Mechanisms methodology);

  public abstract Mechanisms preparingSystem();
}
