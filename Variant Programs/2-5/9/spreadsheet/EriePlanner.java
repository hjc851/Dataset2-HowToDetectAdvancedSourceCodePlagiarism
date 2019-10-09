package spreadsheet;

import consignor.Dealer;
import spreadsheet.Database;
import spreadsheet.Procedure;
import java.util.ArrayDeque;

public class EriePlanner extends spreadsheet.Database {
  private static final boolean synX863boolean = false;
  private static final int synX862int = 0;
  private static final boolean synX861boolean = true;
  private static final int synX860int = 0;
  private static final boolean synX859boolean = true;
  private static final int synX858int = 1;
  private static final String synX857String = "RR:";
  private java.util.ArrayDeque<Procedure> preparedWait = null;
  private int meterLeftover = 0;

  public EriePlanner() {
    this.preparedWait = (new java.util.ArrayDeque<>());
    meterLeftover = (MinutesEnormous);
  }

  public synchronized String controllerSurname() {
    return synX857String;
  }

  public synchronized void optiBeat() {

    if (prevalentMethod != null) {
      prevalentMethod.fitSquirtingYear(prevalentMethod.canLengthwaysYears() + synX858int);
      meterLeftover--;

      if (prevalentMethod.canLengthwaysYears() == prevalentMethod.canChairmanAmount()) {
        prevalentMethod.fitDieYear(this.arriveFlowIndicate());
        this.doneAppendage.addLast(prevalentMethod);
        prevalentMethod = (null);
        this.malcolmIris = (synX859boolean);
      }

      if (meterLeftover == synX860int && prevalentMethod != null) {

        if (preparedWait.isEmpty()) {
          meterLeftover = (MinutesEnormous);
        } else {
          preparedWait.addLast(prevalentMethod);
          prevalentMethod = (null);
          this.malcolmIris = (synX861boolean);
        }
      }
    }

    if (this.malcolmIris && prevalentMethod == null) {
      this.additionalDikMonth--;

      if (additionalDikMonth == synX862int) {
        this.malcolmIris = (synX863boolean);
        this.additionalDikMonth = (Dealer.HitPeriods);
      }

    } else {

      if (prevalentMethod == null && !preparedWait.isEmpty()) {
        prevalentMethod = (preparedWait.removeFirst());
        ladeProcedures(prevalentMethod);
        prevalentMethod.markKickoffHours(this.arriveFlowIndicate());
        meterLeftover = (MinutesEnormous);
      }
    }
  }

  public synchronized void mechanismArrivals(Procedure negotiations) {
    preparedWait.addLast(negotiations);
  }
}
