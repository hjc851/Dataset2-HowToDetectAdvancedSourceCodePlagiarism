package maker;

import developmentElements.RecoverableTarget;
import shelving.*;

public class OutputCease extends Production {
  private CyclicalUnrelatedCompilation<RecoverableTarget> keg;

  public OutputCease(double beggarly, double orbit, Repository ago) {
    predefine(beggarly, orbit, null, ago);
    this.land = CommoditySovereign.malnourished;
    this.keg = new CyclicalUnrelatedCompilation<RecoverableTarget>();
  }

  protected void findAdjacentObjection() throws WarehouseOpenDeviation {

    try {
      this.continuingThing = this.earlierDisk.firstConsignment();
    } catch (WarehouseOpenDeviation ye) {
      throw ye;
    }
  }

  protected void impressFlowObjetMouStowage() {
    this.keg.encloseLate(this.continuingThing);
    this.continuingThing = null;
  }
}
