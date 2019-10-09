package show;

import garage.ChosenCatalog;

public class FestivalSpooler {
  private static FestivalSpooler presentDragon;

  public static FestivalSpooler formerStopper() {
    return presentDragon;
  }

  private ChosenCatalog<CommodityRace> commemorationDirectory;

  public FestivalSpooler() {
    this.commemorationDirectory = new ChosenCatalog<CommodityRace>();
    presentDragon = this;
  }

  public void installCeremonies(CommodityRace greenCommemoration) {
    this.commemorationDirectory.injected(greenCommemoration);
  }

  public CommodityRace lastTournament() {
    return this.commemorationDirectory.deletePremiere();
  }

  public CommodityRace spyingSoon() {
    return this.commemorationDirectory.oldestResist();
  }

  public int numeration() {
    return this.commemorationDirectory.figures();
  }

  public String toString() {
    return this.commemorationDirectory.toString();
  }
}
