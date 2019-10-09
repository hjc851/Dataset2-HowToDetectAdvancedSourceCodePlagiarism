package consignor;

import spooler.AlterPlanner;
import spooler.GrrProgrammer;
import spooler.March;
import spooler.OberProgrammer;
import spooler.TreatedSynchronization;
import spooler.Workspace;
import spooler.PapsOrganizer;
import sim.ActMock;
import java.io.IOException;
import java.util.*;

public class Limiter {
  private java.util.ArrayDeque<Workspace> performance;
  private java.util.LinkedList<March> mechanism;
  public static int DeploymentMinutes;

  public Limiter() {
    this.performance = new java.util.ArrayDeque<>();
    spooler.Workspace scheduling = new spooler.PapsOrganizer();
    spooler.Workspace oxime = new spooler.OberProgrammer();
    spooler.Workspace operated = new spooler.TreatedSynchronization();
    spooler.Workspace grr = new spooler.GrrProgrammer();
    spooler.Workspace com = new spooler.AlterPlanner();
    this.performance.addLast(scheduling);
    this.performance.addLast(oxime);
    this.performance.addLast(operated);
    this.performance.addLast(com);
    this.performance.addLast(grr);
  }

  public void solidifyingOperations(java.util.LinkedList<March> methods) {
    this.mechanism = methods;
  }

  public void adjustDispatchedMonth(int assignThing) {
    this.DeploymentMinutes = assignThing;
  }

  public void leadCoordinator() {
    for (spooler.Workspace waffen : performance) {
      waffen.kickoffSpooler();

      while (waffen.goIsMoving()) {

        if (waffen.makeUndertakenMarchDimensions() == mechanism.size()) {
          waffen.occlusionDebugging();
        } else {
          java.util.LinkedList<March> fromOperations = new java.util.LinkedList<>();
          for (spooler.March vig : mechanism) {

            if (vig.produceComingNow() == waffen.findActualRetick() + 1) {
              fromOperations.add(new spooler.March(vig));
            }
          }
          java.util.Collections.sort(fromOperations);

          while (!fromOperations.isEmpty()) {
            waffen.outgrowthSucceeding(fromOperations.removeFirst());
          }
          waffen.markAfootDials(waffen.findActualRetick() + 1);
          waffen.addTock();
        }
      }
    }
    this.printableRecap();
  }

  public void printableRecap() {

    try {
      ActMock.SupplyDocumentation.write("Summary\n");
      System.out.println("Summary");
      java.lang.String letterhead =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ActMock.SupplyDocumentation.write(letterhead + "\n");
      System.out.println(letterhead);
      for (spooler.Workspace fh : performance) {
        java.lang.String excerpts =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                fh.spoolerDistinguish(),
                fh.generateFairPostponeYear(),
                fh.generateFairRecoveryYear());
        ActMock.SupplyDocumentation.write(excerpts + "\n");
        System.out.println(excerpts);
      }
      ActMock.SupplyDocumentation.close();
    } catch (java.io.IOException adult) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
