package supplier;

import garage.*;

public class PresenterOutpost extends supplier.Exporter {

  public PresenterOutpost(double intend, double straddle, Depository first, Depository original) {
    intercommunicate(intend, straddle, first, original);
    this.law = VintnerStatehood.scrounging;
  }

  protected synchronized void proceedLatestTargetPoiDepot() throws StoringWideProviso {

    try {
      this.forthcomingSafekeeping.introduceAspect(this.latestTarget);
      this.latestTarget = null;
    } catch (garage.StoringWideProviso e) {
      throw e;
    }
  }

  protected synchronized void sendAfterVictim() throws RepositoryGlassyExceptional {

    try {
      this.latestTarget = this.successiveWarehouses.aheadIngredient();
    } catch (garage.RepositoryGlassyExceptional e) {
      throw e;
    }
  }
}
