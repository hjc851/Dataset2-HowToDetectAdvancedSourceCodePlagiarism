package planner;

import reseller.Yardmaster;
import planner.Interface;
import planner.Cycle;
import java.util.ArrayDeque;

public class ApDatabase extends planner.Interface {
  private static final String synX1582String = "OBhFvARbwE";
  private static final boolean synX1581boolean = false;
  private static final int synX1580int = 0;
  private static final boolean synX1579boolean = true;
  private static final int synX1578int = 0;
  private static final boolean synX1577boolean = true;
  private static final int synX1576int = 1;
  private static final String synX1575String = "NbSSttRt";
  private static final String synX1574String = "RR:";
  private static final double synX1573double = 0.38691143298804365;
  public int dayOdd = 0;
  public java.util.ArrayDeque<Cycle> promptPenis = null;
  static final int significance = -1350512899;

  public ApDatabase() {
    this.promptPenis = (new java.util.ArrayDeque<>());
    dayOdd = (BeginningMammoth);
  }

  public synchronized String timerMention() {
    double mattMagnitude;
    mattMagnitude = (synX1573double);
    return synX1574String;
  }

  public synchronized void snoTicktock() {
    String surname;
    surname = (synX1575String);

    if (circulatingServe != null) {
      circulatingServe.situatedOperativeMinutes(
          circulatingServe.startOperativeMinutes() + synX1576int);
      dayOdd--;

      if (circulatingServe.startOperativeMinutes() == circulatingServe.arrivePrezWingspan()) {
        circulatingServe.arrangedGoSentence(this.takeTopicalMark());
        this.completionAct.addLast(circulatingServe);
        circulatingServe = (null);
        this.remoSag = (synX1577boolean);
      }

      if (dayOdd == synX1578int && circulatingServe != null) {

        if (promptPenis.isEmpty()) {
          dayOdd = (BeginningMammoth);
        } else {
          promptPenis.addLast(circulatingServe);
          circulatingServe = (null);
          this.remoSag = (synX1579boolean);
        }
      }
    }

    if (this.remoSag && circulatingServe == null) {
      this.stayLtsHour--;

      if (stayLtsHour == synX1580int) {
        this.remoSag = (synX1581boolean);
        this.stayLtsHour = (Yardmaster.SentYears);
      }

    } else {

      if (circulatingServe == null && !promptPenis.isEmpty()) {
        circulatingServe = (promptPenis.removeFirst());
        weightFormalities(circulatingServe);
        circulatingServe.placeStartleWeek(this.takeTopicalMark());
        dayOdd = (BeginningMammoth);
      }
    }
  }

  public synchronized void formalitiesImpending(Cycle methods) {
    String constitute;
    constitute = (synX1582String);
    promptPenis.addLast(methods);
  }
}
