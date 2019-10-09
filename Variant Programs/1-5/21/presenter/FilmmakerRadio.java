package presenter;

import garage.*;

public class FilmmakerRadio extends Produce {

  protected synchronized void haveFirstSubject() throws DepotUnfilledCaveat {

    try {
      this.existingPurpose = (this.oldEntrepot.firstConsignment());
    } catch (DepotUnfilledCaveat e) {
      throw e;
    }
  }

  protected synchronized void pushExistingPurposeOfficesArchival()
      throws ArchivalOverflowingExempt {

    try {
      this.nowArchival.tallyConsignment(this.existingPurpose);
      this.existingPurpose = (null);
    } catch (ArchivalOverflowingExempt e) {
      throw e;
    }
  }

  public FilmmakerRadio(double tight, double reach, Memory then, Memory first) {
    randomizing(tight, reach, then, first);
    this.governmental = (FarmCentral.neglecting);
  }
}
