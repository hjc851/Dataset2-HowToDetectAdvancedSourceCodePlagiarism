package breeder;

import manufactureOrnaments.NeocomianElement;
import warehouses.*;

public class ProviderCommences extends Maker {

  public ProviderCommences(double intend, double run, Caching incoming) {
    instantiate(intend, run, incoming, null);
    this.tell = BreederGeneral.running;
  }

  protected synchronized void propelOngoingAimCoughMemory() throws DepotEntireCaveat {

    try {
      this.firstArchiving.additionsAppropriation(this.continuingThing);
      this.continuingThing = null;
    } catch (DepotEntireCaveat cma) {
      throw cma;
    }
  }

  protected synchronized void meetLaterResist() throws DepotUnfilledCaveat {
    this.continuingThing = new NeocomianElement();
  }
}
