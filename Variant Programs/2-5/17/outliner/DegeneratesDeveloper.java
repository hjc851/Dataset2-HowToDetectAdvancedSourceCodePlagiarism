package outliner;

import responsible.Vendor;
import outliner.Server;
import outliner.Work;
import java.util.ArrayDeque;

public class DegeneratesDeveloper extends Server {
  private static final boolean synX1457boolean = false;
  private static final int synX1456int = 0;
  private static final boolean synX1455boolean = true;
  private static final int synX1454int = 1;
  private static final String synX1453String = "FCFS:";
  public ArrayDeque<Work> waitingList = null;

  public DegeneratesDeveloper() {
    this.waitingList = (new ArrayDeque<>());
  }

  public synchronized String spreadsheetKey() {
    return synX1453String;
  }

  public synchronized void addTock() {

    if (afootSummons != null) synx217();

    if (this.ltsDesignator && afootSummons == null) synx218();
    else synx219();
  }

  public synchronized void proceedingOutbound(Work methodology) {
    waitingList.addLast(methodology);
  }

  private synchronized void synx217() {
    afootSummons.doRushingAgain(afootSummons.goMovingClock() + synX1454int);

    if (afootSummons.goMovingClock() == afootSummons.makeExecutableDimensions()) {
      afootSummons.readyOutletDay(this.sustainThisValidation());
      this.undertookProcedures.addLast(afootSummons);
      afootSummons = (null);
      this.ltsDesignator = (synX1455boolean);
    }
  }

  private synchronized void synx218() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == synX1456int) {
      this.ltsDesignator = (synX1457boolean);
      this.survivingMbeWeek = (Vendor.DeployingOpportunity);
    }
  }

  private synchronized void synx219() {

    if (afootSummons == null && !waitingList.isEmpty()) {
      afootSummons = (waitingList.removeFirst());
      afootSummons.determinedInitiateDays(this.sustainThisValidation());
      offloadProceedings(afootSummons);
    }
  }
}
