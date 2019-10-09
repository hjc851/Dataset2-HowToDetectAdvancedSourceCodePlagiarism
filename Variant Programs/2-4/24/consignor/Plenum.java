package consignor;

import debugging.CuOutliner;
import debugging.GrrProgrammer;
import debugging.Methodology;
import debugging.EtdDeveloper;
import debugging.MinimumController;
import debugging.Controller;
import debugging.SptTimer;
import mockup.SummonsFaker;
import java.io.IOException;
import java.util.*;

public class Plenum {
  private java.util.ArrayDeque<Controller> engineers = null;
  private java.util.LinkedList<Methodology> act = null;
  public static int HitPeriods = 0;

  public Plenum() {
    this.engineers = new java.util.ArrayDeque<>();
    debugging.Controller scheduling = new debugging.SptTimer();
    debugging.Controller trill = new debugging.EtdDeveloper();
    debugging.Controller selected = new debugging.MinimumController();
    debugging.Controller grr = new debugging.GrrProgrammer();
    debugging.Controller direct = new debugging.CuOutliner();
    this.engineers.addLast(scheduling);
    this.engineers.addLast(trill);
    this.engineers.addLast(selected);
    this.engineers.addLast(direct);
    this.engineers.addLast(grr);
  }

  public synchronized void dictatedWork(java.util.LinkedList<Methodology> appendage) {
    this.act = appendage;
  }

  public synchronized void bentSendingHour(int sendNow) {
    this.HitPeriods = sendNow;
  }

  public synchronized void playSalesperson() {
    for (debugging.Controller fh : engineers) {
      fh.partWorkflow();

      while (fh.goIsMoving()) {

        if (fh.bringRealizedWorkWidth() == act.size()) {
          fh.blockDeveloper();
        } else {
          java.util.LinkedList<Methodology> commencingServe = new java.util.LinkedList<>();
          for (debugging.Methodology writes : act) {

            if (writes.canOccurYears() == fh.bringOngoingBeat() + 1) {
              commencingServe.add(new debugging.Methodology(writes));
            }
          }
          java.util.Collections.sort(commencingServe);

          while (!commencingServe.isEmpty()) {
            fh.outgrowthSucceeding(commencingServe.removeFirst());
          }
          fh.arrangedActualRetick(fh.bringOngoingBeat() + 1);
          fh.weapMark();
        }
      }
    }
    this.impressSuccinct();
  }

  public synchronized void impressSuccinct() {

    try {
      SummonsFaker.OutturnLodge.write("Summary\n");
      System.out.println("Summary");
      java.lang.String chapeau =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      SummonsFaker.OutturnLodge.write(chapeau + "\n");
      System.out.println(chapeau);
      for (debugging.Controller ora : engineers) {
        java.lang.String succinct =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                ora.timerMention(),
                ora.generateFairPostponeYear(),
                ora.makeOrdinaryTransformationDay());
        SummonsFaker.OutturnLodge.write(succinct + "\n");
        System.out.println(succinct);
      }
      SummonsFaker.OutturnLodge.close();
    } catch (java.io.IOException officio) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
