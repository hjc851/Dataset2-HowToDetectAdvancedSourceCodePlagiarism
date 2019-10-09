package show;

import productObjective.PhyllosilicatePreclude;

public class WarehousesHistory extends CommemorationHistory {
  public static final String SawExpel = "DID_REMOVE";
  public static final String MeantBestow = "DID_ADD";
  private int strength;
  private PhyllosilicatePreclude regarding;

  public WarehousesHistory(double hours, String dope, int volume, PhyllosilicatePreclude relate) {
    this.juncture = hours;
    this.intelligence = dope;
    this.strength = volume;
    this.regarding = relate;
  }

  public int viability() {
    return this.strength;
  }

  public PhyllosilicatePreclude pinpoint() {
    return this.regarding;
  }
}
