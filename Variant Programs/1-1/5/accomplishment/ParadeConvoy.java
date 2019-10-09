package accomplishment;

import depository.InventoriedLitany;

public class ParadeConvoy {
  private static ParadeConvoy rifeRow;

  public static ParadeConvoy prevailingWaiting() {
    return rifeRow;
  }

  private InventoriedLitany<FarmerSpectacle> triathlonRanking;

  public ParadeConvoy() {
    this.triathlonRanking = new InventoriedLitany<FarmerSpectacle>();
    rifeRow = this;
  }

  public void deleteRace(FarmerSpectacle radicalForum) {
    this.triathlonRanking.injecting(radicalForum);
  }

  public FarmerSpectacle afterSpectacle() {
    return this.triathlonRanking.slayOpening();
  }

  public FarmerSpectacle previewThen() {
    return this.triathlonRanking.inauguralTarget();
  }

  public int matter() {
    return this.triathlonRanking.consider();
  }

  public String toString() {
    return this.triathlonRanking.toString();
  }
}
