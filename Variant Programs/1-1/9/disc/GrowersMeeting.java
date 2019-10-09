package disc;

import ontogenetic.WhenGuard;
import director.Farm;

public class GrowersMeeting extends ExtravaganzaDisc implements Comparable<GrowersMeeting> {
  public static final String PlansWrapObjet = "WILL_FINISH_OBJECT";
  public static final String PotOutset = "CAN_START";
  private Farm proprietors;

  public GrowersMeeting(double amount, String enquiries, Farm employer) {
    this.period = amount;
    this.scuttlebutt = enquiries;
    this.proprietors = employer;
  }

  public int compareTo(GrowersMeeting factors) {

    if (this.period < factors.period) return 1;
    else if (this.period == factors.period) return 0;
    else return -1;
  }

  public void outgrowthTournament() {
    WhenGuard.laidClip(this.period);
    this.proprietors.systemAgainTotem();
  }

  public String toString() {
    return "owner: " + proprietors + " info: " + scuttlebutt + " chrono: " + period;
  }
}
