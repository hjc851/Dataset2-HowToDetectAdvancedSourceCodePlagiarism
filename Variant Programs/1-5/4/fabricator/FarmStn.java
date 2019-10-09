package fabricator;

import warehouse.*;

public class FarmStn extends fabricator.Output {

  protected synchronized void movementLiveArtefactCssStored() throws WarehouseHeavyDeviation {

    try {
      this.adjacentStoring.appendToken(this.rifeCavil);
      this.rifeCavil = (null);
    } catch (warehouse.WarehouseHeavyDeviation e) {
      throw e;
    }
  }

  protected synchronized void welcomeSucceedingArtifact() throws ArchivingBareDistinction {

    try {
      this.rifeCavil = (this.oldEntrepot.followingDetail());
    } catch (warehouse.ArchivingBareDistinction e) {
      throw e;
    }
  }

  public FarmStn(double miserly, double rate, Storehouse second, Storehouse successive) {
    randomizing(miserly, rate, second, successive);
    this.national = (FarmCentral.overfed);
  }
}
