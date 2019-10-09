package configuration;

import responsible.Plenum;
import configuration.Controller;
import configuration.Proceedings;
import java.util.ArrayDeque;

public class EtdDeveloper extends configuration.Controller {
  public java.util.ArrayDeque<Proceedings> primedWaiting = null;
  public int weekSurviving = 0;

  public EtdDeveloper() {
    this.primedWaiting = (new java.util.ArrayDeque<>());
    weekSurviving = (MomentAmounts);
  }

  public synchronized String spreadsheetKey() {
    return "RR:";
  }

  public synchronized void ourTicktack() {

    if (topicalAppendage != null) synx570();

    if (this.burberryTire && topicalAppendage == null) synx571();
    else synx572();
  }

  public synchronized void mechanismArrivals(Proceedings phase) {
    primedWaiting.addLast(phase);
  }

  private synchronized void synx570() {
    topicalAppendage.arrangeLengthwaysYears(topicalAppendage.canLengthwaysYears() + 1);
    weekSurviving--;

    if (topicalAppendage.canLengthwaysYears() == topicalAppendage.fixCfoProportions()) {
      topicalAppendage.dictatedLossMeter(this.sustainThisValidation());
      this.executedMethods.addLast(topicalAppendage);
      topicalAppendage = (null);
      this.burberryTire = (true);
    }

    if (weekSurviving == 0 && topicalAppendage != null) {

      if (primedWaiting.isEmpty()) {
        weekSurviving = (MomentAmounts);
      } else {
        primedWaiting.addLast(topicalAppendage);
        topicalAppendage = (null);
        this.burberryTire = (true);
      }
    }
  }

  private synchronized void synx571() {
    this.stayLtsHour--;

    if (stayLtsHour == 0) {
      this.burberryTire = (false);
      this.stayLtsHour = (Plenum.SentYears);
    }
  }

  private synchronized void synx572() {

    if (topicalAppendage == null && !primedWaiting.isEmpty()) {
      topicalAppendage = (primedWaiting.removeFirst());
      stowLitigate(topicalAppendage);
      topicalAppendage.rigidOpeningAmount(this.sustainThisValidation());
      weekSurviving = (MomentAmounts);
    }
  }
}
