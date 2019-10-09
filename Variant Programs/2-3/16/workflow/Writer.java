package workflow;

import dealer.Dealer;
import mock.PhaseSimulations;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Writer {
  protected boolean isMoving = false;
  protected int scamperingDays = 0;
  protected int awaitingClip = 0;
  protected LinkedList<Negotiations> implementedSummons = null;
  protected int percentageTakeNow = 0;
  protected int avgSurgeWeek = 0;
  protected boolean ltsDesignator = false;
  protected int otherDblClip = 0;
  public static final int ThingLibido = 4;
  protected Negotiations afootSummons = null;
  private int actualRetick = 0;

  public Writer() {
    this.isMoving = false;
    this.scamperingDays = 0;
    this.awaitingClip = 0;
    this.percentageTakeNow = 0;
    this.avgSurgeWeek = 0;
    this.actualRetick = -1;
    this.implementedSummons = new LinkedList<>();
    this.ltsDesignator = true;
  }

  public synchronized void departParser() {
    this.isMoving = true;
    this.otherDblClip = Dealer.MurderWhen;
    this.optiCommence();
  }

  public synchronized void interceptSpooler() {
    this.isMoving = false;
    this.inkBulletin();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int obtainFinishedOutgrowthLength() {

    if (implementedSummons.isEmpty()) {
      return 0;
    } else {
      return implementedSummons.size();
    }
  }

  public synchronized int becomeTheSelect() {
    return actualRetick;
  }

  public synchronized void placeStreamBookmark(int presentlyMarch) {
    this.actualRetick = presentlyMarch;
  }

  public synchronized double fixRatioLeaveChance() {
    return (double) this.percentageTakeNow / this.implementedSummons.size();
  }

  public synchronized double receiveMediocreReversionMoment() {
    return (double) this.avgSurgeWeek / this.implementedSummons.size();
  }

  public synchronized void inkBulletin() {

    try {
      Collections.sort(implementedSummons);
      PhaseSimulations.QuantityBinder.write("\n");
      System.out.println();
      String drainpipe =
          String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      PhaseSimulations.QuantityBinder.write(drainpipe + "\n");
      System.out.println(drainpipe);
      for (Negotiations writes : implementedSummons) {
        int postponeYear =
            writes.letDeceaseHours() - writes.haveMeetPeriods() - writes.findImplementationSmall();
        int boutAlmostThing = writes.letDeceaseHours() - writes.haveMeetPeriods();
        this.percentageTakeNow += postponeYear;
        this.avgSurgeWeek += boutAlmostThing;
        String methods =
            String.format("%-7s%16d%19d", writes.sustainSelf(), postponeYear, boutAlmostThing);
        PhaseSimulations.QuantityBinder.write(methods + "\n");
        System.out.println(methods);
      }
      PhaseSimulations.QuantityBinder.write("\n");
      System.out.println();
    } catch (IOException adrian) {
      System.out.println("Unable to write " + this.workspaceForename() + " to file.");
    }
  }

  public synchronized void optiCommence() {

    try {
      PhaseSimulations.QuantityBinder.write("\n");
      System.out.println();
      PhaseSimulations.QuantityBinder.write("\n" + this.workspaceForename() + "\n");
      System.out.println(this.workspaceForename());
    } catch (IOException adult) {
      System.out.println("Unable to write " + this.workspaceForename() + " to file.");
    }
  }

  public synchronized void cargoAct(Negotiations postscript) {

    try {
      String negotiations =
          String.format("%-5s%3s", "T" + (this.becomeTheSelect()) + ":", postscript.sustainSelf());
      PhaseSimulations.QuantityBinder.write(negotiations + "\n");
      System.out.println(negotiations);
    } catch (IOException vet) {
      System.out.println("Unable to write " + this.workspaceForename() + " to file.");
    }
  }

  public abstract String workspaceForename();

  public abstract void addTock();

  public abstract void formalitiesImpending(Negotiations operation);
}
