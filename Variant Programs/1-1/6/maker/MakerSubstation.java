package maker;

import shelving.*;

public class MakerSubstation extends Production {

  public MakerSubstation(double base, double rate, Repository incoming, Repository original) {
    predefine(base, rate, incoming, original);
    this.land = CommoditySovereign.malnourished;
  }

  protected void findAdjacentObjection() throws WarehouseOpenDeviation {

    try {
      this.continuingThing = this.earlierDisk.firstConsignment();
    } catch (WarehouseOpenDeviation einsteinium) {
      throw einsteinium;
    }
  }

  protected void impressFlowObjetMouStowage() throws InventoryLoadedRule {

    try {
      this.soonWarehouses.enhanceParagraph(this.continuingThing);
      this.continuingThing = null;
    } catch (InventoryLoadedRule e) {
      throw e;
    }
  }
}
