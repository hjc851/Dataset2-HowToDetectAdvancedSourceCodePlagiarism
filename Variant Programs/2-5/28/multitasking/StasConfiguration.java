package multitasking;

import exporter.Retailer;
import multitasking.Initialization;
import multitasking.Procedures;
import java.util.ArrayDeque;

public class StasConfiguration extends multitasking.Initialization {
  private static final boolean synX2308boolean = false;
  private static final int synX2307int = 0;
  private static final boolean synX2306boolean = true;
  private static final int synX2305int = 0;
  private static final boolean synX2304boolean = true;
  private static final int synX2303int = 1;
  private static final String synX2302String = "RR:";
  private java.util.ArrayDeque<Procedures> availableFile;
  private int whenLeaving;

  public StasConfiguration() {
    this.availableFile = (new java.util.ArrayDeque<>());
    whenLeaving = (DaysQuantitative);
  }

  public synchronized String timerMention() {
    return synX2302String;
  }

  public synchronized void weapMark() {

    if (flowProcedures != null) synx330();

    if (this.ltsDesignator && flowProcedures == null) synx331();
    else synx332();
  }

  public synchronized void proceedingsMortar(Procedures treat) {
    availableFile.addLast(treat);
  }

  private synchronized void synx330() {
    flowProcedures.determineLinearBeginning(flowProcedures.obtainScamperingDays() + synX2303int);
    whenLeaving--;

    if (flowProcedures.obtainScamperingDays() == flowProcedures.takeExecutionsDiameter()) {
      flowProcedures.bentPulloutHour(this.producePrevalentScore());
      this.fulfilledMethod.addLast(flowProcedures);
      flowProcedures = (null);
      this.ltsDesignator = (synX2304boolean);
    }

    if (whenLeaving == synX2305int && flowProcedures != null) {

      if (availableFile.isEmpty()) {
        whenLeaving = (DaysQuantitative);
      } else {
        availableFile.addLast(flowProcedures);
        flowProcedures = (null);
        this.ltsDesignator = (synX2306boolean);
      }
    }
  }

  private synchronized void synx331() {
    this.unexhaustedTelaMoment--;

    if (unexhaustedTelaMoment == synX2307int) {
      this.ltsDesignator = (synX2308boolean);
      this.unexhaustedTelaMoment = (Retailer.DeployChance);
    }
  }

  private synchronized void synx332() {

    if (flowProcedures == null && !availableFile.isEmpty()) {
      flowProcedures = (availableFile.removeFirst());
      freightMarch(flowProcedures);
      flowProcedures.arrangeBeganYears(this.producePrevalentScore());
      whenLeaving = (DaysQuantitative);
    }
  }
}
