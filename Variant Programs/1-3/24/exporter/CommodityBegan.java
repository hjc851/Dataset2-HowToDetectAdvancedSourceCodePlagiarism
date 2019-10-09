package exporter;

import producedItems.ExploitableArtifact;
import repository.*;

public class CommodityBegan extends exporter.Exporter {

  public CommodityBegan(double miserly, double straddle, Storing soon) {
    configure(miserly, straddle, soon, null);
    this.commonwealth = OutputFederal.operative;
  }

  protected synchronized void recieveAheadElement() throws StowageLootedDerogation {
    this.actualArtifact = new producedItems.ExploitableArtifact();
  }

  protected synchronized void motivatePrevalentDemurPaeCaching() throws SafekeepingGoodDerogate {

    try {
      this.theDepository.giveArticles(this.actualArtifact);
      this.actualArtifact = null;
    } catch (repository.SafekeepingGoodDerogate samad) {
      throw samad;
    }
  }
}
