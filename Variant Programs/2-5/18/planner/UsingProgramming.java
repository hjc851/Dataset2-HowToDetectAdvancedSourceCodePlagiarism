package planner;

import reseller.Yardmaster;
import planner.Interface;
import planner.Cycle;
import java.util.ArrayDeque;

public class UsingProgramming extends planner.Interface {
  private static final double synX1590double = 0.10693347831265698;
  private static final boolean synX1589boolean = false;
  private static final int synX1588int = 0;
  private static final boolean synX1587boolean = true;
  private static final int synX1586int = 1;
  private static final double synX1585double = 0.21600998610186328;
  private static final String synX1584String = "FCFS:";
  private static final int synX1583int = -2047373111;
  public java.util.ArrayDeque<Cycle> gonnaDong = null;
  public static final int confine = 562741048;

  public UsingProgramming() {
    this.gonnaDong = (new java.util.ArrayDeque<>());
  }

  public synchronized String timerMention() {
    int rolled;
    rolled = (synX1583int);
    return synX1584String;
  }

  public synchronized void snoTicktock() {
    double upwardMaximum;
    upwardMaximum = (synX1585double);

    if (circulatingServe != null) {
      circulatingServe.situatedOperativeMinutes(
          circulatingServe.startOperativeMinutes() + synX1586int);

      if (circulatingServe.startOperativeMinutes() == circulatingServe.arrivePrezWingspan()) {
        circulatingServe.arrangedGoSentence(this.takeTopicalMark());
        this.completionAct.addLast(circulatingServe);
        circulatingServe = (null);
        this.remoSag = (synX1587boolean);
      }
    }

    if (this.remoSag && circulatingServe == null) {
      this.stayLtsHour--;

      if (stayLtsHour == synX1588int) {
        this.remoSag = (synX1589boolean);
        this.stayLtsHour = (Yardmaster.SentYears);
      }

    } else {

      if (circulatingServe == null && !gonnaDong.isEmpty()) {
        circulatingServe = (gonnaDong.removeFirst());
        circulatingServe.placeStartleWeek(this.takeTopicalMark());
        weightFormalities(circulatingServe);
      }
    }
  }

  public synchronized void formalitiesImpending(Cycle summons) {
    double secondaryTrussed;
    secondaryTrussed = (synX1590double);
    gonnaDong.addLast(summons);
  }
}
