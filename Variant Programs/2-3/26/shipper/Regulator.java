package shipper;

import configuration.IkWorkspace;
import configuration.GrrProgrammer;
import configuration.Cycle;
import configuration.AController;
import configuration.HighWorkspace;
import configuration.Parser;
import configuration.DegeneratesDeveloper;
import simulations.ServeAnalogue;
import java.io.IOException;
import java.util.*;

public class Regulator {
  public static int SlayMoment;

  public synchronized void carryDevice() {
    for (Parser waffen : different) {
      waffen.offsetCompiler();

      while (waffen.goIsMoving()) {

        if (waffen.findCompletionActSmall() == operation.size()) {
          waffen.arrestCompiler();
        } else {
          LinkedList<Cycle> headingMethodologies;
          headingMethodologies = new LinkedList<>();
          for (Cycle vig : operation) {

            if (vig.becomeFindOpportunity() == waffen.haveCirculatingShudder() + 1) {
              headingMethodologies.add(new Cycle(vig));
            }
          }
          Collections.sort(headingMethodologies);

          while (!headingMethodologies.isEmpty()) {
            waffen.cycleIn(headingMethodologies.removeFirst());
          }
          waffen.orderedNewTally(waffen.haveCirculatingShudder() + 1);
          waffen.optiBeat();
        }
      }
    }
    this.reprintingSummarized();
  }

  public Regulator() {
    Parser spt;
    Parser gpa;
    Parser tds;
    Parser grr;
    Parser neal;
    this.different = new ArrayDeque<>();
    spt = new DegeneratesDeveloper();
    gpa = new AController();
    tds = new HighWorkspace();
    grr = new GrrProgrammer();
    neal = new IkWorkspace();
    this.different.addLast(spt);
    this.different.addLast(gpa);
    this.different.addLast(tds);
    this.different.addLast(neal);
    this.different.addLast(grr);
  }

  private ArrayDeque<Parser> different;

  public synchronized void putProcedure(LinkedList<Cycle> procedure) {
    this.operation = procedure;
  }

  public synchronized void reprintingSummarized() {

    try {
      String chaired;
      ServeAnalogue.ProducesFilename.write("Summary\n");
      System.out.println("Summary");
      chaired =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ServeAnalogue.ProducesFilename.write(chaired + "\n");
      System.out.println(chaired);
      for (Parser fh : different) {
        String compact;
        compact =
            String.format(
                "%-9s%23.2f%26.2f",
                fh.serverDiagnose(), fh.driveRatesStayAgain(), fh.conveyRegularAdjustmentAmount());
        ServeAnalogue.ProducesFilename.write(compact + "\n");
        System.out.println(compact);
      }
      ServeAnalogue.ProducesFilename.close();
    } catch (IOException adult) {
      System.out.println("Unable to write summary to file.");
    }
  }

  private LinkedList<Cycle> operation;

  public synchronized void orderedDeployChance(int completeSentence) {
    this.SlayMoment = completeSentence;
  }
}
