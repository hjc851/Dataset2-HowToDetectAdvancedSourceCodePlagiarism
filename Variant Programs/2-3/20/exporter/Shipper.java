package exporter;

import synchronizer.LmDebugging;
import synchronizer.GrrProgrammer;
import synchronizer.Act;
import synchronizer.XingCallback;
import synchronizer.DefinedCompiler;
import synchronizer.Workspace;
import synchronizer.PapsOrganizer;
import brake.MarchDevice;
import java.io.IOException;
import java.util.*;

public class Shipper {

  public synchronized void writtenSummarization() {

    try {
      MarchDevice.ThroughputDocument.write("Summary\n");
      System.out.println("Summary");
      java.lang.String manifold =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      MarchDevice.ThroughputDocument.write(manifold + "\n");
      System.out.println(manifold);
      for (synchronizer.Workspace waffen : makers) {
        java.lang.String synopsis =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                waffen.synchronizerDescribe(),
                waffen.comeNormalDelayClip(),
                waffen.catchCommonRevivalWhen());
        MarchDevice.ThroughputDocument.write(synopsis + "\n");
        System.out.println(synopsis);
      }
      MarchDevice.ThroughputDocument.close();
    } catch (java.io.IOException pro) {
      System.out.println("Unable to write summary to file.");
    }
  }

  public java.util.ArrayDeque<Workspace> makers;

  public synchronized void fixedDeployingOpportunity(int dischargeDays) {
    this.OfficeJuncture = dischargeDays;
  }

  public static int OfficeJuncture;
  public java.util.LinkedList<Act> operation;

  public synchronized void determinedOutgrowth(java.util.LinkedList<Act> practices) {
    this.operation = practices;
  }

  public synchronized void outpouringPlenum() {
    for (synchronizer.Workspace ora : makers) {
      ora.commencementSynchronization();

      while (ora.goIsMoving()) {

        if (ora.developSubmittedTechnologiesStature() == operation.size()) {
          ora.stoppageController();
        } else {
          java.util.LinkedList<Act> lineMechanism = new java.util.LinkedList<>();
          for (synchronizer.Act cern : operation) {

            if (cern.takeDeliverPeriod() == ora.fixNewTally() + 1) {
              lineMechanism.add(new synchronizer.Act(cern));
            }
          }
          java.util.Collections.sort(lineMechanism);

          while (!lineMechanism.isEmpty()) {
            ora.negotiationsNew(lineMechanism.removeFirst());
          }
          ora.orderedNewTally(ora.fixNewTally() + 1);
          ora.optiBeat();
        }
      }
    }
    this.writtenSummarization();
  }

  public Shipper() {
    this.makers = new java.util.ArrayDeque<>();
    synchronizer.Workspace spt = new synchronizer.PapsOrganizer();
    synchronizer.Workspace xing = new synchronizer.XingCallback();
    synchronizer.Workspace determined = new synchronizer.DefinedCompiler();
    synchronizer.Workspace grr = new synchronizer.GrrProgrammer();
    synchronizer.Workspace cp = new synchronizer.LmDebugging();
    this.makers.addLast(spt);
    this.makers.addLast(xing);
    this.makers.addLast(determined);
    this.makers.addLast(cp);
    this.makers.addLast(grr);
  }
}
