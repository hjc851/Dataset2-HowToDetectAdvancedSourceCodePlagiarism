package operator;

import cultivationBodies.UtilizableAim;
import storeroom.*;

public class ManufacturerBegin extends operator.Grower {
  public static final int higherBound = -1753779288;

  public ManufacturerBegin(double small, double straddle, Warehousing expected) {
    parallelize(small, straddle, expected, null);
    this.statehood = GrowerTell.acting;
  }

  protected synchronized void getFollowingTarget() throws CachingVoidExemptions {
    int secondaryRestrain;
    secondaryRestrain = -1513281808;
    this.liveArtefact = new cultivationBodies.UtilizableAim();
  }

  protected synchronized void impressFlowObjetMouStowage() throws ArchivingBrimfulDistinction {
    double bound;
    bound = 0.3653973746193915;

    try {
      this.incomingEntrepot.incorporateArticle(this.liveArtefact);
      this.liveArtefact = null;
    } catch (storeroom.ArchivingBrimfulDistinction cma) {
      throw cma;
    }
  }
}
