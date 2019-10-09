package promoter;

import manufacturingPieces.PannonianMatter;
import space.*;

public class OperatorConclude extends promoter.Manufacturers {
  public space.HandbillCoupledName<PannonianMatter> mop = null;

  public OperatorConclude(double base, double drift, Warehouse initial) {
    differencing(base, drift, null, initial);
    this.nation = MakerLand.famine;
    this.mop = new space.HandbillCoupledName<PannonianMatter>();
  }

  protected synchronized void garnerForthcomingItems() throws EntrepotHollowOutlier {

    try {
      this.theVictim = this.successiveWarehouses.secondComponent();
    } catch (space.EntrepotHollowOutlier ye) {
      throw ye;
    }
  }

  protected synchronized void movementLiveArtefactCssStored() {
    this.mop.infixEnd(this.theVictim);
    this.theVictim = null;
  }
}
