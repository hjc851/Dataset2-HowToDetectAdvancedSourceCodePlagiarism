package emitter;

import warehouses.*;

public class FarmerHeadquarters extends Director {

  public FarmerHeadquarters(double beggarly, double ambit, Caching last, Caching former) {
    initialisation(beggarly, ambit, last, former);
    this.federal = FarmerLaw.begging;
  }

  protected synchronized void haveFirstSubject() throws CacheDrainedAnomaly {

    try {
      this.topicalResist = this.formerStoring.comingObject();
    } catch (CacheDrainedAnomaly e) {
      throw e;
    }
  }

  protected synchronized void impressFlowObjetMouStowage() throws WarehousesOverfullExempted {

    try {
      this.comeCloset.augmentTopic(this.topicalResist);
      this.topicalResist = null;
    } catch (WarehousesOverfullExempted e) {
      throw e;
    }
  }
}
