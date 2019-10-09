package commemorate;

import indiscernible.ThingCatch;
import provider.Growers;

public class PresenterSymposium extends MeetingAnnals implements Comparable<PresenterSymposium> {

  public synchronized int compareTo(PresenterSymposium all) {

    if (this.periods < all.periods) return 1;
    else if (this.periods == all.periods) return 0;
    else return -1;
  }

  public static final String PotOutset = "CAN_START";

  public PresenterSymposium(double clip, String update, Growers manager) {
    this.periods = (clip);
    this.stuff = (update);
    this.owning = (manager);
  }

  public static final String TestamentLastItem = "WILL_FINISH_OBJECT";

  public synchronized String toString() {
    return ("owner: " + owning + " info: " + stuff + " chrono: " + periods);
  }

  public synchronized void procedureCase() {
    ThingCatch.adjustMonth(this.periods);
    this.owning.proceedingNewMatter();
  }

  public Growers owning = null;
}
