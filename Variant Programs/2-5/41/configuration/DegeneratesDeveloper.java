package configuration;

import responsible.Plenum;
import configuration.Controller;
import configuration.Proceedings;
import java.util.ArrayDeque;

public class DegeneratesDeveloper extends configuration.Controller {
  public java.util.ArrayDeque<Proceedings> willingSpooler = null;

  public DegeneratesDeveloper() {
    this.willingSpooler = (new java.util.ArrayDeque<>());
  }

  public synchronized String spreadsheetKey() {
    return "FCFS:";
  }

  public synchronized void ourTicktack() {

    if (topicalAppendage != null) synx577();

    if (this.burberryTire && topicalAppendage == null) synx578();
    else synx579();
  }

  public synchronized void mechanismArrivals(Proceedings methods) {
    willingSpooler.addLast(methods);
  }

  private synchronized void synx577() {
    topicalAppendage.arrangeLengthwaysYears(topicalAppendage.canLengthwaysYears() + 1);

    if (topicalAppendage.canLengthwaysYears() == topicalAppendage.fixCfoProportions()) {
      topicalAppendage.dictatedLossMeter(this.sustainThisValidation());
      this.executedMethods.addLast(topicalAppendage);
      topicalAppendage = (null);
      this.burberryTire = (true);
    }
  }

  private synchronized void synx578() {
    this.stayLtsHour--;

    if (stayLtsHour == 0) {
      this.burberryTire = (false);
      this.stayLtsHour = (Plenum.SentYears);
    }
  }

  private synchronized void synx579() {

    if (topicalAppendage == null && !willingSpooler.isEmpty()) {
      topicalAppendage = (willingSpooler.removeFirst());
      topicalAppendage.rigidOpeningAmount(this.sustainThisValidation());
      stowLitigate(topicalAppendage);
    }
  }
}
