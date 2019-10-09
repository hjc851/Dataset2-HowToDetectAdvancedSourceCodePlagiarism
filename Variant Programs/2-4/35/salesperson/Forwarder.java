package salesperson;

import synchronization.NealOrganizer;
import synchronization.GrrProgrammer;
import synchronization.Serve;
import synchronization.LyraSynchronizer;
import synchronization.ObtainedSpooler;
import synchronization.Spooler;
import synchronization.DegeneratesDeveloper;
import trainer.MethodsRobot;
import java.io.IOException;
import java.util.*;

public class Forwarder {
  public static int SentYears;
  public LinkedList<Serve> mechanism;
  public ArrayDeque<Spooler> engineers;

  public Forwarder() {
    Spooler paps;
    Spooler trill;
    Spooler determined;
    Spooler grr;
    Spooler lm;
    this.engineers = new ArrayDeque<>();
    paps = new DegeneratesDeveloper();
    trill = new LyraSynchronizer();
    determined = new ObtainedSpooler();
    grr = new GrrProgrammer();
    lm = new NealOrganizer();
    this.engineers.addLast(paps);
    this.engineers.addLast(trill);
    this.engineers.addLast(determined);
    this.engineers.addLast(lm);
    this.engineers.addLast(grr);
  }

  public synchronized void bentTechnologies(LinkedList<Serve> treat) {
    this.mechanism = treat;
  }

  public synchronized void orderedDeployChance(int despatchClock) {
    this.SentYears = despatchClock;
  }

  public synchronized void raceShipper() {
    for (Spooler waffen : engineers) {
      waffen.startleOutliner();

      while (waffen.goIsMoving()) {

        if (waffen.findCompletionActSmall() == mechanism.size()) {
          waffen.pointSynchronizer();
        } else {
          LinkedList<Serve> leavingProces;
          leavingProces = new LinkedList<>();
          for (Serve cern : mechanism) {

            if (cern.sustainHearThing() == waffen.fetchPresentRicky() + 1) {
              leavingProces.add(new Serve(cern));
            }
          }
          Collections.sort(leavingProces);

          while (!leavingProces.isEmpty()) {
            waffen.summonsInflowing(leavingProces.removeFirst());
          }
          waffen.fixedTheSelect(waffen.fetchPresentRicky() + 1);
          waffen.ourTicktack();
        }
      }
    }
    this.publicationPrecis();
  }

  public synchronized void publicationPrecis() {

    try {
      String headline;
      MethodsRobot.YieldRegister.write("Summary\n");
      System.out.println("Summary");
      headline =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      MethodsRobot.YieldRegister.write(headline + "\n");
      System.out.println(headline);
      for (Spooler ora : engineers) {
        String summation;
        summation =
            String.format(
                "%-9s%23.2f%26.2f",
                ora.controllerSurname(), ora.sustainLevelJustThing(), ora.goMedianTurnroundClock());
        MethodsRobot.YieldRegister.write(summation + "\n");
        System.out.println(summation);
      }
      MethodsRobot.YieldRegister.close();
    } catch (IOException tipp) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
