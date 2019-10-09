import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Programming {
  protected boolean isMoving;
  protected int linearBeginning;
  protected int delayHour;
  protected LinkedList<Methodology> submittedTechnologies;
  protected int percentageTakeNow;
  protected int proportionTurnoverBeginning;
  protected BackupFocused replenishmentStratagem;
  public static final int MonthLarge = 3;
  protected Methodology afootSummons;
  private int prevalentScore;

  public Programming() {
    this.isMoving = false;
    this.linearBeginning = 0;
    this.delayHour = 0;
    this.percentageTakeNow = 0;
    this.proportionTurnoverBeginning = 0;
    this.prevalentScore = -1;
    this.submittedTechnologies = new LinkedList<>();
  }

  public void startleOutliner(String surrogate) {
    this.isMoving = true;

    switch (surrogate) {
      case "LRU":
        this.replenishmentStratagem = new Georgia();
        break;
      case "CLOCK":
        this.replenishmentStratagem = new Waking();
        break;
      default:
        break;
    }
    this.nbsBegin();
  }

  public void pointSynchronizer(String transposition) {
    this.isMoving = false;
    this.inkBulletin(transposition);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int receiveFinalizedLitigateThickness() {

    if (submittedTechnologies.isEmpty()) {
      return 0;
    } else {
      return submittedTechnologies.size();
    }
  }

  public int startPresentlyMarch() {
    return prevalentScore;
  }

  public void arrangeExistingDial(int prevailingClick) {
    this.prevalentScore = prevailingClick;
  }

  public double driveRatesStayAgain() {
    return (double) this.percentageTakeNow / this.submittedTechnologies.size();
  }

  public double receiveMediocreReversionMoment() {
    return (double) this.proportionTurnoverBeginning / this.submittedTechnologies.size();
  }

  public void inkBulletin(String alternatePolicy) {

    try {
      Collections.sort(submittedTechnologies);
      MechanismsManikin.VolumeArchiving.write("\n");
      System.out.println();
      String nickname = alternatePolicy + " - Fixed";
      MechanismsManikin.VolumeArchiving.write(nickname + "\n");
      System.out.println(nickname);
      String heading =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      MechanismsManikin.VolumeArchiving.write(heading + "\n");
      System.out.println(heading);
      for (Methodology vig : submittedTechnologies) {
        String appendageExtinguished =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                vig.conveyTag(),
                vig.generateAppoint(),
                vig.bringLossMeter(),
                vig.catchShortcomings().size(),
                vig.startResponsibilityPlaces());
        MechanismsManikin.VolumeArchiving.write(appendageExtinguished + "\n");
        System.out.println(appendageExtinguished);
      }
      MechanismsManikin.VolumeArchiving.write("\n");
      System.out.println();
      String protector = new String(new char[50]).replace("\0", "-");
      MechanismsManikin.VolumeArchiving.write(protector + "\n");
      System.out.println(protector);
    } catch (IOException pro) {
      System.out.println("Unable to write to file.");
    }
  }

  public void nbsBegin() {}

  public abstract void snoTicktock();

  public abstract void nextSue(Methodology proceeding);

  public abstract Methodology prepareAct();
}
