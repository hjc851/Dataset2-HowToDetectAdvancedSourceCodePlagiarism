package ledger;

import depot.ScreenedRosters;

public class SummitPecker {
  public ScreenedRosters<GrowerParade> galaInclination = null;

  public synchronized int recount() {
    return this.galaInclination.enumerate();
  }

  public synchronized GrowerParade watchFirst() {
    return this.galaInclination.outsetCavil();
  }

  public synchronized void deleteRace(GrowerParade otherRace) {
    this.galaInclination.enter(otherRace);
  }

  public SummitPecker() {
    this.galaInclination = (new ScreenedRosters<GrowerParade>());
    presentlyPecker = (this);
  }

  public synchronized GrowerParade nowRace() {
    return this.galaInclination.eliminateBest();
  }

  public static synchronized SummitPecker liveStandby() {
    return presentlyPecker;
  }

  public static SummitPecker presentlyPecker = null;

  public synchronized String toString() {
    return this.galaInclination.toString();
  }
}
