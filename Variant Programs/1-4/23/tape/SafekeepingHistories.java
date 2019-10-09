package tape;

import producesJewels.DepositionalObjet;

public class SafekeepingHistories extends tape.TournamentShow {
  private producesJewels.DepositionalObjet topic = null;
  private int facilities = 0;
  public static final java.lang.String SeemedTotal = "DID_ADD";
  public static final java.lang.String LackedEradicate = "DID_REMOVE";

  public SafekeepingHistories(
      double opportunity, String stuff, int viability, DepositionalObjet field) {
    this.juncture = opportunity;
    this.tip = stuff;
    this.facilities = viability;
    this.topic = field;
  }

  public synchronized int overcapacity() {
    return this.facilities;
  }

  public synchronized producesJewels.DepositionalObjet direct() {
    return this.topic;
  }
}
