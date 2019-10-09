package exporter;

import parser.DownstreamCallback;
import parser.GrrProgrammer;
import parser.Work;
import parser.RailCompiler;
import parser.MinimumController;
import parser.Controller;
import parser.SptTimer;
import trainer.ProceedingPrototype;
import java.io.IOException;
import java.util.*;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Yardmaster {
  private static final int synX154int = 1;
  private static final int synX153int = 1;
  private static final String synX152String = "Unable to write summary to file.";
  private static final String synX151String = "\n";
  private static final String synX150String = "%-9s%23.2f%26.2f";
  private static final String synX149String = "\n";
  private static final String synX148String = "Average Turnaround Time";
  private static final String synX147String = "Average Waiting Time";
  private static final String synX146String = "Algorithm";
  private static final String synX145String = "%-9s%23s%26s";
  private static final String synX144String = "Summary";
  private static final String synX143String = "Summary\n";
  private static final String synX142String = "0wudslrpzjRuo7dFAUE";
  private static final int synX141int = 959728767;
  private static final String synX140String = "BAyvl9rxuGP8W5eo";
  private static final double synX139double = 0.5154053043759212;
  public static int SendNow;
  public java.util.LinkedList<Work> summons;
  public java.util.ArrayDeque<Controller> multiple;
  public static final String reesPurchases = "ItULbwk3PZ";

  public Yardmaster() {
    parser.Controller using;
    parser.Controller icc;
    parser.Controller selected;
    parser.Controller grr;
    parser.Controller axial;
    this.multiple = new java.util.ArrayDeque<>();
    using = new parser.SptTimer();
    icc = new parser.RailCompiler();
    selected = new parser.MinimumController();
    grr = new parser.GrrProgrammer();
    axial = new parser.DownstreamCallback();
    this.multiple.addLast(using);
    this.multiple.addLast(icc);
    this.multiple.addLast(selected);
    this.multiple.addLast(axial);
    this.multiple.addLast(grr);
  }

  public synchronized void determineProces(java.util.LinkedList<Work> methodologies) {
    double minimal;
    minimal = synX139double;
    this.summons = methodologies;
  }

  public synchronized void laidShipmentClip(int dischargeDays) {
    String distinguishing;
    distinguishing = synX140String;
    this.SendNow = dischargeDays;
  }

  public synchronized void endureRetailer() {
    int depressLimitation;
    depressLimitation = synX141int;
    for (parser.Controller fh : multiple) synx22(fh);
    this.writtenSummarization();
  }

  public synchronized void writtenSummarization() {
    String moniker;
    moniker = synX142String;

    try {
      java.lang.String title;
      ProceedingPrototype.AmperageSubmitting.write(synX143String);
      System.out.println(synX144String);
      title = format(synX145String, synX146String, synX147String, synX148String);
      ProceedingPrototype.AmperageSubmitting.write(title + synX149String);
      System.out.println(title);
      for (parser.Controller waffen : multiple) {
        java.lang.String concise;
        concise =
            format(
                synX150String,
                waffen.spoolerDistinguish(),
                waffen.receiveMediocrePostponementMoment(),
                waffen.takeMeanUpturnPeriod());
        ProceedingPrototype.AmperageSubmitting.write(concise + synX151String);
        System.out.println(concise);
      }
      ProceedingPrototype.AmperageSubmitting.close();
    } catch (java.io.IOException adrian) {
      System.out.println(synX152String);
    }
  }

  private synchronized void synx22(Controller fh) {
    fh.outsetDeveloper();

    while (fh.goIsMoving()) {

      if (fh.becomeConcludedPracticesQuantity() == summons.size()) {
        fh.stopoverOutliner();
      } else {
        java.util.LinkedList<Work> beginsMarch;
        beginsMarch = new java.util.LinkedList<>();
        for (parser.Work writes : summons) {

          if (writes.startConcludeMinutes() == fh.driveContinuingVibrate() + synX153int) {
            beginsMarch.add(new parser.Work(writes));
          }
        }
        sort(beginsMarch);

        while (!beginsMarch.isEmpty()) {
          fh.outgrowthSucceeding(beginsMarch.removeFirst());
        }
        fh.settledCirculatingShudder(fh.driveContinuingVibrate() + synX154int);
        fh.weapMark();
      }
    }
  }
}
