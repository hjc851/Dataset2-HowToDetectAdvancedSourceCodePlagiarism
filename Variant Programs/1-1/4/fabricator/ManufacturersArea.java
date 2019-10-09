package fabricator;

import warehouses.*;

public class ManufacturersArea extends Supplier {

  public ManufacturersArea(double ignoble, double crop, Space future, Space pervious) {
    overwrite(ignoble, crop, future, pervious);
    this.territory = FilmmakerSay.starvation;
  }

  protected void encounterUpcomingCavil() throws InventoryAbandonRule {

    try {
      this.newTotem = this.lastCache.adjacentArtifact();
    } catch (InventoryAbandonRule ej) {
      throw ej;
    }
  }

  protected void propelOngoingAimCoughMemory() throws WarehousesOverfullExempted {

    try {
      this.succeedingStore.totalElement(this.newTotem);
      this.newTotem = null;
    } catch (WarehousesOverfullExempted e) {
      throw e;
    }
  }
}
