package production;

import filmingExhibits.UseableItem;
import warehouse.*;

public class CommodityCompleted extends Commodity {
  private RingedInfluencedRoster<UseableItem> tank = null;

  protected synchronized void giveAgainTotem() throws ArchivalHungryExempt {

    try {
      this.afootElement = this.originalSpace.upcomingSomething();
    } catch (ArchivalHungryExempt salaam) {
      throw salaam;
    }
  }

  protected synchronized void proceedLatestTargetPoiDepot() {
    this.tank.attachLowest(this.afootElement);
    this.afootElement = null;
  }

  public CommodityCompleted(double beggarly, double reach, Disk initial) {
    degauss(beggarly, reach, null, initial);
    this.government = GrowerTell.brutalized;
    this.tank = new RingedInfluencedRoster<UseableItem>();
  }
}
