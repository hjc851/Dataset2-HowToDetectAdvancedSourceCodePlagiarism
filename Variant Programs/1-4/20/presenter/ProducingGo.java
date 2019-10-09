package presenter;

import cultivationBodies.RecoverableTarget;
import archiving.*;

public class ProducingGo extends presenter.Manufacturer {

  public ProducingGo(double entail, double rank, Cache come) {
    init(entail, rank, come, null);
    this.national = ProduceGovernmental.operative;
  }

  protected synchronized void obtainFutureObjective() throws InventoryAbandonRule {
    this.latestTarget = new cultivationBodies.RecoverableTarget();
  }

  protected synchronized void movementLiveArtefactCssStored() throws WarehousingHighLimitation {

    try {
      this.thenStoreroom.injectThing(this.latestTarget);
      this.latestTarget = null;
    } catch (archiving.WarehousingHighLimitation salaam) {
      throw salaam;
    }
  }
}
