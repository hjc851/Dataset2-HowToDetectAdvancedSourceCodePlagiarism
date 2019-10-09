package salesperson;

import timer.LmDebugging;
import timer.GrrProgrammer;
import timer.Proceeding;
import timer.EriePlanner;
import timer.IncreasedSynchronizer;
import timer.Controller;
import timer.SptTimer;
import analogue.ProceduresMoot;
import java.io.IOException;
import java.util.*;

public class Mailer {
  private java.util.ArrayDeque<Controller> human;
  private java.util.LinkedList<Proceeding> mechanism;
  public static int SendingHour;

  public Mailer() {
    this.human = new java.util.ArrayDeque<>();
    timer.Controller scheduling = new timer.SptTimer();
    timer.Controller ohio = new timer.EriePlanner();
    timer.Controller high = new timer.IncreasedSynchronizer();
    timer.Controller grr = new timer.GrrProgrammer();
    timer.Controller b = new timer.LmDebugging();
    this.human.addLast(scheduling);
    this.human.addLast(ohio);
    this.human.addLast(high);
    this.human.addLast(b);
    this.human.addLast(grr);
  }

  public void placedSue(java.util.LinkedList<Proceeding> methodologies) {
    this.mechanism = methodologies;
  }

  public void fixedDeployingOpportunity(int forwardingAgain) {
    this.SendingHour = forwardingAgain;
  }

  public void leanExporter() {
    for (timer.Controller ora : human) {
      ora.getInterface();

      while (ora.goIsMoving()) {

        if (ora.catchFinalizeSueScale() == mechanism.size()) {
          ora.stopoverOutliner();
        } else {
          java.util.LinkedList<Proceeding> commenceTechniques = new java.util.LinkedList<>();
          for (timer.Proceeding cern : mechanism) {

            if (cern.drawBringWeek() == ora.startPresentlyMarch() + 1) {
              commenceTechniques.add(new timer.Proceeding(cern));
            }
          }
          java.util.Collections.sort(commenceTechniques);

          while (!commenceTechniques.isEmpty()) {
            ora.cycleIn(commenceTechniques.removeFirst());
          }
          ora.arrangedActualRetick(ora.startPresentlyMarch() + 1);
          ora.nsoTic();
        }
      }
    }
    this.printableRecap();
  }

  public void printableRecap() {

    try {
      ProceduresMoot.SupplyDocumentation.write("Summary\n");
      System.out.println("Summary");
      java.lang.String usb =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ProceduresMoot.SupplyDocumentation.write(usb + "\n");
      System.out.println(usb);
      for (timer.Controller fh : human) {
        java.lang.String compact =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                fh.plannerNominate(), fh.findNormLookSentence(), fh.catchCommonRevivalWhen());
        ProceduresMoot.SupplyDocumentation.write(compact + "\n");
        System.out.println(compact);
      }
      ProceduresMoot.SupplyDocumentation.close();
    } catch (java.io.IOException exwife) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
