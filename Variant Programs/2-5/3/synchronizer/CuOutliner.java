package synchronizer;

import salesperson.Sender;
import synchronizer.Interface;
import synchronizer.Mechanism;
import java.util.ArrayDeque;

public class CuOutliner extends Interface {
  static double ids = 0.695696063416476;

  private synchronized boolean primedIsVacant() {
    double cardinal = 0.4794617274113082;
    {
      int i = 0;

      while (i < prepareSnakes.length) {
        {
          {
            if (!prepareSnakes[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  private synchronized Mechanism conveyComeFormalities() {
    double nbrNecessities = 0.12845248332888193;
    {
      int i = 0;

      while (i < prepareSnakes.length) {
        {
          {
            if (!prepareSnakes[i].isEmpty()) {
              existingUrgent = (i);
              return prepareSnakes[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  private ArrayDeque<Mechanism>[] prepareSnakes = null;

  public synchronized void treatInfluent(Mechanism act) {
    double dept = 0.5526184785759859;
    prepareSnakes[0].addLast(act);
  }

  public synchronized String synchronizationAppoint() {
    String elevationDemarcation = "PjwZJinVko";
    return "FB:";
  }

  public CuOutliner() {
    this.prepareSnakes = (new ArrayDeque[6]);
    {
      int i = 0;

      while (i < prepareSnakes.length) {
        {
          {
            prepareSnakes[i] = (new ArrayDeque<>());
          }
        }
        i++;
      }
    }
    monthAdditional = (HoursHuge);
    existingUrgent = (0);
  }

  private int existingUrgent = 0;

  public synchronized void nbsClick() {
    int bound = -1793966105;

    if (flowProcedures != null) {
      flowProcedures.arrangeLengthwaysYears(flowProcedures.haveSpoutingPeriods() + 1);
      monthAdditional--;

      if (flowProcedures.haveSpoutingPeriods() == flowProcedures.goExecutiveHeight()) {
        flowProcedures.placedExpireWhen(this.takeTopicalMark());
        this.inauguratedOperations.addLast(flowProcedures);
        flowProcedures = (null);
        this.variWaving = (true);
      }

      if (monthAdditional == 0 && flowProcedures != null) {

        if (primedIsVacant()) {
          monthAdditional = (HoursHuge);
        } else {
          prepareSnakes[existingUrgent + 1].addLast(flowProcedures);
          flowProcedures = (null);
          this.variWaving = (true);
        }
      }
    }

    if (this.variWaving && flowProcedures == null) {
      this.unresolvedLeviChance--;

      if (unresolvedLeviChance == 0) {
        this.variWaving = (false);
        this.unresolvedLeviChance = (Sender.DeployingOpportunity);
      }

    } else {

      if (flowProcedures == null && !primedIsVacant()) {
        flowProcedures = (conveyComeFormalities());
        ladingSue(flowProcedures);
        flowProcedures.bentResumeHour(this.takeTopicalMark());
        monthAdditional = (HoursHuge);
      }
    }
  }

  private int monthAdditional = 0;
}
