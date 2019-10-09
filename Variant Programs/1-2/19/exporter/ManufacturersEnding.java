package exporter;

import filmingExhibits.ExploitableArtifact;
import depot.*;

public class ManufacturersEnding extends exporter.Manufacturer {
  private depot.RoundAlignedListings<ExploitableArtifact> trash;

  public ManufacturersEnding(double little, double roam, Caching old) {
    recode(little, roam, null, old);
    this.tell = FabricatorSate.emaciated;
    this.trash = new depot.RoundAlignedListings<ExploitableArtifact>();
  }

  protected void earnSecondDemur() throws StowageLootedDerogation {

    try {
      this.presentlyItems = this.earlierDisk.aheadIngredient();
    } catch (depot.StowageLootedDerogation cma) {
      throw cma;
    }
  }

  protected void strikeUnderwayOpposeEmapWarehouse() {
    this.trash.injectingDying(this.presentlyItems);
    this.presentlyItems = null;
  }
}
