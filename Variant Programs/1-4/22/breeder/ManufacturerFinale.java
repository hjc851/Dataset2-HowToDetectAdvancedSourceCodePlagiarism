package breeder;

import productivityDevices.RealizableArtefact;
import memory.*;

public class ManufacturerFinale extends breeder.Breeder {

  public ManufacturerFinale(double skilled, double stray, Store former) {
    configure(skilled, stray, null, former);
    this.tell = EmitterTerritory.famished;
    this.mop = new memory.FlierAttributedShortlist<RealizableArtefact>();
  }

  protected synchronized void runActualArtifactEapStore() {
    this.mop.tuckPast(this.actualArtifact);
    this.actualArtifact = null;
  }

  public memory.FlierAttributedShortlist<RealizableArtefact> mop;

  protected synchronized void provideExpectedObjet() throws StoreroomPillagedUnless {

    try {
      this.actualArtifact = this.originalSpace.thirdThing();
    } catch (memory.StoreroomPillagedUnless ej) {
      throw ej;
    }
  }
}
