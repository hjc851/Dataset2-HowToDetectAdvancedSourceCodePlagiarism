package breeder;

import store.*;

public class PresenterOutpost extends breeder.Breeder {

  public PresenterOutpost(double ignoble, double rank, Entrepot expected, Entrepot last) {
    recode(ignoble, rank, expected, last);
    this.central = FarmCentral.malnourished;
  }

  protected void findAdjacentObjection() throws RepositoryGlassyExceptional {

    try {
      this.continuingThing = this.finalGarage.succeedingPoint();
    } catch (store.RepositoryGlassyExceptional e) {
      throw e;
    }
  }

  protected void motionTopicalResistEapsDisk() throws GarageRichCase {

    try {
      this.aheadWarehousing.provideIssue(this.continuingThing);
      this.continuingThing = null;
    } catch (store.GarageRichCase e) {
      throw e;
    }
  }
}
