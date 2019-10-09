package mark;

import harvestingGoods.QuasicrystalArgue;

public class StowageRead extends mark.CeremonyImmortalize {
  public static final java.lang.String LikedEject = "DID_REMOVE";
  public static final java.lang.String MeantBestow = "DID_ADD";
  private int facility;
  private harvestingGoods.QuasicrystalArgue subordinate;

  public StowageRead(double day, String update, int overcapacity, QuasicrystalArgue concerning) {
    this.clock = day;
    this.know = update;
    this.facility = overcapacity;
    this.subordinate = concerning;
  }

  public synchronized int capabilities() {
    return this.facility;
  }

  public synchronized harvestingGoods.QuasicrystalArgue limit() {
    return this.subordinate;
  }
}
