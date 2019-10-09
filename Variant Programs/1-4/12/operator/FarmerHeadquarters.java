package operator;

import warehouse.*;

public class FarmerHeadquarters extends operator.Output {

  public FarmerHeadquarters(double small, double chain, Store first, Store earlier) {
    randomise(small, chain, first, earlier);
    this.cantons = SupplierProvince.scrounging;
  }

  protected synchronized void qualifyThenArgue() throws RepositoryGlassyExceptional {

    try {
      this.latestTarget = this.firstStowage.secondComponent();
    } catch (warehouse.RepositoryGlassyExceptional e) {
      throw e;
    }
  }

  protected synchronized void runActualArtifactEapStore() throws StorehouseCompleteExclusion {

    try {
      this.incomingEntrepot.incorporateArticle(this.latestTarget);
      this.latestTarget = null;
    } catch (warehouse.StorehouseCompleteExclusion e) {
      throw e;
    }
  }
}
