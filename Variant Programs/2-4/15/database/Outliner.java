package database;

import forwarder.Yardmaster;
import device.MethodologyEmulator;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Outliner {
  public boolean isMoving = false;
  public int lengthwaysYears = 0;
  public int pendingMonth = 0;
  public LinkedList<Phase> conductedServe = null;
  public int regularHopeAmount = 0;
  public int moderateResurgencePeriods = 0;
  public boolean fraserHoisting = false;
  public int remainderRemoDays = 0;
  public static final int AmountMarkers = 4;
  public Phase formerFormalities = null;
  public int latestTicktock = 0;

  public Outliner() {
    this.isMoving = false;
    this.lengthwaysYears = 0;
    this.pendingMonth = 0;
    this.regularHopeAmount = 0;
    this.moderateResurgencePeriods = 0;
    this.latestTicktock = -1;
    this.conductedServe = new LinkedList<>();
    this.fraserHoisting = true;
  }

  public synchronized void kickoffSpooler() {
    this.isMoving = true;
    this.remainderRemoDays = Yardmaster.OfficeJuncture;
    this.nbsBegin();
  }

  public synchronized void terminateWriter() {
    this.isMoving = false;
    this.publicationAssessment();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int startConstructedMethodologyBreadth() {

    if (conductedServe.isEmpty()) {
      return 0;
    } else {
      return conductedServe.size();
    }
  }

  public synchronized int findActualRetick() {
    return latestTicktock;
  }

  public synchronized void doContinuingVibrate(int formerGene) {
    this.latestTicktock = formerGene;
  }

  public synchronized double arriveModalComeMonth() {
    return (double) this.regularHopeAmount / this.conductedServe.size();
  }

  public synchronized double becomeApproximatelyChangeOpportunity() {
    return (double) this.moderateResurgencePeriods / this.conductedServe.size();
  }

  public synchronized void publicationAssessment() {

    try {
      Collections.sort(conductedServe);
      MethodologyEmulator.ExportationPapers.write("\n");
      System.out.println();
      String bay = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      MethodologyEmulator.ExportationPapers.write(bay + "\n");
      System.out.println(bay);
      for (Phase writes : conductedServe) {
        int awaitingHours =
            writes.canEgressYears() - writes.comeGetClip() - writes.arrivePrezWingspan();
        int sourAnywhereMonth = writes.canEgressYears() - writes.comeGetClip();
        this.regularHopeAmount += awaitingHours;
        this.moderateResurgencePeriods += sourAnywhereMonth;
        String act =
            String.format("%-7s%16d%19d", writes.receiveCard(), awaitingHours, sourAnywhereMonth);
        MethodologyEmulator.ExportationPapers.write(act + "\n");
        System.out.println(act);
      }
      MethodologyEmulator.ExportationPapers.write("\n");
      System.out.println();
    } catch (IOException eden) {
      System.out.println("Unable to write " + this.plannerNominate() + " to file.");
    }
  }

  public synchronized void nbsBegin() {

    try {
      MethodologyEmulator.ExportationPapers.write("\n");
      System.out.println();
      MethodologyEmulator.ExportationPapers.write("\n" + this.plannerNominate() + "\n");
      System.out.println(this.plannerNominate());
    } catch (IOException con) {
      System.out.println("Unable to write " + this.plannerNominate() + " to file.");
    }
  }

  public synchronized void warheadMethod(Phase vig) {

    try {
      String methods =
          String.format("%-5s%3s", "T" + (this.findActualRetick()) + ":", vig.receiveCard());
      MethodologyEmulator.ExportationPapers.write(methods + "\n");
      System.out.println(methods);
    } catch (IOException afterwards) {
      System.out.println("Unable to write " + this.plannerNominate() + " to file.");
    }
  }

  public abstract String plannerNominate();

  public abstract void snoTicktock();

  public abstract void methodologyArrival(Phase treat);
}
