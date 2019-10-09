package device;

import workspace.FaController;
import workspace.GrrProgrammer;
import workspace.Act;
import workspace.GpaInterface;
import workspace.SelectedWorkflow;
import workspace.Synchronizer;
import workspace.UsingProgramming;
import simulating.MarchDevice;
import java.io.IOException;
import java.util.*;

public class Reseller {
  private ArrayDeque<Synchronizer> systems;
  private LinkedList<Act> appendage;
  public static int DeployingOpportunity;

  public Reseller() {
    this.systems = new ArrayDeque<>();
    Synchronizer paps = new UsingProgramming();
    Synchronizer omsk = new GpaInterface();
    Synchronizer obtaining = new SelectedWorkflow();
    Synchronizer grr = new GrrProgrammer();
    Synchronizer bs = new FaController();
    this.systems.addLast(paps);
    this.systems.addLast(omsk);
    this.systems.addLast(obtaining);
    this.systems.addLast(bs);
    this.systems.addLast(grr);
  }

  public void doTechniques(LinkedList<Act> work) {
    this.appendage = work;
  }

  public void fixedDeployingOpportunity(int hitPeriods) {
    this.DeployingOpportunity = hitPeriods;
  }

  public void prevailDistributor() {
    for (Synchronizer ora : systems) {
      ora.beginProgrammer();

      while (ora.goIsMoving()) {

        if (ora.goAccomplishedProcedureHeight() == appendage.size()) {
          ora.breakInterface();
        } else {
          LinkedList<Act> departingTechnologies = new LinkedList<>();
          for (Act vig : appendage) {

            if (vig.bringArrivalMeter() == ora.fixNewTally() + 1) {
              departingTechnologies.add(new Act(vig));
            }
          }
          Collections.sort(departingTechnologies);

          while (!departingTechnologies.isEmpty()) {
            ora.methodEntrance(departingTechnologies.removeFirst());
          }
          ora.placeStreamBookmark(ora.fixNewTally() + 1);
          ora.nbsClick();
        }
      }
    }
    this.impressSuccinct();
  }

  public void impressSuccinct() {

    try {
      MarchDevice.ProducingFolders.write("Summary\n");
      System.out.println("Summary");
      String usb =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      MarchDevice.ProducingFolders.write(usb + "\n");
      System.out.println(usb);
      for (Synchronizer waffen : systems) {
        String compact =
            String.format(
                "%-9s%23.2f%26.2f",
                waffen.workflowCite(),
                waffen.fetchProportionAwaitsBeginning(),
                waffen.driveRatesBreakthroughAgain());
        MarchDevice.ProducingFolders.write(compact + "\n");
        System.out.println(compact);
      }
      MarchDevice.ProducingFolders.close();
    } catch (IOException adult) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
