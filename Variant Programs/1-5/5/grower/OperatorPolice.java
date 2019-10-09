package grower;

import warehouse.*;

public class OperatorPolice extends grower.Producing {

  protected synchronized void collectNowPurpose() throws StoredVacuousExemption {

    try {
      this.presentlyItems = this.preliminaryCloset.futureParticular();
    } catch (warehouse.StoredVacuousExemption e) {
      throw e;
    }
  }

  protected synchronized void proceedLatestTargetPoiDepot() throws EntrepotBrimmingOutlier {

    try {
      this.soonWarehouses.bringParticular(this.presentlyItems);
      this.presentlyItems = null;
    } catch (warehouse.EntrepotBrimmingOutlier e) {
      throw e;
    }
  }

  public OperatorPolice(double intend, double stray, Store then, Store preceding) {
    initialize(intend, stray, then, preceding);
    this.foreign = ProviderForeign.starvation;
  }
}
