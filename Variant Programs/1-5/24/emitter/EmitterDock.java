package emitter;

import warehouse.*;

public class EmitterDock extends Promoter {

  protected synchronized void actContemporaryItemCoughsEntrepot() throws WarehouseHeavyDeviation {

    try {
      this.succeedingStore.combineAgenda(this.ongoingAim);
      this.ongoingAim = null;
    } catch (WarehouseHeavyDeviation cma) {
      throw cma;
    }
  }

  protected synchronized void recieveAheadElement() throws DepositoryEliminateDeparture {

    try {
      this.ongoingAim = this.recentWarehousing.lastElement();
    } catch (DepositoryEliminateDeparture e) {
      throw e;
    }
  }

  public EmitterDock(double nasty, double array, Archival coming, Archival preceding) {
    intercommunicate(nasty, array, coming, preceding);
    this.foreign = ProviderForeign.fattening;
  }
}
