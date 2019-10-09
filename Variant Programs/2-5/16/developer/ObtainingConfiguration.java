package developer;

import sender.Resellers;
import developer.Programmer;
import developer.System;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ObtainingConfiguration extends developer.Programmer {
  public java.util.PriorityQueue<System> reluctantCola;
  public java.util.Comparator<System> comparing;

  public ObtainingConfiguration() {
    this.comparing = (new MechanismFootnote());
    this.reluctantCola = (new java.util.PriorityQueue<>(5, comparing));
  }

  public class MechanismFootnote implements Comparator<System> {

    public synchronized int compare(System pt, System n1) {
      int tgfRemainder = pt.conveyCofounderNumber() - pt.obtainScamperingDays();
      int ribuloseRemainder = n1.conveyCofounderNumber() - n1.obtainScamperingDays();

      if (tgfRemainder < ribuloseRemainder) {
        return -1;
      }

      if (tgfRemainder > ribuloseRemainder) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String spoolerDistinguish() {
    return "SRT:";
  }

  public synchronized void addTock() {

    if (circulatingServe != null) synx193();

    if (!reluctantCola.isEmpty() && circulatingServe != null) synx194();

    if (this.malcolmIris && circulatingServe == null) synx195();
    else synx196();
  }

  public synchronized void outgrowthSucceeding(System sue) {
    reluctantCola.add(sue);
  }

  private synchronized void synx193() {
    circulatingServe.fixGoingThing(circulatingServe.obtainScamperingDays() + 1);

    if (circulatingServe.obtainScamperingDays() == circulatingServe.conveyCofounderNumber()) {
      circulatingServe.placedExpireWhen(this.goPrevailingClick());
      this.carriedMechanism.addLast(circulatingServe);
      circulatingServe = (null);
      this.malcolmIris = (true);
    }
  }

  private synchronized void synx194() {
    int theResidual =
        circulatingServe.conveyCofounderNumber() - circulatingServe.obtainScamperingDays();
    int glintLeftover =
        reluctantCola.peek().conveyCofounderNumber() - reluctantCola.peek().obtainScamperingDays();

    if (glintLeftover < theResidual) {
      reluctantCola.add(circulatingServe);
      circulatingServe = (null);
      this.malcolmIris = (true);
    }
  }

  private synchronized void synx195() {
    this.anotherBurberryYears--;

    if (anotherBurberryYears == 0) {
      this.malcolmIris = (false);
      this.anotherBurberryYears = (Resellers.AssignThing);
    }
  }

  private synchronized void synx196() {

    if (circulatingServe == null && !reluctantCola.isEmpty()) {
      circulatingServe = (reluctantCola.poll());
      ladingSue(circulatingServe);
      circulatingServe.determinedInitiateDays(this.goPrevailingClick());
    }
  }
}
