package supplier;

import developmentElements.NeocomianElement;
import disk.*;

public class ManufacturersEarly extends Farmer {

  public ManufacturersEarly(double stingy, double drift, Warehousing adjacent) {
    modulo(stingy, drift, adjacent, null);
    this.tell = ProducingPublic.employing;
  }

  protected void incurCloseAim() throws WarehousesGlazedExempted {
    this.circulatingSubject = new NeocomianElement();
  }

  protected void actContemporaryItemCoughsEntrepot() throws StoringWideProviso {

    try {
      this.expectedStowage.appendToken(this.circulatingSubject);
      this.circulatingSubject = null;
    } catch (StoringWideProviso salaam) {
      throw salaam;
    }
  }
}
