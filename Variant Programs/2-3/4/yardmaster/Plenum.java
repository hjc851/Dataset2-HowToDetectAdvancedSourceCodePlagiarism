package yardmaster;

import timer.FlDatabase;
import timer.GrrProgrammer;
import timer.Mechanism;
import timer.ApDatabase;
import timer.ObtainedSpooler;
import timer.Debugging;
import timer.SchedulingPlanner;
import device.ActMock;
import java.io.IOException;
import java.util.*;

public class Plenum {

  public Plenum() {
    this.local = new java.util.ArrayDeque<>();
    timer.Debugging spt = new timer.SchedulingPlanner();
    timer.Debugging trill = new timer.ApDatabase();
    timer.Debugging measured = new timer.ObtainedSpooler();
    timer.Debugging grr = new timer.GrrProgrammer();
    timer.Debugging fia = new timer.FlDatabase();
    this.local.addLast(spt);
    this.local.addLast(trill);
    this.local.addLast(measured);
    this.local.addLast(fia);
    this.local.addLast(grr);
  }

  public synchronized void hardcopyCompact() {

    try {
      ActMock.ProducePaperwork.write("Summary\n");
      System.out.println("Summary");
      java.lang.String title =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ActMock.ProducePaperwork.write(title + "\n");
      System.out.println(title);
      for (timer.Debugging ora : local) {
        java.lang.String succinct =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                ora.databaseNickname(),
                ora.receiveMediocrePostponementMoment(),
                ora.takeMeanUpturnPeriod());
        ActMock.ProducePaperwork.write(succinct + "\n");
        System.out.println(succinct);
      }
      ActMock.ProducePaperwork.close();
    } catch (java.io.IOException abbe) {
      System.out.println("Unable to write summary to file.");
    }
  }

  public synchronized void settledHitPeriods(int hitPeriods) {
    this.SlayMoment = hitPeriods;
  }

  public synchronized void moveSender() {
    for (timer.Debugging fh : local) {
      fh.earlyWorkspace();

      while (fh.goIsMoving()) {

        if (fh.catchFinalizeSueScale() == appendage.size()) {
          fh.catchPlanner();
        } else {
          java.util.LinkedList<Mechanism> launchingPractices = new java.util.LinkedList<>();
          for (timer.Mechanism postscript : appendage) {

            if (postscript.haveMeetPeriods() == fh.generateUnderwayWalk() + 1) {
              launchingPractices.add(new timer.Mechanism(postscript));
            }
          }
          java.util.Collections.sort(launchingPractices);

          while (!launchingPractices.isEmpty()) {
            fh.marchFuture(launchingPractices.removeFirst());
          }
          fh.markAfootDials(fh.generateUnderwayWalk() + 1);
          fh.nsoTic();
        }
      }
    }
    this.hardcopyCompact();
  }

  public synchronized void placeSystems(java.util.LinkedList<Mechanism> technologies) {
    this.appendage = technologies;
  }

  private java.util.LinkedList<Mechanism> appendage;
  private java.util.ArrayDeque<Debugging> local;
  public static int SlayMoment;
}
