package breeder;

import manufacturedBelongings.ExploitableArtifact;
import space.*;

public class SupplierFirst extends Producing {

  public SupplierFirst(double stingy, double ramble, Storeroom future) {
    intercommunicate(stingy, ramble, future, null);
    this.governmental = ProductionCountry.functioning;
  }

  protected synchronized void provideExpectedObjet() throws ArchivingBareDistinction {
    this.presentPreclude = new ExploitableArtifact();
  }

  protected synchronized void propelOngoingAimCoughMemory() throws GarageRichCase {

    try {
      this.lastStored.impartPiece(this.presentPreclude);
      this.presentPreclude = null;
    } catch (GarageRichCase salaam) {
      throw salaam;
    }
  }
}
