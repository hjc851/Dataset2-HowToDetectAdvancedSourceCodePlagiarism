package plenum;

import organizer.DownstreamCallback;
import organizer.GrrProgrammer;
import organizer.Proceeding;
import organizer.CabooseOrganizer;
import organizer.IncreasingOutliner;
import organizer.Programming;
import organizer.PapsOrganizer;
import impactor.MechanismMockup;
import java.io.IOException;
import java.util.*;

public class Regulator {
  private static final double synX289double = 0.8316112828854175;
  private static final String synX288String = "Unable to write summary to file.";
  private static final String synX287String = "\n";
  private static final String synX286String = "%-9s%23.2f%26.2f";
  private static final String synX285String = "\n";
  private static final String synX284String = "Average Turnaround Time";
  private static final String synX283String = "Average Waiting Time";
  private static final String synX282String = "Algorithm";
  private static final String synX281String = "%-9s%23s%26s";
  private static final String synX280String = "Summary";
  private static final String synX279String = "Summary\n";
  private static final int synX278int = -777610461;
  private static final int synX277int = 1;
  private static final int synX276int = 1;
  private static final double synX275double = 0.32270987789507066;
  private static final double synX274double = 0.4273932616147923;

  public synchronized void putDespatchClock(int forwardingAgain) {
    double positionFoods;
    positionFoods = (synX274double);
    this.CommuniqueMeter = (forwardingAgain);
  }

  private java.util.LinkedList<Proceeding> mechanism;

  public Regulator() {
    organizer.Programming degenerates;
    organizer.Programming rail;
    organizer.Programming desired;
    organizer.Programming grr;
    organizer.Programming fl;
    this.fair = (new java.util.ArrayDeque<>());
    degenerates = (new organizer.PapsOrganizer());
    rail = (new organizer.CabooseOrganizer());
    desired = (new organizer.IncreasingOutliner());
    grr = (new organizer.GrrProgrammer());
    fl = (new organizer.DownstreamCallback());
    this.fair.addLast(degenerates);
    this.fair.addLast(rail);
    this.fair.addLast(desired);
    this.fair.addLast(fl);
    this.fair.addLast(grr);
  }

  public static final String code = "2mEC";

  public synchronized void scarperCaller() {
    double minhBandwidth;
    minhBandwidth = (synX275double);
    for (organizer.Programming fh : fair) {
      fh.resumeServer();

      while (fh.goIsMoving()) {

        if (fh.fixAchievedMechanismsProportions() == mechanism.size()) {
          fh.periodDatabase();
        } else {
          java.util.LinkedList<Proceeding> launchingPractices;
          launchingPractices = (new java.util.LinkedList<>());
          for (organizer.Proceeding writes : mechanism) {

            if (writes.receiveDescendMoment() == fh.receiveContemporaryTicktack() + synX276int) {
              launchingPractices.add(new organizer.Proceeding(writes));
            }
          }
          java.util.Collections.sort(launchingPractices);

          while (!launchingPractices.isEmpty()) {
            fh.sueNext(launchingPractices.removeFirst());
          }
          fh.dictatedOngoingBeat(fh.receiveContemporaryTicktack() + synX277int);
          fh.optiBeat();
        }
      }
    }
    this.reprintSummarizing();
  }

  public synchronized void reprintSummarizing() {
    int fukienLength;
    fukienLength = (synX278int);

    try {
      java.lang.String lintel;
      MechanismMockup.OutturnLodge.write(synX279String);
      System.out.println(synX280String);
      lintel =
          (java.lang.String.format(synX281String, synX282String, synX283String, synX284String));
      MechanismMockup.OutturnLodge.write(lintel + synX285String);
      System.out.println(lintel);
      for (organizer.Programming ora : fair) {
        java.lang.String compact;
        compact =
            (java.lang.String.format(
                synX286String,
                ora.compilerMake(),
                ora.letMediumAwaitingHours(),
                ora.receiveMediocreReversionMoment()));
        MechanismMockup.OutturnLodge.write(compact + synX287String);
        System.out.println(compact);
      }
      MechanismMockup.OutturnLodge.close();
    } catch (java.io.IOException eden) {
      System.out.println(synX288String);
    }
  }

  public synchronized void dictatedWork(java.util.LinkedList<Proceeding> practices) {
    double johannes;
    johannes = (synX289double);
    this.mechanism = (practices);
  }

  private java.util.ArrayDeque<Programming> fair;
  public static int CommuniqueMeter;
}
