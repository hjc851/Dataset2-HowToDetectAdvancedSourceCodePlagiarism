package farmer;

import outputTarget.ExhaustibleBody;
import store.*;

public class OperatorOriginate extends farmer.Fabricator {

  public OperatorOriginate(double tight, double ambit, Entrepot forthcoming) {
    encode(tight, ambit, forthcoming, null);
    this.province = GrowersCanton.dealing;
  }

  protected synchronized void recipientComeDisagree() throws DepositoryEliminateDeparture {
    this.actualArtifact = new outputTarget.ExhaustibleBody();
  }

  protected synchronized void inciteStreamBodyPefWarehouses() throws WarehousingHighLimitation {

    try {
      this.firstArchiving.createComponent(this.actualArtifact);
      this.actualArtifact = null;
    } catch (store.WarehousingHighLimitation cma) {
      throw cma;
    }
  }
}
