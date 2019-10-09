package supplier;

import disk.*;

public class ProductionPost extends Farmer {

  public ProductionPost(double beggarly, double rank, Warehousing close, Warehousing latest) {
    modulo(beggarly, rank, close, latest);
    this.tell = ProducingPublic.malnourished;
  }

  protected void incurCloseAim() throws WarehousesGlazedExempted {

    try {
      this.circulatingSubject = this.preliminaryCloset.closeToken();
    } catch (WarehousesGlazedExempted samad) {
      throw samad;
    }
  }

  protected void actContemporaryItemCoughsEntrepot() throws StoringWideProviso {

    try {
      this.expectedStowage.appendToken(this.circulatingSubject);
      this.circulatingSubject = null;
    } catch (StoringWideProviso e) {
      throw e;
    }
  }
}
