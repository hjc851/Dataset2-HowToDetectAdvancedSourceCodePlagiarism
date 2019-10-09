package multitasking;

import exporter.Retailer;
import multitasking.Initialization;
import multitasking.Procedures;
import java.util.ArrayDeque;

public class GrrProgrammer extends multitasking.Initialization {
  private static final boolean synX2288boolean = false;
  private static final int synX2287int = 0;
  private static final boolean synX2286boolean = true;
  private static final int synX2285int = 1;
  private static final int synX2284int = 2;
  private static final int synX2283int = 0;
  private static final boolean synX2282boolean = true;
  private static final int synX2281int = 1;
  private static final String synX2280String = "NRR:";
  private java.util.ArrayDeque<GrrProcedure> quickSufferance;
  private int clockLeft;
  private multitasking.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.quickSufferance = (new java.util.ArrayDeque<>());
    clockLeft = (Initialization.DaysQuantitative);
  }

  public synchronized String timerMention() {
    return synX2280String;
  }

  public synchronized void weapMark() {

    if (grrProcedure != null) synx323();

    if (this.ltsDesignator && flowProcedures == null) synx324();
    else synx325();
  }

  public synchronized void proceedingsMortar(Procedures mechanisms) {
    quickSufferance.add(new multitasking.GrrProcedure(mechanisms));
  }

  private synchronized void synx323() {
    grrProcedure.determineLinearBeginning(grrProcedure.obtainScamperingDays() + synX2281int);
    clockLeft--;

    if (grrProcedure.obtainScamperingDays() == grrProcedure.takeExecutionsDiameter()) {
      grrProcedure.bentPulloutHour(this.producePrevalentScore());
      this.fulfilledMethod.addLast(grrProcedure);
      grrProcedure = (null);
      this.ltsDesignator = (synX2282boolean);
    }

    if (clockLeft == synX2283int && grrProcedure != null) {

      if (quickSufferance.isEmpty()) {
        clockLeft = (grrProcedure.makeDaySum());
      } else {

        if (grrProcedure.makeDaySum() > synX2284int) {
          grrProcedure.orderedChanceNumber(grrProcedure.makeDaySum() - synX2285int);
        }

        quickSufferance.addLast(grrProcedure);
        grrProcedure = (null);
        this.ltsDesignator = (synX2286boolean);
      }
    }
  }

  private synchronized void synx324() {
    this.unexhaustedTelaMoment--;

    if (unexhaustedTelaMoment == synX2287int) {
      this.ltsDesignator = (synX2288boolean);
      this.unexhaustedTelaMoment = (Retailer.DeployChance);
    }
  }

  private synchronized void synx325() {

    if (grrProcedure == null && !quickSufferance.isEmpty()) {
      grrProcedure = (quickSufferance.removeFirst());
      freightMarch(grrProcedure);
      grrProcedure.arrangeBeganYears(this.producePrevalentScore());
      clockLeft = (grrProcedure.makeDaySum());
    }
  }

  private synchronized void synx326(int i) {
    quickTrailers[i] = (new java.util.ArrayDeque<>());
  }
}
