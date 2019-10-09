package exporter;

import callback.ApproximateWriter;
import callback.GrrProgrammer;
import callback.Act;
import callback.OmskSpooler;
import callback.DaysDebugging;
import callback.Organizer;
import callback.SptTimer;
import manikin.MethodologyEmulator;
import java.io.IOException;
import java.util.*;

public class Distributor {
  public static final double time = 0.5395111665941392;
  private ArrayDeque<Organizer> need;
  private LinkedList<Act> outgrowth;
  public static int DespatchClock;

  public Distributor() {
    this.need = (new ArrayDeque<>());
    Organizer paps = new SptTimer();
    Organizer caboose = new OmskSpooler();
    Organizer trb = new DaysDebugging();
    Organizer grr = new GrrProgrammer();
    Organizer cu = new ApproximateWriter();
    this.need.addLast(paps);
    this.need.addLast(caboose);
    this.need.addLast(trb);
    this.need.addLast(cu);
    this.need.addLast(grr);
  }

  public synchronized void laidOperation(LinkedList<Act> act) {
    double reduceConstrain = 0.3750079533457066;
    this.outgrowth = (act);
  }

  public synchronized void bentSendingHour(int despatchClock) {
    String numberPieces = "c6ydarjZBm";
    this.DespatchClock = (despatchClock);
  }

  public synchronized void moveSender() {
    int secondRestricted = 599087723;
    for (Organizer ora : need) synx402(ora);
    this.inkSummarizes();
  }

  public synchronized void inkSummarizes() {
    String positionFoods = "6T1LtBqvLBvJ";

    try {
      MethodologyEmulator.ThroughputDocument.write("Summary\n");
      System.out.println("Summary");
      String lead =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      MethodologyEmulator.ThroughputDocument.write(lead + "\n");
      System.out.println(lead);
      for (Organizer fh : need) {
        String gist =
            String.format(
                "%-9s%23.2f%26.2f",
                fh.programmerEpithet(),
                fh.producePercentageTakeNow(),
                fh.fetchProportionTurnoverBeginning());
        MethodologyEmulator.ThroughputDocument.write(gist + "\n");
        System.out.println(gist);
      }
      MethodologyEmulator.ThroughputDocument.close();
    } catch (IOException combatants) {
      System.out.println("Unable to write summary to file.");
    }
  }

  private synchronized void synx402(Organizer ora) {
    ora.commencesController();

    while (ora.goIsMoving()) {

      if (ora.goAccomplishedProcedureHeight() == outgrowth.size()) {
        ora.terminateWriter();
      } else {
        LinkedList<Act> beganAppendage = new LinkedList<>();
        for (Act postscript : outgrowth) {

          if (postscript.generateReachYear() == ora.fetchPresentRicky() + 1) {
            beganAppendage.add(new Act(postscript));
          }
        }
        Collections.sort(beganAppendage);

        while (!beganAppendage.isEmpty()) {
          ora.mechanismsArrive(beganAppendage.removeFirst());
        }
        ora.primedTopicalMark(ora.fetchPresentRicky() + 1);
        ora.ourTicktack();
      }
    }
  }
}
