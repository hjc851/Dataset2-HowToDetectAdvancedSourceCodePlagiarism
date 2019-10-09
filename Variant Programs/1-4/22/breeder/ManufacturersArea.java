package breeder;

import memory.*;

public class ManufacturersArea extends breeder.Breeder {

  public ManufacturersArea(double think, double grade, Store later, Store preceding) {
    configure(think, grade, later, preceding);
    this.tell = EmitterTerritory.famished;
  }

  protected synchronized void runActualArtifactEapStore() throws DepotEntireCaveat {

    try {
      this.laterDisk.extendSubject(this.actualArtifact);
      this.actualArtifact = null;
    } catch (memory.DepotEntireCaveat e) {
      throw e;
    }
  }

  protected synchronized void provideExpectedObjet() throws StoreroomPillagedUnless {

    try {
      this.actualArtifact = this.originalSpace.thirdThing();
    } catch (memory.StoreroomPillagedUnless e) {
      throw e;
    }
  }
}
