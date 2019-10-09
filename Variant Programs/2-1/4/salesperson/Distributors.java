package salesperson;

import callback.BsSynchronizer;
import callback.GrrProgrammer;
import callback.Proceeding;
import callback.OmskSpooler;
import callback.ObtainedSpooler;
import callback.Callback;
import callback.DegeneratesDeveloper;
import faker.LitigateMimic;
import java.io.IOException;
import java.util.*;

public class Distributors {
  private ArrayDeque<Callback> fair;
  private LinkedList<Proceeding> methods;
  public static int HitPeriods;

  public Distributors() {
    this.fair = new ArrayDeque<>();
    Callback degenerates = new DegeneratesDeveloper();
    Callback oxime = new OmskSpooler();
    Callback increased = new ObtainedSpooler();
    Callback grr = new GrrProgrammer();
    Callback com = new BsSynchronizer();
    this.fair.addLast(degenerates);
    this.fair.addLast(oxime);
    this.fair.addLast(increased);
    this.fair.addLast(com);
    this.fair.addLast(grr);
  }

  public void layLitigate(LinkedList<Proceeding> mechanism) {
    this.methods = mechanism;
  }

  public void settledHitPeriods(int communiqueMeter) {
    this.HitPeriods = communiqueMeter;
  }

  public void raceShipper() {
    for (Callback fh : fair) {
      fh.earlyWorkspace();

      while (fh.goIsMoving()) {

        if (fh.obtainFinishedOutgrowthLength() == methods.size()) {
          fh.layoverConfiguration();
        } else {
          LinkedList<Proceeding> leavingProces = new LinkedList<>();
          for (Proceeding vig : methods) {

            if (vig.generateReachYear() == fh.goPrevailingClick() + 1) {
              leavingProces.add(new Proceeding(vig));
            }
          }
          Collections.sort(leavingProces);

          while (!leavingProces.isEmpty()) {
            fh.appendageEntering(leavingProces.removeFirst());
          }
          fh.placedRifeCheck(fh.goPrevailingClick() + 1);
          fh.nsoTic();
        }
      }
    }
    this.catalogOutline();
  }

  public void catalogOutline() {

    try {
      LitigateMimic.TurnoutCharge.write("Summary\n");
      System.out.println("Summary");
      String title =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      LitigateMimic.TurnoutCharge.write(title + "\n");
      System.out.println(title);
      for (Callback waffen : fair) {
        String drumhead =
            String.format(
                "%-9s%23.2f%26.2f",
                waffen.serverDiagnose(),
                waffen.obtainIntermediateBideDays(),
                waffen.producePercentageTransitionNow());
        LitigateMimic.TurnoutCharge.write(drumhead + "\n");
        System.out.println(drumhead);
      }
      LitigateMimic.TurnoutCharge.close();
    } catch (IOException abe) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
