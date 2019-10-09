package salesperson;

import organizer.BParser;
import organizer.GrrProgrammer;
import organizer.Proceeding;
import organizer.FuzeeWriter;
import organizer.MeasuredServer;
import organizer.Programmer;
import organizer.SchedulingPlanner;
import mock.TreatModelling;
import java.io.IOException;
import java.util.*;

public class Caller {
  private ArrayDeque<Programmer> most;
  private LinkedList<Proceeding> procedure;
  public static int CompleteSentence;

  public Caller() {
    this.most = new ArrayDeque<>();
    Programmer spt = new SchedulingPlanner();
    Programmer diners = new FuzeeWriter();
    Programmer determined = new MeasuredServer();
    Programmer grr = new GrrProgrammer();
    Programmer lm = new BParser();
    this.most.addLast(spt);
    this.most.addLast(diners);
    this.most.addLast(determined);
    this.most.addLast(lm);
    this.most.addLast(grr);
  }

  public void readyMarch(LinkedList<Proceeding> technologies) {
    this.procedure = technologies;
  }

  public void placeRoutingWeek(int sendNow) {
    this.CompleteSentence = sendNow;
  }

  public void scarperCaller() {
    for (Programmer waffen : most) {
      waffen.resumeServer();

      while (waffen.goIsMoving()) {

        if (waffen.findCompletionActSmall() == procedure.size()) {
          waffen.blockDeveloper();
        } else {
          LinkedList<Proceeding> fromOperations = new LinkedList<>();
          for (Proceeding writes : procedure) {

            if (writes.fixHappenChance() == waffen.takeTopicalMark() + 1) {
              fromOperations.add(new Proceeding(writes));
            }
          }
          Collections.sort(fromOperations);

          while (!fromOperations.isEmpty()) {
            waffen.marchFuture(fromOperations.removeFirst());
          }
          waffen.markAfootDials(waffen.takeTopicalMark() + 1);
          waffen.nbsClick();
        }
      }
    }
    this.fontReport();
  }

  public void fontReport() {

    try {
      TreatModelling.GdpDatabase.write("Summary\n");
      System.out.println("Summary");
      String head =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      TreatModelling.GdpDatabase.write(head + "\n");
      System.out.println(head);
      for (Programmer ora : most) {
        String precis =
            String.format(
                "%-9s%23.2f%26.2f",
                ora.synchronizerDescribe(), ora.takeMeanSitPeriod(), ora.fixRatioReboundChance());
        TreatModelling.GdpDatabase.write(precis + "\n");
        System.out.println(precis);
      }
      TreatModelling.GdpDatabase.close();
    } catch (IOException combatants) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
