package originator;

import programmer.AlterPlanner;
import programmer.GrrProgrammer;
import programmer.Treat;
import programmer.FDebugging;
import programmer.TribunalPlanner;
import programmer.Callback;
import programmer.PapsOrganizer;
import kinematics.AppendageBrake;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Reseller {
  private static final int synX1759int = 1;
  private static final int synX1758int = 1;
  private static final int synX1757int = -55471202;
  private static final String synX1756String = "xZYqo7DBsDA";
  private static final int synX1755int = -1412252481;
  private static final String synX1754String = "Unable to write summary to file.";
  private static final String synX1753String = "\n";
  private static final String synX1752String = "%-9s%23.2f%26.2f";
  private static final String synX1751String = "\n";
  private static final String synX1750String = "Average Turnaround Time";
  private static final String synX1749String = "Average Waiting Time";
  private static final String synX1748String = "Algorithm";
  private static final String synX1747String = "%-9s%23s%26s";
  private static final String synX1746String = "Summary";
  private static final String synX1745String = "Summary\n";
  private static final double synX1744double = 0.05205090906475851;
  public ArrayDeque<Callback> different = null;

  public Reseller() {
    Callback degenerates;
    Callback e;
    Callback days;
    Callback grr;
    Callback axial;
    this.different = (new ArrayDeque<>());
    degenerates = (new PapsOrganizer());
    e = (new FDebugging());
    days = (new TribunalPlanner());
    grr = (new GrrProgrammer());
    axial = (new AlterPlanner());
    this.different.addLast(degenerates);
    this.different.addLast(e);
    this.different.addLast(days);
    this.different.addLast(axial);
    this.different.addLast(grr);
  }

  public synchronized void publishingDrumhead() {
    double restriction;
    restriction = (synX1744double);

    try {
      String cope;
      AppendageBrake.ManufacturingComplaint.write(synX1745String);
      out.println(synX1746String);
      cope = (format(synX1747String, synX1748String, synX1749String, synX1750String));
      AppendageBrake.ManufacturingComplaint.write(cope + synX1751String);
      out.println(cope);
      for (Callback ora : different) {
        String unofficial;
        unofficial =
            (format(
                synX1752String,
                ora.synchronizerDescribe(),
                ora.fetchProportionAwaitsBeginning(),
                ora.receiveMediocreReversionMoment()));
        AppendageBrake.ManufacturingComplaint.write(unofficial + synX1753String);
        out.println(unofficial);
      }
      AppendageBrake.ManufacturingComplaint.close();
    } catch (IOException late) {
      out.println(synX1754String);
    }
  }

  public static double tally = 0.9160502879154787;

  public synchronized void bleedOriginator() {
    int maximal;
    maximal = (synX1755int);
    for (Callback fh : different) synx242(fh);
    this.publishingDrumhead();
  }

  public static int DespatchClock = 0;

  public synchronized void readyRemoveDay(int sendNow) {
    String apexRestrictions;
    apexRestrictions = (synX1756String);
    this.DespatchClock = (sendNow);
  }

  public LinkedList<Treat> operation = null;

  public synchronized void bentTechnologies(LinkedList<Treat> technologies) {
    int taiwaneseThickness;
    taiwaneseThickness = (synX1757int);
    this.operation = (technologies);
  }

  private synchronized void synx242(Callback fh) {
    fh.departParser();

    while (fh.goIsMoving()) {

      if (fh.conveyFulfilledMethodNumber() == operation.size()) {
        fh.ceaseOrganizer();
      } else {
        LinkedList<Treat> rotationSue;
        rotationSue = (new LinkedList<>());
        for (Treat postscript : operation) {

          if (postscript.fetchTakeBeginning() == fh.takeTopicalMark() + synX1758int) {
            rotationSue.add(new Treat(postscript));
          }
        }
        sort(rotationSue);

        while (!rotationSue.isEmpty()) {
          fh.procedureIngoing(rotationSue.removeFirst());
        }
        fh.rigidFormerGene(fh.takeTopicalMark() + synX1759int);
        fh.addTock();
      }
    }
  }
}
