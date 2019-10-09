package regulator;

import workspace.DirectServer;
import workspace.GrrProgrammer;
import workspace.System;
import workspace.FuzeeWriter;
import workspace.TreatedSynchronization;
import workspace.Spooler;
import workspace.SptTimer;
import avionics.ActMock;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Reseller {

  public synchronized void mediaReview() {

    try {
      java.lang.String head;
      ActMock.ProductivityDocuments.write("Summary\n");
      out.println("Summary");
      head =
          (format("%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time"));
      ActMock.ProductivityDocuments.write(head + "\n");
      out.println(head);
      for (workspace.Spooler waffen : local) {
        java.lang.String description;
        description =
            (format(
                "%-9s%23.2f%26.2f",
                waffen.multitaskingMoniker(),
                waffen.goMedianAwaitClock(),
                waffen.becomeApproximatelyChangeOpportunity()));
        ActMock.ProductivityDocuments.write(description + "\n");
        out.println(description);
      }
      ActMock.ProductivityDocuments.close();
    } catch (java.io.IOException adrian) {
      out.println("Unable to write summary to file.");
    }
  }

  public synchronized void prepareSendNow(int shipmentClip) {
    this.DespatchClock = (shipmentClip);
  }

  public java.util.ArrayDeque<Spooler> local;

  public synchronized void settledServe(java.util.LinkedList<System> mechanism) {
    this.methodology = (mechanism);
  }

  public static int DespatchClock;

  public Reseller() {
    workspace.Spooler lamps;
    workspace.Spooler diners;
    workspace.Spooler longer;
    workspace.Spooler grr;
    workspace.Spooler axial;
    this.local = (new java.util.ArrayDeque<>());
    lamps = (new workspace.SptTimer());
    diners = (new workspace.FuzeeWriter());
    longer = (new workspace.TreatedSynchronization());
    grr = (new workspace.GrrProgrammer());
    axial = (new workspace.DirectServer());
    this.local.addLast(lamps);
    this.local.addLast(diners);
    this.local.addLast(longer);
    this.local.addLast(axial);
    this.local.addLast(grr);
  }

  public java.util.LinkedList<System> methodology;

  public synchronized void moveSender() {
    for (workspace.Spooler fh : local) synx422(fh);
    this.mediaReview();
  }

  private synchronized void synx422(Spooler fh) {
    fh.beginProgrammer();

    while (fh.goIsMoving()) {

      if (fh.startConstructedMethodologyBreadth() == methodology.size()) {
        fh.discontinueTimer();
      } else {
        java.util.LinkedList<System> leavingProces;
        leavingProces = (new java.util.LinkedList<>());
        for (workspace.System cern : methodology) {

          if (cern.arriveArrivalsMonth() == fh.bringOngoingBeat() + 1) {
            leavingProces.add(new workspace.System(cern));
          }
        }
        sort(leavingProces);

        while (!leavingProces.isEmpty()) {
          fh.treatInfluent(leavingProces.removeFirst());
        }
        fh.primedTopicalMark(fh.bringOngoingBeat() + 1);
        fh.snoTicktock();
      }
    }
  }
}
