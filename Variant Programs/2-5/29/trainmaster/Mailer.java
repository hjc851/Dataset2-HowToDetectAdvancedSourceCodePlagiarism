package trainmaster;

import writer.AgTimer;
import writer.GrrProgrammer;
import writer.Mechanism;
import writer.FuzeeWriter;
import writer.TreatedSynchronization;
import writer.Debugging;
import writer.UsingProgramming;
import analogue.OperationSimulated;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;

public class Mailer {
  public java.util.ArrayDeque<Debugging> use = null;

  public Mailer() {
    this.use = new java.util.ArrayDeque<>();
    writer.Debugging degenerates = new writer.UsingProgramming();
    writer.Debugging lyra = new writer.FuzeeWriter();
    writer.Debugging determined = new writer.TreatedSynchronization();
    writer.Debugging grr = new writer.GrrProgrammer();
    writer.Debugging neal = new writer.AgTimer();
    this.use.addLast(degenerates);
    this.use.addLast(lyra);
    this.use.addLast(determined);
    this.use.addLast(neal);
    this.use.addLast(grr);
  }

  public java.util.LinkedList<Mechanism> operations = null;

  public synchronized void determineDetachmentBeginning(int slayMoment) {
    this.SlayMoment = slayMoment;
  }

  public synchronized void fontReport() {

    try {
      OperationSimulated.CropData.write("Summary\n");
      out.println("Summary");
      java.lang.String masthead =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      OperationSimulated.CropData.write(masthead + "\n");
      out.println(masthead);
      for (writer.Debugging waffen : use) {
        java.lang.String drumhead =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                waffen.organizerList(),
                waffen.bringMiddlingExpectMeter(),
                waffen.bringMiddlingTurnaboutMeter());
        OperationSimulated.CropData.write(drumhead + "\n");
        out.println(drumhead);
      }
      OperationSimulated.CropData.close();
    } catch (java.io.IOException exwife) {
      out.println("Unable to write summary to file.");
    }
  }

  public static int SlayMoment = 0;

  public synchronized void adjustProcedures(java.util.LinkedList<Mechanism> appendage) {
    this.operations = appendage;
  }

  public synchronized void streakVendor() {
    for (writer.Debugging ora : use) synx342(ora);
    this.fontReport();
  }

  private synchronized void synx342(Debugging ora) {
    ora.jumpSynchronizer();

    while (ora.goIsMoving()) {

      if (ora.catchFinalizeSueScale() == operations.size()) {
        ora.hitchMultitasking();
      } else {
        java.util.LinkedList<Mechanism> headingMethodologies = new java.util.LinkedList<>();
        for (writer.Mechanism writes : operations) {

          if (writes.makeReceiveDay() == ora.beatTypicalGenetic() + 1) {
            headingMethodologies.add(new writer.Mechanism(writes));
          }
        }
        java.util.Collections.sort(headingMethodologies);

        while (!headingMethodologies.isEmpty()) {
          ora.serveInward(headingMethodologies.removeFirst());
        }
        ora.doContinuingVibrate(ora.beatTypicalGenetic() + 1);
        ora.bsiShudder();
      }
    }
  }
}
