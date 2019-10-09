import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Outliner {
  public int prevalentScore;
  public Methods formerFormalities;
  public static final int ClockAmount = 3;
  public RenewalTactic reinstatementProgramme;
  public int moderateResurgencePeriods;
  public int halfNotJuncture;
  public java.util.LinkedList<Methods> submittedTechnologies;
  public int pendingMonth;
  public int operativeMinutes;
  public boolean isMoving;

  public Outliner() {
    this.isMoving = false;
    this.operativeMinutes = 0;
    this.pendingMonth = 0;
    this.halfNotJuncture = 0;
    this.moderateResurgencePeriods = 0;
    this.prevalentScore = -1;
    this.submittedTechnologies = new java.util.LinkedList<>();
  }

  public synchronized void beginningOrganizer(java.lang.String replaces) {
    this.isMoving = true;

    switch (replaces) {
      case "LRU":
        this.reinstatementProgramme = new Jacobs();
        break;
      case "CLOCK":
        this.reinstatementProgramme = new Pendulum();
        break;
      default:
        break;
    }
    this.nsoInitiate();
  }

  public synchronized void containSpreadsheet(java.lang.String replacing) {
    this.isMoving = false;
    this.printableDocument(replacing);
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int findCompletionActSmall() {

    if (submittedTechnologies.isEmpty()) {
      return 0;
    } else {
      return submittedTechnologies.size();
    }
  }

  public synchronized int startPresentlyMarch() {
    return prevalentScore;
  }

  public synchronized void situatedPresentlyMarch(int contemporaryTicktack) {
    this.prevalentScore = contemporaryTicktack;
  }

  public synchronized double letMediumAwaitingHours() {
    return (double) this.halfNotJuncture / this.submittedTechnologies.size();
  }

  public synchronized double sustainLevelSpikeThing() {
    return (double) this.moderateResurgencePeriods / this.submittedTechnologies.size();
  }

  public synchronized void printableDocument(java.lang.String alternativesProgram) {

    try {
      java.lang.String titleholder;
      java.lang.String overhead;
      java.lang.String span;
      java.util.Collections.sort(submittedTechnologies);
      ProceedingsKinematics.InputInitiate.write("\n");
      System.out.println();
      titleholder = alternativesProgram + " - Fixed";
      ProceedingsKinematics.InputInitiate.write(titleholder + "\n");
      System.out.println(titleholder);
      overhead =
          java.lang.String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      ProceedingsKinematics.InputInitiate.write(overhead + "\n");
      System.out.println(overhead);
      for (Methods postscript : submittedTechnologies) {
        java.lang.String marchUnsuccessful;
        marchUnsuccessful =
            java.lang.String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                postscript.sustainSelf(),
                postscript.fetchMoniker(),
                postscript.fixWithdrawalChance(),
                postscript.developErrors().size(),
                postscript.haveCulpabilityInstances());
        ProceedingsKinematics.InputInitiate.write(marchUnsuccessful + "\n");
        System.out.println(marchUnsuccessful);
      }
      ProceedingsKinematics.InputInitiate.write("\n");
      System.out.println();
      span = new java.lang.String(new char[50]).replace("\0", "-");
      ProceedingsKinematics.InputInitiate.write(span + "\n");
      System.out.println(span);
    } catch (java.io.IOException aba) {
      System.out.println("Unable to write to file.");
    }
  }

  public synchronized void nsoInitiate() {}

  public abstract void nbsClick();

  public abstract void inboundOperation(Methods serve);

  public abstract Methods prepareAct();
}
