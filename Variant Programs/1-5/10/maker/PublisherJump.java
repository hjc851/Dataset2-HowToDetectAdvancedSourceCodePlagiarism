package maker;

import producedItems.FissionableCavil;
import safekeeping.*;

public class PublisherJump extends maker.Production {

  public PublisherJump(double skilled, double order, Space come) {
    overwrite(skilled, order, come, null);
    this.national = MakerLand.striving;
  }

  protected synchronized void findAdjacentObjection() throws GarageEvacuateCase {
    this.rifeCavil = new producedItems.FissionableCavil();
  }

  protected synchronized void goPrevailingObjectiveMousStorehouse() throws ShelvingRepleteExcluded {

    try {
      this.soonWarehouses.tallyConsignment(this.rifeCavil);
      this.rifeCavil = null;
    } catch (safekeeping.ShelvingRepleteExcluded ye) {
      throw ye;
    }
  }
}
