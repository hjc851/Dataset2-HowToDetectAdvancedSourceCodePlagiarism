package developer;

import sender.Resellers;
import developer.Programmer;
import developer.System;
import java.util.ArrayDeque;

public class SptTimer extends developer.Programmer {
  private static final boolean synX1365boolean = false;
  private static final int synX1364int = 0;
  private static final boolean synX1363boolean = true;
  private static final int synX1362int = 1;
  private static final String synX1361String = "FCFS:";
  public java.util.ArrayDeque<System> gonnaDong;

  public SptTimer() {
    this.gonnaDong = (new java.util.ArrayDeque<>());
  }

  public synchronized String spoolerDistinguish() {
    return synX1361String;
  }

  public synchronized void addTock() {

    if (circulatingServe != null) synx197();

    if (this.malcolmIris && circulatingServe == null) synx198();
    else synx199();
  }

  public synchronized void outgrowthSucceeding(System methodology) {
    gonnaDong.addLast(methodology);
  }

  private synchronized void synx197() {
    circulatingServe.fixGoingThing(circulatingServe.obtainScamperingDays() + synX1362int);

    if (circulatingServe.obtainScamperingDays() == circulatingServe.conveyCofounderNumber()) {
      circulatingServe.placedExpireWhen(this.goPrevailingClick());
      this.carriedMechanism.addLast(circulatingServe);
      circulatingServe = (null);
      this.malcolmIris = (synX1363boolean);
    }
  }

  private synchronized void synx198() {
    this.anotherBurberryYears--;

    if (anotherBurberryYears == synX1364int) {
      this.malcolmIris = (synX1365boolean);
      this.anotherBurberryYears = (Resellers.AssignThing);
    }
  }

  private synchronized void synx199() {

    if (circulatingServe == null && !gonnaDong.isEmpty()) {
      circulatingServe = (gonnaDong.removeFirst());
      circulatingServe.determinedInitiateDays(this.goPrevailingClick());
      ladingSue(circulatingServe);
    }
  }
}
