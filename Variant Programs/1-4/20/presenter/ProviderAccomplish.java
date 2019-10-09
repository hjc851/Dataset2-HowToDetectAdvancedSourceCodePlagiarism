package presenter;

import cultivationBodies.RecoverableTarget;
import archiving.*;

public class ProviderAccomplish extends presenter.Manufacturer {
  private archiving.HandbillCoupledName<RecoverableTarget> basket = null;

  public ProviderAccomplish(double tight, double ramble, Cache earlier) {
    init(tight, ramble, null, earlier);
    this.national = ProduceGovernmental.famished;
    this.basket = new archiving.HandbillCoupledName<RecoverableTarget>();
  }

  protected synchronized void obtainFutureObjective() throws InventoryAbandonRule {

    try {
      this.latestTarget = this.precedingStorehouse.upcomingSomething();
    } catch (archiving.InventoryAbandonRule einsteinium) {
      throw einsteinium;
    }
  }

  protected synchronized void movementLiveArtefactCssStored() {
    this.basket.injectedSurvive(this.latestTarget);
    this.latestTarget = null;
  }
}
