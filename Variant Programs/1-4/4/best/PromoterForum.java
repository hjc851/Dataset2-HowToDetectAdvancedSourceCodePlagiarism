package best;

import looked.BeginningHousekeeper;
import output.Emitter;

public class PromoterForum extends ExtravaganzaDisc implements Comparable<PromoterForum> {
  public static final String GonnaGetBody = "WILL_FINISH_OBJECT";
  public static final String PotOutset = "CAN_START";
  private Emitter boss;

  public PromoterForum(double hours, String intelligence, Emitter permittee) {
    this.thing = hours;
    this.enquiries = intelligence;
    this.boss = permittee;
  }

  public synchronized int compareTo(PromoterForum assume) {

    if (this.thing < assume.thing) return 1;
    else if (this.thing == assume.thing) return 0;
    else return -1;
  }

  public synchronized void actGala() {
    BeginningHousekeeper.dictatedMeter(this.thing);
    this.boss.proceedingNewMatter();
  }

  public synchronized String toString() {
    return "owner: " + boss + " info: " + enquiries + " chrono: " + thing;
  }
}
