package shipper;

import debugging.DirectServer;
import debugging.GrrProgrammer;
import debugging.Operation;
import debugging.DinersTimer;
import debugging.SelectedWorkflow;
import debugging.Programmer;
import debugging.SptTimer;
import modelling.MethodImpactor;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Limiter {
  private static final String synX584String = "Unable to write summary to file.";
  private static final String synX583String = "\n";
  private static final String synX582String = "%-9s%23.2f%26.2f";
  private static final String synX581String = "\n";
  private static final String synX580String = "Average Turnaround Time";
  private static final String synX579String = "Average Waiting Time";
  private static final String synX578String = "Algorithm";
  private static final String synX577String = "%-9s%23s%26s";
  private static final String synX576String = "Summary";
  private static final String synX575String = "Summary\n";

  public synchronized void dictatedWork(java.util.LinkedList<Operation> mechanisms) {
    this.treat = mechanisms;
  }

  public synchronized void fixAssignThing(int routingWeek) {
    this.AssignThing = routingWeek;
  }

  public synchronized void ramRegulator() {
    for (debugging.Programmer waffen : fair) synx42(waffen);
    this.printableRecap();
  }

  private java.util.LinkedList<Operation> treat;

  public synchronized void printableRecap() {

    try {
      java.lang.String caption;
      MethodImpactor.ProducingFolders.write(synX575String);
      out.println(synX576String);
      caption = format(synX577String, synX578String, synX579String, synX580String);
      MethodImpactor.ProducingFolders.write(caption + synX581String);
      out.println(caption);
      for (debugging.Programmer ora : fair) {
        java.lang.String excerpts;
        excerpts =
            format(
                synX582String,
                ora.interfaceCall(),
                ora.startOverallLetMinutes(),
                ora.generateFairRecoveryYear());
        MethodImpactor.ProducingFolders.write(excerpts + synX583String);
        out.println(excerpts);
      }
      MethodImpactor.ProducingFolders.close();
    } catch (java.io.IOException abel) {
      out.println(synX584String);
    }
  }

  public Limiter() {
    debugging.Programmer lamps;
    debugging.Programmer oxime;
    debugging.Programmer longer;
    debugging.Programmer grr;
    debugging.Programmer d;
    this.fair = new java.util.ArrayDeque<>();
    lamps = new debugging.SptTimer();
    oxime = new debugging.DinersTimer();
    longer = new debugging.SelectedWorkflow();
    grr = new debugging.GrrProgrammer();
    d = new debugging.DirectServer();
    this.fair.addLast(lamps);
    this.fair.addLast(oxime);
    this.fair.addLast(longer);
    this.fair.addLast(d);
    this.fair.addLast(grr);
  }

  public static int AssignThing;
  private java.util.ArrayDeque<Programmer> fair;

  private synchronized void synx42(Programmer waffen) {
    waffen.commenceProgramming();

    while (waffen.goIsMoving()) {

      if (waffen.haveConductedServeLarge() == treat.size()) {
        waffen.pointSynchronizer();
      } else {
        java.util.LinkedList<Operation> earlySummons;
        earlySummons = new java.util.LinkedList<>();
        for (debugging.Operation writes : treat) {

          if (writes.makeReceiveDay() == waffen.obtainLiveTic() + 1) {
            earlySummons.add(new debugging.Operation(writes));
          }
        }
        sort(earlySummons);

        while (!earlySummons.isEmpty()) {
          waffen.serveInward(earlySummons.removeFirst());
        }
        waffen.putPrevailingClick(waffen.obtainLiveTic() + 1);
        waffen.addTock();
      }
    }
  }
}
