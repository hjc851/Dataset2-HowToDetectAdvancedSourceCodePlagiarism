package device;

import workflow.TmProgrammer;
import workflow.GrrProgrammer;
import workflow.System;
import workflow.TrillSpreadsheet;
import workflow.WbsWriter;
import workflow.Initialization;
import workflow.SchedulingPlanner;
import mock.CycleJoystick;
import java.io.IOException;
import java.util.*;

public class Coordinator {
  private ArrayDeque<Initialization> human;
  private LinkedList<System> methods;
  public static int SendingHour;

  public Coordinator() {
    this.human = new ArrayDeque<>();
    Initialization degenerates = new SchedulingPlanner();
    Initialization sta = new TrillSpreadsheet();
    Initialization required = new WbsWriter();
    Initialization grr = new GrrProgrammer();
    Initialization approximate = new TmProgrammer();
    this.human.addLast(degenerates);
    this.human.addLast(sta);
    this.human.addLast(required);
    this.human.addLast(approximate);
    this.human.addLast(grr);
  }

  public void dictatedWork(LinkedList<System> sue) {
    this.methods = sue;
  }

  public void arrangedCompleteSentence(int shipmentClip) {
    this.SendingHour = shipmentClip;
  }

  public void streakVendor() {
    for (Initialization waffen : human) {
      waffen.startleOutliner();

      while (waffen.goIsMoving()) {

        if (waffen.generatePerformedTreatFootprint() == methods.size()) {
          waffen.occlusiveInitialization();
        } else {
          LinkedList<System> lineMechanism = new LinkedList<>();
          for (System writes : methods) {

            if (writes.produceComingNow() == waffen.canExistingDial() + 1) {
              lineMechanism.add(new System(writes));
            }
          }
          Collections.sort(lineMechanism);

          while (!lineMechanism.isEmpty()) {
            waffen.actDesignate(lineMechanism.removeFirst());
          }
          waffen.dictatedOngoingBeat(waffen.canExistingDial() + 1);
          waffen.bsiShudder();
        }
      }
    }
    this.publicationsOverview();
  }

  public void publicationsOverview() {

    try {
      CycleJoystick.ProducePaperwork.write("Summary\n");
      System.out.println("Summary");
      String overhead =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      CycleJoystick.ProducePaperwork.write(overhead + "\n");
      System.out.println(overhead);
      for (Initialization ora : human) {
        String summarizing =
            String.format(
                "%-9s%23.2f%26.2f",
                ora.controllerSurname(),
                ora.conveyRegularHopeAmount(),
                ora.producePercentageTransitionNow());
        CycleJoystick.ProducePaperwork.write(summarizing + "\n");
        System.out.println(summarizing);
      }
      CycleJoystick.ProducePaperwork.close();
    } catch (IOException aba) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
