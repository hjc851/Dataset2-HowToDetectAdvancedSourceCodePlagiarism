package promoter;

import harvestingGoods.HypabyssalTotem;
import safekeeping.*;

public class GrowerDepart extends Grower {

  public GrowerDepart(double average, double scope, Warehousing following) {
    intercommunicate(average, scope, following, null);
    this.express = BreederGeneral.acting;
  }

  protected void giveAgainTotem() throws StowageLootedDerogation {
    this.presentlyItems = new HypabyssalTotem();
  }

  protected void affectAfootElementGiglioWarehousing() throws StowageLadenDerogation {

    try {
      this.laterDisk.lendPoint(this.presentlyItems);
      this.presentlyItems = null;
    } catch (StowageLadenDerogation cma) {
      throw cma;
    }
  }
}
