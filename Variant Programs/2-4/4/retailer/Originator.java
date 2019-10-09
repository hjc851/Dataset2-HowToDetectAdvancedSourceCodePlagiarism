package retailer;

import compiler.BParser;
import compiler.GrrProgrammer;
import compiler.Serve;
import compiler.LyraSynchronizer;
import compiler.MrcOrganizer;
import compiler.Spooler;
import compiler.PapsOrganizer;
import emulator.TreatModelling;
import java.io.IOException;
import java.util.*;

public class Originator {

  public synchronized void testDistributors() {
    for (Spooler ora : engineers) {
      ora.begunMultitasking();

      while (ora.goIsMoving()) {

        if (ora.arriveUndertookProceduresWingspan() == methodology.size()) {
          ora.interceptSpooler();
        } else {
          LinkedList<Serve> onwardsProcedures = new LinkedList<>();
          for (Serve writes : methodology) {

            if (writes.findDisembarkSentence() == ora.fixNewTally() + 1) {
              onwardsProcedures.add(new Serve(writes));
            }
          }
          Collections.sort(onwardsProcedures);

          while (!onwardsProcedures.isEmpty()) {
            ora.procedureIngoing(onwardsProcedures.removeFirst());
          }
          ora.laidLatestTicktock(ora.fixNewTally() + 1);
          ora.bsiShudder();
        }
      }
    }
    this.copySummarize();
  }

  private LinkedList<Serve> methodology;

  public synchronized void solidifyingOfficeJuncture(int shipmentClip) {
    this.DeployingOpportunity = shipmentClip;
  }

  public static int DeployingOpportunity;
  private ArrayDeque<Spooler> engineers;

  public synchronized void laidOperation(LinkedList<Serve> technologies) {
    this.methodology = technologies;
  }

  public Originator() {
    this.engineers = new ArrayDeque<>();
    Spooler scheduling = new PapsOrganizer();
    Spooler xing = new LyraSynchronizer();
    Spooler longer = new MrcOrganizer();
    Spooler grr = new GrrProgrammer();
    Spooler alter = new BParser();
    this.engineers.addLast(scheduling);
    this.engineers.addLast(xing);
    this.engineers.addLast(longer);
    this.engineers.addLast(alter);
    this.engineers.addLast(grr);
  }

  public synchronized void copySummarize() {

    try {
      TreatModelling.PerformanceArchives.write("Summary\n");
      System.out.println("Summary");
      String subtitle =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      TreatModelling.PerformanceArchives.write(subtitle + "\n");
      System.out.println(subtitle);
      for (Spooler fh : engineers) {
        String review =
            String.format(
                "%-9s%23.2f%26.2f",
                fh.databaseNickname(),
                fh.receiveMediocrePostponementMoment(),
                fh.arriveModalUpswingMonth());
        TreatModelling.PerformanceArchives.write(review + "\n");
        System.out.println(review);
      }
      TreatModelling.PerformanceArchives.close();
    } catch (IOException late) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
