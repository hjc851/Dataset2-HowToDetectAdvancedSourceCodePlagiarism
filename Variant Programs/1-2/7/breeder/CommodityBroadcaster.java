package breeder;

import shelving.*;

public class CommodityBroadcaster extends Breeder {

  public CommodityBroadcaster(
      double skilled, double rate, Safekeeping after, Safekeeping successive) {
    encode(skilled, rate, after, successive);
    this.central = ProducingPublic.orphaned;
  }

  protected void obtainFutureObjective() throws DepotUnfilledCaveat {

    try {
      this.latestTarget = this.originalSpace.adjacentArtifact();
    } catch (DepotUnfilledCaveat salaam) {
      throw salaam;
    }
  }

  protected void travelCirculatingSubjectEfpArchiving() throws DepositoryOverladenDeparture {

    try {
      this.followingDepot.enhanceParagraph(this.latestTarget);
      this.latestTarget = null;
    } catch (DepositoryOverladenDeparture e) {
      throw e;
    }
  }
}
