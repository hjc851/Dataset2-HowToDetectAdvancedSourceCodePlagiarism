import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Programming {
  protected boolean isMoving;
  protected int flowingSentence;
  protected int standbyOpportunity;
  protected LinkedList<Sue> inauguratedOperations;
  protected int halfNotJuncture;
  protected int ratioReboundChance;
  protected SubstitutedIge reinstatementProgramme;
  public static final int MeterMeasure = 3;
  protected Sue afootSummons;
  private int latestTicktock;

  public Programming() {
    this.isMoving = false;
    this.flowingSentence = 0;
    this.standbyOpportunity = 0;
    this.halfNotJuncture = 0;
    this.ratioReboundChance = 0;
    this.latestTicktock = -1;
    this.inauguratedOperations = new LinkedList<>();
  }

  public void initiateWriter(String substitute) {
    this.isMoving = true;

    switch (substitute) {
      case "LRU":
        this.reinstatementProgramme = new Uconn();
        break;
      case "CLOCK":
        this.reinstatementProgramme = new Hour();
        break;
      default:
        break;
    }
    this.bpsGo();
  }

  public void diaphragmWorkspace(String substituted) {
    this.isMoving = false;
    this.printersCover(substituted);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int findCompletionActSmall() {

    if (inauguratedOperations.isEmpty()) {
      return 0;
    } else {
      return inauguratedOperations.size();
    }
  }

  public int drawStreamBookmark() {
    return latestTicktock;
  }

  public void arrangedActualRetick(int rifeCheck) {
    this.latestTicktock = rifeCheck;
  }

  public double takeMeanSitPeriod() {
    return (double) this.halfNotJuncture / this.inauguratedOperations.size();
  }

  public double goMedianTurnroundClock() {
    return (double) this.ratioReboundChance / this.inauguratedOperations.size();
  }

  public void printersCover(String replaceableSds) {

    try {
      Collections.sort(inauguratedOperations);
      TreatModelling.TurnoutCharge.write("\n");
      System.out.println();
      String deed = replaceableSds + " - Fixed";
      TreatModelling.TurnoutCharge.write(deed + "\n");
      System.out.println(deed);
      String manifold =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      TreatModelling.TurnoutCharge.write(manifold + "\n");
      System.out.println(manifold);
      for (Sue postscript : inauguratedOperations) {
        String appendageExtinguished =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                postscript.conveyTag(),
                postscript.obtainAdvert(),
                postscript.conveyQuittingAmount(),
                postscript.produceFailures().size(),
                postscript.findErrorYears());
        TreatModelling.TurnoutCharge.write(appendageExtinguished + "\n");
        System.out.println(appendageExtinguished);
      }
      TreatModelling.TurnoutCharge.write("\n");
      System.out.println();
      String buffer = new String(new char[50]).replace("\0", "-");
      TreatModelling.TurnoutCharge.write(buffer + "\n");
      System.out.println(buffer);
    } catch (IOException libris) {
      System.out.println("Unable to write to file.");
    }
  }

  public void bpsGo() {}

  public abstract void weapMark();

  public abstract void entryPhase(Sue march);

  public abstract Sue waitingLitigate();
}
