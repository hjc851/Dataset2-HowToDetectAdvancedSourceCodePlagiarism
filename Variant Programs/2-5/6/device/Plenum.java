package device;

import debugging.FaController;
import debugging.GrrProgrammer;
import debugging.Phase;
import debugging.FDebugging;
import debugging.MeasuredServer;
import debugging.Spooler;
import debugging.PapsOrganizer;
import faker.MethodologyEmulator;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;

public class Plenum {
  private static final int synX675int = 1;
  private static final int synX674int = 1;
  private static final String synX673String = "Unable to write summary to file.";
  private static final String synX672String = "\n";
  private static final String synX671String = "%-9s%23.2f%26.2f";
  private static final String synX670String = "\n";
  private static final String synX669String = "Average Turnaround Time";
  private static final String synX668String = "Average Waiting Time";
  private static final String synX667String = "Algorithm";
  private static final String synX666String = "%-9s%23s%26s";
  private static final String synX665String = "Summary";
  private static final String synX664String = "Summary\n";
  private static final double synX663double = 0.020541019982128317;
  private static final double synX662double = 0.9805392447342195;
  private static final int synX661int = 2090472975;
  private static final double synX660double = 0.5358641770538277;
  static final String list = "oE01nlEIkSOddMef";
  public java.util.ArrayDeque<Spooler> managers = null;
  public java.util.LinkedList<Phase> methods = null;
  public static int CommuniqueMeter = 0;

  public Plenum() {
    this.managers = (new java.util.ArrayDeque<>());
    debugging.Spooler scheduling = new debugging.PapsOrganizer();
    debugging.Spooler diddle = new debugging.FDebugging();
    debugging.Spooler days = new debugging.MeasuredServer();
    debugging.Spooler grr = new debugging.GrrProgrammer();
    debugging.Spooler fl = new debugging.FaController();
    this.managers.addLast(scheduling);
    this.managers.addLast(diddle);
    this.managers.addLast(days);
    this.managers.addLast(fl);
    this.managers.addLast(grr);
  }

  public synchronized void laidOperation(java.util.LinkedList<Phase> operation) {
    double namDetail = synX660double;
    this.methods = (operation);
  }

  public synchronized void prepareSendNow(int sentYears) {
    int fukkianeseHeight = synX661int;
    this.CommuniqueMeter = (sentYears);
  }

  public synchronized void ramRegulator() {
    double minimalSlot = synX662double;
    for (debugging.Spooler waffen : managers) synx62(waffen);
    this.editionSummation();
  }

  public synchronized void editionSummation() {
    double leaping = synX663double;

    try {
      MethodologyEmulator.ManufacturingComplaint.write(synX664String);
      out.println(synX665String);
      java.lang.String overhead =
          java.lang.String.format(synX666String, synX667String, synX668String, synX669String);
      MethodologyEmulator.ManufacturingComplaint.write(overhead + synX670String);
      out.println(overhead);
      for (debugging.Spooler ora : managers) {
        java.lang.String summarize =
            java.lang.String.format(
                synX671String,
                ora.synchronizerDescribe(),
                ora.goMedianAwaitClock(),
                ora.fixRatioReboundChance());
        MethodologyEmulator.ManufacturingComplaint.write(summarize + synX672String);
        out.println(summarize);
      }
      MethodologyEmulator.ManufacturingComplaint.close();
    } catch (java.io.IOException tipp) {
      out.println(synX673String);
    }
  }

  private synchronized void synx62(Spooler waffen) {
    waffen.outsetDeveloper();

    while (waffen.goIsMoving()) {

      if (waffen.fixAchievedMechanismsProportions() == methods.size()) {
        waffen.occlusionDebugging();
      } else {
        java.util.LinkedList<Phase> openingProcedure = new java.util.LinkedList<>();
        for (debugging.Phase cern : methods) {

          if (cern.developHappensHour() == waffen.takeTopicalMark() + synX674int) {
            openingProcedure.add(new debugging.Phase(cern));
          }
        }
        java.util.Collections.sort(openingProcedure);

        while (!openingProcedure.isEmpty()) {
          waffen.systemInpouring(openingProcedure.removeFirst());
        }
        waffen.readyIncumbentTock(waffen.takeTopicalMark() + synX675int);
        waffen.weapMark();
      }
    }
  }
}
