package distributors;

import spooler.CuOutliner;
import spooler.GrrProgrammer;
import spooler.Mechanism;
import spooler.EriePlanner;
import spooler.TribunalPlanner;
import spooler.Compiler;
import spooler.LampsProgrammer;
import sim.ProcedureSimulation;
import java.io.IOException;
import java.util.*;

public class Consignor {

  public Consignor() {
    this.work = new java.util.ArrayDeque<>();
    spooler.Compiler using = new spooler.LampsProgrammer();
    spooler.Compiler e = new spooler.EriePlanner();
    spooler.Compiler mrc = new spooler.TribunalPlanner();
    spooler.Compiler grr = new spooler.GrrProgrammer();
    spooler.Compiler dc = new spooler.CuOutliner();
    this.work.addLast(using);
    this.work.addLast(e);
    this.work.addLast(mrc);
    this.work.addLast(dc);
    this.work.addLast(grr);
  }

  public synchronized void prepareMethodologies(java.util.LinkedList<Mechanism> march) {
    this.mechanisms = march;
  }

  private java.util.ArrayDeque<Compiler> work = null;

  public synchronized void testDistributors() {
    for (spooler.Compiler waffen : work) {
      waffen.commencementSynchronization();

      while (waffen.goIsMoving()) {

        if (waffen.comeConsummatedOperationLarger() == mechanisms.size()) {
          waffen.catchPlanner();
        } else {
          java.util.LinkedList<Mechanism> leavingProces = new java.util.LinkedList<>();
          for (spooler.Mechanism writes : mechanisms) {

            if (writes.catchEnterWhen() == waffen.driveContinuingVibrate() + 1) {
              leavingProces.add(new spooler.Mechanism(writes));
            }
          }
          java.util.Collections.sort(leavingProces);

          while (!leavingProces.isEmpty()) {
            waffen.operationInbound(leavingProces.removeFirst());
          }
          waffen.primedTopicalMark(waffen.driveContinuingVibrate() + 1);
          waffen.bsiShudder();
        }
      }
    }
    this.writtenSummarization();
  }

  public static int CompleteSentence = 0;

  public synchronized void writtenSummarization() {

    try {
      ProcedureSimulation.ExportationPapers.write("Summary\n");
      System.out.println("Summary");
      java.lang.String commutator =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ProcedureSimulation.ExportationPapers.write(commutator + "\n");
      System.out.println(commutator);
      for (spooler.Compiler ora : work) {
        java.lang.String synopses =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                ora.synchronizerDescribe(),
                ora.sustainLevelJustThing(),
                ora.takeMeanUpturnPeriod());
        ProcedureSimulation.ExportationPapers.write(synopses + "\n");
        System.out.println(synopses);
      }
      ProcedureSimulation.ExportationPapers.close();
    } catch (java.io.IOException officio) {
      System.out.println("Unable to write summary to file.");
    }
  }

  private java.util.LinkedList<Mechanism> mechanisms = null;

  public synchronized void arrangedCompleteSentence(int despatchClock) {
    this.CompleteSentence = despatchClock;
  }
}
