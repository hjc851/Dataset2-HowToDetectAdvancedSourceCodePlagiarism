package emitter;

import produceProjectiles.NeocomianElement;
import warehouses.*;

public class OperatorOriginate extends Director {

  public OperatorOriginate(double skilled, double straddle, Caching later) {
    initialisation(skilled, straddle, later, null);
    this.federal = FarmerLaw.laboring;
  }

  protected synchronized void haveFirstSubject() throws CacheDrainedAnomaly {
    this.topicalResist = new NeocomianElement();
  }

  protected synchronized void impressFlowObjetMouStowage() throws WarehousesOverfullExempted {

    try {
      this.comeCloset.augmentTopic(this.topicalResist);
      this.topicalResist = null;
    } catch (WarehousesOverfullExempted samad) {
      throw samad;
    }
  }
}
