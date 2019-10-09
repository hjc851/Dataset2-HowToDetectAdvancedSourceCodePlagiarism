package starter;

import planner.DcSpreadsheet;
import planner.GrrProgrammer;
import planner.Summons;
import planner.TrillSpreadsheet;
import planner.TreatedSynchronization;
import planner.Organizer;
import planner.PapsOrganizer;
import faker.ServeAnalogue;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;

public class Shipper {
  private static final int synX1873int = 1;
  private static final int synX1872int = 1;
  private static final String synX1871String = "Unable to write summary to file.";
  private static final String synX1870String = "\n";
  private static final String synX1869String = "%-9s%23.2f%26.2f";
  private static final String synX1868String = "\n";
  private static final String synX1867String = "Average Turnaround Time";
  private static final String synX1866String = "Average Waiting Time";
  private static final String synX1865String = "Algorithm";
  private static final String synX1864String = "%-9s%23s%26s";
  private static final String synX1863String = "Summary";
  private static final String synX1862String = "Summary\n";

  public synchronized void impressSuccinct() {

    try {
      String commutator;
      ServeAnalogue.OutturnLodge.write(synX1862String);
      out.println(synX1863String);
      commutator = (String.format(synX1864String, synX1865String, synX1866String, synX1867String));
      ServeAnalogue.OutturnLodge.write(commutator + synX1868String);
      out.println(commutator);
      for (Organizer fh : number) {
        String outline;
        outline =
            (String.format(
                synX1869String,
                fh.timerMention(),
                fh.becomeApproximatelyLingerOpportunity(),
                fh.producePercentageTransitionNow()));
        ServeAnalogue.OutturnLodge.write(outline + synX1870String);
        out.println(outline);
      }
      ServeAnalogue.OutturnLodge.close();
    } catch (IOException eden) {
      out.println(synX1871String);
    }
  }

  public synchronized void determinedDischargeDays(int expeditionPeriod) {
    this.ShipmentClip = (expeditionPeriod);
  }

  public Shipper() {
    Organizer spt;
    Organizer trill;
    Organizer measured;
    Organizer grr;
    Organizer fl;
    this.number = (new ArrayDeque<>());
    spt = (new PapsOrganizer());
    trill = (new TrillSpreadsheet());
    measured = (new TreatedSynchronization());
    grr = (new GrrProgrammer());
    fl = (new DcSpreadsheet());
    this.number.addLast(spt);
    this.number.addLast(trill);
    this.number.addLast(measured);
    this.number.addLast(fl);
    this.number.addLast(grr);
  }

  public ArrayDeque<Organizer> number = null;
  public LinkedList<Summons> systems = null;

  public synchronized void operateStarter() {
    for (Organizer waffen : number) {
      waffen.originateConfiguration();

      while (waffen.goIsMoving()) {

        if (waffen.conveyFulfilledMethodNumber() == systems.size()) {
          waffen.layoverConfiguration();
        } else {
          LinkedList<Summons> launchingPractices;
          launchingPractices = (new LinkedList<>());
          for (Summons postscript : systems) {

            if (postscript.produceComingNow() == waffen.goPrevailingClick() + synX1872int) {
              launchingPractices.add(new Summons(postscript));
            }
          }
          Collections.sort(launchingPractices);

          while (!launchingPractices.isEmpty()) {
            waffen.cycleIn(launchingPractices.removeFirst());
          }
          waffen.adjustFlowIndicate(waffen.goPrevailingClick() + synX1873int);
          waffen.addTock();
        }
      }
    }
    this.impressSuccinct();
  }

  public static int ShipmentClip = 0;

  public synchronized void markSummons(LinkedList<Summons> sue) {
    this.systems = (sue);
  }
}
