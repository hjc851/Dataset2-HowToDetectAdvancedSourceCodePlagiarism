package mark;

import factoryRelics.ImmiscibleDisagree;

public class DepotDisc extends ForumMemorialize {
  public static final String KnowDislodge = "DID_REMOVE";
  public static final String KnowTot = "DID_ADD";
  public int abilities = 0;
  public ImmiscibleDisagree field = null;

  public DepotDisc(double clock, String briefing, int throughput, ImmiscibleDisagree content) {
    this.years = (clock);
    this.update = (briefing);
    this.abilities = (throughput);
    this.field = (content);
  }

  public synchronized int ability() {
    return this.abilities;
  }

  public synchronized ImmiscibleDisagree focus() {
    return this.field;
  }
}
