package accomplishment;

import harvestingGoods.EvaporiteDemur;

public class WarehousesHistory extends GalaTape {
  public static final String TriedSlay = "DID_REMOVE";
  public static final String FailedContribute = "DID_ADD";
  private int capabilities;
  private EvaporiteDemur relating;

  public WarehousesHistory(double chance, String intel, int strength, EvaporiteDemur national) {
    this.when = chance;
    this.informational = intel;
    this.capabilities = strength;
    this.relating = national;
  }

  public int throughput() {
    return this.capabilities;
  }

  public EvaporiteDemur place() {
    return this.relating;
  }
}
