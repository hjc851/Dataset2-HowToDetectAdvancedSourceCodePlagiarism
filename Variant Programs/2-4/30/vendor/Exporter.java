package vendor;

import compiler.DcSpreadsheet;
import compiler.GrrProgrammer;
import compiler.Mechanisms;
import compiler.FDebugging;
import compiler.IncreasedSynchronizer;
import compiler.Parser;
import compiler.PapsOrganizer;
import mimic.ProcedureSimulation;
import java.io.IOException;
import java.util.*;

public class Exporter {
  public static int AssignThing;

  public synchronized void scarperCaller() {
    for (Parser ora : systems) {
      ora.runDebugging();

      while (ora.goIsMoving()) {

        if (ora.produceUndergoneMethodologiesDensity() == proces.size()) {
          ora.haltProgrammer();
        } else {
          LinkedList<Mechanisms> leavingProces;
          leavingProces = new LinkedList<>();
          for (Mechanisms postscript : proces) {

            if (postscript.developHappensHour() == ora.driveContinuingVibrate() + 1) {
              leavingProces.add(new Mechanisms(postscript));
            }
          }
          Collections.sort(leavingProces);

          while (!leavingProces.isEmpty()) {
            ora.phaseEntry(leavingProces.removeFirst());
          }
          ora.determinedLiveTic(ora.driveContinuingVibrate() + 1);
          ora.optiBeat();
        }
      }
    }
    this.publicationsOverview();
  }

  private LinkedList<Mechanisms> proces;

  public Exporter() {
    Parser lamps;
    Parser fuzee;
    Parser tribunal;
    Parser grr;
    Parser ab;
    this.systems = new ArrayDeque<>();
    lamps = new PapsOrganizer();
    fuzee = new FDebugging();
    tribunal = new IncreasedSynchronizer();
    grr = new GrrProgrammer();
    ab = new DcSpreadsheet();
    this.systems.addLast(lamps);
    this.systems.addLast(fuzee);
    this.systems.addLast(tribunal);
    this.systems.addLast(ab);
    this.systems.addLast(grr);
  }

  public synchronized void publicationsOverview() {

    try {
      String forefront;
      ProcedureSimulation.ExportSubmit.write("Summary\n");
      System.out.println("Summary");
      forefront =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ProcedureSimulation.ExportSubmit.write(forefront + "\n");
      System.out.println(forefront);
      for (Parser fh : systems) {
        String summarizes;
        summarizes =
            String.format(
                "%-9s%23.2f%26.2f",
                fh.multitaskingMoniker(),
                fh.receiveMediocrePostponementMoment(),
                fh.catchCommonRevivalWhen());
        ProcedureSimulation.ExportSubmit.write(summarizes + "\n");
        System.out.println(summarizes);
      }
      ProcedureSimulation.ExportSubmit.close();
    } catch (IOException aba) {
      System.out.println("Unable to write summary to file.");
    }
  }

  public synchronized void prepareMethodologies(LinkedList<Mechanisms> march) {
    this.proces = march;
  }

  public synchronized void readyRemoveDay(int mailAmount) {
    this.AssignThing = mailAmount;
  }

  private ArrayDeque<Parser> systems;
}
