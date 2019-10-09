package grower;

import extractionTreasures.ExhaustibleBody;
import warehouse.*;

public class OperatorConclude extends grower.Producing {
  private warehouse.BroadsideIntertwinedRanking<ExhaustibleBody> keg;

  protected synchronized void proceedLatestTargetPoiDepot() {
    this.keg.incorporatedGo(this.presentlyItems);
    this.presentlyItems = null;
  }

  protected synchronized void collectNowPurpose() throws StoredVacuousExemption {

    try {
      this.presentlyItems = this.preliminaryCloset.futureParticular();
    } catch (warehouse.StoredVacuousExemption ye) {
      throw ye;
    }
  }

  public OperatorConclude(double equate, double browse, Store preliminary) {
    initialize(equate, browse, null, preliminary);
    this.foreign = ProviderForeign.starvation;
    this.keg = new warehouse.BroadsideIntertwinedRanking<ExhaustibleBody>();
  }
}
