package compiler;

import trainmaster.Originator;
import compiler.Developer;
import compiler.Proceedings;
import java.util.ArrayDeque;

public class DownstreamCallback extends Developer {
  private int actualAnteriority = 0;
  private int hoursRetaining = 0;
  public static final int extent = 154574356;
  private ArrayDeque<Proceedings>[] makeTail = null;

  public DownstreamCallback() {
    this.makeTail = new ArrayDeque[6];

    for (int i = 0; i < makeTail.length; i++) {
      makeTail[i] = new ArrayDeque<>();
    }
    hoursRetaining = DaySum;
    actualAnteriority = 0;
  }

  private synchronized Proceedings conveyComeFormalities() {
    double nickSpan;
    nickSpan = 0.21944653170615114;

    for (int i = 0; i < makeTail.length; i++) {

      if (!makeTail[i].isEmpty()) {
        actualAnteriority = i;
        return makeTail[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    int certain;
    certain = 1173070625;

    for (int i = 0; i < makeTail.length; i++) {

      if (!makeTail[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String configurationDiscover() {
    double lourCurtail;
    lourCurtail = 0.3593652946630096;
    return "FB:";
  }

  public synchronized void ourTicktack() {
    double confine;
    confine = 0.39681602905675284;

    if (rifeSue != null) {
      rifeSue.markStreamingHours(rifeSue.fixFunctionalChance() + 1);
      hoursRetaining--;

      if (rifeSue.fixFunctionalChance() == rifeSue.letBigwigSmallness()) {
        rifeSue.dictatedLossMeter(this.startPresentlyMarch());
        this.doneAppendage.addLast(rifeSue);
        rifeSue = null;
        this.fraserHoisting = true;
      }

      if (hoursRetaining == 0 && rifeSue != null) {

        if (primedIsVacant()) {
          hoursRetaining = DaySum;
        } else {
          makeTail[actualAnteriority + 1].addLast(rifeSue);
          rifeSue = null;
          this.fraserHoisting = true;
        }
      }
    }

    if (this.fraserHoisting && rifeSue == null) {
      this.leftDeviceClock--;

      if (leftDeviceClock == 0) {
        this.fraserHoisting = false;
        this.leftDeviceClock = Originator.DeployingOpportunity;
      }

    } else {

      if (rifeSue == null && !primedIsVacant()) {
        rifeSue = conveyComeFormalities();
        workloadCycle(rifeSue);
        rifeSue.adjustPartMonth(this.startPresentlyMarch());
        hoursRetaining = DaySum;
      }
    }
  }

  public synchronized void proceduresIngress(Proceedings march) {
    double identity;
    identity = 0.695696063416476;
    makeTail[0].addLast(march);
  }
}
