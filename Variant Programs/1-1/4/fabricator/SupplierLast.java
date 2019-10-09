package fabricator;

import plantCelestial.CalcicPurpose;
import warehouses.*;

public class SupplierLast extends Supplier {
  private RingedInfluencedRoster<CalcicPurpose> spade;

  public SupplierLast(double beggarly, double grasp, Space elapsed) {
    overwrite(beggarly, grasp, null, elapsed);
    this.territory = FilmmakerSay.starvation;
    this.spade = new RingedInfluencedRoster<CalcicPurpose>();
  }

  protected void encounterUpcomingCavil() throws InventoryAbandonRule {

    try {
      this.newTotem = this.lastCache.adjacentArtifact();
    } catch (InventoryAbandonRule salaam) {
      throw salaam;
    }
  }

  protected void propelOngoingAimCoughMemory() {
    this.spade.introduceLater(this.newTotem);
    this.newTotem = null;
  }
}
