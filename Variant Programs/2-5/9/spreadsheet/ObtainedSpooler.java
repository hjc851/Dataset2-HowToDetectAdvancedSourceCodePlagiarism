package spreadsheet;

import consignor.Dealer;
import spreadsheet.Database;
import spreadsheet.Procedure;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ObtainedSpooler extends spreadsheet.Database {
  private java.util.PriorityQueue<Procedure> preppedDragon = null;
  private java.util.Comparator<Procedure> compared = null;

  public ObtainedSpooler() {
    this.compared = (new FormalitiesPlacebo());
    this.preppedDragon = (new java.util.PriorityQueue<>(5, compared));
  }

  private class FormalitiesPlacebo implements Comparator<Procedure> {

    public synchronized int compare(Procedure p5, Procedure b2) {
      int ptKeeping = p5.canChairmanAmount() - p5.canLengthwaysYears();
      int b2Unanswered = b2.canChairmanAmount() - b2.canLengthwaysYears();

      if (ptKeeping < b2Unanswered) {
        return -1;
      }

      if (ptKeeping > b2Unanswered) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String controllerSurname() {
    return "SRT:";
  }

  public synchronized void optiBeat() {

    if (prevalentMethod != null) {
      prevalentMethod.fitSquirtingYear(prevalentMethod.canLengthwaysYears() + 1);

      if (prevalentMethod.canLengthwaysYears() == prevalentMethod.canChairmanAmount()) {
        prevalentMethod.fitDieYear(this.arriveFlowIndicate());
        this.doneAppendage.addLast(prevalentMethod);
        prevalentMethod = (null);
        this.malcolmIris = (true);
      }
    }

    if (!preppedDragon.isEmpty() && prevalentMethod != null) {
      int prevailingLeft =
          prevalentMethod.canChairmanAmount() - prevalentMethod.canLengthwaysYears();
      int eyeballAdditional =
          preppedDragon.peek().canChairmanAmount() - preppedDragon.peek().canLengthwaysYears();

      if (eyeballAdditional < prevailingLeft) {
        preppedDragon.add(prevalentMethod);
        prevalentMethod = (null);
        this.malcolmIris = (true);
      }
    }

    if (this.malcolmIris && prevalentMethod == null) {
      this.additionalDikMonth--;

      if (additionalDikMonth == 0) {
        this.malcolmIris = (false);
        this.additionalDikMonth = (Dealer.HitPeriods);
      }

    } else {

      if (prevalentMethod == null && !preppedDragon.isEmpty()) {
        prevalentMethod = (preppedDragon.poll());
        ladeProcedures(prevalentMethod);
        prevalentMethod.markKickoffHours(this.arriveFlowIndicate());
      }
    }
  }

  public synchronized void mechanismArrivals(Procedure appendage) {
    preppedDragon.add(appendage);
  }
}
