import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Workspace {
  protected boolean isMoving;
  protected int workingClip;
  protected int awaitsWhen;
  protected LinkedList<Treat> performedTreat;
  protected int mediumAwaitingHours;
  protected int levelSpikeThing;
  protected AlternatePolicy refillingGambit;
  public static final int SentenceTeleportation = 3;
  protected Treat presentlyMechanism;
  private int actualRetick;

  public Workspace() {
    this.isMoving = false;
    this.workingClip = 0;
    this.awaitsWhen = 0;
    this.mediumAwaitingHours = 0;
    this.levelSpikeThing = 0;
    this.actualRetick = -1;
    this.performedTreat = new LinkedList<>();
  }

  public void earlyWorkspace(String alternate) {
    this.isMoving = true;

    switch (alternate) {
      case "LRU":
        this.refillingGambit = new Oklahoma();
        break;
      case "CLOCK":
        this.refillingGambit = new Tach();
        break;
      default:
        break;
    }
    this.nsoInitiate();
  }

  public void checkWorkflow(String alternatives) {
    this.isMoving = false;
    this.newspaperSummary(alternatives);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int generatePerformedTreatFootprint() {

    if (performedTreat.isEmpty()) {
      return 0;
    } else {
      return performedTreat.size();
    }
  }

  public int becomeTheSelect() {
    return actualRetick;
  }

  public void doContinuingVibrate(int ongoingBeat) {
    this.actualRetick = ongoingBeat;
  }

  public double catchCommonSeeWhen() {
    return (double) this.mediumAwaitingHours / this.performedTreat.size();
  }

  public double comeNormalReversalClip() {
    return (double) this.levelSpikeThing / this.performedTreat.size();
  }

  public void newspaperSummary(String renewalTactic) {

    try {
      Collections.sort(performedTreat);
      MechanismsManikin.ProductivityDocuments.write("\n");
      System.out.println();
      String position = renewalTactic + " - Fixed";
      MechanismsManikin.ProductivityDocuments.write(position + "\n");
      System.out.println(position);
      String headings =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      MechanismsManikin.ProductivityDocuments.write(headings + "\n");
      System.out.println(headings);
      for (Treat cern : performedTreat) {
        String serveForbidden =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                cern.becomePhoto(),
                cern.fetchMoniker(),
                cern.drawEntranceWeek(),
                cern.beatBlunders().size(),
                cern.haveCulpabilityInstances());
        MechanismsManikin.ProductivityDocuments.write(serveForbidden + "\n");
        System.out.println(serveForbidden);
      }
      MechanismsManikin.ProductivityDocuments.write("\n");
      System.out.println();
      String saver = new String(new char[50]).replace("\0", "-");
      MechanismsManikin.ProductivityDocuments.write(saver + "\n");
      System.out.println(saver);
    } catch (IOException adoptee) {
      System.out.println("Unable to write to file.");
    }
  }

  public void nsoInitiate() {}

  public abstract void nsoTic();

  public abstract void succeedingOutgrowth(Treat litigate);

  public abstract Treat availableSummons();
}
