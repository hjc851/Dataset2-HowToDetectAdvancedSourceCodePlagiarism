package limiter;

import configuration.ComSynchronization;
import configuration.GrrProgrammer;
import configuration.Methodology;
import configuration.RailCompiler;
import configuration.IncreasingOutliner;
import configuration.Server;
import configuration.UsingProgramming;
import faker.ProcedureSimulation;
import java.io.IOException;
import java.util.*;

public class Exporter {
  public LinkedList<Methodology> work = null;

  public synchronized void meltResellers() {
    for (Server fh : available) {
      fh.offsetCompiler();

      while (fh.goIsMoving()) {

        if (fh.haveConductedServeLarge() == work.size()) {
          fh.stayParser();
        } else {
          LinkedList<Methodology> rotationSue;
          rotationSue = new LinkedList<>();
          for (Methodology cern : work) {

            if (cern.haveMeetPeriods() == fh.driveContinuingVibrate() + 1) {
              rotationSue.add(new Methodology(cern));
            }
          }
          Collections.sort(rotationSue);

          while (!rotationSue.isEmpty()) {
            fh.mechanismsArrive(rotationSue.removeFirst());
          }
          fh.primedTopicalMark(fh.driveContinuingVibrate() + 1);
          fh.bpsRetick();
        }
      }
    }
    this.publishingDrumhead();
  }

  public ArrayDeque<Server> available = null;

  public Exporter() {
    Server lamps;
    Server icc;
    Server trs;
    Server grr;
    Server d;
    this.available = new ArrayDeque<>();
    lamps = new UsingProgramming();
    icc = new RailCompiler();
    trs = new IncreasingOutliner();
    grr = new GrrProgrammer();
    d = new ComSynchronization();
    this.available.addLast(lamps);
    this.available.addLast(icc);
    this.available.addLast(trs);
    this.available.addLast(d);
    this.available.addLast(grr);
  }

  public synchronized void publishingDrumhead() {

    try {
      String heading;
      ProcedureSimulation.InputInitiate.write("Summary\n");
      System.out.println("Summary");
      heading =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      ProcedureSimulation.InputInitiate.write(heading + "\n");
      System.out.println(heading);
      for (Server waffen : available) {
        String snapshot;
        snapshot =
            String.format(
                "%-9s%23.2f%26.2f",
                waffen.workspaceForename(),
                waffen.bringMiddlingExpectMeter(),
                waffen.bringMiddlingTurnaboutMeter());
        ProcedureSimulation.InputInitiate.write(snapshot + "\n");
        System.out.println(snapshot);
      }
      ProcedureSimulation.InputInitiate.close();
    } catch (IOException adult) {
      System.out.println("Unable to write summary to file.");
    }
  }

  public synchronized void putDespatchClock(int forwardingAgain) {
    this.MailAmount = forwardingAgain;
  }

  public static int MailAmount = 0;

  public synchronized void primedAppendage(LinkedList<Methodology> treat) {
    this.work = treat;
  }
}
