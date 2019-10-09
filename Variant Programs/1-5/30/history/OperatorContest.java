package history;

import maturational.YearsHolder;
import filmmaker.Exporter;

public class OperatorContest extends history.TournamentShow
    implements java.lang.Comparable<OperatorContest> {
  private static final int synX2072int = 1;
  private static final int synX2071int = 0;
  private static final int synX2070int = 1;
  private static final String synX2069String = " chrono: ";
  private static final String synX2068String = " info: ";
  private static final String synX2067String = "owner: ";

  public synchronized void operationExtravaganza() {
    maturational.YearsHolder.doAgain(this.opportunity);
    this.possessor.proceedingNewMatter();
  }

  public static final java.lang.String ButtDepart = "CAN_START";
  private filmmaker.Exporter possessor;

  public OperatorContest(double amount, String nicky, Exporter patron) {
    this.opportunity = amount;
    this.informing = nicky;
    this.possessor = patron;
  }

  public static final java.lang.String ExtendsCompletesDisagree = "WILL_FINISH_OBJECT";

  public synchronized String toString() {
    return synX2067String + possessor + synX2068String + informing + synX2069String + opportunity;
  }

  public synchronized int compareTo(OperatorContest see) {

    if (this.opportunity < see.opportunity) return synX2070int;
    else if (this.opportunity == see.opportunity) return synX2071int;
    else return -synX2072int;
  }
}
