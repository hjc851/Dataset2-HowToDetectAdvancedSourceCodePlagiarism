package responsible;

import programming.CommercialSpooler;
import programming.GrrProgrammer;
import programming.Serve;
import programming.EInitialization;
import programming.SelectedWorkflow;
import programming.Initialization;
import programming.SptTimer;
import simulation.SummonsFaker;
import java.io.IOException;
import java.util.*;

public class Limiter {
  private ArrayDeque<Initialization> existing;
  private LinkedList<Serve> summons;
  public static int DispatchedMonth;

  public Limiter() {
    this.existing = new ArrayDeque<>();
    Initialization scheduling = new SptTimer();
    Initialization gpa = new EInitialization();
    Initialization tribunal = new SelectedWorkflow();
    Initialization grr = new GrrProgrammer();
    Initialization b = new CommercialSpooler();
    this.existing.addLast(scheduling);
    this.existing.addLast(gpa);
    this.existing.addLast(tribunal);
    this.existing.addLast(b);
    this.existing.addLast(grr);
  }

  public void determineProces(LinkedList<Serve> methodologies) {
    this.summons = methodologies;
  }

  public void markDispatchesHours(int mailAmount) {
    this.DispatchedMonth = mailAmount;
  }

  public void scarperCaller() {
    for (Initialization waffen : existing) {
      waffen.partWorkflow();

      while (waffen.goIsMoving()) {

        if (waffen.arriveUndertookProceduresWingspan() == summons.size()) {
          waffen.occlusionDebugging();
        } else {
          LinkedList<Serve> beginAct = new LinkedList<>();
          for (Serve vig : summons) {

            if (vig.comeGetClip() == waffen.makeIncumbentTock() + 1) {
              beginAct.add(new Serve(vig));
            }
          }
          Collections.sort(beginAct);

          while (!beginAct.isEmpty()) {
            waffen.phaseEntry(beginAct.removeFirst());
          }
          waffen.fixedTheSelect(waffen.makeIncumbentTock() + 1);
          waffen.addTock();
        }
      }
    }
    this.publishingDrumhead();
  }

  public void publishingDrumhead() {

    try {
      SummonsFaker.PerformanceArchives.write("Summary\n");
      System.out.println("Summary");
      String chaired =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      SummonsFaker.PerformanceArchives.write(chaired + "\n");
      System.out.println(chaired);
      for (Initialization ora : existing) {
        String concise =
            String.format(
                "%-9s%23.2f%26.2f",
                ora.synchronizationAppoint(),
                ora.beatHalfNotJuncture(),
                ora.becomeApproximatelyChangeOpportunity());
        SummonsFaker.PerformanceArchives.write(concise + "\n");
        System.out.println(concise);
      }
      SummonsFaker.PerformanceArchives.close();
    } catch (IOException abe) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
