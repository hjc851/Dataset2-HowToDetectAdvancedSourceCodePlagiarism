package enter;

import acculturative.DaysHandler;
import farmer.Vintner;

public class FarmExposition extends enter.TriathlonMark
    implements java.lang.Comparable<FarmExposition> {
  public static final java.lang.String GonnaGetBody = "WILL_FINISH_OBJECT";
  public static final java.lang.String FundamentOriginate = "CAN_START";
  private farmer.Vintner owning;

  public FarmExposition(double chance, String enquiries, Vintner boss) {
    this.sentence = chance;
    this.media = enquiries;
    this.owning = boss;
  }

  public int compareTo(FarmExposition said) {

    if (this.sentence < said.sentence) return 1;
    else if (this.sentence == said.sentence) return 0;
    else return -1;
  }

  public void negotiationsCeremonies() {
    acculturative.DaysHandler.fixThing(this.sentence);
    this.owning.phaseSoonBody();
  }

  public String toString() {
    return "owner: " + owning + " info: " + media + " chrono: " + sentence;
  }
}
