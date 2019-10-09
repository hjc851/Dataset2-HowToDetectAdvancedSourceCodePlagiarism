package distributors;

import server.FaController;
import server.GrrProgrammer;
import server.Procedure;
import server.OximeWorkflow;
import server.DesiredSpreadsheet;
import server.Database;
import server.PapsOrganizer;
import mock.ProceedingsKinematics;
import java.io.IOException;
import java.util.*;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Caller {
  private static final int synX2071int = 1;
  private static final int synX2070int = 1;
  private static final String synX2069String = "Unable to write summary to file.";
  private static final String synX2068String = "\n";
  private static final String synX2067String = "%-9s%23.2f%26.2f";
  private static final String synX2066String = "\n";
  private static final String synX2065String = "Average Turnaround Time";
  private static final String synX2064String = "Average Waiting Time";
  private static final String synX2063String = "Algorithm";
  private static final String synX2062String = "%-9s%23s%26s";
  private static final String synX2061String = "Summary";
  private static final String synX2060String = "Summary\n";
  public static int ExpeditiousnessYear;
  private LinkedList<Procedure> act;
  private ArrayDeque<Database> work;

  public Caller() {
    Database degenerates;
    Database ap;
    Database mrc;
    Database grr;
    Database d;
    this.work = (new ArrayDeque<>());
    degenerates = (new PapsOrganizer());
    ap = (new OximeWorkflow());
    mrc = (new DesiredSpreadsheet());
    grr = (new GrrProgrammer());
    d = (new FaController());
    this.work.addLast(degenerates);
    this.work.addLast(ap);
    this.work.addLast(mrc);
    this.work.addLast(d);
    this.work.addLast(grr);
  }

  public synchronized void determineProces(LinkedList<Procedure> serve) {
    this.act = (serve);
  }

  public synchronized void markDispatchesHours(int officeJuncture) {
    this.ExpeditiousnessYear = (officeJuncture);
  }

  public synchronized void extendDealer() {
    for (Database fh : work) synx282(fh);
    this.fontReport();
  }

  public synchronized void fontReport() {

    try {
      String subtitle;
      ProceedingsKinematics.ProducesFilename.write(synX2060String);
      System.out.println(synX2061String);
      subtitle = (format(synX2062String, synX2063String, synX2064String, synX2065String));
      ProceedingsKinematics.ProducesFilename.write(subtitle + synX2066String);
      System.out.println(subtitle);
      for (Database waffen : work) {
        String excerpts;
        excerpts =
            (format(
                synX2067String,
                waffen.workflowCite(),
                waffen.producePercentageTakeNow(),
                waffen.beatHalfTurnJuncture()));
        ProceedingsKinematics.ProducesFilename.write(excerpts + synX2068String);
        System.out.println(excerpts);
      }
      ProceedingsKinematics.ProducesFilename.close();
    } catch (IOException con) {
      System.out.println(synX2069String);
    }
  }

  private synchronized void synx282(Database fh) {
    fh.departParser();

    while (fh.goIsMoving()) {

      if (fh.letImplementedSummonsSmallness() == act.size()) {
        fh.occlusionDebugging();
      } else {
        LinkedList<Procedure> begunTreat;
        begunTreat = (new LinkedList<>());
        for (Procedure vig : act) {

          if (vig.drawBringWeek() == fh.fixNewTally() + synX2070int) {
            begunTreat.add(new Procedure(vig));
          }
        }
        sort(begunTreat);

        while (!begunTreat.isEmpty()) {
          fh.outgrowthSucceeding(begunTreat.removeFirst());
        }
        fh.primedTopicalMark(fh.fixNewTally() + synX2071int);
        fh.bpsRetick();
      }
    }
  }
}
