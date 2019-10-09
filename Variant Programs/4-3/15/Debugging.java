import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Debugging {
  protected boolean isMoving;
  protected int functioningPeriod;
  protected int backlogThing;
  protected java.util.LinkedList<Serve> completionAct;
  protected int fairPostponeYear;
  protected int typicalRevitalizationHour;
  protected AlternatePolicy substitutedIge;
  public static final int SentenceTeleportation = 3;
  protected Serve liveOutgrowth;
  private int contemporaryTicktack;

  public Debugging() {
    this.isMoving = false;
    this.functioningPeriod = 0;
    this.backlogThing = 0;
    this.fairPostponeYear = 0;
    this.typicalRevitalizationHour = 0;
    this.contemporaryTicktack = -1;
    this.completionAct = new java.util.LinkedList<>();
  }

  public synchronized void firstPlanner(java.lang.String alternate) {
    this.isMoving = true;

    switch (alternate) {
      case "LRU":
        this.substitutedIge = new Clemson();
        break;
      case "CLOCK":
        this.substitutedIge = new Sync();
        break;
      default:
        break;
    }
    this.nbsBegin();
  }

  public synchronized void quitProgramming(java.lang.String reinstatement) {
    this.isMoving = false;
    this.printableDocument(reinstatement);
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int findCompletionActSmall() {

    if (completionAct.isEmpty()) {
      return 0;
    } else {
      return completionAct.size();
    }
  }

  public synchronized int fixNewTally() {
    return contemporaryTicktack;
  }

  public synchronized void rigidFormerGene(int flowIndicate) {
    this.contemporaryTicktack = flowIndicate;
  }

  public synchronized double receiveMediocrePostponementMoment() {
    return (double) this.fairPostponeYear / this.completionAct.size();
  }

  public synchronized double catchCommonRevivalWhen() {
    return (double) this.typicalRevitalizationHour / this.completionAct.size();
  }

  public synchronized void printableDocument(java.lang.String backupFocused) {

    try {
      java.util.Collections.sort(completionAct);
      ActMock.ProducesFilename.write("\n");
      System.out.println();
      java.lang.String victory = backupFocused + " - Fixed";
      ActMock.ProducesFilename.write(victory + "\n");
      System.out.println(victory);
      java.lang.String usb =
          java.lang.String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      ActMock.ProducesFilename.write(usb + "\n");
      System.out.println(usb);
      for (Serve postscript : completionAct) {
        java.lang.String operationAway =
            java.lang.String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                postscript.haveHandle(),
                postscript.fixDiscover(),
                postscript.sustainDepartThing(),
                postscript.sustainWrongdoings().size(),
                postscript.haveCulpabilityInstances());
        ActMock.ProducesFilename.write(operationAway + "\n");
        System.out.println(operationAway);
      }
      ActMock.ProducesFilename.write("\n");
      System.out.println();
      java.lang.String split = new java.lang.String(new char[50]).replace("\0", "-");
      ActMock.ProducesFilename.write(split + "\n");
      System.out.println(split);
    } catch (java.io.IOException officio) {
      System.out.println("Unable to write to file.");
    }
  }

  public synchronized void nbsBegin() {}

  public abstract void bpsRetick();

  public abstract void arrivalsMechanism(Serve operation);

  public abstract Serve availableSummons();
}
