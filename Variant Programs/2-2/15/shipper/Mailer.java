package shipper;

import synchronizer.LinearInitialization;
import synchronizer.GrrProgrammer;
import synchronizer.Act;
import synchronizer.AcMultitasking;
import synchronizer.WbsWriter;
import synchronizer.Parser;
import synchronizer.SchedulingPlanner;
import robot.CycleJoystick;
import java.io.IOException;
import java.util.*;

public class Mailer {
  private java.util.ArrayDeque<Parser> need;
  private java.util.LinkedList<Act> sue;
  public static int ForwardingAgain;

  public Mailer() {
    this.need = new java.util.ArrayDeque<>();
    synchronizer.Parser spt = new synchronizer.SchedulingPlanner();
    synchronizer.Parser sta = new synchronizer.AcMultitasking();
    synchronizer.Parser measured = new synchronizer.WbsWriter();
    synchronizer.Parser grr = new synchronizer.GrrProgrammer();
    synchronizer.Parser cp = new synchronizer.LinearInitialization();
    this.need.addLast(spt);
    this.need.addLast(sta);
    this.need.addLast(measured);
    this.need.addLast(cp);
    this.need.addLast(grr);
  }

  public void settledServe(java.util.LinkedList<Act> mechanisms) {
    this.sue = mechanisms;
  }

  public void determinedDischargeDays(int despatchClock) {
    this.ForwardingAgain = despatchClock;
  }

  public void goTrainmaster() {
    for (synchronizer.Parser fh : need) {
      fh.partWorkflow();

      while (fh.goIsMoving()) {

        if (fh.startConstructedMethodologyBreadth() == sue.size()) {
          fh.breakInterface();
        } else {
          java.util.LinkedList<Act> beginningWork = new java.util.LinkedList<>();
          for (synchronizer.Act cern : sue) {

            if (cern.fixHappenChance() == fh.makeIncumbentTock() + 1) {
              beginningWork.add(new synchronizer.Act(cern));
            }
          }
          java.util.Collections.sort(beginningWork);

          while (!beginningWork.isEmpty()) {
            fh.treatInfluent(beginningWork.removeFirst());
          }
          fh.settledCirculatingShudder(fh.makeIncumbentTock() + 1);
          fh.bsiShudder();
        }
      }
    }
    this.fontReport();
  }

  public void fontReport() {

    try {
      CycleJoystick.ProducesFilename.write("Summary\n");
      System.out.println("Summary");
      java.lang.String headings =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      CycleJoystick.ProducesFilename.write(headings + "\n");
      System.out.println(headings);
      for (synchronizer.Parser waffen : need) {
        java.lang.String drumhead =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                waffen.organizerList(), waffen.drawAvgWantWeek(), waffen.sustainLevelSpikeThing());
        CycleJoystick.ProducesFilename.write(drumhead + "\n");
        System.out.println(drumhead);
      }
      CycleJoystick.ProducesFilename.close();
    } catch (java.io.IOException aba) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
