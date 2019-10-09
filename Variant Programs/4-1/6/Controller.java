import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Controller {
  protected boolean isMoving;
  protected int rushingAgain;
  protected int anticipationNow;
  protected LinkedList<Summons> realizedWork;
  protected int overallLetMinutes;
  protected int ordinaryTransformationDay;
  protected SubstituteStrategic transpositionInitiative;
  public static final int BeginningMammoth = 3;
  protected Summons previousProceeding;
  private int previousAnswer;

  public Controller() {
    this.isMoving = false;
    this.rushingAgain = 0;
    this.anticipationNow = 0;
    this.overallLetMinutes = 0;
    this.ordinaryTransformationDay = 0;
    this.previousAnswer = -1;
    this.realizedWork = new LinkedList<>();
  }

  public void offsetCompiler(String renewal) {
    this.isMoving = true;

    switch (renewal) {
      case "LRU":
        this.transpositionInitiative = new Boise();
        break;
      case "CLOCK":
        this.transpositionInitiative = new Synch();
        break;
      default:
        break;
    }
    this.addOutset();
  }

  public void interceptSpooler(String substitutes) {
    this.isMoving = false;
    this.copyStatement(substitutes);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int becomeConcludedPracticesQuantity() {

    if (realizedWork.isEmpty()) {
      return 0;
    } else {
      return realizedWork.size();
    }
  }

  public int driveContinuingVibrate() {
    return previousAnswer;
  }

  public void readyIncumbentTock(int latestTicktock) {
    this.previousAnswer = latestTicktock;
  }

  public double developTypicalAwaitedHour() {
    return (double) this.overallLetMinutes / this.realizedWork.size();
  }

  public double letMediumReorganizationHours() {
    return (double) this.ordinaryTransformationDay / this.realizedWork.size();
  }

  public void copyStatement(String permutationConcept) {

    try {
      Collections.sort(realizedWork);
      LitigateMimic.VolumeArchiving.write("\n");
      System.out.println();
      String qualification = permutationConcept + " - Fixed";
      LitigateMimic.VolumeArchiving.write(qualification + "\n");
      System.out.println(qualification);
      String lintel =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      LitigateMimic.VolumeArchiving.write(lintel + "\n");
      System.out.println(lintel);
      for (Summons postscript : realizedWork) {
        String litigateDead =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                postscript.startPicture(),
                postscript.haveFigure(),
                postscript.developPulloutHour(),
                postscript.bringFlaw().size(),
                postscript.generateNegligenceSituations());
        LitigateMimic.VolumeArchiving.write(litigateDead + "\n");
        System.out.println(litigateDead);
      }
      LitigateMimic.VolumeArchiving.write("\n");
      System.out.println();
      String span = new String(new char[50]).replace("\0", "-");
      LitigateMimic.VolumeArchiving.write(span + "\n");
      System.out.println(span);
    } catch (IOException adoptee) {
      System.out.println("Unable to write to file.");
    }
  }

  public void addOutset() {}

  public abstract void snoTicktock();

  public abstract void arrivalMethodology(Summons march);

  public abstract Summons ripeOutgrowth();
}
