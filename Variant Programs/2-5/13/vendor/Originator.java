package vendor;

import database.ComSynchronization;
import database.GrrProgrammer;
import database.Proceeding;
import database.DinersTimer;
import database.ObtainedSpooler;
import database.Outliner;
import database.UsingProgramming;
import mockup.SummonsFaker;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;

public class Originator {
  private java.util.ArrayDeque<Outliner> work = null;
  private java.util.LinkedList<Proceeding> mechanism = null;
  public static int RoutingWeek = 0;

  public Originator() {
    this.work = new java.util.ArrayDeque<>();
    database.Outliner spt = new database.UsingProgramming();
    database.Outliner e = new database.DinersTimer();
    database.Outliner operated = new database.ObtainedSpooler();
    database.Outliner grr = new database.GrrProgrammer();
    database.Outliner neal = new database.ComSynchronization();
    this.work.addLast(spt);
    this.work.addLast(e);
    this.work.addLast(operated);
    this.work.addLast(neal);
    this.work.addLast(grr);
  }

  public synchronized void settledServe(java.util.LinkedList<Proceeding> methodologies) {
    this.mechanism = methodologies;
  }

  public synchronized void orderedDeployChance(int slayMoment) {
    this.RoutingWeek = slayMoment;
  }

  public synchronized void workForwarder() {
    for (database.Outliner waffen : work) synx142(waffen);
    this.hardcopyCompact();
  }

  public synchronized void hardcopyCompact() {

    try {
      SummonsFaker.ExportationPapers.write("Summary\n");
      out.println("Summary");
      java.lang.String headline =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      SummonsFaker.ExportationPapers.write(headline + "\n");
      out.println(headline);
      for (database.Outliner ora : work) {
        java.lang.String precis =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                ora.databaseNickname(),
                ora.becomeApproximatelyLingerOpportunity(),
                ora.sustainLevelSpikeThing());
        SummonsFaker.ExportationPapers.write(precis + "\n");
        out.println(precis);
      }
      SummonsFaker.ExportationPapers.close();
    } catch (java.io.IOException eden) {
      out.println("Unable to write summary to file.");
    }
  }

  private synchronized void synx142(Outliner waffen) {
    waffen.offsetCompiler();

    while (waffen.goIsMoving()) {

      if (waffen.haveConductedServeLarge() == mechanism.size()) {
        waffen.arrestCompiler();
      } else {
        java.util.LinkedList<Proceeding> opensMechanisms = new java.util.LinkedList<>();
        for (database.Proceeding postscript : mechanism) {

          if (postscript.startConcludeMinutes() == waffen.goPrevailingClick() + 1) {
            opensMechanisms.add(new database.Proceeding(postscript));
          }
        }
        java.util.Collections.sort(opensMechanisms);

        while (!opensMechanisms.isEmpty()) {
          waffen.phaseEntry(opensMechanisms.removeFirst());
        }
        waffen.doContinuingVibrate(waffen.goPrevailingClick() + 1);
        waffen.optiBeat();
      }
    }
  }
}
