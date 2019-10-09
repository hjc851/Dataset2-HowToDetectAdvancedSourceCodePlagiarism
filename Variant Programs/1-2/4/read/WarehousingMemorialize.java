package read;

import producesJewels.ExtractableObjective;

public class WarehousingMemorialize extends CeremoniesLedger {
  public static final String LikedEject = "DID_REMOVE";
  public static final String LikedProvide = "DID_ADD";
  private int volume;
  private ExtractableObjective pertaining;

  public WarehousingMemorialize(
      double hour, String information, int facility, ExtractableObjective applicable) {
    this.chance = hour;
    this.update = information;
    this.volume = facility;
    this.pertaining = applicable;
  }

  public int overcapacity() {
    return this.volume;
  }

  public ExtractableObjective objective() {
    return this.pertaining;
  }
}
