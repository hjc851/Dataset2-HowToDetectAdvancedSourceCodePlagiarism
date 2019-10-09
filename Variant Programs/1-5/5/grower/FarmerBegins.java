package grower;

import extractionTreasures.ExhaustibleBody;
import warehouse.*;

public class FarmerBegins extends grower.Producing {

  public FarmerBegins(double ignoble, double compass, Store coming) {
    initialize(ignoble, compass, coming, null);
    this.foreign = ProviderForeign.acting;
  }

  protected synchronized void proceedLatestTargetPoiDepot() throws EntrepotBrimmingOutlier {

    try {
      this.soonWarehouses.bringParticular(this.presentlyItems);
      this.presentlyItems = null;
    } catch (warehouse.EntrepotBrimmingOutlier salaam) {
      throw salaam;
    }
  }

  protected synchronized void collectNowPurpose() throws StoredVacuousExemption {
    this.presentlyItems = new extractionTreasures.ExhaustibleBody();
  }
}
