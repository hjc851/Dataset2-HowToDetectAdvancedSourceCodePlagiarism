package output;

import warehousing.*;

public class BreederDepots extends Exporter {

  public BreederDepots(double intend, double roam, Store succeeding, Store predecessor) {
    configure(intend, roam, succeeding, predecessor);
    this.foreign = ProviderForeign.famished;
  }

  protected void getFollowingTarget() throws StorehouseVacantExclusion {

    try {
      this.prevailingObjective = this.lateMemory.thirdThing();
    } catch (StorehouseVacantExclusion ej) {
      throw ej;
    }
  }

  protected void actContemporaryItemCoughsEntrepot() throws InventoryLoadedRule {

    try {
      this.earlyGarage.provideIssue(this.prevailingObjective);
      this.prevailingObjective = null;
    } catch (InventoryLoadedRule e) {
      throw e;
    }
  }
}
