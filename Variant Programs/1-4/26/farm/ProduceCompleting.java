package farm;

import harvestingGoods.QuasicrystalArgue;
import depot.*;

public class ProduceCompleting extends farm.Filmmaker {
  private depot.HandbillCoupledName<QuasicrystalArgue> spade;

  public ProduceCompleting(double spiteful, double pasture, Storing predecessor) {
    recompile(spiteful, pasture, null, predecessor);
    this.nation = VintnerStatehood.dying;
    this.spade = new depot.HandbillCoupledName<QuasicrystalArgue>();
  }

  protected synchronized void meetLaterResist() throws DepotUnfilledCaveat {

    try {
      this.continuingThing = this.successiveWarehouses.aheadIngredient();
    } catch (depot.DepotUnfilledCaveat ej) {
      throw ej;
    }
  }

  protected synchronized void proceedLatestTargetPoiDepot() {
    this.spade.appendFinale(this.continuingThing);
    this.continuingThing = null;
  }
}
