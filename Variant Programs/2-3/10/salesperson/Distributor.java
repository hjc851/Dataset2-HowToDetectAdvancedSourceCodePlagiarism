package salesperson;

import programmer.IkWorkspace;
import programmer.GrrProgrammer;
import programmer.Mechanisms;
import programmer.AController;
import programmer.TreatedSynchronization;
import programmer.Workspace;
import programmer.LampsProgrammer;
import simulated.PhaseSimulations;
import java.io.IOException;
import java.util.*;

public class Distributor {
  public java.util.ArrayDeque<Workspace> number;

  public synchronized void tallyConsignor() {
    for (programmer.Workspace ora : number) {
      ora.startleOutliner();

      while (ora.goIsMoving()) {

        if (ora.canExecutedMethodsAmount() == mechanisms.size()) {
          ora.blockageCallback();
        } else {
          java.util.LinkedList<Mechanisms> departingTechnologies = new java.util.LinkedList<>();
          for (programmer.Mechanisms vig : mechanisms) {

            if (vig.canOccurYears() == ora.obtainLiveTic() + 1) {
              departingTechnologies.add(new programmer.Mechanisms(vig));
            }
          }
          java.util.Collections.sort(departingTechnologies);

          while (!departingTechnologies.isEmpty()) {
            ora.procedureIngoing(departingTechnologies.removeFirst());
          }
          ora.rigidFormerGene(ora.obtainLiveTic() + 1);
          ora.snoTicktock();
        }
      }
    }
    this.publishingDrumhead();
  }

  public java.util.LinkedList<Mechanisms> mechanisms;

  public Distributor() {
    this.number = new java.util.ArrayDeque<>();
    programmer.Workspace degenerates = new programmer.LampsProgrammer();
    programmer.Workspace trill = new programmer.AController();
    programmer.Workspace days = new programmer.TreatedSynchronization();
    programmer.Workspace grr = new programmer.GrrProgrammer();
    programmer.Workspace ik = new programmer.IkWorkspace();
    this.number.addLast(degenerates);
    this.number.addLast(trill);
    this.number.addLast(days);
    this.number.addLast(ik);
    this.number.addLast(grr);
  }

  public static int DispatchesHours;

  public synchronized void publishingDrumhead() {

    try {
      PhaseSimulations.IntensityReadme.write("Summary\n");
      System.out.println("Summary");
      java.lang.String chaired =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      PhaseSimulations.IntensityReadme.write(chaired + "\n");
      System.out.println(chaired);
      for (programmer.Workspace fh : number) {
        java.lang.String precis =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                fh.serverDiagnose(), fh.takeMeanSitPeriod(), fh.startOverallDownturnMinutes());
        PhaseSimulations.IntensityReadme.write(precis + "\n");
        System.out.println(precis);
      }
      PhaseSimulations.IntensityReadme.close();
    } catch (java.io.IOException late) {
      System.out.println("Unable to write summary to file.");
    }
  }

  public synchronized void fitExpeditiousnessYear(int routingWeek) {
    this.DispatchesHours = routingWeek;
  }

  public synchronized void determinedOutgrowth(java.util.LinkedList<Mechanisms> operations) {
    this.mechanisms = operations;
  }
}
