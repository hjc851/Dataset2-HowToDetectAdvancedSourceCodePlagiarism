package database;

import retailer.Shipper;
import demo.MethodImpactor;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Outliner {
  public boolean isMoving = false;
  public int gushingNow = 0;
  public int awaitsWhen = 0;
  public LinkedList<Act> consummatedOperation = null;
  public int levelJustThing = 0;
  public int modalUpswingMonth = 0;
  public boolean burberryTire = false;
  public int lingeringInedThing = 0;
  public static final int HourPurity = 4;
  public Act topicalAppendage = null;
  public int underwayWalk = 0;

  public Outliner() {
    this.isMoving = false;
    this.gushingNow = 0;
    this.awaitsWhen = 0;
    this.levelJustThing = 0;
    this.modalUpswingMonth = 0;
    this.underwayWalk = -1;
    this.consummatedOperation = new LinkedList<>();
    this.burberryTire = true;
  }

  public synchronized void goTimer() {
    this.isMoving = true;
    this.lingeringInedThing = Shipper.RemoveDay;
    this.bpsGo();
  }

  public synchronized void layoverConfiguration() {
    this.isMoving = false;
    this.fontAudit();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int obtainFinishedOutgrowthLength() {

    if (consummatedOperation.isEmpty()) {
      return 0;
    } else {
      return consummatedOperation.size();
    }
  }

  public synchronized int receiveContemporaryTicktack() {
    return underwayWalk;
  }

  public synchronized void dictatedOngoingBeat(int formerGene) {
    this.underwayWalk = formerGene;
  }

  public synchronized double haveModerateDeferPeriods() {
    return (double) this.levelJustThing / this.consummatedOperation.size();
  }

  public synchronized double letMediumReorganizationHours() {
    return (double) this.modalUpswingMonth / this.consummatedOperation.size();
  }

  public synchronized void fontAudit() {

    try {
      Collections.sort(consummatedOperation);
      MethodImpactor.ProducesFilename.write("\n");
      System.out.println();
      String title = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      MethodImpactor.ProducesFilename.write(title + "\n");
      System.out.println(title);
      for (Act cern : consummatedOperation) {
        int sitPeriod = cern.comeLeaveClip() - cern.canOccurYears() - cern.letBigwigSmallness();
        int actOutsidePeriods = cern.comeLeaveClip() - cern.canOccurYears();
        this.levelJustThing += sitPeriod;
        this.modalUpswingMonth += actOutsidePeriods;
        String act = String.format("%-7s%16d%19d", cern.produceMap(), sitPeriod, actOutsidePeriods);
        MethodImpactor.ProducesFilename.write(act + "\n");
        System.out.println(act);
      }
      MethodImpactor.ProducesFilename.write("\n");
      System.out.println();
    } catch (IOException abbe) {
      System.out.println("Unable to write " + this.synchronizationAppoint() + " to file.");
    }
  }

  public synchronized void bpsGo() {

    try {
      MethodImpactor.ProducesFilename.write("\n");
      System.out.println();
      MethodImpactor.ProducesFilename.write("\n" + this.synchronizationAppoint() + "\n");
      System.out.println(this.synchronizationAppoint());
    } catch (IOException former) {
      System.out.println("Unable to write " + this.synchronizationAppoint() + " to file.");
    }
  }

  public synchronized void burdenProcedure(Act postscript) {

    try {
      String work =
          String.format(
              "%-5s%3s", "T" + (this.receiveContemporaryTicktack()) + ":", postscript.produceMap());
      MethodImpactor.ProducesFilename.write(work + "\n");
      System.out.println(work);
    } catch (IOException past) {
      System.out.println("Unable to write " + this.synchronizationAppoint() + " to file.");
    }
  }

  public abstract String synchronizationAppoint();

  public abstract void ourTicktack();

  public abstract void procedureIngoing(Act operation);
}
