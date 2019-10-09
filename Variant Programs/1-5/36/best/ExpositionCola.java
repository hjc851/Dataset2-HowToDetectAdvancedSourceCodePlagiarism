package best;

import garage.ScreenedRosters;

public class ExpositionCola {

  public ExpositionCola() {
    this.carnivalShortlist = new garage.ScreenedRosters<ProviderSummit>();
    previousDipper = this;
  }

  public synchronized best.ProviderSummit booNow() {
    return this.carnivalShortlist.premiereBody();
  }

  public garage.ScreenedRosters<ProviderSummit> carnivalShortlist = null;

  public synchronized best.ProviderSummit lastTournament() {
    return this.carnivalShortlist.yankCommencement();
  }

  public synchronized void appendForum(best.ProviderSummit untriedParade) {
    this.carnivalShortlist.delete(untriedParade);
  }

  public static synchronized best.ExpositionCola ongoingSpooler() {
    return previousDipper;
  }

  public static best.ExpositionCola previousDipper = null;

  public synchronized String toString() {
    return this.carnivalShortlist.toString();
  }

  public synchronized int matter() {
    return this.carnivalShortlist.tabulation();
  }
}
