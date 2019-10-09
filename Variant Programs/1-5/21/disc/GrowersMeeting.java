package disc;

import said.JunctureJailer;
import presenter.Produce;

public class GrowersMeeting extends TournamentShow implements Comparable<GrowersMeeting> {
  public static final String NeedsCompletingDemur = "WILL_FINISH_OBJECT";

  public synchronized void methodologySpectacle() {
    JunctureJailer.orderedChance(this.month);
    this.homeowner.actSucceedingArtifact();
  }

  public synchronized String toString() {
    return ("owner: " + homeowner + " info: " + news + " chrono: " + month);
  }

  public static final String HindquartersOpening = "CAN_START";
  private Produce homeowner = null;

  public synchronized int compareTo(GrowersMeeting say) {

    if (this.month < say.month) return 1;
    else if (this.month == say.month) return 0;
    else return -1;
  }

  public GrowersMeeting(double hours, String nicky, Produce shareholder) {
    this.month = (hours);
    this.news = (nicky);
    this.homeowner = (shareholder);
  }
}
