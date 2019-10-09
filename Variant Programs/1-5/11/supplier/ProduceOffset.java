package supplier;

import producerArtefacts.ClasticVictim;
import storehouse.*;

public class ProduceOffset extends supplier.Farm {

  public ProduceOffset(double signify, double scope, Closet soon) {
    recompile(signify, scope, soon, null);
    this.law = ExporterNation.strive;
  }

  protected synchronized void provideExpectedObjet() throws StoreBlankExcepted {
    this.liveArtefact = new producerArtefacts.ClasticVictim();
  }

  protected synchronized void locomoteNewTotemTcsRepository()
      throws RepositoryChockablockExceptional {

    try {
      this.newSpace.summateIngredient(this.liveArtefact);
      this.liveArtefact = null;
    } catch (storehouse.RepositoryChockablockExceptional cma) {
      throw cma;
    }
  }
}
