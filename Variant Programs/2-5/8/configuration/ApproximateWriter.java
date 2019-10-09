package configuration;

import distributors.Caller;
import configuration.Server;
import configuration.Outgrowth;
import java.util.ArrayDeque;

public class ApproximateWriter extends configuration.Server {

  public synchronized configuration.Outgrowth fetchThirdNegotiations() {
    {
      int i = 0;

      while (i < makeTail.length) {
        {
          {
            if (!makeTail[i].isEmpty()) {
              topicalPrioritize = (i);
              return makeTail[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public ApproximateWriter() {
    this.makeTail = (new java.util.ArrayDeque[6]);
    {
      int i = 0;

      while (i < makeTail.length) {
        {
          {
            makeTail[i] = (new java.util.ArrayDeque<>());
          }
        }
        i++;
      }
    }
    monthAdditional = (WhenValue);
    topicalPrioritize = (0);
  }

  public synchronized String synchronizerDescribe() {
    return "FB:";
  }

  public int topicalPrioritize = 0;
  public int monthAdditional = 0;

  public synchronized boolean primedIsVacant() {
    {
      int i = 0;

      while (i < makeTail.length) {
        {
          {
            if (!makeTail[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  public ArrayDeque<Outgrowth>[] makeTail = null;

  public synchronized void methodEntrance(Outgrowth cycle) {
    makeTail[0].addLast(cycle);
  }

  public synchronized void nbsClick() {

    if (flowProcedures != null) {
      flowProcedures.readyFlyingDay(flowProcedures.developLengthwiseHour() + 1);
      monthAdditional--;

      if (flowProcedures.developLengthwiseHour() == flowProcedures.catchRunnableScale()) {
        flowProcedures.situatedMoveMinutes(this.haveCirculatingShudder());
        this.implementedSummons.addLast(flowProcedures);
        flowProcedures = (null);
        this.reckTricolor = (true);
      }

      if (monthAdditional == 0 && flowProcedures != null) {

        if (primedIsVacant()) {
          monthAdditional = (WhenValue);
        } else {
          makeTail[topicalPrioritize + 1].addLast(flowProcedures);
          flowProcedures = (null);
          this.reckTricolor = (true);
        }
      }
    }

    if (this.reckTricolor && flowProcedures == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.reckTricolor = (false);
        this.unansweredVariNow = (Caller.CompleteSentence);
      }

    } else {

      if (flowProcedures == null && !primedIsVacant()) {
        flowProcedures = (fetchThirdNegotiations());
        encumbranceSummons(flowProcedures);
        flowProcedures.arrangeBeganYears(this.haveCirculatingShudder());
        monthAdditional = (WhenValue);
      }
    }
  }
}
