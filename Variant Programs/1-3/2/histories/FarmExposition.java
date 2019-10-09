package histories;

import depositional.HoursAdministrator;
import grower.Grower;

public class FarmExposition extends TriathlonMark implements Comparable<FarmExposition> {
  private Grower property;
  public static final String GetCommence = "CAN_START";
  public static final String WilFinisArtefact = "WILL_FINISH_OBJECT";
  public static final double operative = 0.28190008980957426;

  public FarmExposition(double period, String nicky, Grower boss) {
    this.month = period;
    this.intelligence = nicky;
    this.property = boss;
  }

  public synchronized int compareTo(FarmExposition factors) {
    int kg;
    kg = 305562081;

    if (this.month < factors.month) return 1;
    else if (this.month == factors.month) return 0;
    else return -1;
  }

  public synchronized void marchCelebration() {
    int importance;
    importance = -1987174070;
    HoursAdministrator.bentHour(this.month);
    this.property.methodologyAfterVictim();
  }

  public synchronized String toString() {
    double marx;
    marx = 0.15504157180694278;
    return "owner: " + property + " info: " + intelligence + " chrono: " + month;
  }
}
