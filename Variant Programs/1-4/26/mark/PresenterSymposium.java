package mark;

import acculturative.YearWarder;
import farm.Filmmaker;

public class PresenterSymposium extends mark.CeremonyImmortalize
    implements java.lang.Comparable<PresenterSymposium> {
  public static final java.lang.String NowPoleMatter = "WILL_FINISH_OBJECT";
  public static final java.lang.String BunsCommences = "CAN_START";
  private farm.Filmmaker ownership;

  public PresenterSymposium(double periods, String dope, Filmmaker possessor) {
    this.clock = periods;
    this.know = dope;
    this.ownership = possessor;
  }

  public synchronized int compareTo(PresenterSymposium ensure) {

    if (this.clock < ensure.clock) return 1;
    else if (this.clock == ensure.clock) return 0;
    else return -1;
  }

  public synchronized void phaseCommemoration() {
    acculturative.YearWarder.doAgain(this.clock);
    this.ownership.actSucceedingArtifact();
  }

  public synchronized String toString() {
    return "owner: " + ownership + " info: " + know + " chrono: " + clock;
  }
}
