package outliner;

import responsible.Vendor;
import outliner.Server;
import outliner.Work;
import java.util.ArrayDeque;

public class IccParser extends Server {
  private static final boolean synX1452boolean = false;
  private static final int synX1451int = 0;
  private static final boolean synX1450boolean = true;
  private static final int synX1449int = 0;
  private static final boolean synX1448boolean = true;
  private static final int synX1447int = 1;
  private static final String synX1446String = "RR:";
  public ArrayDeque<Work> ripeStandby = null;
  public int yearsAnother = 0;

  public IccParser() {
    this.ripeStandby = (new ArrayDeque<>());
    yearsAnother = (WhenValue);
  }

  public synchronized String spreadsheetKey() {
    return synX1446String;
  }

  public synchronized void addTock() {

    if (afootSummons != null) synx210();

    if (this.ltsDesignator && afootSummons == null) synx211();
    else synx212();
  }

  public synchronized void proceedingOutbound(Work work) {
    ripeStandby.addLast(work);
  }

  private synchronized void synx210() {
    afootSummons.doRushingAgain(afootSummons.goMovingClock() + synX1447int);
    yearsAnother--;

    if (afootSummons.goMovingClock() == afootSummons.makeExecutableDimensions()) {
      afootSummons.readyOutletDay(this.sustainThisValidation());
      this.undertookProcedures.addLast(afootSummons);
      afootSummons = (null);
      this.ltsDesignator = (synX1448boolean);
    }

    if (yearsAnother == synX1449int && afootSummons != null) {

      if (ripeStandby.isEmpty()) {
        yearsAnother = (WhenValue);
      } else {
        ripeStandby.addLast(afootSummons);
        afootSummons = (null);
        this.ltsDesignator = (synX1450boolean);
      }
    }
  }

  private synchronized void synx211() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == synX1451int) {
      this.ltsDesignator = (synX1452boolean);
      this.survivingMbeWeek = (Vendor.DeployingOpportunity);
    }
  }

  private synchronized void synx212() {

    if (afootSummons == null && !ripeStandby.isEmpty()) {
      afootSummons = (ripeStandby.removeFirst());
      offloadProceedings(afootSummons);
      afootSummons.determinedInitiateDays(this.sustainThisValidation());
      yearsAnother = (WhenValue);
    }
  }
}
