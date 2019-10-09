package coordinator;

import initialization.NealOrganizer;
import initialization.GrrProgrammer;
import initialization.Mechanism;
import initialization.LyraSynchronizer;
import initialization.DefinedCompiler;
import initialization.Configuration;
import initialization.SptTimer;
import joystick.MechanismsManikin;
import java.io.IOException;
import java.util.*;

public class Salesperson {
  public ArrayDeque<Configuration> existing;
  public LinkedList<Mechanism> operations;
  public static int MailAmount;

  public Salesperson() {
    this.existing = new ArrayDeque<>();
    Configuration paps = new SptTimer();
    Configuration ohio = new LyraSynchronizer();
    Configuration treated = new DefinedCompiler();
    Configuration grr = new GrrProgrammer();
    Configuration dc = new NealOrganizer();
    this.existing.addLast(paps);
    this.existing.addLast(ohio);
    this.existing.addLast(treated);
    this.existing.addLast(dc);
    this.existing.addLast(grr);
  }

  public synchronized void rigidMethod(LinkedList<Mechanism> work) {
    this.operations = work;
  }

  public synchronized void laySlayMoment(int sendNow) {
    this.MailAmount = sendNow;
  }

  public synchronized void extendDealer() {
    for (Configuration fh : existing) {
      fh.partWorkflow();

      while (fh.goIsMoving()) {

        if (fh.makeUndertakenMarchDimensions() == operations.size()) {
          fh.containSpreadsheet();
        } else {
          LinkedList<Mechanism> begunTreat = new LinkedList<>();
          for (Mechanism writes : operations) {

            if (writes.catchEnterWhen() == fh.findActualRetick() + 1) {
              begunTreat.add(new Mechanism(writes));
            }
          }
          Collections.sort(begunTreat);

          while (!begunTreat.isEmpty()) {
            fh.mechanismsArrive(begunTreat.removeFirst());
          }
          fh.fitUnderwayWalk(fh.findActualRetick() + 1);
          fh.nsoTic();
        }
      }
    }
    this.impressSuccinct();
  }

  public synchronized void impressSuccinct() {

    try {
      MechanismsManikin.YieldRegister.write("Summary\n");
      System.out.println("Summary");
      String headline =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      MechanismsManikin.YieldRegister.write(headline + "\n");
      System.out.println(headline);
      for (Configuration waffen : existing) {
        String gist =
            String.format(
                "%-9s%23.2f%26.2f",
                waffen.developerIdentify(),
                waffen.haveModerateDeferPeriods(),
                waffen.makeOrdinaryTransformationDay());
        MechanismsManikin.YieldRegister.write(gist + "\n");
        System.out.println(gist);
      }
      MechanismsManikin.YieldRegister.close();
    } catch (IOException admittedly) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
