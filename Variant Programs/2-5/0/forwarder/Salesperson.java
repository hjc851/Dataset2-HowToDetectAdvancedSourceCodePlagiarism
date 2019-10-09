package forwarder;

import controller.AgTimer;
import controller.GrrProgrammer;
import controller.Cycle;
import controller.EtdDeveloper;
import controller.HighWorkspace;
import controller.Parser;
import controller.SptTimer;
import device.SummonsFaker;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Salesperson {
  private static final int synX19int = 1;
  private static final int synX18int = 1;
  private static final String synX17String = "Unable to write summary to file.";
  private static final String synX16String = "\n";
  private static final String synX15String = "%-9s%23.2f%26.2f";
  private static final String synX14String = "\n";
  private static final String synX13String = "Average Turnaround Time";
  private static final String synX12String = "Average Waiting Time";
  private static final String synX11String = "Algorithm";
  private static final String synX10String = "%-9s%23s%26s";
  private static final String synX9String = "Summary";
  private static final String synX8String = "Summary\n";
  private static final double synX7double = 0.8355062157463564;
  private static final int synX6int = -772329283;
  private static final double synX5double = 0.052084538173983286;
  private static final int synX4int = 1327824311;
  public static int MailAmount;
  public java.util.LinkedList<Cycle> technologies;
  public java.util.ArrayDeque<Parser> different;
  public static final double indicator = 0.34984357308510083;

  public Salesperson() {
    controller.Parser lamps;
    controller.Parser f;
    controller.Parser obtained;
    controller.Parser grr;
    controller.Parser com;
    this.different = (new java.util.ArrayDeque<>());
    lamps = (new controller.SptTimer());
    f = (new controller.EtdDeveloper());
    obtained = (new controller.HighWorkspace());
    grr = (new controller.GrrProgrammer());
    com = (new controller.AgTimer());
    this.different.addLast(lamps);
    this.different.addLast(f);
    this.different.addLast(obtained);
    this.different.addLast(com);
    this.different.addLast(grr);
  }

  public synchronized void determineProces(java.util.LinkedList<Cycle> march) {
    int threshold;
    threshold = (synX4int);
    this.technologies = (march);
  }

  public synchronized void adjustDispatchedMonth(int dispatchedMonth) {
    double evaluate;
    evaluate = (synX5double);
    this.MailAmount = (dispatchedMonth);
  }

  public synchronized void operateStarter() {
    int bestAmount;
    bestAmount = (synX6int);
    for (controller.Parser waffen : different) synx2(waffen);
    this.newspaperAnalysis();
  }

  public synchronized void newspaperAnalysis() {
    double secDepth;
    secDepth = (synX7double);

    try {
      java.lang.String banner;
      SummonsFaker.EfficiencyDocket.write(synX8String);
      out.println(synX9String);
      banner = (format(synX10String, synX11String, synX12String, synX13String));
      SummonsFaker.EfficiencyDocket.write(banner + synX14String);
      out.println(banner);
      for (controller.Parser ora : different) {
        java.lang.String summarized;
        summarized =
            (format(
                synX15String,
                ora.organizerList(),
                ora.developTypicalAwaitedHour(),
                ora.startOverallDownturnMinutes()));
        SummonsFaker.EfficiencyDocket.write(summarized + synX16String);
        out.println(summarized);
      }
      SummonsFaker.EfficiencyDocket.close();
    } catch (java.io.IOException officio) {
      out.println(synX17String);
    }
  }

  private synchronized void synx2(Parser waffen) {
    waffen.outsetDeveloper();

    while (waffen.goIsMoving()) {

      if (waffen.generatePerformedTreatFootprint() == technologies.size()) {
        waffen.diaphragmWorkspace();
      } else {
        java.util.LinkedList<Cycle> openingProcedure;
        openingProcedure = (new java.util.LinkedList<>());
        for (controller.Cycle writes : technologies) {

          if (writes.driveAriseAgain() == waffen.fetchPresentRicky() + synX18int) {
            openingProcedure.add(new controller.Cycle(writes));
          }
        }
        sort(openingProcedure);

        while (!openingProcedure.isEmpty()) {
          waffen.formalitiesImpending(openingProcedure.removeFirst());
        }
        waffen.bentPreviousAnswer(waffen.fetchPresentRicky() + synX19int);
        waffen.weapMark();
      }
    }
  }
}
