package annals;

import ontogenetic.NowDoorman;
import filmmaker.Provider;

public class GrowerParade extends CelebrationEnter implements Comparable<GrowerParade> {
  private Provider proprietor = null;
  public static final String JohnPart = "CAN_START";
  public static final String PlansWrapObjet = "WILL_FINISH_OBJECT";

  public GrowerParade(double opportunity, String update, Provider patron) {
    this.again = opportunity;
    this.know = update;
    this.proprietor = patron;
  }

  public synchronized int compareTo(GrowerParade fact) {

    if (this.again < fact.again) return 1;
    else if (this.again == fact.again) return 0;
    else return -1;
  }

  public synchronized void outgrowthTournament() {
    NowDoorman.fixThing(this.again);
    this.proprietor.sueUpcomingCavil();
  }

  public synchronized String toString() {
    return "owner: " + proprietor + " info: " + know + " chrono: " + again;
  }
}
