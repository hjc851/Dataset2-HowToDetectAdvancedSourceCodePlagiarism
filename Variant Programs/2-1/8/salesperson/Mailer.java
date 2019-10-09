package salesperson;

import programming.ComSynchronization;
import programming.GrrProgrammer;
import programming.Proceedings;
import programming.BWorkspace;
import programming.MinimumController;
import programming.Controller;
import programming.SchedulingPlanner;
import modelling.ServeAnalogue;
import java.io.IOException;
import java.util.*;

public class Mailer {
  private ArrayDeque<Controller> local;
  private LinkedList<Proceedings> operation;
  public static int ShipmentClip;

  public Mailer() {
    this.local = new ArrayDeque<>();
    Controller lamps = new SchedulingPlanner();
    Controller f = new BWorkspace();
    Controller high = new MinimumController();
    Controller grr = new GrrProgrammer();
    Controller ab = new ComSynchronization();
    this.local.addLast(lamps);
    this.local.addLast(f);
    this.local.addLast(high);
    this.local.addLast(ab);
    this.local.addLast(grr);
  }

  public void determineProces(LinkedList<Proceedings> march) {
    this.operation = march;
  }

  public void arrangeSentYears(int sentYears) {
    this.ShipmentClip = sentYears;
  }

  public void campaignReseller() {
    for (Controller fh : local) {
      fh.offsetCompiler();

      while (fh.goIsMoving()) {

        if (fh.beatInauguratedOperationsSeverity() == operation.size()) {
          fh.containSpreadsheet();
        } else {
          LinkedList<Proceedings> playMethodology = new LinkedList<>();
          for (Proceedings vig : operation) {

            if (vig.haveMeetPeriods() == fh.sustainThisValidation() + 1) {
              playMethodology.add(new Proceedings(vig));
            }
          }
          Collections.sort(playMethodology);

          while (!playMethodology.isEmpty()) {
            fh.litigateArriving(playMethodology.removeFirst());
          }
          fh.fixedTheSelect(fh.sustainThisValidation() + 1);
          fh.ourTicktack();
        }
      }
    }
    this.impressSuccinct();
  }

  public void impressSuccinct() {

    try {
      ServeAnalogue.AmperageSubmitting.write("Summary\n");
      System.out.println("Summary");
      String headwater =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ServeAnalogue.AmperageSubmitting.write(headwater + "\n");
      System.out.println(headwater);
      for (Controller waffen : local) {
        String summarization =
            String.format(
                "%-9s%23.2f%26.2f",
                waffen.synchronizerDescribe(),
                waffen.generateFairPostponeYear(),
                waffen.letMediumReorganizationHours());
        ServeAnalogue.AmperageSubmitting.write(summarization + "\n");
        System.out.println(summarization);
      }
      ServeAnalogue.AmperageSubmitting.close();
    } catch (IOException adrian) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
