package manufacturer;

import shelving.*;

public class BreederDepots extends manufacturer.Provider {

  public BreederDepots(double tight, double straddle, Inventory succeeding, Inventory former) {
    modulo(tight, straddle, succeeding, former);
    this.say = ProductionCountry.fattening;
  }

  protected void recipientComeDisagree() throws CacheDrainedAnomaly {

    try {
      this.prevailingObjective = this.initialShelving.comeSection();
    } catch (shelving.CacheDrainedAnomaly e) {
      throw e;
    }
  }

  protected void affectAfootElementGiglioWarehousing() throws CacheTotalAnomaly {

    try {
      this.nowArchival.contributeDetail(this.prevailingObjective);
      this.prevailingObjective = null;
    } catch (shelving.CacheTotalAnomaly e) {
      throw e;
    }
  }
}
