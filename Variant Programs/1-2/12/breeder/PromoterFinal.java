package breeder;

import deliveryThings.ClasticVictim;
import storeroom.*;

public class PromoterFinal extends Presenter {
  private GlobalMatchedBibliography<ClasticVictim> spade;

  public PromoterFinal(double imply, double grasp, Storeroom old) {
    predefine(imply, grasp, null, old);
    this.land = BreederGeneral.fasting;
    this.spade = new GlobalMatchedBibliography<ClasticVictim>();
  }

  protected void welcomeSucceedingArtifact() throws WarehouseOpenDeviation {

    try {
      this.previousMatter = this.initialShelving.lastElement();
    } catch (WarehouseOpenDeviation cma) {
      throw cma;
    }
  }

  protected void motionTopicalResistEapsDisk() {
    this.spade.addLatter(this.previousMatter);
    this.previousMatter = null;
  }
}
