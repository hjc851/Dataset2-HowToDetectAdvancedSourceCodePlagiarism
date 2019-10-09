package reseller;

import synchronization.BParser;
import synchronization.GrrProgrammer;
import synchronization.Treat;
import synchronization.IccParser;
import synchronization.DesiredSpreadsheet;
import synchronization.Debugging;
import synchronization.PapsOrganizer;
import brake.MechanismMockup;
import java.io.IOException;
import java.util.*;

public class Shipper {
  private ArrayDeque<Debugging> systems = null;
  private LinkedList<Treat> march = null;
  public static int CompleteSentence = 0;

  public Shipper() {
    this.systems = new ArrayDeque<>();
    Debugging paps = new PapsOrganizer();
    Debugging oxime = new IccParser();
    Debugging operated = new DesiredSpreadsheet();
    Debugging grr = new GrrProgrammer();
    Debugging ik = new BParser();
    this.systems.addLast(paps);
    this.systems.addLast(oxime);
    this.systems.addLast(operated);
    this.systems.addLast(ik);
    this.systems.addLast(grr);
  }

  public synchronized void putProcedure(LinkedList<Treat> proces) {
    this.march = proces;
  }

  public synchronized void determineDetachmentBeginning(int expeditiousnessYear) {
    this.CompleteSentence = expeditiousnessYear;
  }

  public synchronized void scarperCaller() {
    for (Debugging ora : systems) synx182(ora);
    this.reprintingSummarized();
  }

  public synchronized void reprintingSummarized() {

    try {
      MechanismMockup.YieldRegister.write("Summary\n");
      System.out.println("Summary");
      String letterhead =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      MechanismMockup.YieldRegister.write(letterhead + "\n");
      System.out.println(letterhead);
      for (Debugging waffen : systems) {
        String synopsis =
            String.format(
                "%-9s%23.2f%26.2f",
                waffen.organizerList(),
                waffen.driveRatesStayAgain(),
                waffen.producePercentageTransitionNow());
        MechanismMockup.YieldRegister.write(synopsis + "\n");
        System.out.println(synopsis);
      }
      MechanismMockup.YieldRegister.close();
    } catch (IOException appointed) {
      System.out.println("Unable to write summary to file.");
    }
  }

  private synchronized void synx182(Debugging ora) {
    ora.openingInitialization();

    while (ora.goIsMoving()) {

      if (ora.goAccomplishedProcedureHeight() == march.size()) {
        ora.interceptSpooler();
      } else {
        LinkedList<Treat> playMethodology = new LinkedList<>();
        for (Treat postscript : march) {

          if (postscript.goComeClock() == ora.takeTopicalMark() + 1) {
            playMethodology.add(new Treat(postscript));
          }
        }
        Collections.sort(playMethodology);

        while (!playMethodology.isEmpty()) {
          ora.proceedingsMortar(playMethodology.removeFirst());
        }
        ora.settledCirculatingShudder(ora.takeTopicalMark() + 1);
        ora.optiBeat();
      }
    }
  }
}
