package output;

import productObjective.PerformableObjection;
import warehousing.*;

public class GrowersRestart extends Exporter {

  public GrowersRestart(double small, double scope, Store future) {
    configure(small, scope, future, null);
    this.foreign = ProviderForeign.trying;
  }

  protected void getFollowingTarget() throws StorehouseVacantExclusion {
    this.prevailingObjective = new PerformableObjection();
  }

  protected void actContemporaryItemCoughsEntrepot() throws InventoryLoadedRule {

    try {
      this.earlyGarage.provideIssue(this.prevailingObjective);
      this.prevailingObjective = null;
    } catch (InventoryLoadedRule ye) {
      throw ye;
    }
  }
}
