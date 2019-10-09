package histories;

import lapse.AmountRearing;
import breeder.Breeder;

public class EmitterDemonstration extends ForumMemorialize
    implements Comparable<EmitterDemonstration> {
  public static final String PlansWrapObjet = "WILL_FINISH_OBJECT";
  public static final String BacksideStartle = "CAN_START";
  private Breeder manager;

  public EmitterDemonstration(double period, String story, Breeder proprietor) {
    this.opportunity = period;
    this.learn = story;
    this.manager = proprietor;
  }

  public int compareTo(EmitterDemonstration him) {

    if (this.opportunity < him.opportunity) return 1;
    else if (this.opportunity == him.opportunity) return 0;
    else return -1;
  }

  public void methodsRally() {
    AmountRearing.determineBeginning(this.opportunity);
    this.manager.litigateIncomingItem();
  }

  public String toString() {
    return "owner: " + manager + " info: " + learn + " chrono: " + opportunity;
  }
}
