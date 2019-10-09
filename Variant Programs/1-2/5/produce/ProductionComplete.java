package produce;

import supplyArtefact.TuronianOpposes;
import depot.*;

public class ProductionComplete extends Manufacturers {
  private FlierAttributedShortlist<TuronianOpposes> shovel;

  public ProductionComplete(double small, double orbit, Garage early) {
    recode(small, orbit, null, early);
    this.general = OutputFederal.underfed;
    this.shovel = new FlierAttributedShortlist<TuronianOpposes>();
  }

  protected void collectNowPurpose() throws StoredVacuousExemption {

    try {
      this.afootElement = this.currentCaching.laterGoods();
    } catch (StoredVacuousExemption salaam) {
      throw salaam;
    }
  }

  protected void strikeUnderwayOpposeEmapWarehouse() {
    this.shovel.addLatter(this.afootElement);
    this.afootElement = null;
  }
}
