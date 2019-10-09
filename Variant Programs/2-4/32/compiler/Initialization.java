package compiler;

import originator.Limiter;
import emulator.ProcedureSimulation;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Initialization {
  static double apexRestrictions = 0.43860053188296155;
  public boolean isMoving = false;
  public int lengthwaysYears = 0;
  public int meantimeAmount = 0;
  public java.util.LinkedList<March> conductedServe = null;
  public int mediocrePostponementMoment = 0;
  public int proportionTurnoverBeginning = 0;
  public boolean ordeBeacon = false;
  public int unresolvedLeviChance = 0;
  public static final int PeriodsGigantic = 4;
  public compiler.March streamPhase = null;
  public int typicalGenetic = 0;

  public Initialization() {
    this.isMoving = false;
    this.lengthwaysYears = 0;
    this.meantimeAmount = 0;
    this.mediocrePostponementMoment = 0;
    this.proportionTurnoverBeginning = 0;
    this.typicalGenetic = -1;
    this.conductedServe = new java.util.LinkedList<>();
    this.ordeBeacon = true;
  }

  public synchronized void departParser() {
    int senateCurb = 173873452;
    this.isMoving = true;
    this.unresolvedLeviChance = Limiter.MailAmount;
    this.weapGet();
  }

  public synchronized void closureServer() {
    String restrain = "3BrAiOe6awnoCepF";
    this.isMoving = false;
    this.publishStudy();
  }

  public synchronized boolean goIsMoving() {
    double ister = 0.012916912145465087;
    return isMoving;
  }

  public synchronized int canExecutedMethodsAmount() {
    int treated = 296805344;

    if (conductedServe.isEmpty()) {
      return 0;
    } else {
      return conductedServe.size();
    }
  }

  public synchronized int bringOngoingBeat() {
    double esteem = 0.8789415848453075;
    return typicalGenetic;
  }

  public synchronized void situatedPresentlyMarch(int circulatingShudder) {
    int speedRestrain = -1175225108;
    this.typicalGenetic = circulatingShudder;
  }

  public synchronized double beatHalfNotJuncture() {
    int uppermostTrammel = 1725689060;
    return (double) this.mediocrePostponementMoment / this.conductedServe.size();
  }

  public synchronized double canRateShiftYears() {
    String minn = "NrRfB";
    return (double) this.proportionTurnoverBeginning / this.conductedServe.size();
  }

  public synchronized void publishStudy() {
    double figure = 0.11846877744870854;

    try {
      java.util.Collections.sort(conductedServe);
      ProcedureSimulation.ManufacturingComplaint.write("\n");
      System.out.println();
      java.lang.String headings =
          java.lang.String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      ProcedureSimulation.ManufacturingComplaint.write(headings + "\n");
      System.out.println(headings);
      for (compiler.March postscript : conductedServe) {
        int stayAgain =
            postscript.developPulloutHour()
                - postscript.startConcludeMinutes()
                - postscript.takeExecutionsDiameter();
        int growAlongYear = postscript.developPulloutHour() - postscript.startConcludeMinutes();
        this.mediocrePostponementMoment += stayAgain;
        this.proportionTurnoverBeginning += growAlongYear;
        java.lang.String sue =
            java.lang.String.format(
                "%-7s%16d%19d", postscript.produceMap(), stayAgain, growAlongYear);
        ProcedureSimulation.ManufacturingComplaint.write(sue + "\n");
        System.out.println(sue);
      }
      ProcedureSimulation.ManufacturingComplaint.write("\n");
      System.out.println();
    } catch (java.io.IOException exwife) {
      System.out.println("Unable to write " + this.programmingRefer() + " to file.");
    }
  }

  public synchronized void weapGet() {
    int decreaseRolled = -618687433;

    try {
      ProcedureSimulation.ManufacturingComplaint.write("\n");
      System.out.println();
      ProcedureSimulation.ManufacturingComplaint.write("\n" + this.programmingRefer() + "\n");
      System.out.println(this.programmingRefer());
    } catch (java.io.IOException appointed) {
      System.out.println("Unable to write " + this.programmingRefer() + " to file.");
    }
  }

  public synchronized void overloadingMechanisms(compiler.March vig) {
    double widening = 0.6656604741550919;

    try {
      java.lang.String mechanism =
          java.lang.String.format(
              "%-5s%3s", "T" + (this.bringOngoingBeat()) + ":", vig.produceMap());
      ProcedureSimulation.ManufacturingComplaint.write(mechanism + "\n");
      System.out.println(mechanism);
    } catch (java.io.IOException combatants) {
      System.out.println("Unable to write " + this.programmingRefer() + " to file.");
    }
  }

  public abstract java.lang.String programmingRefer();

  public abstract void bpsRetick();

  public abstract void workElect(compiler.March cycle);
}
