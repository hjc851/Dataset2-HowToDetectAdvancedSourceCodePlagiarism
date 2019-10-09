package spreadsheet;

import consignor.Dealer;
import spreadsheet.Database;
import spreadsheet.Procedure;
import java.util.ArrayDeque;

public class FiaMultitasking extends spreadsheet.Database {
  private static final int synX856int = 0;
  private static final boolean synX855boolean = false;
  private static final int synX854int = 0;
  private static final boolean synX853boolean = true;
  private static final int synX852int = 1;
  private static final int synX851int = 0;
  private static final boolean synX850boolean = true;
  private static final int synX849int = 1;
  private static final String synX848String = "FB:";
  private static final boolean synX847boolean = true;
  private static final boolean synX846boolean = false;
  private static final int synX845int = 0;
  private static final int synX844int = 0;
  private ArrayDeque<Procedure>[] gonnaCarpark = null;
  private int hourStay = 0;
  private int previousObjective = 0;

  public FiaMultitasking() {
    this.gonnaCarpark = (new java.util.ArrayDeque[6]);
    {
      int i = 0;

      while (i < gonnaCarpark.length) {
        {
          {
            gonnaCarpark[i] = (new java.util.ArrayDeque<>());
          }
        }
        i++;
      }
    }
    hourStay = (MinutesEnormous);
    previousObjective = (0);
  }

  private synchronized spreadsheet.Procedure catchUpcomingSue() {
    {
      int i = synX844int;

      while (i < gonnaCarpark.length) {
        {
          {
            if (!gonnaCarpark[i].isEmpty()) {
              previousObjective = (i);
              return gonnaCarpark[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    {
      int i = synX845int;

      while (i < gonnaCarpark.length) {
        {
          {
            if (!gonnaCarpark[i].isEmpty()) {
              return synX846boolean;
            }
          }
        }
        i++;
      }
    }
    return synX847boolean;
  }

  public synchronized String controllerSurname() {
    return synX848String;
  }

  public synchronized void optiBeat() {

    if (prevalentMethod != null) {
      prevalentMethod.fitSquirtingYear(prevalentMethod.canLengthwaysYears() + synX849int);
      hourStay--;

      if (prevalentMethod.canLengthwaysYears() == prevalentMethod.canChairmanAmount()) {
        prevalentMethod.fitDieYear(this.arriveFlowIndicate());
        this.doneAppendage.addLast(prevalentMethod);
        prevalentMethod = (null);
        this.malcolmIris = (synX850boolean);
      }

      if (hourStay == synX851int && prevalentMethod != null) {

        if (primedIsVacant()) {
          hourStay = (MinutesEnormous);
        } else {
          gonnaCarpark[previousObjective + synX852int].addLast(prevalentMethod);
          prevalentMethod = (null);
          this.malcolmIris = (synX853boolean);
        }
      }
    }

    if (this.malcolmIris && prevalentMethod == null) {
      this.additionalDikMonth--;

      if (additionalDikMonth == synX854int) {
        this.malcolmIris = (synX855boolean);
        this.additionalDikMonth = (Dealer.HitPeriods);
      }

    } else {

      if (prevalentMethod == null && !primedIsVacant()) {
        prevalentMethod = (catchUpcomingSue());
        ladeProcedures(prevalentMethod);
        prevalentMethod.markKickoffHours(this.arriveFlowIndicate());
        hourStay = (MinutesEnormous);
      }
    }
  }

  public synchronized void mechanismArrivals(Procedure system) {
    gonnaCarpark[synX856int].addLast(system);
  }
}
