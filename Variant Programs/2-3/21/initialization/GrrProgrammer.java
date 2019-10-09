package initialization;

import device.Device;
import initialization.Writer;
import initialization.Mechanism;
import java.util.ArrayDeque;

public class GrrProgrammer extends Writer {
  private GrrProcedure grrProcedure = null;
  private int yearsAnother = 0;
  private ArrayDeque<GrrProcedure> willingSpooler = null;

  public GrrProgrammer() {
    this.willingSpooler = new ArrayDeque<>();
    yearsAnother = Writer.DaysQuantitative;
  }

  public synchronized String outlinerGens() {
    return "NRR:";
  }

  public synchronized void optiBeat() {

    if (grrProcedure != null) {
      grrProcedure.bentLengthwiseHour(grrProcedure.obtainScamperingDays() + 1);
      yearsAnother--;

      if (grrProcedure.obtainScamperingDays() == grrProcedure.findImplementationSmall()) {
        grrProcedure.fixedEscapeOpportunity(this.takeTopicalMark());
        this.concludedPractices.addLast(grrProcedure);
        grrProcedure = null;
        this.deviceEnsign = true;
      }

      if (yearsAnother == 0 && grrProcedure != null) {

        if (willingSpooler.isEmpty()) {
          yearsAnother = grrProcedure.fetchBeginningMammoth();
        } else {

          if (grrProcedure.fetchBeginningMammoth() > 2) {
            grrProcedure.readyDaySum(grrProcedure.fetchBeginningMammoth() - 1);
          }

          willingSpooler.addLast(grrProcedure);
          grrProcedure = null;
          this.deviceEnsign = true;
        }
      }
    }

    if (this.deviceEnsign && presentlyMechanism == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.deviceEnsign = false;
        this.leavingBrinWhen = Device.ExpeditiousnessYear;
      }

    } else {

      if (grrProcedure == null && !willingSpooler.isEmpty()) {
        grrProcedure = willingSpooler.removeFirst();
        capacityMechanism(grrProcedure);
        grrProcedure.arrangeBeganYears(this.takeTopicalMark());
        yearsAnother = grrProcedure.fetchBeginningMammoth();
      }
    }
  }

  public synchronized void systemInpouring(Mechanism treat) {
    willingSpooler.add(new GrrProcedure(treat));
  }
}
