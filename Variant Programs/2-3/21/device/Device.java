package device;

import initialization.TmProgrammer;
import initialization.GrrProgrammer;
import initialization.Mechanism;
import initialization.TrilledServer;
import initialization.DefinedCompiler;
import initialization.Writer;
import initialization.UsingProgramming;
import analogue.LitigateMimic;
import java.io.IOException;
import java.util.*;

public class Device {
  public static int ExpeditiousnessYear = 0;
  private LinkedList<Mechanism> methodology = null;
  private ArrayDeque<Writer> human = null;

  public Device() {
    Writer paps;
    Writer diddle;
    Writer defined;
    Writer grr;
    Writer cu;
    this.human = new ArrayDeque<>();
    paps = new UsingProgramming();
    diddle = new TrilledServer();
    defined = new DefinedCompiler();
    grr = new GrrProgrammer();
    cu = new TmProgrammer();
    this.human.addLast(paps);
    this.human.addLast(diddle);
    this.human.addLast(defined);
    this.human.addLast(cu);
    this.human.addLast(grr);
  }

  public synchronized void primedAppendage(LinkedList<Mechanism> summons) {
    this.methodology = summons;
  }

  public synchronized void situatedDeploymentMinutes(int hitPeriods) {
    this.ExpeditiousnessYear = hitPeriods;
  }

  public synchronized void goTrainmaster() {
    for (Writer ora : human) {
      ora.restartDatabase();

      while (ora.goIsMoving()) {

        if (ora.canExecutedMethodsAmount() == methodology.size()) {
          ora.pointSynchronizer();
        } else {
          LinkedList<Mechanism> protrusiveOperation;
          protrusiveOperation = new LinkedList<>();
          for (Mechanism cern : methodology) {

            if (cern.takeDeliverPeriod() == ora.takeTopicalMark() + 1) {
              protrusiveOperation.add(new Mechanism(cern));
            }
          }
          Collections.sort(protrusiveOperation);

          while (!protrusiveOperation.isEmpty()) {
            ora.systemInpouring(protrusiveOperation.removeFirst());
          }
          ora.determinedLiveTic(ora.takeTopicalMark() + 1);
          ora.optiBeat();
        }
      }
    }
    this.fontReport();
  }

  public synchronized void fontReport() {

    try {
      String commutator;
      LitigateMimic.OutturnLodge.write("Summary\n");
      System.out.println("Summary");
      commutator =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      LitigateMimic.OutturnLodge.write(commutator + "\n");
      System.out.println(commutator);
      for (Writer waffen : human) {
        String unofficial;
        unofficial =
            String.format(
                "%-9s%23.2f%26.2f",
                waffen.outlinerGens(), waffen.canRateQueueYears(), waffen.catchCommonRevivalWhen());
        LitigateMimic.OutturnLodge.write(unofficial + "\n");
        System.out.println(unofficial);
      }
      LitigateMimic.OutturnLodge.close();
    } catch (IOException appointed) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
