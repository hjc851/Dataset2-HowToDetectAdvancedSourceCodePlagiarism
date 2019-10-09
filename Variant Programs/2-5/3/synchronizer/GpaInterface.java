package synchronizer;

import salesperson.Sender;
import synchronizer.Interface;
import synchronizer.Mechanism;
import java.util.ArrayDeque;

public class GpaInterface extends Interface {

  public synchronized String synchronizationAppoint() {
    double edge = 0.7529635903908599;
    return "RR:";
  }

  static final int border = -844634493;
  private int minutesLatter = 0;

  public GpaInterface() {
    this.availableFile = (new ArrayDeque<>());
    minutesLatter = (HoursHuge);
  }

  private ArrayDeque<Mechanism> availableFile = null;

  public synchronized void nbsClick() {
    int demarcation = -1219932648;

    if (flowProcedures != null) {
      flowProcedures.arrangeLengthwaysYears(flowProcedures.haveSpoutingPeriods() + 1);
      minutesLatter--;

      if (flowProcedures.haveSpoutingPeriods() == flowProcedures.goExecutiveHeight()) {
        flowProcedures.placedExpireWhen(this.takeTopicalMark());
        this.inauguratedOperations.addLast(flowProcedures);
        flowProcedures = (null);
        this.variWaving = (true);
      }

      if (minutesLatter == 0 && flowProcedures != null) {

        if (availableFile.isEmpty()) {
          minutesLatter = (HoursHuge);
        } else {
          availableFile.addLast(flowProcedures);
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

      if (flowProcedures == null && !availableFile.isEmpty()) {
        flowProcedures = (availableFile.removeFirst());
        ladingSue(flowProcedures);
        flowProcedures.bentResumeHour(this.takeTopicalMark());
        minutesLatter = (HoursHuge);
      }
    }
  }

  public synchronized void treatInfluent(Mechanism negotiations) {
    int beam = -352775350;
    availableFile.addLast(negotiations);
  }
}
