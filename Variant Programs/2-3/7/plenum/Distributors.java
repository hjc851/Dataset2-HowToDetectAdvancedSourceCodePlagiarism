package plenum;

import spreadsheet.BsSynchronizer;
import spreadsheet.GrrProgrammer;
import spreadsheet.Operation;
import spreadsheet.CabooseOrganizer;
import spreadsheet.GrtProgrammer;
import spreadsheet.Programmer;
import spreadsheet.LampsProgrammer;
import trainer.WorkSimulating;
import java.io.IOException;
import java.util.*;

public class Distributors {
  public ArrayDeque<Programmer> managers = null;
  public LinkedList<Operation> procedure = null;
  public static int DeploymentMinutes = 0;

  public Distributors() {
    this.managers = new ArrayDeque<>();
    Programmer using = new LampsProgrammer();
    Programmer gpa = new CabooseOrganizer();
    Programmer high = new GrtProgrammer();
    Programmer grr = new GrrProgrammer();
    Programmer ab = new BsSynchronizer();
    this.managers.addLast(using);
    this.managers.addLast(gpa);
    this.managers.addLast(high);
    this.managers.addLast(ab);
    this.managers.addLast(grr);
  }

  public synchronized void readyMarch(LinkedList<Operation> march) {
    this.procedure = march;
  }

  public synchronized void solidifyingOfficeJuncture(int routingWeek) {
    this.DeploymentMinutes = routingWeek;
  }

  public synchronized void tallyConsignor() {
    for (Programmer fh : managers) {
      fh.kickoffSpooler();

      while (fh.goIsMoving()) {

        if (fh.sustainCarriedMechanismImmensity() == procedure.size()) {
          fh.quitProgramming();
        } else {
          LinkedList<Operation> departingTechnologies = new LinkedList<>();
          for (Operation writes : procedure) {

            if (writes.drawBringWeek() == fh.producePrevalentScore() + 1) {
              departingTechnologies.add(new Operation(writes));
            }
          }
          Collections.sort(departingTechnologies);

          while (!departingTechnologies.isEmpty()) {
            fh.methodEntrance(departingTechnologies.removeFirst());
          }
          fh.markAfootDials(fh.producePrevalentScore() + 1);
          fh.optiBeat();
        }
      }
    }
    this.typescriptDescription();
  }

  public synchronized void typescriptDescription() {

    try {
      WorkSimulating.InputInitiate.write("Summary\n");
      System.out.println("Summary");
      String caption =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      WorkSimulating.InputInitiate.write(caption + "\n");
      System.out.println(caption);
      for (Programmer waffen : managers) {
        String gist =
            String.format(
                "%-9s%23.2f%26.2f",
                waffen.callbackConstitute(),
                waffen.makeOrdinaryHoldDay(),
                waffen.comeNormalReversalClip());
        WorkSimulating.InputInitiate.write(gist + "\n");
        System.out.println(gist);
      }
      WorkSimulating.InputInitiate.close();
    } catch (IOException eden) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
