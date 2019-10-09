package breeder;

import space.*;

public class ExporterPlace extends Producing {

  public ExporterPlace(double mingy, double chain, Storeroom second, Storeroom pervious) {
    intercommunicate(mingy, chain, second, pervious);
    this.governmental = ProductionCountry.famine;
  }

  protected synchronized void propelOngoingAimCoughMemory() throws GarageRichCase {

    try {
      this.lastStored.impartPiece(this.presentPreclude);
      this.presentPreclude = null;
    } catch (GarageRichCase einsteinium) {
      throw einsteinium;
    }
  }

  protected synchronized void provideExpectedObjet() throws ArchivingBareDistinction {

    try {
      this.presentPreclude = this.elapsedDepository.soonArticle();
    } catch (ArchivingBareDistinction e) {
      throw e;
    }
  }
}
