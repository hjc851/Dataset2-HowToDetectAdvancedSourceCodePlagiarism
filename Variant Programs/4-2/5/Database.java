import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Database {
  protected boolean isMoving;
  protected int walkingAmount;
  protected int backlogThing;
  protected LinkedList<Phase> realizedWork;
  protected int middlingExpectMeter;
  protected int regularAdjustmentAmount;
  protected ReplacingScheme reinstatementProgramme;
  public static final int AmountMarkers = 3;
  protected Phase topicalAppendage;
  private int theSelect;

  public Database() {
    this.isMoving = false;
    this.walkingAmount = 0;
    this.backlogThing = 0;
    this.middlingExpectMeter = 0;
    this.regularAdjustmentAmount = 0;
    this.theSelect = -1;
    this.realizedWork = new LinkedList<>();
  }

  public void offsetCompiler(String backup) {
    this.isMoving = true;

    switch (backup) {
      case "LRU":
        this.reinstatementProgramme = new Louisiana();
        break;
      case "CLOCK":
        this.reinstatementProgramme = new Tach();
        break;
      default:
        break;
    }
    this.ourFirst();
  }

  public void diaphragmWorkspace(String replaceable) {
    this.isMoving = false;
    this.editionAnnouncement(replaceable);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int drawFinalizingSystemsScope() {

    if (realizedWork.isEmpty()) {
      return 0;
    } else {
      return realizedWork.size();
    }
  }

  public int arriveFlowIndicate() {
    return theSelect;
  }

  public void fitUnderwayWalk(int thisValidation) {
    this.theSelect = thisValidation;
  }

  public double makeOrdinaryHoldDay() {
    return (double) this.middlingExpectMeter / this.realizedWork.size();
  }

  public double canRateShiftYears() {
    return (double) this.regularAdjustmentAmount / this.realizedWork.size();
  }

  public void editionAnnouncement(String successorPlan) {

    try {
      Collections.sort(realizedWork);
      LitigateMimic.ManufacturingComplaint.write("\n");
      System.out.println();
      String qualification = successorPlan + " - Fixed";
      LitigateMimic.ManufacturingComplaint.write(qualification + "\n");
      System.out.println(qualification);
      String drainpipe =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      LitigateMimic.ManufacturingComplaint.write(drainpipe + "\n");
      System.out.println(drainpipe);
      for (Phase vig : realizedWork) {
        String workUnconscious =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                vig.drawName(),
                vig.sustainForename(),
                vig.produceIssueNow(),
                vig.driveProblems().size(),
                vig.obtainDemeritHours());
        LitigateMimic.ManufacturingComplaint.write(workUnconscious + "\n");
        System.out.println(workUnconscious);
      }
      LitigateMimic.ManufacturingComplaint.write("\n");
      System.out.println();
      String strut = new String(new char[50]).replace("\0", "-");
      LitigateMimic.ManufacturingComplaint.write(strut + "\n");
      System.out.println(strut);
    } catch (IOException post) {
      System.out.println("Unable to write to file.");
    }
  }

  public void ourFirst() {}

  public abstract void bsiShudder();

  public abstract void mortarProceedings(Phase march);

  public abstract Phase preparingSystem();
}
