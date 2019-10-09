package yardmaster;

import writer.ConWorkflow;
import writer.GrrProgrammer;
import writer.Sue;
import writer.CabooseOrganizer;
import writer.WbsWriter;
import writer.Initialization;
import writer.DegeneratesDeveloper;
import joystick.WorkSimulating;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Reseller {
  public static int CommuniqueMeter = 0;
  public java.util.LinkedList<Sue> methodologies = null;
  public java.util.ArrayDeque<Initialization> human = null;

  public Reseller() {
    writer.Initialization paps;
    writer.Initialization oxime;
    writer.Initialization increasing;
    writer.Initialization grr;
    writer.Initialization cu;
    this.human = new java.util.ArrayDeque<>();
    paps = new writer.DegeneratesDeveloper();
    oxime = new writer.CabooseOrganizer();
    increasing = new writer.WbsWriter();
    grr = new writer.GrrProgrammer();
    cu = new writer.ConWorkflow();
    this.human.addLast(paps);
    this.human.addLast(oxime);
    this.human.addLast(increasing);
    this.human.addLast(cu);
    this.human.addLast(grr);
  }

  public synchronized void determinedOutgrowth(java.util.LinkedList<Sue> proces) {
    this.methodologies = proces;
  }

  public synchronized void readyRemoveDay(int completeSentence) {
    this.CommuniqueMeter = completeSentence;
  }

  public synchronized void driveYardmaster() {
    for (writer.Initialization fh : human) synx602(fh);
    this.reprintingSummarized();
  }

  public synchronized void reprintingSummarized() {

    try {
      java.lang.String headline;
      WorkSimulating.IntensityReadme.write("Summary\n");
      out.println("Summary");
      headline =
          format("%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      WorkSimulating.IntensityReadme.write(headline + "\n");
      out.println(headline);
      for (writer.Initialization ora : human) {
        java.lang.String compendious;
        compendious =
            format(
                "%-9s%23.2f%26.2f",
                ora.programmerEpithet(),
                ora.comeNormalDelayClip(),
                ora.bringMiddlingTurnaboutMeter());
        WorkSimulating.IntensityReadme.write(compendious + "\n");
        out.println(compendious);
      }
      WorkSimulating.IntensityReadme.close();
    } catch (java.io.IOException past) {
      out.println("Unable to write summary to file.");
    }
  }

  private synchronized void synx602(Initialization fh) {
    fh.outsetDeveloper();

    while (fh.goIsMoving()) {

      if (fh.findCompletionActSmall() == methodologies.size()) {
        fh.haltProgrammer();
      } else {
        java.util.LinkedList<Sue> playMethodology;
        playMethodology = new java.util.LinkedList<>();
        for (writer.Sue cern : methodologies) {

          if (cern.goComeClock() == fh.generateUnderwayWalk() + 1) {
            playMethodology.add(new writer.Sue(cern));
          }
        }
        sort(playMethodology);

        while (!playMethodology.isEmpty()) {
          fh.treatInfluent(playMethodology.removeFirst());
        }
        fh.bentPreviousAnswer(fh.generateUnderwayWalk() + 1);
        fh.bsiShudder();
      }
    }
  }
}
