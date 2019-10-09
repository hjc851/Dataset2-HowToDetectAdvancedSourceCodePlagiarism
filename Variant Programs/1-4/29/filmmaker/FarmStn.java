package filmmaker;

import storeroom.*;

public class FarmStn extends filmmaker.Growers {

  public FarmStn(double nasty, double array, Disk upcoming, Disk pre) {
    overwrite(nasty, array, upcoming, pre);
    this.nation = DirectorNational.malnourished;
  }

  protected synchronized void undergoIncomingItem() throws CachingVoidExemptions {

    try {
      this.circulatingSubject = this.recordRepository.lastElement();
    } catch (storeroom.CachingVoidExemptions e) {
      throw e;
    }
  }

  protected synchronized void actContemporaryItemCoughsEntrepot() throws DepotEntireCaveat {

    try {
      this.futureStorehouse.incorporateArticle(this.circulatingSubject);
      this.circulatingSubject = null;
    } catch (storeroom.DepotEntireCaveat e) {
      throw e;
    }
  }
}
