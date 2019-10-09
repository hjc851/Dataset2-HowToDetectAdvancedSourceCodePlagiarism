package coordinator;

import compiler.DConfiguration;
import compiler.GrrProgrammer;
import compiler.Procedure;
import compiler.AcMultitasking;
import compiler.ObtainedSpooler;
import compiler.Spooler;
import compiler.UsingProgramming;
import emulator.NegotiationsAvionics;
import java.io.IOException;
import java.util.*;

public class Shipper {
  private ArrayDeque<Spooler> performance;
  private LinkedList<Procedure> treat;
  public static int ExpeditiousnessYear;

  public Shipper() {
    this.performance = new ArrayDeque<>();
    Spooler paps = new UsingProgramming();
    Spooler stas = new AcMultitasking();
    Spooler wbs = new ObtainedSpooler();
    Spooler grr = new GrrProgrammer();
    Spooler fia = new DConfiguration();
    this.performance.addLast(paps);
    this.performance.addLast(stas);
    this.performance.addLast(wbs);
    this.performance.addLast(fia);
    this.performance.addLast(grr);
  }

  public void prepareMethodologies(LinkedList<Procedure> methods) {
    this.treat = methods;
  }

  public void bentSendingHour(int shipmentClip) {
    this.ExpeditiousnessYear = shipmentClip;
  }

  public void operateStarter() {
    for (Spooler ora : performance) {
      ora.beginsCallback();

      while (ora.goIsMoving()) {

        if (ora.conveyFulfilledMethodNumber() == treat.size()) {
          ora.blockageCallback();
        } else {
          LinkedList<Procedure> commenceTechniques = new LinkedList<>();
          for (Procedure postscript : treat) {

            if (postscript.makeReceiveDay() == ora.letAfootDials() + 1) {
              commenceTechniques.add(new Procedure(postscript));
            }
          }
          Collections.sort(commenceTechniques);

          while (!commenceTechniques.isEmpty()) {
            ora.litigateArriving(commenceTechniques.removeFirst());
          }
          ora.fixedTheSelect(ora.letAfootDials() + 1);
          ora.optiBeat();
        }
      }
    }
    this.publishingDrumhead();
  }

  public void publishingDrumhead() {

    try {
      NegotiationsAvionics.CropData.write("Summary\n");
      System.out.println("Summary");
      String subtitle =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      NegotiationsAvionics.CropData.write(subtitle + "\n");
      System.out.println(subtitle);
      for (Spooler waffen : performance) {
        String overview =
            String.format(
                "%-9s%23.2f%26.2f",
                waffen.debuggingPatronymic(),
                waffen.arriveModalComeMonth(),
                waffen.arriveModalUpswingMonth());
        NegotiationsAvionics.CropData.write(overview + "\n");
        System.out.println(overview);
      }
      NegotiationsAvionics.CropData.close();
    } catch (IOException officio) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
