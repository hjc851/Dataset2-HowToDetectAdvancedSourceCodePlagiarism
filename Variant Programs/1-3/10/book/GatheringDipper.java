package book;

import space.ChosenCatalog;

public class GatheringDipper {
  public space.ChosenCatalog<FarmExposition> raceCompilation = null;
  public static book.GatheringDipper afootFile = null;

  public static synchronized book.GatheringDipper previousDipper() {
    return afootFile;
  }

  public GatheringDipper() {
    this.raceCompilation = new space.ChosenCatalog<FarmExposition>();
    afootFile = this;
  }

  public synchronized void embedCarnival(book.FarmExposition untriedParade) {
    this.raceCompilation.injecting(untriedParade);
  }

  public synchronized book.FarmExposition incomingVenue() {
    return this.raceCompilation.murderStart();
  }

  public synchronized book.FarmExposition spyingSoon() {
    return this.raceCompilation.beginningObjective();
  }

  public synchronized int calculate() {
    return this.raceCompilation.numeration();
  }

  public synchronized String toString() {
    return this.raceCompilation.toString();
  }
}
