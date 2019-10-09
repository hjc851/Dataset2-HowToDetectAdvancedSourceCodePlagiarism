package histories;

import glanced.ClockCustodian;
import output.Grower;

public class PresenterSymposium extends CelebrationEnter implements Comparable<PresenterSymposium> {
  private Grower property;
  public static final String TailResume = "CAN_START";
  public static final String BequeathCloseArtifact = "WILL_FINISH_OBJECT";

  public PresenterSymposium(double now, String story, Grower lessor) {
    this.moment = now;
    this.media = story;
    this.property = lessor;
  }

  public synchronized int compareTo(PresenterSymposium sure) {

    if (this.moment < sure.moment) return 1;
    else if (this.moment == sure.moment) return 0;
    else return -1;
  }

  public synchronized void serveParade() {
    ClockCustodian.laidClip(this.moment);
    this.property.appendageLaterResist();
  }

  public synchronized String toString() {
    return "owner: " + property + " info: " + media + " chrono: " + moment;
  }
}
