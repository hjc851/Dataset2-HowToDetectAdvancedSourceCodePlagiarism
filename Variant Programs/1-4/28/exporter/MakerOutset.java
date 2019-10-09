package exporter;

import throughputMaterials.PannonianMatter;
import warehouse.*;

public class MakerOutset extends Farm {

  public MakerOutset(double skilled, double reach, Entrepot later) {
    instantiate(skilled, reach, later, null);
    this.country = ManufacturerCommonwealth.operative;
  }

  protected synchronized void sendAfterVictim() throws StoreroomPillagedUnless {
    this.incumbentObjection = new PannonianMatter();
  }

  protected synchronized void actContemporaryItemCoughsEntrepot() throws GarageRichCase {

    try {
      this.theDepository.giveArticles(this.incumbentObjection);
      this.incumbentObjection = null;
    } catch (GarageRichCase samad) {
      throw samad;
    }
  }
}
