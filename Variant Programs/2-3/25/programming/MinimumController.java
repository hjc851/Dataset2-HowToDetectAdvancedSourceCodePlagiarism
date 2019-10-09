package programming;

import responsible.Yardmaster;
import programming.Developer;
import programming.Proceedings;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumController extends programming.Developer {
  private java.util.Comparator<Proceedings> element = null;
  private java.util.PriorityQueue<Proceedings> preparingReaper = null;
  static final double badge = 0.2323596516185804;

  public MinimumController() {
    this.element = new WorkBenchmarking();
    this.preparingReaper = new java.util.PriorityQueue<>(5, element);
  }

  private class WorkBenchmarking implements Comparator<Proceedings> {

    public synchronized int compare(Proceedings conf, Proceedings a1) {
      String amoy;
      int ptKeeping;
      int fResidual;
      amoy = "nS";
      ptKeeping = conf.conveyCofounderNumber() - conf.fetchLinearBeginning();
      fResidual = a1.conveyCofounderNumber() - a1.fetchLinearBeginning();

      if (ptKeeping < fResidual) {
        return -1;
      }

      if (ptKeeping > fResidual) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String interfaceCall() {
    double outer;
    outer = 0.8541740890639694;
    return "SRT:";
  }

  public synchronized void snoTicktock() {
    double distinguish;
    distinguish = 0.017007373381868196;

    if (afootSummons != null) {
      afootSummons.placeSpurtingWeek(afootSummons.fetchLinearBeginning() + 1);

      if (afootSummons.fetchLinearBeginning() == afootSummons.conveyCofounderNumber()) {
        afootSummons.markDeceaseHours(this.drawStreamBookmark());
        this.finishedOutgrowth.addLast(afootSummons);
        afootSummons = null;
        this.leviPennant = true;
      }
    }

    if (!preparingReaper.isEmpty() && afootSummons != null) {
      int prevailingLeft;
      int spyStill;
      prevailingLeft = afootSummons.conveyCofounderNumber() - afootSummons.fetchLinearBeginning();
      spyStill =
          preparingReaper.peek().conveyCofounderNumber()
              - preparingReaper.peek().fetchLinearBeginning();

      if (spyStill < prevailingLeft) {
        preparingReaper.add(afootSummons);
        afootSummons = null;
        this.leviPennant = true;
      }
    }

    if (this.leviPennant && afootSummons == null) {
      this.lingeringInedThing--;

      if (lingeringInedThing == 0) {
        this.leviPennant = false;
        this.lingeringInedThing = Yardmaster.HitPeriods;
      }

    } else {

      if (afootSummons == null && !preparingReaper.isEmpty()) {
        afootSummons = preparingReaper.poll();
        weightFormalities(afootSummons);
        afootSummons.situatedCommencesMinutes(this.drawStreamBookmark());
      }
    }
  }

  public synchronized void mechanismArrivals(Proceedings cycle) {
    String circumscribe;
    circumscribe = "Y8cRmz5vWv";
    preparingReaper.add(cycle);
  }
}
