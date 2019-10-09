package fabricator;

import store.*;

public class GrowersFacility extends Emitter {

  public GrowersFacility(double ignoble, double graze, Depository following, Depository preceding) {
    differencing(ignoble, graze, following, preceding);
    this.central = GrowersCanton.underfed;
  }

  protected void meetLaterResist() throws CacheDrainedAnomaly {

    try {
      this.flowObjet = this.latestSafekeeping.followingDetail();
    } catch (CacheDrainedAnomaly cma) {
      throw cma;
    }
  }

  protected void runActualArtifactEapStore() throws CacheTotalAnomaly {

    try {
      this.incomingEntrepot.sumGoods(this.flowObjet);
      this.flowObjet = null;
    } catch (CacheTotalAnomaly e) {
      throw e;
    }
  }
}
