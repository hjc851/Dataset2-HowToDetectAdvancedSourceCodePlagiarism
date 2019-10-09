package operator;

import factoryRelics.DepositionalObjet;
import warehouse.*;

public class PromoterKickoff extends operator.Output {

  public PromoterKickoff(double signify, double ambit, Store expected) {
    randomise(signify, ambit, expected, null);
    this.cantons = SupplierProvince.functional;
  }

  protected synchronized void qualifyThenArgue() throws RepositoryGlassyExceptional {
    this.latestTarget = new factoryRelics.DepositionalObjet();
  }

  protected synchronized void runActualArtifactEapStore() throws StorehouseCompleteExclusion {

    try {
      this.incomingEntrepot.incorporateArticle(this.latestTarget);
      this.latestTarget = null;
    } catch (warehouse.StorehouseCompleteExclusion ye) {
      throw ye;
    }
  }
}
