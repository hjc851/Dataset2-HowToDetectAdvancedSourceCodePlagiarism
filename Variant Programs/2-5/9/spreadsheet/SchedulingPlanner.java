package spreadsheet;

import consignor.Dealer;
import spreadsheet.Database;
import spreadsheet.Procedure;
import java.util.ArrayDeque;

public class SchedulingPlanner extends spreadsheet.Database {
  private static final boolean synX868boolean = false;
  private static final int synX867int = 0;
  private static final boolean synX866boolean = true;
  private static final int synX865int = 1;
  private static final String synX864String = "FCFS:";
  private java.util.ArrayDeque<Procedure> cookCue = null;

  public SchedulingPlanner() {
    this.cookCue = (new java.util.ArrayDeque<>());
  }

  public synchronized String controllerSurname() {
    return synX864String;
  }

  public synchronized void optiBeat() {

    if (prevalentMethod != null) {
      prevalentMethod.fitSquirtingYear(prevalentMethod.canLengthwaysYears() + synX865int);

      if (prevalentMethod.canLengthwaysYears() == prevalentMethod.canChairmanAmount()) {
        prevalentMethod.fitDieYear(this.arriveFlowIndicate());
        this.doneAppendage.addLast(prevalentMethod);
        prevalentMethod = (null);
        this.malcolmIris = (synX866boolean);
      }
    }

    if (this.malcolmIris && prevalentMethod == null) {
      this.additionalDikMonth--;

      if (additionalDikMonth == synX867int) {
        this.malcolmIris = (synX868boolean);
        this.additionalDikMonth = (Dealer.HitPeriods);
      }

    } else {

      if (prevalentMethod == null && !cookCue.isEmpty()) {
        prevalentMethod = (cookCue.removeFirst());
        prevalentMethod.markKickoffHours(this.arriveFlowIndicate());
        ladeProcedures(prevalentMethod);
      }
    }
  }

  public synchronized void mechanismArrivals(Procedure summons) {
    cookCue.addLast(summons);
  }
}
