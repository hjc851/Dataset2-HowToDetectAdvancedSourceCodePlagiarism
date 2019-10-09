package distributors;

import callback.ConWorkflow;
import callback.GrrProgrammer;
import callback.System;
import callback.TrilledServer;
import callback.LongerInitialization;
import callback.Timer;
import callback.PapsOrganizer;
import prototype.LitigateMimic;
import java.io.IOException;
import java.util.*;

public class Distributor {
  private java.util.ArrayDeque<Timer> fair;
  private java.util.LinkedList<System> procedures;
  public static int ExpeditionPeriod;

  public Distributor() {
    this.fair = new java.util.ArrayDeque<>();
    callback.Timer spt = new callback.PapsOrganizer();
    callback.Timer caboose = new callback.TrilledServer();
    callback.Timer trb = new callback.LongerInitialization();
    callback.Timer grr = new callback.GrrProgrammer();
    callback.Timer commercial = new callback.ConWorkflow();
    this.fair.addLast(spt);
    this.fair.addLast(caboose);
    this.fair.addLast(trb);
    this.fair.addLast(commercial);
    this.fair.addLast(grr);
  }

  public void situatedMethodology(java.util.LinkedList<System> sue) {
    this.procedures = sue;
  }

  public void adjustDispatchedMonth(int dispatchedMonth) {
    this.ExpeditionPeriod = dispatchedMonth;
  }

  public void goTrainmaster() {
    for (callback.Timer fh : fair) {
      fh.beginningOrganizer();

      while (fh.goIsMoving()) {

        if (fh.obtainFinishedOutgrowthLength() == procedures.size()) {
          fh.discontinueTimer();
        } else {
          java.util.LinkedList<System> fromOperations = new java.util.LinkedList<>();
          for (callback.System writes : procedures) {

            if (writes.takeDeliverPeriod() == fh.fixNewTally() + 1) {
              fromOperations.add(new callback.System(writes));
            }
          }
          java.util.Collections.sort(fromOperations);

          while (!fromOperations.isEmpty()) {
            fh.negotiationsNew(fromOperations.removeFirst());
          }
          fh.situatedPresentlyMarch(fh.fixNewTally() + 1);
          fh.nsoTic();
        }
      }
    }
    this.impressSuccinct();
  }

  public void impressSuccinct() {

    try {
      LitigateMimic.ProducerSubmitted.write("Summary\n");
      System.out.println("Summary");
      java.lang.String heading =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      LitigateMimic.ProducerSubmitted.write(heading + "\n");
      System.out.println(heading);
      for (callback.Timer ora : fair) {
        java.lang.String synopses =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                ora.serverDiagnose(), ora.comeNormalDelayClip(), ora.goMedianTurnroundClock());
        LitigateMimic.ProducerSubmitted.write(synopses + "\n");
        System.out.println(synopses);
      }
      LitigateMimic.ProducerSubmitted.close();
    } catch (java.io.IOException adrian) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
