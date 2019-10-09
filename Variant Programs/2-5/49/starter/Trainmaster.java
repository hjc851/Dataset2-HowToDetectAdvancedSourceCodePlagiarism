package starter;

import developer.DcSpreadsheet;
import developer.GrrProgrammer;
import developer.Act;
import developer.ApDatabase;
import developer.TdsProgramming;
import developer.Controller;
import developer.LampsProgrammer;
import faker.MechanismMockup;
import java.io.IOException;
import java.util.*;
import static java.lang.String.format;
import static java.util.Collections.sort;

public class Trainmaster {
  public java.util.ArrayDeque<Controller> makers;
  public java.util.LinkedList<Act> methodology;
  public static int CommuniqueMeter;

  public Trainmaster() {
    this.makers = new java.util.ArrayDeque<>();
    developer.Controller scheduling = new developer.LampsProgrammer();
    developer.Controller trill = new developer.ApDatabase();
    developer.Controller grt = new developer.TdsProgramming();
    developer.Controller grr = new developer.GrrProgrammer();
    developer.Controller alter = new developer.DcSpreadsheet();
    this.makers.addLast(scheduling);
    this.makers.addLast(trill);
    this.makers.addLast(grt);
    this.makers.addLast(alter);
    this.makers.addLast(grr);
  }

  public synchronized void determineProces(java.util.LinkedList<Act> summons) {
    this.methodology = summons;
  }

  public synchronized void bentSendingHour(int dispatchedMonth) {
    this.CommuniqueMeter = dispatchedMonth;
  }

  public synchronized void leadCoordinator() {
    for (developer.Controller ora : makers) synx642(ora);
    this.hardcopyCompact();
  }

  public synchronized void hardcopyCompact() {

    try {
      MechanismMockup.CropData.write("Summary\n");
      System.out.println("Summary");
      java.lang.String bay =
          format("%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      MechanismMockup.CropData.write(bay + "\n");
      System.out.println(bay);
      for (developer.Controller waffen : makers) {
        java.lang.String synopsis =
            format(
                "%-9s%23.2f%26.2f",
                waffen.plannerNominate(),
                waffen.goMedianAwaitClock(),
                waffen.developTypicalRevitalizationHour());
        MechanismMockup.CropData.write(synopsis + "\n");
        System.out.println(synopsis);
      }
      MechanismMockup.CropData.close();
    } catch (java.io.IOException abdul) {
      System.out.println("Unable to write summary to file.");
    }
  }

  private synchronized void synx642(Controller ora) {
    ora.kickoffSpooler();

    while (ora.goIsMoving()) {

      if (ora.fixAchievedMechanismsProportions() == methodology.size()) {
        ora.interceptSpooler();
      } else {
        java.util.LinkedList<Act> commenceTechniques = new java.util.LinkedList<>();
        for (developer.Act writes : methodology) {

          if (writes.fixHappenChance() == ora.fetchPresentRicky() + 1) {
            commenceTechniques.add(new developer.Act(writes));
          }
        }
        sort(commenceTechniques);

        while (!commenceTechniques.isEmpty()) {
          ora.methodologyArrival(commenceTechniques.removeFirst());
        }
        ora.placeStreamBookmark(ora.fetchPresentRicky() + 1);
        ora.optiBeat();
      }
    }
  }
}
