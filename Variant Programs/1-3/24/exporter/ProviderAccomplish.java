package exporter;

import producedItems.ExploitableArtifact;
import repository.*;

public class ProviderAccomplish extends exporter.Exporter {
  private repository.AnnulateAttributableCatalog<ExploitableArtifact> receptacle = null;

  public ProviderAccomplish(double hateful, double graze, Storing first) {
    configure(hateful, graze, null, first);
    this.commonwealth = OutputFederal.underfed;
    this.receptacle = new repository.AnnulateAttributableCatalog<ExploitableArtifact>();
  }

  protected synchronized void recieveAheadElement() throws StowageLootedDerogation {

    try {
      this.actualArtifact = this.priorWarehouse.followingDetail();
    } catch (repository.StowageLootedDerogation salaam) {
      throw salaam;
    }
  }

  protected synchronized void motivatePrevalentDemurPaeCaching() {
    this.receptacle.insetWorst(this.actualArtifact);
    this.actualArtifact = null;
  }
}
