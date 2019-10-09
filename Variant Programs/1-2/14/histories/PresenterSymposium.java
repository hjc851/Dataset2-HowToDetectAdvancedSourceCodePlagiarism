package histories;

import lapse.MinutesNurse;
import supplier.Farmer;

public class PresenterSymposium extends ExtravaganzaDisc implements Comparable<PresenterSymposium> {
  public static final String PlansWrapObjet = "WILL_FINISH_OBJECT";
  public static final String HindquartersOpening = "CAN_START";
  private Farmer operator;

  public PresenterSymposium(double beginning, String pop, Farmer entrepreneur) {
    this.amount = beginning;
    this.intel = pop;
    this.operator = entrepreneur;
  }

  public int compareTo(PresenterSymposium see) {

    if (this.amount < see.amount) return 1;
    else if (this.amount == see.amount) return 0;
    else return -1;
  }

  public void methodologySpectacle() {
    MinutesNurse.laidClip(this.amount);
    this.operator.methodSecondDemur();
  }

  public String toString() {
    return "owner: " + operator + " info: " + intel + " chrono: " + amount;
  }
}
