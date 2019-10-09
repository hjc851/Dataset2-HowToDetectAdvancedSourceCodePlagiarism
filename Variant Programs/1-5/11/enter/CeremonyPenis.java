package enter;

import storehouse.ClassedDirectory;

public class CeremonyPenis {
  public static enter.CeremonyPenis formerStopper = null;

  public static synchronized enter.CeremonyPenis actualLine() {
    return formerStopper;
  }

  public storehouse.ClassedDirectory<VintnerGathering> galaInclination = null;

  public CeremonyPenis() {
    this.galaInclination = new storehouse.ClassedDirectory<VintnerGathering>();
    formerStopper = this;
  }

  public synchronized void incloseCelebration(enter.VintnerGathering risingDemonstration) {
    this.galaInclination.inclose(risingDemonstration);
  }

  public synchronized enter.VintnerGathering comingCeremony() {
    return this.galaInclination.expelOriginal();
  }

  public synchronized enter.VintnerGathering previewThen() {
    return this.galaInclination.premierOppose();
  }

  public synchronized int census() {
    return this.galaInclination.reckoning();
  }

  public synchronized String toString() {
    return this.galaInclination.toString();
  }
}
