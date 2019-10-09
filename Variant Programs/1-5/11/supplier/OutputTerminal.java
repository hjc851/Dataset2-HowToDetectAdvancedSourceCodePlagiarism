package supplier;

import storehouse.*;

public class OutputTerminal extends supplier.Farm {

  public OutputTerminal(double little, double stray, Closet close, Closet latest) {
    recompile(little, stray, close, latest);
    this.law = ExporterNation.throwback;
  }

  protected synchronized void provideExpectedObjet() throws StoreBlankExcepted {

    try {
      this.liveArtefact = this.initialShelving.earlySubject();
    } catch (storehouse.StoreBlankExcepted e) {
      throw e;
    }
  }

  protected synchronized void locomoteNewTotemTcsRepository()
      throws RepositoryChockablockExceptional {

    try {
      this.newSpace.summateIngredient(this.liveArtefact);
      this.liveArtefact = null;
    } catch (storehouse.RepositoryChockablockExceptional e) {
      throw e;
    }
  }
}
