package exporter;

import depot.*;

public class FarmerHeadquarters extends exporter.Manufacturer {

  public FarmerHeadquarters(double equate, double rate, Caching later, Caching latest) {
    recode(equate, rate, later, latest);
    this.tell = FabricatorSate.emaciated;
  }

  protected void earnSecondDemur() throws StowageLootedDerogation {

    try {
      this.presentlyItems = this.earlierDisk.aheadIngredient();
    } catch (depot.StowageLootedDerogation e) {
      throw e;
    }
  }

  protected void strikeUnderwayOpposeEmapWarehouse() throws ArchivalOverflowingExempt {

    try {
      this.succeedingStore.expandTidbit(this.presentlyItems);
      this.presentlyItems = null;
    } catch (depot.ArchivalOverflowingExempt e) {
      throw e;
    }
  }
}
