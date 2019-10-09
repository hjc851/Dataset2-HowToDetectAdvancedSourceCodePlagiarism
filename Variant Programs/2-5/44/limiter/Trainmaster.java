package limiter;

import workspace.ComSynchronization;
import workspace.GrrProgrammer;
import workspace.Treat;
import workspace.EtdDeveloper;
import workspace.TrbTimer;
import workspace.Callback;
import workspace.SchedulingPlanner;
import moot.MethodologyEmulator;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Trainmaster {
  private static final int synX3126int = 1;
  private static final int synX3125int = 1;
  private static final String synX3124String = "Unable to write summary to file.";
  private static final String synX3123String = "\n";
  private static final String synX3122String = "%-9s%23.2f%26.2f";
  private static final String synX3121String = "\n";
  private static final String synX3120String = "Average Turnaround Time";
  private static final String synX3119String = "Average Waiting Time";
  private static final String synX3118String = "Algorithm";
  private static final String synX3117String = "%-9s%23s%26s";
  private static final String synX3116String = "Summary";
  private static final String synX3115String = "Summary\n";
  public static int DispatchesHours;
  public ArrayDeque<Callback> systems;

  public synchronized void settledServe(LinkedList<Treat> appendage) {
    this.method = appendage;
  }

  public synchronized void typescriptDescription() {

    try {
      MethodologyEmulator.IntensityReadme.write(synX3115String);
      out.println(synX3116String);
      String chaired = format(synX3117String, synX3118String, synX3119String, synX3120String);
      MethodologyEmulator.IntensityReadme.write(chaired + synX3121String);
      out.println(chaired);
      for (Callback fh : systems) {
        String summation =
            format(
                synX3122String,
                fh.databaseNickname(),
                fh.takeMeanSitPeriod(),
                fh.generateFairRecoveryYear());
        MethodologyEmulator.IntensityReadme.write(summation + synX3123String);
        out.println(summation);
      }
      MethodologyEmulator.IntensityReadme.close();
    } catch (IOException afterwards) {
      out.println(synX3124String);
    }
  }

  public LinkedList<Treat> method;

  public synchronized void endureRetailer() {
    for (Callback waffen : systems) {
      waffen.partWorkflow();

      while (waffen.goIsMoving()) {

        if (waffen.developSubmittedTechnologiesStature() == method.size()) {
          waffen.kiboshSynchronization();
        } else {
          LinkedList<Treat> lineMechanism = new LinkedList<>();
          for (Treat postscript : method) {

            if (postscript.fixHappenChance() == waffen.producePrevalentScore() + synX3125int) {
              lineMechanism.add(new Treat(postscript));
            }
          }
          sort(lineMechanism);

          while (!lineMechanism.isEmpty()) {
            waffen.formalitiesImpending(lineMechanism.removeFirst());
          }
          waffen.readyIncumbentTock(waffen.producePrevalentScore() + synX3126int);
          waffen.optiBeat();
        }
      }
    }
    this.typescriptDescription();
  }

  public synchronized void laidShipmentClip(int dischargeDays) {
    this.DispatchesHours = dischargeDays;
  }

  public Trainmaster() {
    this.systems = new ArrayDeque<>();
    Callback using = new SchedulingPlanner();
    Callback ohio = new EtdDeveloper();
    Callback defined = new TrbTimer();
    Callback grr = new GrrProgrammer();
    Callback cp = new ComSynchronization();
    this.systems.addLast(using);
    this.systems.addLast(ohio);
    this.systems.addLast(defined);
    this.systems.addLast(cp);
    this.systems.addLast(grr);
  }
}
