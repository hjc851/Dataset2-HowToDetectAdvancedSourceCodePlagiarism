package salesperson;

import synchronization.DConfiguration;
import synchronization.GrrProgrammer;
import synchronization.Proceedings;
import synchronization.EtdDeveloper;
import synchronization.TribunalPlanner;
import synchronization.Writer;
import synchronization.UsingProgramming;
import analog.ProceedingPrototype;
import java.io.IOException;
import java.util.*;
import static java.util.Collections.sort;
import static java.lang.String.format;

public class Resellers {
  private java.util.ArrayDeque<Writer> makers = null;
  private java.util.LinkedList<Proceedings> serve = null;
  public static int DispatchesHours = 0;

  public Resellers() {
    this.makers = new java.util.ArrayDeque<>();
    synchronization.Writer paps = new synchronization.UsingProgramming();
    synchronization.Writer a = new synchronization.EtdDeveloper();
    synchronization.Writer increased = new synchronization.TribunalPlanner();
    synchronization.Writer grr = new synchronization.GrrProgrammer();
    synchronization.Writer dc = new synchronization.DConfiguration();
    this.makers.addLast(paps);
    this.makers.addLast(a);
    this.makers.addLast(increased);
    this.makers.addLast(dc);
    this.makers.addLast(grr);
  }

  public synchronized void settledServe(java.util.LinkedList<Proceedings> method) {
    this.serve = method;
  }

  public synchronized void primedExpeditionPeriod(int deployChance) {
    this.DispatchesHours = deployChance;
  }

  public synchronized void moveSender() {
    for (synchronization.Writer fh : makers) {
      fh.commencesController();

      while (fh.goIsMoving()) {

        if (fh.obtainFinishedOutgrowthLength() == serve.size()) {
          fh.diaphragmWorkspace();
        } else {
          java.util.LinkedList<Proceedings> departsMethod = new java.util.LinkedList<>();
          for (synchronization.Proceedings vig : serve) {

            if (vig.obtainSendDays() == fh.receiveContemporaryTicktack() + 1) {
              departsMethod.add(new synchronization.Proceedings(vig));
            }
          }
          sort(departsMethod);

          while (!departsMethod.isEmpty()) {
            fh.systemInpouring(departsMethod.removeFirst());
          }
          fh.laidLatestTicktock(fh.receiveContemporaryTicktack() + 1);
          fh.addTock();
        }
      }
    }
    this.catalogOutline();
  }

  public synchronized void catalogOutline() {

    try {
      ProceedingPrototype.ExportationPapers.write("Summary\n");
      System.out.println("Summary");
      java.lang.String subtitle =
          format("%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ProceedingPrototype.ExportationPapers.write(subtitle + "\n");
      System.out.println(subtitle);
      for (synchronization.Writer waffen : makers) {
        java.lang.String drumhead =
            format(
                "%-9s%23.2f%26.2f",
                waffen.developerIdentify(),
                waffen.drawAvgWantWeek(),
                waffen.comeNormalReversalClip());
        ProceedingPrototype.ExportationPapers.write(drumhead + "\n");
        System.out.println(drumhead);
      }
      ProceedingPrototype.ExportationPapers.close();
    } catch (java.io.IOException exwife) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
