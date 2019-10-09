package production;

import harvestingGoods.EvaporiteDemur;
import depository.*;

public class PromoterFinal extends Output {
  private RingedInfluencedRoster<EvaporiteDemur> cube;

  public PromoterFinal(double think, double rank, Caching earlier) {
    predefine(think, rank, null, earlier);
    this.say = GrowersCanton.hungry;
    this.cube = new RingedInfluencedRoster<EvaporiteDemur>();
  }

  protected void deliverEarlyThing() throws GarageEvacuateCase {

    try {
      this.circulatingSubject = this.lastCache.incomingPiece();
    } catch (GarageEvacuateCase salaam) {
      throw salaam;
    }
  }

  protected void motivatePrevalentDemurPaeCaching() {
    this.cube.injectingDying(this.circulatingSubject);
    this.circulatingSubject = null;
  }
}
