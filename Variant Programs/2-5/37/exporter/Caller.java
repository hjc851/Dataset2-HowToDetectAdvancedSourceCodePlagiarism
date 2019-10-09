package exporter;

import parser.DcSpreadsheet;
import parser.GrrProgrammer;
import parser.Serve;
import parser.GpaInterface;
import parser.LongDatabase;
import parser.Developer;
import parser.UsingProgramming;
import simulations.CycleJoystick;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Caller {
  private static final int synX2672int = 1;
  private static final int synX2671int = 1;
  private static final String synX2670String = "Unable to write summary to file.";
  private static final String synX2669String = "\n";
  private static final String synX2668String = "%-9s%23.2f%26.2f";
  private static final String synX2667String = "\n";
  private static final String synX2666String = "Average Turnaround Time";
  private static final String synX2665String = "Average Waiting Time";
  private static final String synX2664String = "Algorithm";
  private static final String synX2663String = "%-9s%23s%26s";
  private static final String synX2662String = "Summary";
  private static final String synX2661String = "Summary\n";
  private static final double synX2660double = 0.2665734184416141;
  private static final int synX2659int = -1342595330;
  private static final double synX2658double = 0.02404582548185008;
  private static final double synX2657double = 0.3941705570504743;
  public static String bottomCompelled = "lQ2pZAdw2DPfi";
  public java.util.ArrayDeque<Developer> use;
  public java.util.LinkedList<Serve> treat;
  public static int DespatchClock;

  public Caller() {
    this.use = new java.util.ArrayDeque<>();
    parser.Developer paps = new parser.UsingProgramming();
    parser.Developer erie = new parser.GpaInterface();
    parser.Developer desired = new parser.LongDatabase();
    parser.Developer grr = new parser.GrrProgrammer();
    parser.Developer con = new parser.DcSpreadsheet();
    this.use.addLast(paps);
    this.use.addLast(erie);
    this.use.addLast(desired);
    this.use.addLast(con);
    this.use.addLast(grr);
  }

  public synchronized void prepareMethodologies(java.util.LinkedList<Serve> operation) {
    double numbersObjects = synX2657double;
    this.treat = operation;
  }

  public synchronized void determinedDischargeDays(int routingWeek) {
    double decreasingLeap = synX2658double;
    this.DespatchClock = routingWeek;
  }

  public synchronized void testDistributors() {
    int littleRoll = synX2659int;
    for (parser.Developer fh : use) synx502(fh);
    this.catalogOutline();
  }

  public synchronized void catalogOutline() {
    double full = synX2660double;

    try {
      CycleJoystick.TurnoutCharge.write(synX2661String);
      out.println(synX2662String);
      java.lang.String manifold =
          format(synX2663String, synX2664String, synX2665String, synX2666String);
      CycleJoystick.TurnoutCharge.write(manifold + synX2667String);
      out.println(manifold);
      for (parser.Developer waffen : use) {
        java.lang.String summation =
            format(
                synX2668String,
                waffen.timerMention(),
                waffen.takeMeanSitPeriod(),
                waffen.catchCommonRevivalWhen());
        CycleJoystick.TurnoutCharge.write(summation + synX2669String);
        out.println(summation);
      }
      CycleJoystick.TurnoutCharge.close();
    } catch (java.io.IOException abbe) {
      out.println(synX2670String);
    }
  }

  private synchronized void synx502(Developer fh) {
    fh.commenceProgramming();

    while (fh.goIsMoving()) {

      if (fh.developSubmittedTechnologiesStature() == treat.size()) {
        fh.hitchMultitasking();
      } else {
        java.util.LinkedList<Serve> departsMethod = new java.util.LinkedList<>();
        for (parser.Serve cern : treat) {

          if (cern.beatSubmitJuncture() == fh.catchRifeCheck() + synX2671int) {
            departsMethod.add(new parser.Serve(cern));
          }
        }
        sort(departsMethod);

        while (!departsMethod.isEmpty()) {
          fh.appendageEntering(departsMethod.removeFirst());
        }
        fh.determinedLiveTic(fh.catchRifeCheck() + synX2672int);
        fh.optiBeat();
      }
    }
  }
}
