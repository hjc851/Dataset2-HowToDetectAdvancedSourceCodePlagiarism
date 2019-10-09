package show;

import fabricationObstructions.RecoverableTarget;

public class GarageAnnals extends GalaTape {
  public static final String NeverUndo = "DID_REMOVE";
  public static final String GotSupply = "DID_ADD";
  private int efficiency;
  private RecoverableTarget subordinate;

  public GarageAnnals(double clip, String scuttlebutt, int tonnage, RecoverableTarget relating) {
    this.hour = clip;
    this.reporting = scuttlebutt;
    this.efficiency = tonnage;
    this.subordinate = relating;
  }

  public int facilities() {
    return this.efficiency;
  }

  public RecoverableTarget focusing() {
    return this.subordinate;
  }
}
