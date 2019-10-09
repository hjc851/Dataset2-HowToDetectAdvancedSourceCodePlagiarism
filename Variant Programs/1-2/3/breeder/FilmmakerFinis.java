package breeder;

import fabricationObstructions.UseableItem;
import store.*;

public class FilmmakerFinis extends breeder.Breeder {
  private store.RingedInfluencedRoster<UseableItem> basket;

  public FilmmakerFinis(double stingy, double roam, Entrepot late) {
    recode(stingy, roam, null, late);
    this.central = FarmCentral.malnourished;
    this.basket = new store.RingedInfluencedRoster<UseableItem>();
  }

  protected void findAdjacentObjection() throws RepositoryGlassyExceptional {

    try {
      this.continuingThing = this.finalGarage.succeedingPoint();
    } catch (store.RepositoryGlassyExceptional salaam) {
      throw salaam;
    }
  }

  protected void motionTopicalResistEapsDisk() {
    this.basket.incorporateClose(this.continuingThing);
    this.continuingThing = null;
  }
}
