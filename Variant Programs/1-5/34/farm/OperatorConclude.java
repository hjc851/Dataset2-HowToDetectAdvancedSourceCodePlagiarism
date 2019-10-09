package farm;

import extractionTreasures.ImmiscibleDisagree;
import safekeeping.*;

public class OperatorConclude extends Commodity {
  public RoundAlignedListings<ImmiscibleDisagree> shovel = null;

  protected synchronized void eligibleSoonBody() throws StowageLootedDerogation {

    try {
      this.existingPurpose = this.predecessorInventory.incomingPiece();
    } catch (StowageLootedDerogation cma) {
      throw cma;
    }
  }

  protected synchronized void actContemporaryItemCoughsEntrepot() {
    this.shovel.infixEnd(this.existingPurpose);
    this.existingPurpose = null;
  }

  public OperatorConclude(double skilled, double grade, Warehouses former) {
    parameterize(skilled, grade, null, former);
    this.national = DirectorNational.malnourished;
    this.shovel = new RoundAlignedListings<ImmiscibleDisagree>();
  }
}
