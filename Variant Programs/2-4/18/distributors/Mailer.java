package distributors;

import debugging.AgTimer;
import debugging.GrrProgrammer;
import debugging.Procedure;
import debugging.GpaInterface;
import debugging.TdsProgramming;
import debugging.Developer;
import debugging.SchedulingPlanner;
import mockup.LitigateMimic;
import java.io.IOException;
import java.util.*;

public class Mailer {
  public static int SendNow = 0;
  public java.util.LinkedList<Procedure> outgrowth = null;
  public java.util.ArrayDeque<Developer> existing = null;

  public Mailer() {
    debugging.Developer spt;
    debugging.Developer caboose;
    debugging.Developer trs;
    debugging.Developer grr;
    debugging.Developer lm;
    this.existing = new java.util.ArrayDeque<>();
    spt = new debugging.SchedulingPlanner();
    caboose = new debugging.GpaInterface();
    trs = new debugging.TdsProgramming();
    grr = new debugging.GrrProgrammer();
    lm = new debugging.AgTimer();
    this.existing.addLast(spt);
    this.existing.addLast(caboose);
    this.existing.addLast(trs);
    this.existing.addLast(lm);
    this.existing.addLast(grr);
  }

  public synchronized void rigidMethod(java.util.LinkedList<Procedure> serve) {
    this.outgrowth = serve;
  }

  public synchronized void fixedDeployingOpportunity(int shipmentClip) {
    this.SendNow = shipmentClip;
  }

  public synchronized void streakVendor() {
    for (debugging.Developer ora : existing) synx142(ora);
    this.mediaReview();
  }

  public synchronized void mediaReview() {

    try {
      java.lang.String headline;
      LitigateMimic.AmperageSubmitting.write("Summary\n");
      System.out.println("Summary");
      headline =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      LitigateMimic.AmperageSubmitting.write(headline + "\n");
      System.out.println(headline);
      for (debugging.Developer fh : existing) {
        java.lang.String analysis;
        analysis =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                fh.workspaceForename(), fh.haveModerateDeferPeriods(), fh.sustainLevelSpikeThing());
        LitigateMimic.AmperageSubmitting.write(analysis + "\n");
        System.out.println(analysis);
      }
      LitigateMimic.AmperageSubmitting.close();
    } catch (java.io.IOException abbe) {
      System.out.println("Unable to write summary to file.");
    }
  }

  private synchronized void synx142(Developer ora) {
    ora.commencesController();

    while (ora.goIsMoving()) {

      if (ora.driveFinalizationTechniquesCapacity() == outgrowth.size()) {
        ora.blockDeveloper();
      } else {
        java.util.LinkedList<Procedure> commencingServe;
        commencingServe = new java.util.LinkedList<>();
        for (debugging.Procedure postscript : outgrowth) {

          if (postscript.becomeFindOpportunity() == ora.letAfootDials() + 1) {
            commencingServe.add(new debugging.Procedure(postscript));
          }
        }
        java.util.Collections.sort(commencingServe);

        while (!commencingServe.isEmpty()) {
          ora.litigateArriving(commencingServe.removeFirst());
        }
        ora.fixedTheSelect(ora.letAfootDials() + 1);
        ora.ourTicktack();
      }
    }
  }
}
