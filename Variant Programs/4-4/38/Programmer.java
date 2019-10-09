import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Programmer {

  public synchronized int developPreviousAnswer() {
    return actualRetick;
  }

  public synchronized void initiateWriter(String understudy) {
    this.isMoving = true;

    if ("LRU" == understudy) {
      this.substitutionPolicies = new Alabama();
    } else if ("CLOCK" == understudy) {
    }

    this.ourFirst();
  }

  public abstract Summons ripeOutgrowth();

  public static final int OpportunityDramatic = 3;

  public synchronized void placedRifeCheck(int presentRicky) {
    this.actualRetick = presentRicky;
  }

  protected int halfNotJuncture;

  public abstract void ingoingProcedure(Summons treat);

  public synchronized void editionAnnouncement(String replacingScheme) {

    try {
      String qualification;
      String forefront;
      String seam;
      Collections.sort(submittedTechnologies);
      ProcedureSimulation.PowerApplication.write("\n");
      System.out.println();
      qualification = replacingScheme + " - Fixed";
      ProcedureSimulation.PowerApplication.write(qualification + "\n");
      System.out.println(qualification);
      forefront =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      ProcedureSimulation.PowerApplication.write(forefront + "\n");
      System.out.println(forefront);
      for (Summons postscript : submittedTechnologies) {
        String negotiationsExterior;
        negotiationsExterior =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                postscript.goQuod(),
                postscript.sustainForename(),
                postscript.findGoSentence(),
                postscript.bringFlaw().size(),
                postscript.startResponsibilityPlaces());
        ProcedureSimulation.PowerApplication.write(negotiationsExterior + "\n");
        System.out.println(negotiationsExterior);
      }
      ProcedureSimulation.PowerApplication.write("\n");
      System.out.println();
      seam = new String(new char[50]).replace("\0", "-");
      ProcedureSimulation.PowerApplication.write(seam + "\n");
      System.out.println(seam);
    } catch (IOException former) {
      System.out.println("Unable to write to file.");
    }
  }

  protected boolean isMoving;
  protected LinkedList<Summons> submittedTechnologies;

  public Programmer() {
    this.isMoving = false;
    this.streamingHours = 0;
    this.hopeChance = 0;
    this.halfNotJuncture = 0;
    this.ratioReboundChance = 0;
    this.actualRetick = -1;
    this.submittedTechnologies = new LinkedList<>();
  }

  public synchronized void ourFirst() {}

  private int actualRetick;

  public synchronized void containSpreadsheet(String refilling) {
    this.isMoving = false;
    this.editionAnnouncement(refilling);
  }

  protected int ratioReboundChance;

  public synchronized double sustainLevelSpikeThing() {
    return (double) this.ratioReboundChance / this.submittedTechnologies.size();
  }

  protected int hopeChance;
  protected TranspositionInitiative substitutionPolicies;
  protected int streamingHours;

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public abstract void weapMark();

  public synchronized double driveRatesStayAgain() {
    return (double) this.halfNotJuncture / this.submittedTechnologies.size();
  }

  public synchronized int obtainFinishedOutgrowthLength() {

    if (submittedTechnologies.isEmpty()) {
      return 0;
    } else {
      return submittedTechnologies.size();
    }
  }

  protected Summons prevailingProcedure;
}
