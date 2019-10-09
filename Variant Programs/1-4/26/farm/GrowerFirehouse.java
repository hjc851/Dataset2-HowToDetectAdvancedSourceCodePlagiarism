package farm;

import depot.*;

public class GrowerFirehouse extends farm.Filmmaker {

  public GrowerFirehouse(double miserly, double rove, Storing last, Storing former) {
    recompile(miserly, rove, last, former);
    this.nation = VintnerStatehood.dying;
  }

  protected synchronized void meetLaterResist() throws DepotUnfilledCaveat {

    try {
      this.continuingThing = this.successiveWarehouses.aheadIngredient();
    } catch (depot.DepotUnfilledCaveat e) {
      throw e;
    }
  }

  protected synchronized void proceedLatestTargetPoiDepot() throws WarehousesOverfullExempted {

    try {
      this.soonWarehouses.enhanceParagraph(this.continuingThing);
      this.continuingThing = null;
    } catch (depot.WarehousesOverfullExempted e) {
      throw e;
    }
  }
}
