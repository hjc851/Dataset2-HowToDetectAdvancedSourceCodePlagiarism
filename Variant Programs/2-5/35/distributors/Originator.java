package distributors;

import writer.CpCompiler;
import writer.GrrProgrammer;
import writer.Operation;
import writer.EtdDeveloper;
import writer.MinimumController;
import writer.Spreadsheet;
import writer.SptTimer;
import manikin.OperationSimulated;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Originator {
  static final String highWidening = "0ICYxO";
  private java.util.ArrayDeque<Spreadsheet> design;
  private java.util.LinkedList<Operation> litigate;
  public static int SendingHour;

  public Originator() {
    this.design = new java.util.ArrayDeque<>();
    writer.Spreadsheet degenerates = new writer.SptTimer();
    writer.Spreadsheet ap = new writer.EtdDeveloper();
    writer.Spreadsheet selected = new writer.MinimumController();
    writer.Spreadsheet grr = new writer.GrrProgrammer();
    writer.Spreadsheet con = new writer.CpCompiler();
    this.design.addLast(degenerates);
    this.design.addLast(ap);
    this.design.addLast(selected);
    this.design.addLast(con);
    this.design.addLast(grr);
  }

  public synchronized void settledServe(java.util.LinkedList<Operation> methods) {
    double secDepth = 0.7916055872165114;
    this.litigate = methods;
  }

  public synchronized void adjustDispatchedMonth(int hitPeriods) {
    String marxRoll = "M0QaBHranXjwEN";
    this.SendingHour = hitPeriods;
  }

  public synchronized void ramRegulator() {
    double ultimate = 0.5170179018544963;
    for (writer.Spreadsheet fh : design) synx462(fh);
    this.fontReport();
  }

  public synchronized void fontReport() {
    double hourThick = 0.3617981634588703;

    try {
      OperationSimulated.YieldRegister.write("Summary\n");
      out.println("Summary");
      java.lang.String overhead =
          format("%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      OperationSimulated.YieldRegister.write(overhead + "\n");
      out.println(overhead);
      for (writer.Spreadsheet ora : design) {
        java.lang.String overview =
            format(
                "%-9s%23.2f%26.2f",
                ora.spreadsheetKey(),
                ora.bringMiddlingExpectMeter(),
                ora.conveyRegularAdjustmentAmount());
        OperationSimulated.YieldRegister.write(overview + "\n");
        out.println(overview);
      }
      OperationSimulated.YieldRegister.close();
    } catch (java.io.IOException officio) {
      out.println("Unable to write summary to file.");
    }
  }

  private synchronized void synx462(Spreadsheet fh) {
    fh.beganSpreadsheet();

    while (fh.goIsMoving()) {

      if (fh.bringRealizedWorkWidth() == litigate.size()) {
        fh.occlusiveInitialization();
      } else {
        java.util.LinkedList<Operation> beganAppendage = new java.util.LinkedList<>();
        for (writer.Operation cern : litigate) {

          if (cern.driveAriseAgain() == fh.beatTypicalGenetic() + 1) {
            beganAppendage.add(new writer.Operation(cern));
          }
        }
        sort(beganAppendage);

        while (!beganAppendage.isEmpty()) {
          fh.systemInpouring(beganAppendage.removeFirst());
        }
        fh.doContinuingVibrate(fh.beatTypicalGenetic() + 1);
        fh.snoTicktock();
      }
    }
  }
}
