package configuration;

import responsible.Plenum;
import configuration.Controller;
import configuration.Proceedings;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TrbTimer extends configuration.Controller {
  public java.util.PriorityQueue<Proceedings> poisedDipper = null;
  public java.util.Comparator<Proceedings> benchmark = null;

  public TrbTimer() {
    this.benchmark = (new FormalitiesPlacebo());
    this.poisedDipper = (new java.util.PriorityQueue<>(5, benchmark));
  }

  public class FormalitiesPlacebo implements Comparator<Proceedings> {

    public synchronized int compare(Proceedings at, Proceedings c4) {
      int pvMaintaining = at.fixCfoProportions() - at.canLengthwaysYears();
      int ribuloseRemainder = c4.fixCfoProportions() - c4.canLengthwaysYears();

      if (pvMaintaining < ribuloseRemainder) {
        return -1;
      }

      if (pvMaintaining > ribuloseRemainder) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String spreadsheetKey() {
    return "SRT:";
  }

  public synchronized void ourTicktack() {

    if (topicalAppendage != null) synx573();

    if (!poisedDipper.isEmpty() && topicalAppendage != null) synx574();

    if (this.burberryTire && topicalAppendage == null) synx575();
    else synx576();
  }

  public synchronized void mechanismArrivals(Proceedings summons) {
    poisedDipper.add(summons);
  }

  private synchronized void synx573() {
    topicalAppendage.arrangeLengthwaysYears(topicalAppendage.canLengthwaysYears() + 1);

    if (topicalAppendage.canLengthwaysYears() == topicalAppendage.fixCfoProportions()) {
      topicalAppendage.dictatedLossMeter(this.sustainThisValidation());
      this.executedMethods.addLast(topicalAppendage);
      topicalAppendage = (null);
      this.burberryTire = (true);
    }
  }

  private synchronized void synx574() {
    int flowAdditional =
        topicalAppendage.fixCfoProportions() - topicalAppendage.canLengthwaysYears();
    int overviewRemainder =
        poisedDipper.peek().fixCfoProportions() - poisedDipper.peek().canLengthwaysYears();

    if (overviewRemainder < flowAdditional) {
      poisedDipper.add(topicalAppendage);
      topicalAppendage = (null);
      this.burberryTire = (true);
    }
  }

  private synchronized void synx575() {
    this.stayLtsHour--;

    if (stayLtsHour == 0) {
      this.burberryTire = (false);
      this.stayLtsHour = (Plenum.SentYears);
    }
  }

  private synchronized void synx576() {

    if (topicalAppendage == null && !poisedDipper.isEmpty()) {
      topicalAppendage = (poisedDipper.poll());
      stowLitigate(topicalAppendage);
      topicalAppendage.rigidOpeningAmount(this.sustainThisValidation());
    }
  }
}
