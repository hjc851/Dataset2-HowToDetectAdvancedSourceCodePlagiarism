package memorialize;

import developmental.DayCaretaker;
import production.Commodity;

public class ProviderSummit extends CommemorationHistory implements Comparable<ProviderSummit> {

  public synchronized int compareTo(ProviderSummit whatsoever) {

    if (this.year < whatsoever.year) return 1;
    else if (this.year == whatsoever.year) return 0;
    else return -1;
  }

  public static final String VolitionConclusionObjection = "WILL_FINISH_OBJECT";

  public synchronized void proceduresSeminar() {
    DayCaretaker.fitYear(this.year);
    this.boss.litigateIncomingItem();
  }

  public synchronized String toString() {
    return "owner: " + boss + " info: " + media + " chrono: " + year;
  }

  public static final String PotOutset = "CAN_START";

  public ProviderSummit(double meter, String pop, Commodity contractor) {
    this.year = meter;
    this.media = pop;
    this.boss = contractor;
  }

  private Commodity boss = null;
}
