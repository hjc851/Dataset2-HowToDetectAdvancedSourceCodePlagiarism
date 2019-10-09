package planner;

import reseller.Yardmaster;
import planner.Interface;
import planner.Cycle;
import java.util.ArrayDeque;

public class CommercialSpooler extends planner.Interface {
  private static final int synX1572int = 0;
  private static final String synX1571String = "p";
  private static final boolean synX1570boolean = false;
  private static final int synX1569int = 0;
  private static final boolean synX1568boolean = true;
  private static final int synX1567int = 1;
  private static final int synX1566int = 0;
  private static final boolean synX1565boolean = true;
  private static final int synX1564int = 1;
  private static final int synX1563int = 1711073092;
  private static final String synX1562String = "FB:";
  private static final String synX1561String = "";
  private static final boolean synX1560boolean = true;
  private static final boolean synX1559boolean = false;
  private static final int synX1558int = 0;
  private static final int synX1557int = -1869334246;
  private static final int synX1556int = 0;
  private static final double synX1555double = 0.8614732420811491;
  public int presentlyPreference = 0;
  public int clockLeft = 0;
  static final String marquezHeight = "PYA9V4L";
  public ArrayDeque<Cycle>[] eagerGlues = null;

  public CommercialSpooler() {
    this.eagerGlues = (new java.util.ArrayDeque[6]);
    {
      int i = 0;

      while (i < eagerGlues.length) {
        {
          {
            eagerGlues[i] = (new java.util.ArrayDeque<>());
          }
        }
        i++;
      }
    }
    clockLeft = (BeginningMammoth);
    presentlyPreference = (0);
  }

  public synchronized planner.Cycle sustainThenMethods() {
    double weigh;
    weigh = (synX1555double);
    {
      int i = synX1556int;

      while (i < eagerGlues.length) {
        {
          {
            if (!eagerGlues[i].isEmpty()) {
              presentlyPreference = (i);
              return eagerGlues[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    int decreasingLeap;
    decreasingLeap = (synX1557int);
    {
      int i = synX1558int;

      while (i < eagerGlues.length) {
        {
          {
            if (!eagerGlues[i].isEmpty()) {
              return synX1559boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1560boolean;
  }

  public synchronized String timerMention() {
    String token;
    token = (synX1561String);
    return synX1562String;
  }

  public synchronized void snoTicktock() {
    int topLimitation;
    topLimitation = (synX1563int);

    if (circulatingServe != null) {
      circulatingServe.situatedOperativeMinutes(
          circulatingServe.startOperativeMinutes() + synX1564int);
      clockLeft--;

      if (circulatingServe.startOperativeMinutes() == circulatingServe.arrivePrezWingspan()) {
        circulatingServe.arrangedGoSentence(this.takeTopicalMark());
        this.completionAct.addLast(circulatingServe);
        circulatingServe = (null);
        this.remoSag = (synX1565boolean);
      }

      if (clockLeft == synX1566int && circulatingServe != null) {

        if (primedIsVacant()) {
          clockLeft = (BeginningMammoth);
        } else {
          eagerGlues[presentlyPreference + synX1567int].addLast(circulatingServe);
          circulatingServe = (null);
          this.remoSag = (synX1568boolean);
        }
      }
    }

    if (this.remoSag && circulatingServe == null) {
      this.stayLtsHour--;

      if (stayLtsHour == synX1569int) {
        this.remoSag = (synX1570boolean);
        this.stayLtsHour = (Yardmaster.SentYears);
      }

    } else {

      if (circulatingServe == null && !primedIsVacant()) {
        circulatingServe = (sustainThenMethods());
        weightFormalities(circulatingServe);
        circulatingServe.placeStartleWeek(this.takeTopicalMark());
        clockLeft = (BeginningMammoth);
      }
    }
  }

  public synchronized void formalitiesImpending(Cycle methodology) {
    String maximum;
    maximum = (synX1571String);
    eagerGlues[synX1572int].addLast(methodology);
  }
}
