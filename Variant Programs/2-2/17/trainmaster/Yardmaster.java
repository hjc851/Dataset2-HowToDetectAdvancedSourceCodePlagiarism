package trainmaster;

import organizer.ApDeveloper;
import organizer.GrrProgrammer;
import organizer.Proceeding;
import organizer.OmskSpooler;
import organizer.ObtainedSpooler;
import organizer.Spooler;
import organizer.DegeneratesDeveloper;
import brake.NegotiationsAvionics;
import java.io.IOException;
import java.util.*;

public class Yardmaster {
  private java.util.ArrayDeque<Spooler> use;
  private java.util.LinkedList<Proceeding> proces;
  public static int AssignThing;

  public Yardmaster() {
    this.use = new java.util.ArrayDeque<>();
    organizer.Spooler spt = new organizer.DegeneratesDeveloper();
    organizer.Spooler oxime = new organizer.OmskSpooler();
    organizer.Spooler tribunal = new organizer.ObtainedSpooler();
    organizer.Spooler grr = new organizer.GrrProgrammer();
    organizer.Spooler alter = new organizer.ApDeveloper();
    this.use.addLast(spt);
    this.use.addLast(oxime);
    this.use.addLast(tribunal);
    this.use.addLast(alter);
    this.use.addLast(grr);
  }

  public void laidOperation(java.util.LinkedList<Proceeding> serve) {
    this.proces = serve;
  }

  public void putDespatchClock(int routingWeek) {
    this.AssignThing = routingWeek;
  }

  public void extendDealer() {
    for (organizer.Spooler waffen : use) {
      waffen.goTimer();

      while (waffen.goIsMoving()) {

        if (waffen.beatInauguratedOperationsSeverity() == proces.size()) {
          waffen.terminateWriter();
        } else {
          java.util.LinkedList<Proceeding> firstSystems = new java.util.LinkedList<>();
          for (organizer.Proceeding writes : proces) {

            if (writes.arriveArrivalsMonth() == waffen.arriveFlowIndicate() + 1) {
              firstSystems.add(new organizer.Proceeding(writes));
            }
          }
          java.util.Collections.sort(firstSystems);

          while (!firstSystems.isEmpty()) {
            waffen.operationInbound(firstSystems.removeFirst());
          }
          waffen.placeStreamBookmark(waffen.arriveFlowIndicate() + 1);
          waffen.addTock();
        }
      }
    }
    this.publicationPrecis();
  }

  public void publicationPrecis() {

    try {
      NegotiationsAvionics.ProductivityDocuments.write("Summary\n");
      System.out.println("Summary");
      java.lang.String headings =
          java.lang.String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      NegotiationsAvionics.ProductivityDocuments.write(headings + "\n");
      System.out.println(headings);
      for (organizer.Spooler fh : use) {
        java.lang.String gist =
            java.lang.String.format(
                "%-9s%23.2f%26.2f",
                fh.databaseNickname(),
                fh.developTypicalAwaitedHour(),
                fh.startOverallDownturnMinutes());
        NegotiationsAvionics.ProductivityDocuments.write(gist + "\n");
        System.out.println(gist);
      }
      NegotiationsAvionics.ProductivityDocuments.close();
    } catch (java.io.IOException former) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
