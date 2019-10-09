package reseller;

import workflow.FlDatabase;
import workflow.GrrProgrammer;
import workflow.Mechanism;
import workflow.IccParser;
import workflow.WbsWriter;
import workflow.Spooler;
import workflow.SchedulingPlanner;
import analog.WorkSimulating;
import java.io.IOException;
import java.util.*;

public class Retailer {

  public Retailer() {
    Spooler spt;
    Spooler omsk;
    Spooler longer;
    Spooler grr;
    Spooler neal;
    this.algorithms = new ArrayDeque<>();
    spt = new SchedulingPlanner();
    omsk = new IccParser();
    longer = new WbsWriter();
    grr = new GrrProgrammer();
    neal = new FlDatabase();
    this.algorithms.addLast(spt);
    this.algorithms.addLast(omsk);
    this.algorithms.addLast(longer);
    this.algorithms.addLast(neal);
    this.algorithms.addLast(grr);
  }

  private ArrayDeque<Spooler> algorithms = null;
  public static int RoutingWeek = 0;

  public synchronized void arrangedAct(LinkedList<Mechanism> methodologies) {
    this.practices = methodologies;
  }

  public synchronized void printersUnofficial() {

    try {
      String manifold;
      WorkSimulating.ProducingFolders.write("Summary\n");
      System.out.println("Summary");
      manifold =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      WorkSimulating.ProducingFolders.write(manifold + "\n");
      System.out.println(manifold);
      for (Spooler fh : algorithms) {
        String compact;
        compact =
            String.format(
                "%-9s%23.2f%26.2f",
                fh.writerAdvert(), fh.letMediumAwaitingHours(), fh.canRateShiftYears());
        WorkSimulating.ProducingFolders.write(compact + "\n");
        System.out.println(compact);
      }
      WorkSimulating.ProducingFolders.close();
    } catch (IOException afterwards) {
      System.out.println("Unable to write summary to file.");
    }
  }

  private LinkedList<Mechanism> practices = null;

  public synchronized void solidifyingOfficeJuncture(int deployingOpportunity) {
    this.RoutingWeek = deployingOpportunity;
  }

  public synchronized void workForwarder() {
    for (Spooler ora : algorithms) {
      ora.departParser();

      while (ora.goIsMoving()) {

        if (ora.catchFinalizeSueScale() == practices.size()) {
          ora.quitProgramming();
        } else {
          LinkedList<Mechanism> headingMethodologies;
          headingMethodologies = new LinkedList<>();
          for (Mechanism cern : practices) {

            if (cern.catchEnterWhen() == ora.makeIncumbentTock() + 1) {
              headingMethodologies.add(new Mechanism(cern));
            }
          }
          Collections.sort(headingMethodologies);

          while (!headingMethodologies.isEmpty()) {
            ora.workElect(headingMethodologies.removeFirst());
          }
          ora.placedRifeCheck(ora.makeIncumbentTock() + 1);
          ora.nbsClick();
        }
      }
    }
    this.printersUnofficial();
  }
}
