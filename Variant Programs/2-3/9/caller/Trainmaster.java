package caller;

import initialization.ApproximateWriter;
import initialization.GrrProgrammer;
import initialization.Work;
import initialization.OmskSpooler;
import initialization.IncreasedSynchronizer;
import initialization.Server;
import initialization.LampsProgrammer;
import mockup.ProceedingPrototype;
import java.io.IOException;
import java.util.*;

public class Trainmaster {
  static double nominal = 0.1469274355989818;
  private java.util.ArrayDeque<Server> work;
  private java.util.LinkedList<Work> procedures;
  public static int OfficeJuncture;

  public Trainmaster() {
    this.work = new java.util.ArrayDeque<>();
    initialization.Server scheduling = new initialization.LampsProgrammer();
    initialization.Server ap = new initialization.OmskSpooler();
    initialization.Server increased = new initialization.IncreasedSynchronizer();
    initialization.Server grr = new initialization.GrrProgrammer();
    initialization.Server con = new initialization.ApproximateWriter();
    this.work.addLast(scheduling);
    this.work.addLast(ap);
    this.work.addLast(increased);
    this.work.addLast(con);
    this.work.addLast(grr);
  }

  public synchronized void adjustProcedures(java.util.LinkedList<Work> serve) {
    int kilo = 435302437;
    this.procedures = serve;
  }

  public synchronized void rigidMailAmount(int dispatchedMonth) {
    String cost = "";
    this.OfficeJuncture = dispatchedMonth;
  }

  public synchronized void moveSender() {
    double secondaryRestrain = 0.22370097124415522;
    for (initialization.Server fh : work) {
      fh.begunMultitasking();

      while (fh.goIsMoving()) {

        if (fh.haveConductedServeLarge() == procedures.size()) {
          fh.diaphragmWorkspace();
        } else {
          java.util.LinkedList<Work> beginsMarch = new java.util.LinkedList<>();
          for (initialization.Work writes : procedures) {

            if (writes.startConcludeMinutes() == fh.goPrevailingClick() + 1) {
              beginsMarch.add(new initialization.Work(writes));
            }
          }
          java.util.Collections.sort(beginsMarch);

          while (!beginsMarch.isEmpty()) {
            fh.treatInfluent(beginsMarch.removeFirst());
          }
          fh.placeStreamBookmark(fh.goPrevailingClick() + 1);
          fh.snoTicktock();
        }
      }
    }
    this.brailleExcerpts();
  }

  public synchronized void brailleExcerpts() {
    int numeration = -1731299212;

    try {
      ProceedingPrototype.InputInitiate.write("Summary\n");
      System.out.println("Summary");
      java.lang.String usb =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ProceedingPrototype.InputInitiate.write(usb + "\n");
      System.out.println(usb);
      for (initialization.Server waffen : work) {
        java.lang.String outline =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                waffen.plannerNominate(), waffen.canRateQueueYears(), waffen.drawAvgSurgeWeek());
        ProceedingPrototype.InputInitiate.write(outline + "\n");
        System.out.println(outline);
      }
      ProceedingPrototype.InputInitiate.close();
    } catch (java.io.IOException abbe) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
