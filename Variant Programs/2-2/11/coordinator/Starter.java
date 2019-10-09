package coordinator;

import outliner.DConfiguration;
import outliner.GrrProgrammer;
import outliner.Mechanisms;
import outliner.OximeWorkflow;
import outliner.TrbTimer;
import outliner.Workflow;
import outliner.SptTimer;
import kinematics.LitigateMimic;
import java.io.IOException;
import java.util.*;

public class Starter {
  private ArrayDeque<Workflow> local;
  private LinkedList<Mechanisms> method;
  public static int SlayMoment;

  public Starter() {
    this.local = new ArrayDeque<>();
    Workflow degenerates = new SptTimer();
    Workflow xing = new OximeWorkflow();
    Workflow determined = new TrbTimer();
    Workflow grr = new GrrProgrammer();
    Workflow axial = new DConfiguration();
    this.local.addLast(degenerates);
    this.local.addLast(xing);
    this.local.addLast(determined);
    this.local.addLast(axial);
    this.local.addLast(grr);
  }

  public void putProcedure(LinkedList<Mechanisms> treat) {
    this.method = treat;
  }

  public void determinedDischargeDays(int despatchClock) {
    this.SlayMoment = despatchClock;
  }

  public void streakVendor() {
    for (Workflow ora : local) {
      ora.partWorkflow();

      while (ora.goIsMoving()) {

        if (ora.drawFinalizingSystemsScope() == method.size()) {
          ora.stopoverOutliner();
        } else {
          LinkedList<Mechanisms> departsMethod = new LinkedList<>();
          for (Mechanisms vig : method) {

            if (vig.startConcludeMinutes() == ora.canExistingDial() + 1) {
              departsMethod.add(new Mechanisms(vig));
            }
          }
          Collections.sort(departsMethod);

          while (!departsMethod.isEmpty()) {
            ora.litigateArriving(departsMethod.removeFirst());
          }
          ora.primedTopicalMark(ora.canExistingDial() + 1);
          ora.ourTicktack();
        }
      }
    }
    this.printersUnofficial();
  }

  public void printersUnofficial() {

    try {
      LitigateMimic.SupplyDocumentation.write("Summary\n");
      System.out.println("Summary");
      String drainpipe =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      LitigateMimic.SupplyDocumentation.write(drainpipe + "\n");
      System.out.println(drainpipe);
      for (Workflow waffen : local) {
        String summarized =
            String.format(
                "%-9s%23.2f%26.2f",
                waffen.timerMention(),
                waffen.fetchProportionAwaitsBeginning(),
                waffen.catchCommonRevivalWhen());
        LitigateMimic.SupplyDocumentation.write(summarized + "\n");
        System.out.println(summarized);
      }
      LitigateMimic.SupplyDocumentation.close();
    } catch (IOException adult) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
