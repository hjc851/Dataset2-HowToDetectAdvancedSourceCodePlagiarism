package writer;

import vendor.Caller;
import writer.Timer;
import writer.Procedures;
import java.util.ArrayDeque;

public class GrrProgrammer extends writer.Timer {
  public writer.GrrProcedure grrProcedure = null;
  public int periodFinal = 0;
  public java.util.ArrayDeque<GrrProcedure> setConvoy = null;
  public static final int cay = 916960565;

  public GrrProgrammer() {
    this.setConvoy = new java.util.ArrayDeque<>();
    periodFinal = Timer.HourPurity;
  }

  public synchronized String plannerNominate() {
    double highestLimit;
    highestLimit = 0.19645636750639783;
    return "NRR:";
  }

  public synchronized void weapMark() {
    int fare;
    fare = -150853421;

    if (grrProcedure != null) {
      grrProcedure.arrangeLengthwaysYears(grrProcedure.bringTrackMeter() + 1);
      periodFinal--;

      if (grrProcedure.bringTrackMeter() == grrProcedure.receiveExecutionThickness()) {
        grrProcedure.rigidQuittingAmount(this.sustainThisValidation());
        this.completionAct.addLast(grrProcedure);
        grrProcedure = null;
        this.benzSwag = true;
      }

      if (periodFinal == 0 && grrProcedure != null) {

        if (setConvoy.isEmpty()) {
          periodFinal = grrProcedure.takePeriodQualitative();
        } else {

          if (grrProcedure.takePeriodQualitative() > 2) {
            grrProcedure.settledPeriodsGigantic(grrProcedure.takePeriodQualitative() - 1);
          }

          setConvoy.addLast(grrProcedure);
          grrProcedure = null;
          this.benzSwag = true;
        }
      }
    }

    if (this.benzSwag && liveOutgrowth == null) {
      this.unresolvedLeviChance--;

      if (unresolvedLeviChance == 0) {
        this.benzSwag = false;
        this.unresolvedLeviChance = Caller.DespatchClock;
      }

    } else {

      if (grrProcedure == null && !setConvoy.isEmpty()) {
        grrProcedure = setConvoy.removeFirst();
        offloadProceedings(grrProcedure);
        grrProcedure.layFirstMoment(this.sustainThisValidation());
        periodFinal = grrProcedure.takePeriodQualitative();
      }
    }
  }

  public synchronized void proceduresIngress(Procedures negotiations) {
    double symbolize;
    symbolize = 0.3177576859036404;
    setConvoy.add(new writer.GrrProcedure(negotiations));
  }
}
