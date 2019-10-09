package manufacturer;

import processingCreations.ExhaustibleBody;
import shelving.*;

public class SupplierFirst extends manufacturer.Provider {

  public SupplierFirst(double skilled, double rate, Inventory following) {
    modulo(skilled, rate, following, null);
    this.say = ProductionCountry.temporary;
  }

  protected void recipientComeDisagree() throws CacheDrainedAnomaly {
    this.prevailingObjective = new processingCreations.ExhaustibleBody();
  }

  protected void affectAfootElementGiglioWarehousing() throws CacheTotalAnomaly {

    try {
      this.nowArchival.contributeDetail(this.prevailingObjective);
      this.prevailingObjective = null;
    } catch (shelving.CacheTotalAnomaly cma) {
      throw cma;
    }
  }
}
