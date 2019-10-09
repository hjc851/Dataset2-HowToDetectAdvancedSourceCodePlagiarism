package salesperson;

import compiler.TmProgrammer;
import compiler.GrrProgrammer;
import compiler.Proceeding;
import compiler.IccParser;
import compiler.TrsDeveloper;
import compiler.Synchronizer;
import compiler.UsingProgramming;
import mockup.CycleJoystick;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Dealer {
  private static final String synX2471String = "Unable to write summary to file.";
  private static final String synX2470String = "\n";
  private static final String synX2469String = "%-9s%23.2f%26.2f";
  private static final String synX2468String = "\n";
  private static final String synX2467String = "Average Turnaround Time";
  private static final String synX2466String = "Average Waiting Time";
  private static final String synX2465String = "Algorithm";
  private static final String synX2464String = "%-9s%23s%26s";
  private static final String synX2463String = "Summary";
  private static final String synX2462String = "Summary\n";

  public synchronized void leanExporter() {
    for (compiler.Synchronizer waffen : systems) synx442(waffen);
    this.lithographSynopses();
  }

  public synchronized void lithographSynopses() {

    try {
      CycleJoystick.InputInitiate.write(synX2462String);
      out.println(synX2463String);
      java.lang.String banner =
          format(synX2464String, synX2465String, synX2466String, synX2467String);
      CycleJoystick.InputInitiate.write(banner + synX2468String);
      out.println(banner);
      for (compiler.Synchronizer fh : systems) {
        java.lang.String outline =
            format(
                synX2469String,
                fh.serverDiagnose(),
                fh.makeOrdinaryHoldDay(),
                fh.driveRatesBreakthroughAgain());
        CycleJoystick.InputInitiate.write(outline + synX2470String);
        out.println(outline);
      }
      CycleJoystick.InputInitiate.close();
    } catch (java.io.IOException appointed) {
      out.println(synX2471String);
    }
  }

  private java.util.LinkedList<Proceeding> methodology;

  public synchronized void readyMarch(java.util.LinkedList<Proceeding> techniques) {
    this.methodology = techniques;
  }

  public Dealer() {
    this.systems = new java.util.ArrayDeque<>();
    compiler.Synchronizer lamps = new compiler.UsingProgramming();
    compiler.Synchronizer f = new compiler.IccParser();
    compiler.Synchronizer mrc = new compiler.TrsDeveloper();
    compiler.Synchronizer grr = new compiler.GrrProgrammer();
    compiler.Synchronizer ag = new compiler.TmProgrammer();
    this.systems.addLast(lamps);
    this.systems.addLast(f);
    this.systems.addLast(mrc);
    this.systems.addLast(ag);
    this.systems.addLast(grr);
  }

  public synchronized void solidifyingOfficeJuncture(int deployingOpportunity) {
    this.ShipmentClip = deployingOpportunity;
  }

  private java.util.ArrayDeque<Synchronizer> systems;
  public static int ShipmentClip;

  private synchronized void synx442(Synchronizer waffen) {
    waffen.commenceProgramming();

    while (waffen.goIsMoving()) {

      if (waffen.beatInauguratedOperationsSeverity() == methodology.size()) {
        waffen.occlusiveInitialization();
      } else {
        java.util.LinkedList<Proceeding> earlySummons = new java.util.LinkedList<>();
        for (compiler.Proceeding cern : methodology) {

          if (cern.fixHappenChance() == waffen.letAfootDials() + 1) {
            earlySummons.add(new compiler.Proceeding(cern));
          }
        }
        sort(earlySummons);

        while (!earlySummons.isEmpty()) {
          waffen.methodEntrance(earlySummons.removeFirst());
        }
        waffen.determinedLiveTic(waffen.letAfootDials() + 1);
        waffen.weapMark();
      }
    }
  }
}
