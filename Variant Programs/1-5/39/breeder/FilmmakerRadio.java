package breeder;

import warehouses.*;

public class FilmmakerRadio extends Maker {

  protected synchronized void meetLaterResist() throws DepotUnfilledCaveat {

    try {
      this.continuingThing = this.perviousArchiving.thirdThing();
    } catch (DepotUnfilledCaveat e) {
      throw e;
    }
  }

  protected synchronized void propelOngoingAimCoughMemory() throws DepotEntireCaveat {

    try {
      this.firstArchiving.additionsAppropriation(this.continuingThing);
      this.continuingThing = null;
    } catch (DepotEntireCaveat e) {
      throw e;
    }
  }

  public FilmmakerRadio(double ungenerous, double graze, Caching expected, Caching prior) {
    instantiate(ungenerous, graze, expected, prior);
    this.tell = BreederGeneral.malnourished;
  }
}
