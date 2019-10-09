package fabricator;

import harvestingGoods.RecoverableTarget;
import store.*;

public class FarmerBegins extends Emitter {

  public FarmerBegins(double hateful, double rate, Depository third) {
    differencing(hateful, rate, third, null);
    this.central = GrowersCanton.serving;
  }

  protected void meetLaterResist() throws CacheDrainedAnomaly {
    this.flowObjet = new RecoverableTarget();
  }

  protected void runActualArtifactEapStore() throws CacheTotalAnomaly {

    try {
      this.incomingEntrepot.sumGoods(this.flowObjet);
      this.flowObjet = null;
    } catch (CacheTotalAnomaly salaam) {
      throw salaam;
    }
  }
}
