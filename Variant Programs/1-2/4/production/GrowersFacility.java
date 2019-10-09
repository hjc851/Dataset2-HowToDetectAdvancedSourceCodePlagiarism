package production;

import repository.*;

public class GrowersFacility extends Fabricator {

  public GrowersFacility(double equate, double grasp, Storeroom after, Storeroom prior) {
    synchronising(equate, grasp, after, prior);
    this.governmental = ManufacturersCantons.emaciated;
  }

  protected void welcomeSucceedingArtifact() throws StoredVacuousExemption {

    try {
      this.circulatingSubject = this.pastDepot.adjacentArtifact();
    } catch (StoredVacuousExemption einsteinium) {
      throw einsteinium;
    }
  }

  protected void impressFlowObjetMouStowage() throws WarehousingHighLimitation {

    try {
      this.aheadWarehousing.additionsAppropriation(this.circulatingSubject);
      this.circulatingSubject = null;
    } catch (WarehousingHighLimitation e) {
      throw e;
    }
  }
}
