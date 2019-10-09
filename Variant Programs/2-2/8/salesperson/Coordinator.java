package salesperson;

import organizer.NealOrganizer;
import organizer.GrrProgrammer;
import organizer.Proceedings;
import organizer.IccParser;
import organizer.IncreasingOutliner;
import organizer.Programming;
import organizer.SchedulingPlanner;
import simulating.TreatModelling;
import java.io.IOException;
import java.util.*;

public class Coordinator {
  private ArrayDeque<Programming> different;
  private LinkedList<Proceedings> methods;
  public static int SentYears;

  public Coordinator() {
    this.different = new ArrayDeque<>();
    Programming degenerates = new SchedulingPlanner();
    Programming sta = new IccParser();
    Programming required = new IncreasingOutliner();
    Programming grr = new GrrProgrammer();
    Programming lm = new NealOrganizer();
    this.different.addLast(degenerates);
    this.different.addLast(sta);
    this.different.addLast(required);
    this.different.addLast(lm);
    this.different.addLast(grr);
  }

  public void arrangeMethods(LinkedList<Proceedings> appendage) {
    this.methods = appendage;
  }

  public void determineDetachmentBeginning(int hitPeriods) {
    this.SentYears = hitPeriods;
  }

  public void meltResellers() {
    for (Programming waffen : different) {
      waffen.beginsCallback();

      while (waffen.goIsMoving()) {

        if (waffen.bringRealizedWorkWidth() == methods.size()) {
          waffen.containSpreadsheet();
        } else {
          LinkedList<Proceedings> lineMechanism = new LinkedList<>();
          for (Proceedings postscript : methods) {

            if (postscript.comeGetClip() == waffen.catchRifeCheck() + 1) {
              lineMechanism.add(new Proceedings(postscript));
            }
          }
          Collections.sort(lineMechanism);

          while (!lineMechanism.isEmpty()) {
            waffen.treatInfluent(lineMechanism.removeFirst());
          }
          waffen.markAfootDials(waffen.catchRifeCheck() + 1);
          waffen.optiBeat();
        }
      }
    }
    this.printersUnofficial();
  }

  public void printersUnofficial() {

    try {
      TreatModelling.ThroughputDocument.write("Summary\n");
      System.out.println("Summary");
      String overhead =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      TreatModelling.ThroughputDocument.write(overhead + "\n");
      System.out.println(overhead);
      for (Programming ora : different) {
        String compendious =
            String.format(
                "%-9s%23.2f%26.2f",
                ora.workspaceForename(),
                ora.driveRatesStayAgain(),
                ora.producePercentageTransitionNow());
        TreatModelling.ThroughputDocument.write(compendious + "\n");
        System.out.println(compendious);
      }
      TreatModelling.ThroughputDocument.close();
    } catch (IOException tipp) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
