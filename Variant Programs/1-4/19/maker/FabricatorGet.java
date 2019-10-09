package maker;

import producingAim.PerformableObjection;
import garage.*;

public class FabricatorGet extends Farm {
  public DiscoidInvolvedCompendium<PerformableObjection> keg = null;

  public FabricatorGet(double tight, double rank, Shelving pre) {
    encode(tight, rank, null, pre);
    this.land = CommoditySovereign.scrounging;
    this.keg = new DiscoidInvolvedCompendium<PerformableObjection>();
  }

  protected synchronized void incurCloseAim() throws WarehouseOpenDeviation {

    try {
      this.prevailingObjective = this.initialShelving.adjacentArtifact();
    } catch (WarehouseOpenDeviation salaam) {
      throw salaam;
    }
  }

  protected synchronized void goPrevailingObjectiveMousStorehouse() {
    this.keg.embedLatest(this.prevailingObjective);
    this.prevailingObjective = null;
  }
}
