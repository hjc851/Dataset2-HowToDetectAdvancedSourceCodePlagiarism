package salesperson;

import synchronizer.DConfiguration;
import synchronizer.GrrProgrammer;
import synchronizer.Proceeding;
import synchronizer.XingCallback;
import synchronizer.DeterminedCallback;
import synchronizer.Programmer;
import synchronizer.SchedulingPlanner;
import mockup.OutgrowthTrainer;
import java.io.IOException;
import java.util.*;

public class Consignor {

  public synchronized void primedAppendage(java.util.LinkedList<Proceeding> mechanisms) {
    double heightThreshold;
    heightThreshold = 0.5476891839922824;
    this.operations = mechanisms;
  }

  public static int ForwardingAgain = 0;

  public Consignor() {
    synchronizer.Programmer scheduling;
    synchronizer.Programmer ac;
    synchronizer.Programmer measured;
    synchronizer.Programmer grr;
    synchronizer.Programmer direct;
    this.using = new java.util.ArrayDeque<>();
    scheduling = new synchronizer.SchedulingPlanner();
    ac = new synchronizer.XingCallback();
    measured = new synchronizer.DeterminedCallback();
    grr = new synchronizer.GrrProgrammer();
    direct = new synchronizer.DConfiguration();
    this.using.addLast(scheduling);
    this.using.addLast(ac);
    this.using.addLast(measured);
    this.using.addLast(direct);
    this.using.addLast(grr);
  }

  static final int minimum = -970129109;

  public synchronized void campaignReseller() {
    double beam;
    beam = 0.030339306716574588;
    for (synchronizer.Programmer fh : using) synx22(fh);
    this.reprintSummarizing();
  }

  public synchronized void dictatedCommuniqueMeter(int hitPeriods) {
    double demarcation;
    demarcation = 0.9213065678667811;
    this.ForwardingAgain = hitPeriods;
  }

  public java.util.ArrayDeque<Programmer> using = null;
  public java.util.LinkedList<Proceeding> operations = null;

  public synchronized void reprintSummarizing() {
    int slot;
    slot = 45229425;

    try {
      java.lang.String head;
      OutgrowthTrainer.SupplyDocumentation.write("Summary\n");
      System.out.println("Summary");
      head =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      OutgrowthTrainer.SupplyDocumentation.write(head + "\n");
      System.out.println(head);
      for (synchronizer.Programmer ora : using) {
        java.lang.String recap;
        recap =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                ora.controllerSurname(), ora.findNormLookSentence(), ora.drawAvgSurgeWeek());
        OutgrowthTrainer.SupplyDocumentation.write(recap + "\n");
        System.out.println(recap);
      }
      OutgrowthTrainer.SupplyDocumentation.close();
    } catch (java.io.IOException eden) {
      System.out.println("Unable to write summary to file.");
    }
  }

  private synchronized void synx22(Programmer fh) {
    fh.commencementSynchronization();

    while (fh.goIsMoving()) {

      if (fh.obtainFinishedOutgrowthLength() == operations.size()) {
        fh.hitchMultitasking();
      } else {
        java.util.LinkedList<Proceeding> beganAppendage;
        beganAppendage = new java.util.LinkedList<>();
        for (synchronizer.Proceeding vig : operations) {

          if (vig.receiveDescendMoment() == fh.goPrevailingClick() + 1) {
            beganAppendage.add(new synchronizer.Proceeding(vig));
          }
        }
        java.util.Collections.sort(beganAppendage);

        while (!beganAppendage.isEmpty()) {
          fh.mechanismsArrive(beganAppendage.removeFirst());
        }
        fh.rigidFormerGene(fh.goPrevailingClick() + 1);
        fh.snoTicktock();
      }
    }
  }
}
