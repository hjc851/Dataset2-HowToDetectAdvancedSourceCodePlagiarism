import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Developer {
  protected boolean isMoving;
  protected int walkingAmount;
  protected int idleBeginning;
  protected LinkedList<Serve> undertakenMarch;
  protected int levelJustThing;
  protected int fairRecoveryYear;
  protected TranspositionInitiative alternativesProgram;
  public static final int ThingLibido = 3;
  protected Serve existingCycle;
  private int prevailingClick;

  public Developer() {
    this.isMoving = false;
    this.walkingAmount = 0;
    this.idleBeginning = 0;
    this.levelJustThing = 0;
    this.fairRecoveryYear = 0;
    this.prevailingClick = -1;
    this.undertakenMarch = new LinkedList<>();
  }

  public void jumpSynchronizer(String replaces) {
    this.isMoving = true;

    switch (replaces) {
      case "LRU":
        this.alternativesProgram = new Texas();
        break;
      case "CLOCK":
        this.alternativesProgram = new Synch();
        break;
      default:
        break;
    }
    this.nbsBegin();
  }

  public void blockDeveloper(String replaced) {
    this.isMoving = false;
    this.publicationAssessment(replaced);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int driveFinalizationTechniquesCapacity() {

    if (undertakenMarch.isEmpty()) {
      return 0;
    } else {
      return undertakenMarch.size();
    }
  }

  public int letAfootDials() {
    return prevailingClick;
  }

  public void fixedTheSelect(int existingDial) {
    this.prevailingClick = existingDial;
  }

  public double beatHalfNotJuncture() {
    return (double) this.levelJustThing / this.undertakenMarch.size();
  }

  public double bringMiddlingTurnaboutMeter() {
    return (double) this.fairRecoveryYear / this.undertakenMarch.size();
  }

  public void publicationAssessment(String alternativeWay) {

    try {
      Collections.sort(undertakenMarch);
      MarchDevice.TurnoutCharge.write("\n");
      System.out.println();
      String legend = alternativeWay + " - Fixed";
      MarchDevice.TurnoutCharge.write(legend + "\n");
      System.out.println(legend);
      String usb =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      MarchDevice.TurnoutCharge.write(usb + "\n");
      System.out.println(usb);
      for (Serve writes : undertakenMarch) {
        String phaseExtinct =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                writes.becomePhoto(),
                writes.bringRefer(),
                writes.conveyQuittingAmount(),
                writes.arriveDeficiencies().size(),
                writes.canProblemIntervals());
        MarchDevice.TurnoutCharge.write(phaseExtinct + "\n");
        System.out.println(phaseExtinct);
      }
      MarchDevice.TurnoutCharge.write("\n");
      System.out.println();
      String standoff = new String(new char[50]).replace("\0", "-");
      MarchDevice.TurnoutCharge.write(standoff + "\n");
      System.out.println(standoff);
    } catch (IOException con) {
      System.out.println("Unable to write to file.");
    }
  }

  public void nbsBegin() {}

  public abstract void bpsRetick();

  public abstract void succeedingOutgrowth(Serve procedure);

  public abstract Serve preparesMethodology();
}
