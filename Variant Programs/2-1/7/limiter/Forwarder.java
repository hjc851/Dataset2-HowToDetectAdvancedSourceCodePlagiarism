package limiter;

import callback.CommercialSpooler;
import callback.GrrProgrammer;
import callback.Treat;
import callback.DiddleProgramming;
import callback.TreatedSynchronization;
import callback.Parser;
import callback.SptTimer;
import kinematics.ProceedingPrototype;
import java.io.IOException;
import java.util.*;

public class Forwarder {
  private ArrayDeque<Parser> human;
  private LinkedList<Treat> mechanism;
  public static int SendingHour;

  public Forwarder() {
    this.human = new ArrayDeque<>();
    Parser lamps = new SptTimer();
    Parser b = new DiddleProgramming();
    Parser mrc = new TreatedSynchronization();
    Parser grr = new GrrProgrammer();
    Parser alter = new CommercialSpooler();
    this.human.addLast(lamps);
    this.human.addLast(b);
    this.human.addLast(mrc);
    this.human.addLast(alter);
    this.human.addLast(grr);
  }

  public void prepareMethodologies(LinkedList<Treat> mechanisms) {
    this.mechanism = mechanisms;
  }

  public void prepareSendNow(int communiqueMeter) {
    this.SendingHour = communiqueMeter;
  }

  public void leanExporter() {
    for (Parser ora : human) {
      ora.commenceProgramming();

      while (ora.goIsMoving()) {

        if (ora.fetchAttainedProcesVastness() == mechanism.size()) {
          ora.closureServer();
        } else {
          LinkedList<Treat> departingTechnologies = new LinkedList<>();
          for (Treat cern : mechanism) {

            if (cern.fetchTakeBeginning() == ora.developPreviousAnswer() + 1) {
              departingTechnologies.add(new Treat(cern));
            }
          }
          Collections.sort(departingTechnologies);

          while (!departingTechnologies.isEmpty()) {
            ora.serveInward(departingTechnologies.removeFirst());
          }
          ora.adjustFlowIndicate(ora.developPreviousAnswer() + 1);
          ora.ourTicktack();
        }
      }
    }
    this.printableRecap();
  }

  public void printableRecap() {

    try {
      ProceedingPrototype.ManufacturingComplaint.write("Summary\n");
      System.out.println("Summary");
      String heading =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ProceedingPrototype.ManufacturingComplaint.write(heading + "\n");
      System.out.println(heading);
      for (Parser waffen : human) {
        String excerpts =
            String.format(
                "%-9s%23.2f%26.2f",
                waffen.developerIdentify(),
                waffen.catchCommonSeeWhen(),
                waffen.developTypicalRevitalizationHour());
        ProceedingPrototype.ManufacturingComplaint.write(excerpts + "\n");
        System.out.println(excerpts);
      }
      ProceedingPrototype.ManufacturingComplaint.close();
    } catch (IOException vet) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
