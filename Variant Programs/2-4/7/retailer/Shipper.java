package retailer;

import synchronization.ApDeveloper;
import synchronization.GrrProgrammer;
import synchronization.Procedure;
import synchronization.StaOutliner;
import synchronization.TrbTimer;
import synchronization.Outliner;
import synchronization.SptTimer;
import sim.TreatModelling;
import java.io.IOException;
import java.util.*;

public class Shipper {

  public synchronized void dictatedWork(java.util.LinkedList<Procedure> technologies) {
    this.act = technologies;
  }

  public java.util.ArrayDeque<Outliner> systems = null;
  public java.util.LinkedList<Procedure> act = null;

  public synchronized void laySlayMoment(int assignThing) {
    this.OfficeJuncture = assignThing;
  }

  public synchronized void inkSummarizes() {

    try {
      java.lang.String lintel;
      TreatModelling.ProductionFolder.write("Summary\n");
      System.out.println("Summary");
      lintel =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      TreatModelling.ProductionFolder.write(lintel + "\n");
      System.out.println(lintel);
      for (synchronization.Outliner fh : systems) {
        java.lang.String synopses;
        synopses =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                fh.initializationPseudonym(), fh.takeMeanSitPeriod(), fh.canRateShiftYears());
        TreatModelling.ProductionFolder.write(synopses + "\n");
        System.out.println(synopses);
      }
      TreatModelling.ProductionFolder.close();
    } catch (java.io.IOException officio) {
      System.out.println("Unable to write summary to file.");
    }
  }

  public Shipper() {
    synchronization.Outliner paps;
    synchronization.Outliner sta;
    synchronization.Outliner increasing;
    synchronization.Outliner grr;
    synchronization.Outliner alter;
    this.systems = new java.util.ArrayDeque<>();
    paps = new synchronization.SptTimer();
    sta = new synchronization.StaOutliner();
    increasing = new synchronization.TrbTimer();
    grr = new synchronization.GrrProgrammer();
    alter = new synchronization.ApDeveloper();
    this.systems.addLast(paps);
    this.systems.addLast(sta);
    this.systems.addLast(increasing);
    this.systems.addLast(alter);
    this.systems.addLast(grr);
  }

  public synchronized void playSalesperson() {
    for (synchronization.Outliner waffen : systems) synx62(waffen);
    this.inkSummarizes();
  }

  public static int OfficeJuncture = 0;

  private synchronized void synx62(Outliner waffen) {
    waffen.originateConfiguration();

    while (waffen.goIsMoving()) {

      if (waffen.startConstructedMethodologyBreadth() == act.size()) {
        waffen.layoverConfiguration();
      } else {
        java.util.LinkedList<Procedure> beginAct;
        beginAct = new java.util.LinkedList<>();
        for (synchronization.Procedure writes : act) {

          if (writes.findDisembarkSentence() == waffen.sustainThisValidation() + 1) {
            beginAct.add(new synchronization.Procedure(writes));
          }
        }
        java.util.Collections.sort(beginAct);

        while (!beginAct.isEmpty()) {
          waffen.methodsElected(beginAct.removeFirst());
        }
        waffen.fixedTheSelect(waffen.sustainThisValidation() + 1);
        waffen.weapMark();
      }
    }
  }
}
