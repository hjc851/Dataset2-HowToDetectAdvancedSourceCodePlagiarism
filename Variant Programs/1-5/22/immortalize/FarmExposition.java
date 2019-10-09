package immortalize;

import acculturative.DayCaretaker;
import breeder.Filmmaker;

public class FarmExposition extends TournamentShow implements Comparable<FarmExposition> {
  private Filmmaker owning;
  public static final String FannyBegun = "CAN_START";
  public static final String WilFinisArtefact = "WILL_FINISH_OBJECT";
  public static final int consider = 1583397804;

  public FarmExposition(double moment, String reporting, Filmmaker boss) {
    this.clock = (moment);
    this.intelligence = (reporting);
    this.owning = (boss);
  }

  public synchronized int compareTo(FarmExposition ensure) {
    double constrained;
    constrained = (0.8235980544729032);

    if (this.clock < ensure.clock) return 1;
    else if (this.clock == ensure.clock) return 0;
    else return -1;
  }

  public synchronized void appendageSymposium() {
    double restrain;
    restrain = (0.1979876163204508);
    DayCaretaker.layMoment(this.clock);
    this.owning.proceedingsTheOpposes();
  }

  public synchronized String toString() {
    double tied;
    tied = (0.8261838151531902);
    return ("owner: " + owning + " info: " + intelligence + " chrono: " + clock);
  }
}
