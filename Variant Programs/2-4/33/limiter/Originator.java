package limiter;

import spreadsheet.ComSynchronization;
import spreadsheet.GrrProgrammer;
import spreadsheet.Summons;
import spreadsheet.XingCallback;
import spreadsheet.DefinedCompiler;
import spreadsheet.Programmer;
import spreadsheet.UsingProgramming;
import impactor.ProcedureSimulation;
import java.io.IOException;
import java.util.*;

public class Originator {

  public synchronized void photographySnapshot() {

    try {
      ProcedureSimulation.ThroughputDocument.write("Summary\n");
      System.out.println("Summary");
      java.lang.String headlines =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ProcedureSimulation.ThroughputDocument.write(headlines + "\n");
      System.out.println(headlines);
      for (spreadsheet.Programmer ora : different) {
        java.lang.String recap =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                ora.synchronizerDescribe(),
                ora.fixRatioLeaveChance(),
                ora.makeOrdinaryTransformationDay());
        ProcedureSimulation.ThroughputDocument.write(recap + "\n");
        System.out.println(recap);
      }
      ProcedureSimulation.ThroughputDocument.close();
    } catch (java.io.IOException tipp) {
      System.out.println("Unable to write summary to file.");
    }
  }

  public java.util.LinkedList<Summons> methods;

  public synchronized void readyMarch(java.util.LinkedList<Summons> appendage) {
    this.methods = appendage;
  }

  public static int SentYears;

  public synchronized void laidShipmentClip(int routingWeek) {
    this.SentYears = routingWeek;
  }

  public java.util.ArrayDeque<Programmer> different;

  public synchronized void driveYardmaster() {
    for (spreadsheet.Programmer fh : different) {
      fh.getInterface();

      while (fh.goIsMoving()) {

        if (fh.beatInauguratedOperationsSeverity() == methods.size()) {
          fh.hitchMultitasking();
        } else {
          java.util.LinkedList<Summons> beginningWork = new java.util.LinkedList<>();
          for (spreadsheet.Summons postscript : methods) {

            if (postscript.produceComingNow() == fh.bringOngoingBeat() + 1) {
              beginningWork.add(new spreadsheet.Summons(postscript));
            }
          }
          java.util.Collections.sort(beginningWork);

          while (!beginningWork.isEmpty()) {
            fh.summonsInflowing(beginningWork.removeFirst());
          }
          fh.arrangedActualRetick(fh.bringOngoingBeat() + 1);
          fh.optiBeat();
        }
      }
    }
    this.photographySnapshot();
  }

  public Originator() {
    this.different = new java.util.ArrayDeque<>();
    spreadsheet.Programmer degenerates = new spreadsheet.UsingProgramming();
    spreadsheet.Programmer etd = new spreadsheet.XingCallback();
    spreadsheet.Programmer required = new spreadsheet.DefinedCompiler();
    spreadsheet.Programmer grr = new spreadsheet.GrrProgrammer();
    spreadsheet.Programmer cu = new spreadsheet.ComSynchronization();
    this.different.addLast(degenerates);
    this.different.addLast(etd);
    this.different.addLast(required);
    this.different.addLast(cu);
    this.different.addLast(grr);
  }
}
