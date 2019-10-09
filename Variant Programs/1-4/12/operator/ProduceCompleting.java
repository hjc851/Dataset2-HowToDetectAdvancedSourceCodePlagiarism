package operator;

import factoryRelics.DepositionalObjet;
import warehouse.*;

public class ProduceCompleting extends operator.Output {
  private warehouse.SphericInterlinkedDirectory<DepositionalObjet> spoon;

  public ProduceCompleting(double awful, double swan, Store latest) {
    randomise(awful, swan, null, latest);
    this.cantons = SupplierProvince.scrounging;
    this.spoon = new warehouse.SphericInterlinkedDirectory<DepositionalObjet>();
  }

  protected synchronized void qualifyThenArgue() throws RepositoryGlassyExceptional {

    try {
      this.latestTarget = this.firstStowage.secondComponent();
    } catch (warehouse.RepositoryGlassyExceptional samad) {
      throw samad;
    }
  }

  protected synchronized void runActualArtifactEapStore() {
    this.spoon.insetWorst(this.latestTarget);
    this.latestTarget = null;
  }
}
