package exporter;

import developer.AbProgramming;
import developer.GrrProgrammer;
import developer.Procedures;
import developer.AcMultitasking;
import developer.MinimumController;
import developer.Synchronizer;
import developer.SptTimer;
import demo.LitigateMimic;
import java.io.IOException;
import java.util.*;

public class Coordinator {
  private ArrayDeque<Synchronizer> dynamic;
  private LinkedList<Procedures> proces;
  public static int DeployingOpportunity;

  public Coordinator() {
    this.dynamic = new ArrayDeque<>();
    Synchronizer lamps = new SptTimer();
    Synchronizer f = new AcMultitasking();
    Synchronizer obtained = new MinimumController();
    Synchronizer grr = new GrrProgrammer();
    Synchronizer com = new AbProgramming();
    this.dynamic.addLast(lamps);
    this.dynamic.addLast(f);
    this.dynamic.addLast(obtained);
    this.dynamic.addLast(com);
    this.dynamic.addLast(grr);
  }

  public void arrangedAct(LinkedList<Procedures> treat) {
    this.proces = treat;
  }

  public void bentSendingHour(int mailAmount) {
    this.DeployingOpportunity = mailAmount;
  }

  public void testDistributors() {
    for (Synchronizer ora : dynamic) {
      ora.partWorkflow();

      while (ora.goIsMoving()) {

        if (ora.bringRealizedWorkWidth() == proces.size()) {
          ora.checkWorkflow();
        } else {
          LinkedList<Procedures> openingProcedure = new LinkedList<>();
          for (Procedures postscript : proces) {

            if (postscript.produceComingNow() == ora.generateUnderwayWalk() + 1) {
              openingProcedure.add(new Procedures(postscript));
            }
          }
          Collections.sort(openingProcedure);

          while (!openingProcedure.isEmpty()) {
            ora.treatInfluent(openingProcedure.removeFirst());
          }
          ora.putPrevailingClick(ora.generateUnderwayWalk() + 1);
          ora.bsiShudder();
        }
      }
    }
    this.hardcopyCompact();
  }

  public void hardcopyCompact() {

    try {
      LitigateMimic.CropData.write("Summary\n");
      System.out.println("Summary");
      String manifold =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      LitigateMimic.CropData.write(manifold + "\n");
      System.out.println(manifold);
      for (Synchronizer fh : dynamic) {
        String summarizes =
            String.format(
                "%-9s%23.2f%26.2f",
                fh.workflowCite(), fh.arriveModalComeMonth(), fh.startOverallDownturnMinutes());
        LitigateMimic.CropData.write(summarizes + "\n");
        System.out.println(summarizes);
      }
      LitigateMimic.CropData.close();
    } catch (IOException officio) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
