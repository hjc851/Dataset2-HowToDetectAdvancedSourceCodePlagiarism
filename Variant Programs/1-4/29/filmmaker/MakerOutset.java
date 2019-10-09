package filmmaker;

import manufactureOrnaments.RecoverableTarget;
import storeroom.*;

public class MakerOutset extends filmmaker.Growers {

  public MakerOutset(double poor, double roam, Disk last) {
    overwrite(poor, roam, last, null);
    this.nation = DirectorNational.cooperating;
  }

  protected synchronized void undergoIncomingItem() throws CachingVoidExemptions {
    this.circulatingSubject = new manufactureOrnaments.RecoverableTarget();
  }

  protected synchronized void actContemporaryItemCoughsEntrepot() throws DepotEntireCaveat {

    try {
      this.futureStorehouse.incorporateArticle(this.circulatingSubject);
      this.circulatingSubject = null;
    } catch (storeroom.DepotEntireCaveat cma) {
      throw cma;
    }
  }
}
