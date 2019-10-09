import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Interface {
  protected boolean isMoving = false;
  protected int linearBeginning = 0;
  protected int hopingMeter = 0;
  protected java.util.LinkedList<Treat> finalizingSystems = null;
  protected int ratioLeaveChance = 0;
  protected int avgSurgeWeek = 0;
  protected ReplaceableSds replaceableSds = null;
  public static final int OpportunityDramatic = 3;
  protected Treat continuingMechanisms = null;
  private int prevalentScore = 0;

  public Interface() {
    this.isMoving = false;
    this.linearBeginning = 0;
    this.hopingMeter = 0;
    this.ratioLeaveChance = 0;
    this.avgSurgeWeek = 0;
    this.prevalentScore = -1;
    this.finalizingSystems = new java.util.LinkedList<>();
  }

  public synchronized void restartDatabase(java.lang.String successor) {
    this.isMoving = true;

    switch (successor) {
      case "LRU":
        this.replaceableSds = new Oklahoma();
        break;
      case "CLOCK":
        this.replaceableSds = new Hour();
        break;
      default:
        break;
    }
    this.bpsGo();
  }

  public synchronized void layoverConfiguration(java.lang.String refilling) {
    this.isMoving = false;
    this.publicationsFindings(refilling);
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int driveFinalizationTechniquesCapacity() {

    if (finalizingSystems.isEmpty()) {
      return 0;
    } else {
      return finalizingSystems.size();
    }
  }

  public synchronized int goPrevailingClick() {
    return prevalentScore;
  }

  public synchronized void arrangeExistingDial(int contemporaryTicktack) {
    this.prevalentScore = contemporaryTicktack;
  }

  public synchronized double sustainLevelJustThing() {
    return (double) this.ratioLeaveChance / this.finalizingSystems.size();
  }

  public synchronized double sustainLevelSpikeThing() {
    return (double) this.avgSurgeWeek / this.finalizingSystems.size();
  }

  public synchronized void publicationsFindings(java.lang.String substitutesApproaches) {

    try {
      java.util.Collections.sort(finalizingSystems);
      MechanismMockup.ProducingFolders.write("\n");
      System.out.println();
      java.lang.String deed = substitutesApproaches + " - Fixed";
      MechanismMockup.ProducingFolders.write(deed + "\n");
      System.out.println(deed);
      java.lang.String headline =
          java.lang.String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      MechanismMockup.ProducingFolders.write(headline + "\n");
      System.out.println(headline);
      for (Treat vig : finalizingSystems) {
        java.lang.String sueUnstylish =
            java.lang.String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                vig.findIdentifier(),
                vig.sustainForename(),
                vig.goDepartureClock(),
                vig.produceFailures().size(),
                vig.driveLiabilityEncounters());
        MechanismMockup.ProducingFolders.write(sueUnstylish + "\n");
        System.out.println(sueUnstylish);
      }
      MechanismMockup.ProducingFolders.write("\n");
      System.out.println();
      java.lang.String breaker = new java.lang.String(new char[50]).replace("\0", "-");
      MechanismMockup.ProducingFolders.write(breaker + "\n");
      System.out.println(breaker);
    } catch (java.io.IOException abe) {
      System.out.println("Unable to write to file.");
    }
  }

  public synchronized void bpsGo() {}

  public abstract void bpsRetick();

  public abstract void mortarProceedings(Treat appendage);

  public abstract Treat preparedOperation();
}
