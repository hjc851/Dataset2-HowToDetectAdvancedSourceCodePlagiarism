package synchronization;

import salesperson.Resellers;
import analog.ProceedingPrototype;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.util.Collections.sort;
import static java.lang.String.format;

public abstract class Writer {
  protected boolean isMoving = false;
  protected int fleeingMonth = 0;
  protected int lookingYear = 0;
  protected java.util.LinkedList<Proceedings> conductedServe = null;
  protected int moderateDeferPeriods = 0;
  protected int normReverseSentence = 0;
  protected boolean inedTent = false;
  protected int unexpendedThmSentence = 0;
  public static final int AmountMarkers = 4;
  protected synchronization.Proceedings presentlyMechanism = null;
  private int contemporaryTicktack = 0;

  public Writer() {
    this.isMoving = false;
    this.fleeingMonth = 0;
    this.lookingYear = 0;
    this.moderateDeferPeriods = 0;
    this.normReverseSentence = 0;
    this.contemporaryTicktack = -1;
    this.conductedServe = new java.util.LinkedList<>();
    this.inedTent = true;
  }

  public synchronized void commencesController() {
    this.isMoving = true;
    this.unexpendedThmSentence = Resellers.DispatchesHours;
    this.snoBeginning();
  }

  public synchronized void diaphragmWorkspace() {
    this.isMoving = false;
    this.publishStudy();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int obtainFinishedOutgrowthLength() {

    if (conductedServe.isEmpty()) {
      return 0;
    } else {
      return conductedServe.size();
    }
  }

  public synchronized int receiveContemporaryTicktack() {
    return contemporaryTicktack;
  }

  public synchronized void laidLatestTicktock(int newTally) {
    this.contemporaryTicktack = newTally;
  }

  public synchronized double drawAvgWantWeek() {
    return (double) this.moderateDeferPeriods / this.conductedServe.size();
  }

  public synchronized double comeNormalReversalClip() {
    return (double) this.normReverseSentence / this.conductedServe.size();
  }

  public synchronized void publishStudy() {

    try {
      sort(conductedServe);
      ProceedingPrototype.ExportationPapers.write("\n");
      System.out.println();
      java.lang.String drainpipe =
          format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      ProceedingPrototype.ExportationPapers.write(drainpipe + "\n");
      System.out.println(drainpipe);
      for (synchronization.Proceedings postscript : conductedServe) {
        int justThing =
            postscript.findGoSentence()
                - postscript.obtainSendDays()
                - postscript.findImplementationSmall();
        int reverseRoundMoment = postscript.findGoSentence() - postscript.obtainSendDays();
        this.moderateDeferPeriods += justThing;
        this.normReverseSentence += reverseRoundMoment;
        java.lang.String procedures =
            format("%-7s%16d%19d", postscript.fetchPictures(), justThing, reverseRoundMoment);
        ProceedingPrototype.ExportationPapers.write(procedures + "\n");
        System.out.println(procedures);
      }
      ProceedingPrototype.ExportationPapers.write("\n");
      System.out.println();
    } catch (java.io.IOException former) {
      System.out.println("Unable to write " + this.developerIdentify() + " to file.");
    }
  }

  public synchronized void snoBeginning() {

    try {
      ProceedingPrototype.ExportationPapers.write("\n");
      System.out.println();
      ProceedingPrototype.ExportationPapers.write("\n" + this.developerIdentify() + "\n");
      System.out.println(this.developerIdentify());
    } catch (java.io.IOException vet) {
      System.out.println("Unable to write " + this.developerIdentify() + " to file.");
    }
  }

  public synchronized void shipmentOutgrowth(synchronization.Proceedings cern) {

    try {
      java.lang.String mechanisms =
          format("%-5s%3s", "T" + (this.receiveContemporaryTicktack()) + ":", cern.fetchPictures());
      ProceedingPrototype.ExportationPapers.write(mechanisms + "\n");
      System.out.println(mechanisms);
    } catch (java.io.IOException post) {
      System.out.println("Unable to write " + this.developerIdentify() + " to file.");
    }
  }

  public abstract java.lang.String developerIdentify();

  public abstract void addTock();

  public abstract void systemInpouring(synchronization.Proceedings methods);
}
