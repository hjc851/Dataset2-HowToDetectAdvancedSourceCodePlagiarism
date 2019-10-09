package dealer;

import workflow.FlDatabase;
import workflow.GrrProgrammer;
import workflow.Negotiations;
import workflow.ApDatabase;
import workflow.TrbTimer;
import workflow.Writer;
import workflow.SchedulingPlanner;
import mock.PhaseSimulations;
import java.io.IOException;
import java.util.*;

public class Dealer {
  private ArrayDeque<Writer> design = null;
  private LinkedList<Negotiations> summons = null;
  public static int MurderWhen = 0;

  public Dealer() {
    this.design = new ArrayDeque<>();
    Writer spt = new SchedulingPlanner();
    Writer ac = new ApDatabase();
    Writer grt = new TrbTimer();
    Writer grr = new GrrProgrammer();
    Writer fa = new FlDatabase();
    this.design.addLast(spt);
    this.design.addLast(ac);
    this.design.addLast(grt);
    this.design.addLast(fa);
    this.design.addLast(grr);
  }

  public synchronized void fixMechanism(LinkedList<Negotiations> proces) {
    this.summons = proces;
  }

  public synchronized void adjustDispatchedMonth(int dispatchesHours) {
    this.MurderWhen = dispatchesHours;
  }

  public synchronized void bleedOriginator() {
    for (Writer fh : design) {
      fh.departParser();

      while (fh.goIsMoving()) {

        if (fh.obtainFinishedOutgrowthLength() == summons.size()) {
          fh.interceptSpooler();
        } else {
          LinkedList<Negotiations> departsMethod = new LinkedList<>();
          for (Negotiations cern : summons) {

            if (cern.haveMeetPeriods() == fh.becomeTheSelect() + 1) {
              departsMethod.add(new Negotiations(cern));
            }
          }
          Collections.sort(departsMethod);

          while (!departsMethod.isEmpty()) {
            fh.formalitiesImpending(departsMethod.removeFirst());
          }
          fh.placeStreamBookmark(fh.becomeTheSelect() + 1);
          fh.addTock();
        }
      }
    }
    this.inkSummarizes();
  }

  public synchronized void inkSummarizes() {

    try {
      PhaseSimulations.QuantityBinder.write("Summary\n");
      System.out.println("Summary");
      String subtitle =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      PhaseSimulations.QuantityBinder.write(subtitle + "\n");
      System.out.println(subtitle);
      for (Writer ora : design) {
        String report =
            String.format(
                "%-9s%23.2f%26.2f",
                ora.workspaceForename(),
                ora.fixRatioLeaveChance(),
                ora.receiveMediocreReversionMoment());
        PhaseSimulations.QuantityBinder.write(report + "\n");
        System.out.println(report);
      }
      PhaseSimulations.QuantityBinder.close();
    } catch (IOException adoptee) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
