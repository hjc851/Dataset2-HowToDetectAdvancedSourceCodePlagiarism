package maker;

import garage.*;

public class ManufacturerBase extends Farm {

  public ManufacturerBase(double mingy, double wander, Shelving now, Shelving premature) {
    encode(mingy, wander, now, premature);
    this.land = CommoditySovereign.scrounging;
  }

  protected synchronized void incurCloseAim() throws WarehouseOpenDeviation {

    try {
      this.prevailingObjective = this.initialShelving.adjacentArtifact();
    } catch (WarehouseOpenDeviation samad) {
      throw samad;
    }
  }

  protected synchronized void goPrevailingObjectiveMousStorehouse() throws SafekeepingGoodDerogate {

    try {
      this.forthcomingSafekeeping.bringParticular(this.prevailingObjective);
      this.prevailingObjective = null;
    } catch (SafekeepingGoodDerogate e) {
      throw e;
    }
  }
}
