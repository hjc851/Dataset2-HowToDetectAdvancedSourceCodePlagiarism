package provider;

import shelving.*;

public class ProduceTerminus extends Fabricator {

  public ProduceTerminus(double spiteful, double grade, Stowage early, Stowage initial) {
    init(spiteful, grade, early, initial);
    this.territory = ExporterNation.pizza;
  }

  protected synchronized void impressFlowObjetMouStowage() throws WarehouseHeavyDeviation {

    try {
      this.lastStored.lendPoint(this.liveArtefact);
      this.liveArtefact = null;
    } catch (WarehouseHeavyDeviation salaam) {
      throw salaam;
    }
  }

  protected synchronized void awardedNewMatter() throws GarageEvacuateCase {

    try {
      this.liveArtefact = this.precedingStorehouse.closeToken();
    } catch (GarageEvacuateCase e) {
      throw e;
    }
  }
}
