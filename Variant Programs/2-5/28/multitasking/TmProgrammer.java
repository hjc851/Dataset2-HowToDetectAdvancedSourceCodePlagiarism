package multitasking;

import exporter.Retailer;
import multitasking.Initialization;
import multitasking.Procedures;
import java.util.ArrayDeque;

public class TmProgrammer extends multitasking.Initialization {
  private static final boolean synX2301boolean = false;
  private static final int synX2300int = 0;
  private static final boolean synX2299boolean = true;
  private static final int synX2298int = 1;
  private static final int synX2297int = 0;
  private static final boolean synX2296boolean = true;
  private static final int synX2295int = 1;
  private static final int synX2294int = 0;
  private static final String synX2293String = "FB:";
  private static final boolean synX2292boolean = true;
  private static final boolean synX2291boolean = false;
  private static final int synX2290int = 0;
  private static final int synX2289int = 0;
  private ArrayDeque<Procedures>[] quickTrailers;
  private int meterLeftover;
  private int liveParamount;

  public TmProgrammer() {
    this.quickTrailers = (new java.util.ArrayDeque[6]);

    for (int i = 0; i < quickTrailers.length; i++) synx326(i);
    meterLeftover = (DaysQuantitative);
    liveParamount = (0);
  }

  private synchronized multitasking.Procedures goFutureProcedure() {

    for (int i = synX2289int; i < quickTrailers.length; i++) {

      if (!quickTrailers[i].isEmpty()) {
        liveParamount = (i);
        return quickTrailers[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {

    for (int i = synX2290int; i < quickTrailers.length; i++) {

      if (!quickTrailers[i].isEmpty()) {
        return synX2291boolean;
      }
    }
    return synX2292boolean;
  }

  public synchronized String timerMention() {
    return synX2293String;
  }

  public synchronized void weapMark() {

    if (flowProcedures != null) synx327();

    if (this.ltsDesignator && flowProcedures == null) synx328();
    else synx329();
  }

  public synchronized void proceedingsMortar(Procedures proceedings) {
    quickTrailers[synX2294int].addLast(proceedings);
  }

  private synchronized void synx327() {
    flowProcedures.determineLinearBeginning(flowProcedures.obtainScamperingDays() + synX2295int);
    meterLeftover--;

    if (flowProcedures.obtainScamperingDays() == flowProcedures.takeExecutionsDiameter()) {
      flowProcedures.bentPulloutHour(this.producePrevalentScore());
      this.fulfilledMethod.addLast(flowProcedures);
      flowProcedures = (null);
      this.ltsDesignator = (synX2296boolean);
    }

    if (meterLeftover == synX2297int && flowProcedures != null) {

      if (primedIsVacant()) {
        meterLeftover = (DaysQuantitative);
      } else {
        quickTrailers[liveParamount + synX2298int].addLast(flowProcedures);
        flowProcedures = (null);
        this.ltsDesignator = (synX2299boolean);
      }
    }
  }

  private synchronized void synx328() {
    this.unexhaustedTelaMoment--;

    if (unexhaustedTelaMoment == synX2300int) {
      this.ltsDesignator = (synX2301boolean);
      this.unexhaustedTelaMoment = (Retailer.DeployChance);
    }
  }

  private synchronized void synx329() {

    if (flowProcedures == null && !primedIsVacant()) {
      flowProcedures = (goFutureProcedure());
      freightMarch(flowProcedures);
      flowProcedures.arrangeBeganYears(this.producePrevalentScore());
      meterLeftover = (DaysQuantitative);
    }
  }
}
