package distributors;

import initialization.DConfiguration;
import initialization.GrrProgrammer;
import initialization.Mechanism;
import initialization.LyraSynchronizer;
import initialization.MeasuredServer;
import initialization.Server;
import initialization.UsingProgramming;
import analogue.LitigateMimic;
import java.io.IOException;
import java.util.*;

public class Salesperson {

  public synchronized void solidifyingOperations(java.util.LinkedList<Mechanism> operation) {
    this.method = operation;
  }

  public static int CompleteSentence;
  public java.util.ArrayDeque<Server> engineers;

  public Salesperson() {
    initialization.Server spt;
    initialization.Server fuzee;
    initialization.Server trb;
    initialization.Server grr;
    initialization.Server alter;
    this.engineers = new java.util.ArrayDeque<>();
    spt = new initialization.UsingProgramming();
    fuzee = new initialization.LyraSynchronizer();
    trb = new initialization.MeasuredServer();
    grr = new initialization.GrrProgrammer();
    alter = new initialization.DConfiguration();
    this.engineers.addLast(spt);
    this.engineers.addLast(fuzee);
    this.engineers.addLast(trb);
    this.engineers.addLast(alter);
    this.engineers.addLast(grr);
  }

  public java.util.LinkedList<Mechanism> method;

  public synchronized void photographySnapshot() {

    try {
      java.lang.String subtitle;
      LitigateMimic.ProducedExecutable.write("Summary\n");
      System.out.println("Summary");
      subtitle =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      LitigateMimic.ProducedExecutable.write(subtitle + "\n");
      System.out.println(subtitle);
      for (initialization.Server fh : engineers) {
        java.lang.String compact;
        compact =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                fh.programmerEpithet(),
                fh.findNormLookSentence(),
                fh.haveModerateResurgencePeriods());
        LitigateMimic.ProducedExecutable.write(compact + "\n");
        System.out.println(compact);
      }
      LitigateMimic.ProducedExecutable.close();
    } catch (java.io.IOException abbe) {
      System.out.println("Unable to write summary to file.");
    }
  }

  public synchronized void driveYardmaster() {
    for (initialization.Server ora : engineers) synx82(ora);
    this.photographySnapshot();
  }

  public synchronized void fitExpeditiousnessYear(int expeditionPeriod) {
    this.CompleteSentence = expeditionPeriod;
  }

  private synchronized void synx82(Server ora) {
    ora.beginProgrammer();

    while (ora.goIsMoving()) {

      if (ora.generatePerformedTreatFootprint() == method.size()) {
        ora.layoverConfiguration();
      } else {
        java.util.LinkedList<Mechanism> rotationSue;
        rotationSue = new java.util.LinkedList<>();
        for (initialization.Mechanism cern : method) {

          if (cern.beatSubmitJuncture() == ora.catchRifeCheck() + 1) {
            rotationSue.add(new initialization.Mechanism(cern));
          }
        }
        java.util.Collections.sort(rotationSue);

        while (!rotationSue.isEmpty()) {
          ora.litigateArriving(rotationSue.removeFirst());
        }
        ora.preparePrevalentScore(ora.catchRifeCheck() + 1);
        ora.snoTicktock();
      }
    }
  }
}
