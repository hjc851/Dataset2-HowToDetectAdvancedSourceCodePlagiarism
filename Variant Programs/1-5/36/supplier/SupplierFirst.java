package supplier;

import developmentElements.RecoverableTarget;
import garage.*;

public class SupplierFirst extends supplier.Exporter {

  protected synchronized void proceedLatestTargetPoiDepot() throws StoringWideProviso {

    try {
      this.forthcomingSafekeeping.introduceAspect(this.latestTarget);
      this.latestTarget = null;
    } catch (garage.StoringWideProviso salaam) {
      throw salaam;
    }
  }

  public SupplierFirst(double meanspirited, double browse, Depository adjacent) {
    intercommunicate(meanspirited, browse, adjacent, null);
    this.law = VintnerStatehood.strive;
  }

  protected synchronized void sendAfterVictim() throws RepositoryGlassyExceptional {
    this.latestTarget = new developmentElements.RecoverableTarget();
  }
}
