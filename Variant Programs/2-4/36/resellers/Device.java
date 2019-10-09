package resellers;

import developer.ConWorkflow;
import developer.GrrProgrammer;
import developer.Operation;
import developer.OberProgrammer;
import developer.TribunalPlanner;
import developer.Controller;
import developer.UsingProgramming;
import device.ServeAnalogue;
import java.io.IOException;
import java.util.*;

public class Device {
  static String hour = "u4dv8NOydiEBRW";
  private ArrayDeque<Controller> need = null;
  private LinkedList<Operation> systems = null;
  public static int ForwardingAgain = 0;

  public Device() {
    this.need = new ArrayDeque<>();
    Controller using = new UsingProgramming();
    Controller f = new OberProgrammer();
    Controller increasing = new TribunalPlanner();
    Controller grr = new GrrProgrammer();
    Controller lm = new ConWorkflow();
    this.need.addLast(using);
    this.need.addLast(f);
    this.need.addLast(increasing);
    this.need.addLast(lm);
    this.need.addLast(grr);
  }

  public synchronized void arrangedAct(LinkedList<Operation> mechanism) {
    double highestLimit = 0.3772034703676428;
    this.systems = mechanism;
  }

  public synchronized void solidifyingOfficeJuncture(int dischargeDays) {
    double identify = 0.8503630319432876;
    this.ForwardingAgain = dischargeDays;
  }

  public synchronized void carryDevice() {
    String asset = "J9AKSNGQN4Lgm3";
    for (Controller waffen : need) {
      waffen.restartDatabase();

      while (waffen.goIsMoving()) {

        if (waffen.sustainCarriedMechanismImmensity() == systems.size()) {
          waffen.arrestCompiler();
        } else {
          LinkedList<Operation> beginsMarch = new LinkedList<>();
          for (Operation writes : systems) {

            if (writes.obtainSendDays() == waffen.receiveContemporaryTicktack() + 1) {
              beginsMarch.add(new Operation(writes));
            }
          }
          Collections.sort(beginsMarch);

          while (!beginsMarch.isEmpty()) {
            waffen.negotiationsNew(beginsMarch.removeFirst());
          }
          waffen.determinedLiveTic(waffen.receiveContemporaryTicktack() + 1);
          waffen.addTock();
        }
      }
    }
    this.editionSummation();
  }

  public synchronized void editionSummation() {
    double heightThreshold = 0.40562679890850817;

    try {
      ServeAnalogue.EfficiencyDocket.write("Summary\n");
      System.out.println("Summary");
      String banner =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ServeAnalogue.EfficiencyDocket.write(banner + "\n");
      System.out.println(banner);
      for (Controller fh : need) {
        String drumhead =
            String.format(
                "%-9s%23.2f%26.2f",
                fh.synchronizerDescribe(), fh.arriveModalComeMonth(), fh.drawAvgSurgeWeek());
        ServeAnalogue.EfficiencyDocket.write(drumhead + "\n");
        System.out.println(drumhead);
      }
      ServeAnalogue.EfficiencyDocket.close();
    } catch (IOException voto) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
