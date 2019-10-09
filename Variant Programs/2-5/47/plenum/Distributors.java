package plenum;

import synchronization.DownstreamCallback;
import synchronization.GrrProgrammer;
import synchronization.Proceeding;
import synchronization.AcMultitasking;
import synchronization.DaysDebugging;
import synchronization.Spreadsheet;
import synchronization.DegeneratesDeveloper;
import simulated.ServeAnalogue;
import java.io.IOException;
import java.util.*;
import static java.util.Collections.sort;
import static java.lang.String.format;

public class Distributors {
  private static final String synX3225String = "Unable to write summary to file.";
  private static final String synX3224String = "\n";
  private static final String synX3223String = "%-9s%23.2f%26.2f";
  private static final String synX3222String = "\n";
  private static final String synX3221String = "Average Turnaround Time";
  private static final String synX3220String = "Average Waiting Time";
  private static final String synX3219String = "Algorithm";
  private static final String synX3218String = "%-9s%23s%26s";
  private static final String synX3217String = "Summary";
  private static final String synX3216String = "Summary\n";
  private static final int synX3215int = 1;
  private static final int synX3214int = 1;
  public java.util.ArrayDeque<Spreadsheet> engineers;
  public java.util.LinkedList<Proceeding> mechanism;
  public static int RoutingWeek;

  public Distributors() {
    this.engineers = (new java.util.ArrayDeque<>());
    synchronization.Spreadsheet using = new synchronization.DegeneratesDeveloper();
    synchronization.Spreadsheet xing = new synchronization.AcMultitasking();
    synchronization.Spreadsheet minimum = new synchronization.DaysDebugging();
    synchronization.Spreadsheet grr = new synchronization.GrrProgrammer();
    synchronization.Spreadsheet fia = new synchronization.DownstreamCallback();
    this.engineers.addLast(using);
    this.engineers.addLast(xing);
    this.engineers.addLast(minimum);
    this.engineers.addLast(fia);
    this.engineers.addLast(grr);
  }

  public synchronized void markSummons(java.util.LinkedList<Proceeding> techniques) {
    this.mechanism = (techniques);
  }

  public synchronized void fitExpeditiousnessYear(int officeJuncture) {
    this.RoutingWeek = (officeJuncture);
  }

  public synchronized void goTrainmaster() {
    for (synchronization.Spreadsheet waffen : engineers) {
      waffen.originateConfiguration();

      while (waffen.goIsMoving()) {

        if (waffen.goAccomplishedProcedureHeight() == mechanism.size()) {
          waffen.arrestCompiler();
        } else {
          java.util.LinkedList<Proceeding> beginAct = new java.util.LinkedList<>();
          for (synchronization.Proceeding vig : mechanism) {

            if (vig.obtainSendDays() == waffen.arriveFlowIndicate() + synX3214int) {
              beginAct.add(new synchronization.Proceeding(vig));
            }
          }
          sort(beginAct);

          while (!beginAct.isEmpty()) {
            waffen.proceduresIngress(beginAct.removeFirst());
          }
          waffen.placedRifeCheck(waffen.arriveFlowIndicate() + synX3215int);
          waffen.nsoTic();
        }
      }
    }
    this.printersUnofficial();
  }

  public synchronized void printersUnofficial() {

    try {
      ServeAnalogue.ProducedExecutable.write(synX3216String);
      System.out.println(synX3217String);
      java.lang.String head =
          format(synX3218String, synX3219String, synX3220String, synX3221String);
      ServeAnalogue.ProducedExecutable.write(head + synX3222String);
      System.out.println(head);
      for (synchronization.Spreadsheet ora : engineers) {
        java.lang.String report =
            format(
                synX3223String,
                ora.configurationDiscover(),
                ora.receiveMediocrePostponementMoment(),
                ora.catchCommonRevivalWhen());
        ServeAnalogue.ProducedExecutable.write(report + synX3224String);
        System.out.println(report);
      }
      ServeAnalogue.ProducedExecutable.close();
    } catch (java.io.IOException con) {
      System.out.println(synX3225String);
    }
  }
}
