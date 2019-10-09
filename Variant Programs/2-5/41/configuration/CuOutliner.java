package configuration;

import responsible.Plenum;
import configuration.Controller;
import configuration.Proceedings;
import java.util.ArrayDeque;

public class CuOutliner extends configuration.Controller {
  public ArrayDeque<Proceedings>[] wantCongestion = null;
  public int clockLeft = 0;
  public int rifePrioritizing = 0;

  public CuOutliner() {
    this.wantCongestion = (new java.util.ArrayDeque[6]);
    {
      int i = 0;

      while (i < wantCongestion.length) {
        {
          synx566(i);
        }
        i++;
      }
    }
    clockLeft = (MomentAmounts);
    rifePrioritizing = (0);
  }

  public synchronized configuration.Proceedings findSucceedingAct() {
    {
      int i = 0;

      while (i < wantCongestion.length) {
        {
          {
            if (!wantCongestion[i].isEmpty()) {
              rifePrioritizing = (i);
              return wantCongestion[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    {
      int i = 0;

      while (i < wantCongestion.length) {
        {
          {
            if (!wantCongestion[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  public synchronized String spreadsheetKey() {
    return "FB:";
  }

  public synchronized void ourTicktack() {

    if (topicalAppendage != null) synx567();

    if (this.burberryTire && topicalAppendage == null) synx568();
    else synx569();
  }

  public synchronized void mechanismArrivals(Proceedings mechanism) {
    wantCongestion[0].addLast(mechanism);
  }

  private synchronized void synx567() {
    topicalAppendage.arrangeLengthwaysYears(topicalAppendage.canLengthwaysYears() + 1);
    clockLeft--;

    if (topicalAppendage.canLengthwaysYears() == topicalAppendage.fixCfoProportions()) {
      topicalAppendage.dictatedLossMeter(this.sustainThisValidation());
      this.executedMethods.addLast(topicalAppendage);
      topicalAppendage = (null);
      this.burberryTire = (true);
    }

    if (clockLeft == 0 && topicalAppendage != null) {

      if (primedIsVacant()) {
        clockLeft = (MomentAmounts);
      } else {
        wantCongestion[rifePrioritizing + 1].addLast(topicalAppendage);
        topicalAppendage = (null);
        this.burberryTire = (true);
      }
    }
  }

  private synchronized void synx568() {
    this.stayLtsHour--;

    if (stayLtsHour == 0) {
      this.burberryTire = (false);
      this.stayLtsHour = (Plenum.SentYears);
    }
  }

  private synchronized void synx569() {

    if (topicalAppendage == null && !primedIsVacant()) {
      topicalAppendage = (findSucceedingAct());
      stowLitigate(topicalAppendage);
      topicalAppendage.rigidOpeningAmount(this.sustainThisValidation());
      clockLeft = (MomentAmounts);
    }
  }
}
