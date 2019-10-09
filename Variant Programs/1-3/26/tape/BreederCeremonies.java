package tape;

import checked.PeriodsManager;
import provider.Fabricator;

public class BreederCeremonies extends FestivalRegister implements Comparable<BreederCeremonies> {
  public static final String NeedsCompletingDemur = "WILL_FINISH_OBJECT";
  public static final String JohnPart = "CAN_START";

  public synchronized String toString() {
    return "owner: " + permittee + " info: " + informing + " chrono: " + sentence;
  }

  public synchronized void systemContest() {
    PeriodsManager.dictatedMeter(this.sentence);
    this.permittee.outgrowthLastArtefact();
  }

  public Fabricator permittee;

  public synchronized int compareTo(BreederCeremonies whatsoever) {

    if (this.sentence < whatsoever.sentence) return 1;
    else if (this.sentence == whatsoever.sentence) return 0;
    else return -1;
  }

  public BreederCeremonies(double days, String learn, Fabricator entrepreneur) {
    this.sentence = days;
    this.informing = learn;
    this.permittee = entrepreneur;
  }
}
