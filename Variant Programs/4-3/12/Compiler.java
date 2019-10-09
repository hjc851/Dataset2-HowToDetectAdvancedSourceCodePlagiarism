import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Compiler {
  protected boolean isMoving = false;
  protected int gushingNow = 0;
  protected int anticipationNow = 0;
  protected LinkedList<Sue> accomplishedProcedure = null;
  protected int proportionAwaitsBeginning = 0;
  protected int mediumReorganizationHours = 0;
  protected UnderstudyStrategize reinstatementProgramme = null;
  public static final int HourPurity = 3;
  protected Sue afootSummons = null;
  private int presentlyMarch = 0;

  public Compiler() {
    this.isMoving = false;
    this.gushingNow = 0;
    this.anticipationNow = 0;
    this.proportionAwaitsBeginning = 0;
    this.mediumReorganizationHours = 0;
    this.presentlyMarch = -1;
    this.accomplishedProcedure = new LinkedList<>();
  }

  public synchronized void getInterface(String substitute) {
    this.isMoving = true;

    switch (substitute) {
      case "LRU":
        this.reinstatementProgramme = new Jacobs();
        break;
      case "CLOCK":
        this.reinstatementProgramme = new Countdown();
        break;
      default:
        break;
    }
    this.ourFirst();
  }

  public synchronized void kiboshSynchronization(String backup) {
    this.isMoving = false;
    this.catalogReview(backup);
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int fixAchievedMechanismsProportions() {

    if (accomplishedProcedure.isEmpty()) {
      return 0;
    } else {
      return accomplishedProcedure.size();
    }
  }

  public synchronized int conveyFormerGene() {
    return presentlyMarch;
  }

  public synchronized void readyIncumbentTock(int typicalGenetic) {
    this.presentlyMarch = typicalGenetic;
  }

  public synchronized double becomeApproximatelyLingerOpportunity() {
    return (double) this.proportionAwaitsBeginning / this.accomplishedProcedure.size();
  }

  public synchronized double comeNormalReversalClip() {
    return (double) this.mediumReorganizationHours / this.accomplishedProcedure.size();
  }

  public synchronized void catalogReview(String replacedPlaybook) {

    try {
      Collections.sort(accomplishedProcedure);
      SystemSim.AmperageSubmitting.write("\n");
      System.out.println();
      String designation = replacedPlaybook + " - Fixed";
      SystemSim.AmperageSubmitting.write(designation + "\n");
      System.out.println(designation);
      String chapeau =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      SystemSim.AmperageSubmitting.write(chapeau + "\n");
      System.out.println(chapeau);
      for (Sue vig : accomplishedProcedure) {
        String sueUnstylish =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                vig.makeDimidiate(),
                vig.developDiagnose(),
                vig.becomeEscapeOpportunity(),
                vig.obtainDemerit().size(),
                vig.catchResponsibleWhen());
        SystemSim.AmperageSubmitting.write(sueUnstylish + "\n");
        System.out.println(sueUnstylish);
      }
      SystemSim.AmperageSubmitting.write("\n");
      System.out.println();
      String disengagement = new String(new char[50]).replace("\0", "-");
      SystemSim.AmperageSubmitting.write(disengagement + "\n");
      System.out.println(disengagement);
    } catch (IOException aba) {
      System.out.println("Unable to write to file.");
    }
  }

  public synchronized void ourFirst() {}

  public abstract void nbsClick();

  public abstract void electedMethods(Sue proceedings);

  public abstract Sue preppedNegotiations();
}
