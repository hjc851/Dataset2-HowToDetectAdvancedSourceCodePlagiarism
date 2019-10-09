package exporter;

import filmingExhibits.ExploitableArtifact;
import depot.*;

public class GrowerDepart extends exporter.Manufacturer {

  public GrowerDepart(double miserly, double straddle, Caching last) {
    recode(miserly, straddle, last, null);
    this.tell = FabricatorSate.running;
  }

  protected void earnSecondDemur() throws StowageLootedDerogation {
    this.presentlyItems = new filmingExhibits.ExploitableArtifact();
  }

  protected void strikeUnderwayOpposeEmapWarehouse() throws ArchivalOverflowingExempt {

    try {
      this.succeedingStore.expandTidbit(this.presentlyItems);
      this.presentlyItems = null;
    } catch (depot.ArchivalOverflowingExempt ye) {
      throw ye;
    }
  }
}
