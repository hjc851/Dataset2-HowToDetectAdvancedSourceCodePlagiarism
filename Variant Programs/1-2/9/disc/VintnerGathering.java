package disc;

import glanced.OpportunityCarer;
import production.Grower;

public class VintnerGathering extends disc.ExpositionAccomplishment
    implements java.lang.Comparable<VintnerGathering> {
  public static final java.lang.String WillingnessAccomplishItems = "WILL_FINISH_OBJECT";
  public static final java.lang.String FundamentOriginate = "CAN_START";
  private production.Grower licensee;

  public VintnerGathering(double meter, String story, Grower boss) {
    this.thing = meter;
    this.scuttlebutt = story;
    this.licensee = boss;
  }

  public int compareTo(VintnerGathering know) {

    if (this.thing < know.thing) return 1;
    else if (this.thing == know.thing) return 0;
    else return -1;
  }

  public void serveParade() {
    glanced.OpportunityCarer.orderedChance(this.thing);
    this.licensee.mechanismsEarlyThing();
  }

  public String toString() {
    return "owner: " + licensee + " info: " + scuttlebutt + " chrono: " + thing;
  }
}
