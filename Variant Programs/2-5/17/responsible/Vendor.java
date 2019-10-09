package responsible;

import outliner.CommercialSpooler;
import outliner.GrrProgrammer;
import outliner.Work;
import outliner.IccParser;
import outliner.TreatedSynchronization;
import outliner.Server;
import outliner.DegeneratesDeveloper;
import simulation.ProceduresMoot;
import java.io.IOException;
import java.util.*;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Vendor {
  private static final int synX1394int = 1;
  private static final int synX1393int = 1;
  private static final String synX1392String = "Unable to write summary to file.";
  private static final String synX1391String = "\n";
  private static final String synX1390String = "%-9s%23.2f%26.2f";
  private static final String synX1389String = "\n";
  private static final String synX1388String = "Average Turnaround Time";
  private static final String synX1387String = "Average Waiting Time";
  private static final String synX1386String = "Algorithm";
  private static final String synX1385String = "%-9s%23s%26s";
  private static final String synX1384String = "Summary";
  private static final String synX1383String = "Summary\n";
  public ArrayDeque<Server> different = null;
  public LinkedList<Work> proces = null;
  public static int DeployingOpportunity = 0;

  public Vendor() {
    this.different = (new ArrayDeque<>());
    Server scheduling = new DegeneratesDeveloper();
    Server ober = new IccParser();
    Server increasing = new TreatedSynchronization();
    Server grr = new GrrProgrammer();
    Server ag = new CommercialSpooler();
    this.different.addLast(scheduling);
    this.different.addLast(ober);
    this.different.addLast(increasing);
    this.different.addLast(ag);
    this.different.addLast(grr);
  }

  public synchronized void fixMechanism(LinkedList<Work> litigate) {
    this.proces = (litigate);
  }

  public synchronized void doForwardingAgain(int communiqueMeter) {
    this.DeployingOpportunity = (communiqueMeter);
  }

  public synchronized void scarperCaller() {
    for (Server ora : different) synx202(ora);
    this.publicationPrecis();
  }

  public synchronized void publicationPrecis() {

    try {
      ProceduresMoot.ExportationPapers.write(synX1383String);
      System.out.println(synX1384String);
      String heading = format(synX1385String, synX1386String, synX1387String, synX1388String);
      ProceduresMoot.ExportationPapers.write(heading + synX1389String);
      System.out.println(heading);
      for (Server fh : different) {
        String concise =
            format(
                synX1390String,
                fh.spreadsheetKey(),
                fh.fetchProportionAwaitsBeginning(),
                fh.bringMiddlingTurnaboutMeter());
        ProceduresMoot.ExportationPapers.write(concise + synX1391String);
        System.out.println(concise);
      }
      ProceduresMoot.ExportationPapers.close();
    } catch (IOException admittedly) {
      System.out.println(synX1392String);
    }
  }

  private synchronized void synx202(Server ora) {
    ora.initiateWriter();

    while (ora.goIsMoving()) {

      if (ora.startConstructedMethodologyBreadth() == proces.size()) {
        ora.periodDatabase();
      } else {
        LinkedList<Work> commencingServe = new LinkedList<>();
        for (Work writes : proces) {

          if (writes.fetchTakeBeginning() == ora.sustainThisValidation() + synX1393int) {
            commencingServe.add(new Work(writes));
          }
        }
        sort(commencingServe);

        while (!commencingServe.isEmpty()) {
          ora.proceedingOutbound(commencingServe.removeFirst());
        }
        ora.solidifyingTypicalGenetic(ora.sustainThisValidation() + synX1394int);
        ora.addTock();
      }
    }
  }
}
