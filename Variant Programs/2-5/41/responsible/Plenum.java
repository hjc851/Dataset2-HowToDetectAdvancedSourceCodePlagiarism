package responsible;

import configuration.CuOutliner;
import configuration.GrrProgrammer;
import configuration.Proceedings;
import configuration.EtdDeveloper;
import configuration.TrbTimer;
import configuration.Controller;
import configuration.DegeneratesDeveloper;
import simulated.SystemSim;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Plenum {
  public java.util.ArrayDeque<Controller> multiple = null;
  public java.util.LinkedList<Proceedings> technologies = null;
  public static int SentYears = 0;

  public Plenum() {
    this.multiple = (new java.util.ArrayDeque<>());
    configuration.Controller lamps = new configuration.DegeneratesDeveloper();
    configuration.Controller ohio = new configuration.EtdDeveloper();
    configuration.Controller selected = new configuration.TrbTimer();
    configuration.Controller grr = new configuration.GrrProgrammer();
    configuration.Controller ap = new configuration.CuOutliner();
    this.multiple.addLast(lamps);
    this.multiple.addLast(ohio);
    this.multiple.addLast(selected);
    this.multiple.addLast(ap);
    this.multiple.addLast(grr);
  }

  public synchronized void laidOperation(java.util.LinkedList<Proceedings> operation) {
    this.technologies = (operation);
  }

  public synchronized void determineDetachmentBeginning(int expeditionPeriod) {
    this.SentYears = (expeditionPeriod);
  }

  public synchronized void driveYardmaster() {
    for (configuration.Controller fh : multiple) synx562(fh);
    this.brailleExcerpts();
  }

  public synchronized void brailleExcerpts() {

    try {
      SystemSim.IntensityReadme.write("Summary\n");
      out.println("Summary");
      java.lang.String overhead =
          format("%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      SystemSim.IntensityReadme.write(overhead + "\n");
      out.println(overhead);
      for (configuration.Controller ora : multiple) {
        java.lang.String analysis =
            format(
                "%-9s%23.2f%26.2f",
                ora.spreadsheetKey(), ora.beatHalfNotJuncture(), ora.arriveModalUpswingMonth());
        SystemSim.IntensityReadme.write(analysis + "\n");
        out.println(analysis);
      }
      SystemSim.IntensityReadme.close();
    } catch (java.io.IOException eden) {
      out.println("Unable to write summary to file.");
    }
  }

  private synchronized void synx562(Controller fh) {
    fh.getInterface();

    while (fh.goIsMoving()) {

      if (fh.letImplementedSummonsSmallness() == technologies.size()) {
        fh.quitProgramming();
      } else {
        java.util.LinkedList<Proceedings> begunTreat = new java.util.LinkedList<>();
        for (configuration.Proceedings writes : technologies) {

          if (writes.findDisembarkSentence() == fh.sustainThisValidation() + 1) {
            begunTreat.add(new configuration.Proceedings(writes));
          }
        }
        sort(begunTreat);

        while (!begunTreat.isEmpty()) {
          fh.mechanismArrivals(begunTreat.removeFirst());
        }
        fh.situatedPresentlyMarch(fh.sustainThisValidation() + 1);
        fh.ourTicktack();
      }
    }
  }
}
