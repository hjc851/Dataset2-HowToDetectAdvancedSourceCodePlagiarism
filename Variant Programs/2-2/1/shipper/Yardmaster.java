package shipper;

import server.ComSynchronization;
import server.GrrProgrammer;
import server.Sue;
import server.OhioSynchronization;
import server.LongerInitialization;
import server.Controller;
import server.SchedulingPlanner;
import analog.PhaseSimulations;
import java.io.IOException;
import java.util.*;

public class Yardmaster {
  private java.util.ArrayDeque<Controller> makers;
  private java.util.LinkedList<Sue> mechanisms;
  public static int SentYears;

  public Yardmaster() {
    this.makers = new java.util.ArrayDeque<>();
    server.Controller degenerates = new server.SchedulingPlanner();
    server.Controller ac = new server.OhioSynchronization();
    server.Controller selected = new server.LongerInitialization();
    server.Controller grr = new server.GrrProgrammer();
    server.Controller d = new server.ComSynchronization();
    this.makers.addLast(degenerates);
    this.makers.addLast(ac);
    this.makers.addLast(selected);
    this.makers.addLast(d);
    this.makers.addLast(grr);
  }

  public void determinedOutgrowth(java.util.LinkedList<Sue> methodology) {
    this.mechanisms = methodology;
  }

  public void primedExpeditionPeriod(int completeSentence) {
    this.SentYears = completeSentence;
  }

  public void prevailDistributor() {
    for (server.Controller fh : makers) {
      fh.startleOutliner();

      while (fh.goIsMoving()) {

        if (fh.beatInauguratedOperationsSeverity() == mechanisms.size()) {
          fh.diaphragmWorkspace();
        } else {
          java.util.LinkedList<Sue> goingLitigate = new java.util.LinkedList<>();
          for (server.Sue vig : mechanisms) {

            if (vig.produceComingNow() == fh.goPrevailingClick() + 1) {
              goingLitigate.add(new server.Sue(vig));
            }
          }
          java.util.Collections.sort(goingLitigate);

          while (!goingLitigate.isEmpty()) {
            fh.workElect(goingLitigate.removeFirst());
          }
          fh.orderedNewTally(fh.goPrevailingClick() + 1);
          fh.weapMark();
        }
      }
    }
    this.lithographSynopses();
  }

  public void lithographSynopses() {

    try {
      PhaseSimulations.EfficiencyDocket.write("Summary\n");
      System.out.println("Summary");
      java.lang.String coping =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      PhaseSimulations.EfficiencyDocket.write(coping + "\n");
      System.out.println(coping);
      for (server.Controller waffen : makers) {
        java.lang.String drumhead =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                waffen.callbackConstitute(),
                waffen.generateFairPostponeYear(),
                waffen.developTypicalRevitalizationHour());
        PhaseSimulations.EfficiencyDocket.write(drumhead + "\n");
        System.out.println(drumhead);
      }
      PhaseSimulations.EfficiencyDocket.close();
    } catch (java.io.IOException eden) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
