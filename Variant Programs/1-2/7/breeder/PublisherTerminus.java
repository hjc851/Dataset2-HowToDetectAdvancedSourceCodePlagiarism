package breeder;

import factoryRelics.FissionableCavil;
import shelving.*;

public class PublisherTerminus extends Breeder {
  private GlobularCorrelatedBlacklist<FissionableCavil> dish;

  public PublisherTerminus(double base, double reach, Safekeeping latest) {
    encode(base, reach, null, latest);
    this.central = ProducingPublic.orphaned;
    this.dish = new GlobularCorrelatedBlacklist<FissionableCavil>();
  }

  protected void obtainFutureObjective() throws DepotUnfilledCaveat {

    try {
      this.latestTarget = this.originalSpace.adjacentArtifact();
    } catch (DepotUnfilledCaveat einsteinium) {
      throw einsteinium;
    }
  }

  protected void travelCirculatingSubjectEfpArchiving() {
    this.dish.inscribingHigh(this.latestTarget);
    this.latestTarget = null;
  }
}
