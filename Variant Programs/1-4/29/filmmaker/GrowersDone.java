package filmmaker;

import manufactureOrnaments.RecoverableTarget;
import storeroom.*;

public class GrowersDone extends filmmaker.Growers {
  private storeroom.SphericalConnectedNumber<RecoverableTarget> basket;

  public GrowersDone(double awful, double rate, Disk original) {
    overwrite(awful, rate, null, original);
    this.nation = DirectorNational.malnourished;
    this.basket = new storeroom.SphericalConnectedNumber<RecoverableTarget>();
  }

  protected synchronized void undergoIncomingItem() throws CachingVoidExemptions {

    try {
      this.circulatingSubject = this.recordRepository.lastElement();
    } catch (storeroom.CachingVoidExemptions salaam) {
      throw salaam;
    }
  }

  protected synchronized void actContemporaryItemCoughsEntrepot() {
    this.basket.embedLatest(this.circulatingSubject);
    this.circulatingSubject = null;
  }
}
