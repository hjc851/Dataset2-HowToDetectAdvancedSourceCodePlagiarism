package dealer;

import server.FaController;
import server.GrrProgrammer;
import server.Sue;
import server.GpaInterface;
import server.TribunalPlanner;
import server.Callback;
import server.UsingProgramming;
import modelling.ProceedingPrototype;
import java.io.IOException;
import java.util.*;

public class Sender {

  public synchronized void newspaperAnalysis() {

    try {
      String masthead;
      ProceedingPrototype.VolumeArchiving.write("Summary\n");
      System.out.println("Summary");
      masthead =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ProceedingPrototype.VolumeArchiving.write(masthead + "\n");
      System.out.println(masthead);
      for (Callback ora : using) {
        String synopsis;
        synopsis =
            String.format(
                "%-9s%23.2f%26.2f",
                ora.initializationPseudonym(),
                ora.findNormLookSentence(),
                ora.sustainLevelSpikeThing());
        ProceedingPrototype.VolumeArchiving.write(synopsis + "\n");
        System.out.println(synopsis);
      }
      ProceedingPrototype.VolumeArchiving.close();
    } catch (IOException abdul) {
      System.out.println("Unable to write summary to file.");
    }
  }

  public Sender() {
    Callback degenerates;
    Callback erie;
    Callback desired;
    Callback grr;
    Callback ap;
    this.using = new ArrayDeque<>();
    degenerates = new UsingProgramming();
    erie = new GpaInterface();
    desired = new TribunalPlanner();
    grr = new GrrProgrammer();
    ap = new FaController();
    this.using.addLast(degenerates);
    this.using.addLast(erie);
    this.using.addLast(desired);
    this.using.addLast(ap);
    this.using.addLast(grr);
  }

  public synchronized void fixedDeployingOpportunity(int removeDay) {
    this.CompleteSentence = removeDay;
  }

  public ArrayDeque<Callback> using;

  public synchronized void carryDevice() {
    for (Callback fh : using) {
      fh.originateConfiguration();

      while (fh.goIsMoving()) {

        if (fh.becomeConcludedPracticesQuantity() == mechanisms.size()) {
          fh.interceptSpooler();
        } else {
          LinkedList<Sue> beginningWork;
          beginningWork = new LinkedList<>();
          for (Sue writes : mechanisms) {

            if (writes.arriveArrivalsMonth() == fh.letAfootDials() + 1) {
              beginningWork.add(new Sue(writes));
            }
          }
          Collections.sort(beginningWork);

          while (!beginningWork.isEmpty()) {
            fh.methodologyArrival(beginningWork.removeFirst());
          }
          fh.situatedPresentlyMarch(fh.letAfootDials() + 1);
          fh.bpsRetick();
        }
      }
    }
    this.newspaperAnalysis();
  }

  public LinkedList<Sue> mechanisms;

  public synchronized void doTechniques(LinkedList<Sue> outgrowth) {
    this.mechanisms = outgrowth;
  }

  public static int CompleteSentence;
}
