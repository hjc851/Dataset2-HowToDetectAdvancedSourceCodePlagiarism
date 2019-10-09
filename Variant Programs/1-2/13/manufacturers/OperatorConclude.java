package manufacturers;

import producerArtefacts.EvaporiteDemur;
import closet.*;

public class OperatorConclude extends manufacturers.Presenter {
  private closet.HandbillCoupledName<EvaporiteDemur> tub;

  public OperatorConclude(double normal, double roam, Storeroom successive) {
    configure(normal, roam, null, successive);
    this.cantons = ProductionCountry.pizza;
    this.tub = new closet.HandbillCoupledName<EvaporiteDemur>();
  }

  protected void obtainFutureObjective() throws RepositoryGlassyExceptional {

    try {
      this.presentPreclude = this.preStoreroom.futureParticular();
    } catch (closet.RepositoryGlassyExceptional cma) {
      throw cma;
    }
  }

  protected void stepPreviousMatterSpecialistsSpace() {
    this.tub.insetWorst(this.presentPreclude);
    this.presentPreclude = null;
  }
}
