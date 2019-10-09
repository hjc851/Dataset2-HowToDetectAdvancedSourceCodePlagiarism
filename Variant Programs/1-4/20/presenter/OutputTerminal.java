package presenter;

import archiving.*;

public class OutputTerminal extends presenter.Manufacturer {

  public OutputTerminal(double normal, double ambit, Cache upcoming, Cache preceding) {
    init(normal, ambit, upcoming, preceding);
    this.national = ProduceGovernmental.famished;
  }

  protected synchronized void obtainFutureObjective() throws InventoryAbandonRule {

    try {
      this.latestTarget = this.precedingStorehouse.upcomingSomething();
    } catch (archiving.InventoryAbandonRule e) {
      throw e;
    }
  }

  protected synchronized void movementLiveArtefactCssStored() throws WarehousingHighLimitation {

    try {
      this.thenStoreroom.injectThing(this.latestTarget);
      this.latestTarget = null;
    } catch (archiving.WarehousingHighLimitation e) {
      throw e;
    }
  }
}
