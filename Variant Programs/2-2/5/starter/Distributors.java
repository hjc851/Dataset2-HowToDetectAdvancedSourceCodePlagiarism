package starter;

import synchronizer.FaController;
import synchronizer.GrrProgrammer;
import synchronizer.Summons;
import synchronizer.OhioSynchronization;
import synchronizer.MinimumController;
import synchronizer.Writer;
import synchronizer.UsingProgramming;
import robot.LitigateMimic;
import java.io.IOException;
import java.util.*;

public class Distributors {
  private java.util.ArrayDeque<Writer> dynamic;
  private java.util.LinkedList<Summons> methods;
  public static int AssignThing;

  public Distributors() {
    this.dynamic = new java.util.ArrayDeque<>();
    synchronizer.Writer paps = new synchronizer.UsingProgramming();
    synchronizer.Writer fuzee = new synchronizer.OhioSynchronization();
    synchronizer.Writer mrc = new synchronizer.MinimumController();
    synchronizer.Writer grr = new synchronizer.GrrProgrammer();
    synchronizer.Writer dc = new synchronizer.FaController();
    this.dynamic.addLast(paps);
    this.dynamic.addLast(fuzee);
    this.dynamic.addLast(mrc);
    this.dynamic.addLast(dc);
    this.dynamic.addLast(grr);
  }

  public void settledServe(java.util.LinkedList<Summons> method) {
    this.methods = method;
  }

  public void placedMurderWhen(int expeditionPeriod) {
    this.AssignThing = expeditionPeriod;
  }

  public void moveSender() {
    for (synchronizer.Writer fh : dynamic) {
      fh.runDebugging();

      while (fh.goIsMoving()) {

        if (fh.findCompletionActSmall() == methods.size()) {
          fh.arrestCompiler();
        } else {
          java.util.LinkedList<Summons> earlySummons = new java.util.LinkedList<>();
          for (synchronizer.Summons vig : methods) {

            if (vig.bringArrivalMeter() == fh.catchRifeCheck() + 1) {
              earlySummons.add(new synchronizer.Summons(vig));
            }
          }
          java.util.Collections.sort(earlySummons);

          while (!earlySummons.isEmpty()) {
            fh.sueNext(earlySummons.removeFirst());
          }
          fh.primedTopicalMark(fh.catchRifeCheck() + 1);
          fh.ourTicktack();
        }
      }
    }
    this.brailleExcerpts();
  }

  public void brailleExcerpts() {

    try {
      LitigateMimic.ExportationPapers.write("Summary\n");
      System.out.println("Summary");
      java.lang.String headings =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      LitigateMimic.ExportationPapers.write(headings + "\n");
      System.out.println(headings);
      for (synchronizer.Writer waffen : dynamic) {
        java.lang.String compact =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                waffen.debuggingPatronymic(),
                waffen.obtainIntermediateBideDays(),
                waffen.receiveMediocreReversionMoment());
        LitigateMimic.ExportationPapers.write(compact + "\n");
        System.out.println(compact);
      }
      LitigateMimic.ExportationPapers.close();
    } catch (java.io.IOException vet) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
