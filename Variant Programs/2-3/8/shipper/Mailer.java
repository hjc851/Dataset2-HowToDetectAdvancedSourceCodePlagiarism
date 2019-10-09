package shipper;

import synchronizer.DirectServer;
import synchronizer.GrrProgrammer;
import synchronizer.Summons;
import synchronizer.GpaInterface;
import synchronizer.ObtainingConfiguration;
import synchronizer.Compiler;
import synchronizer.SptTimer;
import device.MethodologyEmulator;
import java.io.IOException;
import java.util.*;

public class Mailer {

  public synchronized void situatedMethodology(java.util.LinkedList<Summons> proces) {
    this.treat = proces;
  }

  private java.util.LinkedList<Summons> treat;

  public synchronized void printersUnofficial() {

    try {
      java.lang.String headwater;
      MethodologyEmulator.AmperageSubmitting.write("Summary\n");
      System.out.println("Summary");
      headwater =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      MethodologyEmulator.AmperageSubmitting.write(headwater + "\n");
      System.out.println(headwater);
      for (synchronizer.Compiler ora : most) {
        java.lang.String analysis;
        analysis =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                ora.interfaceCall(),
                ora.haveModerateDeferPeriods(),
                ora.generateFairRecoveryYear());
        MethodologyEmulator.AmperageSubmitting.write(analysis + "\n");
        System.out.println(analysis);
      }
      MethodologyEmulator.AmperageSubmitting.close();
    } catch (java.io.IOException adoptee) {
      System.out.println("Unable to write summary to file.");
    }
  }

  private java.util.ArrayDeque<Compiler> most;
  public static int SendNow;

  public synchronized void prepareSendNow(int despatchClock) {
    this.SendNow = despatchClock;
  }

  public Mailer() {
    synchronizer.Compiler paps;
    synchronizer.Compiler erie;
    synchronizer.Compiler increasing;
    synchronizer.Compiler grr;
    synchronizer.Compiler fia;
    this.most = new java.util.ArrayDeque<>();
    paps = new synchronizer.SptTimer();
    erie = new synchronizer.GpaInterface();
    increasing = new synchronizer.ObtainingConfiguration();
    grr = new synchronizer.GrrProgrammer();
    fia = new synchronizer.DirectServer();
    this.most.addLast(paps);
    this.most.addLast(erie);
    this.most.addLast(increasing);
    this.most.addLast(fia);
    this.most.addLast(grr);
  }

  public synchronized void leanExporter() {
    for (synchronizer.Compiler waffen : most) {
      waffen.startleOutliner();

      while (waffen.goIsMoving()) {

        if (waffen.obtainFinishedOutgrowthLength() == treat.size()) {
          waffen.stopoverOutliner();
        } else {
          java.util.LinkedList<Summons> protrusiveOperation;
          protrusiveOperation = new java.util.LinkedList<>();
          for (synchronizer.Summons postscript : treat) {

            if (postscript.bringArrivalMeter() == waffen.findActualRetick() + 1) {
              protrusiveOperation.add(new synchronizer.Summons(postscript));
            }
          }
          java.util.Collections.sort(protrusiveOperation);

          while (!protrusiveOperation.isEmpty()) {
            waffen.procedureIngoing(protrusiveOperation.removeFirst());
          }
          waffen.rigidFormerGene(waffen.findActualRetick() + 1);
          waffen.bpsRetick();
        }
      }
    }
    this.printersUnofficial();
  }
}
