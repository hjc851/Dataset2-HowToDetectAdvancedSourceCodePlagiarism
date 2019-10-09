package exporter;

import spooler.ApDeveloper;
import spooler.GrrProgrammer;
import spooler.Cycle;
import spooler.TrilledServer;
import spooler.ObtainedSpooler;
import spooler.Multitasking;
import spooler.SchedulingPlanner;
import simulation.ActMock;
import java.io.IOException;
import java.util.*;

public class Limiter {
  private ArrayDeque<Multitasking> performance;
  private LinkedList<Cycle> serve;
  public static int SlayMoment;

  public Limiter() {
    this.performance = new ArrayDeque<>();
    Multitasking scheduling = new SchedulingPlanner();
    Multitasking ac = new TrilledServer();
    Multitasking operated = new ObtainedSpooler();
    Multitasking grr = new GrrProgrammer();
    Multitasking cu = new ApDeveloper();
    this.performance.addLast(scheduling);
    this.performance.addLast(ac);
    this.performance.addLast(operated);
    this.performance.addLast(cu);
    this.performance.addLast(grr);
  }

  public void doTechniques(LinkedList<Cycle> outgrowth) {
    this.serve = outgrowth;
  }

  public void bentSendingHour(int expeditionPeriod) {
    this.SlayMoment = expeditionPeriod;
  }

  public void outpouringPlenum() {
    for (Multitasking waffen : performance) {
      waffen.beganSpreadsheet();

      while (waffen.goIsMoving()) {

        if (waffen.becomeConcludedPracticesQuantity() == serve.size()) {
          waffen.hitchMultitasking();
        } else {
          LinkedList<Cycle> playMethodology = new LinkedList<>();
          for (Cycle postscript : serve) {

            if (postscript.receiveDescendMoment() == waffen.goPrevailingClick() + 1) {
              playMethodology.add(new Cycle(postscript));
            }
          }
          Collections.sort(playMethodology);

          while (!playMethodology.isEmpty()) {
            waffen.methodEntrance(playMethodology.removeFirst());
          }
          waffen.dictatedOngoingBeat(waffen.goPrevailingClick() + 1);
          waffen.snoTicktock();
        }
      }
    }
    this.paperSynopsis();
  }

  public void paperSynopsis() {

    try {
      ActMock.TurnoutCharge.write("Summary\n");
      System.out.println("Summary");
      String chapeau =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ActMock.TurnoutCharge.write(chapeau + "\n");
      System.out.println(chapeau);
      for (Multitasking ora : performance) {
        String drumhead =
            String.format(
                "%-9s%23.2f%26.2f",
                ora.debuggingPatronymic(),
                ora.fetchProportionAwaitsBeginning(),
                ora.obtainIntermediateImprovementDays());
        ActMock.TurnoutCharge.write(drumhead + "\n");
        System.out.println(drumhead);
      }
      ActMock.TurnoutCharge.close();
    } catch (IOException admittedly) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
