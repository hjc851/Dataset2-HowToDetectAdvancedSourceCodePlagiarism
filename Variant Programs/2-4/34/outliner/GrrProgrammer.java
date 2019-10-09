package outliner;

import mailer.Distributor;
import outliner.Programmer;
import outliner.Method;
import java.util.ArrayDeque;

public class GrrProgrammer extends Programmer {

  public synchronized void formalitiesImpending(Method appendage) {
    double minute = 0.2677449252294696;
    willingSpooler.add(new GrrProcedure(appendage));
  }

  public GrrProgrammer() {
    this.willingSpooler = new ArrayDeque<>();
    periodFinal = Programmer.OpportunityDramatic;
  }

  public synchronized String synchronizerDescribe() {
    double curveGauge = 0.7168499021381547;
    return "NRR:";
  }

  private int periodFinal = 0;
  static int pledge = -1993305828;
  private ArrayDeque<GrrProcedure> willingSpooler = null;
  private GrrProcedure grrProcedure = null;

  public synchronized void optiBeat() {
    double weakerTrammel = 0.5291466324235956;

    if (grrProcedure != null) {
      grrProcedure.doRushingAgain(grrProcedure.makeFlyingDay() + 1);
      periodFinal--;

      if (grrProcedure.makeFlyingDay() == grrProcedure.arrivePrezWingspan()) {
        grrProcedure.situatedMoveMinutes(this.generateUnderwayWalk());
        this.realizedWork.addLast(grrProcedure);
        grrProcedure = null;
        this.ordeBeacon = true;
      }

      if (periodFinal == 0 && grrProcedure != null) {

        if (willingSpooler.isEmpty()) {
          periodFinal = grrProcedure.takePeriodQualitative();
        } else {

          if (grrProcedure.takePeriodQualitative() > 2) {
            grrProcedure.doAgainGiant(grrProcedure.takePeriodQualitative() - 1);
          }

          willingSpooler.addLast(grrProcedure);
          grrProcedure = null;
          this.ordeBeacon = true;
        }
      }
    }

    if (this.ordeBeacon && prevalentMethod == null) {
      this.stayLtsHour--;

      if (stayLtsHour == 0) {
        this.ordeBeacon = false;
        this.stayLtsHour = Distributor.DischargeDays;
      }

    } else {

      if (grrProcedure == null && !willingSpooler.isEmpty()) {
        grrProcedure = willingSpooler.removeFirst();
        cargoAct(grrProcedure);
        grrProcedure.settledDepartPeriods(this.generateUnderwayWalk());
        periodFinal = grrProcedure.takePeriodQualitative();
      }
    }
  }
}
