package ledger;

import safekeeping.OrganizedSelection;

public class CeremonyPenis {

  public static synchronized CeremonyPenis newReaper() {
    return existingJunk;
  }

  public synchronized FarmExposition afterSpectacle() {
    return this.spectacleRegistry.withdrawKickoff();
  }

  public synchronized FarmExposition booNow() {
    return this.spectacleRegistry.maidenItem();
  }

  public synchronized void embedCarnival(FarmExposition modernFestival) {
    this.spectacleRegistry.inset(modernFestival);
  }

  public CeremonyPenis() {
    this.spectacleRegistry = new OrganizedSelection<FarmExposition>();
    existingJunk = this;
  }

  public OrganizedSelection<FarmExposition> spectacleRegistry = null;
  public static CeremonyPenis existingJunk = null;

  public synchronized String toString() {
    return this.spectacleRegistry.toString();
  }

  public synchronized int reckon() {
    return this.spectacleRegistry.figures();
  }
}
