package device;

import synchronization.ApDeveloper;
import synchronization.GrrProgrammer;
import synchronization.Cycle;
import synchronization.OmskSpooler;
import synchronization.RequiredInterface;
import synchronization.Server;
import synchronization.SchedulingPlanner;
import mimic.MechanismMockup;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;

public class Mailer {

  public synchronized void passMailer() {
    for (synchronization.Server ora : need) {
      ora.openingInitialization();

      while (ora.goIsMoving()) {

        if (ora.drawFinalizingSystemsScope() == methodologies.size()) {
          ora.checkWorkflow();
        } else {
          java.util.LinkedList<Cycle> leavingProces;
          leavingProces = new java.util.LinkedList<>();
          for (synchronization.Cycle vig : methodologies) {

            if (vig.findDisembarkSentence() == ora.receiveContemporaryTicktack() + 1) {
              leavingProces.add(new synchronization.Cycle(vig));
            }
          }
          java.util.Collections.sort(leavingProces);

          while (!leavingProces.isEmpty()) {
            ora.cycleIn(leavingProces.removeFirst());
          }
          ora.arrangeExistingDial(ora.receiveContemporaryTicktack() + 1);
          ora.nsoTic();
        }
      }
    }
    this.hardcopyCompact();
  }

  public synchronized void orderedMechanisms(java.util.LinkedList<Cycle> sue) {
    this.methodologies = sue;
  }

  public java.util.LinkedList<Cycle> methodologies;

  public Mailer() {
    synchronization.Server using;
    synchronization.Server erie;
    synchronization.Server determined;
    synchronization.Server grr;
    synchronization.Server ab;
    this.need = new java.util.ArrayDeque<>();
    using = new synchronization.SchedulingPlanner();
    erie = new synchronization.OmskSpooler();
    determined = new synchronization.RequiredInterface();
    grr = new synchronization.GrrProgrammer();
    ab = new synchronization.ApDeveloper();
    this.need.addLast(using);
    this.need.addLast(erie);
    this.need.addLast(determined);
    this.need.addLast(ab);
    this.need.addLast(grr);
  }

  public synchronized void hardcopyCompact() {

    try {
      java.lang.String forefront;
      MechanismMockup.ExportationPapers.write("Summary\n");
      out.println("Summary");
      forefront =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      MechanismMockup.ExportationPapers.write(forefront + "\n");
      out.println(forefront);
      for (synchronization.Server fh : need) {
        java.lang.String summarizes;
        summarizes =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                fh.plannerNominate(),
                fh.makeOrdinaryHoldDay(),
                fh.receiveMediocreReversionMoment());
        MechanismMockup.ExportationPapers.write(summarizes + "\n");
        out.println(summarizes);
      }
      MechanismMockup.ExportationPapers.close();
    } catch (java.io.IOException con) {
      out.println("Unable to write summary to file.");
    }
  }

  public synchronized void dictatedCommuniqueMeter(int sendingHour) {
    this.OfficeJuncture = sendingHour;
  }

  public java.util.ArrayDeque<Server> need;
  public static int OfficeJuncture;
}
