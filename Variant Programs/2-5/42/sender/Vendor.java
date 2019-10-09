package sender;

import synchronizer.NealOrganizer;
import synchronizer.GrrProgrammer;
import synchronizer.Phase;
import synchronizer.AcMultitasking;
import synchronizer.HighWorkspace;
import synchronizer.Controller;
import synchronizer.PapsOrganizer;
import analog.ActMock;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Vendor {
  private static final int synX2894int = 1;
  private static final int synX2893int = 1;
  private static final String synX2892String = "Unable to write summary to file.";
  private static final String synX2891String = "\n";
  private static final String synX2890String = "%-9s%23.2f%26.2f";
  private static final String synX2889String = "\n";
  private static final String synX2888String = "Average Turnaround Time";
  private static final String synX2887String = "Average Waiting Time";
  private static final String synX2886String = "Algorithm";
  private static final String synX2885String = "%-9s%23s%26s";
  private static final String synX2884String = "Summary";
  private static final String synX2883String = "Summary\n";

  public synchronized void operateStarter() {
    for (synchronizer.Controller ora : multiple) synx582(ora);
    this.newspaperAnalysis();
  }

  public java.util.ArrayDeque<Controller> multiple = null;
  public static int CommuniqueMeter = 0;

  public Vendor() {
    this.multiple = (new java.util.ArrayDeque<>());
    synchronizer.Controller spt = new synchronizer.PapsOrganizer();
    synchronizer.Controller stas = new synchronizer.AcMultitasking();
    synchronizer.Controller mrc = new synchronizer.HighWorkspace();
    synchronizer.Controller grr = new synchronizer.GrrProgrammer();
    synchronizer.Controller linear = new synchronizer.NealOrganizer();
    this.multiple.addLast(spt);
    this.multiple.addLast(stas);
    this.multiple.addLast(mrc);
    this.multiple.addLast(linear);
    this.multiple.addLast(grr);
  }

  public synchronized void dictatedWork(java.util.LinkedList<Phase> proces) {
    this.operation = (proces);
  }

  public synchronized void newspaperAnalysis() {

    try {
      ActMock.TurnoutCharge.write(synX2883String);
      out.println(synX2884String);
      java.lang.String coping =
          format(synX2885String, synX2886String, synX2887String, synX2888String);
      ActMock.TurnoutCharge.write(coping + synX2889String);
      out.println(coping);
      for (synchronizer.Controller waffen : multiple) {
        java.lang.String concise =
            format(
                synX2890String,
                waffen.configurationDiscover(),
                waffen.catchCommonSeeWhen(),
                waffen.drawAvgSurgeWeek());
        ActMock.TurnoutCharge.write(concise + synX2891String);
        out.println(concise);
      }
      ActMock.TurnoutCharge.close();
    } catch (java.io.IOException abbe) {
      out.println(synX2892String);
    }
  }

  public java.util.LinkedList<Phase> operation = null;

  public synchronized void primedExpeditionPeriod(int slayMoment) {
    this.CommuniqueMeter = (slayMoment);
  }

  private synchronized void synx582(Controller ora) {
    ora.beginsCallback();

    while (ora.goIsMoving()) {

      if (ora.generatePerformedTreatFootprint() == operation.size()) {
        ora.ceaseOrganizer();
      } else {
        java.util.LinkedList<Phase> beginsMarch = new java.util.LinkedList<>();
        for (synchronizer.Phase postscript : operation) {

          if (postscript.drawBringWeek() == ora.canExistingDial() + synX2893int) {
            beginsMarch.add(new synchronizer.Phase(postscript));
          }
        }
        sort(beginsMarch);

        while (!beginsMarch.isEmpty()) {
          ora.formalitiesImpending(beginsMarch.removeFirst());
        }
        ora.markAfootDials(ora.canExistingDial() + synX2894int);
        ora.nbsClick();
      }
    }
  }
}
