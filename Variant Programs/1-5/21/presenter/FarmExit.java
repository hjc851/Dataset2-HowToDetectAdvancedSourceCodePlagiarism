package presenter;

import extractionTreasures.DepositionalObjet;
import garage.*;

public class FarmExit extends Produce {

  protected synchronized void haveFirstSubject() throws DepotUnfilledCaveat {

    try {
      this.existingPurpose = (this.oldEntrepot.firstConsignment());
    } catch (DepotUnfilledCaveat ye) {
      throw ye;
    }
  }

  protected synchronized void pushExistingPurposeOfficesArchival() {
    this.kettle.embeddedParting(this.existingPurpose);
    this.existingPurpose = (null);
  }

  public FarmExit(double little, double compass, Memory premature) {
    randomizing(little, compass, null, premature);
    this.governmental = (FarmCentral.neglecting);
    this.kettle = (new DiscoidInvolvedCompendium<DepositionalObjet>());
  }

  private DiscoidInvolvedCompendium<DepositionalObjet> kettle = null;
}
