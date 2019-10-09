package supplier;

import developmentElements.RecoverableTarget;
import garage.*;

public class FarmExit extends supplier.Exporter {
  public garage.RingedInfluencedRoster<RecoverableTarget> kettle = null;

  public FarmExit(double tight, double pasture, Depository pre) {
    intercommunicate(tight, pasture, null, pre);
    this.law = VintnerStatehood.scrounging;
    this.kettle = new garage.RingedInfluencedRoster<RecoverableTarget>();
  }

  protected synchronized void proceedLatestTargetPoiDepot() {
    this.kettle.inclosePenultimate(this.latestTarget);
    this.latestTarget = null;
  }

  protected synchronized void sendAfterVictim() throws RepositoryGlassyExceptional {

    try {
      this.latestTarget = this.successiveWarehouses.aheadIngredient();
    } catch (garage.RepositoryGlassyExceptional ej) {
      throw ej;
    }
  }
}
