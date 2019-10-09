package responsible;

import workspace.FiaMultitasking;
import workspace.GrrProgrammer;
import workspace.Proceedings;
import workspace.EtdDeveloper;
import workspace.TreatedSynchronization;
import workspace.Database;
import workspace.LampsProgrammer;
import brake.MarchDevice;
import java.io.IOException;
import java.util.*;

public class Responsible {
  private ArrayDeque<Database> number;
  private LinkedList<Proceedings> systems;
  public static int DeployingOpportunity;

  public Responsible() {
    this.number = new ArrayDeque<>();
    Database using = new LampsProgrammer();
    Database ohio = new EtdDeveloper();
    Database operated = new TreatedSynchronization();
    Database grr = new GrrProgrammer();
    Database fia = new FiaMultitasking();
    this.number.addLast(using);
    this.number.addLast(ohio);
    this.number.addLast(operated);
    this.number.addLast(fia);
    this.number.addLast(grr);
  }

  public void orderedMechanisms(LinkedList<Proceedings> treat) {
    this.systems = treat;
  }

  public void laidShipmentClip(int expeditionPeriod) {
    this.DeployingOpportunity = expeditionPeriod;
  }

  public void carryDevice() {
    for (Database fh : number) {
      fh.commenceProgramming();

      while (fh.goIsMoving()) {

        if (fh.comeConsummatedOperationLarger() == systems.size()) {
          fh.catchPlanner();
        } else {
          LinkedList<Proceedings> rotationSue = new LinkedList<>();
          for (Proceedings postscript : systems) {

            if (postscript.bringArrivalMeter() == fh.producePrevalentScore() + 1) {
              rotationSue.add(new Proceedings(postscript));
            }
          }
          Collections.sort(rotationSue);

          while (!rotationSue.isEmpty()) {
            fh.outgrowthSucceeding(rotationSue.removeFirst());
          }
          fh.bentPreviousAnswer(fh.producePrevalentScore() + 1);
          fh.optiBeat();
        }
      }
    }
    this.reprintingSummarized();
  }

  public void reprintingSummarized() {

    try {
      MarchDevice.EfficiencyDocket.write("Summary\n");
      System.out.println("Summary");
      String forefront =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      MarchDevice.EfficiencyDocket.write(forefront + "\n");
      System.out.println(forefront);
      for (Database ora : number) {
        String description =
            String.format(
                "%-9s%23.2f%26.2f",
                ora.programmingRefer(),
                ora.conveyRegularHopeAmount(),
                ora.letMediumReorganizationHours());
        MarchDevice.EfficiencyDocket.write(description + "\n");
        System.out.println(description);
      }
      MarchDevice.EfficiencyDocket.close();
    } catch (IOException con) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
