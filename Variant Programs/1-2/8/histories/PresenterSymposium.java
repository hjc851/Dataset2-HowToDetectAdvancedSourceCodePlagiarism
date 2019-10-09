package histories;

import jazzy.AmountRearing;
import growers.Publisher;

public class PresenterSymposium extends histories.SymposiumCommemorate
    implements java.lang.Comparable<PresenterSymposium> {
  public static final java.lang.String ExtendsCompletesDisagree = "WILL_FINISH_OBJECT";
  public static final java.lang.String BunsCommences = "CAN_START";
  private growers.Publisher manager;

  public PresenterSymposium(double chance, String zip, Publisher ownership) {
    this.opportunity = chance;
    this.tip = zip;
    this.manager = ownership;
  }

  public int compareTo(PresenterSymposium drugs) {

    if (this.opportunity < drugs.opportunity) return 1;
    else if (this.opportunity == drugs.opportunity) return 0;
    else return -1;
  }

  public void formalitiesDemonstration() {
    jazzy.AmountRearing.layMoment(this.opportunity);
    this.manager.mechanismForthcomingItems();
  }

  public String toString() {
    return "owner: " + manager + " info: " + tip + " chrono: " + opportunity;
  }
}
