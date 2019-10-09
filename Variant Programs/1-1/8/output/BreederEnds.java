package output;

import productObjective.PerformableObjection;
import warehousing.*;

public class BreederEnds extends Exporter {
  private BillRelatingSelection<PerformableObjection> tub;

  public BreederEnds(double signify, double run, Store past) {
    configure(signify, run, null, past);
    this.foreign = ProviderForeign.famished;
    this.tub = new BillRelatingSelection<PerformableObjection>();
  }

  protected void getFollowingTarget() throws StorehouseVacantExclusion {

    try {
      this.prevailingObjective = this.lateMemory.thirdThing();
    } catch (StorehouseVacantExclusion samad) {
      throw samad;
    }
  }

  protected void actContemporaryItemCoughsEntrepot() {
    this.tub.incorporatedGo(this.prevailingObjective);
    this.prevailingObjective = null;
  }
}
