package consignor;

import parser.FiaMultitasking;
import parser.GrrProgrammer;
import parser.Summons;
import parser.FDebugging;
import parser.LongDatabase;
import parser.Synchronization;
import parser.LampsProgrammer;
import kinematics.MethodologyEmulator;
import java.io.IOException;
import java.util.*;

public class Retailer {
  private ArrayDeque<Synchronization> planners;
  private LinkedList<Summons> mechanisms;
  public static int OfficeJuncture;

  public Retailer() {
    this.planners = new ArrayDeque<>();
    Synchronization spt = new LampsProgrammer();
    Synchronization ac = new FDebugging();
    Synchronization obtaining = new LongDatabase();
    Synchronization grr = new GrrProgrammer();
    Synchronization direct = new FiaMultitasking();
    this.planners.addLast(spt);
    this.planners.addLast(ac);
    this.planners.addLast(obtaining);
    this.planners.addLast(direct);
    this.planners.addLast(grr);
  }

  public void laidOperation(LinkedList<Summons> procedures) {
    this.mechanisms = procedures;
  }

  public void placedMurderWhen(int deployingOpportunity) {
    this.OfficeJuncture = deployingOpportunity;
  }

  public void leadCoordinator() {
    for (Synchronization ora : planners) {
      ora.beginsCallback();

      while (ora.goIsMoving()) {

        if (ora.canExecutedMethodsAmount() == mechanisms.size()) {
          ora.blockDeveloper();
        } else {
          LinkedList<Summons> earlySummons = new LinkedList<>();
          for (Summons writes : mechanisms) {

            if (writes.becomeFindOpportunity() == ora.sustainThisValidation() + 1) {
              earlySummons.add(new Summons(writes));
            }
          }
          Collections.sort(earlySummons);

          while (!earlySummons.isEmpty()) {
            ora.outgrowthSucceeding(earlySummons.removeFirst());
          }
          ora.rigidFormerGene(ora.sustainThisValidation() + 1);
          ora.nbsClick();
        }
      }
    }
    this.reprintSummarizing();
  }

  public void reprintSummarizing() {

    try {
      MethodologyEmulator.ProducePaperwork.write("Summary\n");
      System.out.println("Summary");
      String forefront =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      MethodologyEmulator.ProducePaperwork.write(forefront + "\n");
      System.out.println(forefront);
      for (Synchronization fh : planners) {
        String analysis =
            String.format(
                "%-9s%23.2f%26.2f",
                fh.programmingRefer(),
                fh.becomeApproximatelyLingerOpportunity(),
                fh.producePercentageTransitionNow());
        MethodologyEmulator.ProducePaperwork.write(analysis + "\n");
        System.out.println(analysis);
      }
      MethodologyEmulator.ProducePaperwork.close();
    } catch (IOException appointed) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
