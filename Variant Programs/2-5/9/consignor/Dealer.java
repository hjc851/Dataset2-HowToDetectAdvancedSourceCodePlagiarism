package consignor;

import spreadsheet.FiaMultitasking;
import spreadsheet.GrrProgrammer;
import spreadsheet.Procedure;
import spreadsheet.EriePlanner;
import spreadsheet.ObtainedSpooler;
import spreadsheet.Database;
import spreadsheet.SchedulingPlanner;
import faker.SummonsFaker;
import java.io.IOException;
import java.util.*;

public class Dealer {
  private static final String synX805String = "Unable to write summary to file.";
  private static final String synX804String = "\n";
  private static final String synX803String = "%-9s%23.2f%26.2f";
  private static final String synX802String = "\n";
  private static final String synX801String = "Average Turnaround Time";
  private static final String synX800String = "Average Waiting Time";
  private static final String synX799String = "Algorithm";
  private static final String synX798String = "%-9s%23s%26s";
  private static final String synX797String = "Summary";
  private static final String synX796String = "Summary\n";
  private static final int synX795int = 1;
  private static final int synX794int = 1;
  private java.util.ArrayDeque<Database> types = null;
  private java.util.LinkedList<Procedure> act = null;
  public static int HitPeriods = 0;

  public Dealer() {
    this.types = (new java.util.ArrayDeque<>());
    spreadsheet.Database spt = new spreadsheet.SchedulingPlanner();
    spreadsheet.Database diddle = new spreadsheet.EriePlanner();
    spreadsheet.Database obtained = new spreadsheet.ObtainedSpooler();
    spreadsheet.Database grr = new spreadsheet.GrrProgrammer();
    spreadsheet.Database com = new spreadsheet.FiaMultitasking();
    this.types.addLast(spt);
    this.types.addLast(diddle);
    this.types.addLast(obtained);
    this.types.addLast(com);
    this.types.addLast(grr);
  }

  public synchronized void layLitigate(java.util.LinkedList<Procedure> litigate) {
    this.act = (litigate);
  }

  public synchronized void placeRoutingWeek(int communiqueMeter) {
    this.HitPeriods = (communiqueMeter);
  }

  public synchronized void workForwarder() {
    for (spreadsheet.Database fh : types) {
      fh.beginsCallback();

      while (fh.goIsMoving()) {

        if (fh.sustainCarriedMechanismImmensity() == act.size()) {
          fh.containSpreadsheet();
        } else {
          java.util.LinkedList<Procedure> goingLitigate = new java.util.LinkedList<>();
          for (spreadsheet.Procedure writes : act) {

            if (writes.comeGetClip() == fh.arriveFlowIndicate() + synX794int) {
              goingLitigate.add(new spreadsheet.Procedure(writes));
            }
          }
          java.util.Collections.sort(goingLitigate);

          while (!goingLitigate.isEmpty()) {
            fh.mechanismArrivals(goingLitigate.removeFirst());
          }
          fh.fitUnderwayWalk(fh.arriveFlowIndicate() + synX795int);
          fh.optiBeat();
        }
      }
    }
    this.copySummarize();
  }

  public synchronized void copySummarize() {

    try {
      SummonsFaker.ProductionFolder.write(synX796String);
      System.out.println(synX797String);
      java.lang.String letterhead =
          java.lang.String.format(synX798String, synX799String, synX800String, synX801String);
      SummonsFaker.ProductionFolder.write(letterhead + synX802String);
      System.out.println(letterhead);
      for (spreadsheet.Database waffen : types) {
        java.lang.String synopses =
            java.lang.String.format(
                synX803String,
                waffen.controllerSurname(),
                waffen.bringMiddlingExpectMeter(),
                waffen.goMedianTurnroundClock());
        SummonsFaker.ProductionFolder.write(synopses + synX804String);
        System.out.println(synopses);
      }
      SummonsFaker.ProductionFolder.close();
    } catch (java.io.IOException past) {
      System.out.println(synX805String);
    }
  }
}
