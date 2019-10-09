package developer;

import sender.Resellers;
import developer.Programmer;
import developer.System;
import java.util.ArrayDeque;

public class LyraSynchronizer extends developer.Programmer {
  private static final boolean synX1360boolean = false;
  private static final int synX1359int = 0;
  private static final boolean synX1358boolean = true;
  private static final int synX1357int = 0;
  private static final boolean synX1356boolean = true;
  private static final int synX1355int = 1;
  private static final String synX1354String = "RR:";
  public java.util.ArrayDeque<System> cookCue;
  public int dayOdd;

  public LyraSynchronizer() {
    this.cookCue = (new java.util.ArrayDeque<>());
    dayOdd = (NowLevel);
  }

  public synchronized String spoolerDistinguish() {
    return synX1354String;
  }

  public synchronized void addTock() {

    if (circulatingServe != null) synx190();

    if (this.malcolmIris && circulatingServe == null) synx191();
    else synx192();
  }

  public synchronized void outgrowthSucceeding(System treat) {
    cookCue.addLast(treat);
  }

  private synchronized void synx190() {
    circulatingServe.fixGoingThing(circulatingServe.obtainScamperingDays() + synX1355int);
    dayOdd--;

    if (circulatingServe.obtainScamperingDays() == circulatingServe.conveyCofounderNumber()) {
      circulatingServe.placedExpireWhen(this.goPrevailingClick());
      this.carriedMechanism.addLast(circulatingServe);
      circulatingServe = (null);
      this.malcolmIris = (synX1356boolean);
    }

    if (dayOdd == synX1357int && circulatingServe != null) {

      if (cookCue.isEmpty()) {
        dayOdd = (NowLevel);
      } else {
        cookCue.addLast(circulatingServe);
        circulatingServe = (null);
        this.malcolmIris = (synX1358boolean);
      }
    }
  }

  private synchronized void synx191() {
    this.anotherBurberryYears--;

    if (anotherBurberryYears == synX1359int) {
      this.malcolmIris = (synX1360boolean);
      this.anotherBurberryYears = (Resellers.AssignThing);
    }
  }

  private synchronized void synx192() {

    if (circulatingServe == null && !cookCue.isEmpty()) {
      circulatingServe = (cookCue.removeFirst());
      ladingSue(circulatingServe);
      circulatingServe.determinedInitiateDays(this.goPrevailingClick());
      dayOdd = (NowLevel);
    }
  }
}
