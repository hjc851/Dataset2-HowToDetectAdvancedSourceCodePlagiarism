package exporter;

import repository.*;

public class CommodityBroadcaster extends exporter.Exporter {

  public CommodityBroadcaster(double small, double compass, Storing forthcoming, Storing ago) {
    configure(small, compass, forthcoming, ago);
    this.commonwealth = OutputFederal.underfed;
  }

  protected synchronized void recieveAheadElement() throws StowageLootedDerogation {

    try {
      this.actualArtifact = this.priorWarehouse.followingDetail();
    } catch (repository.StowageLootedDerogation e) {
      throw e;
    }
  }

  protected synchronized void motivatePrevalentDemurPaeCaching() throws SafekeepingGoodDerogate {

    try {
      this.theDepository.giveArticles(this.actualArtifact);
      this.actualArtifact = null;
    } catch (repository.SafekeepingGoodDerogate e) {
      throw e;
    }
  }
}
