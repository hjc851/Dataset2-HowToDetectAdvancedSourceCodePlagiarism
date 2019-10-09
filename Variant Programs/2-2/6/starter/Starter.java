package starter;

import controller.TmProgrammer;
import controller.GrrProgrammer;
import controller.Formalities;
import controller.GpaInterface;
import controller.DeterminedCallback;
import controller.Compiler;
import controller.SchedulingPlanner;
import impactor.SystemSim;
import java.io.IOException;
import java.util.*;

public class Starter {
  private ArrayDeque<Compiler> design;
  private LinkedList<Formalities> march;
  public static int MurderWhen;

  public Starter() {
    this.design = new ArrayDeque<>();
    Compiler spt = new SchedulingPlanner();
    Compiler ober = new GpaInterface();
    Compiler minimum = new DeterminedCallback();
    Compiler grr = new GrrProgrammer();
    Compiler cu = new TmProgrammer();
    this.design.addLast(spt);
    this.design.addLast(ober);
    this.design.addLast(minimum);
    this.design.addLast(cu);
    this.design.addLast(grr);
  }

  public void adjustProcedures(LinkedList<Formalities> procedures) {
    this.march = procedures;
  }

  public void dictatedCommuniqueMeter(int removeDay) {
    this.MurderWhen = removeDay;
  }

  public void prevailDistributor() {
    for (Compiler waffen : design) {
      waffen.firstPlanner();

      while (waffen.goIsMoving()) {

        if (waffen.bringRealizedWorkWidth() == march.size()) {
          waffen.haltProgrammer();
        } else {
          LinkedList<Formalities> commencingServe = new LinkedList<>();
          for (Formalities postscript : march) {

            if (postscript.produceComingNow() == waffen.generateUnderwayWalk() + 1) {
              commencingServe.add(new Formalities(postscript));
            }
          }
          Collections.sort(commencingServe);

          while (!commencingServe.isEmpty()) {
            waffen.cycleIn(commencingServe.removeFirst());
          }
          waffen.solidifyingTypicalGenetic(waffen.generateUnderwayWalk() + 1);
          waffen.ourTicktack();
        }
      }
    }
    this.fontReport();
  }

  public void fontReport() {

    try {
      SystemSim.InputInitiate.write("Summary\n");
      System.out.println("Summary");
      String subtitle =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      SystemSim.InputInitiate.write(subtitle + "\n");
      System.out.println(subtitle);
      for (Compiler fh : design) {
        String synopses =
            String.format(
                "%-9s%23.2f%26.2f",
                fh.developerIdentify(), fh.comeNormalDelayClip(), fh.beatHalfTurnJuncture());
        SystemSim.InputInitiate.write(synopses + "\n");
        System.out.println(synopses);
      }
      SystemSim.InputInitiate.close();
    } catch (IOException vet) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
