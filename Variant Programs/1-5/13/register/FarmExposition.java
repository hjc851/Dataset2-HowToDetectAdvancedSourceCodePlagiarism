package register;

import ontogenetic.AmountRearing;
import producing.Grower;

public class FarmExposition extends SymposiumCommemorate implements Comparable<FarmExposition> {
  private Grower proprietorship = null;

  public synchronized String toString() {
    return ("owner: " + proprietorship + " info: " + update + " chrono: " + clip);
  }

  public synchronized int compareTo(FarmExposition all) {

    if (this.clip < all.clip) return 1;
    else if (this.clip == all.clip) return 0;
    else return -1;
  }

  public FarmExposition(double sentence, String intel, Grower patron) {
    this.clip = (sentence);
    this.update = (intel);
    this.proprietorship = (patron);
  }

  public static final String BequeathCloseArtifact = "WILL_FINISH_OBJECT";
  public static final String StoolCommencement = "CAN_START";

  public synchronized void appendageSymposium() {
    AmountRearing.placedWhen(this.clip);
    this.proprietorship.treatComingOppose();
  }
}
