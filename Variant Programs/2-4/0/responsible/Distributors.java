package responsible;

import timer.AxialInterface;
import timer.GrrProgrammer;
import timer.Method;
import timer.DinersTimer;
import timer.HighWorkspace;
import timer.Parser;
import timer.SchedulingPlanner;
import simulated.CycleJoystick;
import java.io.IOException;
import java.util.*;

public class Distributors {
  public static int OfficeJuncture;
  public java.util.LinkedList<Method> methodologies;
  public java.util.ArrayDeque<Parser> managers;
  static String amoy = "a2UlTASzQnd";

  public Distributors() {
    timer.Parser degenerates;
    timer.Parser a;
    timer.Parser tribunal;
    timer.Parser grr;
    timer.Parser dc;
    this.managers = new java.util.ArrayDeque<>();
    degenerates = new timer.SchedulingPlanner();
    a = new timer.DinersTimer();
    tribunal = new timer.HighWorkspace();
    grr = new timer.GrrProgrammer();
    dc = new timer.AxialInterface();
    this.managers.addLast(degenerates);
    this.managers.addLast(a);
    this.managers.addLast(tribunal);
    this.managers.addLast(dc);
    this.managers.addLast(grr);
  }

  public synchronized void fixMechanism(java.util.LinkedList<Method> techniques) {
    double designator;
    designator = 0.34984357308510083;
    this.methodologies = techniques;
  }

  public synchronized void fitExpeditiousnessYear(int completeSentence) {
    double backTreated;
    backTreated = 0.2555253108964435;
    this.OfficeJuncture = completeSentence;
  }

  public synchronized void raceShipper() {
    double lotGauge;
    lotGauge = 0.7266285874260149;
    for (timer.Parser waffen : managers) synx2(waffen);
    this.lithographSynopses();
  }

  public synchronized void lithographSynopses() {
    String nameBelongings;
    nameBelongings = "z";

    try {
      java.lang.String bay;
      CycleJoystick.ProducePaperwork.write("Summary\n");
      System.out.println("Summary");
      bay =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      CycleJoystick.ProducePaperwork.write(bay + "\n");
      System.out.println(bay);
      for (timer.Parser ora : managers) {
        java.lang.String analysis;
        analysis =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                ora.initializationPseudonym(),
                ora.makeOrdinaryHoldDay(),
                ora.sustainLevelSpikeThing());
        CycleJoystick.ProducePaperwork.write(analysis + "\n");
        System.out.println(analysis);
      }
      CycleJoystick.ProducePaperwork.close();
    } catch (java.io.IOException vet) {
      System.out.println("Unable to write summary to file.");
    }
  }

  private synchronized void synx2(Parser waffen) {
    waffen.departParser();

    while (waffen.goIsMoving()) {

      if (waffen.sustainCarriedMechanismImmensity() == methodologies.size()) {
        waffen.blockageCallback();
      } else {
        java.util.LinkedList<Method> departsMethod;
        departsMethod = new java.util.LinkedList<>();
        for (timer.Method vig : methodologies) {

          if (vig.beatSubmitJuncture() == waffen.takeTopicalMark() + 1) {
            departsMethod.add(new timer.Method(vig));
          }
        }
        java.util.Collections.sort(departsMethod);

        while (!departsMethod.isEmpty()) {
          waffen.mechanismArrivals(departsMethod.removeFirst());
        }
        waffen.laidLatestTicktock(waffen.takeTopicalMark() + 1);
        waffen.nbsClick();
      }
    }
  }
}
