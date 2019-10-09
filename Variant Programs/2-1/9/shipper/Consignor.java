package shipper;

import programmer.BsSynchronizer;
import programmer.GrrProgrammer;
import programmer.Litigate;
import programmer.StaOutliner;
import programmer.DeterminedCallback;
import programmer.Server;
import programmer.LampsProgrammer;
import trainer.SummonsFaker;
import java.io.IOException;
import java.util.*;

public class Consignor {
  private ArrayDeque<Server> work;
  private LinkedList<Litigate> summons;
  public static int DispatchesHours;

  public Consignor() {
    this.work = new ArrayDeque<>();
    Server paps = new LampsProgrammer();
    Server omsk = new StaOutliner();
    Server desired = new DeterminedCallback();
    Server grr = new GrrProgrammer();
    Server axial = new BsSynchronizer();
    this.work.addLast(paps);
    this.work.addLast(omsk);
    this.work.addLast(desired);
    this.work.addLast(axial);
    this.work.addLast(grr);
  }

  public void determinedOutgrowth(LinkedList<Litigate> method) {
    this.summons = method;
  }

  public void prepareSendNow(int despatchClock) {
    this.DispatchesHours = despatchClock;
  }

  public void moveSender() {
    for (Server waffen : work) {
      waffen.goTimer();

      while (waffen.goIsMoving()) {

        if (waffen.startConstructedMethodologyBreadth() == summons.size()) {
          waffen.stoppageController();
        } else {
          LinkedList<Litigate> openingProcedure = new LinkedList<>();
          for (Litigate vig : summons) {

            if (vig.comeGetClip() == waffen.fixNewTally() + 1) {
              openingProcedure.add(new Litigate(vig));
            }
          }
          Collections.sort(openingProcedure);

          while (!openingProcedure.isEmpty()) {
            waffen.cycleIn(openingProcedure.removeFirst());
          }
          waffen.dictatedOngoingBeat(waffen.fixNewTally() + 1);
          waffen.nbsClick();
        }
      }
    }
    this.hardcopyCompact();
  }

  public void hardcopyCompact() {

    try {
      SummonsFaker.ThroughputDocument.write("Summary\n");
      System.out.println("Summary");
      String usb =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      SummonsFaker.ThroughputDocument.write(usb + "\n");
      System.out.println(usb);
      for (Server fh : work) {
        String excerpts =
            String.format(
                "%-9s%23.2f%26.2f",
                fh.controllerSurname(),
                fh.comeNormalDelayClip(),
                fh.fetchProportionTurnoverBeginning());
        SummonsFaker.ThroughputDocument.write(excerpts + "\n");
        System.out.println(excerpts);
      }
      SummonsFaker.ThroughputDocument.close();
    } catch (IOException adult) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
