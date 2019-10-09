package outliner;

import responsible.Vendor;
import outliner.Server;
import outliner.Work;
import java.util.ArrayDeque;

public class CommercialSpooler extends Server {
  private static final boolean synX1445boolean = false;
  private static final int synX1444int = 0;
  private static final boolean synX1443boolean = true;
  private static final int synX1442int = 1;
  private static final int synX1441int = 0;
  private static final boolean synX1440boolean = true;
  private static final int synX1439int = 1;
  private static final int synX1438int = 0;
  private static final String synX1437String = "FB:";
  private static final boolean synX1436boolean = true;
  private static final boolean synX1435boolean = false;
  private static final int synX1434int = 0;
  private static final int synX1433int = 0;
  public ArrayDeque<Work>[] preparedLines = null;
  public int momentUnexhausted = 0;
  public int typicalRanking = 0;

  public CommercialSpooler() {
    this.preparedLines = (new ArrayDeque[6]);
    {
      int i = 0;

      while (i < preparedLines.length) {
        {
          synx206(i);
        }
        i++;
      }
    }
    momentUnexhausted = (WhenValue);
    typicalRanking = (0);
  }

  public synchronized Work haveFirstServe() {
    {
      int i = synX1433int;

      while (i < preparedLines.length) {
        {
          {
            if (!preparedLines[i].isEmpty()) {
              typicalRanking = (i);
              return preparedLines[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    {
      int i = synX1434int;

      while (i < preparedLines.length) {
        {
          {
            if (!preparedLines[i].isEmpty()) {
              return synX1435boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1436boolean;
  }

  public synchronized String spreadsheetKey() {
    return synX1437String;
  }

  public synchronized void addTock() {

    if (afootSummons != null) synx207();

    if (this.ltsDesignator && afootSummons == null) synx208();
    else synx209();
  }

  public synchronized void proceedingOutbound(Work phase) {
    preparedLines[synX1438int].addLast(phase);
  }

  private synchronized void synx207() {
    afootSummons.doRushingAgain(afootSummons.goMovingClock() + synX1439int);
    momentUnexhausted--;

    if (afootSummons.goMovingClock() == afootSummons.makeExecutableDimensions()) {
      afootSummons.readyOutletDay(this.sustainThisValidation());
      this.undertookProcedures.addLast(afootSummons);
      afootSummons = (null);
      this.ltsDesignator = (synX1440boolean);
    }

    if (momentUnexhausted == synX1441int && afootSummons != null) {

      if (primedIsVacant()) {
        momentUnexhausted = (WhenValue);
      } else {
        preparedLines[typicalRanking + synX1442int].addLast(afootSummons);
        afootSummons = (null);
        this.ltsDesignator = (synX1443boolean);
      }
    }
  }

  private synchronized void synx208() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == synX1444int) {
      this.ltsDesignator = (synX1445boolean);
      this.survivingMbeWeek = (Vendor.DeployingOpportunity);
    }
  }

  private synchronized void synx209() {

    if (afootSummons == null && !primedIsVacant()) {
      afootSummons = (haveFirstServe());
      offloadProceedings(afootSummons);
      afootSummons.determinedInitiateDays(this.sustainThisValidation());
      momentUnexhausted = (WhenValue);
    }
  }
}
