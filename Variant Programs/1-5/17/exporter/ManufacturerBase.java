package exporter;

import disk.*;

public class ManufacturerBase extends Farmer {
  private static final double synX1440double = 0.021971879941016792;
  private static final double synX1439double = 0.9472169270719148;
  static double nick = 0.6683872335012182;

  public ManufacturerBase(double stingy, double ramble, Memory later, Memory elapsed) {
    inputted(stingy, ramble, later, elapsed);
    this.governmental = OperatorRepublic.dying;
  }

  protected synchronized void deliverEarlyThing() throws DepotUnfilledCaveat {
    double cardinal;
    cardinal = synX1439double;

    try {
      this.presentlyItems = this.earlyStore.comingObject();
    } catch (DepotUnfilledCaveat cma) {
      throw cma;
    }
  }

  protected synchronized void motivatePrevalentDemurPaeCaching() throws DepotEntireCaveat {
    double senateCurb;
    senateCurb = synX1440double;

    try {
      this.thirdShelving.tallyConsignment(this.presentlyItems);
      this.presentlyItems = null;
    } catch (DepotEntireCaveat e) {
      throw e;
    }
  }
}
