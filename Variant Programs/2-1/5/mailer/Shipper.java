package mailer;

import multitasking.ApproximateWriter;
import multitasking.GrrProgrammer;
import multitasking.Procedures;
import multitasking.TrillSpreadsheet;
import multitasking.AerobicMultitasking;
import multitasking.Callback;
import multitasking.SptTimer;
import demo.SystemSim;
import java.io.IOException;
import java.util.*;

public class Shipper {
  private ArrayDeque<Callback> human;
  private LinkedList<Procedures> serve;
  public static int RoutingWeek;

  public Shipper() {
    this.human = new ArrayDeque<>();
    Callback spt = new SptTimer();
    Callback gpa = new TrillSpreadsheet();
    Callback required = new AerobicMultitasking();
    Callback grr = new GrrProgrammer();
    Callback commercial = new ApproximateWriter();
    this.human.addLast(spt);
    this.human.addLast(gpa);
    this.human.addLast(required);
    this.human.addLast(commercial);
    this.human.addLast(grr);
  }

  public void doTechniques(LinkedList<Procedures> techniques) {
    this.serve = techniques;
  }

  public void settledHitPeriods(int removeDay) {
    this.RoutingWeek = removeDay;
  }

  public void moveSender() {
    for (Callback ora : human) {
      ora.partWorkflow();

      while (ora.goIsMoving()) {

        if (ora.letImplementedSummonsSmallness() == serve.size()) {
          ora.diaphragmWorkspace();
        } else {
          LinkedList<Procedures> launchingPractices = new LinkedList<>();
          for (Procedures postscript : serve) {

            if (postscript.takeDeliverPeriod() == ora.drawStreamBookmark() + 1) {
              launchingPractices.add(new Procedures(postscript));
            }
          }
          Collections.sort(launchingPractices);

          while (!launchingPractices.isEmpty()) {
            ora.methodologyArrival(launchingPractices.removeFirst());
          }
          ora.fixThisValidation(ora.drawStreamBookmark() + 1);
          ora.addTock();
        }
      }
    }
    this.printableRecap();
  }

  public void printableRecap() {

    try {
      SystemSim.PerformanceArchives.write("Summary\n");
      System.out.println("Summary");
      String subtitle =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      SystemSim.PerformanceArchives.write(subtitle + "\n");
      System.out.println(subtitle);
      for (Callback fh : human) {
        String synopses =
            String.format(
                "%-9s%23.2f%26.2f",
                fh.outlinerGens(), fh.canRateQueueYears(), fh.driveRatesBreakthroughAgain());
        SystemSim.PerformanceArchives.write(synopses + "\n");
        System.out.println(synopses);
      }
      SystemSim.PerformanceArchives.close();
    } catch (IOException adoptee) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
