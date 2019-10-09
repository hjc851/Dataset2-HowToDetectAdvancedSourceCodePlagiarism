package reseller;

import planner.CommercialSpooler;
import planner.GrrProgrammer;
import planner.Cycle;
import planner.ApDatabase;
import planner.HighWorkspace;
import planner.Interface;
import planner.UsingProgramming;
import robot.SummonsFaker;
import java.io.IOException;
import java.util.*;
import static java.util.Collections.sort;
import static java.lang.String.format;

public class Yardmaster {
  private static final String synX1491String = "Unable to write summary to file.";
  private static final String synX1490String = "\n";
  private static final String synX1489String = "%-9s%23.2f%26.2f";
  private static final String synX1488String = "\n";
  private static final String synX1487String = "Average Turnaround Time";
  private static final String synX1486String = "Average Waiting Time";
  private static final String synX1485String = "Algorithm";
  private static final String synX1484String = "%-9s%23s%26s";
  private static final String synX1483String = "Summary";
  private static final String synX1482String = "Summary\n";
  private static final int synX1481int = 1785489854;
  private static final int synX1480int = 1;
  private static final int synX1479int = 1;
  private static final double synX1478double = 0.5012032125654302;
  private static final String synX1477String = "6C";
  private static final double synX1476double = 0.33565091060462104;
  public static int SentYears = 0;
  public java.util.LinkedList<Cycle> sue = null;
  public java.util.ArrayDeque<Interface> multiple = null;
  static int positionFoods = 1723817775;

  public Yardmaster() {
    planner.Interface lamps;
    planner.Interface ohio;
    planner.Interface days;
    planner.Interface grr;
    planner.Interface con;
    this.multiple = (new java.util.ArrayDeque<>());
    lamps = (new planner.UsingProgramming());
    ohio = (new planner.ApDatabase());
    days = (new planner.HighWorkspace());
    grr = (new planner.GrrProgrammer());
    con = (new planner.CommercialSpooler());
    this.multiple.addLast(lamps);
    this.multiple.addLast(ohio);
    this.multiple.addLast(days);
    this.multiple.addLast(con);
    this.multiple.addLast(grr);
  }

  public synchronized void arrangeMethods(java.util.LinkedList<Cycle> operation) {
    double identity;
    identity = (synX1476double);
    this.sue = (operation);
  }

  public synchronized void placeRoutingWeek(int shipmentClip) {
    String minuteBreadth;
    minuteBreadth = (synX1477String);
    this.SentYears = (shipmentClip);
  }

  public synchronized void leadCoordinator() {
    double kilogram;
    kilogram = (synX1478double);
    for (planner.Interface ora : multiple) {
      ora.startleOutliner();

      while (ora.goIsMoving()) {

        if (ora.makeUndertakenMarchDimensions() == sue.size()) {
          ora.stopoverOutliner();
        } else {
          java.util.LinkedList<Cycle> departsMethod;
          departsMethod = (new java.util.LinkedList<>());
          for (planner.Cycle vig : sue) {

            if (vig.produceComingNow() == ora.takeTopicalMark() + synX1479int) {
              departsMethod.add(new planner.Cycle(vig));
            }
          }
          sort(departsMethod);

          while (!departsMethod.isEmpty()) {
            ora.formalitiesImpending(departsMethod.removeFirst());
          }
          ora.primedTopicalMark(ora.takeTopicalMark() + synX1480int);
          ora.snoTicktock();
        }
      }
    }
    this.reprintingSummarized();
  }

  public synchronized void reprintingSummarized() {
    int weighting;
    weighting = (synX1481int);

    try {
      java.lang.String usb;
      SummonsFaker.ProducesFilename.write(synX1482String);
      System.out.println(synX1483String);
      usb = (format(synX1484String, synX1485String, synX1486String, synX1487String));
      SummonsFaker.ProducesFilename.write(usb + synX1488String);
      System.out.println(usb);
      for (planner.Interface waffen : multiple) {
        java.lang.String summarized;
        summarized =
            (format(
                synX1489String,
                waffen.timerMention(),
                waffen.arriveModalComeMonth(),
                waffen.generateFairRecoveryYear()));
        SummonsFaker.ProducesFilename.write(summarized + synX1490String);
        System.out.println(summarized);
      }
      SummonsFaker.ProducesFilename.close();
    } catch (java.io.IOException combatants) {
      System.out.println(synX1491String);
    }
  }
}
