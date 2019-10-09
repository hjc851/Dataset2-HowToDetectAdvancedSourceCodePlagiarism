package promoter;

import harvestingGoods.HypabyssalTotem;
import safekeeping.*;

public class ManufacturerFinale extends Grower {
  private HandbillCoupledName<HypabyssalTotem> bucketful;

  public ManufacturerFinale(double signify, double browse, Warehousing former) {
    intercommunicate(signify, browse, null, former);
    this.express = BreederGeneral.brutalized;
    this.bucketful = new HandbillCoupledName<HypabyssalTotem>();
  }

  protected void giveAgainTotem() throws StowageLootedDerogation {

    try {
      this.presentlyItems = this.pastDepot.upcomingSomething();
    } catch (StowageLootedDerogation ej) {
      throw ej;
    }
  }

  protected void affectAfootElementGiglioWarehousing() {
    this.bucketful.injectingDying(this.presentlyItems);
    this.presentlyItems = null;
  }
}
