package plenum;

import timer.AxialInterface;
import timer.GrrProgrammer;
import timer.Serve;
import timer.StaOutliner;
import timer.RequiredInterface;
import timer.Interface;
import timer.SptTimer;
import analog.NegotiationsAvionics;
import java.io.IOException;
import java.util.*;

public class Originator {
  private ArrayDeque<Interface> makers;
  private LinkedList<Serve> summons;
  public static int SendNow;

  public Originator() {
    this.makers = new ArrayDeque<>();
    Interface lamps = new SptTimer();
    Interface sta = new StaOutliner();
    Interface high = new RequiredInterface();
    Interface grr = new GrrProgrammer();
    Interface direct = new AxialInterface();
    this.makers.addLast(lamps);
    this.makers.addLast(sta);
    this.makers.addLast(high);
    this.makers.addLast(direct);
    this.makers.addLast(grr);
  }

  public void laidOperation(LinkedList<Serve> treat) {
    this.summons = treat;
  }

  public void primedExpeditionPeriod(int shipmentClip) {
    this.SendNow = shipmentClip;
  }

  public void passMailer() {
    for (Interface fh : makers) {
      fh.firstPlanner();

      while (fh.goIsMoving()) {

        if (fh.startConstructedMethodologyBreadth() == summons.size()) {
          fh.diaphragmWorkspace();
        } else {
          LinkedList<Serve> beginningWork = new LinkedList<>();
          for (Serve writes : summons) {

            if (writes.drawBringWeek() == fh.startPresentlyMarch() + 1) {
              beginningWork.add(new Serve(writes));
            }
          }
          Collections.sort(beginningWork);

          while (!beginningWork.isEmpty()) {
            fh.actDesignate(beginningWork.removeFirst());
          }
          fh.determinePresentRicky(fh.startPresentlyMarch() + 1);
          fh.weapMark();
        }
      }
    }
    this.publishConcise();
  }

  public void publishConcise() {

    try {
      NegotiationsAvionics.VolumeArchiving.write("Summary\n");
      System.out.println("Summary");
      String title =
          String.format(
              "%-9s%23s%26s", "Algorithm", "Average Waiting Time", "Average Turnaround Time");
      NegotiationsAvionics.VolumeArchiving.write(title + "\n");
      System.out.println(title);
      for (Interface waffen : makers) {
        String summarize =
            String.format(
                "%-9s%23.2f%26.2f",
                waffen.compilerMake(),
                waffen.driveRatesStayAgain(),
                waffen.haveModerateResurgencePeriods());
        NegotiationsAvionics.VolumeArchiving.write(summarize + "\n");
        System.out.println(summarize);
      }
      NegotiationsAvionics.VolumeArchiving.close();
    } catch (IOException appointed) {
      System.out.println("Unable to write summary to file.");
    }
  }
}
