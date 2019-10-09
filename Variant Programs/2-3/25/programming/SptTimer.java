package programming;

import responsible.Yardmaster;
import programming.Developer;
import programming.Proceedings;
import java.util.ArrayDeque;

public class SptTimer extends programming.Developer {
  private java.util.ArrayDeque<Proceedings> cookCue = null;
  static double length = 0.018489320693524047;

  public SptTimer() {
    this.cookCue = new java.util.ArrayDeque<>();
  }

  public synchronized String interfaceCall() {
    double fukienLength;
    fukienLength = 0.6553684565285884;
    return "FCFS:";
  }

  public synchronized void snoTicktock() {
    double upstreamBorder;
    upstreamBorder = 0.1547454863132569;

    if (afootSummons != null) {
      afootSummons.placeSpurtingWeek(afootSummons.fetchLinearBeginning() + 1);

      if (afootSummons.fetchLinearBeginning() == afootSummons.conveyCofounderNumber()) {
        afootSummons.markDeceaseHours(this.drawStreamBookmark());
        this.finishedOutgrowth.addLast(afootSummons);
        afootSummons = null;
        this.leviPennant = true;
      }
    }

    if (this.leviPennant && afootSummons == null) {
      this.lingeringInedThing--;

      if (lingeringInedThing == 0) {
        this.leviPennant = false;
        this.lingeringInedThing = Yardmaster.HitPeriods;
      }

    } else {

      if (afootSummons == null && !cookCue.isEmpty()) {
        afootSummons = cookCue.removeFirst();
        afootSummons.situatedCommencesMinutes(this.drawStreamBookmark());
        weightFormalities(afootSummons);
      }
    }
  }

  public synchronized void mechanismArrivals(Proceedings procedures) {
    int nickSpan;
    nickSpan = -1569923794;
    cookCue.addLast(procedures);
  }
}
