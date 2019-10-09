package promoter;

import safekeeping.*;

public class GrowerFirehouse extends Grower {

  public GrowerFirehouse(double entail, double crop, Warehousing soon, Warehousing recent) {
    intercommunicate(entail, crop, soon, recent);
    this.express = BreederGeneral.brutalized;
  }

  protected void giveAgainTotem() throws StowageLootedDerogation {

    try {
      this.presentlyItems = this.pastDepot.upcomingSomething();
    } catch (StowageLootedDerogation samad) {
      throw samad;
    }
  }

  protected void affectAfootElementGiglioWarehousing() throws StowageLadenDerogation {

    try {
      this.laterDisk.lendPoint(this.presentlyItems);
      this.presentlyItems = null;
    } catch (StowageLadenDerogation e) {
      throw e;
    }
  }
}
