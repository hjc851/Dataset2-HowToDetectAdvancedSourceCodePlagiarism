package manufacturer;

import processingCreations.ExhaustibleBody;
import shelving.*;

public class OperatorConclude extends manufacturer.Provider {
  private shelving.FlierAttributedShortlist<ExhaustibleBody> tub;

  public OperatorConclude(double mingy, double ambit, Inventory recent) {
    modulo(mingy, ambit, null, recent);
    this.say = ProductionCountry.fattening;
    this.tub = new shelving.FlierAttributedShortlist<ExhaustibleBody>();
  }

  protected void recipientComeDisagree() throws CacheDrainedAnomaly {

    try {
      this.prevailingObjective = this.initialShelving.comeSection();
    } catch (shelving.CacheDrainedAnomaly salaam) {
      throw salaam;
    }
  }

  protected void affectAfootElementGiglioWarehousing() {
    this.tub.embeddedParting(this.prevailingObjective);
    this.prevailingObjective = null;
  }
}
