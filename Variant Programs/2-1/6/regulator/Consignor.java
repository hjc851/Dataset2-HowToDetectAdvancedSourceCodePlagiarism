package regulator;

import controller.FlDatabase;
import controller.GrrProgrammer;
import controller.Formalities;
import controller.BWorkspace;
import controller.TdsProgramming;
import controller.Programming;
import controller.LampsProgrammer;
import manikin.AppendageBrake;
import java.io.IOException;
import java.util.*;

public class Consignor {
  private ArrayDeque<Programming> use;
  private LinkedList<Formalities> techniques;
  public static int MailAmount;

  public Consignor() {
    this.use = new ArrayDeque<>();
    Programming spt = new LampsProgrammer();
    Programming xing = new BWorkspace();
    Programming trb = new TdsProgramming();
    Programming grr = new GrrProgrammer();
    Programming tm = new FlDatabase();
    this.use.addLast(spt);
    this.use.addLast(xing);
    this.use.addLast(trb);
    this.use.addLast(tm);
    this.use.addLast(grr);
  }

  public void readyMarch(LinkedList<Formalities> methodologies) {
    this.techniques = methodologies;
  }

  public void fixAssignThing(int despatchClock) {
    this.MailAmount = despatchClock;
  }

  public void outpouringPlenum() {
    for (Programming waffen : use) {
      waffen.startleOutliner();

      while (waffen.goIsMoving()) {

        if (waffen.generatePerformedTreatFootprint() == techniques.size()) {
          waffen.quitProgramming();
        } else {
          LinkedList<Formalities> beginsMarch = new LinkedList<>();
          for (Formalities vig : techniques) {

            if (vig.fixHappenChance() == waffen.receiveContemporaryTicktack() + 1) {
              beginsMarch.add(new Formalities(vig));
            }
          }
          Collections.sort(beginsMarch);

          while (!beginsMarch.isEmpty()) {
            waffen.phaseEntry(beginsMarch.removeFirst());
          }
          waffen.dictatedOngoingBeat(waffen.receiveContemporaryTicktack() + 1);
          waffen.bpsRetick();
        }
      }
    }
    this.paperSynopsis();
  }

  public void paperSynopsis() {

    try {
      AppendageBrake.TurnoutCharge.write("Summary\n");
      System.out.println("Summary");
      String letterhead =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      AppendageBrake.TurnoutCharge.write(letterhead + "\n");
      System.out.println(letterhead);
      for (Programming ora : use) {
        String precis =
            String.format(
                "%-9s%23.2f%26.2f",
                ora.debuggingPatronymic(),
                ora.bringMiddlingExpectMeter(),
                ora.fixRatioReboundChance());
        AppendageBrake.TurnoutCharge.write(precis + "\n");
        System.out.println(precis);
      }
      AppendageBrake.TurnoutCharge.close();
    } catch (IOException adoptee) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
