package yardmaster;

import outliner.BParser;
import outliner.GrrProgrammer;
import outliner.System;
import outliner.StaOutliner;
import outliner.TreatedSynchronization;
import outliner.Initialization;
import outliner.SptTimer;
import moot.SystemSim;
import java.io.IOException;
import java.util.*;

public class Starter {
  public ArrayDeque<Initialization> most;

  public synchronized void bentTechnologies(LinkedList<System> mechanisms) {
    this.litigate = mechanisms;
  }

  public synchronized void mediaReview() {

    try {
      String commutator;
      SystemSim.ProducedExecutable.write("Summary\n");
      System.out.println("Summary");
      commutator =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      SystemSim.ProducedExecutable.write(commutator + "\n");
      System.out.println(commutator);
      for (Initialization waffen : most) {
        String summarize;
        summarize =
            String.format(
                "%-9s%23.2f%26.2f",
                waffen.organizerList(),
                waffen.receiveMediocrePostponementMoment(),
                waffen.arriveModalUpswingMonth());
        SystemSim.ProducedExecutable.write(summarize + "\n");
        System.out.println(summarize);
      }
      SystemSim.ProducedExecutable.close();
    } catch (IOException eden) {
      System.out.println("Unable to write summary to file.");
    }
  }

  public synchronized void determineDetachmentBeginning(int communiqueMeter) {
    this.SendingHour = communiqueMeter;
  }

  public LinkedList<System> litigate;

  public Starter() {
    Initialization degenerates;
    Initialization gpa;
    Initialization treated;
    Initialization grr;
    Initialization fia;
    this.most = new ArrayDeque<>();
    degenerates = new SptTimer();
    gpa = new StaOutliner();
    treated = new TreatedSynchronization();
    grr = new GrrProgrammer();
    fia = new BParser();
    this.most.addLast(degenerates);
    this.most.addLast(gpa);
    this.most.addLast(treated);
    this.most.addLast(fia);
    this.most.addLast(grr);
  }

  public static int SendingHour;

  public synchronized void testDistributors() {
    for (Initialization ora : most) {
      ora.originateConfiguration();

      while (ora.goIsMoving()) {

        if (ora.generatePerformedTreatFootprint() == litigate.size()) {
          ora.arrestCompiler();
        } else {
          LinkedList<System> starterOutgrowth;
          starterOutgrowth = new LinkedList<>();
          for (System postscript : litigate) {

            if (postscript.becomeFindOpportunity() == ora.fixNewTally() + 1) {
              starterOutgrowth.add(new System(postscript));
            }
          }
          Collections.sort(starterOutgrowth);

          while (!starterOutgrowth.isEmpty()) {
            ora.outgrowthSucceeding(starterOutgrowth.removeFirst());
          }
          ora.doContinuingVibrate(ora.fixNewTally() + 1);
          ora.optiBeat();
        }
      }
    }
    this.mediaReview();
  }
}
