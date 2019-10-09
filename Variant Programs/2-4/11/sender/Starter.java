package sender;

import developer.ApDeveloper;
import developer.GrrProgrammer;
import developer.Work;
import developer.GpaInterface;
import developer.LongDatabase;
import developer.Writer;
import developer.LampsProgrammer;
import device.ProcedureSimulation;
import java.io.IOException;
import java.util.*;

public class Starter {
  public java.util.LinkedList<Work> procedures;

  public synchronized void hardcopyCompact() {

    try {
      java.lang.String headlines;
      ProcedureSimulation.QuantityBinder.write("Summary\n");
      System.out.println("Summary");
      headlines =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ProcedureSimulation.QuantityBinder.write(headlines + "\n");
      System.out.println(headlines);
      for (developer.Writer fh : need) {
        java.lang.String outline;
        outline =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                fh.spoolerDistinguish(),
                fh.findNormLookSentence(),
                fh.fetchProportionTurnoverBeginning());
        ProcedureSimulation.QuantityBinder.write(outline + "\n");
        System.out.println(outline);
      }
      ProcedureSimulation.QuantityBinder.close();
    } catch (java.io.IOException adult) {
      System.out.println("Unable to write summary to file.");
    }
  }

  public static int SentYears;

  public synchronized void courseResponsible() {
    for (developer.Writer waffen : need) {
      waffen.jumpSynchronizer();

      while (waffen.goIsMoving()) {

        if (waffen.receiveFinalizedLitigateThickness() == procedures.size()) {
          waffen.breakInterface();
        } else {
          java.util.LinkedList<Work> onwardsProcedures;
          onwardsProcedures = new java.util.LinkedList<>();
          for (developer.Work writes : procedures) {

            if (writes.goComeClock() == waffen.receiveContemporaryTicktack() + 1) {
              onwardsProcedures.add(new developer.Work(writes));
            }
          }
          java.util.Collections.sort(onwardsProcedures);

          while (!onwardsProcedures.isEmpty()) {
            waffen.proceedingOutbound(onwardsProcedures.removeFirst());
          }
          waffen.orderedNewTally(waffen.receiveContemporaryTicktack() + 1);
          waffen.addTock();
        }
      }
    }
    this.hardcopyCompact();
  }

  public synchronized void settledHitPeriods(int sendNow) {
    this.SentYears = sendNow;
  }

  public java.util.ArrayDeque<Writer> need;

  public Starter() {
    developer.Writer spt;
    developer.Writer erie;
    developer.Writer determined;
    developer.Writer grr;
    developer.Writer b;
    this.need = new java.util.ArrayDeque<>();
    spt = new developer.LampsProgrammer();
    erie = new developer.GpaInterface();
    determined = new developer.LongDatabase();
    grr = new developer.GrrProgrammer();
    b = new developer.ApDeveloper();
    this.need.addLast(spt);
    this.need.addLast(erie);
    this.need.addLast(determined);
    this.need.addLast(b);
    this.need.addLast(grr);
  }

  public synchronized void determineProces(java.util.LinkedList<Work> march) {
    this.procedures = march;
  }
}
