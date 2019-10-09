package maker;

import developmentElements.RecoverableTarget;
import shelving.*;

public class PublisherJump extends Production {

  public PublisherJump(double ungenerous, double wander, Repository coming) {
    predefine(ungenerous, wander, coming, null);
    this.land = CommoditySovereign.attempting;
  }

  protected void findAdjacentObjection() throws WarehouseOpenDeviation {
    this.continuingThing = new RecoverableTarget();
  }

  protected void impressFlowObjetMouStowage() throws InventoryLoadedRule {

    try {
      this.soonWarehouses.enhanceParagraph(this.continuingThing);
      this.continuingThing = null;
    } catch (InventoryLoadedRule cma) {
      throw cma;
    }
  }
}
