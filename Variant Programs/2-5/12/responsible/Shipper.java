package responsible;

import initialization.LinearInitialization;
import initialization.GrrProgrammer;
import initialization.Procedures;
import initialization.AController;
import initialization.LongDatabase;
import initialization.Synchronization;
import initialization.UsingProgramming;
import mock.MarchDevice;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Shipper {
  private static final int synX1037int = 1;
  private static final int synX1036int = 1;
  private static final String synX1035String = "Unable to write summary to file.";
  private static final String synX1034String = "\n";
  private static final String synX1033String = "%-9s%23.2f%26.2f";
  private static final String synX1032String = "\n";
  private static final String synX1031String = "Average Turnaround Time";
  private static final String synX1030String = "Average Waiting Time";
  private static final String synX1029String = "Algorithm";
  private static final String synX1028String = "%-9s%23s%26s";
  private static final String synX1027String = "Summary";
  private static final String synX1026String = "Summary\n";
  private static final int synX1025int = 1511777219;
  private static final String synX1024String = "JQEj6vGGHKjGMDryH";
  private static final String synX1023String = "6Pr";
  private static final double synX1022double = 0.26217793031223624;
  public static int AssignThing = 0;
  private java.util.LinkedList<Procedures> mechanisms = null;
  private java.util.ArrayDeque<Synchronization> using = null;
  public static double apexSure = 0.510267907764225;

  public Shipper() {
    initialization.Synchronization paps;
    initialization.Synchronization xing;
    initialization.Synchronization aerobic;
    initialization.Synchronization grr;
    initialization.Synchronization commercial;
    this.using = (new java.util.ArrayDeque<>());
    paps = (new initialization.UsingProgramming());
    xing = (new initialization.AController());
    aerobic = (new initialization.LongDatabase());
    grr = (new initialization.GrrProgrammer());
    commercial = (new initialization.LinearInitialization());
    this.using.addLast(paps);
    this.using.addLast(xing);
    this.using.addLast(aerobic);
    this.using.addLast(commercial);
    this.using.addLast(grr);
  }

  public synchronized void placedSue(java.util.LinkedList<Procedures> sue) {
    double sec;
    sec = (synX1022double);
    this.mechanisms = (sue);
  }

  public synchronized void determinedDischargeDays(int deployChance) {
    String limit;
    limit = (synX1023String);
    this.AssignThing = (deployChance);
  }

  public synchronized void meltResellers() {
    String unfree;
    unfree = (synX1024String);
    for (initialization.Synchronization ora : using) synx122(ora);
    this.publicationsOverview();
  }

  public synchronized void publicationsOverview() {
    int forename;
    forename = (synX1025int);

    try {
      java.lang.String headwater;
      MarchDevice.CropData.write(synX1026String);
      out.println(synX1027String);
      headwater = (format(synX1028String, synX1029String, synX1030String, synX1031String));
      MarchDevice.CropData.write(headwater + synX1032String);
      out.println(headwater);
      for (initialization.Synchronization waffen : using) {
        java.lang.String compact;
        compact =
            (format(
                synX1033String,
                waffen.compilerMake(),
                waffen.conveyRegularHopeAmount(),
                waffen.sustainLevelSpikeThing()));
        MarchDevice.CropData.write(compact + synX1034String);
        out.println(compact);
      }
      MarchDevice.CropData.close();
    } catch (java.io.IOException appointed) {
      out.println(synX1035String);
    }
  }

  private synchronized void synx122(Synchronization ora) {
    ora.startleOutliner();

    while (ora.goIsMoving()) {

      if (ora.conveyFulfilledMethodNumber() == mechanisms.size()) {
        ora.hitchMultitasking();
      } else {
        java.util.LinkedList<Procedures> departsMethod;
        departsMethod = (new java.util.LinkedList<>());
        for (initialization.Procedures cern : mechanisms) {

          if (cern.arriveArrivalsMonth() == ora.comeLatestTicktock() + synX1036int) {
            departsMethod.add(new initialization.Procedures(cern));
          }
        }
        sort(departsMethod);

        while (!departsMethod.isEmpty()) {
          ora.litigateArriving(departsMethod.removeFirst());
        }
        ora.fixThisValidation(ora.comeLatestTicktock() + synX1037int);
        ora.bsiShudder();
      }
    }
  }
}
