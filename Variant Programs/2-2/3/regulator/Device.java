package regulator;

import database.DownstreamCallback;
import database.GrrProgrammer;
import database.Litigate;
import database.AcMultitasking;
import database.DefinedCompiler;
import database.Parser;
import database.LampsProgrammer;
import trainer.OperationSimulated;
import java.io.IOException;
import java.util.*;

public class Device {
  private java.util.ArrayDeque<Parser> multiple;
  private java.util.LinkedList<Litigate> appendage;
  public static int ExpeditionPeriod;

  public Device() {
    this.multiple = new java.util.ArrayDeque<>();
    database.Parser degenerates = new database.LampsProgrammer();
    database.Parser ap = new database.AcMultitasking();
    database.Parser trb = new database.DefinedCompiler();
    database.Parser grr = new database.GrrProgrammer();
    database.Parser ab = new database.DownstreamCallback();
    this.multiple.addLast(degenerates);
    this.multiple.addLast(ap);
    this.multiple.addLast(trb);
    this.multiple.addLast(ab);
    this.multiple.addLast(grr);
  }

  public void putProcedure(java.util.LinkedList<Litigate> mechanisms) {
    this.appendage = mechanisms;
  }

  public void markDispatchesHours(int sendNow) {
    this.ExpeditionPeriod = sendNow;
  }

  public void testDistributors() {
    for (database.Parser waffen : multiple) {
      waffen.goTimer();

      while (waffen.goIsMoving()) {

        if (waffen.comeConsummatedOperationLarger() == appendage.size()) {
          waffen.stopoverOutliner();
        } else {
          java.util.LinkedList<Litigate> protrusiveOperation = new java.util.LinkedList<>();
          for (database.Litigate writes : appendage) {

            if (writes.findDisembarkSentence() == waffen.makeIncumbentTock() + 1) {
              protrusiveOperation.add(new database.Litigate(writes));
            }
          }
          java.util.Collections.sort(protrusiveOperation);

          while (!protrusiveOperation.isEmpty()) {
            waffen.proceduresIngress(protrusiveOperation.removeFirst());
          }
          waffen.placeStreamBookmark(waffen.makeIncumbentTock() + 1);
          waffen.addTock();
        }
      }
    }
    this.copySummarize();
  }

  public void copySummarize() {

    try {
      OperationSimulated.EfficiencyDocket.write("Summary\n");
      System.out.println("Summary");
      java.lang.String cope =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      OperationSimulated.EfficiencyDocket.write(cope + "\n");
      System.out.println(cope);
      for (database.Parser fh : multiple) {
        java.lang.String compact =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                fh.multitaskingMoniker(),
                fh.becomeApproximatelyLingerOpportunity(),
                fh.driveRatesBreakthroughAgain());
        OperationSimulated.EfficiencyDocket.write(compact + "\n");
        System.out.println(compact);
      }
      OperationSimulated.EfficiencyDocket.close();
    } catch (java.io.IOException tipp) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
