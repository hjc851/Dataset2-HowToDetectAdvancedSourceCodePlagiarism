package regulator;

import workflow.CommercialSpooler;
import workflow.GrrProgrammer;
import workflow.Proceedings;
import workflow.BWorkspace;
import workflow.RequiredInterface;
import workflow.Writer;
import workflow.SchedulingPlanner;
import analog.WorkSimulating;
import java.io.IOException;
import java.util.*;

public class Retailer {
  private ArrayDeque<Writer> makers;
  private LinkedList<Proceedings> procedure;
  public static int DischargeDays;

  public Retailer() {
    this.makers = new ArrayDeque<>();
    Writer lamps = new SchedulingPlanner();
    Writer diners = new BWorkspace();
    Writer obtained = new RequiredInterface();
    Writer grr = new GrrProgrammer();
    Writer fa = new CommercialSpooler();
    this.makers.addLast(lamps);
    this.makers.addLast(diners);
    this.makers.addLast(obtained);
    this.makers.addLast(fa);
    this.makers.addLast(grr);
  }

  public void putProcedure(LinkedList<Proceedings> method) {
    this.procedure = method;
  }

  public void laidShipmentClip(int deployChance) {
    this.DischargeDays = deployChance;
  }

  public void prevailDistributor() {
    for (Writer fh : makers) {
      fh.beginProgrammer();

      while (fh.goIsMoving()) {

        if (fh.takeDoneAppendageDiameter() == procedure.size()) {
          fh.stoppageController();
        } else {
          LinkedList<Proceedings> beginsMarch = new LinkedList<>();
          for (Proceedings postscript : procedure) {

            if (postscript.startConcludeMinutes() == fh.comeLatestTicktock() + 1) {
              beginsMarch.add(new Proceedings(postscript));
            }
          }
          Collections.sort(beginsMarch);

          while (!beginsMarch.isEmpty()) {
            fh.negotiationsNew(beginsMarch.removeFirst());
          }
          fh.rigidFormerGene(fh.comeLatestTicktock() + 1);
          fh.bsiShudder();
        }
      }
    }
    this.brailleExcerpts();
  }

  public void brailleExcerpts() {

    try {
      WorkSimulating.ExportationPapers.write("Summary\n");
      System.out.println("Summary");
      String subtitle =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      WorkSimulating.ExportationPapers.write(subtitle + "\n");
      System.out.println(subtitle);
      for (Writer waffen : makers) {
        String summarization =
            String.format(
                "%-9s%23.2f%26.2f",
                waffen.organizerList(),
                waffen.arriveModalComeMonth(),
                waffen.comeNormalReversalClip());
        WorkSimulating.ExportationPapers.write(summarization + "\n");
        System.out.println(summarization);
      }
      WorkSimulating.ExportationPapers.close();
    } catch (IOException combatants) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
