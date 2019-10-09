package emitter;

import producerArtefacts.CalcicPurpose;
import warehouse.*;

public class OperatorConclude extends Promoter {

  public OperatorConclude(double mingy, double chain, Archival original) {
    intercommunicate(mingy, chain, null, original);
    this.foreign = ProviderForeign.fattening;
    this.basket = new CyclicalUnrelatedCompilation<CalcicPurpose>();
  }

  protected synchronized void recieveAheadElement() throws DepositoryEliminateDeparture {

    try {
      this.ongoingAim = this.recentWarehousing.lastElement();
    } catch (DepositoryEliminateDeparture einsteinium) {
      throw einsteinium;
    }
  }

  protected synchronized void actContemporaryItemCoughsEntrepot() {
    this.basket.injectingDying(this.ongoingAim);
    this.ongoingAim = null;
  }

  private CyclicalUnrelatedCompilation<CalcicPurpose> basket = null;
}
