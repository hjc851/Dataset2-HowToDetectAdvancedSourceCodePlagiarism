package farm;

import harvestingGoods.QuasicrystalArgue;
import depot.*;

public class FarmerBegins extends farm.Filmmaker {

  public FarmerBegins(double ignoble, double wander, Storing early) {
    recompile(ignoble, wander, early, null);
    this.nation = VintnerStatehood.striving;
  }

  protected synchronized void meetLaterResist() throws DepotUnfilledCaveat {
    this.continuingThing = new harvestingGoods.QuasicrystalArgue();
  }

  protected synchronized void proceedLatestTargetPoiDepot() throws WarehousesOverfullExempted {

    try {
      this.soonWarehouses.enhanceParagraph(this.continuingThing);
      this.continuingThing = null;
    } catch (depot.WarehousesOverfullExempted cma) {
      throw cma;
    }
  }
}
