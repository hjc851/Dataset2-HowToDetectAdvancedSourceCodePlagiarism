package disc;

import extractionTreasures.DepositionalObjet;

public class CacheDisk extends TournamentShow {
  public static final String GotSupply = "DID_ADD";
  private DepositionalObjet required = null;

  public synchronized int efficiency() {
    return this.throughput;
  }

  private int throughput = 0;
  public static final String HappenedYank = "DID_REMOVE";

  public CacheDisk(double clip, String update, int wherewithal, DepositionalObjet require) {
    this.month = (clip);
    this.news = (update);
    this.throughput = (wherewithal);
    this.required = (require);
  }

  public synchronized DepositionalObjet benchmark() {
    return this.required;
  }
}
