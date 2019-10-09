package salesperson;

import planner.TmProgrammer;
import planner.GrrProgrammer;
import planner.Negotiations;
import planner.OhioSynchronization;
import planner.LongDatabase;
import planner.Spooler;
import planner.LampsProgrammer;
import trainer.NegotiationsAvionics;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;

public class Yardmaster {
  private static final int synX1979int = 1;
  private static final int synX1978int = 1;
  private static final String synX1977String = "Unable to write summary to file.";
  private static final String synX1976String = "\n";
  private static final String synX1975String = "%-9s%23.2f%26.2f";
  private static final String synX1974String = "\n";
  private static final String synX1973String = "Average Turnaround Time";
  private static final String synX1972String = "Average Waiting Time";
  private static final String synX1971String = "Algorithm";
  private static final String synX1970String = "%-9s%23s%26s";
  private static final String synX1969String = "Summary";
  private static final String synX1968String = "Summary\n";
  public ArrayDeque<Spooler> work = null;
  public LinkedList<Negotiations> serve = null;
  public static int MailAmount = 0;

  public Yardmaster() {
    this.work = (new ArrayDeque<>());
    Spooler scheduling = new LampsProgrammer();
    Spooler ober = new OhioSynchronization();
    Spooler defined = new LongDatabase();
    Spooler grr = new GrrProgrammer();
    Spooler direct = new TmProgrammer();
    this.work.addLast(scheduling);
    this.work.addLast(ober);
    this.work.addLast(defined);
    this.work.addLast(direct);
    this.work.addLast(grr);
  }

  public synchronized void layLitigate(LinkedList<Negotiations> mechanisms) {
    this.serve = (mechanisms);
  }

  public synchronized void laidShipmentClip(int murderWhen) {
    this.MailAmount = (murderWhen);
  }

  public synchronized void streakVendor() {
    for (Spooler fh : work) synx262(fh);
    this.editionSummation();
  }

  public synchronized void editionSummation() {

    try {
      NegotiationsAvionics.YieldRegister.write(synX1968String);
      out.println(synX1969String);
      String drainpipe =
          String.format(synX1970String, synX1971String, synX1972String, synX1973String);
      NegotiationsAvionics.YieldRegister.write(drainpipe + synX1974String);
      out.println(drainpipe);
      for (Spooler waffen : work) {
        String concise =
            String.format(
                synX1975String,
                waffen.spreadsheetKey(),
                waffen.findNormLookSentence(),
                waffen.goMedianTurnroundClock());
        NegotiationsAvionics.YieldRegister.write(concise + synX1976String);
        out.println(concise);
      }
      NegotiationsAvionics.YieldRegister.close();
    } catch (IOException appointed) {
      out.println(synX1977String);
    }
  }

  private synchronized void synx262(Spooler fh) {
    fh.kickoffSpooler();

    while (fh.goIsMoving()) {

      if (fh.bringRealizedWorkWidth() == serve.size()) {
        fh.breakInterface();
      } else {
        LinkedList<Negotiations> firstSystems = new LinkedList<>();
        for (Negotiations vig : serve) {

          if (vig.takeDeliverPeriod() == fh.startPresentlyMarch() + synX1978int) {
            firstSystems.add(new Negotiations(vig));
          }
        }
        Collections.sort(firstSystems);

        while (!firstSystems.isEmpty()) {
          fh.appendageEntering(firstSystems.removeFirst());
        }
        fh.orderedNewTally(fh.startPresentlyMarch() + synX1979int);
        fh.nsoTic();
      }
    }
  }
}
