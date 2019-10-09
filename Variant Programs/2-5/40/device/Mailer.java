package device;

import developer.AgTimer;
import developer.GrrProgrammer;
import developer.System;
import developer.AController;
import developer.DefinedCompiler;
import developer.Workspace;
import developer.SchedulingPlanner;
import simulated.OutgrowthTrainer;
import java.io.IOException;
import java.util.*;

public class Mailer {
  private static final int synX2802int = 1;
  private static final int synX2801int = 1;
  private static final String synX2800String = "Unable to write summary to file.";
  private static final String synX2799String = "\n";
  private static final String synX2798String = "%-9s%23.2f%26.2f";
  private static final String synX2797String = "\n";
  private static final String synX2796String = "Average Turnaround Time";
  private static final String synX2795String = "Average Waiting Time";
  private static final String synX2794String = "Algorithm";
  private static final String synX2793String = "%-9s%23s%26s";
  private static final String synX2792String = "Summary";
  private static final String synX2791String = "Summary\n";
  public java.util.ArrayDeque<Workspace> work;
  public java.util.LinkedList<System> methodologies;
  public static int CompleteSentence;

  public Mailer() {
    this.work = (new java.util.ArrayDeque<>());
    developer.Workspace lamps = new developer.SchedulingPlanner();
    developer.Workspace fuzee = new developer.AController();
    developer.Workspace grt = new developer.DefinedCompiler();
    developer.Workspace grr = new developer.GrrProgrammer();
    developer.Workspace fia = new developer.AgTimer();
    this.work.addLast(lamps);
    this.work.addLast(fuzee);
    this.work.addLast(grt);
    this.work.addLast(fia);
    this.work.addLast(grr);
  }

  public synchronized void rigidMethod(java.util.LinkedList<System> treat) {
    this.methodologies = (treat);
  }

  public synchronized void markDispatchesHours(int completeSentence) {
    this.CompleteSentence = (completeSentence);
  }

  public synchronized void testDistributors() {
    for (developer.Workspace waffen : work) synx542(waffen);
    this.photographySnapshot();
  }

  public synchronized void photographySnapshot() {

    try {
      OutgrowthTrainer.EfficiencyDocket.write(synX2791String);
      System.out.println(synX2792String);
      java.lang.String usb =
          java.lang.String.format(synX2793String, synX2794String, synX2795String, synX2796String);
      OutgrowthTrainer.EfficiencyDocket.write(usb + synX2797String);
      System.out.println(usb);
      for (developer.Workspace ora : work) {
        java.lang.String compact =
            java.lang.String.format(
                synX2798String,
                ora.workspaceForename(),
                ora.drawAvgWantWeek(),
                ora.fixRatioReboundChance());
        OutgrowthTrainer.EfficiencyDocket.write(compact + synX2799String);
        System.out.println(compact);
      }
      OutgrowthTrainer.EfficiencyDocket.close();
    } catch (java.io.IOException vet) {
      System.out.println(synX2800String);
    }
  }

  private synchronized void synx542(Workspace waffen) {
    waffen.beginsCallback();

    while (waffen.goIsMoving()) {

      if (waffen.makeUndertakenMarchDimensions() == methodologies.size()) {
        waffen.quitProgramming();
      } else {
        java.util.LinkedList<System> onwardsProcedures = new java.util.LinkedList<>();
        for (developer.System cern : methodologies) {

          if (cern.haveMeetPeriods() == waffen.letAfootDials() + synX2801int) {
            onwardsProcedures.add(new developer.System(cern));
          }
        }
        java.util.Collections.sort(onwardsProcedures);

        while (!onwardsProcedures.isEmpty()) {
          waffen.negotiationsNew(onwardsProcedures.removeFirst());
        }
        waffen.laidLatestTicktock(waffen.letAfootDials() + synX2802int);
        waffen.nbsClick();
      }
    }
  }
}
