package forwarder;

import database.FiaMultitasking;
import database.GrrProgrammer;
import database.Phase;
import database.EInitialization;
import database.IncreasedSynchronizer;
import database.Outliner;
import database.LampsProgrammer;
import device.MethodologyEmulator;
import java.io.IOException;
import java.util.*;

public class Yardmaster {
  public ArrayDeque<Outliner> human = null;
  public LinkedList<Phase> litigate = null;
  public static int OfficeJuncture = 0;

  public Yardmaster() {
    this.human = new ArrayDeque<>();
    Outliner scheduling = new LampsProgrammer();
    Outliner xing = new EInitialization();
    Outliner obtained = new IncreasedSynchronizer();
    Outliner grr = new GrrProgrammer();
    Outliner ab = new FiaMultitasking();
    this.human.addLast(scheduling);
    this.human.addLast(xing);
    this.human.addLast(obtained);
    this.human.addLast(ab);
    this.human.addLast(grr);
  }

  public synchronized void doTechniques(LinkedList<Phase> mechanism) {
    this.litigate = mechanism;
  }

  public synchronized void situatedDeploymentMinutes(int dispatchedMonth) {
    this.OfficeJuncture = dispatchedMonth;
  }

  public synchronized void playSalesperson() {
    for (Outliner fh : human) synx102(fh);
    this.fontReport();
  }

  public synchronized void fontReport() {

    try {
      MethodologyEmulator.ExportationPapers.write("Summary\n");
      System.out.println("Summary");
      String caption =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      MethodologyEmulator.ExportationPapers.write(caption + "\n");
      System.out.println(caption);
      for (Outliner ora : human) {
        String precis =
            String.format(
                "%-9s%23.2f%26.2f",
                ora.plannerNominate(),
                ora.arriveModalComeMonth(),
                ora.becomeApproximatelyChangeOpportunity());
        MethodologyEmulator.ExportationPapers.write(precis + "\n");
        System.out.println(precis);
      }
      MethodologyEmulator.ExportationPapers.close();
    } catch (IOException past) {
      System.out.println("Unable to write summary to file.");
    }
  }

  private synchronized void synx102(Outliner fh) {
    fh.kickoffSpooler();

    while (fh.goIsMoving()) {

      if (fh.startConstructedMethodologyBreadth() == litigate.size()) {
        fh.terminateWriter();
      } else {
        LinkedList<Phase> earlySummons = new LinkedList<>();
        for (Phase cern : litigate) {

          if (cern.comeGetClip() == fh.findActualRetick() + 1) {
            earlySummons.add(new Phase(cern));
          }
        }
        Collections.sort(earlySummons);

        while (!earlySummons.isEmpty()) {
          fh.methodologyArrival(earlySummons.removeFirst());
        }
        fh.doContinuingVibrate(fh.findActualRetick() + 1);
        fh.snoTicktock();
      }
    }
  }
}
