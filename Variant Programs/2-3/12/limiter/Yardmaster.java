package limiter;

import programming.TmProgrammer;
import programming.GrrProgrammer;
import programming.Mechanism;
import programming.IccParser;
import programming.AerobicMultitasking;
import programming.Spooler;
import programming.DegeneratesDeveloper;
import sim.ProceedingPrototype;
import java.io.IOException;
import java.util.*;

public class Yardmaster {
  public static int CommuniqueMeter;
  public java.util.LinkedList<Mechanism> procedures;
  public java.util.ArrayDeque<Spooler> multiple;

  public Yardmaster() {
    programming.Spooler degenerates;
    programming.Spooler stas;
    programming.Spooler determined;
    programming.Spooler grr;
    programming.Spooler b;
    this.multiple = new java.util.ArrayDeque<>();
    degenerates = new programming.DegeneratesDeveloper();
    stas = new programming.IccParser();
    determined = new programming.AerobicMultitasking();
    grr = new programming.GrrProgrammer();
    b = new programming.TmProgrammer();
    this.multiple.addLast(degenerates);
    this.multiple.addLast(stas);
    this.multiple.addLast(determined);
    this.multiple.addLast(b);
    this.multiple.addLast(grr);
  }

  public synchronized void adjustProcedures(java.util.LinkedList<Mechanism> operations) {
    this.procedures = operations;
  }

  public synchronized void determinedDischargeDays(int dispatchesHours) {
    this.CommuniqueMeter = dispatchesHours;
  }

  public synchronized void moveSender() {
    for (programming.Spooler waffen : multiple) {
      waffen.getInterface();

      while (waffen.goIsMoving()) {

        if (waffen.goAccomplishedProcedureHeight() == procedures.size()) {
          waffen.layoverConfiguration();
        } else {
          java.util.LinkedList<Mechanism> departingTechnologies;
          departingTechnologies = new java.util.LinkedList<>();
          for (programming.Mechanism vig : procedures) {

            if (vig.driveAriseAgain() == waffen.fetchPresentRicky() + 1) {
              departingTechnologies.add(new programming.Mechanism(vig));
            }
          }
          java.util.Collections.sort(departingTechnologies);

          while (!departingTechnologies.isEmpty()) {
            waffen.methodsElected(departingTechnologies.removeFirst());
          }
          waffen.markAfootDials(waffen.fetchPresentRicky() + 1);
          waffen.ourTicktack();
        }
      }
    }
    this.publishConcise();
  }

  public synchronized void publishConcise() {

    try {
      java.lang.String coping;
      ProceedingPrototype.ProducerSubmitted.write("Summary\n");
      System.out.println("Summary");
      coping =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ProceedingPrototype.ProducerSubmitted.write(coping + "\n");
      System.out.println(coping);
      for (programming.Spooler ora : multiple) {
        java.lang.String report;
        report =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                ora.serverDiagnose(),
                ora.conveyRegularHopeAmount(),
                ora.becomeApproximatelyChangeOpportunity());
        ProceedingPrototype.ProducerSubmitted.write(report + "\n");
        System.out.println(report);
      }
      ProceedingPrototype.ProducerSubmitted.close();
    } catch (java.io.IOException former) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
