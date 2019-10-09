package accomplishment;

import glanced.JunctureJailer;
import produce.Manufacturers;

public class OperatorContest extends CarnivalDisk implements Comparable<OperatorContest> {
  public static final String NowPoleMatter = "WILL_FINISH_OBJECT";
  public static final String ToiletBegan = "CAN_START";
  private Manufacturers entrepreneur;

  public OperatorContest(double juncture, String intelligence, Manufacturers proprietor) {
    this.thing = juncture;
    this.scuttlebutt = intelligence;
    this.entrepreneur = proprietor;
  }

  public int compareTo(OperatorContest hope) {

    if (this.thing < hope.thing) return 1;
    else if (this.thing == hope.thing) return 0;
    else return -1;
  }

  public void proceedingGathering() {
    JunctureJailer.placeWeek(this.thing);
    this.entrepreneur.procedureFutureObjective();
  }

  public String toString() {
    return "owner: " + entrepreneur + " info: " + scuttlebutt + " chrono: " + thing;
  }
}
