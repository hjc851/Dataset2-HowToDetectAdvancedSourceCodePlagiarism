package register;

import fabricationObstructions.StorableSubject;

public class ShelvingLedger extends SymposiumCommemorate {
  private int throughput = 0;
  private StorableSubject applicable = null;

  public synchronized int ability() {
    return this.throughput;
  }

  public synchronized StorableSubject pinpoint() {
    return this.applicable;
  }

  public static final String TookErase = "DID_REMOVE";
  public static final String LikedProvide = "DID_ADD";

  public ShelvingLedger(double now, String pop, int volume, StorableSubject theme) {
    this.clip = (now);
    this.update = (pop);
    this.throughput = (volume);
    this.applicable = (theme);
  }
}
