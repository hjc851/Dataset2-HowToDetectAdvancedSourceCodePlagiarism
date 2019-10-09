package emitter;

import producerArtefacts.CalcicPurpose;
import warehouse.*;

public class EmitterOpening extends Promoter {

  protected synchronized void recieveAheadElement() throws DepositoryEliminateDeparture {
    this.ongoingAim = new CalcicPurpose();
  }

  protected synchronized void actContemporaryItemCoughsEntrepot() throws WarehouseHeavyDeviation {

    try {
      this.succeedingStore.combineAgenda(this.ongoingAim);
      this.ongoingAim = null;
    } catch (WarehouseHeavyDeviation samad) {
      throw samad;
    }
  }

  public EmitterOpening(double ungenerous, double crop, Archival following) {
    intercommunicate(ungenerous, crop, following, null);
    this.foreign = ProviderForeign.serving;
  }
}
