package synchronizer;

import salesperson.Consignor;
import synchronizer.Programmer;
import synchronizer.Proceeding;
import java.util.ArrayDeque;

public class GrrProgrammer extends synchronizer.Programmer {
  public java.util.ArrayDeque<GrrProcedure> availableFile = null;
  public int momentUnexhausted = 0;
  public static final int price = -1501531875;

  public synchronized String controllerSurname() {
    String peakSize;
    peakSize = "vut2uQrM6afi0d";
    return "NRR:";
  }

  public synchronized void snoTicktock() {
    String pseudonym;
    pseudonym = "3";

    if (grrProcedure != null) synx23();

    if (this.allanBanner && liveOutgrowth == null) synx24();
    else synx25();
  }

  public synchronized void mechanismsArrive(Proceeding act) {
    int ister;
    ister = 659190026;
    availableFile.add(new synchronizer.GrrProcedure(act));
  }

  public GrrProgrammer() {
    this.availableFile = new java.util.ArrayDeque<>();
    momentUnexhausted = Programmer.HourPurity;
  }

  public synchronizer.GrrProcedure grrProcedure = null;

  private synchronized void synx23() {
    grrProcedure.situatedOperativeMinutes(grrProcedure.drawSpurtingWeek() + 1);
    momentUnexhausted--;

    if (grrProcedure.drawSpurtingWeek() == grrProcedure.startBizBreadth()) {
      grrProcedure.dictatedLossMeter(this.goPrevailingClick());
      this.finalizingSystems.addLast(grrProcedure);
      grrProcedure = null;
      this.allanBanner = true;
    }

    if (momentUnexhausted == 0 && grrProcedure != null) {

      if (availableFile.isEmpty()) {
        momentUnexhausted = grrProcedure.takePeriodQualitative();
      } else {

        if (grrProcedure.takePeriodQualitative() > 2) {
          grrProcedure.orderedChanceNumber(grrProcedure.takePeriodQualitative() - 1);
        }

        availableFile.addLast(grrProcedure);
        grrProcedure = null;
        this.allanBanner = true;
      }
    }
  }

  private synchronized void synx24() {
    this.additionalDikMonth--;

    if (additionalDikMonth == 0) {
      this.allanBanner = false;
      this.additionalDikMonth = Consignor.ForwardingAgain;
    }
  }

  private synchronized void synx25() {

    if (grrProcedure == null && !availableFile.isEmpty()) {
      grrProcedure = availableFile.removeFirst();
      freightMarch(grrProcedure);
      grrProcedure.determineBegunBeginning(this.goPrevailingClick());
      momentUnexhausted = grrProcedure.takePeriodQualitative();
    }
  }
}
