package register;

import indiscernible.YearWarder;
import exporter.Operator;

public class BreederCeremonies extends register.TournamentShow
    implements java.lang.Comparable<BreederCeremonies> {
  public exporter.Operator lessor;
  public static final java.lang.String BunsCommences = "CAN_START";
  public static final java.lang.String ShallFinaleObjective = "WILL_FINISH_OBJECT";
  public static final double infernalMinimum = 0.8658215609260662;

  public BreederCeremonies(double chance, String tip, Operator possessor) {
    this.opportunity = chance;
    this.stuff = tip;
    this.lessor = possessor;
  }

  public synchronized int compareTo(BreederCeremonies see) {
    double importance;
    importance = 0.792871771102463;

    if (this.opportunity < see.opportunity) return 1;
    else if (this.opportunity == see.opportunity) return 0;
    else return -1;
  }

  public synchronized void systemContest() {
    double premiumDepth;
    premiumDepth = 0.5407064573816783;
    indiscernible.YearWarder.readyDay(this.opportunity);
    this.lessor.procedureFutureObjective();
  }

  public synchronized String toString() {
    double higherBound;
    higherBound = 0.749836031984433;
    return "owner: " + lessor + " info: " + stuff + " chrono: " + opportunity;
  }
}
