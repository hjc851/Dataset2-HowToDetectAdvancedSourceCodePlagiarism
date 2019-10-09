package retailer;

import database.LinearInitialization;
import database.GrrProgrammer;
import database.Act;
import database.EInitialization;
import database.GrtProgrammer;
import database.Outliner;
import database.SptTimer;
import demo.MethodImpactor;
import java.io.IOException;
import java.util.*;

public class Shipper {
  public ArrayDeque<Outliner> fair = null;
  public LinkedList<Act> procedures = null;
  public static int RemoveDay = 0;

  public Shipper() {
    this.fair = new ArrayDeque<>();
    Outliner degenerates = new SptTimer();
    Outliner diddle = new EInitialization();
    Outliner aerobic = new GrtProgrammer();
    Outliner grr = new GrrProgrammer();
    Outliner approximate = new LinearInitialization();
    this.fair.addLast(degenerates);
    this.fair.addLast(diddle);
    this.fair.addLast(aerobic);
    this.fair.addLast(approximate);
    this.fair.addLast(grr);
  }

  public synchronized void fitTreat(LinkedList<Act> methodology) {
    this.procedures = methodology;
  }

  public synchronized void solidifyingOfficeJuncture(int removeDay) {
    this.RemoveDay = removeDay;
  }

  public synchronized void bleedOriginator() {
    for (Outliner fh : fair) {
      fh.goTimer();

      while (fh.goIsMoving()) {

        if (fh.obtainFinishedOutgrowthLength() == procedures.size()) {
          fh.layoverConfiguration();
        } else {
          LinkedList<Act> commencingServe = new LinkedList<>();
          for (Act vig : procedures) {

            if (vig.canOccurYears() == fh.receiveContemporaryTicktack() + 1) {
              commencingServe.add(new Act(vig));
            }
          }
          Collections.sort(commencingServe);

          while (!commencingServe.isEmpty()) {
            fh.procedureIngoing(commencingServe.removeFirst());
          }
          fh.dictatedOngoingBeat(fh.receiveContemporaryTicktack() + 1);
          fh.ourTicktack();
        }
      }
    }
    this.reprintSummarizing();
  }

  public synchronized void reprintSummarizing() {

    try {
      MethodImpactor.ProducesFilename.write("Summary\n");
      System.out.println("Summary");
      String coping =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      MethodImpactor.ProducesFilename.write(coping + "\n");
      System.out.println(coping);
      for (Outliner waffen : fair) {
        String summarize =
            String.format(
                "%-9s%23.2f%26.2f",
                waffen.synchronizationAppoint(),
                waffen.haveModerateDeferPeriods(),
                waffen.letMediumReorganizationHours());
        MethodImpactor.ProducesFilename.write(summarize + "\n");
        System.out.println(summarize);
      }
      MethodImpactor.ProducesFilename.close();
    } catch (IOException adult) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
