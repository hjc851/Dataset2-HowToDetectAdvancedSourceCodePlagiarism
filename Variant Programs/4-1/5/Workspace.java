import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Workspace {
  protected boolean isMoving;
  protected int goingThing;
  protected int anticipationNow;
  protected LinkedList<Procedure> achievedMechanisms;
  protected int commonSeeWhen;
  protected int ratesBreakthroughAgain;
  protected ReplacedPlaybook alternatesGie;
  public static final int ThingLibido = 3;
  protected Procedure ongoingWork;
  private int ongoingBeat;

  public Workspace() {
    this.isMoving = false;
    this.goingThing = 0;
    this.anticipationNow = 0;
    this.commonSeeWhen = 0;
    this.ratesBreakthroughAgain = 0;
    this.ongoingBeat = -1;
    this.achievedMechanisms = new LinkedList<>();
  }

  public void openingInitialization(String transposition) {
    this.isMoving = true;

    switch (transposition) {
      case "LRU":
        this.alternatesGie = new Xavier();
        break;
      case "CLOCK":
        this.alternatesGie = new Day();
        break;
      default:
        break;
    }
    this.bpsGo();
  }

  public void blockageCallback(String replaces) {
    this.isMoving = false;
    this.brailleBriefing(replaces);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int makeUndertakenMarchDimensions() {

    if (achievedMechanisms.isEmpty()) {
      return 0;
    } else {
      return achievedMechanisms.size();
    }
  }

  public int catchRifeCheck() {
    return ongoingBeat;
  }

  public void fixThisValidation(int presentRicky) {
    this.ongoingBeat = presentRicky;
  }

  public double beatHalfNotJuncture() {
    return (double) this.commonSeeWhen / this.achievedMechanisms.size();
  }

  public double developTypicalRevitalizationHour() {
    return (double) this.ratesBreakthroughAgain / this.achievedMechanisms.size();
  }

  public void brailleBriefing(String fallbackStrategist) {

    try {
      Collections.sort(achievedMechanisms);
      ProceduresMoot.ProducedExecutable.write("\n");
      System.out.println();
      String legend = fallbackStrategist + " - Fixed";
      ProceduresMoot.ProducedExecutable.write(legend + "\n");
      System.out.println(legend);
      String headline =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      ProceduresMoot.ProducedExecutable.write(headline + "\n");
      System.out.println(headline);
      for (Procedure vig : achievedMechanisms) {
        String systemTaboo =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                vig.becomePhoto(),
                vig.drawGens(),
                vig.developPulloutHour(),
                vig.produceFailures().size(),
                vig.canProblemIntervals());
        ProceduresMoot.ProducedExecutable.write(systemTaboo + "\n");
        System.out.println(systemTaboo);
      }
      ProceduresMoot.ProducedExecutable.write("\n");
      System.out.println();
      String seam = new String(new char[50]).replace("\0", "-");
      ProceduresMoot.ProducedExecutable.write(seam + "\n");
      System.out.println(seam);
    } catch (IOException pro) {
      System.out.println("Unable to write to file.");
    }
  }

  public void bpsGo() {}

  public abstract void bpsRetick();

  public abstract void ingoingProcedure(Procedure method);

  public abstract Procedure willingWork();
}
