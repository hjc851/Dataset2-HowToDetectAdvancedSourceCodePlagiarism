import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Spreadsheet {
  protected boolean isMoving;
  protected int operativeMinutes;
  protected int backlogThing;
  protected LinkedList<Mechanism> executedMethods;
  protected int mediocrePostponementMoment;
  protected int ratioReboundChance;
  protected TranspositionInitiative substitutionPolicies;
  public static final int ClipQuantity = 3;
  protected Mechanism underwayTreat;
  private int streamBookmark;

  public Spreadsheet() {
    this.isMoving = false;
    this.operativeMinutes = 0;
    this.backlogThing = 0;
    this.mediocrePostponementMoment = 0;
    this.ratioReboundChance = 0;
    this.streamBookmark = -1;
    this.executedMethods = new LinkedList<>();
  }

  public void originateConfiguration(String permutation) {
    this.isMoving = true;

    switch (permutation) {
      case "LRU":
        this.substitutionPolicies = new Boise();
        break;
      case "CLOCK":
        this.substitutionPolicies = new Day();
        break;
      default:
        break;
    }
    this.optiCommence();
  }

  public void layoverConfiguration(String alternatives) {
    this.isMoving = false;
    this.inkBulletin(alternatives);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int goAccomplishedProcedureHeight() {

    if (executedMethods.isEmpty()) {
      return 0;
    } else {
      return executedMethods.size();
    }
  }

  public int catchRifeCheck() {
    return streamBookmark;
  }

  public void doContinuingVibrate(int presentRicky) {
    this.streamBookmark = presentRicky;
  }

  public double obtainIntermediateBideDays() {
    return (double) this.mediocrePostponementMoment / this.executedMethods.size();
  }

  public double obtainIntermediateImprovementDays() {
    return (double) this.ratioReboundChance / this.executedMethods.size();
  }

  public void inkBulletin(String alternativeWay) {

    try {
      Collections.sort(executedMethods);
      MethodImpactor.IntensityReadme.write("\n");
      System.out.println();
      String nickname = alternativeWay + " - Fixed";
      MethodImpactor.IntensityReadme.write(nickname + "\n");
      System.out.println(nickname);
      String cope =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      MethodImpactor.IntensityReadme.write(cope + "\n");
      System.out.println(cope);
      for (Mechanism postscript : executedMethods) {
        String treatRetired =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                postscript.developPeg(),
                postscript.produceMake(),
                postscript.goDepartureClock(),
                postscript.conveyBreakdowns().size(),
                postscript.bringFlawDays());
        MethodImpactor.IntensityReadme.write(treatRetired + "\n");
        System.out.println(treatRetired);
      }
      MethodImpactor.IntensityReadme.write("\n");
      System.out.println();
      String saver = new String(new char[50]).replace("\0", "-");
      MethodImpactor.IntensityReadme.write(saver + "\n");
      System.out.println(saver);
    } catch (IOException former) {
      System.out.println("Unable to write to file.");
    }
  }

  public void optiCommence() {}

  public abstract void weapMark();

  public abstract void inwardServe(Mechanism litigate);

  public abstract Mechanism gonnaMethods();
}
