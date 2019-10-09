package forwarder;

import configuration.AlterPlanner;
import configuration.GrrProgrammer;
import configuration.Sue;
import configuration.AController;
import configuration.OperatedParser;
import configuration.Server;
import configuration.PapsOrganizer;
import sim.PhaseSimulations;
import java.io.IOException;
import java.util.*;

public class Distributor {

  public synchronized void passMailer() {
    for (configuration.Server fh : dynamic) {
      fh.firstPlanner();

      while (fh.goIsMoving()) {

        if (fh.startConstructedMethodologyBreadth() == methodology.size()) {
          fh.stayParser();
        } else {
          java.util.LinkedList<Sue> departingTechnologies;
          departingTechnologies = new java.util.LinkedList<>();
          for (configuration.Sue vig : methodology) {

            if (vig.makeReceiveDay() == fh.obtainLiveTic() + 1) {
              departingTechnologies.add(new configuration.Sue(vig));
            }
          }
          java.util.Collections.sort(departingTechnologies);

          while (!departingTechnologies.isEmpty()) {
            fh.workElect(departingTechnologies.removeFirst());
          }
          fh.orderedNewTally(fh.obtainLiveTic() + 1);
          fh.bpsRetick();
        }
      }
    }
    this.brailleExcerpts();
  }

  public synchronized void arrangedAct(java.util.LinkedList<Sue> mechanism) {
    this.methodology = mechanism;
  }

  public java.util.ArrayDeque<Server> dynamic = null;
  public static int MurderWhen = 0;

  public Distributor() {
    configuration.Server scheduling;
    configuration.Server erie;
    configuration.Server obtaining;
    configuration.Server grr;
    configuration.Server b;
    this.dynamic = new java.util.ArrayDeque<>();
    scheduling = new configuration.PapsOrganizer();
    erie = new configuration.AController();
    obtaining = new configuration.OperatedParser();
    grr = new configuration.GrrProgrammer();
    b = new configuration.AlterPlanner();
    this.dynamic.addLast(scheduling);
    this.dynamic.addLast(erie);
    this.dynamic.addLast(obtaining);
    this.dynamic.addLast(b);
    this.dynamic.addLast(grr);
  }

  public java.util.LinkedList<Sue> methodology = null;

  public synchronized void situatedDeploymentMinutes(int sendNow) {
    this.MurderWhen = sendNow;
  }

  public synchronized void brailleExcerpts() {

    try {
      java.lang.String headline;
      PhaseSimulations.SupplyDocumentation.write("Summary\n");
      System.out.println("Summary");
      headline =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      PhaseSimulations.SupplyDocumentation.write(headline + "\n");
      System.out.println(headline);
      for (configuration.Server ora : dynamic) {
        java.lang.String compendious;
        compendious =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                ora.workspaceForename(), ora.makeOrdinaryHoldDay(), ora.generateFairRecoveryYear());
        PhaseSimulations.SupplyDocumentation.write(compendious + "\n");
        System.out.println(compendious);
      }
      PhaseSimulations.SupplyDocumentation.close();
    } catch (java.io.IOException voto) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
