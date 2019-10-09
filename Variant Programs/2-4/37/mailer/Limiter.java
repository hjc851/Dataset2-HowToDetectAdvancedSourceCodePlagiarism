package mailer;

import planner.CommercialSpooler;
import planner.GrrProgrammer;
import planner.Litigate;
import planner.TrillSpreadsheet;
import planner.OperatedParser;
import planner.Database;
import planner.SptTimer;
import faker.PhaseSimulations;
import java.io.IOException;
import java.util.*;

public class Limiter {
  public ArrayDeque<Database> work;
  public LinkedList<Litigate> act;
  public static int DischargeDays;

  public Limiter() {
    this.work = new ArrayDeque<>();
    Database using = new SptTimer();
    Database diners = new TrillSpreadsheet();
    Database high = new OperatedParser();
    Database grr = new GrrProgrammer();
    Database cp = new CommercialSpooler();
    this.work.addLast(using);
    this.work.addLast(diners);
    this.work.addLast(high);
    this.work.addLast(cp);
    this.work.addLast(grr);
  }

  public synchronized void situatedMethodology(LinkedList<Litigate> techniques) {
    this.act = techniques;
  }

  public synchronized void prepareSendNow(int shipmentClip) {
    this.DischargeDays = shipmentClip;
  }

  public synchronized void extendDealer() {
    for (Database ora : work) synx302(ora);
    this.publicationsOverview();
  }

  public synchronized void publicationsOverview() {

    try {
      PhaseSimulations.IntensityReadme.write("Summary\n");
      System.out.println("Summary");
      String usb =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      PhaseSimulations.IntensityReadme.write(usb + "\n");
      System.out.println(usb);
      for (Database fh : work) {
        String precis =
            String.format(
                "%-9s%23.2f%26.2f",
                fh.workspaceForename(),
                fh.receiveMediocrePostponementMoment(),
                fh.receiveMediocreReversionMoment());
        PhaseSimulations.IntensityReadme.write(precis + "\n");
        System.out.println(precis);
      }
      PhaseSimulations.IntensityReadme.close();
    } catch (IOException exwife) {
      System.out.println("Unable to write summary to file.");
    }
  }

  private synchronized void synx302(Database ora) {
    ora.departParser();

    while (ora.goIsMoving()) {

      if (ora.makeUndertakenMarchDimensions() == act.size()) {
        ora.discontinueTimer();
      } else {
        LinkedList<Litigate> firstSystems = new LinkedList<>();
        for (Litigate vig : act) {

          if (vig.fixHappenChance() == ora.haveCirculatingShudder() + 1) {
            firstSystems.add(new Litigate(vig));
          }
        }
        Collections.sort(firstSystems);

        while (!firstSystems.isEmpty()) {
          ora.sueNext(firstSystems.removeFirst());
        }
        ora.putPrevailingClick(ora.haveCirculatingShudder() + 1);
        ora.ourTicktack();
      }
    }
  }
}
