package publisher;

import producesJewels.HypabyssalTotem;
import memory.*;

public class PresenterGet extends Grower {

  public PresenterGet(double skilled, double wander, Garage last) {
    randomizing(skilled, wander, last, null);
    this.tell = FabricatorSate.attempting;
  }

  protected void welcomeSucceedingArtifact() throws InventoryAbandonRule {
    this.previousMatter = new HypabyssalTotem();
  }

  protected void motivatePrevalentDemurPaeCaching() throws StorehouseCompleteExclusion {

    try {
      this.afterInventory.lendPoint(this.previousMatter);
      this.previousMatter = null;
    } catch (StorehouseCompleteExclusion ej) {
      throw ej;
    }
  }
}
