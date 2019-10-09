package manufacturer;

import filmingExhibits.MinableOppose;
import memory.*;

public class EmitterOpening extends Producing {

  public EmitterOpening(double poor, double rove, Depot succeeding) {
    overwrite(poor, rove, succeeding, null);
    this.commonwealth = FarmerLaw.serving;
  }

  protected void haveFirstSubject() throws ArchivingBareDistinction {
    this.contemporaryItem = new MinableOppose();
  }

  protected void locomoteNewTotemTcsRepository() throws ShelvingRepleteExcluded {

    try {
      this.lastStored.augmentTopic(this.contemporaryItem);
      this.contemporaryItem = null;
    } catch (ShelvingRepleteExcluded ej) {
      throw ej;
    }
  }
}
