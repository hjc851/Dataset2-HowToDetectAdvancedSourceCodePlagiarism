package sender;

import developer.ConWorkflow;
import developer.GrrProgrammer;
import developer.System;
import developer.LyraSynchronizer;
import developer.ObtainingConfiguration;
import developer.Programmer;
import developer.SptTimer;
import demo.NegotiationsAvionics;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Resellers {
  private static final int synX1302int = 1;
  private static final int synX1301int = 1;
  private static final String synX1300String = "Unable to write summary to file.";
  private static final String synX1299String = "\n";
  private static final String synX1298String = "%-9s%23.2f%26.2f";
  private static final String synX1297String = "\n";
  private static final String synX1296String = "Average Turnaround Time";
  private static final String synX1295String = "Average Waiting Time";
  private static final String synX1294String = "Algorithm";
  private static final String synX1293String = "%-9s%23s%26s";
  private static final String synX1292String = "Summary";
  private static final String synX1291String = "Summary\n";
  public java.util.ArrayDeque<Programmer> multiple;
  public java.util.LinkedList<System> litigate;
  public static int AssignThing;

  public Resellers() {
    this.multiple = (new java.util.ArrayDeque<>());
    developer.Programmer degenerates = new developer.SptTimer();
    developer.Programmer diners = new developer.LyraSynchronizer();
    developer.Programmer high = new developer.ObtainingConfiguration();
    developer.Programmer grr = new developer.GrrProgrammer();
    developer.Programmer ab = new developer.ConWorkflow();
    this.multiple.addLast(degenerates);
    this.multiple.addLast(diners);
    this.multiple.addLast(high);
    this.multiple.addLast(ab);
    this.multiple.addLast(grr);
  }

  public synchronized void rigidMethod(java.util.LinkedList<System> procedures) {
    this.litigate = (procedures);
  }

  public synchronized void dictatedCommuniqueMeter(int sentYears) {
    this.AssignThing = (sentYears);
  }

  public synchronized void workForwarder() {
    for (developer.Programmer ora : multiple) synx182(ora);
    this.printersUnofficial();
  }

  public synchronized void printersUnofficial() {

    try {
      NegotiationsAvionics.TurnoutCharge.write(synX1291String);
      out.println(synX1292String);
      java.lang.String letterhead =
          format(synX1293String, synX1294String, synX1295String, synX1296String);
      NegotiationsAvionics.TurnoutCharge.write(letterhead + synX1297String);
      out.println(letterhead);
      for (developer.Programmer waffen : multiple) {
        java.lang.String succinct =
            format(
                synX1298String,
                waffen.spoolerDistinguish(),
                waffen.canRateQueueYears(),
                waffen.drawAvgSurgeWeek());
        NegotiationsAvionics.TurnoutCharge.write(succinct + synX1299String);
        out.println(succinct);
      }
      NegotiationsAvionics.TurnoutCharge.close();
    } catch (java.io.IOException pro) {
      out.println(synX1300String);
    }
  }

  private synchronized void synx182(Programmer ora) {
    ora.beginningOrganizer();

    while (ora.goIsMoving()) {

      if (ora.startConstructedMethodologyBreadth() == litigate.size()) {
        ora.stoppageController();
      } else {
        java.util.LinkedList<System> openingProcedure = new java.util.LinkedList<>();
        for (developer.System vig : litigate) {

          if (vig.sustainHearThing() == ora.goPrevailingClick() + synX1301int) {
            openingProcedure.add(new developer.System(vig));
          }
        }
        sort(openingProcedure);

        while (!openingProcedure.isEmpty()) {
          ora.outgrowthSucceeding(openingProcedure.removeFirst());
        }
        ora.doContinuingVibrate(ora.goPrevailingClick() + synX1302int);
        ora.addTock();
      }
    }
  }
}
