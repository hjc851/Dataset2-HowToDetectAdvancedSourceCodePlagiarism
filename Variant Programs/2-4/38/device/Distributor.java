package device;

import initialization.FaController;
import initialization.GrrProgrammer;
import initialization.Act;
import initialization.RailCompiler;
import initialization.AerobicMultitasking;
import initialization.Organizer;
import initialization.DegeneratesDeveloper;
import mockup.MarchDevice;
import java.io.IOException;
import java.util.*;

public class Distributor {
  public static int DetachmentBeginning;
  public java.util.LinkedList<Act> serve;
  public java.util.ArrayDeque<Organizer> existing;

  public Distributor() {
    initialization.Organizer lamps;
    initialization.Organizer oxime;
    initialization.Organizer operated;
    initialization.Organizer grr;
    initialization.Organizer com;
    this.existing = new java.util.ArrayDeque<>();
    lamps = new initialization.DegeneratesDeveloper();
    oxime = new initialization.RailCompiler();
    operated = new initialization.AerobicMultitasking();
    grr = new initialization.GrrProgrammer();
    com = new initialization.FaController();
    this.existing.addLast(lamps);
    this.existing.addLast(oxime);
    this.existing.addLast(operated);
    this.existing.addLast(com);
    this.existing.addLast(grr);
  }

  public synchronized void markSummons(java.util.LinkedList<Act> methodologies) {
    this.serve = methodologies;
  }

  public synchronized void situatedDeploymentMinutes(int sendNow) {
    this.DetachmentBeginning = sendNow;
  }

  public synchronized void ramRegulator() {
    for (initialization.Organizer waffen : existing) {
      waffen.beginningOrganizer();

      while (waffen.goIsMoving()) {

        if (waffen.findCompletionActSmall() == serve.size()) {
          waffen.closureServer();
        } else {
          java.util.LinkedList<Act> openingProcedure;
          openingProcedure = new java.util.LinkedList<>();
          for (initialization.Act cern : serve) {

            if (cern.driveAriseAgain() == waffen.obtainLiveTic() + 1) {
              openingProcedure.add(new initialization.Act(cern));
            }
          }
          java.util.Collections.sort(openingProcedure);

          while (!openingProcedure.isEmpty()) {
            waffen.workElect(openingProcedure.removeFirst());
          }
          waffen.situatedPresentlyMarch(waffen.obtainLiveTic() + 1);
          waffen.bpsRetick();
        }
      }
    }
    this.engravingGist();
  }

  public synchronized void engravingGist() {

    try {
      java.lang.String subtitle;
      MarchDevice.IntensityReadme.write("Summary\n");
      System.out.println("Summary");
      subtitle =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      MarchDevice.IntensityReadme.write(subtitle + "\n");
      System.out.println(subtitle);
      for (initialization.Organizer ora : existing) {
        java.lang.String concise;
        concise =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                ora.spoolerDistinguish(),
                ora.startOverallLetMinutes(),
                ora.fixRatioReboundChance());
        MarchDevice.IntensityReadme.write(concise + "\n");
        System.out.println(concise);
      }
      MarchDevice.IntensityReadme.close();
    } catch (java.io.IOException libris) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
