package compiler;

import retailer.Originator;
import emulator.TreatModelling;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Spooler {

  public synchronized void inkBulletin() {

    try {
      Collections.sort(fulfilledMethod);
      TreatModelling.PerformanceArchives.write("\n");
      System.out.println();
      String title = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      TreatModelling.PerformanceArchives.write(title + "\n");
      System.out.println(title);
      for (Serve vig : fulfilledMethod) {
        int comeMonth =
            vig.canEgressYears() - vig.findDisembarkSentence() - vig.arrivePrezWingspan();
        int rickAllMinutes = vig.canEgressYears() - vig.findDisembarkSentence();
        this.modalComeMonth += comeMonth;
        this.halfTurnJuncture += rickAllMinutes;
        String cycle =
            String.format("%-7s%16d%19d", vig.letIdentification(), comeMonth, rickAllMinutes);
        TreatModelling.PerformanceArchives.write(cycle + "\n");
        System.out.println(cycle);
      }
      TreatModelling.PerformanceArchives.write("\n");
      System.out.println();
    } catch (IOException abel) {
      System.out.println("Unable to write " + this.databaseNickname() + " to file.");
    }
  }

  protected Serve streamPhase;

  public synchronized void weapGet() {

    try {
      TreatModelling.PerformanceArchives.write("\n");
      System.out.println();
      TreatModelling.PerformanceArchives.write("\n" + this.databaseNickname() + "\n");
      System.out.println(this.databaseNickname());
    } catch (IOException con) {
      System.out.println("Unable to write " + this.databaseNickname() + " to file.");
    }
  }

  public synchronized void interceptSpooler() {
    this.isMoving = false;
    this.inkBulletin();
  }

  public synchronized double receiveMediocrePostponementMoment() {
    return (double) this.modalComeMonth / this.fulfilledMethod.size();
  }

  public synchronized void begunMultitasking() {
    this.isMoving = true;
    this.oddBenzDay = Originator.DeployingOpportunity;
    this.weapGet();
  }

  public static final int YearsSize = 4;

  public synchronized double arriveModalUpswingMonth() {
    return (double) this.halfTurnJuncture / this.fulfilledMethod.size();
  }

  protected boolean remoSag;

  public synchronized int arriveUndertookProceduresWingspan() {

    if (fulfilledMethod.isEmpty()) {
      return 0;
    } else {
      return fulfilledMethod.size();
    }
  }

  public synchronized void burdensMethods(Serve cern) {

    try {
      String treat =
          String.format("%-5s%3s", "T" + (this.fixNewTally()) + ":", cern.letIdentification());
      TreatModelling.PerformanceArchives.write(treat + "\n");
      System.out.println(treat);
    } catch (IOException vet) {
      System.out.println("Unable to write " + this.databaseNickname() + " to file.");
    }
  }

  private int underwayWalk;

  public abstract String databaseNickname();

  protected boolean isMoving;
  protected LinkedList<Serve> fulfilledMethod;

  public abstract void procedureIngoing(Serve litigate);

  protected int oddBenzDay;
  protected int modalComeMonth;
  protected int standbyOpportunity;

  public synchronized void laidLatestTicktock(int incumbentTock) {
    this.underwayWalk = incumbentTock;
  }

  public synchronized int fixNewTally() {
    return underwayWalk;
  }

  protected int continualOpportunity;

  public Spooler() {
    this.isMoving = false;
    this.continualOpportunity = 0;
    this.standbyOpportunity = 0;
    this.modalComeMonth = 0;
    this.halfTurnJuncture = 0;
    this.underwayWalk = -1;
    this.fulfilledMethod = new LinkedList<>();
    this.remoSag = true;
  }

  public abstract void bsiShudder();

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  protected int halfTurnJuncture;
}
