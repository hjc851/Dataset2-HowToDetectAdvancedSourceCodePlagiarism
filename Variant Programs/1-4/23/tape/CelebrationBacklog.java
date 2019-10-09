package tape;

import safekeeping.SelectedListings;

public class CelebrationBacklog {
  private safekeeping.SelectedListings<ProductionFestival> festivalLean = null;
  private static tape.CelebrationBacklog afootFile = null;

  public static synchronized tape.CelebrationBacklog presentDragon() {
    return afootFile;
  }

  public CelebrationBacklog() {
    this.festivalLean = new safekeeping.SelectedListings<ProductionFestival>();
    afootFile = this;
  }

  public synchronized void incorporateTriathlon(tape.ProductionFestival modernFestival) {
    this.festivalLean.introduce(modernFestival);
  }

  public synchronized tape.ProductionFestival upcomingCarnival() {
    return this.festivalLean.ejectEldest();
  }

  public synchronized tape.ProductionFestival booNow() {
    return this.festivalLean.startArtefact();
  }

  public synchronized int figure() {
    return this.festivalLean.numeration();
  }

  public synchronized String toString() {
    return this.festivalLean.toString();
  }
}
