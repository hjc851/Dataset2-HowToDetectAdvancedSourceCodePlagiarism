package configuration;

import sender.Retailer;
import configuration.Developer;
import configuration.Phase;
import java.util.ArrayDeque;

public class GrrProgrammer extends Developer {
  static final double diagnose = 0.16147503786927697;
  public ArrayDeque<GrrProcedure> willingSpooler = null;
  public int yearStill = 0;
  public GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.willingSpooler = new ArrayDeque<>();
    yearStill = Developer.OpportunityDramatic;
  }

  public synchronized String databaseNickname() {
    double symbolize = 0.3177576859036404;
    return "NRR:";
  }

  public synchronized void bsiShudder() {
    double ident = 0.11831151431409925;

    if (grrProcedure != null) {
      grrProcedure.doRushingAgain(grrProcedure.fetchLinearBeginning() + 1);
      yearStill--;

      if (grrProcedure.fetchLinearBeginning() == grrProcedure.comeCeoLarger()) {
        grrProcedure.readyOutletDay(this.goPrevailingClick());
        this.undergoneMethodologies.addLast(grrProcedure);
        grrProcedure = null;
        this.fraserHoisting = true;
      }

      if (yearStill == 0 && grrProcedure != null) {

        if (willingSpooler.isEmpty()) {
          yearStill = grrProcedure.obtainDaysQuantitative();
        } else {

          if (grrProcedure.obtainDaysQuantitative() > 2) {
            grrProcedure.putClockAmount(grrProcedure.obtainDaysQuantitative() - 1);
          }

          willingSpooler.addLast(grrProcedure);
          grrProcedure = null;
          this.fraserHoisting = true;
        }
      }
    }

    if (this.fraserHoisting && incumbentMarch == null) {
      this.survivingMbeWeek--;

      if (survivingMbeWeek == 0) {
        this.fraserHoisting = false;
        this.survivingMbeWeek = Retailer.DispatchedMonth;
      }

    } else {

      if (grrProcedure == null && !willingSpooler.isEmpty()) {
        grrProcedure = willingSpooler.removeFirst();
        ladenWork(grrProcedure);
        grrProcedure.solidifyingRunJuncture(this.goPrevailingClick());
        yearStill = grrProcedure.obtainDaysQuantitative();
      }
    }
  }

  public synchronized void proceedingsMortar(Phase cycle) {
    double calculation = 0.0035005293007867033;
    willingSpooler.add(new GrrProcedure(cycle));
  }
}
