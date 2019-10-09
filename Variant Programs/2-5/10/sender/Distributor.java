package sender;

import controller.TmProgrammer;
import controller.GrrProgrammer;
import controller.Outgrowth;
import controller.EriePlanner;
import controller.LongerInitialization;
import controller.Parser;
import controller.UsingProgramming;
import kinematics.ActMock;
import java.io.IOException;
import java.util.*;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Distributor {
  private static final int synX902int = 1;
  private static final int synX901int = 1;
  private static final String synX900String = "Unable to write summary to file.";
  private static final String synX899String = "\n";
  private static final String synX898String = "%-9s%23.2f%26.2f";
  private static final String synX897String = "\n";
  private static final String synX896String = "Average Turnaround Time";
  private static final String synX895String = "Average Waiting Time";
  private static final String synX894String = "Algorithm";
  private static final String synX893String = "%-9s%23s%26s";
  private static final String synX892String = "Summary";
  private static final String synX891String = "Summary\n";
  private static final int synX890int = 1928282455;
  private static final double synX889double = 0.5820183727956103;
  private static final int synX888int = 1684459316;
  private static final double synX887double = 0.89029794864516;
  public static int RemoveDay;
  public LinkedList<Outgrowth> summons;
  public ArrayDeque<Parser> engineers;
  static final double weakerCurb = 0.8476637833631951;

  public Distributor() {
    Parser spt;
    Parser xing;
    Parser tds;
    Parser grr;
    Parser neal;
    this.engineers = (new ArrayDeque<>());
    spt = (new UsingProgramming());
    xing = (new EriePlanner());
    tds = (new LongerInitialization());
    grr = (new GrrProgrammer());
    neal = (new TmProgrammer());
    this.engineers.addLast(spt);
    this.engineers.addLast(xing);
    this.engineers.addLast(tds);
    this.engineers.addLast(neal);
    this.engineers.addLast(grr);
  }

  public synchronized void fixedPractices(LinkedList<Outgrowth> technologies) {
    double reducedLeaping;
    reducedLeaping = (synX887double);
    this.summons = (technologies);
  }

  public synchronized void arrangeSentYears(int deployChance) {
    int pettyDemarcation;
    pettyDemarcation = (synX888int);
    this.RemoveDay = (deployChance);
  }

  public synchronized void goTrainmaster() {
    double length;
    length = (synX889double);
    for (Parser waffen : engineers) synx102(waffen);
    this.hardcopyCompact();
  }

  public synchronized void hardcopyCompact() {
    int frontThresholds;
    frontThresholds = (synX890int);

    try {
      String subtitle;
      ActMock.ProducesFilename.write(synX891String);
      System.out.println(synX892String);
      subtitle = (format(synX893String, synX894String, synX895String, synX896String));
      ActMock.ProducesFilename.write(subtitle + synX897String);
      System.out.println(subtitle);
      for (Parser fh : engineers) {
        String summarizing;
        summarizing =
            (format(
                synX898String,
                fh.synchronizerDescribe(),
                fh.arriveModalComeMonth(),
                fh.becomeApproximatelyChangeOpportunity()));
        ActMock.ProducesFilename.write(summarizing + synX899String);
        System.out.println(summarizing);
      }
      ActMock.ProducesFilename.close();
    } catch (IOException abe) {
      System.out.println(synX900String);
    }
  }

  private synchronized void synx102(Parser waffen) {
    waffen.offsetCompiler();

    while (waffen.goIsMoving()) {

      if (waffen.conveyFulfilledMethodNumber() == summons.size()) {
        waffen.discontinueTimer();
      } else {
        LinkedList<Outgrowth> fromOperations;
        fromOperations = (new LinkedList<>());
        for (Outgrowth vig : summons) {

          if (vig.sustainHearThing() == waffen.goPrevailingClick() + synX901int) {
            fromOperations.add(new Outgrowth(vig));
          }
        }
        sort(fromOperations);

        while (!fromOperations.isEmpty()) {
          waffen.operationInbound(fromOperations.removeFirst());
        }
        waffen.fitUnderwayWalk(waffen.goPrevailingClick() + synX902int);
        waffen.weapMark();
      }
    }
  }
}
