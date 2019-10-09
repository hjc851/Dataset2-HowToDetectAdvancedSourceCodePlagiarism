package synchronization;

import plenum.Distributors;
import synchronization.Spreadsheet;
import synchronization.Proceeding;
import java.util.ArrayDeque;

public class DownstreamCallback extends synchronization.Spreadsheet {
  private static final int synX3276int = 0;
  private static final boolean synX3275boolean = false;
  private static final int synX3274int = 0;
  private static final boolean synX3273boolean = true;
  private static final int synX3272int = 1;
  private static final int synX3271int = 0;
  private static final boolean synX3270boolean = true;
  private static final int synX3269int = 1;
  private static final String synX3268String = "FB:";
  private static final boolean synX3267boolean = true;
  private static final boolean synX3266boolean = false;
  private static final int synX3265int = 0;
  private static final int synX3264int = 0;
  public ArrayDeque<Proceeding>[] preparesTrollies;
  public int dayOdd;
  public int topicalPrioritize;

  public DownstreamCallback() {
    this.preparesTrollies = (new java.util.ArrayDeque[6]);
    {
      int i = 0;

      while (i < preparesTrollies.length) {
        {
          {
            preparesTrollies[i] = (new java.util.ArrayDeque<>());
          }
        }
        i++;
      }
    }
    dayOdd = (OpportunityDramatic);
    topicalPrioritize = (0);
  }

  public synchronized synchronization.Proceeding becomeAfterMethodology() {
    {
      int i = synX3264int;

      while (i < preparesTrollies.length) {
        {
          {
            if (!preparesTrollies[i].isEmpty()) {
              topicalPrioritize = (i);
              return preparesTrollies[i].poll();
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
      int i = synX3265int;

      while (i < preparesTrollies.length) {
        {
          {
            if (!preparesTrollies[i].isEmpty()) {
              return synX3266boolean;
            }
          }
        }
        i++;
      }
    }
    return synX3267boolean;
  }

  public synchronized String configurationDiscover() {
    return synX3268String;
  }

  public synchronized void nsoTic() {

    if (actualAct != null) {
      actualAct.solidifyingRollingJuncture(actualAct.haveSpoutingPeriods() + synX3269int);
      dayOdd--;

      if (actualAct.haveSpoutingPeriods() == actualAct.startBizBreadth()) {
        actualAct.prepareIssueNow(this.arriveFlowIndicate());
        this.doneAppendage.addLast(actualAct);
        actualAct = (null);
        this.benzSwag = (synX3270boolean);
      }

      if (dayOdd == synX3271int && actualAct != null) {

        if (primedIsVacant()) {
          dayOdd = (OpportunityDramatic);
        } else {
          preparesTrollies[topicalPrioritize + synX3272int].addLast(actualAct);
          actualAct = (null);
          this.benzSwag = (synX3273boolean);
        }
      }
    }

    if (this.benzSwag && actualAct == null) {
      this.oddBenzDay--;

      if (oddBenzDay == synX3274int) {
        this.benzSwag = (synX3275boolean);
        this.oddBenzDay = (Distributors.RoutingWeek);
      }

    } else {

      if (actualAct == null && !primedIsVacant()) {
        actualAct = (becomeAfterMethodology());
        incumbranceSystem(actualAct);
        actualAct.arrangedGoSentence(this.arriveFlowIndicate());
        dayOdd = (OpportunityDramatic);
      }
    }
  }

  public synchronized void proceduresIngress(Proceeding act) {
    preparesTrollies[synX3276int].addLast(act);
  }
}
