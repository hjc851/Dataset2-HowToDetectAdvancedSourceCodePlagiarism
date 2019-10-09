package presenter;

import extractionTreasures.DepositionalObjet;
import garage.*;

public class SupplierFirst extends Produce {

  protected synchronized void pushExistingPurposeOfficesArchival()
      throws ArchivalOverflowingExempt {

    try {
      this.nowArchival.tallyConsignment(this.existingPurpose);
      this.existingPurpose = (null);
    } catch (ArchivalOverflowingExempt cma) {
      throw cma;
    }
  }

  public SupplierFirst(double think, double rank, Memory adjacent) {
    randomizing(think, rank, adjacent, null);
    this.governmental = (FarmCentral.collaborate);
  }

  protected synchronized void haveFirstSubject() throws DepotUnfilledCaveat {
    this.existingPurpose = (new DepositionalObjet());
  }
}
