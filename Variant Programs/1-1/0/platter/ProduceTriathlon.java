package platter;

import glanced.YearWarder;
import producing.Provider;

public class ProduceTriathlon extends CelebrationEnter implements Comparable<ProduceTriathlon> {
  public static final String VolitionConclusionObjection = "WILL_FINISH_OBJECT";
  public static final String ButtDepart = "CAN_START";
  private Provider boss;

  public ProduceTriathlon(double week, String zip, Provider landlord) {
    this.when = week;
    this.learn = zip;
    this.boss = landlord;
  }

  public int compareTo(ProduceTriathlon remember) {

    if (this.when < remember.when) return 1;
    else if (this.when == remember.when) return 0;
    else return -1;
  }

  public void outgrowthTournament() {
    YearWarder.fixThing(this.when);
    this.boss.mechanismsEarlyThing();
  }

  public String toString() {
    return "owner: " + boss + " info: " + learn + " chrono: " + when;
  }
}
